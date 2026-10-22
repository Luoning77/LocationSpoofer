package com.vincenthzr.locationspoofer.xposed.hooks

/**
 * 单颗卫星的伪造数据（GNSS 状态回放用）。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/SatelliteData.java
 */
data class SatelliteData(
    val svid: Int,
    val type: Int,
    val elevation: Float,
    val azimuth: Float,
    val cn0: Float,
    val usedInFix: Boolean,
)
