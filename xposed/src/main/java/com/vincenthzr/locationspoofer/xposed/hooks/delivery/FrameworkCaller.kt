package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * 框架侧调用方身份（uid + 包名，均可空语义）。
 */
data class FrameworkCaller(
    val uid: Int,
    val pkg: String?,
)
