package com.vincenthzr.locationspoofer.data.cloud

import org.json.JSONObject

/**
 * 地图预览绑定存储：把 CloudRuntimeBinding 存进地图缓存（scope=location-map-preview-v1\n<originId>）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudMapPreviewStore.java
 */
class CloudMapPreviewStore(
    private val cache: CloudMapResourceCache,
    originId: String,
) {
    private val scope = "location-map-preview-v1\n$originId"
    private val path = "@display-binding"

    fun read(): CloudRuntimeBinding? = try {
        val entry = cache.read(scope, path, 4_096L, false) ?: return null
        val json = JSONObject(String(entry.bytes, Charsets.UTF_8))
        val binding = CloudRuntimeBinding(
            userId = json.getString("userId"),
            deviceId = json.getString("deviceId"),
            publicKeyFingerprint = json.getString("publicKeyFingerprint"),
            sessionId = json.getString("sessionId"),
        )
        for (uuid in listOf(binding.userId, binding.deviceId, binding.sessionId)) {
            if (!EncryptedCloudSessionStore.UUID_PATTERN.matches(uuid)) error("Check failed.")
        }
        if (!FINGERPRINT.matches(binding.publicKeyFingerprint)) error("Check failed.")
        binding
    } catch (_: Throwable) {
        null
    }

    fun write(binding: CloudRuntimeBinding?) {
        if (binding == null) {
            cache.remove(scope, path)
            return
        }
        val json = JSONObject()
            .put("userId", binding.userId)
            .put("deviceId", binding.deviceId)
            .put("publicKeyFingerprint", binding.publicKeyFingerprint)
            .put("sessionId", binding.sessionId)
        cache.write(scope, path, CloudMapCacheEntry(json.toString().toByteArray(Charsets.UTF_8), 200))
    }

    private companion object {
        val FINGERPRINT = Regex("[a-f0-9]{64}")
    }
}
