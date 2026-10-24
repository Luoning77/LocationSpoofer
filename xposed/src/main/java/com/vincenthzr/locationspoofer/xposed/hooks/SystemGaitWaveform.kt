package com.vincenthzr.locationspoofer.xposed.hooks

import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sin

/**
 * 系统侧步态波形生成：由步频生成 192 点三轴加速度波形（x/y 摆动 + z 含重力）。
 */
object SystemGaitWaveform {
    private const val GRAVITY = 9.80665
    private const val SAMPLES = 64

    /**
     * @param speed 步速（m/s），非负
     * @return 192 点 float 数组（64 点 x 轴 + 64 点 y 轴 + 64 点 z 轴），speed 非法时返回 null
     */
    fun create(speed: Double): FloatArray? {
        require(!abs(speed).isInfinite() && speed >= 0.0) { "Failed requirement." }
        // 步幅→摆动幅度：低速线性、高速放大并封顶
        var amplitude = (if (speed >= 2.2) speed * 1.5 + 6.0 else speed + 2.0) * 0.65
        if (amplitude > 8.0) amplitude = 8.0
        val wave = FloatArray(192)
        for (i in 0 until SAMPLES) {
            val t = (i * 2.0 * PI) / SAMPLES
            wave[i] = (sin(t) * 0.12 * amplitude).toFloat()
            wave[i + SAMPLES] = (sin(2.0 * t) * 0.18 * amplitude).toFloat()
            wave[i + 2 * SAMPLES] = ((cos(2.0 * t) * amplitude) + GRAVITY).toFloat()
        }
        return wave
    }
}
