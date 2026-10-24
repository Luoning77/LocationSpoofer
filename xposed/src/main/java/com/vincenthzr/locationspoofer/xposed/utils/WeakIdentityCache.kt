package com.vincenthzr.locationspoofer.xposed.utils

import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference

/**
 * 以对象身份（而不是 equals）为键的弱引用缓存。
 *
 * 系统框架里大量对象没有可用的 equals/hashCode，或者其 equals 语义与「同一个实例」不同，
 * 所以这里用 [System.identityHashCode] + 引用相等来定位键，并用 [ReferenceQueue] 在键被回收时清理条目。
 */
internal class WeakIdentityCache<T> {
    private val queue = ReferenceQueue<Any>()
    private val values = HashMap<Key, T>()

    private fun clean() {
        while (true) {
            val reference = queue.poll() ?: return
            values.remove(reference)
        }
    }

    @Synchronized
    fun get(key: Any): T? {
        clean()
        return values[Key(key)]
    }

    @Synchronized
    fun getOrCreate(key: Any, factory: () -> T): T {
        clean()
        val existing = values[Key(key)]
        if (existing != null) return existing
        val created = factory()
        values[Key(key, queue)] = created
        return created
    }

    @Synchronized
    fun put(key: Any, value: T) {
        clean()
        values[Key(key, queue)] = value
    }

    private class Key(
        referent: Any,
        queue: ReferenceQueue<Any>? = null
    ) : WeakReference<Any>(referent, queue) {
        private val identityHash = System.identityHashCode(referent)

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Key) return false
            val mine = get() ?: return false
            return mine === other.get()
        }

        override fun hashCode(): Int = identityHash
    }
}
