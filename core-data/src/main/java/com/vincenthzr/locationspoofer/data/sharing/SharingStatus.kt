package com.vincenthzr.locationspoofer.data.sharing

/**
 * 分享状态。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/SharingStatus.java
 */
data class SharingStatus(
    val enabled: Boolean,
    val canContribute: Boolean,
    val counts: SharingCounts,
)
