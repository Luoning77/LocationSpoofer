package com.vincenthzr.locationspoofer.xposed.utils

import com.vincenthzr.locationspoofer.utils.MotionRealism
import org.json.JSONObject

/**
 * 把配置里的运动参数换算成「从起点开始累计走了多少步」。
 *
 * 为什么要有这个类：计步传感器（[android.hardware.Sensor.TYPE_STEP_COUNTER]）返回的是开机以来的累计值，
 * 而伪造步数必须随配置切换、暂停、恢复都保持连续，否则应用侧一减就能发现跳变。
 * 这里维护一个「锚点 + 基准步数」的模型：
 *  - 配置变化时先把旧程序推进到切换时刻，把累计值固化进 [base]，再换新程序；
 *  - 每次采样只返回 base 加上新程序自锚点以来的增量，并对结果取 max，保证单调不减。
 */
internal class StepSimulationClock(
    base: Double = DEFAULT_BASE_STEPS,
    resumeAt: Long = 0L
) {
    private var anchor = 0L
    private var base = base
    private var lastNow = 0L
    private var program: Program? = null
    private var resumeAt = resumeAt
    private var steps = base

    /**
     * 一段稳定的运动参数。只有参数真的变了才会替换，避免每帧重建噪声表。
     */
    data class Program(
        val start: Long,
        val speed: Double,
        val cadence: Int,
        val auto: Boolean,
        val level: Int,
        val fluctuation: Int,
        val moving: Boolean
    ) {
        /** 从起点到 [now] 的累计步数 */
        fun stepsAt(now: Long): Double {
            if (!moving) return 0.0
            val elapsedMs = (now - start).coerceAtLeast(0L)
            val elapsedSec = elapsedMs / 1000.0
            if (!auto) return cadence * elapsedSec / 60.0
            // 自动步频下步数不是简单的 步频×时间：步频本身随速度起伏和真实感等级摆动，
            // 这里复用 core-geo 的 MotionRealism 会话（固定种子），保证跨进程结果可复现。
            val session = MotionRealism.session(start, level, fluctuation)
            return session.steps(cadence.toDouble(), elapsedSec)
        }

        fun save(): Array<Any> = arrayOf(start, speed, cadence, auto, level, fluctuation, moving)

        companion object {
            fun restore(saved: Array<*>): Program = Program(
                start = saved[0] as Long,
                speed = saved[1] as Double,
                cadence = saved[2] as Int,
                auto = saved[3] as Boolean,
                level = saved[4] as Int,
                fluctuation = saved[5] as Int,
                moving = saved[6] as Boolean
            )
        }
    }

    private fun advance(program: Program, now: Long) {
        steps = maxOf(steps, base + program.stepsAt(now) - program.stepsAt(anchor))
    }

    @Synchronized
    fun restore(saved: Array<*>) {
        program = (saved.getOrNull(0) as? Array<*>)?.let { Program.restore(it) }
        base = saved[1] as Double
        steps = saved[2] as Double
        anchor = saved[3] as Long
        lastNow = saved[4] as Long
        resumeAt = (saved.getOrNull(5) as? Long) ?: 0L
    }

    @Synchronized
    fun save(): Array<Any?> =
        arrayOf(program?.save(), base, steps, anchor, lastNow, resumeAt)

    /**
     * 按当前配置推进到 [now]，返回累计步数。
     *
     * @param config 全局配置 JSON（读取 start_timestamp / speed_m_s / step_cadence_spm 等）
     * @param now 单调时间（毫秒，通常是 elapsedRealtime）
     */
    @Synchronized
    fun steps(config: JSONObject, now: Long): Double {
        val startTimestamp = config.optLong("start_timestamp", 0L)
        if (startTimestamp <= 0 || now < lastNow) return steps

        val current = program
        if (startTimestamp < (current?.start ?: startTimestamp)) return steps

        val speed = config.optDouble("speed_m_s", 0.0)
        val auto = config.optBoolean("is_auto_cadence", true)
        val next = Program(
            start = startTimestamp,
            speed = speed,
            cadence = if (auto) {
                autoCadence(speed)
            } else {
                config.optInt("step_cadence_spm", 165).coerceIn(60, 240)
            },
            auto = auto,
            level = config.optInt("realism_level", 0),
            fluctuation = config.optInt("speed_fluctuation_pct", 0),
            moving = speed > 0.05 && config.optBoolean("active", true) &&
                config.optBoolean("enable_step_simulation", true)
        )

        if (next != current) {
            if (current != null) {
                advance(current, if (next.start == current.start) now else minOf(now, next.start))
            }
            base = steps
            anchor = when {
                current == null || current.start != next.start ->
                    maxOf(next.start, if (program == null) resumeAt else 0L)
                else -> now
            }
            program = next
        }
        advance(next, now)
        lastNow = now
        return steps
    }

    companion object {
        /** 默认起点步数：和真机计步器开机后的典型量级接近，避免伪造值从 0 开始显得突兀 */
        private const val DEFAULT_BASE_STEPS = 2350.0

        /** 速度 → 步频（步/分钟）的分段线性映射，区间取自真实步行/跑步统计 */
        fun autoCadence(speed: Double): Int {
            if (speed <= 0.8) return 95
            val value = when {
                speed <= 1.5 -> (speed - 0.8) / 0.7 * 25.0 + 100.0
                speed <= 2.8 -> (speed - 1.5) / 1.3 * 25.0 + 135.0
                speed <= 4.0 -> (speed - 2.8) / 1.2 * 20.0 + 160.0
                speed <= 5.5 -> (speed - 4.0) / 1.5 * 15.0 + 180.0
                else -> return 200
            }
            return value.toInt()
        }
    }
}
