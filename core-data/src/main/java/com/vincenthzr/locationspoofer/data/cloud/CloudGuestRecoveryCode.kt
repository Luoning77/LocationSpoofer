package com.vincenthzr.locationspoofer.data.cloud

/**
 * 访客恢复码。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudGuestRecoveryCode.java
 * 注意：toString 刻意隐藏码值（原版行为："credentials=已隐藏"），防止日志泄漏。
 */
data class CloudGuestRecoveryCode(
    val code: String,
    val createdAt: Long,
) {
    override fun toString(): String = "CloudGuestRecoveryCode(credentials=已隐藏)"
}
