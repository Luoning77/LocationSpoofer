package com.vincenthzr.locationspoofer.data.cloud

data class RuntimeAuthorization(
    val envelope: RuntimePermitEnvelope,
    val claims: RuntimePermitClaims,
    val requiredCapabilities: Set<String> = setOf("spoof"),
    val runGeneration: Long = 0L,
)
