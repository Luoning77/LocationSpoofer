package com.vincenthzr.locationspoofer.data.cloud

/**
 * 签名操作重试辅助。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudSigningRetryKt.java
 */
object CloudSigningRetry {

    /**
     * 执行一次操作；若 [retryable] 判定可重试，先跑 [beforeRetry]（如退避）再重试一次。
     * 重试成功后回调 [onRetry]（记录诊断，吞异常）并返回重试结果。
     */
    inline fun <T> retryCloudSignature(
        retryable: (Exception) -> Boolean,
        beforeRetry: () -> Unit,
        onRetry: (Exception) -> Unit = {},
        operation: () -> T,
    ): T {
        try {
            return operation()
        } catch (e: Exception) {
            if (!retryable(e)) throw e
            beforeRetry()
            val retried = operation()
            try {
                onRetry(e)
            } catch (_: Throwable) {
            }
            return retried
        }
    }

    /**
     * KeyStore 过期类错误是否可重试：
     * internalCode==-28（KeyPermanentlyInvalidated 旧码）→ true；
     * 无内部码但 SDK33 numeric==15（KEY_NOT_YET_VALID 等）→ true；要求用户认证 → false。
     */
    fun retryExpiredCloudOperation(internalCode: Int?, numericCode: Int?, requiresUserAuthentication: Boolean): Boolean {
        if (requiresUserAuthentication) return false
        if (internalCode != null && internalCode == -28) return true
        return internalCode == null && numericCode != null && numericCode == 15
    }
}
