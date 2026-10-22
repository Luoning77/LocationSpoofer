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
 * 伴侣设备（companion）远程协助会话：本地临时密钥 + 服务端签发的租约 id。
 * 租约最长 120 秒，可按剩余毫秒数提前判定失效。
 */
internal class CloudCompanionRun(
    private val monotonic: () -> Long
) {
    private val keys: KeyPair = try {
        KeyPairGenerator.getInstance("EC").apply {
            initialize(ECGenParameterSpec("secp256r1"))
        }.generateKeyPair()
    } catch (e: NoSuchAlgorithmException) {
        throw IllegalStateException(e)
    }

    val publicKey: String = cloudDigestEncode(keys.public.encoded)

    @Volatile
    private var leaseId: String = ""

    @Volatile
    private var untilNanos: Long = 0L

    /** 记录服务端签发的租约；有效期 1..120 秒 */
    @Throws(CloudException::class)
    fun accept(lease: String, seconds: Long) {
        val acceptable = EncryptedCloudSessionStore.UUID_PATTERN.matches(lease) && seconds in 1..120_000
        if (!acceptable) throw CloudException("invalid_response")
        leaseId = lease
        untilNanos = seconds * 1_000_000L + monotonic()
    }

    fun clear() {
        leaseId = ""
        untilNanos = 0L
    }

    val currentLeaseId: String get() = leaseId

    /** [graceMillis] 为允许的宽限毫秒数 */
    fun valid(graceMillis: Long = 0L): Boolean =
        leaseId.isNotEmpty() && untilNanos - monotonic() > graceMillis * 1_000_000L

    @Throws(
        NoSuchAlgorithmException::class,
        SignatureException::class,
        InvalidKeyException::class,
        InvalidAlgorithmParameterException::class
    )
    fun sign(payload: String, unbound: Boolean): String {
        val signature = Signature.getInstance("SHA256withECDSA")
        signature.initSign(keys.private)
        val material = "locationspoofer-companion-run-v1\n" +
            (if (unbound) "" else leaseId) +
            "\n" + payload
        signature.update(material.toByteArray(Charsets.UTF_8))
        return cloudDigestEncode(signature.sign())
    }
}
