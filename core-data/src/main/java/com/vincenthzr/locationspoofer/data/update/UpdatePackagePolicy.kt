package com.vincenthzr.locationspoofer.data.update

/**
 * 更新包准入策略。
 * 恢复自 v3.0.16 APK（build 303f46d）data/update/UpdatePackagePolicy.java
 */
object UpdatePackagePolicy {

    /** 版本号高于当前（或相等且允许同版本重装）且 ABI 受支持才可安装 */
    fun canInstall(artifact: UpdateArtifact, currentVersionCode: Long, supportedAbis: Set<String>, allowSameVersion: Boolean): Boolean =
        (artifact.versionCode > currentVersionCode || (allowSameVersion && artifact.versionCode.toLong() == currentVersionCode)) &&
            artifact.abi in supportedAbis

    /** 身份完全匹配：versionCode/Name/scheme 一致且 ABI 集合相等 */
    fun matchesIdentity(artifact: UpdateArtifact, versionCode: Long, versionName: String, scheme: String, abis: Set<String>): Boolean =
        versionCode == artifact.versionCode.toLong() &&
            versionName == artifact.versionName &&
            scheme == artifact.scheme &&
            abis == setOf(artifact.abi)

    fun accepts(artifact: UpdateArtifact, currentVersionCode: Long, identityVersionCode: Long, versionName: String, scheme: String, identityAbis: Set<String>, supportedAbis: Set<String>, allowSameVersion: Boolean): Boolean =
        canInstall(artifact, currentVersionCode, supportedAbis, allowSameVersion) &&
            matchesIdentity(artifact, identityVersionCode, versionName, scheme, identityAbis)
}
