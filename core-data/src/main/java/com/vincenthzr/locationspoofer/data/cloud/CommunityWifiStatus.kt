package com.vincenthzr.locationspoofer.data.cloud

data class CommunityWifiStatus(
    val enabled: Boolean,
    val subscribed: Boolean,
    val canContribute: Boolean,
    val hotspots: Long,
    val historicalSources: List<WifiDatasetAttribution> = emptyList(),
)
