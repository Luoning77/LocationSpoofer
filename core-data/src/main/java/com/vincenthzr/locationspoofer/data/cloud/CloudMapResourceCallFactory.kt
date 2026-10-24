package com.vincenthzr.locationspoofer.data.cloud

import java.io.IOException
import java.net.ProtocolException
import java.net.Proxy
import java.util.concurrent.CancellationException
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Semaphore
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicReference
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Semaphore as KSemaphore
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import okhttp3.Call
import okhttp3.Callback
import okhttp3.EventListener
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody
import okio.Buffer
import okio.BufferedSource
import okio.ForwardingSource
import okio.Timeout
import okio.buffer
import org.json.JSONObject

internal class CloudMapResourceCallFactory(
    private val repository: CloudRepository,
    private val origin: HttpUrl?,
    private val transport: OkHttpClient,
    private val cacheOverride: CloudMapResourceCache?,
) : Call.Factory {

    data class Download(val bytes: ByteArray, val protocol: Protocol, val code: Int) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Download) return false
            return code == other.code && protocol == other.protocol && bytes.contentEquals(other.bytes)
        }

        override fun hashCode(): Int {
            var result = bytes.contentHashCode()
            result = 31 * result + protocol.hashCode()
            result = 31 * result + code
            return result
        }
    }

    data class RefreshAttempt(val generation: Long, val startedAt: Long)

    data class Resource(
        val path: String,
        val limit: Long,
        val mime: String,
        val emptyTile: Boolean,
        val satellite: Boolean,
    )

    private val scope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val slots = KSemaphore(8)
    private val pending = Semaphore(64)
    private val calls: MutableSet<ResourceCall> = ConcurrentHashMap.newKeySet()
    private val styleRefreshes = LinkedHashMap<String, RefreshAttempt>()
    private val client: OkHttpClient

    init {
        this.client = transport.newBuilder()
            .eventListener(EventListener.NONE)
            .connectTimeout(10L, TimeUnit.SECONDS)
            .readTimeout(5L, TimeUnit.SECONDS)
            .writeTimeout(10L, TimeUnit.SECONDS)
            .callTimeout(15L, TimeUnit.SECONDS)
            .followRedirects(false)
            .followSslRedirects(false)
            .retryOnConnectionFailure(true)
            .proxy(Proxy.NO_PROXY)
            .addNetworkInterceptor(Interceptor { chain ->
                try {
                    val response = chain.proceed(chain.request())
                    when (response.code) {
                        421 -> {
                            response.close()
                            throw ProtocolException("地图请求不能重发")
                        }
                        408, 503 -> response.newBuilder()
                            .header("Retry-After", "2147483647")
                            .build()
                        else -> response
                    }
                } catch (e: IOException) {
                    throw ProtocolException("地图请求连接后失败，不允许重发").apply { initCause(e) }
                }
            })
            .build()
    }

    val cache: CloudMapResourceCache?
        get() = cacheOverride ?: repository.mapResourceCache()

    fun refreshCachedStyle(request: Request, stamp: Long) {
        val path = request.url.encodedPath
        val now = System.nanoTime()
        val allow = synchronized(styleRefreshes) {
            val prev = styleRefreshes[path]
            if (prev == null || prev.generation != stamp || now - prev.startedAt >= 60_000_000_000L) {
                styleRefreshes[path] = RefreshAttempt(stamp, now)
                true
            } else {
                false
            }
        }
        if (!allow) return
        val call = ResourceCall(request, stamp, networkOnly = true)
        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) = Unit
            override fun onResponse(call: Call, response: Response) {
                response.close()
            }
        })
    }

    fun resource(request: Request): Resource {
        val origin = this.origin ?: throw CloudException("cloud_not_configured")
        val url = request.url
        val valid = request.method == "GET" &&
            url.scheme == origin.scheme &&
            url.host == origin.host &&
            url.port == origin.port &&
            url.username.isEmpty() &&
            url.password.isEmpty() &&
            url.query == null &&
            url.fragment == null
        if (!valid) throw CloudException("invalid_map_resource")
        val path = url.encodedPath
        when (path) {
            "/v2/maps/china/style-light.json", "/v2/maps/china/style-dark.json" ->
                return Resource(path, 1_048_576L, "application/json", emptyTile = false, satellite = false)
            "/v2/maps/satellite/manifest.json" ->
                return Resource(path, 65_536L, "application/json", emptyTile = false, satellite = true)
        }
        satelliteTile(path)?.let { return it }
        chinaTile(path)?.let { return it }
        font(path)?.let { return it }
        throw CloudException("invalid_map_resource")
    }

    private fun satelliteTile(path: String): Resource? {
        val m = SATELLITE.matchEntire(path) ?: return null
        val (z, x, y) = m.destructured
        val zi = z.toIntOrNull() ?: throw CloudException("invalid_map_resource")
        val xi = x.toIntOrNull() ?: throw CloudException("invalid_map_resource")
        val yi = y.toIntOrNull() ?: throw CloudException("invalid_map_resource")
        val dim = 1 shl zi
        val ok = zi in 0 until 15 && xi in 0 until dim && yi in 0 until dim
        if (!ok) throw CloudException("invalid_map_resource")
        return Resource(path, 524_288L, "image/png", emptyTile = false, satellite = true)
    }

    private fun chinaTile(path: String): Resource? {
        val m = TILE.matchEntire(path) ?: return null
        val (z, x, y) = m.destructured
        val zi = z.toIntOrNull() ?: throw CloudException("invalid_map_resource")
        val xi = x.toIntOrNull() ?: throw CloudException("invalid_map_resource")
        val yi = y.toIntOrNull() ?: throw CloudException("invalid_map_resource")
        val dim = 1 shl zi
        val ok = zi in 0 until 15 && xi in 0 until dim && yi in 0 until dim
        if (!ok) throw CloudException("invalid_map_resource")
        return Resource(path, 8_388_608L, "application/x-protobuf", emptyTile = true, satellite = false)
    }

    private fun font(path: String): Resource? {
        val m = FONT.matchEntire(path) ?: return null
        val (a, b) = m.destructured
        val start = a.toIntOrNull() ?: throw CloudException("invalid_map_resource")
        val end = b.toIntOrNull() ?: throw CloudException("invalid_map_resource")
        val ok = start in 0 until 65_281 && start % 256 == 0 && end == start + 255
        if (!ok) throw CloudException("invalid_map_resource")
        return Resource(path, 262_144L, "application/x-protobuf", emptyTile = false, satellite = false)
    }

    fun safeFailure(exc: Exception): IOException = IOException(
        when (exc) {
            is CloudException -> exc.code
            is CancellationException -> "map_request_cancelled"
            is IOException -> exc.message?.takeIf { it == "map_request_cancelled" || it == "map_queue_full" } ?: "network_error"
            else -> "invalid_map_response"
        },
    )

    fun cancelBefore(stamp: Long) {
        val stale = calls.filter { it.beforeGeneration(stamp) }
        for (call in stale) call.cancel()
    }

    override fun newCall(request: Request): Call =
        ResourceCall(request, repository.mapRequestGeneration(), networkOnly = false)

    inner class ResourceCall(
        private val publicRequest: Request,
        private val stamp: Long,
        private val networkOnly: Boolean,
    ) : Call {
        private val executed = AtomicBoolean()
        private val cancelled = AtomicBoolean()
        private val delivered = AtomicBoolean()
        private val worker = AtomicReference<Job?>()
        private val network = AtomicReference<Call?>()

        fun beforeGeneration(other: Long): Boolean = stamp < other

        fun checkCancelled() {
            if (cancelled.get()) throw IOException("map_request_cancelled")
        }

        private fun begin() {
            if (!executed.compareAndSet(false, true)) throw IllegalStateException("Already Executed")
            calls.add(this)
        }

        fun cacheScope(binding: CloudRuntimeBinding): String =
            listOf(
                origin?.toString().orEmpty(),
                binding.userId,
                binding.deviceId,
                binding.publicKeyFingerprint,
            ).joinToString("\n")

        private suspend fun fetch(request: Request, resource: Resource): Download {
            val call = client.newCall(request)
            network.set(call)
            checkCancelled()
            return suspendCancellableCoroutine { cont ->
                cont.invokeOnCancellation { call.cancel() }
                call.enqueue(object : Callback {
                    override fun onFailure(call: Call, e: IOException) {
                        network.compareAndSet(call, null)
                        if (cont.isActive) cont.resumeWith(Result.failure(CloudException("network_error")))
                    }

                    override fun onResponse(call: Call, response: Response) {
                        response.use { resp ->
                            try {
                                val code = resp.code
                                if (code != 200 && !(resource.emptyTile && code == 204)) {
                                    if (code in 300..399) throw CloudException("redirect_rejected")
                                    val fallback = when (code) {
                                        401 -> "invalid_session"
                                        403 -> "map_forbidden"
                                        else -> "map_unavailable"
                                    }
                                    val bodyCode = try {
                                        val src = resp.body?.source()
                                        if (src == null || src.request(4097L)) {
                                            null
                                        } else {
                                            val raw = JSONObject(src.readUtf8()).optString("code", fallback)
                                            raw.takeIf { CODE_PATTERN.matches(it) }
                                        }
                                    } catch (_: Throwable) {
                                        null
                                    }
                                    throw CloudException(bodyCode ?: fallback, httpStatus = code)
                                }
                                val body = resp.body ?: throw CloudException("invalid_map_response")
                                val download = if (code == 204) {
                                    if (body.source().request(1L)) throw CloudException("invalid_map_response")
                                    Download(ByteArray(0), resp.protocol, code)
                                } else {
                                    val type = body.contentType()?.toString()
                                    if (type != resource.mime) throw CloudException("invalid_map_response")
                                    if (body.contentLength() > resource.limit || body.source().request(resource.limit + 1)) {
                                        throw CloudException("response_too_large")
                                    }
                                    Download(body.bytes(), resp.protocol, code)
                                }
                                network.compareAndSet(call, null)
                                if (cont.isActive) cont.resumeWith(Result.success(download))
                            } catch (e: Exception) {
                                network.compareAndSet(call, null)
                                if (cont.isActive) cont.resumeWith(Result.failure(e))
                            }
                        }
                    }
                })
            }
        }

        private suspend fun performInternal(): Response {
            val resource = resource(publicRequest)
            val cache = cache
            checkCancelled()
            if (!pending.tryAcquire()) throw IOException("map_queue_full")
            try {
                return withTimeoutOrNull(15_000L) {
                    withContext(Dispatchers.IO) {
                        doPerform(resource, cache)
                    }
                } ?: throw IOException("map_request_cancelled")
            } finally {
                pending.release()
            }
        }

        private suspend fun doPerform(resource: Resource, cache: CloudMapResourceCache?): Response {
            val auth = try {
                repository.mapCacheAuthorization(stamp)
            } catch (e: CloudException) {
                val download = fetch(publicRequest, resource)
                return buildResponse(download, resource, null)
            }
            val cacheKey = cacheScope(auth.binding)
            val entry = try {
                cache?.read(cacheKey, publicRequest.url.encodedPath, stamp, cachedOnly = networkOnly)
            } catch (_: Throwable) {
                null
            }
            if (entry != null && entry.bytes.size.toLong() <= resource.limit) {
                return buildResponse(
                    Download(entry.bytes, Protocol.HTTP_1_1, 200),
                    resource,
                    auth,
                )
            }
            val signed = publicRequest.newBuilder()
                .header("Authorization", "Bearer ${auth.accessToken}")
                .build()
            val download = fetch(signed, resource)
            if (download.code == 200 && cache != null && download.bytes.size.toLong() <= resource.limit) {
                try {
                    cache.write(
                        cacheKey,
                        publicRequest.url.encodedPath,
                        CloudMapCacheEntry(bytes = download.bytes, code = download.code),
                    )
                } catch (_: Throwable) {
                }
            }
            return buildResponse(download, resource, auth)
        }

        private fun buildResponse(download: Download, resource: Resource, auth: CloudMapAuthorization?): Response {
            val message = if (download.code == 204) "No Content" else "OK"
            val body = GuardedBody(download.bytes, resource.mime.toMediaType(), auth, this)
            return Response.Builder()
                .request(publicRequest)
                .protocol(download.protocol)
                .code(download.code)
                .message(message)
                .header("Content-Type", resource.mime)
                .header("Content-Length", download.bytes.size.toString())
                .header("Cache-Control", "no-store")
                .header("X-Content-Type-Options", "nosniff")
                .body(body)
                .build()
        }

        override fun cancel() {
            cancelled.set(true)
            network.get()?.cancel()
            worker.get()?.cancel()
        }

        override fun clone(): Call =
            ResourceCall(publicRequest, stamp, networkOnly)

        override fun enqueue(responseCallback: Callback) {
            begin()
            val job = scope.launch {
                try {
                    val response = performInternal()
                    if (delivered.compareAndSet(false, true)) {
                        responseCallback.onResponse(this@ResourceCall, response)
                    } else {
                        response.close()
                    }
                } catch (e: Exception) {
                    calls.remove(this@ResourceCall)
                    worker.set(null)
                    if (delivered.compareAndSet(false, true)) {
                        responseCallback.onFailure(this@ResourceCall, safeFailure(e))
                    }
                    return@launch
                }
                calls.remove(this@ResourceCall)
                worker.set(null)
            }
            worker.set(job)
            job.invokeOnCompletion {
                calls.remove(this)
                if (it != null && delivered.compareAndSet(false, true)) {
                    scope.launch {
                        responseCallback.onFailure(this@ResourceCall, safeFailure(Exception(it)))
                    }
                }
            }
            if (cancelled.get()) job.cancel()
        }

        override fun execute(): Response {
            begin()
            return try {
                val response = runBlocking(Dispatchers.IO) { performInternal() }
                calls.remove(this)
                worker.set(null)
                response
            } catch (e: Exception) {
                calls.remove(this)
                worker.set(null)
                throw safeFailure(e)
            }
        }

        override fun isCanceled(): Boolean = cancelled.get()

        override fun isExecuted(): Boolean = executed.get()

        override fun request(): Request = publicRequest

        override fun timeout(): Timeout = Timeout.NONE
    }

    inner class GuardedBody(
        private val bytes: ByteArray,
        private val type: MediaType?,
        private val authorization: CloudMapAuthorization?,
        private val call: ResourceCall,
    ) : ResponseBody() {
        private val raw = Buffer().write(bytes)

        override fun contentLength(): Long = bytes.size.toLong()

        override fun contentType(): MediaType? = type

        override fun source(): BufferedSource {
            val auth = authorization ?: return raw
            val guarded = object : ForwardingSource(raw) {
                override fun read(sink: Buffer, byteCount: Long): Long =
                    repository.withMapAuthorization(auth) {
                        call.checkCancelled()
                        super.read(sink, byteCount)
                    }
            }
            return guarded.buffer()
        }
    }

    companion object {
        private val SATELLITE = Regex("/v2/maps/satellite/tiles/(0|[1-9][0-9]*)/(0|[1-9][0-9]*)/(0|[1-9][0-9]*)\\.png")
        private val TILE = Regex("/v2/maps/china/tiles/(0|[1-9][0-9]*)/(0|[1-9][0-9]*)/(0|[1-9][0-9]*)\\.pbf")
        private val FONT = Regex("/v2/maps/china/fonts/Noto%20Sans%20CJK%20SC%20Regular/(0|[1-9][0-9]*)-(0|[1-9][0-9]*)\\.pbf")
        private val CODE_PATTERN = Regex("[a-z_]{1,64}")
    }
}
