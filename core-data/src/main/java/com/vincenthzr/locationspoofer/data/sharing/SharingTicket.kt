package com.vincenthzr.locationspoofer.data.sharing

/**
 * 分享票据：身份 + 会话 + 代次。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/SharingTicket.java
 */
data class SharingTicket(
    val identity: String,
    val session: String,
    val generation: Long,
)
