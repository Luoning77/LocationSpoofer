package com.vincenthzr.locationspoofer.data.cloud

import org.json.JSONObject

data class CloudClientInfo(
    val osName: String? = null,
    val osVersion: String? = null,
    val sdkInt: Int? = null,
    val manufacturer: String? = null,
    val brand: String? = null,
    val model: String? = null,
    val appVersionName: String? = null,
    val appVersionCode: Long? = null,
    val packageName: String? = null,
) {
    fun toJson(): JSONObject {
        val json = JSONObject()
        osName?.let { json.put("osName", it) }
        osVersion?.let { json.put("osVersion", it) }
        sdkInt?.let { json.put("sdkInt", it) }
        manufacturer?.let { json.put("manufacturer", it) }
        brand?.let { json.put("brand", it) }
        model?.let { json.put("model", it) }
        appVersionName?.let { json.put("appVersionName", it) }
        appVersionCode?.let { json.put("appVersionCode", it) }
        packageName?.let { json.put("packageName", it) }
        return json
    }
}