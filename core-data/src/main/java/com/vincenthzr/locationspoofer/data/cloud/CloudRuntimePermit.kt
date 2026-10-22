package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云运行时许可：签名载荷与签名值。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudRuntimePermit.java
 */
data class CloudRuntimePermit(
    val payload: String,
    val signature: String,
)
