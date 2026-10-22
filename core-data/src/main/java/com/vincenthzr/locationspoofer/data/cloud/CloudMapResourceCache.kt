package com.vincenthzr.locationspoofer.data.cloud

/**
 * 地图资源缓存接口。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudMapResourceCache.java
 */
interface CloudMapResourceCache {
    fun read(key: String, variant: String, generation: Long, cachedOnly: Boolean): CloudMapCacheEntry?
    fun remove(key: String, variant: String)
    fun write(key: String, variant: String, entry: CloudMapCacheEntry)
}
