package com.vincenthzr.locationspoofer.data.cloud

data class RuntimePermitClaims(
    val keyId: String,
    val binding: RuntimePermitBinding,
    val capabilities: Set<String>,
    val issuedAt: Long,
    val expiresAt: Long,
)
