package com.vincenthzr.locationspoofer.data.cloud

import android.os.SystemClock
import android.util.Log

/**
 * 地图启动阶段计时器（诊断日志用）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/MapStartupTiming.java
 */
class MapStartupTiming private constructor() {

    enum class Phase {
        MAIN_UI_READY,
        ENVIRONMENT_READY,
        ACCOUNT_VERIFIED,
        MAP_STYLE_READY,
        MAP_FIRST_FRAME,
        AUTO_UPDATE_STARTED,
    }

    fun begin() {
        synchronized(this) {
            startedAt = SystemClock.elapsedRealtime()
            recorded.clear()
            Log.i("MapStartup", "phase=APPLICATION_STARTED elapsedMs=0")
        }
    }

    fun mark(phase: Phase) {
        synchronized(this) {
            val start = startedAt ?: return
            val elapsed = SystemClock.elapsedRealtime() - start
            // 启动超过 60s 后不再记录；每个 phase 只记一次
            if (elapsed < 0 || elapsed >= 60_001L || !recorded.add(phase)) return
            Log.i("MapStartup", "phase=" + phase.name + " elapsedMs=" + elapsed)
        }
    }

    companion object {
        @Volatile
        private var startedAt: Long? = null
        private val recorded = LinkedHashSet<Phase>()

        @JvmStatic
        val INSTANCE = MapStartupTiming()
    }
}
