package com.vincenthzr.locationspoofer.data.cloud

import java.util.UUID
import java.util.concurrent.CancellationException
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.json.JSONArray
import org.json.JSONObject

class RuntimeAuthorizationManager(
    private val cloud: CloudRepository,
    private val verifier: RuntimePermitVerifier = RuntimePermitVerifier(),
    private val scope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.IO),
) {
    private val requestMutex = Mutex()
    private val transitionLock = Any()
    private val handlers = LinkedHashMap<String, suspend () -> Unit>()
    private val stopSignals = LinkedHashMap<String, () -> Job>()
    private val _authorization = MutableStateFlow<RuntimeAuthorization?>(null)
    val authorization: StateFlow<RuntimeAuthorization?> = _authorization.asStateFlow()

    @Volatile
    private var billingRun: BillingRun? = null
    private var generation: Long = 0L
    private var nextRunGeneration: Long = 0L
    private var pendingStop: Job? = null

    init {
        scope.launch {
            cloud.state.collect { state ->
                val auth = _authorization.value ?: return@collect
                val account = state.account
                val binding = auth.claims.binding
                if (!state.validated) {
                    invalidate()
                    return@collect
                }
                val matches = account?.id == binding.userId &&
                    state.deviceId == binding.deviceId &&
                    state.publicKeyFingerprint == binding.publicKeyFingerprint
                if (!matches) {
                    invalidate()
                    return@collect
                }
                if (account.sessionId != binding.sessionId || account.softwareMembershipRequired) {
                    invalidate()
                }
            }
        }
        scope.launch {
            while (isActive) {
                delay(1_000L)
                val auth = _authorization.value ?: continue
                if (!isAuthorized(auth.requiredCapabilities)) {
                    invalidate()
                }
            }
        }
        scope.launch {
            while (isActive) {
                delay(30_000L)
                renewScheduledPermit()
            }
        }
    }

    suspend fun authorizeStart(
        requiredCapabilities: Set<String> = setOf("spoof"),
        keepExisting: Boolean = true,
        prepareBilling: Boolean = false,
    ) {
        requestMutex.withLock {
            if (keepExisting && isAuthorized(requiredCapabilities)) {
                return
            }
            awaitStopped()
            if (prepareBilling) {
                openBillingRun()
            }
            fetchPermit(requiredCapabilities, newRun = true, prepare = prepareBilling, expectedGeneration = null)
        }
    }

    suspend fun confirmStarted() {
        var attempt = 0
        while (true) {
            val auth = _authorization.value
            if (auth != null && isAuthorized(auth.requiredCapabilities)) {
                return
            }
            if (auth == null || attempt >= 15) {
                throw CloudException("runtime_authorization_required")
            }
            delay((attempt + 1) * 200L)
            attempt++
        }
    }

    suspend fun awaitStopped() {
        while (true) {
            val job = synchronized(transitionLock) { pendingStop } ?: return
            job.join()
            val stillSame = synchronized(transitionLock) { pendingStop === job }
            if (stillSame) {
                return
            }
        }
    }

    fun isAuthorized(requiredCapabilities: Set<String> = setOf("spoof")): Boolean {
        synchronized(transitionLock) {
            val auth = _authorization.value ?: return false
            return bindingMatchesAccount(auth.claims.binding) &&
                verifier.isValid(
                    auth.claims.binding,
                    auth.requiredCapabilities.intersect(requiredCapabilities),
                )
        }
    }

    fun requireAuthorized(requiredCapabilities: Set<String> = setOf("spoof")) {
        if (!isAuthorized(requiredCapabilities)) {
            throw CloudException("runtime_authorization_required")
        }
    }

    fun endRun() {
        synchronized(transitionLock) {
            generation++
            closeBillingRun()
            _authorization.value = null
            verifier.markStopped()
        }
    }

    fun attach(config: JSONObject) {
        synchronized(transitionLock) {
            if (config.optBoolean("active", false)) {
                val required = requiredCapabilities(config)
                requireAuthorized(required)
                val auth = _authorization.value
                    ?: throw CloudException("runtime_authorization_required")
                val binding = auth.claims.binding
                config.put(
                    "runtime_permit",
                    JSONObject()
                        .put("payload", auth.envelope.payload)
                        .put("signature", auth.envelope.signature),
                )
                config.put(
                    "runtime_binding",
                    JSONObject()
                        .put("userId", binding.userId)
                        .put("deviceId", binding.deviceId)
                        .put("publicKeyFingerprint", binding.publicKeyFingerprint)
                        .put("sessionId", binding.sessionId),
                )
                if (auth.requiredCapabilities != required) {
                    _authorization.value = auth.copy(requiredCapabilities = required)
                }
            } else {
                config.remove("runtime_permit")
                config.remove("runtime_binding")
            }
        }
    }

    fun invalidate(
        forceStop: Boolean = false,
        expectedRunGeneration: Long? = null,
    ): Job? {
        val signalsReady = CompletableDeferred<List<Job>>()
        var planned: Pair<Job, List<() -> Job>>? = null
        synchronized(transitionLock) {
            if (expectedRunGeneration != null) {
                val current = _authorization.value
                if (current?.runGeneration != expectedRunGeneration) {
                    return null
                }
            }
            generation++
            closeBillingRun()
            val previousAuth = _authorization.value
            _authorization.value = null
            verifier.markStopped()
            if (previousAuth == null || forceStop) {
                val previousStop = pendingStop
                val callbacks: List<suspend () -> Unit>
                val signalFns: List<() -> Job>
                synchronized(handlers) {
                    callbacks = handlers.values.toList()
                    signalFns = stopSignals.values.toList()
                }
                val stopping = scope.launch(start = CoroutineStart.LAZY) {
                    previousStop?.join()
                    val signalJobs = signalsReady.await()
                    for (callback in callbacks) {
                        callback()
                    }
                    for (job in signalJobs) {
                        job.join()
                    }
                }
                pendingStop = stopping
                planned = stopping to signalFns
            }
        }
        val (job, signalFns) = planned ?: return null
        val signalJobs = ArrayList<Job>(signalFns.size)
        for (fn in signalFns) {
            val started = try {
                fn()
            } catch (_: Throwable) {
                null
            }
            if (started != null) {
                signalJobs.add(started)
            }
        }
        signalsReady.complete(signalJobs)
        job.start()
        return job
    }

    fun registerStopHandler(key: String, handler: suspend () -> Unit) {
        synchronized(handlers) {
            handlers[key] = handler
        }
    }

    fun registerStopSignal(key: String, signal: () -> Job) {
        synchronized(handlers) {
            stopSignals[key] = signal
        }
    }

    fun unregisterStopHandler(key: String) {
        synchronized(handlers) {
            handlers.remove(key)
            stopSignals.remove(key)
        }
    }

    internal suspend fun renewPermit() {
        requestMutex.withLock {
            val current = _authorization.value ?: return
            fetchPermit(
                current.requiredCapabilities,
                newRun = false,
                prepare = false,
                expectedGeneration = null,
            )
        }
    }

    internal suspend fun renewScheduledPermit() {
        val current = _authorization.value ?: return
        val runGeneration = current.runGeneration
        try {
            renewPermit()
        } catch (e: CancellationException) {
            throw e
        } catch (_: CloudException) {
            invalidate(forceStop = false, expectedRunGeneration = runGeneration)
        } catch (_: Exception) {
            invalidate(forceStop = false, expectedRunGeneration = runGeneration)
        }
    }

    private suspend fun fetchPermit(
        requiredCapabilities: Set<String>,
        newRun: Boolean,
        prepare: Boolean,
        expectedGeneration: Long?,
    ) {
        val capturedGeneration = synchronized(transitionLock) {
            if (expectedGeneration != null && generation != expectedGeneration) {
                throw CloudException("runtime_request_cancelled")
            }
            generation
        }
        val body = JSONObject().put("requiredCapabilities", JSONArray(requiredCapabilities.toList()))
        val run = billingRun
        if (run != null) {
            body.put("runId", run.id).put("action", if (prepare) "prepare" else "renew")
        }
        val remote = cloud.runtimePermitAndBinding(body)
        val binding = RuntimePermitBinding(
            userId = remote.binding.userId,
            deviceId = remote.binding.deviceId,
            publicKeyFingerprint = remote.binding.publicKeyFingerprint,
            sessionId = remote.binding.sessionId,
        )
        val envelope = RuntimePermitEnvelope(
            payload = remote.permit.payload,
            signature = remote.permit.signature,
        )
        synchronized(transitionLock) {
            if (generation != capturedGeneration) {
                throw CloudException("runtime_request_cancelled")
            }
            if (!bindingMatchesAccount(binding)) {
                throw CloudException("login_required")
            }
            val claims = try {
                verifier.verify(envelope, binding, requiredCapabilities)
            } catch (_: Exception) {
                throw CloudException("invalid_runtime_permit")
            }
            val runGeneration = if (newRun) {
                (++nextRunGeneration)
            } else {
                _authorization.value?.runGeneration
                    ?: throw CloudException("runtime_request_cancelled")
            }
            _authorization.value = RuntimeAuthorization(
                envelope = envelope,
                claims = claims,
                requiredCapabilities = requiredCapabilities.toSet(),
                runGeneration = runGeneration,
            )
        }
    }

    private fun bindingMatchesAccount(binding: RuntimePermitBinding): Boolean {
        val state = cloud.state.value
        val account = state.account
        if (!state.validated) {
            return false
        }
        if (account != null && account.softwareMembershipRequired) {
            return false
        }
        if (account?.id != binding.userId) {
            return false
        }
        return account.sessionId == binding.sessionId &&
            state.deviceId == binding.deviceId &&
            state.publicKeyFingerprint == binding.publicKeyFingerprint
    }

    private fun openBillingRun() {
        val session = cloud.state.value.account?.sessionId
            ?: throw CloudException("login_required")
        val run = BillingRun(UUID.randomUUID().toString(), session)
        billingRun = run
        try {
            cloud.saveRuntimeRun(run.id)
        } catch (_: Throwable) {
        }
    }

    private fun closeBillingRun() {
        val run = billingRun ?: return
        billingRun = null
        try {
            cloud.saveRuntimeRun("")
        } catch (_: Throwable) {
        }
        scope.launch {
            try {
                cloud.finishRuntimeRun(run.id, "stop", run.session)
            } catch (_: Throwable) {
            }
        }
    }

    data class BillingRun(
        val id: String,
        val session: String,
    )

    companion object {
        fun requiredCapabilities(config: JSONObject): Set<String> {
            val caps = LinkedHashSet<String>()
            caps.add("spoof")
            if (config.optBoolean("is_route_mode", false)) {
                caps.add("route")
            } else {
                val points = config.optJSONArray("route_points")
                if ((points?.length() ?: 0) >= 2) {
                    caps.add("route")
                }
            }
            for (sensor in listOf("wifi", "cell", "bluetooth")) {
                if (config.optBoolean("mock_$sensor", false) ||
                    config.optBoolean("mock_${sensor}_requested", false)
                ) {
                    caps.add("environment")
                }
            }
            return caps.toSet()
        }
    }
}
