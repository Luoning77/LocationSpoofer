package com.vincenthzr.locationspoofer.data.model

/**
 * 单条 WiFi 观测记录（用于环境数据贡献）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/SharedWifiObservation.java
 */
data class SharedWifiObservation(
    val bssid: String,
    val ssid: String,
    val frequency: Int,
    val level: Int,
    val capabilities: String,
)
