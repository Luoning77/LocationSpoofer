package com.vincenthzr.locationspoofer.data.cloud

/**
 * 诊断堆栈帧。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudDiagnosticFrame.java
 */
data class CloudDiagnosticFrame(
    val className: String,
    val methodName: String,
    val lineNumber: Int? = null,
) {
    internal fun toJson(): org.json.JSONObject =
        org.json.JSONObject().put("className", className).put("methodName", methodName).also { obj ->
            lineNumber?.let { obj.put("lineNumber", it) }
        }
}
