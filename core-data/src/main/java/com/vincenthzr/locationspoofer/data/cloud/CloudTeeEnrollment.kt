package com.vincenthzr.locationspoofer.data.cloud

/**
 * TEE 注册请求。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudTeeEnrollment.java
 */
data class CloudTeeEnrollment(
    val requestId: String,
    val previousDeviceId: String,
    val previousFingerprint: String,
    val fingerprint: String,
)

/**
 * TEE 签名 profile 常量。
 * 恢复自 v3.0.16 APK data/cloud/CloudTeeEnrollmentKt.java
 */
const val TEE_SIGNING_PROFILE: String = "tee-v1"
