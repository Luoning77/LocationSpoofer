package com.vincenthzr.locationspoofer.data.cloud

import java.security.MessageDigest
import java.util.Base64

/**
 * 云协议模型顶层函数。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudModelsKt.java
 */
const val SOFTWARE_SIGNING_PROFILE: String = "software-v1"

/** SHA-256 后 URL-safe Base64（无 padding） */
fun cloudBodyDigest(body: ByteArray): String =
    cloudDigestEncode(MessageDigest.getInstance("SHA-256").digest(body))

/**
 * 请求规范化串：固定前缀 + 七段参数，以 \n 连接。
 */
fun cloudCanonical(
    method: String,
    path: String,
    query: String,
    bodyDigest: String,
    timestamp: String,
    nonce: String,
    extra: String,
): String =
    listOf("locationspoofer-client-v2", method, path, query, bodyDigest, timestamp, nonce, extra)
        .joinToString("\n")

fun cloudDigestEncode(bytes: ByteArray): String =
    Base64.getUrlEncoder().withoutPadding().encodeToString(bytes)
