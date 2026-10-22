package com.vincenthzr.locationspoofer.data.cloud

import android.content.Context
import android.content.pm.PackageInfo
import android.os.Build
import java.util.Locale

/**
 * 收集客户端信息（全部字段尽力而为，异常吞掉返回 null）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/ClientInfoCollector.java
 */
class ClientInfoCollector(private val context: Context) {

    private fun normalized(value: String?, limit: Int): String? {
        val trimmed = value?.trim() ?: return null
        if (trimmed.isEmpty()) return null
        if (trimmed.any { Character.isISOControl(it) }) return null
        if (trimmed.lowercase(Locale.ROOT) in PLACEHOLDERS) return null
        return trimmed.take(limit)
    }

    private fun value(getter: () -> String?): String? =
        try {
            normalized(getter(), 100)
        } catch (_: Throwable) {
            null
        }

    fun collect(): CloudClientInfo {
        val packageName = try {
            context.packageName
        } catch (_: Throwable) {
            null
        }
        val packageInfo: PackageInfo? = packageName?.let {
            try {
                context.packageManager.getPackageInfo(it, 0)
            } catch (_: Throwable) {
                null
            }
        }
        val versionCode = packageInfo?.let {
            try {
                val code = if (Build.VERSION.SDK_INT >= 28) it.longVersionCode else it.versionCode.toLong()
                if (code >= 0) code else null
            } catch (_: Throwable) {
                null
            }
        }
        val sdkInt = try {
            val value = Build.VERSION.SDK_INT
            if (value in 1..1000) value else null
        } catch (_: Throwable) {
            null
        }
        return CloudClientInfo(
            osName = "Android",
            osVersion = value { Build.VERSION.RELEASE },
            sdkInt = sdkInt,
            manufacturer = value { Build.MANUFACTURER },
            brand = value { Build.BRAND },
            model = value { Build.MODEL },
            appVersionName = value { packageInfo?.versionName },
            appVersionCode = versionCode,
            packageName = normalized(packageName, 200),
        )
    }

    private companion object {
        val PLACEHOLDERS = setOf("unknown", "null", "none")
    }
}
