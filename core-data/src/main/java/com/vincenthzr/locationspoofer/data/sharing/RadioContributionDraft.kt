package com.vincenthzr.locationspoofer.data.sharing

import com.vincenthzr.locationspoofer.data.model.SharedWifiObservation

/**
 * 无线电分享贡献草稿。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/RadioContributionDraft.java
 */
data class RadioContributionDraft(
    val batchId: String,
    val lat: Double,
    val lng: Double,
    val accuracyMeters: Double,
    val observedAt: Long,
    val wifi: List<SharedWifiObservation>,
    val bluetooth: List<SharedBluetooth>,
    val cells: List<SharedCell>,
)
