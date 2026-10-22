package com.vincenthzr.locationspoofer.data.cloud

/**
 * 客户端环境信息（上报用）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudClientInfo.java
 */
data class CloudClientInfo(
    val osName: String? = null,
    val osVersion: String? = null,
    val sdkInt: Int? = null,
    val manufacturer: String? = null,
    val brand: String? = null,
    val model: String? = null,
    val appVersionName: String? = null,
    val appVersionCode: Long? = null,
    val packageName: String? = null,
)
