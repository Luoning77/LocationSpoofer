package com.vincenthzr.locationspoofer.data.cloud

/**
 * 伴生配对请求。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudCompanionPairing.java
 */
data class CloudCompanionPairing(
    val requestId: String,
    val code: String,
    val expiresAt: Long,
)
