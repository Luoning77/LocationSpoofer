package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * 系统进程 hook 安装结果（locationDelivery / bleDelivery / locationAvailability）。
 */
data class SystemHookCapabilities(
    val locationDelivery: Boolean = false,
    val bleDelivery: Boolean = false,
    val locationAvailability: Boolean = false,
)
