package com.vincenthzr.locationspoofer.data.cloud

import java.io.IOException
import java.net.InetSocketAddress
import java.net.Proxy
import java.util.ArrayDeque
import java.util.concurrent.atomic.AtomicLong
import okhttp3.Call
import okhttp3.Connection
import okhttp3.EventListener
import okhttp3.Handshake
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response

object CloudRequestTiming {

    data class Sample(
        val phase: String,
        val nanos: Long,
    )

    private val samples = ArrayDeque<Sample>()
    private val sequence = AtomicLong()
    internal val listenerFactory: EventListener.Factory =
        EventListener.Factory { call -> TimingListener(call) }

    private class TimingListener(call: Call) : EventListener() {
        private val category: String = category(call.request().url.encodedPath)
        private val id: Long = sequence.incrementAndGet()
        private var dns: Long = 0
        private var connect: Long = 0
        private var tls: Long = 0
        private var started: Long = 0
        private var responseWait: Long = 0

        override fun callStart(call: Call) {
            started = System.nanoTime()
        }

        override fun callEnd(call: Call) {
            record("$category.total", started)
        }

        override fun callFailed(call: Call, ioe: IOException) {
            record("$category.failed", started)
        }

        override fun dnsStart(call: Call, domainName: String) {
            dns = System.nanoTime()
        }

        override fun dnsEnd(call: Call, domainName: String, inetAddressList: List<java.net.InetAddress>) {
            record("$category.dns", dns)
        }

        override fun connectStart(call: Call, inetSocketAddress: InetSocketAddress, proxy: Proxy) {
            connect = System.nanoTime()
        }

        override fun connectEnd(
            call: Call,
            inetSocketAddress: InetSocketAddress,
            proxy: Proxy,
            protocol: Protocol?,
        ) {
            record("$category.connect", connect)
        }

        override fun secureConnectStart(call: Call) {
            tls = System.nanoTime()
        }

        override fun secureConnectEnd(call: Call, handshake: Handshake?) {
            record("$category.tls", tls)
        }

        override fun connectionAcquired(call: Call, connection: Connection) = Unit

        override fun requestHeadersEnd(call: Call, request: Request) {
            responseWait = System.nanoTime()
        }

        override fun responseHeadersEnd(call: Call, response: Response) {
            record("$category.response", responseWait)
            response.header("Server-Timing")
        }
    }

    fun category(path: String): String = when {
        path.startsWith("/v2/maps/") -> "map"
        path == "/v2/devices/enroll" -> "enroll"
        path.startsWith("/v2/auth/") -> "auth"
        path == "/v2/account" -> "account"
        path.startsWith("/v2/runtime/") -> "runtime"
        else -> "data"
    }

    fun record(phase: String, startedNanos: Long) {
        val elapsed = (System.nanoTime() - startedNanos).coerceAtLeast(0L)
        synchronized(samples) {
            if (samples.size == 512) samples.removeFirst()
            samples.addLast(Sample(phase, elapsed))
        }
    }

    fun reset() {
        synchronized(samples) { samples.clear() }
    }

    fun snapshot(): List<Sample> = synchronized(samples) { samples.toList() }
}
