package com.vincenthzr.locationspoofer.data.cloud

import com.vincenthzr.locationspoofer.data.model.GithubRelease
import java.security.MessageDigest
import java.time.Instant
import java.util.regex.Pattern
import kotlinx.coroutines.flow.StateFlow
import org.json.JSONArray
import org.json.JSONObject

class CloudClientContent(cloudRepository: CloudRepository) {
    private val cloud: CloudRepository = cloudRepository

    suspend fun adaptation(): CloudAdaptation? {
        val json = cloud.authenticatedJson("/v2/client/adaptation")
        return Companion.parseAdaptation(json)
    }

    companion object {
        const val MAX_ADAPTATION_BYTES = 262144
        const val MAX_APK_BYTES = 134217728L
        private val ID = Regex("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}")
        private val SHA = Regex("[a-f0-9]{64}")

        private fun <T> decode(block: () -> T): T? {
            return try {
                block()
            } catch (_: Exception) {
                throw CloudException("invalid_response")
            }
        }

        fun digest(bytes: ByteArray): String {
            val digest = MessageDigest.getInstance("SHA-256").digest(bytes)
            return digest.joinToString("") { "%02x".format(it) }
        }

        fun parseAdaptation(json: JSONObject): CloudAdaptation? = decode {
            check(json.getInt("schemaVersion") == 1)
            val markdown = json.getString("markdown")
            val bytes = markdown.toByteArray(Charsets.UTF_8)
            val sha256 = json.getString("sha256")
            check(bytes.size <= MAX_ADAPTATION_BYTES)
            check(markdown.startsWith("# 适配进度"))
            check(markdown.contains("## 全局方案"))
            check(markdown.contains("## 非全局方案"))
            check(SHA.matches(sha256))
            check(digest(bytes) == sha256)
            CloudAdaptation(markdown, sha256)
        }

        fun parseReleases(json: JSONObject): List<GithubRelease>? = decode {
            check(json.getInt("schemaVersion") == 1)
            val arr = json.getJSONArray("releases")
            check(arr.length() <= 20)
            check(json.getBoolean("available") == (arr.length() > 0))
            val releases = ArrayList<GithubRelease>(arr.length())
            val seenIds = LinkedHashSet<String>()
            for (i in 0 until arr.length()) {
                val o = arr.getJSONObject(i)
                val versionName = o.getString("versionName")
                val body = o.getString("body")
                val publishedAt = o.getString("publishedAt")
                check(Pattern.compile("[A-Za-z0-9][A-Za-z0-9._-]{0,79}").matcher(versionName).matches())
                check(body.length <= 65536)
                Instant.parse(publishedAt)
                val artifactsJson = o.getJSONArray("artifacts")
                val count = artifactsJson.length()
                check(count >= 1 && count < 4)
                val artifacts = ArrayList<CloudClientArtifact>(count)
                val seenAbis = LinkedHashSet<String>()
                for (j in 0 until count) {
                    val a = artifactsJson.getJSONObject(j)
                    val id = a.getString("id")
                    val abi = a.getString("abi")
                    val path = a.getString("path")
                    val sha = a.getString("sha256")
                    val size = a.getLong("sizeBytes")
                    val artifact = CloudClientArtifact(id, abi, path, sha, size)
                    check(validArtifact(artifact))
                    check(seenIds.add(artifact.id))
                    check(seenAbis.add(artifact.abi))
                    artifacts.add(artifact)
                }
                val arm64 = artifacts.firstOrNull { it.abi == "arm64-v8a" }
                    ?: artifacts.firstOrNull { it.abi == "universal" }
                val arm32 = artifacts.firstOrNull { it.abi == "armeabi-v7a" }
                releases.add(
                    GithubRelease(
                        versionName = versionName,
                        body = body,
                        downloadUrl = arm64?.path,
                        downloadUrl32Bit = arm32?.path,
                        publishedAt = publishedAt,
                        isPrerelease = o.getBoolean("isPrerelease"),
                    ),
                )
            }
            releases
        }

        fun validArtifact(artifact: CloudClientArtifact): Boolean {
            if (!ID.matches(artifact.id)) return false
            if (artifact.path != "/v2/client/artifacts/${artifact.id}") return false
            if (!SHA.matches(artifact.sha256)) return false
            if (artifact.sizeBytes < 1 || artifact.sizeBytes > MAX_APK_BYTES) return false
            return artifact.abi in setOf("arm64-v8a", "armeabi-v7a", "universal")
        }
    }
}
