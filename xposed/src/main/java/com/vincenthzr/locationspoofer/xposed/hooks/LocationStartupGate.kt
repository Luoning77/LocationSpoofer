package com.vincenthzr.locationspoofer.xposed.hooks

import java.util.WeakHashMap

/**
 * 定位启动限流门：为每个注册对象记录截止时间，窗口内要求等待。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/LocationStartupGate.java
 */
class LocationStartupGate(periodNanos: Long) {
    private val deadlines: WeakHashMap<Any, Long>

    init {
        require(periodNanos > 0) { "Failed requirement." }
        this.deadlines = WeakHashMap()
    }

    @Synchronized
    fun clear() {
        deadlines.clear()
    }

    @Synchronized
    fun forget(obj: Any) {
        deadlines.remove(obj)
    }

    /** 已注册回调：截止时间 = now + periodNanos */
    @Synchronized
    fun registered(obj: Any, nowNanos: Long) {
        deadlines[obj] = nowNanos + periodNanos
    }

    /** 正在注册：截止时间 = 无穷（等待明确解除） */
    @Synchronized
    fun registering(obj: Any) {
        deadlines[obj] = Long.MAX_VALUE
    }

    /** 截止时间未到→true（需等待）；到期则移除并放行 */
    @Synchronized
    fun shouldWait(obj: Any, nowNanos: Long): Boolean {
        val deadline = deadlines[obj] ?: return false
        if (nowNanos < deadline) return true
        deadlines.remove(obj)
        return false
    }
}
