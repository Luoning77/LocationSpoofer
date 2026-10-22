package com.vincenthzr.locationspoofer.data.cloud

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.nio.ByteBuffer
import java.util.TreeMap
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec

/**
 * AES/GCM 加密的地图资源 LRU 磁盘缓存。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/EncryptedMapResourceCache.java
 *
 * 文件布局：FORMAT(1) + IV(12) + GCM 密文；明文 = 时间戳(8B) + 状态码(4B) + 长度(4B) + body；
 * AAD = "location-map-cache-v1\n<key>\n<variant>"；文件名 = cloudBodyDigest(AAD) + ".bin"。
 * 注：原版 write 方法 jadx 反编译失败，本实现按 read() 的解析逻辑对称恢复。
 */
class EncryptedMapResourceCache(
    private val directory: File,
    private val key: () -> javax.crypto.SecretKey,
    private val clock: () -> Long = System::currentTimeMillis,
    private val maxBytes: Long = 268_435_456L,
    private val maxEntries: Int = 8_192,
    private val ttlMillis: Long = 7_776_000_000L, // 90 天
    private val event: (String) -> Unit = {},
) : CloudMapResourceCache {

    private var index: TreeMap<String, Long>? = null
    private var diskBytes: Long = 0

    init {
        require(maxBytes > 0 && maxEntries > 0 && ttlMillis > 0)
        directory.mkdirs()
    }

    private fun aad(key: String, variant: String): ByteArray =
        "location-map-cache-v1\n$key\n$variant".toByteArray(Charsets.UTF_8)

    private fun file(key: String, variant: String): File =
        File(directory, cloudBodyDigest(aad(key, variant)) + ".bin")

    private fun forget(name: String) {
        val removed = index?.remove(name)
        if (removed != null) diskBytes -= removed
    }

    private fun remember(file: File) {
        forget(file.name)
        index?.put(file.name, file.length())
        diskBytes += file.length()
    }

    private fun initializeIndex() {
        if (index != null) return
        val files = directory.listFiles() ?: emptyArray()
        files.filter { it.name.endsWith(".part") }.forEach { it.delete() }
        index = TreeMap()
        files.filter { FILE_NAME.matches(it.name) }
            .sortedBy { it.lastModified() }
            .forEach { remember(it) }
        trim()
    }

    private fun trim() {
        val current = index ?: return
        val iterator = current.entries.iterator()
        while (diskBytes > maxBytes || current.size > maxEntries) {
            if (!iterator.hasNext()) return
            val entry = iterator.next()
            val file = File(directory, entry.key)
            if (!file.exists() || file.delete()) {
                diskBytes -= entry.value
                iterator.remove()
            }
        }
    }

    @Synchronized
    override fun read(key: String, variant: String, generation: Long, cachedOnly: Boolean): CloudMapCacheEntry? {
        val file = file(key, variant)
        try {
            initializeIndex()
        } catch (_: Throwable) {
            event("miss")
            return null
        }
        if (!file.isFile) {
            forget(file.name)
            event("miss")
            return null
        }
        try {
            val length = file.length()
            if (length < 45 || length > minOf(generation, MAX_RESOURCE_BYTES) + 64) {
                error("Failed requirement.")
            }
            val bytes = ByteArray(length.toInt()).also { buffer ->
                FileInputStream(file).use { input ->
                    var read = 0
                    while (read < buffer.size) {
                        val n = input.read(buffer, read, buffer.size - read)
                        if (n < 0) error("Failed requirement.")
                        read += n
                    }
                    if (input.read() != -1) error("Failed requirement.")
                }
            }
            if (bytes[0] != FORMAT) error("Failed requirement.")
            val cipher = Cipher.getInstance("AES/GCM/NoPadding")
            cipher.init(Cipher.DECRYPT_MODE, this.key(), GCMParameterSpec(128, bytes, 1, 12))
            cipher.updateAAD(aad(key, variant))
            val plain = cipher.doFinal(bytes, 13, bytes.size - 13)
            val buffer = ByteBuffer.wrap(plain)
            val writtenAt = buffer.long
            val now = clock()
            if (now < writtenAt) error("Failed requirement.")
            val age = now - writtenAt
            if (age >= ttlMillis) error("Failed requirement.")
            val needsRevalidation = (variant.endsWith("/style-light.json") || variant.endsWith("/style-dark.json")) &&
                age >= STYLE_TTL_MILLIS
            val code = buffer.int
            val size = buffer.int
            if (size < 0 || size > minOf(generation, MAX_RESOURCE_BYTES) || size != buffer.remaining()) {
                error("Failed requirement.")
            }
            if (code != 200 && (!cachedOnly || code != 204 || size != 0)) {
                error("Failed requirement.")
            }
            val body = ByteArray(size).also { buffer.get(it) }
            file.setLastModified(now)
            remember(file)
            event("hit")
            return CloudMapCacheEntry(body, code, needsRevalidation)
        } catch (_: Exception) {
            file.delete()
            forget(file.name)
            event("discard")
            return null
        }
    }

    @Synchronized
    override fun remove(key: String, variant: String) {
        try {
            val file = file(key, variant)
            if (file.exists() && !file.delete()) {
                error("Check failed.")
            }
            if (index != null) forget(file.name)
        } catch (_: Throwable) {
        }
    }

    @Synchronized
    override fun write(key: String, variant: String, entry: CloudMapCacheEntry) {
        try {
            initializeIndex()
            val size = entry.bytes.size
            // 非空 body 必须 200；空 body 只允许 204（cached-only 占位）
            require((size > 0 && entry.code == 200) || (size == 0 && entry.code == 204)) { "Failed requirement." }
            require(size <= MAX_RESOURCE_BYTES) { "Failed requirement." }
            val plain = ByteBuffer.allocate(16 + size)
                .putLong(clock())
                .putInt(entry.code)
                .putInt(size)
                .put(entry.bytes)
                .array()
            val cipher = Cipher.getInstance("AES/GCM/NoPadding")
            cipher.init(Cipher.ENCRYPT_MODE, this.key())
            cipher.updateAAD(aad(key, variant))
            val encrypted = cipher.doFinal(plain)
            val payload = ByteArray(1 + cipher.iv.size + encrypted.size)
            payload[0] = FORMAT
            cipher.iv.copyInto(payload, 1)
            encrypted.copyInto(payload, 1 + cipher.iv.size)
            val target = file(key, variant)
            val part = File(directory, target.name + ".part")
            FileOutputStream(part).use { it.write(payload) }
            if (!part.renameTo(target)) {
                part.delete()
                error("Check failed.")
            }
            remember(target)
            trim()
        } catch (_: Throwable) {
            // 缓存写入失败不致命（原版 write 未反编译成功，按 read 对称实现；调用方不依赖返回值）
        }
    }

    companion object {
        private const val FORMAT: Byte = 1
        private const val MAX_RESOURCE_BYTES = 8_388_608L
        private const val STYLE_TTL_MILLIS = 21_600_000L // 6 小时（style 强制重验窗口）
        private val FILE_NAME = Regex("[A-Za-z0-9_-]{43}\\.bin")
    }
}
