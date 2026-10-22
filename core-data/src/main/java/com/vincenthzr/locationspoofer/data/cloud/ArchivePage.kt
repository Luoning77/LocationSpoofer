package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云档案分页。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/ArchivePage.java
 */
data class ArchivePage(
    val items: List<CloudArchive>,
    val page: Int,
    val total: Int,
)
