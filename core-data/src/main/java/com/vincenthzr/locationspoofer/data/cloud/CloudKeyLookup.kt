package com.vincenthzr.locationspoofer.data.cloud

/**
 * 键查找结果：key 与尝试次数；confirmedMissing = key 为空且已尝试 2 次。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudKeyLookup.java
 */
data class CloudKeyLookup<T>(
    val key: T?,
    val attempts: Int,
) {
    val confirmedMissing: Boolean
        get() = key == null && attempts == 2
}

/**
 * 键查找辅助：先取一次，非空即确认；为空再试一次并记两次尝试。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudKeyLookupKt.java
 */
inline fun <T> confirmCloudKeyLookup(lookup: () -> T?): CloudKeyLookup<T> {
    val first = lookup()
    return if (first != null) {
        CloudKeyLookup(first, attempts = 1)
    } else {
        CloudKeyLookup(lookup(), attempts = 2)
    }
}
