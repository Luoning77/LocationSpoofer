package com.vincenthzr.locationspoofer.data.model

/**
 * 单条 WiFi 观测记录（用于环境数据贡献）。
 */
data class SharedWifiObservation(
    val bssid: String,
    val ssid: String,
    val frequency: Int,
    val level: Int,
    val capabilities: String,
)
