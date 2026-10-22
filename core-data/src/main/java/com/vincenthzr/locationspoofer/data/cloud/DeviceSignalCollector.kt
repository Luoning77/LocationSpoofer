package com.vincenthzr.locationspoofer.data.cloud

import java.security.MessageDigest

/**
 * 硬件设备信号采集器：通过 su 执行 getprop / sysfs 读取序列号族，
 * 规范化后按 "realm\n<name>\n<value>" 计算 SHA-256 信号哈希。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/DeviceSignalCollector.java
 */
class DeviceSignalCollector(private val realm: String) {

    fun collect(): CloudHardwareIdentity {
        var process: Process? = null
        var identity = CloudHardwareIdentity()
        try {
            process = ProcessBuilder("su", "-c", ROOT_SIGNALS_COMMAND)
                .redirectErrorStream(false)
                .start()
        } catch (_: Throwable) {
            process = null
        }
        if (process != null) {
            try {
                process.outputStream.close()
                if (process.waitFor(1_500L, java.util.concurrent.TimeUnit.MILLISECONDS) &&
                    process.exitValue() == 0
                ) {
                    val input = process.inputStream
                    try {
                        val buf = ByteArray(2_048)
                        var read = 0
                        while (read < 2_048) {
                            val n = input.read(buf, read, 2_048 - read)
                            if (n <= 0) break
                            read += n
                        }
                        val lines = String(buf, 0, read, Charsets.UTF_8).lines()
                        identity = Companion.serialIdentity(realm, lines)
                    } finally {
                        runCatching { input.close() }
                    }
                }
            } catch (_: Throwable) {
            } finally {
                runCatching { process.destroyForcibly() }
                runCatching { process.inputStream.close() }
                runCatching { process.errorStream.close() }
            }
        }
        return identity
    }

    fun collectDetailed(): CloudHardwareIdentity {
        var process: Process? = null
        return try {
            process = ProcessBuilder("su", "-c", DETAILS_COMMAND)
                .redirectErrorStream(false)
                .start()
            try {
                process.outputStream.close()
                if (!process.waitFor(6_000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    Companion.failedSnapshot("timeout")
                } else when (process.exitValue()) {
                    0 -> {
                        val input = process.inputStream
                        val buf = ByteArray(8_192)
                        var read = 0
                        try {
                            while (read < 8_192) {
                                val n = input.read(buf, read, 8_192 - read)
                                if (n <= 0) break
                                read += n
                            }
                            val output = String(buf, 0, read, Charsets.UTF_8)
                            Companion.detailedIdentity(realm, output)
                        } finally {
                            runCatching { input.close() }
                        }
                    }
                    1 -> Companion.failedSnapshot("denied")
                    else -> Companion.failedSnapshot("failed")
                }
            } catch (_: Exception) {
                Companion.failedSnapshot("failed")
            }
        } catch (_: Exception) {
            Companion.failedSnapshot("unavailable")
        } finally {
            process?.let {
                runCatching { it.destroyForcibly() }
                runCatching { it.inputStream.close() }
                runCatching { it.errorStream.close() }
            }
        }
    }

    companion object {
        private const val ROOT_SIGNALS_COMMAND =
            "getprop ro.boot.serialno; getprop ro.serialno; getprop ro.soc.serialno; " +
                "for path in /sys/devices/soc0/serial_number " +
                "/sys/devices/system/soc/soc0/serial_number " +
                "/proc/device-tree/serial-number " +
                "/sys/firmware/devicetree/base/serial-number; do " +
                "if [ -r \"\$path\" ]; then head -c 128 \"\$path\" | tr -d '\\000\\r\\n'; fi; printf '\\n'; done"

        private const val DETAILS_COMMAND =
            "(set -o pipefail) 2>/dev/null && set -o pipefail\n" +
                "prop() { v=\$(getprop \"\$2\" 2>/dev/null); if [ \"\$?\" -ne 0 ]; then printf '%s\\tfailed\\t\\n' \"\$1\"; elif [ -n \"\$v\" ]; then printf '%s\\tok\\t%s\\n' \"\$1\" \"\$v\"; else printf '%s\\tmissing\\t\\n' \"\$1\"; fi; }\n" +
                "node() { if [ ! -e \"\$2\" ]; then printf '%s\\tmissing\\t\\n' \"\$1\"; elif [ ! -r \"\$2\" ]; then printf '%s\\tunreadable\\t\\n' \"\$1\"; else v=\$(head -c 128 \"\$2\" 2>/dev/null | tr -d '\\000\\r\\n'); if [ \"\$?\" -ne 0 ]; then printf '%s\\tfailed\\t\\n' \"\$1\"; else printf '%s\\tok\\t%s\\n' \"\$1\" \"\$v\"; fi; fi; }\n" +
                "prop boot_serial ro.boot.serialno\n" +
                "prop device_serial ro.serialno\n" +
                "prop soc_serial ro.soc.serialno\n" +
                "node soc0_serial /sys/devices/soc0/serial_number\n" +
                "node system_soc_serial /sys/devices/system/soc/soc0/serial_number\n" +
                "node device_tree_serial /proc/device-tree/serial-number\n" +
                "node firmware_tree_serial /sys/firmware/devicetree/base/serial-number\n" +
                "v=\$(sed -n 's/^Serial[[:space:]]*:[[:space:]]*//p' /proc/cpuinfo 2>/dev/null | head -n 1); printf 'cpu_serial\\tok\\t%s\\n' \"\$v\"\n" +
                "node mtk_chip_serial /proc/chip/serial"

        val DETAIL_SOURCES: List<String> = listOf(
            "boot_serial", "device_serial", "soc_serial", "soc0_serial",
            "system_soc_serial", "device_tree_serial", "firmware_tree_serial",
            "cpu_serial", "mtk_chip_serial",
        )

        private val SOC_DETAIL_SOURCES =
            setOf("soc0_serial", "system_soc_serial", "cpu_serial", "mtk_chip_serial")

        private val STATUS_ONLY = setOf("unreadable", "failed")

        /** SHA-256(realm\nname\nvalue)，输出 hex */
        fun hashSignal(realm: String, name: String, value: String): String =
            MessageDigest.getInstance("SHA-256")
                .digest("$realm\n$name\n$value".toByteArray(Charsets.UTF_8))
                .joinToString("") { "%02x".format(it) }

        /**
         * 通用信号规范化：trim 后长度 ∈ [4, 257)、无 ISO 控制字符、
         * 不在已知占位值集合内、非全 0/f/F。
         */
        fun normalizedSignal(raw: String?): String? {
            if (raw == null) return null
            val s = raw.trim()
            if (s.length !in 4..256) return null
            if (s.any { Character.isISOControl(it) }) return null
            val placeholders = setOf(
                "unknown", "null", "none", "default", "serial",
                "0123456789abcdef", "9774d56d682e549c",
            )
            if (s.lowercase() in placeholders) return null
            if (s.all { it == '0' || it == 'f' || it == 'F' }) return null
            return s
        }

        fun serialIdentity(realm: String, lines: List<String>): CloudHardwareIdentity {
            val signals = LinkedHashMap<String, String>()
            val names = listOf("boot_serial", "device_serial", "soc_serial")
            names.forEachIndexed { i, name ->
                normalizedSignal(lines.getOrNull(i))?.let { signals[name] = it }
            }
            HardwareIdentity.socSerial(lines.drop(3))?.let { signals["soc_serial_sysfs"] = it }
            val hashed = LinkedHashMap<String, String>()
            for ((name, value) in signals) hashed[name] = hashSignal(realm, name, value)
            return CloudHardwareIdentity(
                signals = hashed,
                hardwareInfo = signals.toMap(),
                readStatus = null,
                collectionStatus = null,
            )
        }

        fun detailedIdentity(realm: String, output: String): CloudHardwareIdentity {
            val signals = LinkedHashMap<String, String>()
            val readStatus = LinkedHashMap<String, String>()
            DETAIL_SOURCES.associateWithTo(readStatus) { "missing" }
            for (line in output.lines()) {
                val parts = line.split('\t', limit = 3)
                val source = parts.getOrNull(0) ?: continue
                if (source !in DETAIL_SOURCES) continue
                var status = parts.getOrNull(1)
                if (status in STATUS_ONLY) {
                    readStatus[source] = status!!
                    continue
                }
                val rawValue = parts.getOrNull(2)
                val normalized = if (source in SOC_DETAIL_SOURCES) {
                    rawValue?.let { HardwareIdentity.normalizedSocSerial(it) }
                } else {
                    normalizedSignal(rawValue)
                }
                if (status != "ok" || normalized == null) {
                    readStatus[source] =
                        if (rawValue.isNullOrEmpty() || status == "missing") "missing" else "invalid"
                } else {
                    signals[source] = normalized
                    readStatus[source] = "ok"
                }
            }
            // 从 sysfs 系来源补一个 soc_serial_sysfs
            val socFromSysfs = listOf(
                "soc0_serial", "system_soc_serial", "device_tree_serial", "firmware_tree_serial",
            ).firstNotNullOfOrNull { signals[it] }?.let { HardwareIdentity.normalizedSocSerial(it) }
            if (socFromSysfs != null) signals["soc_serial_sysfs"] = socFromSysfs

            val hashed = LinkedHashMap<String, String>()
            for ((name, value) in signals) hashed[name] = hashSignal(realm, name, value)
            return CloudHardwareIdentity(
                signals = hashed,
                hardwareInfo = signals.toMap(),
                readStatus = readStatus.toMap(),
                collectionStatus = if (signals.isEmpty()) "empty" else "ok",
            )
        }

        fun failedSnapshot(status: String): CloudHardwareIdentity {
            val readStatus = DETAIL_SOURCES.associateWith { status }
            return CloudHardwareIdentity(
                signals = null,
                hardwareInfo = null,
                readStatus = readStatus,
                collectionStatus = status,
            )
        }
    }
}
