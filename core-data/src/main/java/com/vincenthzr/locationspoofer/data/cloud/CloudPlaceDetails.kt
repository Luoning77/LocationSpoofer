package com.vincenthzr.locationspoofer.data.cloud

/**
 * 地点详情（Nominatim 风格）。
 * 三个 Map 分开存：结构化地址段、显示名拆分、OSM 原始 tag。
 */
data class CloudPlaceDetails(
    val osmType: String? = null,
    val osmId: Long? = null,
    val category: String = "",
    val type: String = "",
    val addressType: String = "",
    val placeRank: Int? = null,
    val addressParts: Map<String, String> = emptyMap(),
    val names: Map<String, String> = emptyMap(),
    val extraTags: Map<String, String> = emptyMap(),
    val boundingBox: List<Double> = emptyList(),
    val attribution: String = "",
    val attributionUrl: String = ""
)
