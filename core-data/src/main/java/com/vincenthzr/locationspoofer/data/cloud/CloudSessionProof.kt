package com.vincenthzr.locationspoofer.data.cloud

import java.security.InvalidAlgorithmParameterException
import java.security.InvalidKeyException
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.NoSuchAlgorithmException
import java.security.Signature
import java.security.SignatureException
import java.security.spec.ECGenParameterSpec

/**
 * 请求级会话证明：服务端签发短期 proof 会话（最长 15 分钟），
 * 客户端对允许的端点用临时密钥签名，证明请求来自已验证设备。
 */
internal class CloudSessionProof(
    private val monotonic: () -> Long
) {
    @Volatile
    private var id: String = ""

    private var keys: KeyPair? = null

    private var token: String = ""

    private var until: Long = 0L

    /** 记录服务端签发；有效期 1..900 秒 */
    @Synchronized
    fun accept(id: String, seconds: Long, token: String) {
        if (!EncryptedCloudSessionStore.UUID_PATTERN.matches(id) || seconds !in 1..900_000) {
            throw CloudException("invalid_response")
        }
        this.id = id
        this.token = token
        this.until = seconds * 1_000_000L + monotonic()
    }

    /** 会话有效时对请求签名，返回 (proofId, signature)；无效返回 null */
    @Synchronized
    fun authorization(payload: String, token: String): Pair<String, String>? {
        if (!valid(token, 0L)) return null
        return id to sign(payload, token)
    }

    @Synchronized
    fun clear() {
        id = ""
        token = ""
        until = 0L
        keys = null
    }

    private fun ensureKeys(): KeyPair {
        keys?.let { return it }
        return try {
            KeyPairGenerator.getInstance("EC").apply {
                initialize(ECGenParameterSpec("secp256r1"))
            }.generateKeyPair().also { keys = it }
        } catch (e: NoSuchAlgorithmException) {
            throw IllegalStateException(e)
        }
    }

    fun getId(): String = id

    @Synchronized
    fun publicKey(): String = cloudDigestEncode(ensureKeys().public.encoded)

    @Synchronized
    @Throws(
        NoSuchAlgorithmException::class,
        SignatureException::class,
        InvalidKeyException::class,
        InvalidAlgorithmParameterException::class
    )
    fun sign(payload: String, token: String): String {
        if (!valid(token, 0L)) throw CloudException("session_proof_expired")
        val signature = Signature.getInstance("SHA256withECDSA")
        signature.initSign(ensureKeys().private)
        val material = "locationspoofer-session-proof-v1\n$id\n$payload"
        signature.update(material.toByteArray(Charsets.UTF_8))
        return cloudDigestEncode(signature.sign())
    }

    /** [graceMillis] 为允许的宽限毫秒数 */
    @Synchronized
    fun valid(token: String, graceMillis: Long = 30_000L): Boolean =
        id.isNotEmpty() && this.token == token && until - monotonic() > graceMillis * 1_000_000L

    companion object {
        /** 该 proof 会话是否覆盖给定 (method, path) */
        fun supports(method: String, path: String): Boolean {
            if (method == "GET" && path.startsWith("/v2/") &&
                !path.startsWith("/v2/auth/") && !path.startsWith("/v2/devices/")
            ) {
                return true
            }
            return method == "POST" && path in setOf(
                "/v2/runtime/permit",
                "/v2/runtime/run",
                "/v2/places/reverse",
                "/v2/routes/plan",
                "/v2/environment/wifi",
                "/v2/environment/cells",
                "/v2/wifi/nearby",
                "/v2/client/diagnostics"
            )
        }
    }
}
