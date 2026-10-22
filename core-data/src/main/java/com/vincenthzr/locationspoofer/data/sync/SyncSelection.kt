package com.vincenthzr.locationspoofer.data.sync

/**
 * 同步选择：开关 + 分类集合。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sync/SyncSelection.java
 */
data class SyncSelection(
    val enabled: Boolean = false,
    val categories: Set<SyncCategory> = emptySet(),
)
