package com.vincenthzr.locationspoofer.data.cloud

/**
 * 积分账目条目。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/RewardEntry.java
 */
data class RewardEntry(
    val id: String,
    val delta: Int,
    val kind: String,
    val createdAt: Long,
)
