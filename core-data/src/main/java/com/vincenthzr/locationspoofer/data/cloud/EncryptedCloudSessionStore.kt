package com.vincenthzr.locationspoofer.data.cloud

import android.content.Context
import android.os.Build
import android.os.SystemClock
import android.os.UserManager
import android.provider.Settings
import android.util.Log
import java.io.File
import java.io.IOException
import java.security.InvalidKeyException
import java.security.Key
import java.security.KeyFactory
import java.security.KeyPairGenerator
import java.security.KeyStore
import java.security.MessageDigest
import java.security.PrivateKey
import java.security.SecureRandom
import java.security.Signature
import java.security.spec.ECGenParameterSpec
import java.util.Base64
import java.util.UUID
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyInfo
import android.security.keystore.KeyProperties
import android.util.AtomicFile
import org.json.JSONObject

/**
 * 加密云会话存储：AndroidKeyStore EC 签名密钥 + AES/GCM 会话文件。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/EncryptedCloudSessionStore.java（2,121 行）
 *
 * 关键常量/文件布局（与原版逐字节对齐）：
 * - PRODUCT_REALM = "locationspoofer.official.device.v2"
 * - MAGIC = "LCV2"（4 字节），会话文件 = MAGIC + IV(12) + GCM 密文；AAD = originBytes
 * - 文件名 cloud-session-<hex(origin[+\ncompanion])>.bin / cloud-run-…txt / cloud-identity-<hex(realm[+\ncompanion])>.json
 * - 别名 locationspoofer.cloud.session.v2.<originId> / .device.<originId>（legacy）/ .device.realm.<realmId>[.tee.<uuid>]
 * - 身份 JSON：realm/signingAlias/hint/publicKeyFingerprint[deviceId/signingProfile/teeEnrollment{requestId,alias,fingerprint,reason}/signingBufferFailures/signingCooldownUntil]
 */
class EncryptedCloudSessionStore(
    private val context: Context,
    name: String,
    private val realm: String = PRODUCT_REALM,
    private val companionStorage: Boolean = false,
) : CloudSessionStore {

    // ---------- 派生标识（构造期确定） ----------
    private val originBytes: ByteArray = name.trim().trimEnd('/').toByteArray(Charsets.UTF_8)
    private val originId: String = hex(originBytes + (if (companionStorage) "\ncompanion" else "").toByteArray(Charsets.UTF_8))
    private val realmId: String = hex((realm + (if (companionStorage) "\ncompanion" else "")).toByteArray(Charsets.UTF_8))

    private val sessionFile: AtomicFile =
        AtomicFile(File(context.noBackupFilesDir, "cloud-session-$originId.bin"))
    private val runtimeRunFile: AtomicFile =
        AtomicFile(File(context.noBackupFilesDir, "cloud-run-$originId.txt"))
    private val identityFile: AtomicFile =
        AtomicFile(File(context.noBackupFilesDir, "cloud-identity-$realmId.json"))

    private val sessionAlias: String = "locationspoofer.cloud.session.v2.$originId"
    private val legacyAlias: String = "locationspoofer.cloud.device.$originId"
    private val stableAlias: String = "locationspoofer.cloud.device.realm.$realmId"
    private val legacyEncryptionAlias: String = "locationspoofer.cloud.session.v1"
    private val teePreferences = context.getSharedPreferences("cloud-tee-capability-v1", Context.MODE_PRIVATE)

    private val mapCache: EncryptedMapResourceCache by lazy {
        EncryptedMapResourceCache(File(context.cacheDir, "cloud-map-v1-$originId"), key = { mapEncryptionKey() })
    }
    private val mapPreview: CloudMapPreviewStore by lazy { CloudMapPreviewStore(mapCache, originId) }

    // ---------- 可变缓存/状态 ----------
    private var identityCache: JSONObject? = null
    private var tokenCache: CloudTokens? = null
    private var sessionLoaded: Boolean = false
    private var mapKey: SecretKey? = null
    private var confirmedSigningInvalidation: Boolean = false
    private var confirmedIdentityCorruption: Boolean = false

    private inner class KeyValidationFailure(val diagnosticReason: String) :
        InvalidKeyException(diagnosticReason)

    // ---------- 会话（tokens） ----------

    @Throws(CloudException::class)
    private fun clearSession() {
        tokenCache = null
        sessionLoaded = true
        sessionFile.delete()
        val base = sessionFile.baseFile
        val leftovers = listOf(base, File(base.path + ".bak"), File(base.path + ".new"))
        if (leftovers.any { it.exists() }) {
            throw storageFailure("delete_session", IOException())
        }
    }

    private fun encryptionKey(alias: String, create: Boolean, force: Boolean): SecretKey? {
        val key = readKey(alias, if (alias == legacyEncryptionAlias) "legacy_session" else "session")
        if (key != null) {
            if (key is SecretKey) return key
            throw storageFailure("read_session", KeyValidationFailure("key_type_mismatch"), "read_key", "session", key)
        }
        if (!create) return null
        if (sessionFile.baseFile.exists() && !force) {
            throw CloudException("storage_unavailable")
        }
        val generator = KeyGenerator.getInstance("AES", "AndroidKeyStore")
        generator.init(
            KeyGenParameterSpec.Builder(alias, KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
                .setKeySize(256)
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                .setRandomizedEncryptionRequired(true)
                .build(),
        )
        return generator.generateKey()
    }

    private fun writeSession(tokens: CloudTokens, fresh: Boolean) {
        identity()
        val plain = JSONObject()
            .put("accessToken", tokens.accessToken)
            .put("refreshToken", tokens.refreshToken)
            .put("accessExpiresAt", tokens.accessExpiresAt)
            .put("refreshExpiresAt", tokens.refreshExpiresAt)
            .toString()
            .toByteArray(Charsets.UTF_8)
        if (plain.size > 65_504) return
        var out: java.io.FileOutputStream? = null
        var op = "read_key"
        try {
            val cipher = Cipher.getInstance("AES/GCM/NoPadding")
            val key = encryptionKey(sessionAlias, create = true, force = fresh) ?: return
            op = "read_key"
            cipher.init(Cipher.ENCRYPT_MODE, key)
            cipher.updateAAD(originBytes)
            op = "open_file"
            out = sessionFile.startWrite()
            val iv = cipher.iv
            val payload = MAGIC + iv + cipher.doFinal(plain)
            out.write(payload)
            op = "finish_file"
            sessionFile.finishWrite(out)
            tokenCache = tokens
            sessionLoaded = true
        } catch (e: Exception) {
            out?.let { sessionFile.failWrite(it) }
            tokenCache = null
            sessionLoaded = false
            throw storageFailure("write_session", e, op, "session")
        }
    }

    override fun read(): CloudTokens? {
        var op = "read_payload"
        var kind = "session"
        try {
            if (identity().has("teeEnrollment")) {
                return null
            }
            op = "read_payload"
            if (sessionLoaded) {
                val cached = tokenCache
                if (cached != null && encryptionKey(sessionAlias, create = false, force = false) == null) {
                    clearSession()
                }
                return cached
            }
            if (!sessionFile.baseFile.exists()) {
                sessionLoaded = true
                return null
            }
            val length = sessionFile.baseFile.length()
            if (length < MIN_SESSION_BYTES || length >= MAX_FILE_BYTES) throw CorruptSession()
            val fully = sessionFile.readFully()
            val hasMagic = fully.size >= 4 && fully.copyOfRange(0, 4).contentEquals(MAGIC)
            kind = if (hasMagic) "session" else "legacy_session"
            op = "read_key"
            val key = encryptionKey(if (hasMagic) sessionAlias else legacyEncryptionAlias, create = false, force = false)
                ?: run { clearSession(); return null }
            var offset = if (hasMagic) 4 else 0
            if (offset + MIN_SESSION_BYTES > fully.size || fully.size >= MAX_FILE_BYTES) throw CorruptSession()
            val cipher = Cipher.getInstance("AES/GCM/NoPadding")
            cipher.init(Cipher.DECRYPT_MODE, key, GCMParameterSpec(128, fully, offset, 12))
            if (hasMagic) cipher.updateAAD(originBytes)
            offset += 12
            val plain = cipher.doFinal(fully, offset, fully.size - offset)
            val json = JSONObject(String(plain, Charsets.UTF_8))
            json.optString("deviceId").takeIf { UUID_PATTERN.matches(it) }?.let { saveDeviceId(it) }
            val access = json.optString("accessToken")
            val refresh = json.optString("refreshToken")
            if (access.length !in 20..128 || refresh.length !in 20..128) throw CorruptSession()
            val tokens = CloudTokens(access, refresh, json.optLong("accessExpiresAt"), json.optLong("refreshExpiresAt"))
            if (!hasMagic) writeSession(tokens, fresh = true) // legacy 会话迁移
            tokenCache = tokens
            sessionLoaded = true
            return tokens
        } catch (e: Exception) {
            if (e is CorruptSession || isAeadBadTag(e) || e is org.json.JSONException) {
                recordStorageFailure("read_session", e, op, kind)
                runCatching { clearSession() }
                return null
            }
            tokenCache = null
            sessionLoaded = false
            if (e is CloudException) throw e
            throw storageFailure("read_session", e, op, kind)
        }
    }

    private fun isAeadBadTag(e: Exception): Boolean =
        e is javax.crypto.AEADBadTagException || e.cause?.let { it is javax.crypto.AEADBadTagException } == true

    override fun write(tokens: CloudTokens?) {
        if (tokens == null) {
            clearSession()
        } else {
            writeSession(tokens, fresh = false)
        }
    }

    // ---------- 身份（签名密钥） ----------

    private fun identity(): JSONObject {
        try {
            val userManager = context.getSystemService(Context.USER_SERVICE) as? UserManager
            if (userManager != null && !userManager.isUserUnlocked) {
                throw CloudException("device_locked")
            }
            return loadIdentity() ?: throw CloudException("device_recovery_required")
        } catch (e: CloudException) {
            throw e
        } catch (e: Exception) {
            throw storageFailure("identity", e)
        }
    }

    private fun identityMetadata(): JSONObject? {
        identityCache?.let { return it }
        if (!identityFile.baseFile.exists()) return null
        return try {
            val length = identityFile.baseFile.length()
            if (length < 2 || length >= MAX_FILE_BYTES) throw IllegalStateException("Check failed.")
            val json = JSONObject(String(identityFile.readFully(), Charsets.UTF_8))
            if (json.getString("realm") != realm) throw IllegalStateException("Check failed.")
            if (!validSigningAlias(json.getString("signingAlias"))) throw IllegalStateException("Check failed.")
            identityCache = json
            json
        } catch (e: IOException) {
            throw storageFailure("read_identity", e)
        } catch (_: Exception) {
            confirmedIdentityCorruption = true
            throw CloudException("device_recovery_required")
        }
    }

    private fun loadIdentity(): JSONObject? {
        val metadata = loadIdentityMetadata() ?: return null
        val tee = metadata.optJSONObject("teeEnrollment")
        val alias = tee?.getString("alias") ?: metadata.getString("signingAlias")
        if (!validSigningAlias(alias)) {
            throw CloudException("device_recovery_required")
        }
        val entry = signingKeyEntry(alias) ?: throw CloudException("device_recovery_required")
        val fingerprint = tee?.getString("fingerprint") ?: metadata.optString("publicKeyFingerprint")
        if (fingerprint.isNotEmpty()) {
            val actual = hex(entry.certificate.publicKey.encoded)
            if (fingerprint != actual) {
                throw storageFailure(
                    "read_signing_key",
                    KeyValidationFailure("key_fingerprint_mismatch"),
                    "read_key_info", "signing", entry.privateKey,
                )
            }
        }
        if (companionStorage) {
            requireKeystoreKey(entry.privateKey)
            return metadata
        }
        if (tee == null && metadata.optString("signingProfile") != TEE_SIGNING_PROFILE) {
            return metadata
        }
        requireTee(entry.privateKey)
        return metadata
    }

    private fun loadIdentityMetadata(): JSONObject? {
        var metadata = identityMetadata()
        if (metadata != null) return metadata
        val existing = readKey(legacyAlias, "signing")?.let { legacyAlias }
            ?: readKey(stableAlias, "signing")?.let { stableAlias }
        if (existing == null) {
            if (sessionFile.baseFile.exists()) {
                saveIdentity(
                    JSONObject()
                        .put("realm", realm)
                        .put("signingAlias", legacyAlias)
                        .put("hint", "")
                        .put("publicKeyFingerprint", ""),
                )
                throw CloudException("device_recovery_required")
            }
            generateSigningKey(stableAlias) { keyPair -> persistFreshIdentity(keyPair) }
            return identityMetadata() ?: throw CloudException("device_recovery_required")
        }
        val certificate = store().getCertificate(existing)
            ?: throw storageFailure("read_signing_key", KeyValidationFailure("certificate_unavailable"), "read_key_info", "signing")
        val encoded = certificate.publicKey.encoded
            ?: throw storageFailure("read_signing_key", KeyValidationFailure("certificate_unavailable"), "read_key_info", "signing")
        metadata = JSONObject()
            .put("realm", realm)
            .put("signingAlias", existing)
            .put("hint", keyHint(encoded))
            .put("publicKeyFingerprint", hex(encoded))
        saveIdentity(metadata)
        return metadata
    }

    private fun persistFreshIdentity(keyPair: java.security.KeyPair) {
        val encoded = keyPair.public.encoded
        saveIdentity(
            JSONObject()
                .put("realm", realm)
                .put("signingAlias", stableAlias)
                .put("hint", keyHint(encoded))
                .put("publicKeyFingerprint", hex(encoded))
                .put("signingProfile", if (companionStorage) SOFTWARE_SIGNING_PROFILE else TEE_SIGNING_PROFILE),
        )
        recordKeyEvent("key_change", "fresh_identity", "persist_candidate", "prepared", keyPair.private, null, hex(encoded))
    }

    private fun saveIdentity(json: JSONObject) {
        var out: java.io.FileOutputStream? = null
        try {
            out = identityFile.startWrite()
            out.write(json.toString().toByteArray(Charsets.UTF_8))
            identityFile.finishWrite(out)
            identityCache = json
        } catch (e: Exception) {
            out?.let { identityFile.failWrite(it) }
            throw storageFailure("write_identity", e, "write_file", "identity")
        }
    }

    private fun generateSigningKey(alias: String, onPrepared: (java.security.KeyPair) -> Unit) {
        val builder = KeyGenParameterSpec.Builder(alias, KeyProperties.PURPOSE_SIGN or KeyProperties.PURPOSE_VERIFY)
            .setAlgorithmParameterSpec(ECGenParameterSpec("secp256r1"))
            .setDigests(KeyProperties.DIGEST_SHA256)
            .setUserAuthenticationRequired(false)
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setIsStrongBoxBacked(false)
        }
        var privateKey: PrivateKey? = null
        var persisted = false
        var op = "create_key"
        try {
            val generator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore")
            generator.initialize(builder.build())
            val keyPair = generator.generateKeyPair()
            privateKey = keyPair.private
            op = "persist_candidate"
            onPrepared(keyPair)
            persisted = true
            op = "verify_key_properties"
            if (companionStorage) requireKeystoreKey(keyPair.private) else requireTee(keyPair.private)
            op = "verify_signature"
            val message = "locationspoofer-tee-self-test-v1".toByteArray(Charsets.UTF_8)
            val signer = Signature.getInstance("SHA256withECDSA")
            signer.initSign(keyPair.private)
            signer.update(message)
            val signatureBytes = signer.sign()
            val verifier = Signature.getInstance("SHA256withECDSA")
            verifier.initVerify(keyPair.public)
            verifier.update(message)
            if (!verifier.verify(signatureBytes)) {
                throw KeyValidationFailure("signature_self_test_failed")
            }
        } catch (e: CloudException) {
            if (privateKey != null && !persisted) runCatching { store().deleteEntry(alias) }
            throw e
        } catch (e: Exception) {
            if (privateKey != null && !persisted) runCatching { store().deleteEntry(alias) }
            throw storageFailure(
                "generate_signing_key", e, op, "signing", privateKey,
                reason = if (op == "create_key") "key_generation_failed" else "signature_operation_failed",
            )
        }
    }

    private fun readKey(alias: String, kind: String): Key? {
        var attempts = 0
        fun load(): Key? {
            attempts++
            return keyReader(store(), alias)
        }
        val lookup = confirmCloudKeyLookup<Key> { runCatching { load() }.getOrNull() }
        if (lookup.attempts == 2 && lookup.key != null) {
            recordKeyEvent(
                if (kind == "signing") "read_signing_key" else "read_session",
                "key_read_recovered", "read_key", "retry_succeeded",
                lookup.key, null, null, attempts, kind,
            )
        }
        lookup.key?.let { return it }
        throw storageFailure(
            if (kind == "signing") "read_signing_key" else "read_session",
            KeyValidationFailure("key_read_failed"), "read_key", kind, null, attempts,
        )
    }

    private fun keyReader(keyStore: KeyStore, alias: String): Key? = keyStore.getKey(alias, null)

    /** 身份指纹提示：hex(sha256(realm + "\n" + 公钥 DER))，用于崩溃后人工比对密钥是否换过 */
    private fun keyHint(encoded: ByteArray): String =
        hex(MessageDigest.getInstance("SHA-256").digest(realm.toByteArray(Charsets.UTF_8) + "\n".toByteArray(Charsets.UTF_8) + encoded))

    private fun store(): KeyStore {
        val keyStore = KeyStore.getInstance("AndroidKeyStore")
        keyStore.load(null)
        return keyStore
    }

    private fun validSigningAlias(alias: String): Boolean =
        alias.startsWith(stableAlias) || alias == legacyAlias || alias == sessionAlias

    private fun signingEntry(): KeyStore.PrivateKeyEntry {
        val alias = identity().optString("signingAlias").ifEmpty { stableAlias }
        return signingKeyEntry(alias) ?: throw CloudException("device_recovery_required")
    }

    private fun signingKeyEntry(alias: String): KeyStore.PrivateKeyEntry? {
        val entry = store().getEntry(alias, null) as? KeyStore.PrivateKeyEntry
        return entry
    }

    private fun keyInfo(privateKey: PrivateKey): KeyInfo =
        try {
            KeyFactory.getInstance(privateKey.algorithm, "AndroidKeyStore")
                .getKeySpec(privateKey, KeyInfo::class.java) as KeyInfo
        } catch (e: Exception) {
            throw storageFailure("read_signing_key", e, "read_key_info", "signing", privateKey, reason = "key_read_failed")
        }

    private fun requireKeystoreKey(privateKey: PrivateKey) {
        if (privateKey.encoded != null) {
            throw storageFailure("read_signing_key", KeyValidationFailure("exportable_private_key"), "check_key_properties", "signing", privateKey)
        }
        if (keyInfo(privateKey).isUserAuthenticationRequired) {
            throw storageFailure("read_signing_key", KeyValidationFailure("authentication_required"), "check_key_properties", "signing", privateKey)
        }
    }

    private fun requireTee(privateKey: PrivateKey) {
        val info = keyInfo(privateKey)
        val insideSecureHardware = if (Build.VERSION.SDK_INT >= 31) {
            info.securityLevel == KeyProperties.SECURITY_LEVEL_TRUSTED_ENVIRONMENT
        } else {
            @Suppress("DEPRECATION")
            info.isInsideSecureHardware
        }
        teePreferences.edit().putBoolean("available", insideSecureHardware).apply()
        val failure = when {
            privateKey.encoded != null -> "exportable_private_key"
            info.isUserAuthenticationRequired -> "authentication_required"
            !insideSecureHardware -> "security_level_rejected"
            else -> null
        }
        if (failure != null) {
            throw storageFailure("read_signing_key", KeyValidationFailure(failure), "check_key_properties", "signing", privateKey)
        }
    }

    override fun sign(payload: String): String {
        val json = identity()
        val policy = if (json.has("teeEnrollment")) {
            CloudSigningFailurePolicy()
        } else {
            CloudSigningFailurePolicy(json.optInt("signingBufferFailures"), json.optLong("signingCooldownUntil"))
        }
        if (policy.coolingDown(System.currentTimeMillis())) {
            throw CloudException("storage_unavailable")
        }
        val entry = signingEntry()
        val privateKey = entry.privateKey
        try {
            val signer = Signature.getInstance("SHA256withECDSA")
            signer.initSign(privateKey)
            signer.update(payload.toByteArray(Charsets.UTF_8))
            return cloudDigestEncode(signer.sign())
        } catch (e: Exception) {
            // KeyStore 内部码非空（如 -29 KeyStoreException）时记一次冷却
            if (keyStoreInternalCode(e) != null) {
                try {
                    val buffered = policy.bufferFailure(System.currentTimeMillis())
                    saveIdentity(
                        JSONObject(json.toString())
                            .put("signingBufferFailures", buffered.failures)
                            .put("signingCooldownUntil", buffered.cooldownUntil),
                    )
                } catch (_: Throwable) {
                }
            }
            throw storageFailure("sign", e, "sign_data", "signing", privateKey)
        }
    }

    private fun retryableSigningFailure(e: Exception): Boolean {
        val internal = keyStoreInternalCode(e) ?: return false
        return internal == -26 || internal == -29 // USER_NOT_AUTHENTICATED / KeyStoreException 族可重试
    }

    private fun keyStoreInternalCode(e: Exception): Int? =
        generateSequence<Throwable>(e) { it.cause }
            .filterIsInstance<java.security.KeyStoreException>()
            .firstOrNull()
            ?.let { keystoreExceptionNumericCode(it) }

    private fun keystoreExceptionNumericCode(e: java.security.KeyStoreException): Int? =
        runCatching {
            val field = e.javaClass.methods.firstOrNull { it.name == "getNumericErrorCode" }
            field?.invoke(e) as? Int
        }.getOrNull()

    /** android.security.KeyStoreException 在 API 33+ 的布尔属性（反射读取，低版本返回 null） */
    private fun keystoreExceptionFlag(e: Throwable, getter: String): Boolean? =
        runCatching {
            e.javaClass.methods.firstOrNull { it.name == getter }?.invoke(e) as? Boolean
        }.getOrNull()

    // ---------- 设备身份操作 ----------

    override val deviceHint: String
        get() = synchronized(this) { identity().getString("hint") }

    override val deviceId: String
        get() = synchronized(this) { identity().optString("deviceId") }

    override val publicKey: String
        get() = synchronized(this) {
            cloudDigestEncode(signingEntry().certificate.publicKey.encoded)
        }

    override fun publicKeyFingerprint(): String =
        synchronized(this) { hex(signingEntry().certificate.publicKey.encoded) }

    override fun saveDeviceId(newDeviceId: String) {
        synchronized(this) {
            if (!UUID_PATTERN.matches(newDeviceId)) {
                throw IllegalArgumentException("Failed requirement.")
            }
            val json = identity()
            val existing = json.optString("deviceId")
            if (existing.isNotEmpty() && existing != newDeviceId) {
                throw CloudException("device_binding_mismatch")
            }
            saveIdentity(JSONObject(json.toString()).put("deviceId", newDeviceId))
        }
    }

    @Synchronized
    override fun adoptRecoveredDevice(deviceId: String, proof: String) {
        if (!UUID_PATTERN.matches(deviceId) || proof !in RECOVERY_PROOFS) {
            throw CloudException("device_binding_mismatch")
        }
        val json = identity()
        val tee = json.optJSONObject("teeEnrollment")
        val fingerprint = publicKeyFingerprint()
        clearSession()
        val updated = JSONObject(json.toString())
            .put("deviceId", deviceId)
            .put("publicKeyFingerprint", fingerprint)
            .put("signingProfile", if (companionStorage) SOFTWARE_SIGNING_PROFILE else TEE_SIGNING_PROFILE)
        tee?.let { updated.put("signingAlias", it.getString("alias")) }
        for (key in listOf("teeEnrollment", "signingMigration", "signingBufferFailures", "signingCooldownUntil")) {
            updated.remove(key)
        }
        saveIdentity(updated)
        recordKeyEvent("key_change", proof, "confirm_enrollment", "committed", null, json.optString("publicKeyFingerprint"), fingerprint)
    }

    @Synchronized
    override fun completeTeeEnrollment(requestId: String, previousDeviceId: String, fingerprint: String) {
        val pending = pendingTeeEnrollment() ?: throw CloudException("device_recovery_required")
        if (pending.requestId != requestId || pending.fingerprint != fingerprint ||
            !UUID_PATTERN.matches(previousDeviceId) ||
            (pending.previousDeviceId.isNotEmpty() && pending.previousDeviceId != previousDeviceId)
        ) {
            throw CloudException("device_binding_mismatch")
        }
        val json = identity()
        clearSession()
        val updated = JSONObject(json.toString())
            .put("signingAlias", json.getJSONObject("teeEnrollment").getString("alias"))
            .put("publicKeyFingerprint", fingerprint)
            .put("deviceId", previousDeviceId)
            .put("signingProfile", TEE_SIGNING_PROFILE)
        for (key in listOf("teeEnrollment", "signingMigration", "signingBufferFailures", "signingCooldownUntil")) {
            updated.remove(key)
        }
        saveIdentity(updated)
        recordKeyEvent("key_change", pendingReason(json), "confirm_enrollment", "committed", null, json.optString("publicKeyFingerprint"), fingerprint)
    }

    @Synchronized
    override fun pendingTeeEnrollment(): CloudTeeEnrollment? {
        val json = identity()
        val tee = json.optJSONObject("teeEnrollment") ?: return null
        val requestId = tee.getString("requestId")
        if (!UUID_PATTERN.matches(requestId)) {
            throw CloudException("device_recovery_required")
        }
        if (tee.getString("alias") != "$stableAlias.tee.$requestId") {
            throw CloudException("device_recovery_required")
        }
        return CloudTeeEnrollment(requestId, json.optString("deviceId"), json.optString("publicKeyFingerprint"), tee.getString("fingerprint"))
    }

    private fun pendingReason(json: JSONObject): String {
        val reason = json.optJSONObject("teeEnrollment")?.optString("reason")
        return if (reason != null && REASONS.contains(reason)) reason else "legacy_tee_upgrade"
    }

    @Synchronized
    override fun prepareHardwareIdentity() {
        if (companionStorage) {
            identity()
            return
        }
        val userManager = context.getSystemService(Context.USER_SERVICE) as? UserManager
        if (userManager != null && !userManager.isUserUnlocked) {
            throw CloudException("device_locked")
        }
        try {
            val metadata: JSONObject = identityMetadata() ?: try {
                loadIdentityMetadata()
            } catch (e: CloudException) {
                val fallback = identityMetadata()
                if (e.code != "device_recovery_required" || fallback == null) throw e
                fallback
            } ?: throw IllegalArgumentException("Required value was null.")
            val tee = metadata.optJSONObject("teeEnrollment")
            val reason: String = if (tee != null) {
                val alias = tee.getString("alias")
                if (readKey(alias, "signing") != null) {
                    identity(); return
                }
                "confirmed_pending_key_loss"
            } else if (metadata.optString("signingProfile") == TEE_SIGNING_PROFILE) {
                val alias = metadata.getString("signingAlias")
                if (readKey(alias, "signing") != null) {
                    identity(); return
                }
                "confirmed_key_loss"
            } else {
                "legacy_tee_upgrade"
            }
            val requestId = UUID.randomUUID().toString()
            val alias = "$stableAlias.tee.$requestId"
            generateSigningKey(alias) { keyPair -> persistPendingEnrollment(metadata, requestId, alias, reason, keyPair) }
            identity()
        } catch (e: CloudException) {
            if (!confirmedSigningInvalidation) throw e
            prepareConfirmedReplacement(identityMetadata())
        } catch (e: Exception) {
            throw storageFailure("prepare_tee", e, "read_key", "signing")
        }
    }

    private fun persistPendingEnrollment(previous: JSONObject, requestId: String, alias: String, reason: String, keyPair: java.security.KeyPair) {
        val encoded = keyPair.public.encoded
        val updated = JSONObject(previous.toString())
        if (updated.optString("hint").isEmpty()) {
            updated.put("hint", keyHint(encoded))
        }
        updated.put(
            "teeEnrollment",
            JSONObject()
                .put("requestId", requestId)
                .put("alias", alias)
                .put("fingerprint", hex(encoded))
                .put("reason", reason),
        )
        saveIdentity(updated)
        recordKeyEvent("key_change", reason, "persist_candidate", "prepared", keyPair.private, previous.optString("publicKeyFingerprint"), hex(encoded))
    }

    @Synchronized
    override fun preparePasswordIdentity() {
        try {
            prepareHardwareIdentity()
            sign("locationspoofer-password-device-check-v1")
        } catch (e: CloudException) {
            if (!confirmedSigningInvalidation && !confirmedIdentityCorruption) throw e
            prepareConfirmedReplacement(if (confirmedIdentityCorruption) null else identityMetadata())
        }
    }

    @Throws(CloudException::class)
    private fun prepareConfirmedReplacement(previous: JSONObject?) {
        val requestId = UUID.randomUUID().toString()
        val alias = "$stableAlias.tee.$requestId"
        generateSigningKey(alias) { keyPair -> persistConfirmedReplacement(previous, requestId, alias, keyPair) }
        confirmedSigningInvalidation = false
        confirmedIdentityCorruption = false
        identity()
    }

    private fun persistConfirmedReplacement(previous: JSONObject?, requestId: String, alias: String, keyPair: java.security.KeyPair) {
        val updated = previous?.let { JSONObject(it.toString()) } ?: JSONObject()
        if (previous == null) {
            updated.put("realm", realm).put("signingAlias", stableAlias).put("publicKeyFingerprint", "")
        }
        if (updated.optString("hint").isEmpty()) {
            updated.put("hint", keyHint(keyPair.public.encoded))
        }
        updated.put(
            "teeEnrollment",
            JSONObject()
                .put("requestId", requestId)
                .put("alias", alias)
                .put("fingerprint", hex(keyPair.public.encoded))
                .put("reason", "confirmed_key_invalidated"),
        )
        saveIdentity(updated)
        val previousFingerprint = previous?.optString("publicKeyFingerprint")
        recordKeyEvent("key_change", "confirmed_key_invalidated", "persist_candidate", "prepared", keyPair.private, previousFingerprint, hex(keyPair.public.encoded))
    }

    @Synchronized
    override fun prepareRecoveryInfo(): String {
        prepareHardwareIdentity()
        val pending = pendingTeeEnrollment()
        val json = JSONObject()
            .put("deviceId", deviceId)
            .put("hint", deviceHint)
            .put("publicKey", publicKey)
            .put("publicKeyFingerprint", publicKeyFingerprint())
        pending?.let {
            json.put("teeEnrollmentId", it.requestId).put("oldPublicKeyFingerprint", it.previousFingerprint)
        }
        return json.toString()
    }

    override fun deviceHardwareIdentity(): CloudHardwareIdentity =
        if (!companionStorage) {
            DeviceSignalCollector(realm).collect()
        } else {
            CloudHardwareIdentity()
        }

    override fun deviceSignals(): Map<String, String> = deviceHardwareIdentity().signals.orEmpty()

    override fun getSupportsPasswordAccess(): Boolean = true

    override fun getSupportsSessionProof(): Boolean = true

    // ---------- 能力/杂项 ----------

    @Synchronized
    fun accountSigningProfile(): String = try {
        val privateKey = signingEntry().privateKey
        val info = keyInfo(privateKey)
        val insideSecureHardware = if (Build.VERSION.SDK_INT >= 31) {
            info.securityLevel == KeyProperties.SECURITY_LEVEL_TRUSTED_ENVIRONMENT
        } else {
            @Suppress("DEPRECATION")
            info.isInsideSecureHardware
        }
        if (insideSecureHardware) TEE_SIGNING_PROFILE else SOFTWARE_SIGNING_PROFILE
    } catch (_: Throwable) {
        SOFTWARE_SIGNING_PROFILE
    }

    @Synchronized
    override fun signingProfile(): String? {
        val json = identity()
        return if (json.has("teeEnrollment")) {
            TEE_SIGNING_PROFILE
        } else {
            json.optString("signingProfile").ifEmpty { null }
        }
    }

    override fun softwareAndroidIdHash(): String? =
        if (companionStorage) {
            SoftwareDeviceIdentity.digest(realm, Settings.Secure.getString(context.contentResolver, "android_id"))
        } else {
            null
        }

    override fun teeAvailability(): Boolean? =
        if (teePreferences.contains("available")) teePreferences.getBoolean("available", false) else null

    override fun clientInfo(): CloudClientInfo = ClientInfoCollector(context).collect()

    override fun mapPreviewBinding(): CloudRuntimeBinding? = mapPreview.read()

    override fun mapResourceCache(): CloudMapResourceCache = mapCache

    override fun saveMapPreviewBinding(binding: CloudRuntimeBinding?) {
        mapPreview.write(binding)
    }

    override fun companionMode(): Boolean = companionStorage

    override fun monotonicTimeNanos(): Long = SystemClock.elapsedRealtimeNanos()

    override fun nonce(): String = super.nonce()

    @Synchronized
    override fun readRuntimeRun(): String? = try {
        String(runtimeRunFile.readFully().copyOfRange(0, minOf(256, runtimeRunFile.baseFile.length().toInt())), Charsets.UTF_8)
    } catch (_: java.io.FileNotFoundException) {
        null
    } catch (_: IOException) {
        null
    }

    @Synchronized
    override fun writeRuntimeRun(run: String?) {
        if (run == null) {
            runtimeRunFile.delete()
            return
        }
        var out: java.io.FileOutputStream? = null
        try {
            out = runtimeRunFile.startWrite()
            out.write(run.toByteArray(Charsets.UTF_8))
            runtimeRunFile.finishWrite(out)
        } catch (e: Exception) {
            out?.let { runtimeRunFile.failWrite(it) }
            throw e
        }
    }

    override fun selectCompanionMode(enabled: Boolean) {
        super.selectCompanionMode(enabled)
    }

    // ---------- 诊断 ----------

    private fun diagnosticQueue(): CloudDiagnosticQueue {
        val file = AtomicFile(File(context.cacheDir, "cloud-diagnostics-$originId.json"))
        return CloudDiagnosticQueue(
            load = {
                try {
                    file.readFully().toString(Charsets.UTF_8)
                } catch (_: IOException) {
                    null
                }
            },
            save = { text ->
                val stream = file.startWrite()
                try {
                    stream.write(text.toByteArray(Charsets.UTF_8))
                    file.finishWrite(stream)
                } catch (e: Throwable) {
                    file.failWrite(stream)
                    throw e
                }
            },
        )
    }

    override fun pendingDiagnostics(): List<CloudDiagnostic> =
        try {
            diagnosticQueue().pending()
        } catch (_: Throwable) {
            emptyList()
        }

    override fun acknowledgeDiagnostics(diagnostics: List<CloudDiagnostic>) {
        try {
            diagnosticQueue().acknowledge(diagnostics)
        } catch (_: Throwable) {
        }
    }

    override fun recordDiagnostic(operation: String, code: String, httpStatus: Int?, detail: String?) {
        val category = when {
            operation == "framework_publish" -> "framework"
            code == "network_error" -> "network"
            code == "invalid_response" -> "format"
            httpStatus != null -> "server"
            code.startsWith("invalid_") -> "format"
            else -> "other"
        }
        try {
            val details = detail?.takeIf { REASONS.contains(it) }?.let {
                CloudDiagnosticDetails(phase = "verify_request", reason = it)
            }
            diagnosticQueue().record(
                operation, code, category, clientInfo(), variant(), abi(),
                requiresUnlock = if (code == "device_locked") true else null,
                httpStatus = httpStatus, details = details,
            )
        } catch (_: Throwable) {
        }
    }

    private fun recordKeyEvent(
        operation: String,
        reason: String,
        phase: String,
        outcome: String,
        key: Key?,
        previousFingerprint: String?,
        newFingerprint: String?,
        attempts: Int = 1,
        kind: String = "signing",
    ) {
        try {
            val fingerprints = { value: String? ->
                value?.takeIf { it.length == 64 && UUID_PATTERN.matches(it).not() && FINGERPRINT.matches(it) }
            }
            val base = diagnosticCollector().collect(InvalidKeyException(), reason, kind, key, attempts, phase)
            val details = base.copy(
                reason = reason,
                previousKeyFingerprint = fingerprints(previousFingerprint),
                keyFingerprint = fingerprints(newFingerprint),
            )
            diagnosticQueue().record(
                operation, "device_key_changed", "keystore", clientInfo(), variant(), abi(),
                details = details,
            )
        } catch (_: Throwable) {
        }
    }

    private fun recordStorageFailure(
        operation: String,
        exc: Exception,
        phase: String?,
        kind: String?,
        key: Key? = null,
        attempts: Int = 1,
        outcome: String? = "failed",
        reason: String? = null,
    ) {
        try {
            val chain = generateSequence<Throwable>(exc) { it.cause }.take(4).toList()
            val keystoreException = chain.filterIsInstance<android.security.KeyStoreException>().firstOrNull()
            val keystoreCode = if (Build.VERSION.SDK_INT >= 33 && keystoreException != null) {
                keystoreException.numericErrorCode
            } else {
                null
            }
            val errno = chain.filterIsInstance<android.system.ErrnoException>().firstOrNull()?.errno
            val category = keystoreException?.let { "keystore" }
                ?: when {
                    chain.any { it is java.security.KeyStoreException } -> "keystore"
                    chain.any { it is IOException } -> "io"
                    chain.any { it is java.security.GeneralSecurityException } -> "crypto"
                    else -> "other"
                }
            Log.w("CloudStorage", "operation=$operation types=${chain.joinToString(",") { it.javaClass.simpleName }} keystoreCode=${keystoreCode ?: "none"}")
            val diagnosticReason = chain.filterIsInstance<KeyValidationFailure>().firstOrNull()?.diagnosticReason
                ?: reason
                ?: if (operation == "sign") "signature_operation_failed" else null
            val details = diagnosticCollector().collect(exc, phase, kind, key, maxOf(attempts, 1), outcome)
                .copy(
                    reason = diagnosticReason,
                    previousKeyFingerprint = identityCache?.optString("publicKeyFingerprint")?.takeIf { FINGERPRINT.matches(it) },
                    keyFingerprint = identityCache?.optJSONObject("teeEnrollment")?.optString("fingerprint")
                        ?.takeIf { FINGERPRINT.matches(it) },
                )
            diagnosticQueue().record(
                operation, "storage_unavailable", category, clientInfo(), variant(), abi(),
                keystoreCode = keystoreCode,
                transient = if (Build.VERSION.SDK_INT >= 33 && keystoreException != null) keystoreExceptionFlag(keystoreException, "getIsTransientFailure") else null,
                requiresUnlock = if (Build.VERSION.SDK_INT >= 33 && keystoreException != null) keystoreExceptionFlag(keystoreException, "getRequiresUserAuthentication") else null,
                osErrorCode = errno,
                details = details,
            )
        } catch (_: Throwable) {
        }
    }

    private fun diagnosticCollector(): CloudStorageDiagnosticCollector =
        CloudStorageDiagnosticCollector(context)

    private fun storageFailure(
        operation: String,
        exc: Exception,
        phase: String? = null,
        kind: String? = null,
        key: Key? = null,
        attempts: Int = 1,
        outcome: String? = "failed",
        reason: String? = null,
    ): CloudException {
        recordStorageFailure(operation, exc, phase, kind, key, attempts, outcome, reason)
        return CloudException("storage_unavailable")
    }

    private fun variant(): String = "global"

    private fun abi(): String = Build.SUPPORTED_ABIS.firstOrNull() ?: ""

    // ---------- 地图缓存密钥 ----------

    @Synchronized
    @Throws(Throwable::class)
    fun mapEncryptionKey(): SecretKey {
        mapKey?.let { return it }
        val alias = "locationspoofer.cloud.maps.v1.$originId"
        val existing = readKey(alias, "session")
        if (existing != null) {
            if (existing !is SecretKey) {
                throw storageFailure("read_session", KeyValidationFailure("key_type_mismatch"), "read_key", "session", existing)
            }
            mapKey = existing
            return existing
        }
        val generator = KeyGenerator.getInstance("AES", "AndroidKeyStore")
        generator.init(
            KeyGenParameterSpec.Builder(alias, KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
                .setKeySize(256)
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                .setRandomizedEncryptionRequired(true)
                .build(),
        )
        return generator.generateKey().also { mapKey = it }
    }

    companion object {
        const val PRODUCT_REALM: String = "locationspoofer.official.device.v2"
        private val MAGIC = byteArrayOf(76, 67, 86, 50) // "LCV2"
        private const val MIN_SESSION_BYTES = 28
        private const val MAX_FILE_BYTES = 65_536
        internal val UUID_PATTERN = Regex("[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
        private val FINGERPRINT = Regex("[a-f0-9]{64}")
        private val RECOVERY_PROOFS = setOf("password_recovery", "guest_code_recovery", "unused_guest_replacement")

        /** 与 CloudDiagnosticDetails.REASONS 对齐的恢复原因集合 */
        internal val REASONS: Set<String> = setOf(
            "legacy_tee_upgrade", "confirmed_key_loss", "confirmed_pending_key_loss", "confirmed_key_invalidated",
        )

        /** SHA-256 hex（小写，64 位） */
        fun hex(bytes: ByteArray): String =
            MessageDigest.getInstance("SHA-256").digest(bytes).joinToString("") { "%02x".format(it) }
    }

    /** 与原版语义一致的会话文件损坏标记 */
    inner class CorruptSession : Exception("corrupt_session")
}
