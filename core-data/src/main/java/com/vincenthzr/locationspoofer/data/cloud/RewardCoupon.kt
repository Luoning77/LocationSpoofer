package com.vincenthzr.locationspoofer.data.cloud

/**
 * 奖励代金券。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/RewardCoupon.java
 */
data class RewardCoupon(
    val id: String,
    val amountCents: Int,
    val minimumCents: Int,
    val expiresAt: Long,
)
