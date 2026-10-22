package com.vincenthzr.locationspoofer.xposed.hooks.delivery

/**
 * 框架侧调用方身份（uid + 包名，均可空语义）。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/delivery/FrameworkCaller.java
 */
data class FrameworkCaller(
    val uid: Int,
    val pkg: String?,
)
