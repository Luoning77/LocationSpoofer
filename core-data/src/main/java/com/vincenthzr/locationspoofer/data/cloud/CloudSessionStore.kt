package com.vincenthzr.locationspoofer.data.cloud

import java.security.MessageDigest
import java.security.SecureRandom
import java.util.Base64

/**
 * 云会话存储接口：设备身份、令牌读写、签名与诊断记录。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudSessionStore.java
 */
interface CloudSessionStore {
    val deviceHint: String
    val deviceId: String
    val publicKey: String

    fun read(): CloudTokens?

    fun write(tokens: CloudTokens?)

    fun sign(payload: String): String

    fun saveDeviceId(deviceId: String)

    fun acknowledgeDiagnostics(diagnostics: List<CloudDiagnostic>) {}

    fun adoptRecoveredDevice(deviceId: String, proof: String) {
        saveDeviceId(deviceId)
    }

    fun clientInfo(): CloudClientInfo? = null

    fun companionMode(): Boolean = false

    @Throws(CloudException::class)
    fun completeTeeEnrollment(requestId: String, previousDeviceId: String, fingerprint: String) {
        throw CloudException("device_recovery_required")
    }

    fun deviceHardwareIdentity(): CloudHardwareIdentity =
        CloudHardwareIdentity(signals = deviceSignals())

    fun deviceSignals(): Map<String, String> = emptyMap()

    fun getAccountProtocol(): Boolean = false

    fun getHardwareSnapshotProtocol(): Boolean = false

    fun getSupportsDeviceProof(): Boolean = true

    fun getSupportsPasswordAccess(): Boolean = false

    fun getSupportsSessionProof(): Boolean = false

    fun mapPreviewBinding(): CloudRuntimeBinding? = null

    fun mapResourceCache(): CloudMapResourceCache? = null

    fun monotonicTimeNanos(): Long = System.nanoTime()

    fun nonce(): String {
        val bytes = ByteArray(32)
        SecureRandom().nextBytes(bytes)
        return cloudDigestEncode(bytes)
    }

    fun pendingDiagnostics(): List<CloudDiagnostic> = emptyList()

    fun pendingTeeEnrollment(): CloudTeeEnrollment? = null

    fun preparePasswordIdentity() {
        prepareHardwareIdentity()
    }

    @Throws(CloudException::class)
    fun prepareRecoveryInfo(): String {
        throw CloudException("device_recovery_required")
    }

    fun publicKeyFingerprint(): String {
        val digest = MessageDigest.getInstance("SHA-256")
            .digest(Base64.getUrlDecoder().decode(publicKey))
        return digest.joinToString("") { "%02x".format(it) }
    }

    fun readRuntimeRun(): String? = null

    fun recordDiagnostic(operation: String, code: String, httpStatus: Int? = null) {
        recordDiagnostic(operation, code, httpStatus, null)
    }

    fun recordDiagnostic(operation: String, code: String, httpStatus: Int?, detail: String?) {
    }

    fun prepareHardwareIdentity() {}

    fun selectCompanionMode(enabled: Boolean) {
        if (enabled) {
            throw CloudException("companion_not_supported")
        }
    }

    fun signingProfile(): String? = null

    fun softwareAndroidIdHash(): String? = null

    fun teeAvailability(): Boolean? = null

    fun saveMapPreviewBinding(binding: CloudRuntimeBinding?) {}

    fun writeRuntimeRun(run: String?) {}
}
