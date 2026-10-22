package com.vincenthzr.locationspoofer.data.update

import com.vincenthzr.locationspoofer.data.model.GithubRelease

/**
 * 账号更新目录：GitHub releases + beta 开关。
 * 恢复自 v3.0.16 APK（build 303f46d）data/update/AccountUpdateCatalog.java
 */
data class AccountUpdateCatalog(
    val betaEnabled: Boolean,
    val releases: List<GithubRelease>,
)
