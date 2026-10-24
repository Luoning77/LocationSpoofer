package com.vincenthzr.locationspoofer.data.cloud

/**
 * 运行时许可绑定：用户-设备-指纹-会话四元组。
 * 恢复自 v3.0.16 APK（build 303f46d）defpackage/pk2.java（toString 标注 RuntimePermitBinding）
 */
data class RuntimePermitBinding(
    val userId: String,
    val deviceId: String,
    val publicKeyFingerprint: String,
    val sessionId: String,
)
