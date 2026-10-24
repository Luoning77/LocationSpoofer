package com.vincenthzr.locationspoofer.data.cloud

/**
 * 运行时许可声明：keyId + 绑定 + 能力集 + 签发/过期时间。
 * 恢复自 v3.0.16 APK（build 303f46d）defpackage/qk2.java（toString 标注 RuntimePermitClaims）
 */
data class RuntimePermitClaims(
    val keyId: String,
    val binding: RuntimePermitBinding,
    val capabilities: Set<String>,
    val issuedAt: Long,
    val expiresAt: Long,
)
