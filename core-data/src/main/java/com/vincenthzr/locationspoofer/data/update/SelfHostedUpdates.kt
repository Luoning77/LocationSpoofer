package com.vincenthzr.locationspoofer.data.update

import com.vincenthzr.locationspoofer.data.cloud.CloudException
import com.vincenthzr.locationspoofer.data.model.GithubRelease
import java.time.Instant
import java.util.regex.Pattern
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrl
import org.json.JSONArray
import org.json.JSONObject

class SelfHostedUpdates(
    origin: String = ORIGIN,
    allowInsecure: Boolean = false,
) {
    private val base: HttpUrl? = try {
        val url = origin.trim().toHttpUrl()
        if (!url.isHttps && !allowInsecure) throw CloudException("invalid_response")
        if (url.encodedPath != "/" || url.query != null || url.fragment != null) throw CloudException("invalid_response")
        url
    } catch (e: CloudException) {
        throw e
    } catch (_: Exception) {
        null
    }

    companion object {
        const val APPLICATION_ID = "com.vincenthzr.locationspoofer"
        const val CERTIFICATE = "1541598136c33de4103ca7586274e5d9231b4e6758b400cedb63b9105b2ceaf2"
        const val ORIGIN = "https://downloads.vincenthzr.org:8443"
        const val MAX_MANIFEST_BYTES = 262_144
        private const val MAX_APK_BYTES = 134_217_728L

        private val VERSION = Regex("[0-9]+\\.[0-9]+\\.[0-9]+(?:-beta[-.][0-9]+)?")
        private val ID = Regex("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}")
        private val SHA256 = Regex("[a-f0-9]{64}")
        private val COMMIT = Regex("[a-f0-9]{40}")
        private val DOWNLOAD_ERRORS = setOf(
            "download_ticket_expired", "download_ticket_used", "download_quota_exceeded",
            "download_rate_limited", "service_busy",
        )

        internal fun invalid(): Nothing = throw CloudException("invalid_response")

        fun hex(bytes: ByteArray): String = bytes.joinToString("") { "%02x".format(it) }

        fun artifactPath(versionName: String, scheme: String, abi: String): String {
            val schemePart = if (scheme == "global") "global" else "non-global"
            val bits = if (abi == "arm64-v8a") "64" else "32"
            return "/locationspoofer/releases/v$versionName/LocationSpoofer-v$versionName-$schemePart-$bits" + "bit-$abi.apk"
        }

        fun requireValid(artifact: UpdateArtifact) {
            val abiOk = artifact.abi in setOf("arm64-v8a", "armeabi-v7a")
            val schemeOk = artifact.scheme in setOf("global", "scoped")
            val versionOk = VERSION.matches(artifact.versionName) && artifact.versionName.length <= 80
            val codeOk = artifact.versionCode in 1..2_100_000_000
            val idOk = ID.matches(artifact.id)
            val shaOk = SHA256.matches(artifact.sha256)
            val sizeOk = artifact.sizeBytes in 1..MAX_APK_BYTES
            val pathOk = artifact.path == artifactPath(artifact.versionName, artifact.scheme, artifact.abi)
            if (!(idOk && versionOk && schemeOk && abiOk && codeOk && shaOk && sizeOk && pathOk)) {
                throw CloudException("invalid_artifact")
            }
        }

        fun parseManifest(json: JSONObject, scheme: String, abis: Set<String>): List<GithubRelease> {
            try {
                if (json.getInt("schemaVersion") != 2 ||
                    json.getString("applicationId") != APPLICATION_ID ||
                    scheme !in setOf("scoped", "global")
                ) {
                    invalid()
                }
                val releases = json.getJSONArray("releases")
                if (releases.length() > 40) invalid()
                val seenNames = LinkedHashSet<String>()
                val seenCodes = LinkedHashSet<Pair<String, Int>>()
                val seenIds = LinkedHashSet<String>()
                val out = ArrayList<GithubRelease>()
                for (i in 0 until releases.length()) {
                    val o = releases.getJSONObject(i)
                    val schemeField = o.getString("scheme")
                    val versionName = o.getString("versionName")
                    val versionCode = o.getInt("versionCode")
                    val body = o.getString("body")
                    val publishedAt = o.getString("publishedAt")
                    val isPrerelease = o.getBoolean("isPrerelease")
                    if (versionName.length > 80) invalid()
                    if (isPrerelease != versionName.contains("-beta")) invalid()
                    Instant.parse(publishedAt)
                    if (body.length > 65_536) invalid()
                    if (o.getString("signingCertificateSha256") != CERTIFICATE) invalid()
                    if (!COMMIT.matches(o.getString("commit"))) invalid()
                    if (!seenNames.add("$schemeField:$versionName")) invalid()
                    if (!seenCodes.add(schemeField to versionCode)) invalid()
                    val artifactsJson = o.getJSONArray("artifacts")
                    if (artifactsJson.length() != 2) invalid()
                    val artifacts = ArrayList<UpdateArtifact>(2)
                    for (j in 0 until artifactsJson.length()) {
                        val a = artifactsJson.getJSONObject(j)
                        val artifact = UpdateArtifact(
                            id = a.getString("id"),
                            abi = a.getString("abi"),
                            path = a.getString("path"),
                            sha256 = a.getString("sha256"),
                            sizeBytes = a.getLong("sizeBytes"),
                            scheme = schemeField,
                            versionName = versionName,
                            versionCode = versionCode,
                        )
                        requireValid(artifact)
                        if (!seenIds.add(artifact.id)) invalid()
                        artifacts.add(artifact)
                    }
                    if (artifacts.map { it.abi }.toSet() != setOf("arm64-v8a", "armeabi-v7a")) invalid()
                    val filtered = artifacts.filter { it.abi in abis }
                    if (schemeField == scheme && filtered.isNotEmpty()) {
                        val preferred = filtered.firstOrNull { it.abi == "arm64-v8a" } ?: filtered.last()
                        val other = filtered.firstOrNull { it.abi == "armeabi-v7a" && it != preferred }
                        out.add(
                            GithubRelease(
                                versionName = versionName,
                                body = body,
                                downloadUrl = preferred.path,
                                downloadUrl32Bit = other?.path,
                                publishedAt = publishedAt,
                                isPrerelease = isPrerelease,
                                artifacts = emptyList(),
                                versionCode = versionCode,
                                updateArtifacts = filtered,
                            )
                        )
                    }
                }
                return out.sortedByDescending { it.versionCode }
            } catch (e: CloudException) {
                throw e
            } catch (_: Exception) {
                invalid()
            }
        }

        fun parseCatalog(json: JSONObject, scheme: String, abis: Set<String>): List<GithubRelease> {
            val coreAbis = setOf("arm64-v8a", "armeabi-v7a")
            val all = parseManifest(json, "global", coreAbis) + parseManifest(json, "scoped", coreAbis)
            val byCode = all.groupBy { it.versionCode }
            val merged = ArrayList<GithubRelease>(byCode.size)
            for ((_, list) in byCode) {
                if (list.size != 2) invalid()
                if (list.map { it.versionName }.toSet().size != 1) invalid()
                if (list.map { it.body to it.publishedAt }.toSet().size != 1) invalid()
                if (list.map { it.isPrerelease }.toSet().size != 1) invalid()
                val artifacts = list.flatMap { it.updateArtifacts }
                if (artifacts.map { it.scheme to it.abi }.toSet().size != 4) invalid()
                val filtered = artifacts.filter { it.scheme == scheme && it.abi in abis }
                if (filtered.isEmpty()) continue
                val preferred = filtered.firstOrNull { it.abi == "arm64-v8a" } ?: filtered.last()
                val other = filtered.firstOrNull { it.abi == "armeabi-v7a" && it != preferred }
                val first = list.first()
                merged.add(
                    first.copy(
                        downloadUrl = preferred.path,
                        downloadUrl32Bit = other?.path,
                        updateArtifacts = filtered,
                    )
                )
            }
            return merged.sortedByDescending { it.versionCode }
        }
    }
}
