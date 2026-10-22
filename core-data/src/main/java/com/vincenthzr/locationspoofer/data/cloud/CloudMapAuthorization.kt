package com.vincenthzr.locationspoofer.data.cloud

import okhttp3.Request

/**
 * 地图资源授权：代次、访问令牌、运行时绑定与已签名的地图请求。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudMapAuthorization.java
 */
data class CloudMapAuthorization(
    val generation: Long,
    val accessToken: String,
    val binding: CloudRuntimeBinding,
    val signedRequest: Request,
    val cachedOnly: Boolean = false,
    val subscriberOnly: Boolean = false,
)
