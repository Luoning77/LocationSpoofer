package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云账号令牌（访问令牌 + 刷新令牌及各自过期时间戳）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudTokens.java
 */
data class CloudTokens(
    val accessToken: String,
    val refreshToken: String,
    val accessExpiresAt: Long = 0L,
    val refreshExpiresAt: Long = 0L,
)
