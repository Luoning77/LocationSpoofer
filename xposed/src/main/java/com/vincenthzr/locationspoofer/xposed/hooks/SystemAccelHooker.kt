package com.vincenthzr.locationspoofer.xposed.hooks

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Handler
import android.os.HandlerThread
import android.os.Process
import android.os.SystemClock
import android.util.Log
import com.vincenthzr.locationspoofer.utils.GaitTemplate
import com.vincenthzr.locationspoofer.xposed.LocationHooker
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine
import com.vincenthzr.locationspoofer.xposed.utils.SystemSensorPolicy
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.FileInputStream
import java.lang.reflect.Method
import java.security.MessageDigest

class SystemAccelHooker(
    private val module: LocationHooker,
    private var api: Class<*>? = null,
) : AutoCloseable {

    private var allowed: IntArray = IntArray(0)
    private var catalog: List<SystemSensorPolicy.SensorDescriptor> = emptyList()
    private var configure: Method? = null
    private var configureSteps: Method? = null
    private var defaultTemplate: FloatArray? = null
    private var defaultTemplateSpeed = Double.NaN
    private var diagnostics: Method? = null
    private var disable: Method? = null
    private var heartbeatRegistered = false
    private var heartbeatThread: HandlerThread? = null
    private var libraryHash: String = ""
    private var policy: String = ""
    @Volatile var ready: Boolean = false
        private set
    private var refreshAt = 0L
    private var runtimeLogAt = 0L
    private var runtimePublishAt = 0L
    private var runtimePublishedStage: String = ""
    private var runtimeStage: String = "not-started"
    private var seededPolicy: String = ""
    private var seededUids: IntArray = IntArray(0)
    private var sensorManager: SensorManager? = null
    private var template: FloatArray? = null
    private var templateSource: String = ""
    private var uidsMethod: Method? = null

    private val heartbeat = object : SensorEventListener {
        override fun onSensorChanged(event: SensorEvent) {
            event ?: return
        }

        override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) = Unit
    }

    fun saveApi(): Class<*>? = api

    fun install() {
        HookStatus.nativeSensors(false, "unsupported-process")
        if (!Process.is64Bit()) {
            reportRuntime("unsupported-process", true)
            return
        }
        try {
            val digest = MessageDigest.getInstance("SHA-256")
            FileInputStream(File("/system/lib64/libsensorservice.so")).use { input ->
                val buffer = ByteArray(65536)
                while (true) {
                    val read = input.read(buffer)
                    if (read < 0) break
                    digest.update(buffer, 0, read)
                }
            }
            val hash = digest.digest().joinToString("") { "%02x".format(it) }
            libraryHash = hash
            val profile = SystemSensorPolicy.profile(Process.is64Bit(), hash)
            if (profile == null) {
                HookStatus.nativeSensors(false, "unrecognized-library-sha256:$hash")
                Log.i(TAG, "Unsupported sensor library profile; app sensor hooks remain available")
                reportRuntime("unrecognized-library", true)
                return
            }
            var cls = api
            if (cls == null) {
                System.loadLibrary("shadowhook")
                System.loadLibrary("location_accel")
                cls = SystemAccelNative::class.java
                api = cls
            }
            val nativeApi = cls ?: error("api")
            configureSteps = methodOrNull(nativeApi, "configureStepSensors", IntArray::class.java)
            diagnostics = methodOrNull(nativeApi, "diagnostics")
            configure = methodOrNull(
                nativeApi,
                "configureSensors",
                Boolean::class.javaPrimitiveType!!,
                IntArray::class.java,
                Double::class.javaPrimitiveType!!,
                Double::class.javaPrimitiveType!!,
                Double::class.javaPrimitiveType!!,
                Long::class.javaPrimitiveType!!,
                Long::class.javaPrimitiveType!!,
                Long::class.javaPrimitiveType!!,
                Int::class.javaPrimitiveType!!,
                FloatArray::class.java,
                Boolean::class.javaPrimitiveType!!,
                Double::class.javaPrimitiveType!!,
            )
            uidsMethod = methodOrNull(nativeApi, "uids")
            disable = methodOrNull(nativeApi, "disable")
            ready = methodOrNull(nativeApi, "install", String::class.java)?.invoke(null, hash) == true
            HookStatus.nativeSensors(ready, "${profile.id}-${profile.validation}-sha256:$hash")
            Log.i(TAG, "Global sensor adapter ready=$ready")
            reportRuntime(if (ready) "installed-idle" else "native-install-failed", true)
        } catch (th: Throwable) {
            ready = false
            HookStatus.nativeSensors(false, "initialization-failed")
            HookStatus.error("globalSensorAdapter", th)
            reportRuntime("initialization-failed", true)
        }
    }

    override fun close() {
        ready = false
        stopHeartbeat()
        heartbeatThread?.quitSafely()
        heartbeatThread = null
        try {
            disable?.invoke(null)
        } catch (_: Throwable) {
        }
        reportRuntime("closed", true)
    }

    fun update(config: JSONObject?) {
        if (!ready) return
        if (config != null) {
            try {
                val stepEnabled = config.optBoolean("enable_step_simulation", true)
                val barometer = config.optBoolean("barometer_fluctuation", false)
                if (config.optBoolean("active", false) && (stepEnabled || barometer)) {
                    val elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos()
                    val remainingMillis = remainingSensorMillis(config)
                    if (remainingMillis <= 0) {
                        stopHeartbeat()
                        try {
                            disable?.invoke(null)
                        } catch (_: Throwable) {
                        }
                        reportRuntime("permission-expired")
                        return
                    }
                    val now = System.currentTimeMillis()
                    val policyKey =
                        "${config.optBoolean("system_hook_global_mode")}|${config.optJSONArray("system_hook_packages")}|${config.optLong("start_timestamp")}"
                    if (elapsedRealtimeNanos >= refreshAt || policyKey != policy) {
                        refreshTargets(config, policyKey, elapsedRealtimeNanos)
                    }
                    val templateRaw = config.optString("gait_template", "")
                    if (templateRaw != templateSource) {
                        val decoded = GaitTemplate.decode(templateRaw)
                        template = if (decoded != null) {
                            val wave = FloatArray(decoded.x.size + decoded.y.size + decoded.z.size)
                            decoded.x.copyInto(wave, 0)
                            decoded.y.copyInto(wave, decoded.x.size)
                            decoded.z.copyInto(wave, decoded.x.size + decoded.y.size)
                            wave
                        } else {
                            null
                        }
                        templateSource = templateRaw
                    }
                    val routeEngine = RouteEngine
                    val speed = routeEngine.calculateCurrentPosition(config, now).speed.toDouble()
                    val motion = stepEnabled && speed.isFinite() && speed > 0.1
                    var wave = template
                    if (wave == null) {
                        if (motion) {
                            val rounded = Math.rint(speed * 10.0) / 10.0
                            if (rounded != defaultTemplateSpeed) {
                                defaultTemplate = SystemGaitWaveform.create(rounded)
                                defaultTemplateSpeed = rounded
                            }
                            wave = defaultTemplate
                        }
                    }
                    if (motion && !prepareSensorManager()) {
                        try {
                            disable?.invoke(null)
                        } catch (_: Throwable) {
                        }
                        reportRuntime("waiting-for-sensor-manager")
                        return
                    }
                    if (motion) {
                        startHeartbeat()
                    } else {
                        stopHeartbeat()
                    }
                    configure?.invoke(
                        null,
                        motion,
                        allowed,
                        SensorStepHooker.calculateCurrentStepsFloat(config, now),
                        SystemSensorPolicy.cadence(config, now),
                        speed,
                        elapsedRealtimeNanos,
                        ((elapsedRealtimeNanos / 1_000_000) + remainingMillis) * 1_000_000,
                        config.optLong("start_timestamp"),
                        config.optInt("realism_level", 0),
                        wave,
                        barometer,
                        pressureHpa(routeEngine, config, now, barometer),
                    )
                    reportRuntime(
                        when {
                            !motion -> "no-motion"
                            allowed.isEmpty() -> "no-target-uids"
                            else -> "running"
                        }
                    )
                    return
                }
            } catch (th: Throwable) {
                stopHeartbeat()
                try {
                    disable?.invoke(null)
                } catch (_: Throwable) {
                }
                ready = false
                HookStatus.nativeSensors(false, "controller-failed")
                HookStatus.error("globalSensorUpdate", th)
                reportRuntime("controller-failed", true)
                return
            }
        }
        stopHeartbeat()
        try {
            disable?.invoke(null)
        } catch (_: Throwable) {
        }
        allowed = IntArray(0)
        refreshAt = 0L
        reportRuntime("inactive")
    }

    private fun methodOrNull(clazz: Class<*>, name: String, vararg params: Class<*>): Method? = try {
        clazz.getDeclaredMethod(name, *params)
    } catch (_: Throwable) {
        null
    }

    private fun remainingSensorMillis(config: JSONObject): Long = try {
        val method = LocationHooker::class.java.getDeclaredMethod(
            "nativeSensorRemainingMillis",
            JSONObject::class.java,
        )
        method.isAccessible = true
        (method.invoke(module, config) as? Long) ?: Long.MAX_VALUE
    } catch (_: Throwable) {
        Long.MAX_VALUE
    }

    private fun pressureHpa(
        routeEngine: RouteEngine,
        config: JSONObject,
        now: Long,
        barometer: Boolean,
    ): Double {
        if (!barometer) return 1013.25
        val altitude = routeEngine.realisticAltitude(config, now)
        val clean = if (altitude.isFinite()) altitude.coerceIn(-500.0, 10000.0) else 0.0
        return 1013.25 * Math.pow(1.0 - (clean / 44330.0), 5.2550001983762575)
    }

    private fun prepareSensorManager(): Boolean {
        sensorManager?.let { return true }
        val context = SystemHookUtils.getSystemContext() ?: return false
        val manager = context.getSystemService(android.content.Context.SENSOR_SERVICE) as? SensorManager
            ?: return false
        val handleField = Sensor::class.java.getDeclaredField("mHandle")
        handleField.isAccessible = true
        val descriptors = manager.getSensorList(Sensor.TYPE_ALL)
            .filter { it.type == 18 || it.type == 19 }
            .map { SystemSensorPolicy.SensorDescriptor(handleField.getInt(it), it.type, it.isWakeUpSensor) }
        val stepCatalog = SystemSensorPolicy.stepCatalog(descriptors)
        catalog = stepCatalog
        val handles = stepCatalog.flatMap { listOf(it.handle, it.type) }.toIntArray()
        if (configureSteps?.invoke(null, handles) == true) {
            sensorManager = manager
            return true
        }
        Log.i(TAG, "Native step catalog unavailable")
        return false
    }

    private fun startHeartbeat() {
        if (heartbeatRegistered) return
        val manager = sensorManager ?: run {
            Log.i(TAG, "Required value was null.")
            return
        }
        val accelerometer = manager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) ?: run {
            Log.i(TAG, "Required value was null.")
            return
        }
        val thread = heartbeatThread ?: HandlerThread("LocationSpoofer_SensorHeartbeat").also {
            it.start()
            heartbeatThread = it
        }
        if (!manager.registerListener(heartbeat, accelerometer, 66667, 0, Handler(thread.looper))) {
            Log.i(TAG, "Global sensor heartbeat registration failed")
            return
        }
        heartbeatRegistered = true
        manager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)?.let {
            manager.registerListener(heartbeat, it, 66667, 0, Handler(thread.looper))
        }
    }

    private fun stopHeartbeat() {
        if (heartbeatRegistered) {
            try {
                sensorManager?.unregisterListener(heartbeat)
            } catch (_: Throwable) {
            }
        }
        heartbeatRegistered = false
    }

    private fun reportRuntime(stage: String, force: Boolean = false) {
        runtimeStage = stage
        val now = SystemClock.elapsedRealtime()
        val sameStage = runtimePublishedStage == stage
        val shouldPublish = force || !sameStage || (stage == "running" && now >= runtimePublishAt)
        if (!shouldPublish) return
        runtimePublishedStage = stage
        runtimePublishAt = now + 5000
        val entries = LinkedHashMap<String, String>()
        entries["adapter_revision"] = ADAPTER_REVISION
        entries["library_sha256"] = libraryHash
        entries["dispatch_path"] =
            if (libraryHash == SystemSensorPolicy.COLOROS15_SHA256) "inline-and-cache" else "standalone"
        entries["stage"] = runtimeStage
        entries["heartbeat_registered"] = heartbeatRegistered.toString()
        entries["target_uid_count"] = allowed.size.toString()
        val list = catalog
        entries["counter_non_wakeup"] = list.count { it.type == 19 && !it.wakeUp }.toString()
        entries["counter_wakeup"] = list.count { it.type == 19 && it.wakeUp }.toString()
        entries["detector_non_wakeup"] = list.count { it.type == 18 && !it.wakeUp }.toString()
        entries["detector_wakeup"] = list.count { it.type == 18 && it.wakeUp }.toString()
        entries["sample_boottime_ms"] = now.toString()
        try {
            val stats = diagnostics?.invoke(null) as? LongArray
            val keys = listOf(
                "app_batches",
                "target_batches",
                "without_scratch_batches",
                "rewritten_accel_events",
                "submitted_counter_events",
                "submitted_detector_events",
                "submitted_batches",
                "send_errors",
                "fallbacks",
                "last_result",
                "last_target_boottime_ms",
                "target_accel_events",
                "inline_batches",
                "inline_completed_batches",
                "inline_queue_writes",
                "inline_queue_errors",
                "last_inline_queue_result",
            )
            if (stats == null || stats.size != keys.size) {
                entries["delivery_statistics"] = "unavailable-restart-required"
            } else {
                keys.forEachIndexed { index, key -> entries[key] = stats[index].toString() }
            }
        } catch (th: Throwable) {
            entries["delivery_statistics"] = "read-failed:${th.javaClass.simpleName}"
        }
        try {
            HookStatus.nativeSensorRuntime(entries)
        } catch (_: Throwable) {
        }
        if (force || !sameStage || (stage == "running" && now >= runtimeLogAt)) {
            runtimeLogAt = now + 30000
            try {
                val json = JSONObject()
                for ((k, v) in entries) json.put(k, v)
                XposedBridge.log("[Sensors] Runtime $json")
            } catch (_: Throwable) {
            }
        }
    }

    private fun refreshTargets(config: JSONObject, policyKey: String, elapsedRealtimeNanos: Long) {
        val packageManager = SystemHookUtils.getSystemContext()?.packageManager
        if (packageManager != null && seededPolicy != policyKey) {
            seededUids = if (config.optBoolean("system_hook_global_mode")) {
                collectGlobalTargetUids(packageManager, config)
            } else {
                collectWhitelistTargetUids(packageManager, config)
            }
            seededPolicy = policyKey
        }
        val nativeUids = try {
            uidsMethod?.invoke(null) as? IntArray ?: IntArray(0)
        } catch (_: Throwable) {
            IntArray(0)
        }
        val nativeSet = nativeUids.toSet()
        val allowedSet = LinkedHashSet<Int>()
        seededUids.toSet().intersect(nativeSet).forEach { allowedSet.add(it) }
        for (uid in nativeSet) {
            if (isTargetUid(packageManager, uid, config)) {
                allowedSet.add(uid)
            }
        }
        allowed = allowedSet.toIntArray()
        policy = policyKey
        refreshAt = elapsedRealtimeNanos + 500_000_000L
    }

    private fun collectGlobalTargetUids(
        packageManager: PackageManager,
        config: JSONObject,
    ): IntArray {
        val installed = packageManager.getInstalledApplications(0) ?: return IntArray(0)
        val byUid = LinkedHashMap<Int, MutableList<ApplicationInfo>>()
        for (info in installed) {
            byUid.getOrPut(info.uid) { mutableListOf() }.add(info)
        }
        val targets = LinkedHashSet<Int>()
        for ((uid, apps) in byUid) {
            val packages = apps.map { it.packageName }.toSet()
            if (SystemSensorPolicy.isTarget(uid, packages, SystemHookUtils.EXEMPT_PACKAGES, config)) {
                targets.add(uid)
            }
        }
        return targets.toIntArray()
    }

    private fun collectWhitelistTargetUids(
        packageManager: PackageManager,
        config: JSONObject,
    ): IntArray {
        val whitelist: JSONArray? = config.optJSONArray("system_hook_packages")
        val uidsFromPackages = LinkedHashSet<Int>()
        if (whitelist != null) {
            for (index in 0 until whitelist.length()) {
                try {
                    val info = packageManager.getApplicationInfo(whitelist.getString(index), 0)
                    uidsFromPackages.add(info.uid)
                } catch (_: Throwable) {
                }
            }
        }
        val targets = LinkedHashSet<Int>()
        for (uid in uidsFromPackages) {
            if (isTargetUid(packageManager, uid, config)) {
                targets.add(uid)
            }
        }
        return targets.toIntArray()
    }

    private fun isTargetUid(
        packageManager: PackageManager?,
        uid: Int,
        config: JSONObject,
    ): Boolean {
        val packages = try {
            packageManager?.getPackagesForUid(uid)?.toSet() ?: emptySet()
        } catch (_: Throwable) {
            emptySet()
        }
        return SystemSensorPolicy.isTarget(uid, packages, SystemHookUtils.EXEMPT_PACKAGES, config)
    }

    private companion object {
        const val TAG = "LS-SystemAccel"
        const val ADAPTER_REVISION = "20261013-c15-inline2"
    }
}
