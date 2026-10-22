package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云档案条目：设备档案备份的元信息与各类记录计数。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudArchive.java
 */
data class CloudArchive(
    val id: String,
    val revision: Long,
    val deviceId: String,
    val createdAt: Long,
    val expiresAt: Long,
    val reason: String,
    val counts: Map<String, Int>,
)
