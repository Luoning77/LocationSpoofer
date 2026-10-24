package com.vincenthzr.locationspoofer.xposed.hooks.delivery

import android.Manifest
import android.app.AppOpsManager
import android.app.PendingIntent
import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.ScanResult
import android.bluetooth.le.ScanSettings
import android.content.AttributionSource
import android.content.Context
import android.content.pm.PackageManager
import android.os.Binder
import android.os.Handler
import android.os.RemoteException
import android.os.SystemClock
import com.vincenthzr.locationspoofer.xposed.LocationHooker
import com.vincenthzr.locationspoofer.xposed.hooks.network.buildScanRecordBytes
import com.vincenthzr.locationspoofer.xposed.hooks.network.createBluetoothDevice
import com.vincenthzr.locationspoofer.xposed.hooks.network.createScanResult
import com.vincenthzr.locationspoofer.xposed.hooks.network.normalizeMacAddress
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent
import com.vincenthzr.locationspoofer.xposed.utils.CallScope
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge
import org.json.JSONArray
import org.json.JSONObject
import java.lang.ref.WeakReference
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.util.Collections
import java.util.WeakHashMap
import java.util.concurrent.atomic.AtomicBoolean
import java.util.function.Predicate

/**
 * 蓝牙扫描投递：在蓝牙进程里把扫描结果整体替换成伪造的 BLE 设备列表。
 *
 *
 * 与定位投递同构：不拦请求入口，而是在 ScanManager 自己的 Handler 上按队列周期性重新投递。
 * 这样做的好处是完全复用系统的权限校验、回调类型分派、reportDelay 批处理逻辑——
 * 我们只替换"这一批扫描结果是什么"，不伪造系统行为。
 *
 * 关键设计：
 * - 每次投递都在 [synthetic] 标记下执行，回调 hook 看到该标记就不拦截，避免自己拦自己；
 * - 回调 hook 只在"该回调确实属于当前目标客户端"时才丢弃真实结果（防止把真数据漏给别的应用）；
 * - 权限检查走 [permitted]，权限被回收时直接停止投递，不伪造"已授权"。
 */
internal class FrameworkBleDelivery(
    module: LocationHooker,
    loader: ClassLoader,
) : FrameworkHookSupport(module, loader, "BLE"), SystemDeliveryAdapter {

    private class Owner {
        val queued = AtomicBoolean()
        val scans = WeakHashMap<Any, BleDeliveryState<ScanResult>>()
    }

    private data class Registration(
        val who: FrameworkCaller,
        val helper: WeakReference<Any>,
        val app: WeakReference<Any>,
    )

    private val callbacks = Collections.synchronizedMap(WeakHashMap<Any, Registration>())
    private val callbackClasses = Collections.synchronizedSet(mutableSetOf<Class<*>>())
    private val owners = Collections.synchronizedMap(WeakHashMap<Any, Owner>())
    private val synthetic = CallScope<Boolean>()
    private val explicitFlush = CallScope<Boolean>()
    private val flushRequests = Collections.synchronizedMap(WeakHashMap<Any, Boolean>())

    @Volatile
    private var ready = false

    private lateinit var scannerInterface: Class<*>
    private lateinit var permission: Method
    private lateinit var matches: Method
    private lateinit var sendBatch: Method
    private lateinit var sendIntent: Method
    private lateinit var dead: Method

    override fun install(): Boolean = section("BleDelivery") {
        // 1) 找到扫描服务并解析其内部结构；失败时 layout 为空
        var layout: FrameworkBleReflection.Layout? = null
        var helperClass: Class<*>? = null
        val failures = LinkedHashMap<String, String>()
        SystemClassLocator.locate(
            SystemComponent.BLUETOOTH_SCAN_SERVICE,
            loader,
            accept = { candidate ->
                runCatching { FrameworkBleReflection.resolve(candidate, ScanResult::class.java) }
                    .onSuccess {
                        layout = it
                        helperClass = candidate
                    }
                    .onFailure { failures[candidate.name] = "${it.javaClass.simpleName}: ${it.message}" }
                    .isSuccess
            },
        )
        val resolved = layout ?: run {
            XposedBridge.log("[FrameworkDelivery/BLE] BLE delivery layout unavailable: $failures")
            return@section
        }
        val helper = helperClass ?: run {
            XposedBridge.log("[FrameworkDelivery/BLE] BLE delivery helper unavailable")
            return@section
        }
        val client = resolved.client
        scannerInterface = type("android.bluetooth.le.IScannerCallback")
        permission = resolved.permission
        matches = resolved.matches
        sendBatch = resolved.sendBatch
        sendIntent = resolved.sendIntent
        dead = resolved.dead
        val manager = resolved.manager

        // 2) flushPendingBatchResults 在 ScanBinder 或 $BluetoothScanBinder 上，两处都试
        val scanBinderCandidates = listOfNotNull(
            runCatching { type("com.android.bluetooth.le_scan.ScanBinder") }.getOrNull(),
            runCatching { type(helper.name + "\$BluetoothScanBinder") }.getOrNull(),
        )
        val flushMethod = FrameworkBleReflection.flushMethod(helper, scanBinderCandidates, client)

        // 3) handleFlushBatchResults 在 mHandler 的类或 $ClientHandler 上
        val handlerType = field(manager, "mHandler").type
        val handleFlush = runCatching {
            method(handlerType, "handleFlushBatchResults", client)
        }.getOrElse {
            method(type(manager.name + "\$ClientHandler"), "handleFlushBatchResults", client)
        }

        // 4) ContextMap.add：平台接受注册后才走到这里，是记录回调身份的唯一可靠时机
        hook(resolved.add) { chain ->
            val callingUid = Binder.getCallingUid()
            val registered = chain.proceed(chain.args.toTypedArray())
            if (registered != null) guard("register") {
                val helperObject = chain.args.last()!!
                owner(helperObject)
                val callback = get(registered, "callback")
                if (callback != null) {
                    callbacks[callback] = Registration(
                        FrameworkCaller(callingUid, get(registered, "name") as? String),
                        WeakReference(helperObject),
                        WeakReference(registered),
                    )
                    hookCallback(callback.javaClass)
                }
            }
            registered
        }

        // 5) 扫描入口：记下 helper 实例，供定时器驱动
        helper.declaredMethods
            .filter { it.name in setOf("startScan", "registerPiAndStartScan", "continuePiStartScan") }
            .forEach { entry ->
                hook(entry) { chain ->
                    val result = chain.proceed(chain.args.toTypedArray())
                    chain.thisObject?.let { owner(it) }
                    result
                }
            }

        // 6) PendingIntent 投递：目标应用时直接丢弃真实结果
        hook(sendIntent) { chain ->
            val info = chain.args[0]!!
            val who = FrameworkCaller(
                get(info, "callingUid") as Int,
                get(info, "callingPackage") as? String,
            )
            val config = module.readConfig()
            if (ready && synthetic.current != true && config != null &&
                config.optBoolean("mock_bluetooth", true) && target(who, config, chain.thisObject)
            ) {
                null
            } else {
                chain.proceed(chain.args.toTypedArray())
            }
        }

        // 7) 区分"应用主动 flush"与"硬件/周期 flush"：只有前者才允许越过 reportDelay
        hook(flushMethod) { chain ->
            val source = chain.args[1] as AttributionSource
            explicitFlush.withValue(
                source.uid >= 10_000 && source.uid == Binder.getCallingUid(),
            ) {
                chain.proceed(chain.args.toTypedArray())
            }
        }
        hook(method(manager, "flushBatchScanResults", client)) { chain ->
            if (explicitFlush.current == true) flushRequests[chain.args[0]!!] = true
            chain.proceed(chain.args.toTypedArray())
        }
        hook(handleFlush) { chain ->
            val forced = flushRequests.remove(chain.args[0]) == true
            val result = chain.proceed(chain.args.toTypedArray())
            guard("flush") {
                val scanManager = get(chain.thisObject!!, "this\$0")!!
                val helperObject = get(scanManager, "mScanHelper") ?: get(scanManager, "mScanController")!!
                tick(helperObject, owner(helperObject), get(chain.args[0]!!, "scannerId") as Int, forced)
            }
            result
        }

        // 8) 关掉这些方法的 JIT 内联优化，否则 hook 可能不生效
        helper.declaredMethods.filter {
            it.name in setOf(
                "registerScanner", "registerAndStartScan", "flushPendingBatchResults",
                "onScanResultInternal", "onBatchReportsInternal", "onBatchScanReportsInternal",
                "sendBatchScanResults", "sendResultByPendingIntent", "onTrackAdvFoundLost",
            )
        }.forEach {
            check(module.deoptimize(it)) { "Cannot deoptimize BLE delivery ${it.name}" }
        }

        // 9) 每秒一次：在 ScanManager 的 Handler 上驱动所有已知 helper 重新投递
        every(1_000L) {
            val snapshot = synchronized(owners) { owners.entries.map { it.key to it.value } }
            for ((helperObject, state) in snapshot) guard("schedule") {
                val scanManager = get(helperObject, "mScanManager") ?: return@guard
                val handler = get(scanManager, "mHandler") as? Handler ?: return@guard
                if (!state.queued.compareAndSet(false, true)) return@guard
                val posted = handler.post {
                    try {
                        if (live && ready) guard("delivery") { tick(helperObject, state) }
                    } finally {
                        state.queued.set(false)
                    }
                }
                if (!posted) state.queued.set(false)
            }
        }
        ready = true
    }

    private fun owner(helper: Any): Owner = synchronized(owners) {
        owners.getOrPut(helper) { Owner() }
    }

    /**
     * 一次投递周期：遍历 ScanManager 的两个队列，对每个客户端按回调类型分发伪造结果。
     *
     * @param flushId 非 null 时只处理这个 scannerId（来自应用主动 flush）
     * @param forceFlush 应用主动 flush 时允许越过 reportDelay
     */
    private fun tick(helper: Any, state: Owner, flushId: Int? = null, forceFlush: Boolean = false) {
        if (!ready || !live) return
        val config = module.readConfig()
        if (config == null || !config.optBoolean("active") ||
            !config.optBoolean("mock_bluetooth", true)
        ) {
            state.scans.clear()
            return
        }
        val manager = get(helper, "mScanManager") ?: return
        val map = get(helper, "mScannerMap") ?: return
        val regular = (call(manager, "getRegularScanQueue") as? Collection<*>)?.filterNotNull().orEmpty()
        val batch = (call(manager, "getBatchScanQueue") as? Collection<*>)?.filterNotNull().orEmpty()
        val all = regular + batch
        state.scans.keys.retainAll(all.toSet())
        val fixtures = results(config)
        val mapClass = map.javaClass

        for (client in all) guard("scan") {
            val scannerId = get(client, "scannerId") as Int
            // 应用主动 flush 只处理指定的那一个批处理客户端
            if (flushId != null && (scannerId != flushId || client !in batch)) return@guard
            if (get(client, "appDied") == true) {
                state.scans.remove(client)
                return@guard
            }
            val app = method(mapClass, "getById", Int::class.javaPrimitiveType!!)
                .invoke(map, scannerId) ?: return@guard
            val callback = get(app, "callback")
            val info = get(app, "info")
            val who = if (callback != null) {
                callbacks[callback]?.who?.let {
                    it.copy(pkg = get(client, "callingPackage") as? String ?: it.pkg)
                }
            } else {
                info?.let {
                    FrameworkCaller(get(it, "callingUid") as Int, get(it, "callingPackage") as? String)
                }
            }
            if (who == null || !target(who, config, helper) || !permitted(helper, client, who)) {
                state.scans.remove(client)
                return@guard
            }
            val settings = get(client, "settings") as? ScanSettings ?: return@guard
            // 机会模式（SCAN_MODE_OPPORTUNISTIC）只有在没有其它扫描时才启用，此时不投递
            if (settings.scanMode == ScanSettings.SCAN_MODE_OPPORTUNISTIC &&
                all.none { (get(it, "settings") as? ScanSettings)?.scanMode != ScanSettings.SCAN_MODE_OPPORTUNISTIC }
            ) {
                return@guard
            }
            @Suppress("UNCHECKED_CAST")
            val denylist = get(helper, "mLocationDenylistPredicate") as? Predicate<ScanResult>
            val matched = fixtures.filter { candidate ->
                matches.invoke(helper, client, candidate) == true &&
                    (get(client, "hasDisavowedLocation") != true || denylist?.test(candidate) != true)
            }
            val now = SystemClock.elapsedRealtime()
            val tracker = state.scans.getOrPut(client) { BleDeliveryState(now) }
            try {
                synthetic.withValue(true) {
                    dispatch(helper, app, client, settings, callback, info, tracker, matched, batch, now, forceFlush)
                }
            } catch (error: InvocationTargetException) {
                // 客户端已死或 PendingIntent 被取消：走系统自己的清理路径
                val cause = error.targetException
                if (cause is RemoteException || cause is PendingIntent.CanceledException) {
                    dead.invoke(helper, client)
                    state.scans.remove(client)
                } else {
                    throw cause
                }
            }
        }
    }

    /** 按回调类型把伪造结果投出去：批处理 / onScanResult / onFoundOrLost */
    private fun dispatch(
        helper: Any,
        app: Any,
        client: Any,
        settings: ScanSettings,
        callback: Any?,
        info: Any?,
        tracker: BleDeliveryState<ScanResult>,
        matched: List<ScanResult>,
        batch: List<Any>,
        now: Long,
        forceFlush: Boolean,
    ) {
        val onScanResult = scannerInterface.getMethod("onScanResult", ScanResult::class.java)
        if (client in batch) {
            if (tracker.batchDue(now, settings.reportDelayMillis, forceFlush) && matched.isNotEmpty()) {
                sendBatch.invoke(helper, app, client, ArrayList(matched))
            }
            return
        }
        if (settings.callbackType == 1 || settings.callbackType == 8) {
            if (callback != null) {
                matched.forEach { onScanResult.invoke(callback, it) }
            } else if (info != null && matched.isNotEmpty()) {
                sendIntent.invoke(helper, info, ArrayList(matched), 1)
            }
            return
        }
        val changes = tracker.track(matched.associateBy { it.device.address }, now)
        val onFoundOrLost = scannerInterface.getMethod(
            "onFoundOrLost", Boolean::class.javaPrimitiveType, ScanResult::class.java,
        )
        for ((found, values) in listOf(true to changes.found, false to changes.lost)) {
            val flag = if (found) 2 else 4
            if (settings.callbackType and flag == 0) continue
            if (callback != null) {
                values.forEach { onFoundOrLost.invoke(callback, found, it) }
            } else if (info != null && values.isNotEmpty()) {
                sendIntent.invoke(helper, info, ArrayList(values), flag)
            }
        }
    }

    /** 挂上应用回调类：目标应用的真实扫描结果在这里被丢弃 */
    private fun hookCallback(callbackClass: Class<*>) {
        if (!callbackClasses.add(callbackClass)) return
        callbackClass.declaredMethods
            .filter { it.name in setOf("onScanResult", "onBatchScanResults", "onFoundOrLost") }
            .forEach { entry ->
                hook(entry) { chain ->
                    val registration = callbacks[chain.thisObject]
                    val config = module.readConfig()
                    val suppress = if (ready && synthetic.current != true && registration != null &&
                        config != null && config.optBoolean("mock_bluetooth", true)
                    ) {
                        guard("filter") { belongsToTarget(registration, config) } == true
                    } else {
                        false
                    }
                    if (suppress) null else chain.proceed(chain.args.toTypedArray())
                }
            }
    }

    /** 该回调当前是否仍属于目标客户端（防止把真实结果漏给非目标应用） */
    private fun belongsToTarget(registration: Registration, config: JSONObject): Boolean {
        val helper = registration.helper.get() ?: return false
        val app = registration.app.get() ?: return false
        val map = get(helper, "mScannerMap") ?: return false
        val current = method(map.javaClass, "getById", Int::class.javaPrimitiveType!!)
            .invoke(map, get(app, "id"))
        return current === app && target(registration.who, config, helper)
    }

    /** 权限复核：权限被回收时停止投递，绝不伪造"已授权" */
    private fun permitted(helper: Any, client: Any, who: FrameworkCaller): Boolean {
        if (permission.invoke(helper, client) != true) return false
        val context = (get(helper, "mContext") ?: get(helper, "mAdapterService")) as? Context
            ?: return false
        val pkg = who.pkg ?: return false
        val ops = context.getSystemService(AppOpsManager::class.java) ?: return false
        if (context.checkPermission(Manifest.permission.BLUETOOTH_SCAN, -1, who.uid) !=
            PackageManager.PERMISSION_GRANTED
        ) {
            return false
        }
        val scanOp = AppOpsManager.permissionToOp(Manifest.permission.BLUETOOTH_SCAN) ?: return false
        if (ops.noteOpNoThrow(scanOp, who.uid, pkg) != AppOpsManager.MODE_ALLOWED) return false
        // 已经声明过"不想要定位"或持有网络设置权限的客户端不再要求定位权限
        if (get(client, "hasDisavowedLocation") == true ||
            get(client, "hasScanWithoutLocationPermission") == true ||
            get(client, "hasNetworkSettingsPermission") == true ||
            get(client, "hasNetworkSetupWizardPermission") == true
        ) {
            return true
        }
        val fine = get(client, "isQApp") == true
        val permissionName =
            if (fine) Manifest.permission.ACCESS_FINE_LOCATION else Manifest.permission.ACCESS_COARSE_LOCATION
        val opName =
            if (fine) AppOpsManager.OPSTR_FINE_LOCATION else AppOpsManager.OPSTR_COARSE_LOCATION
        return context.checkPermission(permissionName, -1, who.uid) == PackageManager.PERMISSION_GRANTED &&
            ops.noteOpNoThrow(opName, who.uid, pkg) == AppOpsManager.MODE_ALLOWED
    }

    /** 把配置里的 bluetooth_json 转成 ScanResult 列表（按 MAC 去重） */
    private fun results(config: JSONObject): List<ScanResult> {
        if (!config.optBoolean("mock_bluetooth", true)) return emptyList()
        val entries: JSONArray = config.optJSONArray("bluetooth_json") ?: return emptyList()
        val parse = method(type("android.bluetooth.le.ScanRecord"), "parseFromBytes", ByteArray::class.java)
        return (0 until entries.length().coerceAtMost(200)).mapNotNull { index ->
            guard("fixture") {
                val data = entries.optJSONObject(index) ?: return@guard null
                val address = normalizeMacAddress(data.optString("address"))
                if (!BluetoothAdapter.checkBluetoothAddress(address)) return@guard null
                val device = createBluetoothDevice(loader, address) ?: return@guard null
                val bytes = buildScanRecordBytes(
                    data.optString("name"),
                    data.optString("scanRecordHex", data.optString("rawBytes")),
                    address,
                )
                val record = parse.invoke(null, bytes)
                createScanResult(
                    loader, device, record,
                    data.optInt("rssi", -65).coerceIn(-127, 20),
                    SystemClock.elapsedRealtimeNanos(),
                ) as? ScanResult
            }
        }.distinctBy { it.device.address }
    }

    override fun close() {
        ready = false
        super.close()
        owners.clear()
        callbacks.clear()
        callbackClasses.clear()
        flushRequests.clear()
    }

    override fun field(cls: Class<*>, name: String): java.lang.reflect.Field =
        FrameworkBleReflection.field(cls, name)
}
