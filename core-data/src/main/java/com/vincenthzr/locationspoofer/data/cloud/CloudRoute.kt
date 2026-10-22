package com.vincenthzr.locationspoofer.data.cloud

import com.vincenthzr.locationspoofer.data.model.RoutePoint

/**
 * 云端路线：路点序列与来源标识。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudRoute.java
 */
data class CloudRoute(
    val points: List<RoutePoint>,
    val source: String,
)
