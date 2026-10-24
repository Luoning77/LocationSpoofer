package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云运行时绑定：用户-会话-设备三元组 + 公钥指纹。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudRuntimeBinding.java
 */
data class CloudRuntimeBinding(
    val userId: String,
    val deviceId: String,
    val publicKeyFingerprint: String,
    val sessionId: String,
)
