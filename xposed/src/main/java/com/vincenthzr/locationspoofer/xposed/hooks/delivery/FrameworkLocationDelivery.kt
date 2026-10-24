package com.vincenthzr.locationspoofer.xposed.hooks.delivery

import android.app.PendingIntent
import android.location.Location
import android.os.Binder
import android.os.Bundle
import android.os.SystemClock
import com.vincenthzr.locationspoofer.xposed.LocationHooker
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus
import com.vincenthzr.locationspoofer.xposed.hooks.GnssSatelliteCatalog
import com.vincenthzr.locationspoofer.xposed.hooks.LocationStartupGate
import com.vincenthzr.locationspoofer.xposed.hooks.SystemHookUtils
import com.vincenthzr.locationspoofer.xposed.hooks.getCurrentSpoofedMotion
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent
import com.vincenthzr.locationspoofer.xposed.utils.CallScope
import com.vincenthzr.locationspoofer.xposed.utils.getJitteredAccuracy
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers
import io.github.libxposed.api.XposedInterface
import org.json.JSONObject
import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.util.Collections
import java.util.Timer
import java.util.TimerTask
import java.util.WeakHashMap
import java.util.function.Function
import java.util.function.Predicate

/**
 * 系统框架定位投递：在 system_server 里伪造 LocationProviderManager 的投递结果。
 *
 *
 * 思路是**不改请求入口，只改结果出口**：
 * - 记录所有向 LocationProviderManager 注册过的 manager 实例（弱引用集合），定时驱动它们重新投递；
 * - 在 registerLocationRequest / getCurrentLocation 上记下"这次注册属于哪个调用方"，
 *   用于启动阶段（startup）的限流与补投递；
 * - 在 acceptLocationChange / onReportLocation 上把 LocationResult 里的坐标整体替换成伪造坐标；
 * - getLastLocation / getLastLocationUnsafe 走单独的 lastLocationScope 通道。
 *
 * 所有反射定位都按"类名 + 方法签名 + 返回值类型"逐项校验（[expects]），
 * 任一不符即整体放弃并关闭，绝不半挂——半挂的系统 Hook 会让目标应用拿到一半真一半假的数据。
 */
internal class FrameworkLocationDelivery(
    private val module: LocationHooker,
    private val loader: ClassLoader,
) : SystemDeliveryAdapter {

    /** 启动阶段的注册请求：单次定位（getCurrentLocation）还是持续监听 */
    class StartupRequest(val owner: Any, val singleShot: Boolean) {
        val registrations = mutableListOf<Any>()
    }

    private val hooks = mutableListOf<XposedInterface.HookHandle>()
    private val managers: MutableSet<Any> =
        Collections.synchronizedSet(Collections.newSetFromMap(WeakHashMap()))
    private val lastLocationScope = CallScope<Any>()
    private val startupScope = CallScope<StartupRequest>()
    private val startupGate = LocationStartupGate(1_000_000_000L)

    @Volatile
    private var enabled = false

    private var timer: Timer? = null
    private var policyKey: String? = null

    private var registrationClass: Class<*>? = null
    private var getIdentity: Method? = null
    private var getUid: Method? = null
    private var getPackageName: Method? = null
    private var acceptLocation: Method? = null
    private var deliverToListeners: Method? = null
    private var updateRegistrations: Method? = null
    private var wrapResult: Method? = null
    private var deepCopyResult: Method? = null
    private var resultAsList: Method? = null
    private var isProvider: Method? = null
    private var nameField: Field? = null
    private var internalField: Field? = null
    private var ownerField: Field? = null

    /** Location 上移除 MSL 高度的方法（Android 14+ 才有，没有就跳过） */
    private val removeMsl: List<Method> = listOf("removeMslAltitude", "removeMslAltitudeAccuracy")
        .mapNotNull { name ->
            runCatching { Location::class.java.getMethod(name) }.getOrNull()
        }

    private fun accessible(method: Method): Method = method.apply { isAccessible = true }

    /** 往 Location 的 extras 里补卫星计数，让应用看到的"搜到几颗星"与伪造位置自洽 */
    private fun applySatelliteExtras(location: Location, config: JSONObject) {
        val count = config.optInt("satellite_count", 20).coerceIn(4, GnssSatelliteCatalog.MAX_SATELLITES)
        val now = System.currentTimeMillis()
        val jitter = config.optBoolean("enable_jitter", true)
        var usedInFix = 0
        for (index in 0 until count) {
            if (GnssSatelliteCatalog.signal(index, now, jitter).usedInFix) usedInFix++
        }
        val extras = location.extras ?: Bundle()
        val bundle = Bundle(extras)
        bundle.putInt("satellites", count)
        bundle.putInt("satellites_in_view", count)
        bundle.putInt("satellites_visible", count)
        bundle.putInt("satellites_used_in_fix", usedInFix)
        location.extras = bundle
    }

    /** 复制一份 LocationResult 并把里面每个 Location 改成伪造坐标 */
    private fun copyResult(result: Any, config: JSONObject): Any? {
        val motion: SpoofedMotion = module.getCurrentSpoofedMotion("WGS-84") ?: return null
        val copy = requireNotNull(deepCopyResult) { "deepCopyResult" }.invoke(result, null)
        val list = requireNotNull(resultAsList) { "resultAsList" }.invoke(copy, null) as? List<*> ?: return null
        val altitude = config.optDouble("altitude", 25.0)
        val accuracy = module.getJitteredAccuracy()
        for (item in list) {
            val location = item as? Location ?: continue
            SystemHookUtils.applyFakeLocationFields(location, motion, altitude, accuracy)
            for (method in removeMsl) {
                runCatching { method.invoke(location, null) }
            }
            applySatelliteExtras(location, config)
        }
        return copy
    }

    /**
     * 通过 providerManager 的 deliverToListeners 把伪造结果推给已注册的监听者。
     * @param registrations 非空时只投递给列表里的注册项；null 表示投递给所有注册项
     */
    private fun deliver(owner: Any, registrations: List<Any>?) {
        val method = requireNotNull(deliverToListeners) { "deliverToListeners" }
        method.invoke(owner, Function<Any, Any?> { registration ->
            guarded("registration delivery") {
                deliverOne(registration, owner, registrations)
            }
        })
    }

    private fun deliverOne(registration: Any, owner: Any, registrations: List<Any>?): Any? {
        if (!enabled) return null
        // 启动阶段只补投给这一批注册项，避免把伪造位置推给无关监听者
        if (registrations != null &&
            (registrations.isEmpty() || registrations.none { it === registration })
        ) {
            return null
        }
        val config = module.readConfig() ?: return null
        val identity = requireNotNull(getIdentity) { "getIdentity" }.invoke(registration, null) ?: return null
        if (!isTarget(owner, identity, config)) return null
        val location = makeLocation(owner) ?: return null
        val result = requireNotNull(wrapResult) { "wrapResult" }
            .invoke(null, arrayOf<Location>(location)) ?: return null
        return requireNotNull(acceptLocation) { "acceptLocation" }.invoke(registration, result)
    }

    private fun expects(method: Method, expected: Class<*>) {
        if (method.returnType != expected) {
            throw IllegalStateException("Incompatible return type: $method, expected ${expected.name}")
        }
    }

    private fun findField(clazz: Class<*>, name: String): Field {
        var current: Class<*>? = clazz
        while (current != null) {
            try {
                return current.getDeclaredField(name).apply { isAccessible = true }
            } catch (_: NoSuchFieldException) {
                current = current.superclass
            }
        }
        throw NoSuchFieldException("${clazz.name}.$name")
    }

    private fun findMethod(clazz: Class<*>, name: String, vararg types: Class<*>): Method {
        var current: Class<*>? = clazz
        while (current != null) {
            try {
                return accessible(current.getDeclaredMethod(name, *types))
            } catch (_: NoSuchMethodException) {
                current = current.superclass
            }
        }
        throw NoSuchMethodException("${clazz.name}.$name")
    }

    private fun <T> guarded(where: String, block: () -> T?): T? = try {
        block()
    } catch (error: Throwable) {
        XposedBridge.logOpenCellIdEvery("FrameworkDelivery-$where", "$where failed: $error", 10_000L)
        null
    }

    /**
     * 只挂 [method] 这一条具体签名：同名方法可能有多个重载（不同监听器类型），
     * 全部挂上再由 [enabled] + 签名比对决定是否走伪造逻辑。
     */
    private fun hook(method: Method, interceptor: (XposedInterface.Chain) -> Any?) {
        val declaring = method.declaringClass
        val name = method.name
        val handles = XposedHelpers.hookAllMethods(declaring, name) { chain, candidate ->
            if (enabled && candidate == method) interceptor(chain)
            else chain.proceed(chain.args.toTypedArray())
        }
        hooks += handles
        if (handles.isEmpty()) {
            throw IllegalStateException("Unable to hook $method")
        }
    }

    /** 判断"这个注册项背后的调用方是否该被伪造" */
    private fun isTarget(owner: Any, identity: Any, config: JSONObject): Boolean =
        guarded("caller identity") {
            if (!config.optBoolean("active", false)) return@guarded false
            val uid = requireNotNull(getUid) { "getUid" }.invoke(identity, null) as Int
            val pkg = requireNotNull(getPackageName) { "getPackageName" }
                .invoke(identity, null) as? String
            if (!SystemHookUtils.isTargetCaller(owner, pkg, config, uid)) return@guarded false
            val internal = requireNotNull(internalField) { "internalField" }.get(owner) ?: return@guarded false
            requireNotNull(isProvider) { "isProvider" }.invoke(internal, owner, identity) != true
        } ?: false

    /** 按 provider 名构造一条伪造 Location */
    private fun makeLocation(owner: Any): Location? {
        val config = module.readConfig() ?: return null
        if (!config.optBoolean("active", false)) return null
        val motion = module.getCurrentSpoofedMotion("WGS-84") ?: return null
        val provider = requireNotNull(nameField) { "nameField" }.get(owner) as? String ?: return null
        val fake = SystemHookUtils.buildFakeLocation(
            loader, provider, motion,
            config.optDouble("altitude", 25.0),
            module.getJitteredAccuracy(),
        ) as? Location ?: return null
        applySatelliteExtras(fake, config)
        return fake
    }

    /** 每秒一次：策略变化时刷新激活状态，并驱动所有 manager 重新投递伪造位置 */
    private fun tick() {
        val config = module.readConfig()
        val snapshot = synchronized(managers) { managers.toList() }
        val key = "${config?.optBoolean("active")}|" +
            "${config?.optBoolean("force_location_enabled", false)}|" +
            "${config?.optBoolean("system_hook_global_mode")}|" +
            "${config?.optJSONArray("system_hook_packages")}"
        if (key != policyKey) {
            for (manager in snapshot) {
                guarded("activation refresh") {
                    requireNotNull(updateRegistrations) { "updateRegistrations" }
                        .invoke(manager, Predicate<Any> { true })
                }
            }
            policyKey = key
        }
        if (config == null || !config.optBoolean("active", false)) {
            startupGate.clear()
            return
        }
        for (manager in snapshot) {
            guarded("provider heartbeat") { deliver(manager, null) }
        }
    }

    override fun install(): Boolean {
        val voidType = Void.TYPE
        val booleanType = Boolean::class.javaPrimitiveType!!
        val intType = Int::class.javaPrimitiveType!!
        try {
            val manager = SystemClassLocator.locate(SystemComponent.LOCATION_PROVIDER_MANAGER, loader)
                ?: throw IllegalStateException("Location provider manager unavailable")
            val managerName = manager.name
            val registration = Class.forName("$managerName\$Registration", false, loader)
            registrationClass = registration
            val locationRegistration = Class.forName("$managerName\$LocationRegistration", false, loader)
            val currentLocationRegistration =
                Class.forName("$managerName\$GetCurrentLocationListenerRegistration", false, loader)
            val callerIdentity = Class.forName("android.location.util.identity.CallerIdentity", false, loader)
            val locationResult = Class.forName("android.location.LocationResult", false, loader)
            val lastLocationRequest = Class.forName("android.location.LastLocationRequest", false, loader)

            getIdentity = accessible(registration.getDeclaredMethod("getIdentity"))
            getUid = accessible(callerIdentity.getMethod("getUid"))
            getPackageName = accessible(callerIdentity.getMethod("getPackageName"))
            acceptLocation = accessible(registration.getDeclaredMethod("acceptLocationChange", locationResult))
            deliverToListeners = findMethod(manager, "deliverToListeners", Function::class.java)
            updateRegistrations = findMethod(manager, "updateRegistrations", Predicate::class.java)
            wrapResult = accessible(locationResult.getMethod("wrap", Array<Location>::class.java))
            deepCopyResult = accessible(locationResult.getMethod("deepCopy"))
            resultAsList = accessible(locationResult.getMethod("asList"))
            nameField = findField(manager, "mName")
            internalField = findField(manager, "mLocationManagerInternal")
            ownerField = findField(registration, "this\$0")
            val internal = requireNotNull(internalField) { "internalField" }
            isProvider = accessible(
                internal.type.getMethod("isProvider", String::class.java, callerIdentity)
            )

            val onRegistrationAdded =
                manager.getDeclaredMethod("onRegistrationAdded", Any::class.java, registration)
            val locationRequest = Class.forName("android.location.LocationRequest", false, loader)
            val registerMethods = listOf(
                manager.getDeclaredMethod(
                    "registerLocationRequest", locationRequest, callerIdentity, intType,
                    Class.forName("android.location.ILocationListener", false, loader),
                ),
                manager.getDeclaredMethod(
                    "registerLocationRequest", locationRequest, callerIdentity, intType,
                    PendingIntent::class.java,
                ),
                manager.getDeclaredMethod(
                    "getCurrentLocation", locationRequest, callerIdentity, intType,
                    Class.forName("android.location.ILocationCallback", false, loader),
                ),
            )
            val onReportLocation = manager.getDeclaredMethod("onReportLocation", locationResult)
            val getLastLocation =
                manager.getDeclaredMethod("getLastLocation", lastLocationRequest, callerIdentity, intType)
            val getLastLocationUnsafe = manager.getDeclaredMethod(
                "getLastLocationUnsafe", intType, intType, booleanType, Long::class.javaPrimitiveType,
            )
            val acceptMethods = listOf(locationRegistration, currentLocationRegistration)
                .map { it.getDeclaredMethod("acceptLocationChange", locationResult) }
            val isActiveIdentity = manager.getDeclaredMethod("isActive", booleanType, callerIdentity)
            val isActiveRegistration = manager.getDeclaredMethod("isActive", registration)
            val onProviderEnabledChanged = locationRegistration.getDeclaredMethod(
                "onProviderEnabledChanged", String::class.java, intType, booleanType,
            )
            val listenerOperation =
                Class.forName("com.android.internal.listeners.ListenerExecutor\$ListenerOperation", false, loader)

            // ---- 逐项校验签名，任一不符立即整体放弃 ----
            expects(requireNotNull(getIdentity), callerIdentity)
            expects(requireNotNull(getUid), intType)
            expects(requireNotNull(getPackageName), String::class.java)
            expects(requireNotNull(acceptLocation), listenerOperation)
            expects(requireNotNull(deliverToListeners), voidType)
            expects(requireNotNull(updateRegistrations), voidType)
            expects(requireNotNull(wrapResult), locationResult)
            expects(requireNotNull(deepCopyResult), locationResult)
            expects(requireNotNull(resultAsList), List::class.java)
            expects(requireNotNull(isProvider), booleanType)
            expects(onRegistrationAdded, voidType)
            expects(onReportLocation, voidType)
            expects(getLastLocation, Location::class.java)
            expects(getLastLocationUnsafe, Location::class.java)
            expects(isActiveIdentity, booleanType)
            expects(isActiveRegistration, booleanType)
            expects(onProviderEnabledChanged, voidType)
            for (method in registerMethods.dropLast(1)) expects(method, voidType)
            expects(registerMethods.last(), Class.forName("android.os.ICancellationSignal", false, loader))
            for (method in acceptMethods) expects(method, listenerOperation)

            if (nameField!!.type != String::class.java || ownerField!!.type != manager) {
                throw IllegalStateException("Incompatible provider fields")
            }

            // ---- 1) 定位开关伪造：onProviderEnabledChanged 的第三个参数强制置 true ----
            hook(onProviderEnabledChanged) { chain ->
                val args = chain.args.toTypedArray()
                val registrationObj = chain.thisObject
                val config = module.readConfig()
                if (registrationObj != null && config != null &&
                    config.optBoolean("force_location_enabled", false)
                ) {
                    val owner = ownerField!!.get(registrationObj)
                    val identity = requireNotNull(getIdentity).invoke(registrationObj, null)
                    if (owner != null && identity != null && isTarget(owner, identity, config)) {
                        args[2] = true
                    }
                }
                chain.proceed(args)
            }
            if (!module.deoptimize(isActiveIdentity)) {
                throw IllegalStateException("Unable to deoptimize provider activation")
            }
            if (!module.deoptimize(isActiveRegistration)) {
                throw IllegalStateException("Unable to deoptimize registration activation")
            }

            // ---- 2) 记录新注册项：启动阶段用来限流 ----
            hook(onRegistrationAdded) { chain ->
                val request = startupScope.current?.takeIf { it.owner === chain.thisObject }
                val registrationObj = chain.args.getOrNull(1)
                if (registrationObj != null) {
                    if (request != null) request.registrations += registrationObj
                    if (request != null && !request.singleShot) startupGate.registering(registrationObj)
                }
                val result = chain.proceed(chain.args.toTypedArray())
                chain.thisObject?.let { managers.add(it) }
                result
            }

            // ---- 3) 注册/单次定位入口：记下本次注册属于谁，并在单次定位时补投递 ----
            for (registerMethod in registerMethods) {
                hook(registerMethod) { chain ->
                    val managerObj = chain.thisObject
                    val registrationObj = chain.args.getOrNull(1)
                    val config = module.readConfig()
                    if (managerObj == null || registrationObj == null || config == null ||
                        !isTarget(managerObj, registrationObj, config)
                    ) {
                        return@hook chain.proceed(chain.args.toTypedArray())
                    }
                    val request = StartupRequest(
                        managerObj,
                        registerMethod.name == "getCurrentLocation",
                    )
                    try {
                        val result = startupScope.withValue(request) {
                            chain.proceed(chain.args.toTypedArray())
                        }
                        if (!request.singleShot) {
                            val now = SystemClock.elapsedRealtimeNanos()
                            for (item in request.registrations) startupGate.registered(item, now)
                        } else if (request.registrations.isNotEmpty()) {
                            guarded("startup location") {
                                val token = Binder.clearCallingIdentity()
                                try {
                                    deliver(managerObj, request.registrations)
                                } finally {
                                    Binder.restoreCallingIdentity(token)
                                }
                            }
                        }
                        result
                    } catch (error: Throwable) {
                        for (item in request.registrations) startupGate.forget(item)
                        throw error
                    }
                }
            }

            // ---- 4) 上报定位：记录 manager 实例，供定时器驱动 ----
            hook(onReportLocation) { chain ->
                chain.thisObject?.let { managers.add(it) }
                chain.proceed(chain.args.toTypedArray())
            }

            // ---- 5) getLastLocation：把"是否伪造"放进 ThreadLocal 供 getLastLocationUnsafe 使用 ----
            hook(getLastLocation) { chain ->
                val managerObj = chain.thisObject
                val registrationObj = chain.args.getOrNull(1)
                val config = module.readConfig()
                val target = managerObj != null && registrationObj != null && config != null &&
                    isTarget(managerObj, registrationObj, config)
                lastLocationScope.withValue(if (target) managerObj else null) {
                    chain.proceed(chain.args.toTypedArray())
                }
            }

            // ---- 6) getLastLocationUnsafe：命中 ThreadLocal 时直接返回伪造位置 ----
            hook(getLastLocationUnsafe) { chain ->
                val managerObj = chain.thisObject
                if (managerObj != null && lastLocationScope.current === managerObj) {
                    val location = guarded("last location") { makeLocation(managerObj) }
                    if (location != null) return@hook location
                }
                chain.proceed(chain.args.toTypedArray())
            }

            // ---- 7) acceptLocationChange：把投递出去的 LocationResult 换成伪造结果 ----
            for (acceptMethod in acceptMethods) {
                hook(acceptMethod) { chain ->
                    val registrationObj = chain.thisObject
                    val resultObj = chain.args.getOrNull(0)
                    var suppressed = false
                    val replaced = if (registrationObj == null || resultObj == null) {
                        null
                    } else {
                        guarded("location delivery") {
                            replaceDelivery(registrationObj, resultObj) { suppressed = true }
                        }
                    }
                    if (suppressed) return@hook null
                    val args = chain.args.toTypedArray()
                    if (replaced != null) args[0] = replaced
                    chain.proceed(args)
                }
            }

            if (!module.deoptimize(getLastLocation)) {
                throw IllegalStateException("Unable to deoptimize getLastLocation")
            }

            enabled = true
            timer = Timer("LocationSpoofer-FrameworkDelivery", true).apply {
                schedule(object : TimerTask() {
                    override fun run() {
                        if (enabled) tick()
                    }
                }, 1_000L, 1_000L)
            }
            return true
        } catch (error: Throwable) {
            HookStatus.error("FrameworkDelivery location delivery", error)
            close()
            XposedBridge.log(
                "[FrameworkDelivery] Adapter disabled: incompatible framework or hook failure: $error"
            )
            return false
        }
    }

    /**
     * 单条注册项的投递替换。
     * 启动窗口内的注册项还没收到首个定位，此时若直接投递会暴露"定位秒回"，
     * 所以置 [suppressed] 让本次调用返回 null，等窗口结束再补。
     */
    private fun replaceDelivery(
        registration: Any,
        result: Any,
        suppress: () -> Unit,
    ): Any? {
        val owner = requireNotNull(ownerField) { "ownerField" }.get(registration) ?: return null
        val config = module.readConfig() ?: return null
        val identity = requireNotNull(getIdentity) { "getIdentity" }.invoke(registration, null) ?: return null
        if (isTarget(owner, identity, config)) {
            if (!startupGate.shouldWait(registration, SystemClock.elapsedRealtimeNanos())) {
                return copyResult(result, config)
            }
            suppress()
            return null
        }
        startupGate.forget(registration)
        return null
    }

    override fun close() {
        enabled = false
        timer?.cancel()
        timer = null
        startupGate.clear()
        hooks.asReversed().forEach { handle ->
            runCatching { handle.unhook() }
        }
        hooks.clear()
        val snapshot = synchronized(managers) { managers.toList() }
        for (manager in snapshot) {
            guarded("restore activation") {
                requireNotNull(updateRegistrations) { "updateRegistrations" }
                    .invoke(manager, Predicate<Any> { true })
            }
        }
        managers.clear()
    }
}
