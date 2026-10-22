package com.vincenthzr.locationspoofer.data.cloud

import android.content.Context
import android.content.SharedPreferences

/**
 * 可切换主/伴生存储的会话存储。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/SelectableCloudSessionStore.java
 */
class SelectableCloudSessionStore(
    context: Context,
    name: String,
) : CloudSessionStore {
    private val preferences: SharedPreferences =
        context.getSharedPreferences("cloud-device-mode-v1", Context.MODE_PRIVATE)
    private val primary = EncryptedCloudSessionStore(context = context, name = name, companionStorage = false)
    private val companionStore = EncryptedCloudSessionStore(context = context, name = name, companionStorage = true)
    @Volatile
    private var enabled: Boolean = preferences.getBoolean("companion", false)

    private fun selected(): EncryptedCloudSessionStore = if (enabled) companionStore else primary

    override val deviceHint: String
        get() = selected().deviceHint
    override val deviceId: String
        get() = selected().deviceId
    override val publicKey: String
        get() = selected().publicKey

    override fun read(): CloudTokens? = selected().read()

    override fun write(tokens: CloudTokens) = selected().write(tokens)

    override fun sign(payload: String): String = selected().sign(payload)

    override fun saveDeviceId(deviceId: String) = selected().saveDeviceId(deviceId)

    override fun acknowledgeDiagnostics(diagnostics: List<CloudDiagnostic>) {
        primary.acknowledgeDiagnostics(diagnostics)
        companionStore.acknowledgeDiagnostics(diagnostics)
    }

    override fun adoptRecoveredDevice(deviceId: String, proof: String) =
        selected().adoptRecoveredDevice(deviceId, proof)

    override fun clientInfo(): CloudClientInfo? = selected().clientInfo()

    override fun companionMode(): Boolean = enabled

    override fun completeTeeEnrollment(requestId: String, previousDeviceId: String, fingerprint: String) =
        selected().completeTeeEnrollment(requestId, previousDeviceId, fingerprint)

    override fun deviceHardwareIdentity(): CloudHardwareIdentity = selected().deviceHardwareIdentity()

    override fun deviceSignals(): Map<String, String> = selected().deviceSignals()

    override fun getSupportsPasswordAccess(): Boolean = true

    override fun getSupportsSessionProof(): Boolean = true

    override fun mapPreviewBinding(): CloudRuntimeBinding? = selected().mapPreviewBinding()

    override fun mapResourceCache(): CloudMapResourceCache? = selected().mapResourceCache()

    override fun monotonicTimeNanos(): Long = selected().monotonicTimeNanos()

    override fun nonce(): String = selected().nonce()

    override fun pendingDiagnostics(): List<CloudDiagnostic> =
        (primary.pendingDiagnostics() + companionStore.pendingDiagnostics())
            .distinctBy { it.id }
            .take(20)

    override fun pendingTeeEnrollment(): CloudTeeEnrollment? = selected().pendingTeeEnrollment()

    override fun prepareHardwareIdentity() = selected().prepareHardwareIdentity()

    override fun preparePasswordIdentity() = selected().preparePasswordIdentity()

    override fun prepareRecoveryInfo(): String = selected().prepareRecoveryInfo()

    override fun publicKeyFingerprint(): String = selected().publicKeyFingerprint()

    override fun readRuntimeRun(): String? = super.readRuntimeRun()

    override fun recordDiagnostic(operation: String, code: String, httpStatus: Int?) =
        selected().recordDiagnostic(operation, code, httpStatus)

    override fun recordDiagnostic(operation: String, code: String, httpStatus: Int?, detail: String?) =
        selected().recordDiagnostic(operation, code, httpStatus, detail)

    override fun saveMapPreviewBinding(binding: CloudRuntimeBinding) =
        selected().saveMapPreviewBinding(binding)

    override fun selectCompanionMode(enabledMode: Boolean) {
        if (preferences.edit().putBoolean("companion", enabledMode).commit()) {
            enabled = enabledMode
        } else {
            throw CloudException("storage_unavailable")
        }
    }

    override fun signingProfile(): String? = selected().signingProfile()

    override fun softwareAndroidIdHash(): String? = selected().softwareAndroidIdHash()

    override fun teeAvailability(): Boolean? = primary.teeAvailability()
}
