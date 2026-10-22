package com.vincenthzr.locationspoofer.data.sync

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState
import com.vincenthzr.locationspoofer.data.cloud.CloudException

/**
 * 同步权限判定。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sync/SyncAccess.java
 */
object SyncAccess {

    /** 账号身份键：未验证或无账号时为 null */
    data class AccountKey(
        val id: String,
        val session: String,
        val guest: Boolean,
        val plan: String,
        val expiresAt: Long?,
        val softwareRestricted: Boolean,
    )

    fun accountKey(state: CloudAccountState): AccountKey? {
        var account = state.account
        if (account != null && !state.validated) {
            account = null
        }
        return account?.let {
            AccountKey(
                id = it.id,
                session = it.sessionId,
                guest = it.isGuest,
                plan = it.plan,
                expiresAt = it.subscriptionExpiresAt,
                softwareRestricted = it.softwareMembershipRequired,
            )
        }
    }

    fun allowed(state: CloudAccountState): Boolean {
        if (!state.validated) return false
        val account = state.account ?: return false
        return !account.isGuest && account.plan == "pro" && !account.softwareMembershipRequired
    }

    /** 403 且 code ∈ 订阅/会员族 → 权限拒绝 */
    fun denied(exc: Exception): Boolean {
        if (exc !is CloudException) return false
        val httpStatus = exc.httpStatus ?: return false
        if (httpStatus != 403) return false
        return exc.code in DENIED_CODES
    }

    fun selection(state: CloudAccountState, selection: SyncSelection): SyncSelection =
        if (allowed(state)) {
            selection
        } else {
            selection.copy(enabled = false, categories = emptySet())
        }

    private val DENIED_CODES = setOf(
        "subscription_required",
        "software_membership_required",
        "registered_account_required",
        "member_required",
    )
}
