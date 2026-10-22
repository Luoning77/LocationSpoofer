package com.vincenthzr.locationspoofer.data.cloud

import org.json.JSONArray
import org.json.JSONObject
import java.security.InvalidKeyException
import java.util.Collections
import java.util.IdentityHashMap

/**
 * 诊断详情：阶段、重试、密钥状态与异常原因链。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudDiagnosticDetails.java
 */
data class CloudDiagnosticDetails(
    val schemaVersion: Int = 1,
    val phase: String = "unknown",
    val causes: List<CloudDiagnosticCause> = emptyList(),
    val internalKeystoreCode: Int? = null,
    val systemError: Boolean? = null,
    val retryPolicy: Int? = null,
    val attempts: Int = 1,
    val outcome: String = "failed",
    val processRunId: String? = null,
    val deviceUptimeMs: Long? = null,
    val processUptimeMs: Long? = null,
    val userUnlocked: Boolean? = null,
    val deviceLocked: Boolean? = null,
    val key: CloudDiagnosticKey? = null,
    val reason: String? = null,
    val previousKeyFingerprint: String? = null,
    val keyFingerprint: String? = null,
) {

    /** 聚组键：清空 firstSeen/lastSeen/count/processRunId/uptime 后用于同类合并（原版 copy$default mask 129535） */
    internal fun groupingKey(): CloudDiagnosticDetails = copy(
        processRunId = null,
        deviceUptimeMs = null,
        processUptimeMs = null,
        userUnlocked = null,
        deviceLocked = null,
    )

    internal fun valid(): Boolean {
        if (schemaVersion != 1 || phase !in PHASES || outcome !in OUTCOMES || attempts !in 1..2) return false
        if (reason != null && reason !in REASONS) return false
        for (fp in listOfNotNull(previousKeyFingerprint, keyFingerprint)) {
            if (!FINGERPRINT.matches(fp)) return false
        }
        if (causes.size > 4) return false
        for (cause in causes) {
            if (cause.type !in EXCEPTION_TYPES) return false
            if (cause.frames.size > 3) return false
            for (frame in cause.frames) {
                if (!validFrame(frame)) return false
            }
        }
        for (uptime in listOfNotNull(deviceUptimeMs, processUptimeMs)) {
            if (uptime < 0 || uptime >= MAX_UPTIME) return false
        }
        return true
    }

    internal fun toJson(): JSONObject {
        val json = JSONObject()
            .put("schemaVersion", schemaVersion)
            .put("phase", phase)
            .put("causes", JSONArray(causes.map { it.toJson() }))
            .put("attempts", attempts)
            .put("outcome", outcome)
        internalKeystoreCode?.let { json.put("internalKeystoreCode", it) }
        systemError?.let { json.put("systemError", it) }
        retryPolicy?.let { json.put("retryPolicy", it) }
        processRunId?.let { json.put("processRunId", it) }
        deviceUptimeMs?.let { json.put("deviceUptimeMs", it) }
        processUptimeMs?.let { json.put("processUptimeMs", it) }
        userUnlocked?.let { json.put("userUnlocked", it) }
        deviceLocked?.let { json.put("deviceLocked", it) }
        key?.let { json.put("key", it.toJson()) }
        reason?.let { json.put("reason", it) }
        previousKeyFingerprint?.let { json.put("previousKeyFingerprint", it) }
        keyFingerprint?.let { json.put("keyFingerprint", it) }
        return json
    }

    companion object {
        const val MAX_UPTIME: Long = 315_360_000_000L

        internal val REASONS: Set<String> = setOf(
            "fresh_identity", "legacy_tee_upgrade", "password_recovery", "guest_code_recovery",
            "unused_guest_replacement", "confirmed_key_invalidated", "confirmed_key_loss",
            "confirmed_pending_key_loss", "key_read_failed", "key_read_recovered", "key_type_mismatch",
            "certificate_unavailable", "key_fingerprint_mismatch", "security_level_rejected",
            "authentication_required", "exportable_private_key", "signature_self_test_failed",
            "key_generation_failed", "signature_operation_failed", "timestamp_out_of_window",
            "invalid_signed_headers", "invalid_nonce", "invalid_request_target", "malformed_signature",
            "signature_mismatch", "invalid_public_key", "verification_unavailable",
        )

        private val PHASES = setOf(
            "unknown", "read_key", "init_sign", "update_sign", "finish_sign", "read_payload",
            "init_decrypt", "decrypt", "decode_session", "migrate_session", "init_encrypt",
            "add_aad", "open_file", "encrypt", "write_file", "finish_file", "create_key",
            "read_key_info", "check_key_properties", "persist_candidate", "verify_signature",
            "confirm_enrollment", "verify_request",
        )

        private val OUTCOMES = setOf("failed", "retry_succeeded", "prepared", "committed")

        private val EXCEPTION_TYPES = setOf(
            "Exception", "RuntimeException", "IllegalStateException", "IllegalArgumentException",
            "SecurityException", "InvalidKeyException", "KeyStoreException",
            "KeyPermanentlyInvalidatedException", "UserNotAuthenticatedException",
            "StrongBoxUnavailableException", "ProviderException", "SignatureException",
            "InvalidAlgorithmParameterException", "UnrecoverableKeyException",
            "NoSuchAlgorithmException", "NoSuchProviderException", "InvalidKeySpecException",
            "IOException", "FileNotFoundException", "ErrnoException", "AEADBadTagException",
            "BadPaddingException", "IllegalBlockSizeException", "JSONException",
            "InterruptedException", "CorruptSession", "unknown",
        )

        internal val CLASS_NAME = Regex(
            "(?:android\\.|java\\.|javax\\.|kotlin\\.|kotlinx\\.|com\\.vincenthzr\\.locationspoofer\\.)[A-Za-z0-9_.\$]{1,160}",
        )
        private val METHOD_NAME = Regex("[A-Za-z0-9_\$<>-]{1,80}")
        private val FINGERPRINT = Regex("[a-f0-9]{64}")

        internal fun validFrame(frame: CloudDiagnosticFrame): Boolean =
            frame.className.length <= 160 &&
                CLASS_NAME.matches(frame.className) &&
                METHOD_NAME.matches(frame.methodName) &&
                (frame.lineNumber == null || frame.lineNumber in 0..1_000_000)

        internal fun exceptionType(th: Throwable): String {
            val simpleName = th::class.java.simpleName
            if (simpleName in EXCEPTION_TYPES) return simpleName
            return if (th is InvalidKeyException) "InvalidKeyException" else "unknown"
        }

        private fun fromJsonInt(json: JSONObject, key: String): Int? =
            if (json.has(key)) json.getInt(key) else null

        private fun fromJsonBool(json: JSONObject, key: String): Boolean? =
            if (json.has(key)) json.getBoolean(key) else null

        private fun fromJsonStr(json: JSONObject, key: String): String? =
            if (json.has(key)) json.getString(key) else null

        private fun fromJsonLong(json: JSONObject, key: String): Long? =
            if (json.has(key)) json.getLong(key) else null

        /** 原版 fromJson：超限结构（causes>4 / frames>3）或校验失败返回 null */
        /** 原版 fromJson：超限结构（causes>4 / frames>3）或校验失败返回 null */
        fun fromJson(json: JSONObject): CloudDiagnosticDetails? = try {
            val causesArray = json.getJSONArray("causes")
            if (causesArray.length() > 4) throw InvalidStructure()
            val keyJson = json.optJSONObject("key")
            val diagnosticKey = keyJson?.let {
                CloudDiagnosticKey(
                    role = it.getString("role"),
                    status = it.optString("status"),
                    securityLevel = fromJsonStr(it, "securityLevel"),
                    authenticationRequired = fromJsonBool(it, "authenticationRequired"),
                    authenticationType = fromJsonInt(it, "authenticationType"),
                    authenticationValiditySeconds = fromJsonInt(it, "authenticationValiditySeconds"),
                    invalidatedByBiometricEnrollment = fromJsonBool(it, "invalidatedByBiometricEnrollment"),
                    unlockedDeviceRequired = fromJsonBool(it, "unlockedDeviceRequired"),
                    inspectionException = fromJsonStr(it, "inspectionException"),
                )
            }
            val causes = (0 until causesArray.length()).map { i ->
                val causeJson = causesArray.getJSONObject(i)
                val framesArray = causeJson.getJSONArray("frames")
                if (framesArray.length() > 3) throw InvalidStructure()
                CloudDiagnosticCause(
                    type = causeJson.getString("type"),
                    frames = (0 until framesArray.length()).map { j ->
                        val frameJson = framesArray.getJSONObject(j)
                        CloudDiagnosticFrame(
                            className = frameJson.getString("className"),
                            methodName = frameJson.optString("methodName"),
                            lineNumber = if (frameJson.has("lineNumber")) frameJson.getInt("lineNumber") else null,
                        )
                    },
                )
            }
            val details = CloudDiagnosticDetails(
                schemaVersion = json.getInt("schemaVersion"),
                phase = json.getString("phase"),
                causes = causes,
                internalKeystoreCode = fromJsonInt(json, "internalKeystoreCode"),
                systemError = fromJsonBool(json, "systemError"),
                retryPolicy = fromJsonInt(json, "retryPolicy"),
                attempts = json.getInt("attempts"),
                outcome = json.getString("outcome"),
                processRunId = fromJsonStr(json, "processRunId"),
                deviceUptimeMs = fromJsonLong(json, "deviceUptimeMs"),
                processUptimeMs = fromJsonLong(json, "processUptimeMs"),
                userUnlocked = fromJsonBool(json, "userUnlocked"),
                deviceLocked = fromJsonBool(json, "deviceLocked"),
                key = diagnosticKey,
                reason = fromJsonStr(json, "reason"),
                previousKeyFingerprint = fromJsonStr(json, "previousKeyFingerprint"),
                keyFingerprint = fromJsonStr(json, "keyFingerprint"),
            )
            if (details.valid()) details else null
        } catch (_: InvalidStructure) {
            null
        } catch (_: Exception) {
            null
        }

        /** 结构超限哨兵（causes>4 或 frames>3） */
        private class InvalidStructure : Exception()

        /** 沿 cause 链捕获至多 4 层，每层保留至多 3 个有效自有帧 */
        fun captureCauses(th: Throwable): List<CloudDiagnosticCause> {
            val seen = Collections.newSetFromMap<Throwable>(IdentityHashMap())
            val causes = ArrayList<CloudDiagnosticCause>()
            var current: Throwable? = th
            while (current != null && causes.size < 4 && seen.add(current)) {
                val frames = current.stackTrace
                    .asSequence()
                    .map { CloudDiagnosticFrame(it.className, it.methodName, if (it.lineNumber >= 0) it.lineNumber else null) }
                    .filter { validFrame(it) }
                    .take(64)
                    .toList()
                val owned = frames.take(3).toMutableList()
                frames.firstOrNull { it.className.startsWith("com.vincenthzr.locationspoofer.") }?.let { anchor ->
                    if (anchor !in owned) {
                        if (owned.size == 3) owned.removeAt(1)
                        owned.add(anchor)
                    }
                }
                causes.add(CloudDiagnosticCause(exceptionType(current), owned))
                current = current.cause
            }
            return causes
        }
    }
}
