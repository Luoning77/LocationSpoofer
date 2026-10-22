package com.vincenthzr.locationspoofer.data.cloud

/** 逆地理编码结果 */
data class CloudAddress(
    val address: String,
    val country: String,
    val province: String,
    val city: String,
    val district: String,
    val road: String,
    val source: String,
    val lat: Double?,
    val lng: Double?,
    val details: CloudPlaceDetails? = null
)
