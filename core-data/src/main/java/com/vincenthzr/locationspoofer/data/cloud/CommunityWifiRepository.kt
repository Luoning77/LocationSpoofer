package com.vincenthzr.locationspoofer.data.cloud

import kotlinx.coroutines.flow.StateFlow
import org.json.JSONArray
import org.json.JSONObject
import kotlin.math.abs

class CommunityWifiRepository(cloudRepository: CloudRepository) {
    private val cloud: CloudRepository = cloudRepository
    val accountState: StateFlow<CloudAccountState> = cloudRepository.state

    suspend fun nearby(lat: Double, lng: Double): String? {
        if (abs(lat) > Double.MAX_VALUE || abs(lng) > Double.MAX_VALUE ||
            lat < -90.0 || lat > 90.0 || lng < -180.0 || lng > 180.0
        ) {
            throw CloudException("invalid_coordinates")
        }
        val body = JSONObject().put("lat", lat).put("lng", lng)
        val json = cloud.authenticatedJson("/v2/wifi/nearby", body = body)
        val result = json.getJSONArray("result")
        if (result.length() > 10) {
            throw CloudException("invalid_response")
        }
        return result.toString()
    }

    suspend fun status(): CommunityWifiStatus {
        val json = cloud.authenticatedJson("/v2/wifi/status")
        val sources = json.optJSONArray("historicalSources") ?: JSONArray()
        if (sources.length() > 10) {
            throw CloudException("invalid_response")
        }
        val attributions = ArrayList<WifiDatasetAttribution>(sources.length())
        for (i in 0 until sources.length()) {
            val o = sources.getJSONObject(i)
            val sourceId = o.getString("sourceId")
            val attribution = o.getString("attribution")
            val licenseUrl = o.getString("licenseUrl")
            attributions.add(WifiDatasetAttribution(sourceId, attribution, licenseUrl))
        }
        return CommunityWifiStatus(
            enabled = json.getBoolean("enabled"),
            subscribed = json.getBoolean("subscribed"),
            canContribute = json.getBoolean("canContribute"),
            hotspots = json.getLong("hotspots"),
            historicalSources = attributions,
        )
    }

    suspend fun upload(draft: WifiContributionDraft?, sessionId: String?): WifiContributionReceipt {
        val body = draftBody(draft!!)
        val json = cloud.authenticatedJson(
            path = "/v2/wifi/contributions",
            body = body,
            expectedSessionId = sessionId,
        )
        return WifiContributionReceipt(
            accepted = json.getInt("accepted"),
            ignored = json.getInt("ignored"),
            duplicate = json.getBoolean("duplicate"),
        )
    }

    suspend fun withdraw(sessionId: String?) {
        cloud.authenticatedJson(
            path = "/v2/wifi/contributions",
            method = "DELETE",
            expectedSessionId = sessionId,
        )
    }

    private fun draftBody(draft: WifiContributionDraft): JSONObject {
        val root = JSONObject()
            .put("batchId", draft.batchId)
            .put("consentVersion", "wifi-sharing-v1")
            .put("coordinateSystem", "WGS84")
            .put("lat", draft.lat)
            .put("lng", draft.lng)
            .put("accuracyMeters", draft.accuracyMeters)
            .put("observedAt", draft.observedAt)
            .put("mockLocation", false)
        val arr = JSONArray()
        for (obs in draft.observations) {
            arr.put(
                JSONObject()
                    .put("bssid", obs.bssid)
                    .put("ssid", obs.ssid)
                    .put("frequency", obs.frequency)
                    .put("level", obs.level)
                    .put("capabilities", obs.capabilities),
            )
        }
        return root.put("observations", arr)
    }
}
