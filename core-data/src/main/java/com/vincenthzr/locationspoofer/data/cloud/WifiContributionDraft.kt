package com.vincenthzr.locationspoofer.data.cloud

import com.vincenthzr.locationspoofer.data.model.SharedWifiObservation

/**
 * WiFi 贡献上报草稿。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/WifiContributionDraft.java
 */
data class WifiContributionDraft(
    val batchId: String,
    val lat: Double,
    val lng: Double,
    val accuracyMeters: Double,
    val observedAt: Long,
    val observations: List<SharedWifiObservation>,
)
