package com.vincenthzr.locationspoofer.data.cloud

import android.os.SystemClock
import java.security.AlgorithmParameters
import java.security.KeyFactory
import java.security.MessageDigest
import java.security.Signature
import java.security.interfaces.ECPublicKey
import java.security.spec.ECGenParameterSpec
import java.security.spec.ECParameterSpec
import java.security.spec.X509EncodedKeySpec
import java.util.Base64
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import org.json.JSONArray
import org.json.JSONObject

open class RuntimePermitVerifier(
    private val monotonicClock: () -> Long = { SystemClock.elapsedRealtime() },
    private val wallClock: () -> Long = { System.currentTimeMillis() },
) {
    private data class Accepted(val claims: RuntimePermitClaims, val deadline: Long)

    private val keyIdToSpki = KEY_IDS
    private val acceptedByPayloadHash = LinkedHashMap<String, Accepted>()
    private val stoppedSessionIds = LinkedHashSet<String>()
    private var current: Accepted? = null
    private var maxIssuedAt = Long.MIN_VALUE
    private var maxStoppedIssuedAt = Long.MIN_VALUE
    private var activeBinding: RuntimePermitBinding? = null
    private var lastWall = Long.MIN_VALUE
    private var lastMono = Long.MIN_VALUE
    private var clockSkewed = false
    private val urlDecoder = Base64.getUrlDecoder()
    private val urlEncoder = Base64.getUrlEncoder().withoutPadding()

    open fun verify(
        envelope: RuntimePermitEnvelope,
        binding: RuntimePermitBinding,
        requiredCapabilities: Set<String>,
    ): RuntimePermitClaims = synchronized(this) {
        val claims = parseEnvelope(envelope)
        if (claims.binding != binding || !claims.capabilities.containsAll(requiredCapabilities)) {
            throw IllegalArgumentException("运行许可身份或权限不匹配")
        }
        val (wall, mono) = clocks()
        if (claims.issuedAt > wall + 60_000L || claims.expiresAt <= wall) {
            throw IllegalArgumentException("运行许可已过期")
        }
        if (claims.issuedAt < maxIssuedAt || claims.binding.sessionId in stoppedSessionIds) {
            throw IllegalArgumentException("运行许可回放")
        }
        if (claims.issuedAt <= maxStoppedIssuedAt) {
            throw IllegalArgumentException("已停止的许可不能再次运行")
        }
        val prev = activeBinding
        if (prev != null && prev != claims.binding && prev.sessionId == claims.binding.sessionId) {
            throw IllegalArgumentException("同一会话不能改变设备绑定")
        }
        val payloadHash = sha256Hex(envelope.payload)
        val existing = acceptedByPayloadHash[payloadHash]
        val accepted = existing ?: Accepted(
            claims = claims,
            deadline = minOf(
                claims.expiresAt - wall,
                claims.expiresAt - claims.issuedAt,
            ) + mono,
        )
        if (mono >= accepted.deadline) {
            throw IllegalArgumentException("运行许可单调有效期已结束")
        }
        if (prev != null && prev != claims.binding) {
            stoppedSessionIds.add(prev.sessionId)
        }
        acceptedByPayloadHash[payloadHash] = accepted
        current = accepted
        maxIssuedAt = claims.issuedAt
        activeBinding = claims.binding
        while (acceptedByPayloadHash.size > 256) {
            acceptedByPayloadHash.remove(acceptedByPayloadHash.keys.first())
        }
        while (stoppedSessionIds.size > 256) {
            stoppedSessionIds.remove(stoppedSessionIds.first())
        }
        claims
    }

    open fun markStopped() {
        synchronized(this) {
            current?.let { maxStoppedIssuedAt = maxOf(maxStoppedIssuedAt, it.claims.issuedAt) }
            current = null
        }
    }

    open fun isValid(
        binding: RuntimePermitBinding?,
        requiredCapabilities: Set<String>,
    ): Boolean = synchronized(this) {
        try {
            val accepted = current ?: return false
            val (wall, mono) = clocks()
            if (mono >= accepted.deadline) return false
            if (wall >= accepted.claims.expiresAt) return false
            if (binding != null && binding != accepted.claims.binding) return false
            accepted.claims.capabilities.containsAll(requiredCapabilities)
        } catch (_: Throwable) {
            false
        }
    }

    open fun remainingMillis(
        binding: RuntimePermitBinding?,
        requiredCapabilities: Set<String>,
    ): Long = synchronized(this) {
        try {
            val accepted = current ?: return 0L
            val (wall, mono) = clocks()
            if (binding != null && binding != accepted.claims.binding) return 0L
            if (!accepted.claims.capabilities.containsAll(requiredCapabilities)) return 0L
            (minOf(accepted.deadline - mono, accepted.claims.expiresAt - wall)).coerceAtLeast(0L)
        } catch (_: Throwable) {
            0L
        }
    }

    open fun nowMillis(): Long = wallClock()

    open fun nowMonotonicMillis(): Long = monotonicClock()

    private fun clocks(): Pair<Long, Long> {
        val wall = wallClock()
        val mono = monotonicClock()
        if ((lastWall != Long.MIN_VALUE && wall < lastWall - 1_000L) || mono < lastMono) {
            clockSkewed = true
        }
        if (clockSkewed) throw IllegalArgumentException("运行许可时钟回拨")
        lastWall = maxOf(lastWall, wall)
        lastMono = maxOf(lastMono, mono)
        return wall to mono
    }

    private fun parseEnvelope(envelope: RuntimePermitEnvelope): RuntimePermitClaims {
        val payload = envelope.payload
        val signature = envelope.signature
        require(payload.length in 1..16_384) { "Failed requirement." }
        require(signature.length in 1..107) { "Failed requirement." }
        val payloadBytes = decodeUrlBase64(12_288, payload)
        val payloadText = String(payloadBytes, Charsets.UTF_8)
        require(payloadText.toByteArray(Charsets.UTF_8).contentEquals(payloadBytes)) {
            "许可必须是有效 UTF-8"
        }
        val json = JSONObject(payloadText)
        val keys = json.keys().asSequence().toSet()
        require(keys == setOf(
            "keyId", "userId", "deviceId", "publicKeyFingerprint", "sessionId",
            "capabilities", "issuedAt", "expiresAt",
        )) { "Failed requirement." }
        val keyId = json.getString("keyId")
        val spki = keyIdToSpki[keyId] ?: throw IllegalStateException("未知许可签名密钥")
        val publicKey = decodeEcPublicKey(spki)
        val signatureBytes = decodeUrlBase64(80, signature)
        val sig = Signature.getInstance("SHA256withECDSA")
        sig.initVerify(publicKey)
        sig.update("locationspoofer-runtime-v2\n$payload".toByteArray(Charsets.UTF_8))
        require(sig.verify(signatureBytes)) { "运行许可签名无效" }
        val binding = RuntimePermitBinding(
            userId = json.getString("userId"),
            deviceId = json.getString("deviceId"),
            publicKeyFingerprint = json.getString("publicKeyFingerprint"),
            sessionId = json.getString("sessionId"),
        )
        for (id in listOf(binding.userId, binding.deviceId, binding.sessionId)) {
            require(UUID.matches(id)) { "Failed requirement." }
        }
        require(FINGERPRINT.matches(binding.publicKeyFingerprint)) { "Failed requirement." }
        val capsArr = json.getJSONArray("capabilities")
        val capabilities = ArrayList<String>(capsArr.length())
        for (i in 0 until capsArr.length()) {
            val el = capsArr.get(i)
            require(el is String) { "Failed requirement." }
            capabilities.add(el)
        }
        require(capabilities.isNotEmpty() && capabilities.size <= 3 && capabilities.toSet().size == capabilities.size) {
            "Failed requirement."
        }
        for (cap in capabilities) {
            require(cap in ALLOWED_CAPABILITIES) { "Failed requirement." }
        }
        require(json.get("issuedAt") !is String) { "Failed requirement." }
        require(json.get("expiresAt") !is String) { "Failed requirement." }
        val issuedAt = json.getLong("issuedAt")
        val expiresAt = json.getLong("expiresAt")
        require(issuedAt > 0 && expiresAt > issuedAt && expiresAt - issuedAt <= 120_000L) {
            "Failed requirement."
        }
        return RuntimePermitClaims(
            keyId = keyId,
            binding = binding,
            capabilities = capabilities.toSet(),
            issuedAt = issuedAt,
            expiresAt = expiresAt,
        )
    }

    private fun decodeUrlBase64(maxBytes: Int, value: String): ByteArray {
        require(BASE64.matches(value)) { "Failed requirement." }
        val bytes = urlDecoder.decode(value)
        require(bytes.size <= maxBytes) { "Failed requirement." }
        require(urlEncoder.encodeToString(bytes) == value) { "Failed requirement." }
        return bytes
    }

    private fun decodeEcPublicKey(spki: String): ECPublicKey {
        val bytes = decodeUrlBase64(200, spki)
        val key = KeyFactory.getInstance("EC")
            .generatePublic(X509EncodedKeySpec(bytes)) as ECPublicKey
        val params = AlgorithmParameters.getInstance("EC").apply {
            init(ECGenParameterSpec("secp256r1"))
        }
        val expected = params.getParameterSpec(ECParameterSpec::class.java)
        val actual = key.params
        require(
            actual.curve == expected.curve &&
                actual.generator == expected.generator &&
                actual.order == expected.order &&
                actual.cofactor == expected.cofactor,
        ) { "Failed requirement." }
        return key
    }

    private fun sha256Hex(text: String): String =
        MessageDigest.getInstance("SHA-256")
            .digest(text.toByteArray(Charsets.UTF_8))
            .joinToString("") { "%02x".format(it) }

    companion object {
        private val UUID = Regex("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}")
        private val FINGERPRINT = Regex("[a-f0-9]{64}")
        private val BASE64 = Regex("[A-Za-z0-9_-]+")
        private val ALLOWED_CAPABILITIES = setOf("spoof", "route", "environment")
        private val KEY_IDS: Map<String, String> = mapOf(
            "585e8e482583c65d" to
                "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEx471UGHaisfPadOGXoCZHhSE8vUVgs24Y-tDN5VonLTIN2eibNfjRIodIWqu6s3M3L9mOaSX1hXKBOgDBjg60A",
        )
    }
}
