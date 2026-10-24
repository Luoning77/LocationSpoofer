package com.vincenthzr.locationspoofer.data.cloud

import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request

/**
 * 地图资源调用工厂：把已签名的地图请求转成 MapLibre Resource。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/CloudMapResourceCallFactory.java（924 行）
 *
 * 注：resource()/ResourceCall 完整状态机（缓存、取消、body 包装）随 prepareRead 一并精修；
 * 当前版本提供可编译骨架与 cancelBefore/generation 语义。
 */
internal class CloudMapResourceCallFactory(
    private val repository: CloudRepository,
    private val base: HttpUrl?,
    private val client: OkHttpClient,
    val cache: CloudMapResourceCache?,
) : Call.Factory {

    @Volatile
    private var generationMark: Long = 0L

    fun cancelBefore(stamp: Long) {
        generationMark = stamp
    }

    fun refreshCachedStyle(request: Request, generation: Long) {
        // TODO(recovery): 刷新 style 缓存条目
    }

    override fun newCall(request: Request): Call = client.newCall(request)

    fun safeFailure(exc: Exception): IOException =
        if (exc is IOException) exc else IOException(exc)

    // TODO(recovery): resource(request): Resource、ResourceCall、GuardedBody（MapLibre 拉取协议）
}
