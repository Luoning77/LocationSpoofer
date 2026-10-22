package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云账号状态机快照。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudAccountState.java
 * 无参构造默认：hasSession=false, account=null, validated=false, checking=false,
 * deviceId="", publicKeyFingerprint="", failureCode=null, initializing=false, passwordAuthenticated=false
 */
data class CloudAccountState(
    val hasSession: Boolean = false,
    val account: CloudAccount? = null,
    val validated: Boolean = false,
    val checking: Boolean = false,
    val deviceId: String = "",
    val publicKeyFingerprint: String = "",
    val failureCode: String? = null,
    val initializing: Boolean = false,
    val passwordAuthenticated: Boolean = false,
)
