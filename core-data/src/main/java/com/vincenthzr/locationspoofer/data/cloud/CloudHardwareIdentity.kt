package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云硬件身份快照。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudHardwareIdentity.java
 */
data class CloudHardwareIdentity(
    val signals: Map<String, String>? = null,
    val hardwareInfo: Map<String, String>? = null,
    val readStatus: Map<String, String>? = null,
    val collectionStatus: String? = null,
)
