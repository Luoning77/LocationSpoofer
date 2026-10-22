package com.vincenthzr.locationspoofer.data.cloud

/**
 * 会员套餐。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/MembershipPlan.java
 */
data class MembershipPlan(
    val id: String,
    val name: String,
    val durationDays: Int,
    val originalPriceCents: Int,
    val priceCents: Int,
    val activityLabel: String,
    val revision: Long,
    val softwareDeviceLimit: Int,
    val tier: String,
    val remainingStock: Int? = null,
    val accountRemaining: Int? = null,
    val available: Boolean,
    val productKind: String,
    val quotaUnits: Int,
)
