package com.vincenthzr.locationspoofer.data.sync

import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState
import com.vincenthzr.locationspoofer.data.cloud.CloudException

/**
 * 同步权限暂停状态：记录最近一次权限拒绝码，账号键变化或强制刷新时清除。
 * 恢复自 v3.0.16 APK（build 303f46d）data/sync/SyncPermissionPause.java
 */
class SyncPermissionPause {
    var code: String? = null
        private set

    private var key: SyncAccess.AccountKey? = null

    /** 仅在已有账号键且异常属于权限拒绝族时记录 code */
    fun reject(exc: Exception) {
        if (key == null || !SyncAccess.denied(exc)) return
        code = (exc as CloudException).code
    }

    fun update(state: CloudAccountState, force: Boolean = false) {
        val accountKey = SyncAccess.accountKey(state)
        if (accountKey != key || force) {
            code = null
        }
        key = accountKey
    }
}
