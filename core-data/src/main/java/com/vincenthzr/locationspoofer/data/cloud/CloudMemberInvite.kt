package com.vincenthzr.locationspoofer.data.cloud

/**
 * 成员邀请信息：邀请码与已邀请人数。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudMemberInvite.java
 */
data class CloudMemberInvite(
    val code: String,
    val invitedCount: Int,
)
