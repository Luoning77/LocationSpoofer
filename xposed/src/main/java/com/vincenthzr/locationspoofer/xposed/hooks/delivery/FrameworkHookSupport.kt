package com.vincenthzr.locationspoofer.xposed.hooks.delivery

import android.os.Binder
import com.vincenthzr.locationspoofer.xposed.LocationHooker
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus
import com.vincenthzr.locationspoofer.xposed.hooks.SystemHookUtils
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers
import io.github.libxposed.api.XposedInterface
import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.util.Timer
import java.util.TimerTask
import org.json.JSONObject

/**
 * 框架投递 hook 的公共基座：句柄/定时器生命周期、反射工具、调用方识别、分节安装。
 */
open class FrameworkHookSupport(
    val module: LocationHooker,
    val loader: ClassLoader,
    private val feature: String,
) : AutoCloseable {

    @Volatile
    var live: Boolean = true
        private set

    private val handles = ArrayList<XposedInterface.HookHandle>()
    private val timers = ArrayList<Timer>()

    override fun close() {
        live = false
        synchronized(timers) {
            runCatching {
                timers.forEach { it.cancel() }
                timers.clear()
            }
        }
        synchronized(handles) {
            val iterator = handles.listIterator(handles.size)
            while (iterator.hasPrevious()) {
                iterator.previous().unhook()
            }
            handles.clear()
        }
    }

    /** 周期任务：仅在 live 时执行，异常被 [guard] 吞掉 */
    fun every(periodMillis: Long, action: () -> Unit) {
        val timer = Timer("LocationSpoofer-$feature", true)
        timer.schedule(object : TimerTask() {
            override fun run() {
                if (live) guard("tick", action)
            }
        }, periodMillis, periodMillis)
        synchronized(timers) { timers.add(timer) }
    }

    /** 沿父类链查找字段并 setAccessible（BLE 侧覆写为按 AOSP 字段名规则回退查找） */
    @Throws(NoSuchFieldException::class)
    open fun field(cls: Class<*>, name: String): Field {
        var current: Class<*>? = cls
        while (current != null) {
            try {
                return current.getDeclaredField(name).also { it.isAccessible = true }
            } catch (_: NoSuchFieldException) {
            }
            current = current.superclass
        }
        throw NoSuchFieldException("${cls.name}.$name")
    }

    fun get(target: Any, name: String): Any? = field(target.javaClass, name).get(target)

    fun set(target: Any, name: String, value: Any?) {
        field(target.javaClass, name).set(target, value)
    }

    /** 执行一段可能抛异常的逻辑：失败记日志并返回 null（不打断整个投递管线） */
    fun <T> guard(where: String, action: () -> T): T? =
        try {
            action()
        } catch (t: Throwable) {
            XposedBridge.logOpenCellIdEvery("FrameworkDelivery/$feature/$where", "$where: $t", 10_000L)
            null
        }

    /** 挂载方法的所有同名重载；未挂到任何重载时抛出（由调用方分节回滚） */
    fun hook(method: Method, callback: (XposedInterface.Chain) -> Any?) {
        val declaringClass = method.declaringClass
        val name = method.name
        val added = ArrayList<XposedInterface.HookHandle>()
        var count = 0
        for (candidate in declaringClass.declaredMethods) {
            if (candidate.name != name || Modifier.isAbstract(candidate.modifiers)) continue
            try {
                val handle = module.hook(candidate).intercept { chain ->
                    if (live && candidate == method) {
                        callback(chain)
                    } else {
                        chain.proceed(chain.args.toTypedArray())
                    }
                }
                added.add(handle)
                count++
            } catch (t: Throwable) {
                HookStatus.error("${declaringClass.name}#$name", t)
            }
        }
        HookStatus.methodHooked(declaringClass.name, name, count)
        synchronized(handles) { handles.addAll(added) }
        if (added.isEmpty()) {
            throw IllegalStateException("Unable to hook $method")
        }
    }

    /** 分节安装：任何一步抛异常则回滚本节的句柄与定时器，并返回 false */
    fun section(name: String, action: () -> Unit): Boolean {
        val handleCount = synchronized(handles) { handles.size }
        val timerCount = synchronized(timers) { timers.size }
        return try {
            action()
            true
        } catch (t: Throwable) {
            synchronized(handles) {
                while (handles.size > handleCount) {
                    handles.removeAt(handles.size - 1).unhook()
                }
                synchronized(timers) {
                    while (timers.size > timerCount) {
                        timers.removeAt(timers.size - 1).cancel()
                    }
                }
            }
            HookStatus.error("FrameworkDelivery/$feature/$name", t)
            XposedBridge.log("[FrameworkDelivery/$feature] $name disabled: $t")
            false
        }
    }

    /** 当前 Binder 调用方（uid + 包名） */
    fun caller(args: List<Any?>): FrameworkCaller =
        FrameworkCaller(Binder.getCallingUid(), SystemHookUtils.extractPackageName(args))

    /** 从任意 Binder 回调对象上读 getUid/getPackageName 构造调用方 */
    fun identity(target: Any): FrameworkCaller {
        val uid = call(target, "getUid") as? Int ?: 0
        val pkg = call(target, "getPackageName") as? String
        return FrameworkCaller(uid, pkg)
    }

    fun call(target: Any, name: String): Any? = method(target.javaClass, name).invoke(target, null)

    /** 沿父类链查找无参方法并 setAccessible */
    @Throws(NoSuchMethodException::class)
    fun method(cls: Class<*>, name: String, vararg parameterTypes: Class<*>): Method {
        var current: Class<*>? = cls
        while (current != null) {
            try {
                return current.getDeclaredMethod(name, *parameterTypes).also { it.isAccessible = true }
            } catch (_: NoSuchMethodException) {
            }
            current = current.superclass
        }
        throw NoSuchMethodException("${cls.name}.$name")
    }

    /** 是否应拦截本次调用（当前 live 且调用方命中配置的包名/uid 目标） */
    fun target(caller: FrameworkCaller, json: JSONObject, arg: Any? = null): Boolean =
        live && SystemHookUtils.isTargetCaller(arg, caller.pkg, json, caller.uid)

    @Throws(ClassNotFoundException::class)
    fun type(name: String): Class<*> = Class.forName(name, false, loader)
}
