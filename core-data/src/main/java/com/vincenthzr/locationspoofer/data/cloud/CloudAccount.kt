package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云账号快照。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudAccount.java（29 字段，copy$default 掩码至 bit30）
 */
data class CloudAccount(
    val username: String = "",
    val plan: String = "",
    val subscriptionExpiresAt: Long? = null,
    val searchLimit: Int = 0,
    val searchUsed: Int = 0,
    val resetsAt: Long = 0L,
    val isGuest: Boolean = false,
    val visitorId: String = "",
    val id: String = "",
    val deviceId: String = "",
    val publicKeyFingerprint: String = "",
    val sessionId: String = "",
    val capabilities: Set<String> = emptySet(),
    val deviceRole: String = "",
    val quotaScope: String = "",
    val deviceQuotaActivatesAt: Long? = null,
    val softwareDeviceLimit: Int = 0,
    val softwareDeviceCount: Int = 0,
    val softwareMembershipRequired: Boolean = false,
    val membershipPlanId: String = "",
    val membershipPlanName: String = "",
    val membershipTier: String = "",
    val quotaPeriod: String = "",
    val quotaStartsAt: Long? = null,
    val slotId: String = "",
    val extraQuotaRemaining: Int = 0,
    val loginDeviceLimit: Int? = null,
    val callBillingEnabled: Boolean = false,
    val mapTileRemainder: Int = 0,
)
