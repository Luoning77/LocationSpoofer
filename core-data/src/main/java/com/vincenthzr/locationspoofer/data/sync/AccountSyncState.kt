package com.vincenthzr.locationspoofer.data.sync

/**
 * 账号同步状态。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sync/AccountSyncState.java
 */
data class AccountSyncState(
    val syncing: Boolean = false,
    val lastSyncedAt: Long? = null,
    val error: String? = null,
    val accessDeniedCode: String? = null,
)
