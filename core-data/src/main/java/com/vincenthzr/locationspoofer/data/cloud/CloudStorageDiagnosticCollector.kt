package com.vincenthzr.locationspoofer.data.cloud

import android.app.KeyguardManager
import android.content.Context
import android.os.Build
import android.os.Process
import android.os.SystemClock
import android.os.UserManager
import android.security.keystore.KeyInfo
import java.security.Key
import java.security.KeyFactory
import java.security.PrivateKey
import java.util.UUID
import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory

/**
 * 云存储诊断收集器：把异常转成 CloudDiagnosticDetails（含进程/设备状态与密钥巡检）。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudStorageDiagnosticCollector.java
 */
class CloudStorageDiagnosticCollector(private val context: Context) {

    fun collect(
        exc: Exception,
        phase: String?,
        role: String?,
        key: Key?,
        attempts: Int,
        outcome: String?,
    ): CloudDiagnosticDetails {
        val now = SystemClock.elapsedRealtime()
        val keystoreException = if (Build.VERSION.SDK_INT >= 33) {
            generateSequence<Throwable>(exc) { it.cause }
                .filterIsInstance<android.security.KeyStoreException>()
                .firstOrNull()
        } else {
            null
        }
        val processUptime = (now - Process.getStartElapsedRealtime()).coerceAtLeast(0)
        val userUnlocked = runCatching {
            (context.getSystemService(UserManager::class.java))?.isUserUnlocked
        }.getOrNull()
        val deviceLocked = runCatching {
            (context.getSystemService(KeyguardManager::class.java))?.isDeviceLocked
        }.getOrNull()
        return CloudDiagnosticDetails(
            phase = phase ?: "unknown",
            causes = CloudDiagnosticDetails.captureCauses(exc),
            internalKeystoreCode = keystoreException?.let { internalCode(it.toString()) },
            systemError = keystoreException?.takeIf { Build.VERSION.SDK_INT >= 33 }?.isSystemError,
            retryPolicy = keystoreException?.takeIf { Build.VERSION.SDK_INT >= 33 }?.retryPolicy,
            attempts = attempts,
            outcome = outcome ?: "failed",
            processRunId = PROCESS_RUN_ID,
            deviceUptimeMs = now,
            processUptimeMs = processUptime,
            userUnlocked = userUnlocked,
            deviceLocked = deviceLocked,
            key = role?.let { inspectKey(it, key) },
        )
    }

    /** 密钥巡检：AndroidKeyStore KeyInfo → 安全区/认证属性；异常时记 inspectionException */
    private fun inspectKey(role: String, key: Key?): CloudDiagnosticKey {
        if (key == null) return CloudDiagnosticKey(role, "unavailable")
        return try {
            val info: KeyInfo = when (key) {
                is PrivateKey ->
                    KeyFactory.getInstance(key.algorithm, "AndroidKeyStore")
                        .getKeySpec(key, KeyInfo::class.java) as KeyInfo
                is SecretKey ->
                    SecretKeyFactory.getInstance(key.algorithm, "AndroidKeyStore")
                        .getKeySpec(key, KeyInfo::class.java) as KeyInfo
                else -> return CloudDiagnosticKey(role, "unavailable")
            }
            val securityLevel = if (Build.VERSION.SDK_INT >= 31) {
                when (info.securityLevel) {
                    -1 -> "unknown_secure"
                    0 -> "software"
                    1 -> "tee"
                    2 -> "strongbox"
                    else -> "unknown"
                }
            } else {
                @Suppress("DEPRECATION")
                if (info.isInsideSecureHardware) "unknown_secure" else "software"
            }
            CloudDiagnosticKey(
                role = role,
                status = "available",
                securityLevel = securityLevel,
                authenticationRequired = info.isUserAuthenticationRequired,
                authenticationType = if (Build.VERSION.SDK_INT >= 30) info.userAuthenticationType else null,
                authenticationValiditySeconds = info.userAuthenticationValidityDurationSeconds,
                invalidatedByBiometricEnrollment = info.isInvalidatedByBiometricEnrollment,
                unlockedDeviceRequired = if (Build.VERSION.SDK_INT >= 37) info.isUnlockedDeviceRequired else null,
            )
        } catch (e: Exception) {
            CloudDiagnosticKey(role, "unavailable", inspectionException = CloudDiagnosticDetails.exceptionType(e))
        }
    }

    companion object {
        private val PROCESS_RUN_ID: String = UUID.randomUUID().toString()
        private val INTERNAL_CODE = Regex("internal Keystore code: (-?[0-9]{1,6})(?=[ )])")

        /** 从 KeyStoreException 文本中取最后一个 internal Keystore code（范围 ±100000） */
        internal fun internalCode(text: String): Int? =
            INTERNAL_CODE.findAll(text.take(256)).lastOrNull()
                ?.groupValues?.get(1)?.toIntOrNull()
                ?.takeIf { it in -100_000..100_000 }
    }
}
