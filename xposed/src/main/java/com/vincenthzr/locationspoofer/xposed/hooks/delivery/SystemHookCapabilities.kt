package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * 系统进程 hook 安装结果（locationDelivery / bleDelivery / locationAvailability）。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/delivery/SystemHookCapabilities.java（86 行）
 */
data class SystemHookCapabilities(
    val locationDelivery: Boolean = false,
    val bleDelivery: Boolean = false,
    val locationAvailability: Boolean = false,
)
