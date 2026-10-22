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
 * 密码取回会话的设备端凭据：本地生成 secp256r1 临时密钥对，
 * 服务端签发一次性 ticket（最长 10 分钟）后用它证明设备身份。
 */
internal class CloudPasswordAccess(
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

    private var ticket: String = ""
    private var until: Long = 0L

    /** 记录服务端签发的 ticket；有效期 1..600 秒 */
    fun accept(ticket: String, seconds: Long) {
        val acceptable = TICKET_PATTERN.matches(ticket) && seconds in 1..600_000
        if (!acceptable) throw CloudException("invalid_response")
        this.ticket = ticket
        this.until = seconds * 1_000_000L + monotonic()
    }

    /** 签发设备证明：绑定 ticket 与恢复口令 */
    fun deviceProof(recovery: String): String =
        sign("locationspoofer-password-recovery-v1\n$ticket\n$recovery")

    @Throws(
        NoSuchAlgorithmException::class,
        SignatureException::class,
        InvalidKeyException::class,
        InvalidAlgorithmParameterException::class
    )
    fun sign(payload: String): String {
        val signature = Signature.getInstance("SHA256withECDSA")
        signature.initSign(keys.private)
        signature.update(payload.toByteArray(Charsets.UTF_8))
        return cloudDigestEncode(signature.sign())
    }

    val currentTicket: String get() = ticket

    fun valid(): Boolean = ticket.isNotEmpty() && until > monotonic()

    companion object {
        private val TICKET_PATTERN = Regex("[A-Za-z0-9_-]{43}")
    }
}
