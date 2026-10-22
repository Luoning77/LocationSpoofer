package com.vincenthzr.locationspoofer.data.sharing

/**
 * 蓝牙分享观测。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/SharedBluetooth.java
 */
data class SharedBluetooth(
    val address: String,
    val name: String,
    val rssi: Int,
)
