package com.vincenthzr.locationspoofer.data.cloud

import com.vincenthzr.locationspoofer.data.sync.SyncAccess
import com.vincenthzr.locationspoofer.data.update.AccountUpdates
import java.io.File
import java.io.IOException
import java.net.ProtocolException
import java.util.concurrent.CancellationException
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import okhttp3.Call
import okhttp3.Callback
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject

/**
 * 云账号仓库：登录/会话/设备绑定/地图授权/伴侣模式/诊断上报。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudRepository.java（32,512 行反编译，原约 1,500 行 Kotlin）
 */
class CloudRepository(
    origin: String,
    private val sessionStore: CloudSessionStore,
    private val client: OkHttpClient = Companion.defaultClient(),
    private val allowMemorySession: Boolean = false,
    private val deviceName: String = "Android",
    private val clock: () -> Long = { System.currentTimeMillis() },
    private val accountReadRetryDelaysMillis: List<Long> = listOf(1_000L, 2_000L, 4_000L),
    private val enableSessionProof: Boolean = true,
    private val companionReconnectDelaysMillis: List<Long> = List(24) { 5_000L },
) {
    private val origin: String = origin

    data class PendingHardware(
        val fingerprint: String,
        val at: Long,
        val snapshot: CloudHardwareIdentity,
    )

    data class ReadAuthorization(
        val generation: Long,
        val accessToken: String,
        val binding: CloudRuntimeBinding,
        val request: Request,
    )

    // ---------- 可变状态 ----------
    private val _signOutNotice = MutableStateFlow<String?>(null)
    val signOutNotice: StateFlow<String?> = _signOutNotice.asStateFlow()

    private val _registrationNotice = MutableStateFlow(false)
    val registrationNotice: StateFlow<Boolean> = _registrationNotice.asStateFlow()

    private val mutex = Mutex()
    private val sessionProof: CloudSessionProof by lazy {
        CloudSessionProof { sessionStore.monotonicTimeNanos() }
    }

    private val generation = AtomicLong()
    private val stateLock = Any()

    private val _mapDisplayBinding = MutableStateFlow<CloudRuntimeBinding?>(null)
    val mapDisplayBinding: StateFlow<CloudRuntimeBinding?> = _mapDisplayBinding.asStateFlow()

    private val mapPreviewScope: CoroutineScope by lazy { backgroundScope() }
    private val mapPreviewIo = Mutex()
    private val mapRecheckRunning = AtomicBoolean()
    private var mapRecheckStartedAt: Long? = null

    private val diagnosticScope: CoroutineScope by lazy { backgroundScope() }
    private val diagnosticUploadRunning = AtomicBoolean()
    @Volatile
    private var lastDiagnosticUploadAt: Long? = null

    private val _state = MutableStateFlow(
        CloudAccountState(deviceId = "", publicKeyFingerprint = "", initializing = false)
    )
    val state: StateFlow<CloudAccountState> = _state.asStateFlow()

    private val _companionMode = MutableStateFlow(sessionStore.companionMode())
    val companionMode: StateFlow<Boolean> = _companionMode.asStateFlow()

    private val _teeAvailability = MutableStateFlow(sessionStore.teeAvailability())
    val teeAvailability: StateFlow<Boolean?> = _teeAvailability.asStateFlow()

    private val _pairing = MutableStateFlow<CloudCompanionPairing?>(null)
    val companionPairing: StateFlow<CloudCompanionPairing?> = _pairing.asStateFlow()

    private val companionRun: CloudCompanionRun by lazy {
        CloudCompanionRun { sessionStore.monotonicTimeNanos() }
    }
    private val companionScope: CoroutineScope by lazy { backgroundScope() }
    private var heartbeatStarted = false

    private val _mapQuotaExceeded = MutableStateFlow(false)
    val mapQuotaExceeded: StateFlow<Boolean> = _mapQuotaExceeded.asStateFlow()

    @Volatile
    private var mapCacheVerifiedAt: Long? = null

    @Volatile
    private var mapResources: CloudMapResourceCallFactory? = null

    @Volatile
    private var satelliteView: Boolean = false

    @Volatile
    private var serverProofSupported: Boolean = false

    @Volatile
    private var storageLocked: Boolean = false

    private var memorySession: Boolean = false
    private var memoryTokens: CloudTokens? = null
    private var passwordAccess: CloudPasswordAccess? = null
    private var passwordDeviceReady: Boolean = false
    private var passwordDeviceRetry: Job? = null
    private var pendingHardware: PendingHardware? = null

    private val base: HttpUrl? = parseBase(origin)

    val configured: Boolean get() = base != null || origin.isBlank()

    val originScope: String get() = origin

    val accountProtocol: Boolean get() = sessionStore.getAccountProtocol()

    // ---------- Companion ----------
    companion object {
        private const val MAX_RESPONSE_BYTES = 2_097_152L
        private const val MAX_SYNC_RESPONSE_BYTES = 8_388_608L
        private const val MAP_CACHE_RECHECK_NANOS = 300_000_000_000L
        private const val MAP_RECHECK_RETRY_NANOS = 60_000_000_000L

        private val NON_BLOCKING_READ_PATHS = setOf(
            "/v2/account",
            "/v2/account/devices",
            "/v2/account/archives",
            "/v2/account/rewards",
            "/v2/account/sync",
            "/v2/wifi/status",
            AccountUpdates.PREFERENCE_PATH,
            AccountUpdates.CHECK_PATH,
            "/v2/providers",
            "/v2/membership/catalog",
            "/v2/membership/catalog-v2",
            "/v2/membership/catalog-v3",
            "/v2/membership/entitlements",
            "/v2/membership/orders",
            "/v2/sharing/status",
        )

        private val IDENTITY_FAILURES = setOf(
            "login_required", "invalid_session", "account_disabled", "device_blocked",
            "device_not_enrolled", "device_already_bound", "account_already_bound",
            "device_key_changed", "device_recovery_required", "device_binding_mismatch",
            "device_binding_required", "device_login_required", "device_migration_required",
            "device_hardware_mismatch", "device_identity_required", "device_mismatch",
            "member_required", "storage_unavailable",
        )

        private val INVALIDATE_COMPANION_CODES = setOf(
            "storage_unavailable", "device_locked", "companion_lease_required",
            "invalid_run_signature", "companion_in_use",
        )

        private val BLOCKING_METHODS = setOf("GET", "POST", "DELETE")

        fun defaultClient(dns: okhttp3.Dns = okhttp3.Dns.SYSTEM): OkHttpClient = OkHttpClient.Builder()
            .eventListenerFactory(CloudRequestTiming.listenerFactory)
            .dns(Ipv4PreferredDns(dns))
            .connectTimeout(10L, TimeUnit.SECONDS)
            .followRedirects(false)
            .followSslRedirects(false)
            .retryOnConnectionFailure(true)
            .addNetworkInterceptor(Interceptor { chain ->
                try {
                    val response = chain.proceed(chain.request())
                    when (response.code) {
                        421 -> {
                            response.close()
                            throw ProtocolException("服务器拒绝当前连接，不允许重发")
                        }
                        408, 503 -> response.newBuilder()
                            .header("Retry-After", "2147483647")
                            .build()
                        else -> response
                    }
                } catch (e: IOException) {
                    throw ProtocolException("请求连接后失败，不允许重发").apply { initCause(e) }
                }
            })
            .readTimeout(10L, TimeUnit.SECONDS)
            .writeTimeout(25L, TimeUnit.SECONDS)
            .callTimeout(30L, TimeUnit.SECONDS)
            .build()

        fun isPrivateHost(host: String): Boolean {
            if (host in setOf("localhost", "::1")) return true
            val parts = host.split('.')
            if (parts.size != 4) return false
            val octets = parts.map { it.toIntOrNull() ?: return false }
            if (octets.any { it < 0 || it >= 256 }) return false
            val a = octets[0]
            val b = octets[1]
            return a == 127 || a == 10 || (a == 192 && b == 168) || (a == 172 && b in 16..31)
        }

        private fun parseBase(origin: String): HttpUrl? {
            val trimmed = origin.trim()
            if (trimmed.isEmpty()) return null
            val url = try {
                trimmed.toHttpUrl()
            } catch (_: IllegalArgumentException) {
                null
            } ?: return null
            if (!url.isHttps && !isPrivateHost(url.host)) {
                throw IllegalArgumentException("生产接口必须使用 HTTPS，本地 HTTP 仅允许私有 IP")
            }
            if (url.username.isNotEmpty() || url.password.isNotEmpty() ||
                url.encodedPath != "/" || url.query != null || url.fragment != null
            ) {
                throw IllegalArgumentException("云接口只能配置来源地址")
            }
            return url
        }

        private fun backgroundScope(): CoroutineScope =
            CoroutineScope(SupervisorJob() + Dispatchers.IO)
    }

    // ---------- 构造校验（init 前置字段已建） ----------
    init {
        require(accountReadRetryDelaysMillis.size <= 3) { "Failed requirement." }
        for (d in accountReadRetryDelaysMillis) {
            require(d in 0L..4_000L) { "Failed requirement." }
        }
        require(companionReconnectDelaysMillis.size <= 24) { "Failed requirement." }
        for (d in companionReconnectDelaysMillis) {
            require(d in 0L..5_000L) { "Failed requirement." }
        }
        require(origin.isNotBlank() || base != null) { "云接口地址无效" }
    }

    // ---------- 简单查询/工具 ----------

    suspend fun checkGeneration(stamp: Long) {
        currentCoroutineContext().ensureActive()
        if (generation.get() != stamp) throw CancellationException("账号状态已改变")
    }

    fun diagnosticOperation(path: String): String = when (path) {
        "/v2/sharing/status", "/v2/sharing/contributions" -> "radio_sharing"
        "/v2/account" -> "account_read"
        "/v2/devices/enroll" -> "device_enroll"
        "/v2/places/search" -> "places_search"
        "/v2/auth/refresh" -> "auth_refresh"
        "/v2/runtime/permit" -> "runtime_permit"
        "/v2/places/reverse" -> "places_reverse"
        "/v2/environment/cells" -> "environment_cells"
        "/v2/wifi/nearby" -> "environment_wifi"
        "/v2/auth/device" -> "auth_device"
        "/v2/auth/register" -> "auth_register"
        "/v2/auth/login" -> "auth_login"
        else -> "cloud_request"
    }

    fun finishChecking(stamp: Long) {
        synchronized(stateLock) {
            if (generation.get() == stamp) {
                _state.value = _state.value.copy(checking = false)
            }
        }
    }

    fun publish(stamp: Long, next: CloudAccountState) {
        synchronized(stateLock) {
            if (generation.get() != stamp) throw CancellationException("账号状态已改变")
            _state.value = next
        }
    }

    fun handleFailure(exc: Exception, stamp: Long, operation: String = "cloud_request", syncDeniedCheck: Boolean = false) {
        _teeAvailability.value = sessionStore.teeAvailability()
        if (exc is CloudException) {
            if (exc.code in CloudDiagnosticQueue.CODES || (exc.httpStatus ?: 0) >= 500) {
                reportDiagnostic(operation, exc)
            }
        }
        synchronized(stateLock) {
            if (generation.get() != stamp) return
            when {
                exc is CancellationException -> {
                    _state.value = _state.value.copy(
                        hasSession = false, account = null, validated = false, checking = false,
                        deviceId = "", publicKeyFingerprint = "", failureCode = null,
                        initializing = false, passwordAuthenticated = false,
                    )
                }
                exc is CloudException && exc.code == "login_required" && !_state.value.validated -> {
                    val failureCode = _state.value.failureCode ?: exc.code
                    _state.value = _state.value.copy(
                        hasSession = false, account = null, validated = false, checking = false,
                        deviceId = "", publicKeyFingerprint = "", failureCode = failureCode,
                        initializing = false, passwordAuthenticated = false,
                    )
                }
                exc is CloudException && exc.code in INVALIDATE_COMPANION_CODES -> {
                    invalidate(code = exc.code)
                }
                exc is CloudException && exc.httpStatus == 403 && exc.code == "software_membership_required" -> {
                    val account = _state.value.account?.copy(softwareMembershipRequired = true)
                    _state.value = _state.value.copy(
                        hasSession = false, account = account, validated = false, checking = false,
                        deviceId = "", publicKeyFingerprint = "", failureCode = exc.code,
                        initializing = false, passwordAuthenticated = false,
                    )
                    _mapDisplayBinding.value = null
                    mapCacheVerifiedAt = null
                    persistMapPreview(null, stamp)
                }
                syncDeniedCheck && SyncAccess.denied(exc) -> {
                    _state.value = _state.value.copy(
                        hasSession = false, account = null, validated = false, checking = false,
                        deviceId = "", publicKeyFingerprint = "", failureCode = null,
                        initializing = false, passwordAuthenticated = false,
                    )
                }
                exc is CloudException && exc.httpStatus == 403 && exc.code == "subscription_required" && operation == "satellite" -> {
                    val account = _state.value.account?.copy(plan = "free")
                    _state.value = _state.value.copy(
                        hasSession = false, account = account, validated = false, checking = false,
                        deviceId = "", publicKeyFingerprint = "", failureCode = null,
                        initializing = false, passwordAuthenticated = false,
                    )
                }
                exc is CloudException && exc.httpStatus == 403 &&
                    ((exc.code == "subscription_required" && operation == "environment_wifi") ||
                        (operation == "radio_sharing" && exc.code in setOf(
                            "subscription_required", "registered_account_required", "primary_device_required"
                        )))
                -> {
                    _state.value = _state.value.copy(
                        hasSession = false, account = null, validated = false, checking = false,
                        deviceId = "", publicKeyFingerprint = "", failureCode = exc.code,
                        initializing = false, passwordAuthenticated = false,
                    )
                }
                exc is CloudException && exc.code == "session_proof_expired" -> {
                    sessionProof.clear()
                    _state.value = _state.value.copy(
                        hasSession = false, account = null, validated = false, checking = false,
                        deviceId = "", publicKeyFingerprint = "", failureCode = exc.code,
                        initializing = false, passwordAuthenticated = false,
                    )
                }
                exc is CloudException && (exc.code in IDENTITY_FAILURES || (exc.httpStatus ?: -1) in setOf(401, 403)) -> {
                    invalidate(code = exc.code)
                }
                !syncDeniedCheck -> {
                    val code = (exc as? CloudException)?.code ?: "service_unavailable"
                    _state.value = _state.value.copy(
                        hasSession = false, account = null, validated = false, checking = false,
                        deviceId = "", publicKeyFingerprint = "", failureCode = code,
                        initializing = false, passwordAuthenticated = false,
                    )
                }
            }
        }
    }

    fun hardwareSnapshot(identity: CloudHardwareIdentity, signingProfile: String?): JSONObject {
        val teeStatus = when (signingProfile) {
            TEE_SIGNING_PROFILE -> "supported"
            SOFTWARE_SIGNING_PROFILE -> "unsupported"
            else -> "unknown"
        }
        return JSONObject()
            .put("schemaVersion", 1)
            .put("signals", JSONObject(identity.signals ?: emptyMap<String, String>()))
            .put("hardwareInfo", JSONObject(identity.hardwareInfo ?: emptyMap<String, String>()))
            .put("readStatus", JSONObject(identity.readStatus ?: emptyMap<String, String>()))
            .put("collectionStatus", identity.collectionStatus)
            .put("teeStatus", teeStatus)
    }

    private fun invalidate(
        code: String? = null,
        expected: Long? = null,
        clearTokens: Boolean = true,
        keepDevice: Boolean = false,
    ): Long {
        var stamp: Long
        synchronized(stateLock) {
            if (expected != null && generation.get() != expected) {
                throw CancellationException("账号状态已改变")
            }
            passwordAccess = null
            passwordDeviceReady = false
            passwordDeviceRetry?.cancel()
            passwordDeviceRetry = null
            stamp = generation.incrementAndGet()
            mapCacheVerifiedAt = null
            mapRecheckStartedAt = null
            _mapDisplayBinding.value = null
            sessionProof.clear()
            if (sessionStore.companionMode()) {
                companionRun.clear()
            }
            val value = _state.value
            if (accountProtocol && code in setOf("device_login_required", "device_signed_out", "session_replaced")) {
                _signOutNotice.value = code
            }
            _mapQuotaExceeded.value = false
            satelliteView = false
            val hasSession = accountProtocol && keepDevice && value.hasSession
            _state.value = CloudAccountState(
                hasSession = hasSession,
                account = null,
                validated = false,
                checking = false,
                deviceId = value.deviceId,
                publicKeyFingerprint = value.publicKeyFingerprint,
                failureCode = code,
                initializing = false,
                passwordAuthenticated = false,
            )
        }
        mapResources?.cancelBefore(stamp)
        persistMapPreview(null, stamp)
        if (clearTokens) {
            try {
                writeTokens(null)
            } catch (t: Throwable) {
                synchronized(stateLock) {
                    if (generation.get() == stamp) {
                        storageLocked = true
                        _state.value = _state.value.copy(
                            hasSession = false, account = null, validated = false, checking = false,
                            deviceId = "", publicKeyFingerprint = "", failureCode = "storage_unavailable",
                            initializing = false, passwordAuthenticated = false,
                        )
                    }
                }
            }
        }
        return stamp
    }

    fun parseTokens(json: JSONObject): CloudTokens? {
        val access = json.getString("accessToken")
        val refresh = json.getString("refreshToken")
        val ok = access.length in 20..128 && refresh.length in 20..128
        if (!ok) throw CloudException("invalid_response")
        return CloudTokens(
            accessToken = access,
            refreshToken = refresh,
            accessExpiresAt = json.optLong(
                "accessExpiresAt",
                clock() + json.optLong("expiresIn", 900L) * 1000L,
            ),
            refreshExpiresAt = json.optLong("refreshExpiresAt"),
        )
    }

    suspend fun persistTokens(tokens: CloudTokens?, stamp: Long) {
        checkGeneration(stamp)
        writeTokens(tokens)
        sessionProof.clear()
        storageLocked = false
        if (generation.get() != stamp) {
            writeTokens(null)
            throw CancellationException("账号状态已改变")
        }
    }

    fun readTokens(): CloudTokens? {
        val started = System.nanoTime()
        try {
            return if (memorySession) memoryTokens else sessionStore.read()
        } catch (e: CloudException) {
            throw e
        } catch (_: Exception) {
            throw CloudException("storage_unavailable")
        } finally {
            CloudRequestTiming.record("session_storage", started)
        }
    }

    fun writeTokens(tokens: CloudTokens?) {
        if (memorySession) {
            memoryTokens = tokens
            if (tokens == null) memorySession = false
            return
        }
        try {
            sessionStore.write(tokens)
            if (tokens == null) storageLocked = false
        } catch (e: Exception) {
            if (tokens != null && allowMemorySession && e is CloudException && e.code == "storage_unavailable") {
                memorySession = true
                memoryTokens = tokens
                storageLocked = false
            } else {
                if (tokens == null) storageLocked = true
                if (e !is CloudException) throw CloudException("storage_unavailable")
            }
        }
    }

    fun recoveryEnrollment(): JSONObject {
        val identity = sessionStore.deviceHardwareIdentity()
        val json = JSONObject()
            .put("hint", sessionStore.deviceHint)
            .put("publicKey", sessionStore.publicKey)
            .put("deviceName", deviceName)
            .put("signals", JSONObject(identity.signals ?: emptyMap<String, String>()))
            .put("hardwareLogin", true)
        sessionStore.signingProfile()?.let { json.put("signingProfile", it) }
        if (base?.isHttps == true && !identity.hardwareInfo.isNullOrEmpty()) {
            json.put("hardwareInfo", JSONObject(identity.hardwareInfo.orEmpty()))
        }
        sessionStore.clientInfo()?.let { info ->
            json.put("clientInfo", info.toJson())
        }
        return json
    }

    suspend fun refreshTokens(tokens: CloudTokens, stamp: Long): CloudTokens {
        if (tokens.refreshExpiresAt > 0 && tokens.refreshExpiresAt <= clock()) {
            throw CloudException("invalid_session")
        }
        val json = request(
            path = "/v2/auth/refresh",
            body = JSONObject().put("refreshToken", tokens.refreshToken),
        )
        val fresh = parseTokens(json) ?: throw CloudException("invalid_response")
        persistTokens(fresh, stamp)
        return fresh
    }

    fun requireMapAccess() {
        val account = _state.value.account
        if (account != null && account.softwareMembershipRequired) {
            throw CloudException("software_membership_required", httpStatus = 403)
        }
    }

    private fun requireReadAuthorization(authorization: ReadAuthorization) {
        synchronized(stateLock) {
            requireValidated(authorization.generation)
            val account = _state.value.account ?: throw CloudException("login_required")
            val binding = authorization.binding
            val mismatch = account.id != binding.userId ||
                account.deviceId != binding.deviceId ||
                account.publicKeyFingerprint != binding.publicKeyFingerprint ||
                account.sessionId != binding.sessionId
            if (mismatch) throw CloudException("device_binding_mismatch")
        }
    }

    fun requireValidated(stamp: Long) {
        val s = _state.value
        if (generation.get() != stamp || !s.validated || !s.hasSession || s.account == null) {
            throw CloudException("login_required")
        }
        if (sessionStore.companionMode() && !companionRun.valid()) {
            throw CloudException("companion_lease_required")
        }
    }

    private fun persistMapPreview(binding: CloudRuntimeBinding?, stamp: Long) {
        mapPreviewScope.launch {
            mapPreviewIo.withLock {
                try {
                    sessionStore.saveMapPreviewBinding(binding)
                } catch (_: Throwable) {
                }
            }
        }
    }

    fun scheduleDiagnosticUpload() {
        if (!_state.value.validated) return
        val empty = try {
            sessionStore.pendingDiagnostics().isEmpty()
        } catch (_: Throwable) {
            true
        }
        if (empty) return
        if (!diagnosticUploadRunning.compareAndSet(false, true)) return
        diagnosticScope.launch {
            try {
                uploadPendingDiagnostics()
            } finally {
                diagnosticUploadRunning.set(false)
            }
        }
    }

    private fun scheduleCompanionReconnect(stamp: Long) {
        if (!sessionStore.companionMode() || companionReconnectDelaysMillis.isEmpty()) return
        val active = passwordDeviceRetry?.isActive == true
        if (active) return
        val job = companionScope.launch(start = CoroutineStart.LAZY) {
            for (delayMs in companionReconnectDelaysMillis) {
                delay(delayMs)
                try {
                    // 重连伴侣租约；失败时发布 companion_in_use 并继续
                    // 原版在循环中 publish failureCode=companion_in_use
                } catch (_: Throwable) {
                }
            }
        }
        passwordDeviceRetry = job
        job.start()
    }

    private fun startCompanionHeartbeat() {
        if (heartbeatStarted) return
        heartbeatStarted = true
        companionScope.launch {
            // 伴侣心跳循环（依赖 companionRun 有效期内定期续约）
        }
    }

    // ---------- 请求构建与执行 ----------

    private fun buildRequest(
        path: String,
        body: JSONObject? = null,
        accessToken: String? = null,
        query: Map<String, String> = emptyMap(),
        method: String? = null,
        deviceId: String = sessionStore.deviceId,
        signer: (String) -> String = { sessionStore.sign(it) },
    ): Request {
        require(path.startsWith("/v2/") && path.none { it == '?' || it == '#' || it.isISOControl() }) {
            "Failed requirement."
        }
        val origin = base ?: throw CloudException("cloud_not_configured")
        val urlBuilder = origin.newBuilder()
        urlBuilder.encodedPath(path)
        for ((k, v) in query) {
            urlBuilder.addQueryParameter(k, v)
        }
        val url = urlBuilder.build()
        val verb = method ?: if (body != null) "POST" else "GET"
        require(verb in BLOCKING_METHODS) { "Failed requirement." }
        val bytes = body?.toString()?.toByteArray(Charsets.UTF_8) ?: ByteArray(0)
        val pathWithQuery = url.encodedPath + (url.encodedQuery?.let { "?$it" } ?: "")
        val nonce = sessionStore.nonce()
        val timestamp = clock().toString()
        val bodyDigest = cloudBodyDigest(bytes)
        val extraDigest = cloudBodyDigest((accessToken ?: "").toByteArray(Charsets.UTF_8))
        val canonical = cloudCanonical(verb, pathWithQuery, bodyDigest, deviceId, nonce, timestamp, extraDigest)

        val signStarted = System.nanoTime()
        val proof = if (accessToken != null && CloudSessionProof.supports(verb, path)) {
            sessionProof.authorization(canonical, accessToken)
        } else null
        val signature = try {
            proof?.second ?: signer(canonical)
        } finally {
            CloudRequestTiming.record(if (proof != null) "session_sign" else "hardware_sign", signStarted)
        }

        val builder = Request.Builder().url(url)
            .header("Accept", "application/json")
            .header("X-Device-Id", deviceId)
            .header("X-Device-Nonce", nonce)
            .header("X-Device-Timestamp", timestamp)
            .header("X-Device-Signature", signature)
        if (accessToken != null) {
            builder.header("Authorization", "Bearer $accessToken")
        }
        if (proof != null) {
            builder.header("X-Session-Proof", proof.first)
        }
        if (sessionStore.companionMode() &&
            (accessToken != null || path in setOf("/v2/auth/refresh", "/v2/auth/logout"))
        ) {
            val unbound = path == "/v2/companion/lease"
            val leaseId = if (unbound) "" else companionRun.currentLeaseId
            builder.header("X-Run-Lease", leaseId)
            builder.header("X-Run-Signature", companionRun.sign(canonical, unbound))
        }
        val requestBody: RequestBody? = when (verb) {
            "POST" -> bytes.toRequestBody("application/json".toMediaType())
            "DELETE" -> ByteArray(0).toRequestBody(null)
            else -> null
        }
        return builder.method(verb, requestBody).build()
    }

    suspend fun performRequest(request: Request, timeoutMillis: Long? = null): JSONObject {
        val call = (if (timeoutMillis != null) {
            client.newBuilder().callTimeout(timeoutMillis, TimeUnit.MILLISECONDS).build().newCall(request)
        } else {
            client.newCall(request)
        })
        val continuation = suspendCancellableCoroutine<JSONObject> { cont ->
            cont.invokeOnCancellation { call.cancel() }
            call.enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    if (cont.isActive) {
                        cont.resumeWith(Result.failure(CloudException("network_error", operation = diagnosticOperation(request.url.encodedPath))))
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    response.use { resp ->
                        try {
                            if (resp.isSuccessful && resp.header("X-Session-Proof-Supported") == "1") {
                                serverProofSupported = true
                            }
                            val code = resp.code
                            if (code in 300..399) {
                                throw CloudException("redirect_rejected", httpStatus = code, operation = diagnosticOperation(request.url.encodedPath))
                            }
                            val limit = if (request.url.encodedPath == "/v2/account/sync") {
                                MAX_SYNC_RESPONSE_BYTES
                            } else MAX_RESPONSE_BYTES
                            val body = resp.body
                            if (body != null && body.contentLength() > limit) {
                                throw CloudException("response_too_large", httpStatus = code, operation = diagnosticOperation(request.url.encodedPath))
                            }
                            val text = body?.string() ?: ""
                            if (text.length > limit) {
                                throw CloudException("response_too_large", httpStatus = code, operation = diagnosticOperation(request.url.encodedPath))
                            }
                            val json = if (text.isBlank()) {
                                JSONObject()
                            } else {
                                try {
                                    JSONObject(text)
                                } catch (_: Exception) {
                                    throw CloudException(CloudResponseErrors.code(code, null), httpStatus = code, operation = diagnosticOperation(request.url.encodedPath))
                                }
                            }
                            if (resp.isSuccessful) {
                                if (cont.isActive) cont.resumeWith(Result.success(json))
                            } else {
                                val errCode = CloudResponseErrors.code(code, json.optString("code"))
                                val reason = json.optString("diagnosticReason")
                                throw CloudException(
                                    errCode,
                                    httpStatus = code,
                                    operation = diagnosticOperation(request.url.encodedPath),
                                    diagnosticReason = reason.takeIf { it in CloudDiagnosticDetails.REASONS },
                                )
                            }
                        } catch (e: Exception) {
                            if (cont.isActive) {
                                val mapped = if (e is IOException) {
                                    CloudException("network_error", operation = diagnosticOperation(request.url.encodedPath))
                                } else e
                                cont.resumeWith(Result.failure(mapped))
                            }
                        }
                    }
                }
            })
        }
        return continuation
    }

    // ---------- 高层请求 ----------

    suspend fun request(
        path: String,
        body: JSONObject? = null,
        accessToken: String? = null,
        query: Map<String, String> = emptyMap(),
        method: String? = null,
        deviceId: String = sessionStore.deviceId,
        timeoutMillis: Long? = null,
        signer: (String) -> String = { sessionStore.sign(it) },
    ): JSONObject {
        val req = buildRequest(path, body, accessToken, query, method, deviceId, signer)
        return try {
            performRequest(req, timeoutMillis)
        } catch (e: Exception) {
            handleFailure(e, generation.get(), diagnosticOperation(path), false)
            throw e
        }
    }

    /**
     * 带会话状态校验的 JSON 请求：读路径走非阻塞缓存读，写路径持锁并校验账号绑定。
     */
    suspend fun authenticatedJson(
        path: String,
        query: Map<String, String> = emptyMap(),
        body: JSONObject? = null,
        method: String? = null,
        expectedAccountId: String? = null,
        expectedSessionId: String? = null,
    ): JSONObject {
        val stamp: Long
        synchronized(stateLock) {
            if (expectedSessionId != null && _state.value.account?.sessionId != expectedSessionId) {
                throw CancellationException("会话已切换")
            }
            if (expectedAccountId != null && _state.value.account?.id != expectedAccountId) {
                throw CancellationException("账号已切换")
            }
            stamp = generation.get()
        }
        val isNonBlockingRead = body == null && (method == null || method == "GET") && path in NON_BLOCKING_READ_PATHS
        if (isNonBlockingRead) {
            return authenticatedRead(path, query, stamp)
        }
        return mutex.withLock {
            try {
                requireValidated(stamp)
                val json = authorized(path, query, body, method, stamp)
                val accountJson = json.optJSONObject("account")
                if (accountJson != null) {
                    val account = _state.value.account ?: throw CloudException("login_required")
                    val idOk = accountJson.optString("id") == account.id
                    val sessionOk = accountJson.optString("sessionId", accountJson.optString("currentSessionId")) == account.sessionId
                    if (!idOk || !sessionOk) throw CloudException("device_binding_mismatch")
                    updateAccount(accountJson, stamp)
                }
                requireValidated(stamp)
                scheduleDiagnosticUpload()
                json
            } catch (e: Exception) {
                handleFailure(e, stamp, diagnosticOperation(path), path in setOf("/v2/account/sync", "/v2/runtime/run"))
                throw e
            }
        }
    }

    /**
     * 非阻塞读路径：不长期持锁，允许读到略旧会话。
     * 原方法 bad-code，按调用点（authenticatedJson 读分支）与 @s90 行号语义重构。
     */
    suspend fun authenticatedRead(path: String, query: Map<String, String>, stamp: Long): JSONObject {
        requireValidated(stamp)
        val tokens = readTokens() ?: throw CloudException("login_required")
        ensureSessionProof(tokens, stamp)
        val req = buildRequest(
            path = path,
            body = null,
            accessToken = tokens.accessToken,
            query = query,
            method = "GET",
        )
        return try {
            performRequest(req)
        } catch (e: Exception) {
            handleFailure(e, stamp, diagnosticOperation(path), false)
            throw e
        }
    }

    /**
     * 需要授权的请求：刷新过期访问令牌 + 会话证明。
     * 原方法 bad-code，按 authenticatedJson 调用与 ensureSessionProof 流程重构。
     */
    suspend fun authorized(
        path: String,
        query: Map<String, String> = emptyMap(),
        body: JSONObject? = null,
        method: String? = null,
        stamp: Long = generation.get(),
    ): JSONObject {
        requireValidated(stamp)
        var tokens = readTokens() ?: throw CloudException("login_required")
        val now = clock()
        if (tokens.accessExpiresAt in 1 until now) {
            tokens = refreshTokens(tokens, stamp)
        }
        ensureSessionProof(tokens, stamp)
        val req = buildRequest(
            path = path,
            body = body,
            accessToken = tokens.accessToken,
            query = query,
            method = method,
        )
        return performRequest(req)
    }

    suspend fun ensureSessionProof(tokens: CloudTokens, stamp: Long) {
        if (!enableSessionProof || !sessionStore.getSupportsSessionProof() || !serverProofSupported ||
            !_state.value.validated || sessionProof.valid(tokens.accessToken)
        ) {
            return
        }
        checkGeneration(stamp)
        try {
            val json = request(
                path = "/v2/session-proof",
                body = JSONObject().put("publicKey", sessionProof.publicKey()),
                accessToken = tokens.accessToken,
                method = "POST",
            )
            checkGeneration(stamp)
            sessionProof.accept(json.getString("id"), json.getLong("expiresInMillis"), tokens.accessToken)
        } catch (e: CloudException) {
            if ((e.httpStatus ?: -1) !in setOf(404, 501)) throw e
            serverProofSupported = false
            sessionProof.clear()
        }
    }

    // ---------- 账号生命周期 ----------

    suspend fun signIn(username: String?, password: String?, invite: String? = null, allowUnverifiedDevice: Boolean = false) {
        val stamp: Long
        synchronized(stateLock) {
            stamp = generation.incrementAndGet()
            mapCacheVerifiedAt = null
            mapRecheckStartedAt = null
            _mapDisplayBinding.value = null
            val prev = _state.value
            _state.value = CloudAccountState(
                hasSession = false, account = null, validated = false, checking = true,
                deviceId = prev.deviceId, publicKeyFingerprint = prev.publicKeyFingerprint,
                failureCode = null, initializing = false, passwordAuthenticated = false,
            )
        }
        mapResources?.cancelBefore(stamp)
        persistMapPreview(null, stamp)
        try {
            withContext(Dispatchers.IO) {
                signInInternal(stamp, allowUnverifiedDevice, username, password, invite)
            }
        } catch (e: Exception) {
            if (username == null && sessionStore.getSupportsPasswordAccess()) {
                if (generation.get() == stamp) {
                    passwordDeviceRetry?.cancel()
                    passwordDeviceRetry = null
                    passwordAccess = null
                    passwordDeviceReady = false
                    val ce = e as? CloudException ?: CloudException("service_unavailable")
                    reportDiagnostic("auth_login", ce)
                    val code = (e as? CloudException)?.code ?: "service_unavailable"
                    publish(stamp, CloudAccountState(failureCode = code))
                }
                throw e
            }
            if (e is CancellationException) {
                synchronized(stateLock) {
                    if (generation.get() == stamp) invalidate(clearTokens = false, keepDevice = false)
                }
            }
            handleFailure(e, stamp, "cloud_request", false)
            throw e
        } finally {
            finishChecking(stamp)
        }
    }

    private suspend fun signInInternal(
        stamp: Long,
        allowUnverifiedDevice: Boolean,
        username: String?,
        password: String?,
        invite: String?,
    ) {
        // TODO(recovery): 完整设备注册/登录状态机（原 signIn$2，~16k 反编译行）
        // 流程：enroll → finishAccountSession →（可选）passwordSignIn / 访客恢复
        // 此处按调用点保留骨架，确保状态机字段与异常路径与 handleFailure 对齐
        val tokens = readTokens()
        if (tokens != null) {
            try {
                finishAccountSession(stamp)
                return
            } catch (_: Exception) {
                // fall through to fresh sign-in
            }
        }
        if (username != null && password != null) {
            passwordSignIn(username, password, stamp)
        } else {
            enroll(stamp)
        }
        finishAccountSession(stamp)
    }

    suspend fun passwordSignIn(username: String, password: String, stamp: Long) {
        // TODO(recovery): 原 passwordSignIn bad-code（630 指令单元）
        // 语义：CloudPasswordAccess 临时密钥 + /v2/auth/login 票据流
        val access = passwordAccess ?: CloudPasswordAccess { sessionStore.monotonicTimeNanos() }.also {
            passwordAccess = it
        }
        val json = request(
            path = "/v2/auth/login",
            body = JSONObject()
                .put("username", username)
                .put("passwordDigest", cloudBodyDigest(password.toByteArray(Charsets.UTF_8)))
                .put("devicePublicKey", access.publicKey),
        )
        val fresh = parseTokens(json) ?: throw CloudException("invalid_response")
        persistTokens(fresh, stamp)
        synchronized(stateLock) {
            if (generation.get() == stamp) {
                _state.value = _state.value.copy(passwordAuthenticated = true, validated = false)
            }
        }
    }

    suspend fun finishAccountSession(stamp: Long) {
        // TODO(recovery): 原 finishAccountSession bad-code（614 指令单元）
        // 语义：GET /v2/account → updateAccount → 标记 hasSession/validated
        val json = request(path = "/v2/account")
        updateAccount(json.optJSONObject("account") ?: json, stamp)
        synchronized(stateLock) {
            if (generation.get() != stamp) throw CancellationException("账号状态已改变")
            val account = _state.value.account ?: throw CloudException("login_required")
            _state.value = CloudAccountState(
                hasSession = true,
                account = account,
                validated = true,
                checking = false,
                deviceId = account.deviceId,
                publicKeyFingerprint = account.publicKeyFingerprint,
                failureCode = null,
                initializing = false,
                passwordAuthenticated = _state.value.passwordAuthenticated,
            )
        }
    }

    suspend fun restoreAccount(force: Boolean = false) {
        // TODO(recovery): 原 restoreAccount bad-code（373 指令单元）
        // 语义：读本地 tokens → 校验 → /v2/account 恢复 → finishAccountSession
        val tokens = readTokens() ?: return
        val stamp: Long
        synchronized(stateLock) {
            stamp = generation.incrementAndGet()
            _state.value = _state.value.copy(checking = true)
        }
        try {
            val json = authenticatedJson("/v2/account")
            updateAccount(json.optJSONObject("account") ?: json, stamp)
            finishAccountSession(stamp)
        } catch (e: Exception) {
            handleFailure(e, stamp, "account_read", false)
            throw e
        } finally {
            finishChecking(stamp)
        }
    }

    /**
     * 将账号 JSON 写入状态机。
     * 原方法 bad-code（727 指令单元），按 CloudAccount 字段与 authenticatedJson 调用点重构。
     */
    fun updateAccount(json: JSONObject, stamp: Long) {
        // TODO(recovery): 完整字段映射与设备角色/配额副作用
        val account = parseAccount(json)
        synchronized(stateLock) {
            if (generation.get() != stamp) throw CancellationException("账号状态已改变")
            _state.value = _state.value.copy(
                account = account,
                deviceId = account.deviceId.ifEmpty { _state.value.deviceId },
                publicKeyFingerprint = account.publicKeyFingerprint.ifEmpty { _state.value.publicKeyFingerprint },
                hasSession = account.sessionId.isNotEmpty() || _state.value.hasSession,
            )
        }
    }

    private fun parseAccount(json: JSONObject): CloudAccount {
        fun str(key: String, default: String = ""): String =
            if (json.has(key) && !json.isNull(key)) json.optString(key) else default
        fun longOrNull(key: String): Long? =
            if (json.has(key) && !json.isNull(key)) json.optLong(key) else null
        fun int(key: String, default: Int = 0): Int =
            if (json.has(key) && !json.isNull(key)) json.optInt(key) else default
        fun strSet(key: String): Set<String> {
            val arr = json.optJSONArray(key) ?: return emptySet()
            return (0 until arr.length()).map { arr.getString(it) }.toSet()
        }
        return CloudAccount(
            username = str("username"),
            plan = str("plan"),
            subscriptionExpiresAt = longOrNull("subscriptionExpiresAt"),
            searchLimit = int("searchLimit"),
            searchUsed = int("searchUsed"),
            resetsAt = json.optLong("resetsAt", 0L),
            isGuest = json.optBoolean("guest", json.optBoolean("isGuest", false)),
            visitorId = str("visitorId"),
            id = str("id"),
            deviceId = str("deviceId"),
            publicKeyFingerprint = str("publicKeyFingerprint"),
            sessionId = str("sessionId", str("currentSessionId")),
            capabilities = strSet("capabilities"),
            deviceRole = str("deviceRole"),
            quotaScope = str("quotaScope"),
            deviceQuotaActivatesAt = longOrNull("deviceQuotaActivatesAt"),
            softwareDeviceLimit = int("softwareDeviceLimit"),
            softwareDeviceCount = int("softwareDeviceCount"),
            softwareMembershipRequired = json.optBoolean("softwareMembershipRequired", false),
            membershipPlanId = str("membershipPlanId"),
            membershipPlanName = str("membershipPlanName"),
            membershipTier = str("membershipTier"),
            quotaPeriod = str("quotaPeriod"),
            quotaStartsAt = longOrNull("quotaStartsAt"),
            slotId = str("slotId"),
            extraQuotaRemaining = int("extraQuotaRemaining"),
            loginDeviceLimit = if (json.has("loginDeviceLimit") && !json.isNull("loginDeviceLimit")) {
                json.optInt("loginDeviceLimit")
            } else null,
            callBillingEnabled = json.optBoolean("callBillingEnabled", false),
            mapTileRemainder = int("mapTileRemainder"),
        )
    }

    suspend fun signOut() {
        val passwordOnly = _state.value.passwordAuthenticated && !_state.value.validated
        if (passwordOnly) {
            invalidate(clearTokens = false, keepDevice = passwordDeviceReady)
            return
        }
        val tokens = try {
            readTokens()
        } catch (_: Throwable) {
            null
        }
        val logoutRequest = tokens?.let {
            try {
                buildRequest(
                    path = "/v2/auth/logout",
                    body = JSONObject().put("refreshToken", it.refreshToken),
                )
            } catch (_: Throwable) {
                null
            }
        }
        val stamp = invalidate(clearTokens = true, keepDevice = false)
        try {
            withContext(Dispatchers.IO) {
                logoutRequest?.let { performRequest(it) }
            }
        } finally {
            synchronized(stateLock) {
                if (generation.get() == stamp) {
                    invalidate(clearTokens = false, keepDevice = false)
                }
            }
        }
    }

    suspend fun refreshAccount() {
        val stamp = generation.get()
        authenticatedJson("/v2/account")
        finishAccountSession(stamp)
    }

    suspend fun ensureAccount() {
        if (_state.value.validated && _state.value.account != null) return
        restoreAccount()
    }

    // ---------- 设备/会话列表 ----------

    suspend fun accountDevices(): List<CloudAccountDevice> {
        val json = authenticatedJson("/v2/account/devices")
        val arr = json.optJSONArray("devices") ?: return emptyList()
        return (0 until arr.length()).map { i ->
            val o = arr.getJSONObject(i)
            CloudAccountDevice(
                id = o.getString("id"),
                name = o.optString("name", ""),
                boundAt = o.optLong("boundAt", 0L),
                lastSeenAt = if (o.has("lastSeenAt") && !o.isNull("lastSeenAt")) o.optLong("lastSeenAt") else null,
                current = o.optBoolean("current", false),
                deviceRole = o.optString("deviceRole", ""),
                searchLimit = o.optInt("searchLimit", 0),
                searchUsed = o.optInt("searchUsed", 0),
                quotaScope = o.optString("quotaScope", ""),
                active = o.optBoolean("active", true),
                resetsAt = if (o.has("resetsAt") && !o.isNull("resetsAt")) o.optLong("resetsAt") else null,
                extraQuotaRemaining = o.optInt("extraQuotaRemaining", 0),
                appVersion = if (o.has("appVersion") && !o.isNull("appVersion")) o.optString("appVersion") else null,
            )
        }
    }

    suspend fun sessions(): List<CloudDeviceSession> {
        val json = authenticatedJson("/v2/account/sessions")
        val arr = json.optJSONArray("sessions") ?: return emptyList()
        return (0 until arr.length()).map { i ->
            val o = arr.getJSONObject(i)
            CloudDeviceSession(
                id = o.getString("id"),
                name = o.optString("name", ""),
                createdAt = o.optLong("createdAt", 0L),
                lastSeenAt = o.optLong("lastSeenAt", 0L),
                current = o.optBoolean("current", false),
            )
        }
    }

    suspend fun removeAccountDevice(device: CloudAccountDevice) {
        authenticatedJson(
            path = "/v2/account/devices/${device.id}",
            method = "DELETE",
        )
    }

    suspend fun revokeSession(session: CloudDeviceSession) {
        authenticatedJson(
            path = "/v2/account/sessions/${session.id}",
            method = "DELETE",
        )
    }

    // ---------- 搜索 ----------

    suspend fun search(engine: String, query: String): List<CloudPlace> {
        if (engine != "nominatim") throw CloudException("invalid_engine")
        val json = authenticatedJson(
            path = "/v2/places/search",
            query = mapOf("engine" to engine, "q" to query.trim()),
        )
        val arr = json.getJSONArray("items")
        val out = ArrayList<CloudPlace>(arr.length())
        for (i in 0 until arr.length()) {
            val o = arr.getJSONObject(i)
            if (o.getString("coordinateSystem") != "WGS84") throw CloudException("invalid_response")
            val lat = o.getDouble("lat")
            val lng = o.getDouble("lng")
            val inRange = kotlin.math.abs(lat) <= Double.MAX_VALUE &&
                kotlin.math.abs(lng) <= Double.MAX_VALUE &&
                lat in -90.0..90.0 && lng in -180.0..180.0
            if (!inRange) throw CloudException("invalid_response")
            val title = o.getString("title")
            val address = if (o.has("address") && !o.isNull("address")) o.optString("address") else title
            val source = o.getString("source")
            out.add(
                CloudPlace(
                    title = title,
                    address = address,
                    lat = lat,
                    lng = lng,
                    source = source,
                    details = parseCloudPlaceDetails(o),
                )
            )
        }
        return out
    }

    // ---------- 地图 ----------

    fun mapResourceCache(): CloudMapResourceCache? = sessionStore.mapResourceCache()

    fun mapRequestGeneration(): Long = generation.get()

    fun mapResourceCallFactory(): Call.Factory {
        mapResources?.let { return it }
        synchronized(this) {
            mapResources?.let { return it }
            val created = CloudMapResourceCallFactory(this, base, client, sessionStore.mapResourceCache())
            mapResources = created
            return created
        }
    }

    fun mapStyleUrl(satellite: Boolean = satelliteView): String {
        val origin = base ?: throw CloudException("cloud_not_configured")
        return if (satellite) {
            origin.newBuilder().encodedPath("/v2/maps/satellite/style.json").build().toString()
        } else {
            origin.newBuilder().encodedPath("/v2/maps/china/style.json").build().toString()
        }
    }

    fun satelliteTileUrl(): String {
        val origin = base ?: throw CloudException("cloud_not_configured")
        return origin.newBuilder().encodedPath("/v2/maps/satellite/tiles").build().toString()
    }

    fun setSatelliteView(enabled: Boolean) {
        satelliteView = enabled
    }

    fun satelliteAvailable(): Boolean = sessionStore.getSupportsDeviceProof()

    fun mapCacheAuthorization(stamp: Long): CloudMapAuthorization {
        // TODO(recovery): prepareRead 缓存分支（原 1.4k 行状态机）
        val tokens = readTokens() ?: throw CloudException("login_required")
        val account = _state.value.account ?: throw CloudException("login_required")
        val binding = CloudRuntimeBinding(
            userId = account.id,
            deviceId = account.deviceId,
            publicKeyFingerprint = account.publicKeyFingerprint,
            sessionId = account.sessionId,
        )
        val req = buildRequest(path = "/v2/maps/china/style.json", accessToken = tokens.accessToken)
        return CloudMapAuthorization(
            generation = stamp,
            accessToken = tokens.accessToken,
            binding = binding,
            signedRequest = req,
        )
    }

    suspend fun prepareMapRequest(path: String, variant: String, stamp: Long): CloudMapAuthorization {
        // TODO(recovery): 原 prepareMapRequest bad-code，含配额/缓存/续签状态机
        return mapCacheAuthorization(stamp)
    }

    suspend fun renewMapProof(authorization: CloudMapAuthorization): CloudMapAuthorization {
        // TODO(recovery): 原 renewMapProof 状态机
        val tokens = readTokens() ?: throw CloudException("login_required")
        return authorization.copy(accessToken = tokens.accessToken)
    }

    suspend fun mapRequestFailed(exc: CloudException, authorization: CloudMapAuthorization) {
        if (exc.code == "quota_exceeded") {
            _mapQuotaExceeded.value = true
        }
        handleFailure(exc, authorization.generation, "map", false)
    }

    fun <T> withMapAuthorization(authorization: CloudMapAuthorization, block: () -> T): T {
        requireReadAuthorization(
            ReadAuthorization(authorization.generation, authorization.accessToken, authorization.binding, authorization.signedRequest)
        )
        return block()
    }

    fun recheckMapAccountInBackground(stamp: Long) {
        if (!mapRecheckRunning.compareAndSet(false, true)) return
        mapPreviewScope.launch {
            try {
                val now = System.nanoTime()
                val last = mapCacheVerifiedAt
                if (last != null && now - last < MAP_CACHE_RECHECK_NANOS) return@launch
                mapRecheckStartedAt = now
                // 重新校验地图账号绑定；失败按 MAP_RECHECK_RETRY_NANOS 退避
            } finally {
                mapRecheckRunning.set(false)
            }
        }
    }

    // ---------- 运行时授权 ----------

    suspend fun runtimePermit(extra: JSONObject = JSONObject()): JSONObject {
        val tokens = readTokens() ?: throw CloudException("login_required")
        ensureSessionProof(tokens, generation.get())
        return request(
            path = "/v2/runtime/permit",
            body = extra,
            accessToken = tokens.accessToken,
            method = "POST",
        )
    }

    suspend fun requestRuntimePermit(extra: JSONObject = JSONObject()): JSONObject =
        runtimePermit(extra)

    suspend fun runtimePermitAndBinding(extra: JSONObject = JSONObject()): CloudRuntimeAuthorization {
        val json = runtimePermit(extra)
        val payload = json.optJSONObject("runtime_permit")
            ?: throw CloudException("invalid_response")
        val bindingJson = json.optJSONObject("runtime_binding")
            ?: throw CloudException("invalid_response")
        val account = _state.value.account ?: throw CloudException("login_required")
        return CloudRuntimeAuthorization(
            permit = CloudRuntimePermit(
                payload = payload.getString("payload"),
                signature = payload.getString("signature"),
            ),
            binding = CloudRuntimeBinding(
                userId = bindingJson.optString("userId", account.id),
                deviceId = bindingJson.optString("deviceId", account.deviceId),
                publicKeyFingerprint = bindingJson.optString("publicKeyFingerprint", account.publicKeyFingerprint),
                sessionId = bindingJson.optString("sessionId", account.sessionId),
            ),
        )
    }

    fun saveRuntimeRun(run: String) {
        try {
            sessionStore.writeRuntimeRun(run)
        } catch (_: Throwable) {
        }
    }

    fun savedRuntimeRun(): String? = try {
        sessionStore.readRuntimeRun()
    } catch (_: Throwable) {
        null
    }

    suspend fun finishRuntimeRun(runId: String, leaseId: String?, signature: String?) {
        // TODO(recovery): /v2/runtime/run 收尾
    }

    // ---------- 伴侣模式 ----------

    suspend fun selectCompanionMode(enabled: Boolean) {
        sessionStore.selectCompanionMode(enabled)
        _companionMode.value = sessionStore.companionMode()
    }

    suspend fun checkCompanionPairing() {
        // TODO(recovery): 轮询配对状态 → _pairing
    }

    suspend fun requestCompanionPairing(deviceName: String, pin: String) {
        // TODO(recovery): POST 配对请求
    }

    suspend fun approveCompanion(requestId: String, preview: CloudCompanionPreview) {
        // TODO(recovery): 批准配对
    }

    suspend fun companionDevice(): CloudCompanionDevice? {
        val json = authenticatedJson("/v2/companion/device")
        val o = json.optJSONObject("device") ?: return null
        return CloudCompanionDevice(
            deviceId = o.getString("deviceId"),
            deviceName = o.optString("deviceName", ""),
            boundAt = o.optLong("boundAt", 0L),
            activeUntil = if (o.has("activeUntil") && !o.isNull("activeUntil")) o.optLong("activeUntil") else null,
        )
    }

    suspend fun previewCompanion(deviceId: String): CloudCompanionPreview {
        val json = authenticatedJson(
            path = "/v2/companion/preview",
            query = mapOf("deviceId" to deviceId),
        )
        return CloudCompanionPreview(
            requestId = json.getString("requestId"),
            deviceName = json.optString("deviceName", ""),
            fingerprint = json.optString("fingerprint", ""),
        )
    }

    suspend fun releaseCompanion() {
        authenticatedJson(path = "/v2/companion/lease", method = "DELETE")
    }

    suspend fun removeCompanion(device: CloudCompanionDevice) {
        authenticatedJson(
            path = "/v2/companion/devices/${device.deviceId}",
            method = "DELETE",
        )
    }

    suspend fun ensureCompanionLease(tokens: CloudTokens, stamp: Long, force: Boolean = false) {
        if (!force && companionRun.valid()) return
        val json = request(
            path = "/v2/companion/lease",
            body = JSONObject().put("publicKey", companionRun.publicKey),
            accessToken = tokens.accessToken,
            method = "POST",
        )
        companionRun.accept(json.getString("leaseId"), json.getLong("expiresInSeconds"))
        startCompanionHeartbeat()
    }

    // ---------- 访客恢复 / 密码设备 ----------

    suspend fun generateGuestRecoveryCode(): CloudGuestRecoveryCode {
        val json = authenticatedJson(path = "/v2/account/recovery", method = "POST")
        return CloudGuestRecoveryCode(
            code = json.getString("code"),
            createdAt = json.optLong("createdAt", clock()),
        )
    }

    suspend fun guestRecoveryStatus(): JSONObject =
        authenticatedJson("/v2/account/recovery")

    suspend fun recoverGuest(code: String): JSONObject =
        authenticatedJson(
            path = "/v2/auth/recover",
            body = JSONObject().put("code", code),
        )

    suspend fun deviceRecoveryInfo(): JSONObject =
        authenticatedJson("/v2/account/device-recovery")

    suspend fun retryHardwareIdentity(force: Boolean = false) {
        // TODO(recovery): 硬件身份重注册
        enroll(generation.get())
    }

    suspend fun retryPasswordDevice() {
        // TODO(recovery): 密码设备重试调度
    }

    suspend fun completePasswordDevice(stamp: Long) {
        // TODO(recovery): completePasswordDevice bad-code
    }

    suspend fun acceptRecoveredDevice(json: JSONObject, proof: String, stamp: Long) {
        val deviceId = json.getString("deviceId")
        sessionStore.adoptRecoveredDevice(deviceId, proof)
        persistRecoveredDevice(json, proof, stamp)
    }

    suspend fun persistRecoveredDevice(json: JSONObject, proof: String, stamp: Long) {
        // TODO(recovery): 持久化恢复设备并更新状态
        val deviceId = json.optString("deviceId")
        if (deviceId.isNotEmpty()) {
            synchronized(stateLock) {
                if (generation.get() == stamp) {
                    _state.value = _state.value.copy(deviceId = deviceId)
                }
            }
        }
    }

    suspend fun enroll(stamp: Long) {
        // TODO(recovery): /v2/devices/enroll 完整注册（含硬件确认/TEE）
        val json = request(
            path = "/v2/devices/enroll",
            body = recoveryEnrollment(),
            method = "POST",
        )
        val tokens = parseTokens(json.optJSONObject("tokens") ?: JSONObject())
        if (tokens != null) persistTokens(tokens, stamp)
        updateAccount(json.optJSONObject("account") ?: JSONObject(), stamp)
    }

    // ---------- 升级制品 / 卫星图 / 诊断 ----------

    suspend fun downloadArtifact(
        artifact: CloudClientArtifact,
        target: File,
        onProgress: (Long) -> Unit = {},
    ) {
        // TODO(recovery): 流式下载 + sha256 校验
        throw CloudException("client_upgrade_required")
    }

    suspend fun satelliteManifest(): JSONObject =
        authenticatedJson("/v2/maps/satellite/manifest.json")

    fun reportDiagnostic(operation: String, exc: CloudException) {
        try {
            sessionStore.recordDiagnostic(
                exc.operation ?: operation,
                exc.code,
                exc.httpStatus,
                exc.diagnosticReason,
            )
        } catch (_: Throwable) {
        }
        scheduleDiagnosticUpload()
    }

    suspend fun uploadPendingDiagnostics() {
        val pending = try {
            sessionStore.pendingDiagnostics()
        } catch (_: Throwable) {
            emptyList()
        }
        if (pending.isEmpty()) return
        val stamp = generation.get()
        val arr = JSONArray()
        for (d in pending) {
            arr.put(JSONObject()
                .put("id", d.id)
                .put("operation", d.operation)
                .put("code", d.code)
                .put("category", d.category)
                .put("lastSeenAt", d.lastSeenAt))
        }
        try {
            request(
                path = "/v2/diagnostics",
                body = JSONObject().put("items", arr),
                method = "POST",
            )
            sessionStore.acknowledgeDiagnostics(pending)
        } catch (e: Exception) {
            handleFailure(e, stamp, "cloud_request", false)
        }
    }

    // ---------- 通知 ----------

    fun dismissAccountEntryError() {
        // 账号入口错误由 failureCode 驱动，dismiss 清空
        synchronized(stateLock) {
            _state.value = _state.value.copy(failureCode = null)
        }
    }

    fun dismissRegistrationNotice() {
        _registrationNotice.value = false
    }

    fun dismissSignOutNotice() {
        _signOutNotice.value = null
    }

    suspend fun memberInvite(): CloudMemberInvite {
        val json = authenticatedJson("/v2/account/invite")
        return CloudMemberInvite(
            code = json.optString("code", ""),
            invitedCount = json.optInt("invitedCount", 0),
        )
    }

    suspend fun changePassword(oldPassword: String, newPassword: String) {
        request(
            path = "/v2/auth/password",
            body = JSONObject()
                .put("oldPasswordDigest", cloudBodyDigest(oldPassword.toByteArray(Charsets.UTF_8)))
                .put("newPasswordDigest", cloudBodyDigest(newPassword.toByteArray(Charsets.UTF_8))),
            method = "POST",
        )
    }
}
