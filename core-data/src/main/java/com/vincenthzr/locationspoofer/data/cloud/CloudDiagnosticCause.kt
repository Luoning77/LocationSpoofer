package com.vincenthzr.locationspoofer.data.cloud

import org.json.JSONArray
import org.json.JSONObject

/**
 * 诊断异常原因链节点。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudDiagnosticCause.java
 */
data class CloudDiagnosticCause(
    val type: String,
    val frames: List<CloudDiagnosticFrame>,
) {
    internal fun toJson(): JSONObject =
        JSONObject()
            .put("type", type)
            .put("frames", JSONArray(frames.map { it.toJson() }))
}
