package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云响应错误码解析：优先使用响应体内的合法错误码字符串，
 * 否则按 HTTP 状态码映射到固定错误码。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudResponseErrors.java
 */
object CloudResponseErrors {

    private val CODE_PATTERN = Regex("[a-z][a-z0-9_]{0,63}")

    fun code(httpStatus: Int, bodyCode: String?): String {
        if (bodyCode != null && bodyCode != "null" && CODE_PATTERN.matches(bodyCode)) {
            return bodyCode
        }
        return when (httpStatus) {
            401 -> "invalid_session"
            403 -> "access_denied"
            426 -> "client_upgrade_required"
            429 -> "rate_limited"
            500 -> "service_unavailable"
            502, 503, 504 -> "service_unavailable"
            else -> "invalid_response"
        }
    }
}
