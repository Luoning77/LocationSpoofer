package com.vincenthzr.locationspoofer.data.sharing

/**
 * 无线电分享授权开关存储接口。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/SharingConsentStore.java
 */
interface SharingConsentStore {
    fun enabled(key: String): Boolean
    fun setEnabled(key: String, value: Boolean)
}
