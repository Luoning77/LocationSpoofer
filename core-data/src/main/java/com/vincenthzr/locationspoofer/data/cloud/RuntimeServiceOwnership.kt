package com.vincenthzr.locationspoofer.data.cloud

/**
 * 云服务运行时持有者：跟踪"谁"拥有服务实例、是否已进入前台。
 * 恢复自 v3.0.16 APK（build 303f46d）data/cloud/RuntimeServiceOwnership.java
 */
class RuntimeServiceOwnership {

    data class Owner(
        val instance: Any,
        val generation: Long,
        val foreground: Boolean,
    )

    private var owner: Owner? = null

    @Synchronized
    fun begin(instance: Any, generation: Long) {
        owner = Owner(instance, generation, foreground = false)
    }

    /** 仅当 owner 与 (instance, generation) 匹配时置为前台，返回是否成功 */
    @Synchronized
    fun foregroundStarted(instance: Any, generation: Long): Boolean {
        val current = owner ?: return false
        if (current.instance === instance && current.generation == generation) {
            owner = current.copy(foreground = true)
            return true
        }
        return false
    }

    @Synchronized
    fun isRunning(): Boolean = owner?.foreground == true

    @Synchronized
    fun isRunningFor(generation: Long): Boolean =
        owner?.let { it.foreground && it.generation == generation } == true

    /** instance 匹配且（未给 generation 或 generation 匹配） */
    @Synchronized
    fun owns(instance: Any, generation: Long?): Boolean {
        val current = owner ?: return false
        if (current.instance !== instance) return false
        return generation == null || current.generation == generation
    }

    @Synchronized
    fun release(instance: Any, generation: Long?): Boolean {
        if (!owns(instance, generation)) return false
        owner = null
        return true
    }

    @Synchronized
    fun shouldCloseAfterNull(instance: Any, generation: Long?, newGeneration: Long?): Boolean =
        newGeneration == null && owns(instance, generation)
}
