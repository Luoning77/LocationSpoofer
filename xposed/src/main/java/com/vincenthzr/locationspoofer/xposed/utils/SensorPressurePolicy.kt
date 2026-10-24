package com.vincenthzr.locationspoofer.xposed.utils

import org.json.JSONObject
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sin

/**
 * 气压计伪造策略：按真实海拔正弦微扰生成气压读数。
 *
 * 原版签名：apply(float[] values, long timestamp, JSONObject environment, long altitudeOffset, long now)
 * 注意 altitudeOffset 与 now 均为 long，realisticAltitude 也接收 long（毫秒）。
 */
object SensorPressurePolicy {

    /** enabled: JSONObject 的 active + barometer_fluctuation 双开关 */
    fun enabled(json: JSONObject?): Boolean =
        json != null && json.optBoolean("active", false) && json.optBoolean("barometer_fluctuation", false)

    /**
     * 写入伪造气压值到 values[0]；时间基准不匹配时返回 false。
     * @param values 传感器值数组（原位修改）
     * @param timestamp 传感器事件时间戳（ns），<=0 时回退到 now
     * @param environment 环境点 JSON（含海拔）
     * @param altitudeOffset 海拔偏移（米）
     * @param now 当前单调时间（ns）
     */
    fun apply(
        values: FloatArray,
        timestamp: Long,
        environment: JSONObject?,
        altitudeOffset: Long,
        now: Long,
    ): Boolean {
        if (!enabled(environment) || values.isEmpty()) return false
        val config = environment ?: return false
        val base = if (timestamp > 0) timestamp else now
        // 时间窗：base 距 now 不得超过 0.1s（未来）/1.5s（过去）
        if (!(base <= now + 100_000_000L && now - base <= 1_500_000_000L)) return false
        val altitude = RouteEngine.realisticAltitude(
            config,
            (base - now) / 1_000_000L + altitudeOffset,
        ).coerceIn(-500.0, 10_000.0)
        val pressure = (1.0 - altitude / 44_330.0).pow(5.2550001983762575) * 1013.25
        val t = (base.coerceAtLeast(0) / 1.0e9) * 2.0 * PI
        values[0] = (((sin(t / 131.0 + 0.9) * 0.3) + (sin(t / 43.0) * 0.7)) * 0.3 + pressure).toFloat()
        return true
    }
}
