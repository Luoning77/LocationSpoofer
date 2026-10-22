package com.vincenthzr.locationspoofer.data.cloud

/**
 * 地图资源缓存条目：原始响应字节 + HTTP 状态码 + 是否需要重验。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudMapCacheEntry.java
 */
data class CloudMapCacheEntry(
    val bytes: ByteArray,
    val code: Int,
    val needsRevalidation: Boolean = false,
) {
    override fun equals(other: Any?): Boolean =
        this === other || (other is CloudMapCacheEntry && bytes.contentEquals(other.bytes) && code == other.code && needsRevalidation == other.needsRevalidation)

    override fun hashCode(): Int = ((bytes.contentHashCode() * 31) + code) * 31 + needsRevalidation.hashCode()
}
