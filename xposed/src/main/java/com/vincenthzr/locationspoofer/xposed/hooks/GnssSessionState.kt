package com.vincenthzr.locationspoofer.xposed.hooks

/**
 * GNSS 会话状态机：按 session id 记录"已启动/首个定位"去重。
 */
class GnssSessionState {
    private var session: Long? = null
    private var started: Boolean = false
    private var firstFix: Boolean = false

    private fun select(id: Long) {
        if (session == id) return
        session = id
        started = false
        firstFix = false
    }

    @Synchronized
    fun acceptFirstFix(id: Long): Boolean {
        select(id)
        if (firstFix) return false
        firstFix = true
        return true
    }

    @Synchronized
    fun acceptStarted(id: Long): Boolean {
        select(id)
        if (started) return false
        started = true
        return true
    }

    @Synchronized
    fun needsFirstFix(id: Long): Boolean = !(session == id && firstFix)

    @Synchronized
    fun needsStarted(id: Long): Boolean = !(session == id && started)

    @Synchronized
    fun reset() {
        session = null
        started = false
        firstFix = false
    }

    /** 持久化快照：[session(无则-1), started, firstFix] */
    @Synchronized
    fun save(): LongArray = longArrayOf(session ?: -1L, if (started) 1L else 0L, if (firstFix) 1L else 0L)

    /** 恢复快照（长度与格式不符或 session<0 时忽略） */
    @Synchronized
    fun restore(saved: LongArray?) {
        if (saved == null || saved.size != 3) return
        if (saved[0] < 0) return
        session = saved[0]
        started = saved[1] == 1L
        firstFix = saved[2] == 1L
    }
}
