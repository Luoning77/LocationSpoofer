package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * 投递器安装适配接口。
 */
interface SystemDeliveryAdapter : AutoCloseable {
    fun install(): Boolean
}
