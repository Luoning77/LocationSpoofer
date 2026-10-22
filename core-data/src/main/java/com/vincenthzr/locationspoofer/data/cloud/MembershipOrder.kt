package com.vincenthzr.locationspoofer.data.cloud

/** 会员订单 */
data class MembershipOrder(
    val id: String,
    val planId: String,
    val title: String,
    val durationDays: Int,
    val amountCents: Int,
    val checkoutMode: String,
    val status: String,
    val expiresAt: Long,
    val paidAt: Long? = null,
    val grantedUntil: Long? = null,
    val payUrl: String? = null,
    val qrUrl: String? = null,
    val productKind: String? = null,
    val slotId: String? = null
)
