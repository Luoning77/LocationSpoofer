package com.vincenthzr.locationspoofer.xposed.hooks

object SystemAccelNative {
    val available: Boolean = try {
        System.loadLibrary("location_accel")
        true
    } catch (_: Throwable) {
        false
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
