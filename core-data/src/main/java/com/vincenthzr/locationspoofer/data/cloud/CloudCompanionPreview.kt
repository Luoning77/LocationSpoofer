package com.vincenthzr.locationspoofer.data.cloud

/** 伴侣设备绑定确认前的预览信息 */
data class CloudCompanionPreview(
    val requestId: String,
    val deviceName: String,
    val fingerprint: String
)
