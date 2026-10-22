package com.vincenthzr.locationspoofer.xposed.hooks.delivery

import android.location.Criteria
import android.location.LocationManager
import com.vincenthzr.locationspoofer.xposed.LocationHooker
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus
import com.vincenthzr.locationspoofer.xposed.hooks.SystemHookUtils
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers
import io.github.libxposed.api.XposedInterface
import java.lang.reflect.Method
import java.util.Timer
import java.util.TimerTask

/**
 * 定位可用性伪造：定位总开关关闭时，让目标应用看到"定位可用/已启用"。
 *
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/delivery/FrameworkLocationAvailability.java。
 *
 * 覆盖四条判定链：
 * 1. LocationManagerService.isLocationEnabledForUser / isProviderEnabledForUser —— 用户级开关；
 * 2. LocationManagerService.getProviders —— 查询期间置 ThreadLocal 标记，供 isEnabled 复用；
 * 3. LocationProviderManager.isEnabled —— 受 getProviders 的 ThreadLocal 控制；
 * 4. LocationProviderManager.isActive —— 从参数里认出 CallerIdentity，按调用方决定是否强改开关位。
 *
 * 系统会缓存"定位已关闭"的结论（LocationManager.invalidateLocalLocationEnabledCaches），
 * 所以另起 1s 定时器，配置变化时主动失效缓存。
 */
internal class FrameworkLocationAvailability(
    private val module: LocationHooker,
    private val loader: ClassLoader,
) : SystemDeliveryAdapter {

    private val handles = mutableListOf<XposedInterface.HookHandle>()
    private val query = ThreadLocal<Boolean>()

    @Volatile
    private var live = true

    private var timer: Timer? = null
    private var invalidate: Method? = null

    private fun enabled(owner: Any?, uid: Int? = null, pkg: String? = null): Boolean {
        val config = module.readConfig() ?: return false
        return live && config.optBoolean("active", false) &&
            config.optBoolean("force_location_enabled", false) &&
            SystemHookUtils.isTargetCaller(owner, pkg, config, uid)
    }

    override fun install(): Boolean {
        try {
            val service = SystemClassLocator.locate(SystemComponent.LOCATION_MANAGER_SERVICE, loader)
                ?: return false
            val manager = SystemClassLocator.locate(SystemComponent.LOCATION_PROVIDER_MANAGER, loader)
                ?: return false

            val getManager = XposedHelpers.findMethodExact(service, "getLocationProviderManager", String::class.java)
            val callerIdentity = Class.forName("android.location.util.identity.CallerIdentity", false, loader)

            // 四个判定入口必须都返回 boolean，否则这个系统版本的结构已经变了，宁可整体放弃
            val expected = listOf(
                service.getDeclaredMethod("isLocationEnabledForUser", Int::class.javaPrimitiveType),
                service.getDeclaredMethod("isProviderEnabledForUser", String::class.java, Int::class.javaPrimitiveType),
                manager.getDeclaredMethod("isEnabled", Int::class.javaPrimitiveType),
                manager.getDeclaredMethod("isActive", Boolean::class.javaPrimitiveType, callerIdentity),
            )
            for (method in expected) {
                if (method.returnType != Boolean::class.javaPrimitiveType) {
                    throw IllegalStateException("Incompatible availability result")
                }
            }

            val invalidateMethod = LocationManager::class.java
                .getDeclaredMethod("invalidateLocalLocationEnabledCaches")
                .apply { isAccessible = true }
            invalidate = invalidateMethod

            // 1) 用户级开关
            for (name in listOf("isLocationEnabledForUser", "isProviderEnabledForUser")) {
                handles += XposedHelpers.hookAllMethods(service, name) { chain, method ->
                    val original = chain.proceed(chain.args.toTypedArray())
                    if ((method as Method).returnType != Boolean::class.javaPrimitiveType ||
                        !enabled(chain.thisObject)
                    ) {
                        original
                    } else if (name == "isProviderEnabledForUser" &&
                        getManager.invoke(chain.thisObject, chain.args.firstOrNull()) == null
                    ) {
                        // provider 不存在时保持系统原判，避免伪造出不存在的 provider
                        original
                    } else {
                        true
                    }
                }
            }

            // 2) getProviders：把"是否伪造"放进 ThreadLocal，供下游 isEnabled 使用
            handles += XposedHelpers.hookAllMethods(service, "getProviders") { chain, _ ->
                val previous = query.get()
                query.set(enabled(chain.thisObject))
                try {
                    chain.proceed(chain.args.toTypedArray())
                } finally {
                    if (previous == null) query.remove() else query.set(previous)
                }
            }

            // 3) isEnabled：仅当处于 getProviders 调用栈内才改写
            handles += XposedHelpers.hookAllMethods(manager, "isEnabled") { chain, method ->
                val original = chain.proceed(chain.args.toTypedArray())
                if (live && query.get() == true &&
                    (method as Method).returnType == Boolean::class.javaPrimitiveType
                ) {
                    true
                } else {
                    original
                }
            }

            // 4) isActive：从参数里找带 getUid 的 CallerIdentity，按调用方决定是否强改开关位
            handles += XposedHelpers.hookAllMethods(manager, "isActive") { chain, method ->
                val identity = chain.args.firstOrNull { value ->
                    value != null && value.javaClass.methods.any { it.name == "getUid" && it.parameterCount == 0 }
                }
                val force = runCatching {
                    identity != null && enabled(
                        chain.thisObject,
                        XposedHelpers.callMethod(identity, "getUid") as Int,
                        XposedHelpers.callMethod(identity, "getPackageName") as? String,
                    )
                }.getOrDefault(false)
                val args = chain.args.toTypedArray()
                val signature = method as Method
                // 仅覆盖"定位开关可用"入参，保留原方法里的用户、权限与电源策略判断
                if (force && signature.parameterTypes.contentEquals(
                        arrayOf(Boolean::class.javaPrimitiveType, identity?.javaClass)
                    )
                ) {
                    args[0] = true
                }
                val previous = query.get()
                query.set(force)
                try {
                    chain.proceed(args)
                } finally {
                    if (previous == null) query.remove() else query.set(previous)
                }
            }

            // getProviders/getBestProvider 被系统内联优化后 hook 可能不生效，主动去优化
            for (name in listOf("getProviders", "getBestProvider")) {
                module.deoptimize(
                    XposedHelpers.findMethodExact(
                        service, name, Criteria::class.java, Boolean::class.javaPrimitiveType!!,
                    )
                )
            }

            // 系统会缓存"定位已关闭"，配置一变就主动失效
            var lastKey: String? = null
            timer = Timer("LocationSpoofer-FrameworkDeliveryAvailability", true).apply {
                schedule(object : TimerTask() {
                    override fun run() {
                        if (!live) return
                        runCatching {
                            val config = module.readConfig()
                            val key = "${config?.optBoolean("active", false)}|" +
                                "${config?.optBoolean("force_location_enabled", false)}|" +
                                "${config?.optBoolean("system_hook_global_mode", false)}|" +
                                "${config?.optJSONArray("system_hook_packages")}"
                            if (key != lastKey) {
                                invalidateMethod.invoke(null)
                                lastKey = key
                            }
                        }.onFailure { HookStatus.error("FrameworkDelivery availability cache", it) }
                    }
                }, 0L, 1000L)
            }
            return true
        } catch (error: Throwable) {
            HookStatus.error("FrameworkDelivery availability", error)
            close()
            return false
        }
    }

    override fun close() {
        live = false
        timer?.cancel()
        timer = null
        handles.asReversed().forEach { handle ->
            runCatching { handle.unhook() }.onFailure { HookStatus.error("FrameworkDelivery unhook", it) }
        }
        handles.clear()
        query.remove()
        runCatching { invalidate?.invoke(null) }
    }
}
