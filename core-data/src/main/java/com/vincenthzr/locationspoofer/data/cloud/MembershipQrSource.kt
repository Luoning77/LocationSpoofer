package com.vincenthzr.locationspoofer.data.cloud

import java.io.ByteArrayOutputStream
import java.util.Locale
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request

class MembershipQrSource(private val http: OkHttpClient = Companion.defaultClient()) {
    init {
        require(!http.followRedirects)
        require(!http.retryOnConnectionFailure)
    }

    suspend fun read(url: String): ByteArray = withContext(Dispatchers.IO) {
        var current = MembershipPaymentUrls.validate(url)
        var redirects = 0
        while (redirects < 4) {
            val request = Request.Builder()
                .url(current)
                .header("Cache-Control", "no-store")
                .build()
            http.newCall(request).execute().use { response ->
                if (response.code !in REDIRECT_CODES) {
                    val body = response.body ?: throw CloudException("payment_qr_unavailable")
                    val contentType = response.header("Content-Type")
                        ?.substringBefore(';')
                        ?.trim()
                        ?.lowercase(Locale.ROOT)
                        .orEmpty()
                    if (!response.isSuccessful ||
                        contentType !in IMAGE_TYPES ||
                        body.contentLength() > MAX_BYTES
                    ) {
                        throw CloudException("payment_qr_unavailable")
                    }
                    val out = ByteArrayOutputStream()
                    val buffer = ByteArray(8192)
                    body.byteStream().use { input ->
                        while (out.size() <= MAX_BYTES) {
                            val n = input.read(buffer, 0, minOf(8192, MAX_BYTES + 1 - out.size()))
                            if (n < 0) break
                            out.write(buffer, 0, n)
                        }
                    }
                    val bytes = out.toByteArray()
                    if (bytes.isEmpty() || bytes.size > MAX_BYTES) {
                        throw CloudException("payment_qr_unavailable")
                    }
                    return@withContext bytes
                }
                if (redirects == MAX_REDIRECTS) {
                    throw CloudException("payment_qr_unavailable")
                }
                val location = response.header("Location")
                    ?: throw CloudException("payment_qr_unavailable")
                val resolved = try {
                    response.request.url.resolve(location)
                } catch (_: IllegalArgumentException) {
                    null
                } ?: throw CloudException("payment_qr_unavailable")
                current = MembershipPaymentUrls.validate(resolved.toString())
            }
            redirects++
        }
        throw CloudException("payment_qr_unavailable")
    }

    companion object {
        private const val MAX_BYTES = 524288
        private const val MAX_REDIRECTS = 3
        private val REDIRECT_CODES = setOf(301, 302, 303, 307, 308)
        private val IMAGE_TYPES = setOf("image/png", "image/jpeg", "image/gif", "image/webp")

        private fun defaultClient(): OkHttpClient =
            OkHttpClient.Builder()
                .dns(Ipv4PreferredDns())
                .retryOnConnectionFailure(false)
                .followRedirects(false)
                .connectTimeout(5L, TimeUnit.SECONDS)
                .readTimeout(8L, TimeUnit.SECONDS)
                .callTimeout(12L, TimeUnit.SECONDS)
                .build()
    }
}
