package com.vincenthzr.locationspoofer.data.cloud

/**
 * 贡献积分状态。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/ContributionStatus.java
 */
data class ContributionStatus(
    val availablePoints: Long,
    val pendingPoints: Long,
    val verifiedContributions: Int,
    val bonusSearchRemaining: Int,
    val devices: List<RewardDevice>,
    val coupons: List<RewardCoupon>,
    val ledger: List<RewardEntry>,
    val monthlySearchCap: Int,
    val monthlyCouponCap: Int,
)
