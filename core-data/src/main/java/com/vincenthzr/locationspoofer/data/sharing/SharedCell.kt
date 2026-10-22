package com.vincenthzr.locationspoofer.data.sharing

/**
 * 蜂窝小区分享观测。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sharing/SharedCell.java
 */
data class SharedCell(
    val radio: String,
    val mcc: Int,
    val mnc: Int,
    val area: Long,
    val cell: Long,
    val signalDbm: Int,
)
