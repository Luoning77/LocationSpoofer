package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云运行时授权 = 许可 + 绑定。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudRuntimeAuthorization.java
 */
data class CloudRuntimeAuthorization(
    val permit: CloudRuntimePermit,
    val binding: CloudRuntimeBinding,
)
