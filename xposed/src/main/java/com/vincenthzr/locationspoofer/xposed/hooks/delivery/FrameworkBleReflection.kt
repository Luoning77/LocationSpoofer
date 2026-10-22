package com.vincenthzr.locationspoofer.xposed.hooks.delivery

import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Modifier

/**
 * 蓝牙 scan binder 内部结构的反射定位器。
 *
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/delivery/FrameworkBleReflection.java（457 行）。
 *
 * AOSP 的 BluetoothScanBinder / GattService 在 Android 12～17 之间改过好几次名字与结构，
 * OEM 还会再改一遍。这里不硬编码任何成员名之外的假设：先按签名特征找到关键方法，
 * 再用"方法的参数类型/返回类型必须自洽"交叉校验，任何一步对不上就整体抛出，
 * 由调用方把这次投递适配器整体关掉。
 */
internal object FrameworkBleReflection {

    /** resolve() 的结果：扫描投递所需的全部反射句柄 */
    data class Layout(
        val client: Class<*>,
        val permission: Method,
        val matches: Method,
        val sendBatch: Method,
        val sendIntent: Method,
        val dead: Method,
        val manager: Class<*>,
        val add: Method,
    )

    /** 类本身 + 全部父类（不含接口） */
    private fun hierarchy(cls: Class<*>): Sequence<Class<*>> =
        generateSequence(cls) { it.superclass }

    private fun methods(cls: Class<*>): Sequence<Method> =
        hierarchy(cls).flatMap { it.declaredMethods.asSequence() }

    /**
     * 找"投递一批扫描结果"这类方法：返回 void、参数 3 个、第 2 或第 3 个参数是集合。
     * 集合类型两种都试（Android 12/13 用 List，14+ 用 ArrayList）。
     */
    @Throws(NoSuchMethodException::class)
    private fun deliveryMethod(
        cls: Class<*>,
        name: String,
        predicate: (Method) -> Boolean,
    ): Method {
        for (collectionType in listOf(ArrayList::class.java, List::class.java)) {
            val index = if (name == "sendBatchScanResults") 2 else 1
            val found = methods(cls).firstOrNull { candidate ->
                candidate.name == name &&
                    !Modifier.isStatic(candidate.modifiers) &&
                    candidate.returnType == Void.TYPE &&
                    candidate.parameterCount == 3 &&
                    candidate.parameterTypes[index] == collectionType &&
                    predicate(candidate)
            }
            if (found != null) {
                found.isAccessible = true
                return found
            }
        }
        throw NoSuchMethodException("${cls.name}.$name with List/ArrayList delivery signature")
    }

    /**
     * 按名字找字段，自动兼容 AOSP 的 "m" 前缀命名（"mScanManager" 与 "scanManager" 都能命中）。
     * 额外候选名（[extra]）用于同一字段在不同版本上的改名。
     */
    @Throws(NoSuchFieldException::class)
    fun field(cls: Class<*>, name: String, vararg extra: String): Field {
        val prefixed = if (name.isEmpty() || (name.length > 1 && name[0] == 'm' && name[1].isUpperCase())) {
            name
        } else {
            "m" + name.replaceFirstChar { it.uppercaseChar() }
        }
        val candidates = listOf(name) + listOf(prefixed) + extra.toList()
        for (candidate in candidates) {
            for (clazz in hierarchy(cls)) {
                try {
                    return clazz.getDeclaredField(candidate).also { it.isAccessible = true }
                } catch (_: NoSuchFieldException) {
                }
            }
        }
        throw NoSuchFieldException("${cls.name}.${candidates.joinToString()}")
    }

    /**
     * 找 flushPendingBatchResults(int, client)：先在自己及父类里找，再在额外候选类里找。
     * 不同版本这个方法一个在 ScanBinder 上、一个在 BluetoothScanBinder 上。
     */
    @Throws(NoSuchMethodException::class)
    fun flushMethod(cls: Class<*>, extra: List<Class<*>>, client: Class<*>): Method {
        for (clazz in hierarchy(cls) + extra) {
            try {
                return method(clazz, "flushPendingBatchResults", Int::class.javaPrimitiveType!!, client)
            } catch (_: NoSuchMethodException) {
            }
        }
        throw NoSuchMethodException("${cls.name}/ScanBinder.flushPendingBatchResults(int, ${client.name})")
    }

    /** 依次读多个候选字段，返回第一个非 null 的；全部存在但都是 null 时返回 null */
    @Throws(NoSuchFieldException::class)
    fun getOf(obj: Any, vararg names: String): Any? {
        var seen = false
        for (name in names) {
            try {
                val value = field(obj.javaClass, name).get(obj)
                if (value != null) return value
                seen = true
            } catch (_: NoSuchFieldException) {
            }
        }
        if (seen) return null
        throw NoSuchFieldException("${obj.javaClass.name}.${names.joinToString()}")
    }

    /** 沿父类链找方法并 setAccessible */
    @Throws(NoSuchMethodException::class)
    fun method(cls: Class<*>, name: String, vararg parameterTypes: Class<*>): Method {
        for (clazz in hierarchy(cls)) {
            try {
                return clazz.getDeclaredMethod(name, *parameterTypes).also { it.isAccessible = true }
            } catch (_: NoSuchMethodException) {
            }
        }
        throw NoSuchMethodException("${cls.name}.$name(${parameterTypes.joinToString { it.name }})")
    }

    /**
     * 解析 scan binder 的投递结构。
     *
     * @param cls 扫描服务实现类（Android 17 的 le_scan.ScanBinder 或更早的 GattService）
     * @param result 扫描结果类（android.bluetooth.le.ScanResult）
     */
    @Throws(NoSuchFieldException::class, NoSuchMethodException::class)
    fun resolve(cls: Class<*>, result: Class<*>): Layout {
        val booleanType = Boolean::class.javaPrimitiveType!!
        val intType = Int::class.javaPrimitiveType!!

        // 1) hasScanResultPermission(client) -> boolean：顺便拿到 client 类型
        val permission = methods(cls).firstOrNull { candidate ->
            candidate.name == "hasScanResultPermission" &&
                candidate.parameterCount == 1 &&
                candidate.returnType == booleanType &&
                !Modifier.isStatic(candidate.modifiers)
        } ?: throw NoSuchMethodException("${cls.name}.hasScanResultPermission(client)")
        permission.isAccessible = true
        val client = permission.parameterTypes[0]

        // 2) matchesFilters(client, ScanResult) -> boolean
        val matches = method(cls, "matchesFilters", client, result)
        if (matches.returnType != booleanType) {
            throw IllegalStateException("Invalid matchesFilters result: $matches")
        }

        // 3) sendBatchScanResults(...)：第 2 个参数是 client，第 1 个参数就是"扫描结果列表"的元素类型
        val sendBatch = deliveryMethod(cls, "sendBatchScanResults") { it.parameterTypes[1] == client }
        val resultType = sendBatch.parameterTypes[0]

        // 4) sendResultsByPendingIntent(...)：第 3 个参数是 int（callbackType）
        val sendIntent = deliveryMethod(cls, "sendResultsByPendingIntent") {
            it.parameterTypes[2] == intType
        }

        // 5) handleDeadScanClient(client)：客户端已死时清理
        val dead = method(cls, "handleDeadScanClient", client)

        // 6) 校验 scan manager 的内部结构
        val manager = field(cls, "mScanManager").type
        field(manager, "mHandler")
        field(manager, "mScanHelper", "mScanController")
        method(manager, "getRegularScanQueue")
        method(manager, "getBatchScanQueue")
        method(manager, "flushBatchScanResults", client)

        // 7) 校验 scannerMap 的 add(..., client) -> 扫描结果类型
        val scannerMap = field(cls, "mScannerMap").type
        method(scannerMap, "getById", intType)
        val add = methods(scannerMap).firstOrNull { candidate ->
            if (candidate.name != "add") return@firstOrNull false
            val parameters = candidate.parameterTypes
            parameters.lastOrNull() == client && candidate.returnType == resultType
        } ?: throw NoSuchMethodException("${scannerMap.name}.add(..., ${cls.name}) -> ${resultType.name}")
        add.isAccessible = true

        // 8) 校验 ScanBinder 自己的上下文字段
        field(cls, "mContext", "mAdapterService")
        field(cls, "mLocationDenylistPredicate")

        // 9) 校验 client 的字段（后续按名读取扫描参数）
        for (name in listOf(
            "scannerId", "appDied", "settings", "callingPackage", "hasDisavowedLocation",
            "hasScanWithoutLocationPermission", "hasNetworkSettingsPermission",
            "hasNetworkSetupWizardPermission", "isQApp",
        )) {
            field(client, name)
        }

        // 10) 校验扫描结果类的字段
        for (name in listOf("id", "name", "callback", "info")) {
            field(resultType, name)
        }

        // 11) 校验 PendingIntent 投递用的 AttributionSource 字段
        for (name in listOf("callingUid", "callingPackage")) {
            field(sendIntent.parameterTypes[0], name)
        }

        return Layout(client, permission, matches, sendBatch, sendIntent, dead, manager, add)
    }
}
