package com.vincenthzr.locationspoofer.data.cloud

/**
 * 软件设备身份：由 android_id 派生哈希信号（参与云账号设备指纹）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/SoftwareDeviceIdentity.java
 *
 * 逻辑：android_id 为 1..16 位 hex、非全 0、且不是已知测试值
 * "9774d56d682e549c"（Android 已知损坏 android_id）时，
 * 以 "realm\nandroid_id\n<补零至16位的id>" 计算 SHA-256 信号；
 * 否则记录 software_identity_unavailable 并返回 null。
 */
object SoftwareDeviceIdentity {

    private const val KNOWN_BROKEN_ANDROID_ID = "9774d56d682e549c"
    private val HEX_1_16 = Regex("[a-f0-9]{1,16}")

    @Throws(CloudException::class)
    fun digest(realm: String, androidId: String?): String? {
        val normalized = androidId?.trim()?.lowercase() ?: ""
        val matches = normalized.isNotEmpty() && HEX_1_16.matches(normalized)
        if (matches) {
            for (c in normalized) {
                if (c != '0') {
                    if (normalized == KNOWN_BROKEN_ANDROID_ID) break
                    return DeviceSignalCollector.hashSignal(
                        realm = realm,
                        name = "android_id",
                        value = normalized.padStart(16, '0'),
                    )
                }
            }
        }
        throw CloudException(code = "software_identity_unavailable")
    }
}
