package com.vincenthzr.locationspoofer.data.cloud

import org.json.JSONObject

/**
 * 云诊断记录（19 字段，可空项序列化时省略）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudDiagnostic.java
 */
data class CloudDiagnostic(
    val id: String,
    val operation: String,
    val code: String,
    val category: String,
    val firstSeenAt: Long,
    val lastSeenAt: Long,
    val count: Int,
    val sdkInt: Int? = null,
    val osVersion: String? = null,
    val appVersionName: String? = null,
    val appVersionCode: Long? = null,
    val variant: String? = null,
    val abi: String? = null,
    val keystoreCode: Int? = null,
    val transient: Boolean? = null,
    val requiresUnlock: Boolean? = null,
    val httpStatus: Int? = null,
    val osErrorCode: Int? = null,
    val details: CloudDiagnosticDetails? = null,
) {
    internal fun toJson(): JSONObject {
        val json = JSONObject()
            .put("id", id)
            .put("operation", operation)
            .put("code", code)
            .put("category", category)
            .put("firstSeenAt", firstSeenAt)
            .put("lastSeenAt", lastSeenAt)
            .put("count", count)
            .put("variant", variant)
            .put("abi", abi)
        sdkInt?.let { json.put("sdkInt", it) }
        osVersion?.let { json.put("osVersion", it) }
        appVersionName?.let { json.put("appVersionName", it) }
        appVersionCode?.let { json.put("appVersionCode", it) }
        keystoreCode?.let { json.put("keystoreCode", it) }
        transient?.let { json.put("transient", it) }
        requiresUnlock?.let { json.put("requiresUnlock", it) }
        httpStatus?.let { json.put("httpStatus", it) }
        osErrorCode?.let { json.put("osErrorCode", it) }
        details?.let { json.put("details", it.toJson()) }
        return json
    }
}
