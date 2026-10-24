package com.vincenthzr.locationspoofer.data.cloud

open class RuntimePermitVerifier(
    private val monotonicClock: () -> Long = { android.os.SystemClock.elapsedRealtime() },
    private val wallClock: () -> Long = { System.currentTimeMillis() },
) {
    open fun verify(
        envelope: RuntimePermitEnvelope,
        binding: RuntimePermitBinding,
        requiredCapabilities: Set<String>,
    ): RuntimePermitClaims = error("RuntimePermitVerifier.verify")

    open fun markStopped() {
    }

    open fun isValid(
        binding: RuntimePermitBinding?,
        requiredCapabilities: Set<String>,
    ): Boolean = false

    open fun remainingMillis(
        binding: RuntimePermitBinding?,
        requiredCapabilities: Set<String>,
    ): Long = 0L

    open fun nowMillis(): Long = wallClock()

    open fun nowMonotonicMillis(): Long = monotonicClock()
}
