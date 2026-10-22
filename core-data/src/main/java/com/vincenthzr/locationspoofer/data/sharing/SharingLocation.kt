package com.vincenthzr.locationspoofer.data.sharing

/**
 * 分享贡献位置。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/SharingLocation.java
 */
data class SharingLocation(
    val lat: Double,
    val lng: Double,
    val accuracy: Float,
    val time: Long,
    val elapsedNanos: Long,
    val mock: Boolean,
)
