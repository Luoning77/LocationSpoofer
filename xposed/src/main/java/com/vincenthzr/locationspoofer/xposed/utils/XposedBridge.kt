package com.vincenthzr.locationspoofer.xposed.utils

import android.util.Log
import io.github.libxposed.api.XposedModule
import java.util.concurrent.ConcurrentHashMap

/**
 * 日志桥：Logcat 与 Xposed 模块日志双写，全部吞异常防炸进程。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/utils/XposedBridge.java
 */
object XposedBridge {

    private val openCellLogLastTimes = ConcurrentHashMap<String, Long>()

    fun log(t: Throwable) {
        val message = t.message ?: "Exception"
        try {
            Log.e("LocationSpoofer", "Exception", t)
        } catch (_: Throwable) {
        }
        try {
            if (XposedHelpers.isModuleInitialized()) {
                XposedHelpers.module.log(6, "LocationSpoofer", message, t)
            }
        } catch (_: Throwable) {
        }
    }

    fun log(message: String) {
        try {
            Log.i("LocationSpoofer", message)
        } catch (_: Throwable) {
        }
        try {
            if (XposedHelpers.isModuleInitialized()) {
                XposedHelpers.module.log(4, "LocationSpoofer", message)
            }
        } catch (_: Throwable) {
        }
    }

    /** 开放接口诊断日志：只写 Logcat，标记 [openCellId] */
    fun logOpenCellId(openCellId: String, t: Throwable) {
        try {
            Log.e("LocationSpoofer", openCellId, t)
        } catch (_: Throwable) {
        }
    }

    /** 开放接口诊断日志（消息） */
    fun logOpenCellId(openCellId: String) {
        log(openCellId)
    }

    /** 限频版开放接口诊断日志：同 key 每 intervalMs 至多一条 */
    fun logOpenCellIdEvery(key: String, message: String, intervalMs: Long = 5_000L) {
        val now = System.currentTimeMillis()
        val last = openCellLogLastTimes[key] ?: 0L
        if (now - last > intervalMs) {
            openCellLogLastTimes[key] = now
            try {
                Log.i("LocationSpoofer", "[$key] $message")
            } catch (_: Throwable) {
            }
        }
    }
}
