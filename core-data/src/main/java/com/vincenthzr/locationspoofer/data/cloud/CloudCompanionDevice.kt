package com.vincenthzr.locationspoofer.data.cloud

/**
 * 伴生设备。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudCompanionDevice.java
 */
data class CloudCompanionDevice(
    val deviceId: String,
    val deviceName: String,
    val boundAt: Long,
    val activeUntil: Long? = null,
)
