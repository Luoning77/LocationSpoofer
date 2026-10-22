package com.vincenthzr.locationspoofer.data.cloud

import java.net.URI

/**
 * 会员支付链接校验：只接受两个已知支付网关的 https 链接，
 * 其余一律按 invalid_response 拒绝（防止服务端返回钓鱼跳转）。
 */
internal object MembershipPaymentUrls {
    private val ALLOWED_HOSTS = setOf("api.xunhupay.com", "api.dpweixin.com")

    @Throws(CloudException::class)
    fun validate(url: String): String {
        val uri = runCatching { URI(url) }.getOrNull()
        if (uri == null) throw CloudException("invalid_response")
        val acceptable = url.length <= 4_096 &&
            uri.scheme == "https" &&
            uri.host in ALLOWED_HOSTS &&
            uri.userInfo == null &&
            (uri.port == -1 || uri.port == 443) &&
            uri.fragment == null
        if (!acceptable) throw CloudException("invalid_response")
        return url
    }
}
