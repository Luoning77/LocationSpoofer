package com.vincenthzr.locationspoofer.data.cloud

/**
 * WiFi 贡献回执。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/WifiContributionReceipt.java
 */
data class WifiContributionReceipt(
    val accepted: Int,
    val ignored: Int,
    val duplicate: Boolean,
)
