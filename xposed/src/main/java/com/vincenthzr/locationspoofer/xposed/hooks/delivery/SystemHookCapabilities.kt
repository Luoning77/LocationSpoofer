package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * 系统 hook 能力集（定位投递 / BLE 投递 / 定位可用性）。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/delivery/SystemHookCapabilities.java
 */
data class SystemHookCapabilities(
    val locationDelivery: Boolean = false,
    val bleDelivery: Boolean = false,
    val locationAvailability: Boolean = false,
)
