package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云端设备会话列表项。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudDeviceSession.java
 */
data class CloudDeviceSession(
    val id: String,
    val name: String,
    val createdAt: Long,
    val lastSeenAt: Long,
    val current: Boolean,
)
