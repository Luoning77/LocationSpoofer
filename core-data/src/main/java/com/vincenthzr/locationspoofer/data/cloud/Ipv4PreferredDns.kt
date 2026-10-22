package com.vincenthzr.locationspoofer.data.cloud

import java.net.Inet4Address
import java.net.InetAddress
import okhttp3.Dns

/**
 * 偏好 IPv4 解析结果的 DNS：把 A 记录排到 AAAA 前面，
 * 避免某些网络环境下 IPv6 路径导致地图/云请求失败。
 */
internal class Ipv4PreferredDns(
    private val delegate: Dns = Dns.SYSTEM
) : Dns {
    override fun lookup(hostname: String): List<InetAddress> =
        delegate.lookup(hostname).sortedBy { if (it is Inet4Address) 0 else 1 }
}
