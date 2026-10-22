package com.vincenthzr.locationspoofer.data.cloud

/** 一个设备在会员配额体系中的槽位 */
data class CloudDeviceSlot(
    val id: String,
    val kind: String,
    val deviceId: String,
    val name: String,
    val active: Boolean,
    val purchasedUntil: Long? = null,
    val limit: Int,
    val used: Int,
    val extraRemaining: Int,
    val resetsAt: Long,
    val eligible: Boolean = true,
    val origin: String = "hardware",
    val position: Int = 0
)
