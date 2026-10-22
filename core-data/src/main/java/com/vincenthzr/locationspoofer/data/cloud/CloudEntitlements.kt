package com.vincenthzr.locationspoofer.data.cloud

/** 会员权益汇总 */
data class CloudEntitlements(
    val tier: String = "",
    val loginLimit: Int = 0,
    val softwareLimit: Int = 0,
    val softwareMaximum: Int = 0,
    val slots: List<CloudDeviceSlot> = emptyList()
)
