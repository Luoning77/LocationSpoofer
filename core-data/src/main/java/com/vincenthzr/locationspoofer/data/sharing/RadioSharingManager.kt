package com.vincenthzr.locationspoofer.data.sharing

import com.vincenthzr.locationspoofer.data.cloud.CloudException
import java.util.concurrent.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class RadioSharingManager(
    private val source: RadioSharingSource,
    private val consent: SharingConsentStore,
    private val simulating: () -> Boolean,
    private val scope: CoroutineScope = CoroutineScope(SupervisorJob() + Dispatchers.IO),
) {

    private val lock = Any()
    private var binding: Binding? = null
    private var generation: Long = 0L
    private var statusJob: Job? = null
    private var uploadJob: Job? = null

    private val mutable = MutableStateFlow(SharingUiState())
    private val state: StateFlow<SharingUiState> = mutable.asStateFlow()

    init {
        scope.launch {
            source.accountState.collect { accountState ->
                synchronized(lock) {
                    val current = currentBinding()
                    if (current != binding) {
                        generation++
                        uploadJob?.cancel()
                        statusJob?.cancel()
                        uploadJob = null
                        statusJob = null
                        binding = current
                        mutable.value = SharingUiState(
                            enabled = current != null && consent.enabled(current.identity),
                        )
                    }
                }
                val job = statusJob
                if (binding != null && !state.value.available && (job == null || !job.isActive)) {
                    refresh()
                }
            }
        }
    }

    private fun accountId(ticket: SharingTicket): String = ticket.identity.substringBefore(':')

    private fun currentBinding(): Binding? {
        val accountState = source.accountState.value
        val account = accountState.account
        if (account == null ||
            !accountState.validated ||
            account.id.isBlank() ||
            account.deviceId.isBlank() ||
            account.sessionId.isBlank()
        ) {
            return null
        }
        return Binding("${account.id}:${account.deviceId}", account.sessionId)
    }

    private fun valid(ticket: SharingTicket): Boolean =
        binding == Binding(ticket.identity, ticket.session) &&
            generation == ticket.generation &&
            currentBinding() == binding

    fun beginCollection(): SharingTicket? {
        synchronized(lock) {
            val current = binding ?: return null
            if (currentBinding() == binding &&
                state.value.enabled &&
                state.value.eligible &&
                state.value.available &&
                !simulating()
            ) {
                return SharingTicket(current.identity, current.sessionId, generation)
            }
        }
        return null
    }

    fun getState(): StateFlow<SharingUiState> = state

    fun refresh() {
        synchronized(lock) {
            val current = binding ?: return
            val job = statusJob
            if (currentBinding() == binding && (job == null || !job.isActive)) {
                val ticket = SharingTicket(current.identity, current.sessionId, generation)
                val launched = scope.launch(start = CoroutineStart.LAZY) {
                    try {
                        synchronized(lock) {
                            if (!valid(ticket)) throw CancellationException()
                            mutable.update { it.copy(loading = true) }
                        }
                        val status = source.status(accountId(ticket))
                        synchronized(lock) {
                            if (valid(ticket)) {
                                mutable.update {
                                    it.copy(
                                        eligible = status.canContribute,
                                        available = status.enabled,
                                        counts = status.counts,
                                        loading = false,
                                        error = null,
                                    )
                                }
                            }
                        }
                    } catch (e: CancellationException) {
                        throw e
                    } catch (e: Exception) {
                        synchronized(lock) {
                            if (valid(ticket)) {
                                val code = (e as? CloudException)?.code ?: "sharing_network_failed"
                                mutable.update { it.copy(loading = false, error = code) }
                            }
                        }
                    }
                }
                launched.start()
                statusJob = launched
            }
        }
    }

    fun setEnabled(enabled: Boolean) {
        synchronized(lock) {
            val current = binding ?: return
            if (!enabled ||
                (state.value.eligible && state.value.available && currentBinding() == binding)
            ) {
                try {
                    consent.setEnabled(current.identity, enabled)
                    mutable.update {
                        it.copy(enabled = enabled, loading = false, uploading = false, error = null)
                    }
                } catch (e: Exception) {
                    if (enabled) {
                        mutable.update { it.copy(error = "sharing_save_failed") }
                    }
                }
                generation++
                uploadJob?.cancel()
                statusJob?.cancel()
                uploadJob = null
                statusJob = null
            }
        }
    }

    fun share(ticket: SharingTicket?, draft: RadioContributionDraft?) {
        synchronized(lock) {
            if (ticket == null || draft == null) return
            val job = uploadJob
            if (valid(ticket) &&
                state.value.enabled &&
                state.value.eligible &&
                !simulating() &&
                (job == null || !job.isActive)
            ) {
                val launched = scope.launch(start = CoroutineStart.LAZY) {
                    try {
                        synchronized(lock) {
                            if (!valid(ticket) || !state.value.enabled || simulating()) {
                                throw CancellationException()
                            }
                            mutable.update { it.copy(uploading = true) }
                        }
                        source.upload(draft, accountId(ticket))
                        val status = source.status(accountId(ticket))
                        synchronized(lock) {
                            if (valid(ticket)) {
                                mutable.update {
                                    it.copy(
                                        eligible = status.canContribute,
                                        available = status.enabled,
                                        counts = status.counts,
                                        uploading = false,
                                        error = null,
                                    )
                                }
                            }
                        }
                    } catch (e: CancellationException) {
                        throw e
                    } catch (e: Exception) {
                        synchronized(lock) {
                            if (valid(ticket)) {
                                val code =
                                    (e as? CloudException)?.code ?: "sharing_network_failed"
                                val ineligible = code in setOf(
                                    "subscription_required",
                                    "registered_account_required",
                                    "primary_device_required",
                                )
                                mutable.update {
                                    it.copy(
                                        eligible = it.eligible && !ineligible,
                                        uploading = false,
                                        error = code,
                                    )
                                }
                            }
                        }
                    }
                }
                launched.start()
                uploadJob = launched
            }
        }
    }

    fun withdraw() {
        synchronized(lock) {
            val current = binding ?: return
            setEnabled(false)
            val ticket = SharingTicket(current.identity, current.sessionId, generation)
            val launched = scope.launch(start = CoroutineStart.LAZY) {
                try {
                    synchronized(lock) {
                        if (!valid(ticket)) throw CancellationException()
                        mutable.update { it.copy(loading = true) }
                    }
                    source.withdraw(accountId(ticket))
                    val status = source.status(accountId(ticket))
                    synchronized(lock) {
                        if (valid(ticket)) {
                            mutable.update {
                                it.copy(counts = status.counts, loading = false)
                            }
                        }
                    }
                } catch (e: CancellationException) {
                    throw e
                } catch (e: Exception) {
                    synchronized(lock) {
                        if (valid(ticket)) {
                            val code = (e as? CloudException)?.code ?: "sharing_network_failed"
                            mutable.update { it.copy(loading = false, error = code) }
                        }
                    }
                }
            }
            launched.start()
            statusJob = launched
        }
    }

    private data class Binding(val identity: String, val sessionId: String)
}
