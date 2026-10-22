package com.vincenthzr.locationspoofer.data.cloud

import android.content.Context

/**
 * 账号方案会话存储：包装加密存储，固定账号协议能力。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/AccountCloudSessionStore.java
 *
 * 原版有两个构造：主构造 (Context, String) 内部建 EncryptedCloudSessionStore(
 *   context, name + "/account-session-v3", "locationspoofer-account-session-v3",
 *   realm 默认档, companion=true, 其余默认)；次构造直接接收已建好的 store。
 * EncryptedCloudSessionStore 恢复后如构造签名有变，此处需同步调整。
 */
class AccountCloudSessionStore private constructor(
    private val store: EncryptedCloudSessionStore,
) : CloudSessionStore by store {

    constructor(context: Context, name: String) : this(
        EncryptedCloudSessionStore(
            context = context,
            name = "$name/account-session-v3",
            realm = "locationspoofer-account-session-v3",
            companionStorage = true,
        ),
    )

    override fun deviceHardwareIdentity(): CloudHardwareIdentity =
        DeviceSignalCollector(EncryptedCloudSessionStore.PRODUCT_REALM).collectDetailed()

    override fun getAccountProtocol(): Boolean = true

    override fun getHardwareSnapshotProtocol(): Boolean = true

    override fun getSupportsPasswordAccess(): Boolean = false

    override fun prepareHardwareIdentity() {
        store.preparePasswordIdentity()
    }

    override fun saveDeviceId(deviceId: String) {
        store.adoptRecoveredDevice(deviceId, "password_recovery")
    }

    override fun signingProfile(): String = store.accountSigningProfile()

    override fun selectCompanionMode(enabled: Boolean) {
        // 账号方案固定主存储，不支持伴生模式切换（原版空实现）
    }
}
