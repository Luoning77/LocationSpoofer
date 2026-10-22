package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * BLE 广播投递状态：记录已见设备、产出新增/消失批次。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/delivery/BleDeliveryState.java
 */
class BleDeliveryState<T>(private var lastBatchAt: Long) {

    /** 批次变更：found=本轮新增，lost=超时消失 */
    data class Changes<T>(val found: List<T>, val lost: List<T>)

    /** 已见条目：值 + 最后出现时间 */
    data class Seen<T>(var value: T, var lastSeen: Long)

    private val seen = LinkedHashMap<String, Seen<T>>()

    /**
     * 判定是否应当出批：距上次出批不足 minInterval（下限 1000ms）时返回 false；
     * force=true 跳过间隔判定。判定通过则刷新 lastBatchAt。
     */
    fun batchDue(now: Long, minInterval: Long, force: Boolean = false): Boolean {
        if (!force) {
            val elapsed = now - lastBatchAt
            if (elapsed < maxOf(minInterval, 1_000L)) return false
        }
        lastBatchAt = now
        return true
    }

    /**
     * 跟踪本轮扫描结果：新增设备进 found；map 中已消失且超过
     * forgetAfterMs（默认 10s）的设备进 lost 并移除。
     */
    fun track(map: Map<String, T>, now: Long, forgetAfterMs: Long = 10_000L): Changes<T> {
        val found = mutableListOf<T>()
        for ((key, value) in map) {
            if (!seen.containsKey(key)) found.add(value)
            seen[key] = Seen(value, now)
        }
        val lost = mutableListOf<T>()
        val iterator = seen.entries.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            if (!map.containsKey(entry.key) && now - entry.value.lastSeen >= forgetAfterMs) {
                lost.add(entry.value.value)
                iterator.remove()
            }
        }
        return Changes(found, lost)
    }
}
