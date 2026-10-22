package com.vincenthzr.locationspoofer.data.sync

/**
 * 同步分类：云端对象 id 前缀。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sync/SyncCategory.java
 */
enum class SyncCategory(
    val id: String,
    val prefix: String,
) {
    SETTINGS("settings", "setting:"),
    FAVORITES("favorites", "favorite:"),
    ROUTES("routes", "route:"),
    COLLECTED_POINTS("collected_points", "location:"),
    COLLECTED_ROUTES("collected_routes", "collection:"),
}
