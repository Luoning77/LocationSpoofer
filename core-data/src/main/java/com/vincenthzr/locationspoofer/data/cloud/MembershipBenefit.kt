package com.vincenthzr.locationspoofer.data.cloud

/**
 * 会员权益条目：免费/会员对比文案。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/MembershipBenefit.java
 */
data class MembershipBenefit(
    val id: String,
    val name: String,
    val free: String,
    val member: String,
    val values: Map<String, String>,
)
