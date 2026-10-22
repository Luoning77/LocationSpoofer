package com.vincenthzr.locationspoofer.data.cloud

/**
 * 签名失败冷却策略：失败计数上限 3，冷却窗口 30s。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudSigningFailurePolicy.java
 */
data class CloudSigningFailurePolicy(
    val failures: Int = 0,
    val cooldownUntil: Long = 0L,
) {
    /** 记录一次失败：计数封顶 3，冷却截止 = now + 30_000ms */
    fun bufferFailure(now: Long): CloudSigningFailurePolicy {
        val next = (failures.coerceAtMost(3)) + 1
        return CloudSigningFailurePolicy(if (next <= 3) next else 3, now + 30_000L)
    }

    /** 是否处于冷却期（冷却窗口 1ms..60_000ms 内视为有效冷却） */
    fun coolingDown(now: Long): Boolean {
        val remaining = cooldownUntil - now
        return remaining in 1 until 60_001L
    }
}
