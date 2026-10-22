package com.vincenthzr.locationspoofer.xposed.hooks

/**
 * 传感器伪造 native 引擎（liblocation_accel.so）JNI 桥。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/SystemAccelNative.java
 *
 * 六个入口（全部 native，由 so 内实现）：
 * - install: 挂 libsensorservice.so，成功返回 true
 * - uids: 当前受控 UID 列表
 * - configureSensors: 下发传感器伪造配置（波形/步态参数）
 * - configureStepSensors: 配置计步传感器伪造，成功返回 true
 * - diagnostics: 诊断计数（install/重写/错误等计数器）
 * - disable: 摘除挂钩
 */
object SystemAccelNative {
    init {
        System.loadLibrary("location_accel")
    }

    @JvmStatic
    external fun install(path: String): Boolean

    @JvmStatic
    external fun uids(): IntArray

    @JvmStatic
    external fun configureSensors(
        enabled: Boolean,
        uids: IntArray,
        walkY: Double,
        walkZ: Double,
        runZ: Double,
        stepIntervalNanos: Long,
        gaitPeriodNanos: Long,
        holdNanos: Long,
        flags: Int,
        wave: FloatArray,
        stepEnabled: Boolean,
        stepRate: Double,
    )

    @JvmStatic
    external fun configureStepSensors(uids: IntArray): Boolean

    @JvmStatic
    external fun diagnostics(): LongArray

    @JvmStatic
    external fun disable()
}
