package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云服务异常。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudException.java
 */
class CloudException(
    val code: String,
    val httpStatus: Int? = null,
    val operation: String? = null,
    val diagnosticReason: String? = null,
) : Exception(code)
