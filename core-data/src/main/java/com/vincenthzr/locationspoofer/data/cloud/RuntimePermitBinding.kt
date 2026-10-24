package com.vincenthzr.locationspoofer.data.cloud

data class RuntimePermitBinding(
    val userId: String,
    val deviceId: String,
    val publicKeyFingerprint: String,
    val sessionId: String,
)
