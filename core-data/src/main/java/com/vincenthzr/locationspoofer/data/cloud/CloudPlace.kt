package com.vincenthzr.locationspoofer.data.cloud

/** 搜索/收藏用的地点条目 */
data class CloudPlace(
    val title: String,
    val address: String,
    val lat: Double,
    val lng: Double,
    val source: String,
    val details: CloudPlaceDetails? = null
)
