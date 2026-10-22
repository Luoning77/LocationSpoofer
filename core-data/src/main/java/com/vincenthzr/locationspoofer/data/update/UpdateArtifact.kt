package com.vincenthzr.locationspoofer.data.update

/**
 * 更新安装包描述。
 * 恢复自 v3.0.16 APK（build 303f46d）data/update/UpdateArtifact.java
 */
data class UpdateArtifact(
    val id: String,
    val abi: String,
    val path: String,
    val sha256: String,
    val sizeBytes: Long,
    val scheme: String,
    val versionName: String,
    val versionCode: Int,
)
