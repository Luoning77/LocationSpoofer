package com.vincenthzr.locationspoofer.data.cloud

/**
 * 客户端升级制品。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudClientArtifact.java
 */
data class CloudClientArtifact(
    val id: String,
    val abi: String,
    val path: String,
    val sha256: String,
    val sizeBytes: Long,
)
