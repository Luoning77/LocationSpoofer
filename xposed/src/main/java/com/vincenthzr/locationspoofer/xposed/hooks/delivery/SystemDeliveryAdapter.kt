package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * 投递器安装适配接口。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/delivery/SystemDeliveryAdapter.java
 */
interface SystemDeliveryAdapter : AutoCloseable {
    fun install(): Boolean
}
