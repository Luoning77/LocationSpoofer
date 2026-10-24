package com.vincenthzr.locationspoofer.data.update

/**
 * 账号更新入口：云端路径常量。
 * 恢复自 v3.0.16 APK（build 303f46d）data/update/AccountUpdates.java
 *
 * 注：parse / parsePreference 依赖 SelfHostedUpdates.parseCatalog（尚未恢复），
 * 先落盘 CloudRepository 所需的两个路径常量；解析逻辑随 SelfHostedUpdates 一并恢复。
 */
object AccountUpdates {
    const val CHECK_PATH = "/v2/client/updates"
    const val PREFERENCE_PATH = "/v2/account/beta"
}
