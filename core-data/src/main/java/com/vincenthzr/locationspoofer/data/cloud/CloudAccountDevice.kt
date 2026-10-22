package com.vincenthzr.locationspoofer.data.cloud

/** 账号下的一台设备 */
data class CloudAccountDevice(
    val id: String,
    val name: String,
    val boundAt: Long,
    val lastSeenAt: Long? = null,
    val current: Boolean,
    val deviceRole: String,
    val searchLimit: Int,
    val searchUsed: Int,
    val quotaScope: String,
    val active: Boolean = true,
    val resetsAt: Long? = null,
    val extraQuotaRemaining: Int = 0,
    val appVersion: String? = null
)
