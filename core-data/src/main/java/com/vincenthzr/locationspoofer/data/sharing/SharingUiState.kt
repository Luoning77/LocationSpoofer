package com.vincenthzr.locationspoofer.data.sharing

data class SharingUiState(
    val enabled: Boolean = false,
    val eligible: Boolean = false,
    val available: Boolean = false,
    val counts: SharingCounts = SharingCounts(),
    val loading: Boolean = false,
    val uploading: Boolean = false,
    val error: String? = null,
)
