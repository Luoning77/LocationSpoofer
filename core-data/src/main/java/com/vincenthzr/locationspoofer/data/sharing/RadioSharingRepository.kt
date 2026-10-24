package com.vincenthzr.locationspoofer.data.sharing

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState
import com.vincenthzr.locationspoofer.data.cloud.CloudException
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository
import kotlinx.coroutines.flow.StateFlow

class RadioSharingRepository(private val cloud: CloudRepository) : RadioSharingSource {

    override val accountState: StateFlow<CloudAccountState> = cloud.state

    override suspend fun status(key: String): SharingStatus {
        val json = cloud.authenticatedJson(path = "/v2/sharing/status", expectedAccountId = key)
        val countsJson = json.getJSONObject("counts")
        val counts = SharingCounts(
            wifi = countsJson.getLong("wifi"),
            bluetooth = countsJson.getLong("bluetooth"),
            cells = countsJson.getLong("cells"),
        )
        if (counts.wifi >= 0 && counts.bluetooth >= 0 && counts.cells >= 0) {
            return SharingStatus(
                enabled = json.getBoolean("enabled"),
                canContribute = json.getBoolean("canContribute"),
                counts = counts,
            )
        }
        throw CloudException("invalid_response")
    }

    override suspend fun upload(draft: RadioContributionDraft, key: String) {
        cloud.authenticatedJson(
            path = "/v2/sharing/contributions",
            body = draft.body(),
            expectedAccountId = key,
        )
    }

    override suspend fun withdraw(key: String) {
        cloud.authenticatedJson(
            path = "/v2/sharing/contributions",
            method = "DELETE",
            expectedAccountId = key,
        )
    }
}
