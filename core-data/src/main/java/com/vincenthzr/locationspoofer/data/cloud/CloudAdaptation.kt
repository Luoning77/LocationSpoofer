package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云端下发的适配文档（markdown + 内容哈希校验）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudAdaptation.java
 */
data class CloudAdaptation(
    val markdown: String,
    val sha256: String,
)
