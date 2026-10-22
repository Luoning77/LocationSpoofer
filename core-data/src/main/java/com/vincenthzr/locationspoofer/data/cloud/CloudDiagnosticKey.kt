package com.vincenthzr.locationspoofer.data.cloud

import org.json.JSONObject

/**
 * 诊断密钥状态。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudDiagnosticKey.java
 */
data class CloudDiagnosticKey(
    val role: String,
    val status: String,
    val securityLevel: String? = null,
    val authenticationRequired: Boolean? = null,
    val authenticationType: Int? = null,
    val authenticationValiditySeconds: Int? = null,
    val invalidatedByBiometricEnrollment: Boolean? = null,
    val unlockedDeviceRequired: Boolean? = null,
    val inspectionException: String? = null,
) {
    internal fun toJson(): JSONObject {
        val json = JSONObject().put("role", role).put("status", status)
        securityLevel?.let { json.put("securityLevel", it) }
        authenticationRequired?.let { json.put("authenticationRequired", it) }
        authenticationType?.let { json.put("authenticationType", it) }
        authenticationValiditySeconds?.let { json.put("authenticationValiditySeconds", it) }
        invalidatedByBiometricEnrollment?.let { json.put("invalidatedByBiometricEnrollment", it) }
        unlockedDeviceRequired?.let { json.put("unlockedDeviceRequired", it) }
        inspectionException?.let { json.put("inspectionException", it) }
        return json
    }
}
