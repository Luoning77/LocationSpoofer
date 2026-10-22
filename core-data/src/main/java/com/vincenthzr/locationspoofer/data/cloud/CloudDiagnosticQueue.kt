package com.vincenthzr.locationspoofer.data.cloud

import org.json.JSONArray
import org.json.JSONObject
import java.util.UUID

/**
 * 云诊断持久化队列：JSON 文件 ≤262144B / ≤24 条 / 7 天窗口 / 同因聚合计数。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudDiagnosticQueue.java
 */
class CloudDiagnosticQueue(
    private val load: () -> String?,
    private val save: (String) -> Unit,
    private val clock: () -> Long = System::currentTimeMillis,
) {
    /** @param operation 见 OPERATIONS；不在集合内的记为 cloud_request
     *  @param code 见 CODES；不在集合内的记为 other_error
     *  @param category 见 CATEGORIES；不在集合内的记为 other */
    @Synchronized
    fun record(
        operation: String,
        code: String,
        category: String,
        clientInfo: CloudClientInfo?,
        variant: String?,
        abi: String?,
        keystoreCode: Int? = null,
        transient: Boolean? = null,
        requiresUnlock: Boolean? = null,
        httpStatus: Int? = null,
        osErrorCode: Int? = null,
        details: CloudDiagnosticDetails?,
    ) {
        try {
            val now = clock()
            val safeOperation = if (operation in OPERATIONS) operation else "cloud_request"
            val safeCode = if (code in CODES) code else "other_error"
            val safeCategory = if (category in CATEGORIES) category else "other"
            val safeSdkInt = clientInfo?.sdkInt?.takeIf { it in 1..1000 }
            val safeOsVersion = version(clientInfo?.osVersion)
            val safeAppVersionName = version(clientInfo?.appVersionName)
            val safeAppVersionCode = clientInfo?.appVersionCode?.takeIf { it >= 0 }
            val safeVariant = if (variant in VARIANTS) variant else "scoped"
            val safeAbi = if (abi in ABIS) abi else "unknown"
            val safeKeystoreCode = keystoreCode?.takeIf { it in 0..1000 }
            val safeHttpStatus = httpStatus?.takeIf { it in 100..599 }
            val safeOsErrorCode = osErrorCode?.takeIf { it in 0..4095 }
            val safeDetails = details?.takeIf { it.valid() }
            val diagnostic = CloudDiagnostic(
                id = UUID.randomUUID().toString(),
                operation = safeOperation,
                code = safeCode,
                category = safeCategory,
                firstSeenAt = now,
                lastSeenAt = now,
                count = 1,
                sdkInt = safeSdkInt,
                osVersion = safeOsVersion,
                appVersionName = safeAppVersionName,
                appVersionCode = safeAppVersionCode,
                variant = safeVariant,
                abi = safeAbi,
                keystoreCode = safeKeystoreCode,
                transient = transient,
                requiresUnlock = requiresUnlock,
                httpStatus = safeHttpStatus,
                osErrorCode = safeOsErrorCode,
                details = safeDetails,
            )
            val serialized = diagnostic.toJson().toString()
            if (serialized.toByteArray(Charsets.UTF_8).size > 7_500) return
            val existing = read()
            // 同因聚组：除 id/firstSeenAt/lastSeenAt/count 外完全一致（含 details 除进程瞬态外的部分）
            val signatureOf: (CloudDiagnostic) -> Any? = { item ->
                listOf(
                    item.operation, item.code, item.category, item.sdkInt, item.osVersion,
                    item.appVersionName, item.appVersionCode, item.variant, item.abi,
                    item.keystoreCode, item.transient, item.requiresUnlock, item.httpStatus,
                    item.osErrorCode, item.details?.groupingKey(),
                )
            }
            val diagnosticSignature = signatureOf(diagnostic)
            val index = existing.indexOfFirst { signatureOf(it) == diagnosticSignature }
            val merged = existing.toMutableList()
            if (index >= 0) {
                val previous = merged.removeAt(index)
                val count = (previous.count + 1).coerceAtMost(1_000)
                merged.add(previous.copy(lastSeenAt = now, count = count))
            } else {
                merged.add(diagnostic)
            }
            persist(merged.takeLast(24))
        } catch (_: Throwable) {
        }
    }

    /** 最早的 ≤8 条且整体不超过 12000 字节 */
    @Synchronized
    fun pending(): List<CloudDiagnostic> {
        val result = ArrayList<CloudDiagnostic>()
        var length = 32
        for (diagnostic in read().take(8)) {
            val bytes = diagnostic.toJson().toString().toByteArray(Charsets.UTF_8)
            length += bytes.size + 1
            if (length > 12_000) break
            result.add(diagnostic)
        }
        return result
    }

    /** 删除与给定列表相等的条目 */
    @Synchronized
    fun acknowledge(acknowledged: List<CloudDiagnostic>) {
        try {
            if (acknowledged.isEmpty()) return
            val remaining = read().filterNot { existing -> acknowledged.any { it == existing } }
            persist(remaining)
        } catch (_: Throwable) {
        }
    }

    private fun read(): List<CloudDiagnostic> = try {
        val raw = load() ?: return emptyList()
        if (raw.length > MAX_QUEUE_BYTES) error("Failed requirement.")
        val array = JSONArray(raw)
        if (array.length() > 24) error("Failed requirement.")
        val diagnostics = (0 until array.length()).map { i ->
            val json = array.getJSONObject(i)
            val diagnostic = CloudDiagnostic(
                id = json.getString("id"),
                operation = json.getString("operation"),
                code = json.getString("code"),
                category = json.getString("category"),
                firstSeenAt = json.getLong("firstSeenAt"),
                lastSeenAt = json.getLong("lastSeenAt"),
                count = json.getInt("count"),
                sdkInt = optionalInt(json, "sdkInt"),
                osVersion = optionalString(json, "osVersion"),
                appVersionName = optionalString(json, "appVersionName"),
                appVersionCode = if (json.has("appVersionCode")) json.getLong("appVersionCode") else null,
                variant = json.getString("variant"),
                abi = json.getString("abi"),
                keystoreCode = optionalInt(json, "keystoreCode"),
                transient = optionalBoolean(json, "transient"),
                requiresUnlock = optionalBoolean(json, "requiresUnlock"),
                httpStatus = optionalInt(json, "httpStatus"),
                osErrorCode = optionalInt(json, "osErrorCode"),
                details = json.optJSONObject("details")?.let { CloudDiagnosticDetails.fromJson(it) },
            )
            if (!EncryptedCloudSessionStore.UUID_PATTERN.matches(diagnostic.id) ||
                diagnostic.operation !in OPERATIONS ||
                diagnostic.code !in CODES ||
                diagnostic.category !in CATEGORIES
            ) {
                error("Failed requirement.")
            }
            diagnostic
        }
        val now = clock()
        diagnostics.filter { now - WINDOW_MILLIS <= it.lastSeenAt && it.lastSeenAt <= now }
    } catch (_: Throwable) {
        emptyList()
    }

    private fun persist(diagnostics: List<CloudDiagnostic>) {
        val json = JSONArray(diagnostics.map { it.toJson() }).toString()
        if (json.length <= MAX_QUEUE_BYTES) {
            save(json)
        }
    }

    /** 字符串白名单：[A-Za-z0-9._ -]{1,40} */
    private fun version(value: String?): String? =
        value?.takeIf { VERSION_PATTERN.matches(it) }

    private fun optionalInt(json: JSONObject, key: String): Int? = if (json.has(key)) json.getInt(key) else null
    private fun optionalBoolean(json: JSONObject, key: String): Boolean? = if (json.has(key)) json.getBoolean(key) else null
    private fun optionalString(json: JSONObject, key: String): String? = if (json.has(key)) json.getString(key) else null

    companion object {
        const val MAX_QUEUE_BYTES = 262_144
        private const val WINDOW_MILLIS = 604_800_000L // 7 天
        private val VERSION_PATTERN = Regex("[A-Za-z0-9._ -]{1,40}")

        val OPERATIONS: Set<String> = setOf(
            "identity", "read_identity", "write_identity", "sign", "read_signing_key", "read_session",
            "write_session", "delete_session", "prepare_tee", "generate_signing_key", "key_change",
            "device_enroll", "account_read", "auth_login", "auth_register", "auth_refresh", "auth_device",
            "radio_sharing", "refresh_account", "cloud_request", "environment_config", "places_search",
            "places_reverse", "environment_wifi", "environment_cells", "runtime_permit", "framework_publish",
        )
        val CODES: Set<String> = setOf(
            "hardware_confirmation_required", "hardware_conflict", "client_upgrade_required",
            "invalid_device_signature", "device_request_replayed", "device_not_enrolled",
            "device_key_changed", "device_migration_required", "device_hardware_mismatch",
            "device_identity_required", "account_disabled", "device_blocked", "access_denied",
            "capability_forbidden", "invalid_session", "rate_limited", "response_too_large",
            "redirect_rejected", "storage_unavailable", "device_locked", "device_recovery_required",
            "network_error", "service_unavailable", "provider_unavailable", "upstream_error",
            "provider_failed", "provider_response_too_large", "invalid_response",
            "invalid_wigle_credentials", "invalid_opencellid_credentials", "invalid_environment_credentials",
            "credential_storage_unavailable", "device_binding_mismatch", "framework_unavailable",
            "configuration_publish_failed", "companion_lease_required", "invalid_run_signature",
            "companion_in_use", "companion_slot_occupied", "other_error",
        )
        val CATEGORIES: Set<String> = setOf("keystore", "io", "crypto", "format", "network", "server", "framework", "other")
        val VARIANTS: Set<String> = setOf("global", "scoped")
        val ABIS: Set<String> = setOf("arm64-v8a", "armeabi-v7a", "x86_64", "x86", "unknown")
    }
}
