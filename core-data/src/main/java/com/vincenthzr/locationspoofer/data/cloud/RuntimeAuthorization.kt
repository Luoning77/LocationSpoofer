package com.vincenthzr.locationspoofer.data.cloud

/**
 * 运行时授权：信封 + 已验证声明 + 所需能力 + 运行代数。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/RuntimeAuthorization.java
 */
data class RuntimeAuthorization(
    val envelope: RuntimePermitEnvelope,
    val claims: RuntimePermitClaims,
    val requiredCapabilities: Set<String> = setOf("spoof"),
    val runGeneration: Long = 0L,
)
