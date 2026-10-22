package com.vincenthzr.locationspoofer.data.sharing

import android.content.Context
import java.security.MessageDigest

/**
 * 本地 SharedPreferences 实现的分享授权开关存储（键做 SHA-256）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/LocalSharingConsentStore.java
 */
class LocalSharingConsentStore(context: Context) : SharingConsentStore {

    private val preferences =
        context.getSharedPreferences("radio_sharing_consent", Context.MODE_PRIVATE)

    /** SHA-256 hex（16 进制小写） */
    private fun key(raw: String): String =
        MessageDigest.getInstance("SHA-256")
            .digest(raw.toByteArray(Charsets.UTF_8))
            .joinToString("") { "%02x".format(it) }

    override fun enabled(key: String): Boolean = preferences.getBoolean(key(key), false)

    override fun setEnabled(key: String, value: Boolean) {
        if (!preferences.edit().putBoolean(key(key), value).commit()) {
            error("共享设置保存失败")
        }
    }
}
