package com.vincenthzr.locationspoofer.xposed.utils

import kotlin.math.floor
import kotlin.math.max

/**
 * 把「累计步数」这个连续量换算成每一步发生的时间戳。
 *
 * 两次采样之间可能跨过多步，这里按步数占比线性插值出每步的时刻，
 * 并只保留最近 2 秒内的步事件（更早的事件对传感器回调已经没有意义）。
 */
internal class StepEventTimeline {
    private var previousNanos = 0L
    private var previousSteps: Double? = null

    @Synchronized
    fun sample(steps: Double, nowNanos: Long): LongArray {
        val before = previousSteps
        if (before != null && nowNanos <= previousNanos) return LongArray(0)

        val beforeNanos = previousNanos
        previousSteps = steps
        previousNanos = nowNanos

        if (before == null || steps <= before) return LongArray(0)

        val firstStep = floor(before).toLong() + 1
        val lastStep = floor(steps).toLong()
        val earliest = nowNanos - 2_000_000_000L
        val deltaSteps = steps - before
        val deltaNanos = nowNanos - beforeNanos

        val events = ArrayList<Long>()
        for (step in max(firstStep, lastStep - 8)..lastStep) {
            val at = ((step - before) / deltaSteps * deltaNanos).toLong() + beforeNanos
            if (at >= earliest) events.add(at)
        }
        return events.toLongArray()
    }
}
