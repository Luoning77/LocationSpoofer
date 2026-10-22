package com.vincenthzr.locationspoofer.data.cloud

/**
 * 硬件 SoC 序列号规范化工具。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/HardwareIdentity.java
 *
 * normalizedSocSerial 语义：
 * 1. trim + 小写，剥离 "0x" 前缀
 * 2. 长度 ∈ [5, 64]，且全部为 [0-9a-f]
 * 3. 非"全 0"、非"全 f"
 * 4. 剥离前导 0 后补齐到 16 位（padStart(16, '0')）
 */
object HardwareIdentity {

    private const val HEX_DIGITS = "0123456789abcdef"

    fun normalizedSocSerial(raw: String): String? {
        val cleaned = raw.trim().lowercase().removePrefix("0x")
        val length = cleaned.length
        if (length < 5 || length >= 65) return null
        if (cleaned.any { it !in HEX_DIGITS }) return null
        if (cleaned.all { it == '0' } || cleaned.all { it == 'f' }) return null
        val trimmed = cleaned.dropWhile { it == '0' }
        return trimmed.padStart(16, '0')
    }

    /** 返回第一个能规范化成功的序列号 */
    fun socSerial(candidates: List<String>): String? =
        candidates.firstNotNullOfOrNull { normalizedSocSerial(it) }
}
