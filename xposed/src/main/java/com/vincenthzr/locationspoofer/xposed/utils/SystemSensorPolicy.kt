package com.vincenthzr.locationspoofer.xposed.utils

import com.vincenthzr.locationspoofer.utils.MotionRealism
import org.json.JSONObject

/**
 * 系统进程（system_server）里的传感器策略判定。
 *
 * 这里放的是「谁该被模拟」「步频多少」「哪些传感器算计步传感器」「当前固件用哪套传感器布局」
 * 这类纯策略逻辑，与 Hook 本身分离，便于独立演进和单测。
 */
internal object SystemSensorPolicy {

    /** 设备实测/审阅过的传感器布局 profile */
    data class Profile(val id: String, val sha256: String, val validation: String)

    /** 一个计步传感器：handle 是 native 侧标识，type 是 Sensor.TYPE_STEP_* */
    data class SensorDescriptor(val handle: Int, val type: Int, val wakeUp: Boolean)

    /** PJE110（一加 12）实测 */
    const val PROFILE_SHA256 = "c8608011eb603ffbfdba9bb9abf222018f1dbbb6a94a27a914a657c19e7aae67"

    /** ColorOS 15 静态审阅 */
    const val COLOROS15_SHA256 = "7293157e3e5babc1f812e5947b9b925f2ff83c0217445d0ca6e794c858396218"

    /** HyperOS 4 实测 */
    const val HYPEROS4_SHA256 = "776156ec89548910092155947f9d6429d702684a77a57efd5b2fd5fe52b93c21"

    private val profiles = listOf(
        Profile("sensor-layout-pje110", PROFILE_SHA256, "device-tested"),
        Profile("sensor-layout-opd2404", COLOROS15_SHA256, "static-reviewed"),
        Profile("sensor-layout-popsicle", HYPEROS4_SHA256, "device-tested")
    )

    /** 单个 catalog 的上限，超过就认为读到了异常数据 */
    private const val MAX_STEP_SENSORS = 32

    private val STEP_SENSOR_TYPES = setOf(18, 19) // TYPE_STEP_DETECTOR / TYPE_STEP_COUNTER

    /**
     * 按配置计算当前步频（步/分钟）。
     *
     * 自动步频时在 [StepSimulationClock.autoCadence] 基准上叠加速度起伏（占 0.4 权重）
     * 与真实感等级的步频起伏，噪声与 core-geo 的 MotionRealism 同源，保证跨进程一致。
     *
     * @param config 全局配置 JSON
     * @param now 当前时间（毫秒）
     */
    fun cadence(config: JSONObject, now: Long): Double {
        val speed = config.optDouble("speed_m_s", 0.0)
        val cleanSpeed = if (speed.isNaN() || speed.isInfinite()) 0.0 else speed
        if (!config.optBoolean("is_auto_cadence", true)) {
            return config.optInt("step_cadence_spm", 165).coerceIn(60, 240).toDouble()
        }
        val elapsedMs = (now - config.optLong("start_timestamp", now)).coerceAtLeast(0L)
        val elapsedSec = elapsedMs / 1000.0
        val session = MotionRealism.session(
            config.optLong("start_timestamp", 0L),
            config.optInt("realism_level", 0),
            config.optInt("speed_fluctuation_pct", 0)
        )
        // Session.cadence(1.0, t) 即波动系数：1 + 0.4·波动·速度噪声 + 等级·步频噪声
        val factor = session.cadence(1.0, elapsedSec)
        return factor * StepSimulationClock.autoCadence(cleanSpeed)
    }

    /**
     * 判断某个系统调用方是否属于需要模拟的目标。
     *
     * @param uid 调用方 UID
     * @param packages 调用方关联的包名集合
     * @param exempt 豁免包名集合（系统核心组件与定位服务，命中即排除）
     * @param config 全局配置
     */
    fun isTarget(uid: Int, packages: Set<String>, exempt: Set<String>, config: JSONObject): Boolean {
        val appId = uid % 100_000
        if (appId < 10_000 || appId >= 20_000 || packages.isEmpty()) return false
        if (packages.any { exempt.contains(it) }) return false
        if (!config.optBoolean("active", false)) return false
        if (config.optBoolean("system_hook_global_mode", false)) return true

        val whitelist = config.optJSONArray("system_hook_packages") ?: return false
        for (index in 0 until whitelist.length()) {
            if (packages.contains(whitelist.optString(index))) return true
        }
        return false
    }

    /** 按当前固件指纹匹配已知传感器布局；未启用或未知布局返回 null */
    fun profile(enabled: Boolean, sha256: String): Profile? {
        if (!enabled) return null
        return profiles.firstOrNull { it.sha256 == sha256 }
    }

    /**
     * 从完整传感器列表里挑出计步相关（TYPE_STEP_DETECTOR=18 / TYPE_STEP_COUNTER=19）的条目，
     * 按 (handle, type) 去重；数量异常时抛出，让调用方放弃 native 步数注入。
     */
    fun stepCatalog(sensors: List<SensorDescriptor>): List<SensorDescriptor> {
        val seen = HashSet<Pair<Int, Int>>()
        val unique = sensors
            .filter { it.handle >= 0 && it.type in STEP_SENSOR_TYPES }
            .filter { seen.add(it.handle to it.type) }
        if (unique.size > MAX_STEP_SENSORS) {
            throw IllegalArgumentException("Step sensor catalog too large")
        }
        return unique
    }
}
