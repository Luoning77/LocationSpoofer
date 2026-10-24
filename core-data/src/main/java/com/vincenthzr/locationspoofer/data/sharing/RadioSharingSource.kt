package com.vincenthzr.locationspoofer.data.sharing

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState
import kotlinx.coroutines.flow.StateFlow

interface RadioSharingSource {
    val accountState: StateFlow<CloudAccountState>
    suspend fun status(key: String): SharingStatus
    suspend fun upload(draft: RadioContributionDraft, key: String)
    suspend fun withdraw(key: String)
}
