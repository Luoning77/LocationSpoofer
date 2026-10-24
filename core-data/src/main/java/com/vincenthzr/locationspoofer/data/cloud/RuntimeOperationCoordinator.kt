package com.vincenthzr.locationspoofer.data.cloud

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.coroutineContext

class RuntimeOperationCoordinator(private val scope: CoroutineScope) {
    private val lock = Any()
    private val pending = LinkedHashSet<Job>()
    private var operation: Job? = null
    private var epoch = 0L

    fun isPreparing(): Boolean {
        synchronized(lock) {
            val job = operation
            return job != null && !job.isCompleted
        }
    }

    fun launch(block: suspend () -> Unit): Job {
        val job: Job
        synchronized(lock) {
            val previous = pending.filter { !it.isCompleted }
            epoch += 1
            val version = epoch
            operation?.cancel()
            job = scope.launch(start = CoroutineStart.LAZY) {
                withContext(NonCancellable) {
                    for (p in previous) p.join()
                }
                coroutineContext.ensureActive()
                val current = synchronized(lock) { this@RuntimeOperationCoordinator.epoch }
                if (current != version) return@launch
                block()
            }
            pending.add(job)
            operation = job
        }
        job.invokeOnCompletion {
            synchronized(lock) {
                pending.remove(job)
            }
        }
        job.start()
        return job
    }

    fun stop(block: suspend () -> Unit): Job {
        val job: Job
        synchronized(lock) {
            val previous = pending.filter { !it.isCompleted }
            epoch += 1
            operation?.cancel()
            operation = null
            job = scope.launch(start = CoroutineStart.LAZY) {
                withContext(NonCancellable) {
                    for (p in previous) p.join()
                    block()
                }
            }
            pending.add(job)
        }
        job.invokeOnCompletion {
            synchronized(lock) {
                pending.remove(job)
            }
        }
        job.start()
        return job
    }
}
