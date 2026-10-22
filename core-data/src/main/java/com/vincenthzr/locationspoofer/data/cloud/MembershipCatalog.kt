package com.vincenthzr.locationspoofer.data.cloud

/**
 * 会员目录：套餐 + 权益 + 购买开关 + 配额说明。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/MembershipCatalog.java
 */
data class MembershipCatalog(
    val purchasingEnabled: Boolean,
    val plans: List<MembershipPlan>,
    val benefits: List<MembershipBenefit>,
    val quotaNote: String,
)
