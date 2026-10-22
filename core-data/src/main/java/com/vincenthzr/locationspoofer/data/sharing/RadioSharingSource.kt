package com.vincenthzr.locationspoofer.data.sharing

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState
import kotlinx.coroutines.flow.StateFlow

/**
 * 无线电分享数据源接口。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/RadioSharingSource.java
 */
interface RadioSharingSource {
    val accountState: StateFlow<CloudAccountState>
    suspend fun status(key: String): SharingStatus
    suspend fun upload(draft: RadioContributionDraft, key: String): SharingStatus
    suspend fun withdraw(key: String): SharingStatus
}
