package com.vincenthzr.locationspoofer.data.cloud

/**
 * 运行时许可信封：payload + signature。
 * 恢复自 v3.0.16 APK（build 303f46d）defpackage/rk2.java（toString 标注 RuntimePermitEnvelope）
 */
data class RuntimePermitEnvelope(
    val payload: String,
    val signature: String,
)
