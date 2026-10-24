package com.vincenthzr.locationspoofer.data.sync

data class SyncSelection(
    val enabled: Boolean = false,
    val categories: Set<SyncCategory> = emptySet(),
) {
    val active: Boolean
        get() = enabled && categories.isNotEmpty()

    fun includes(key: String): Boolean {
        if (!active) return false
        return categories.any { key.startsWith(it.prefix) }
    }

    fun selected(entries: Map<String, String>): Map<String, String> {
        val out = LinkedHashMap<String, String>()
        for ((k, v) in entries) {
            if (includes(k)) out[k] = v
        }
        return out
    }

    fun replaceSelected(
        current: Map<String, String>,
        incoming: Map<String, String>,
    ): Map<String, String> {
        val out = LinkedHashMap<String, String>()
        for ((k, v) in current) {
            if (!includes(k)) out[k] = v
        }
        out.putAll(selected(incoming))
        return out
    }

    fun merge(
        base: Map<String, String>,
        local: Map<String, String>,
        remote: Map<String, String>,
        forceSettings: Boolean = false,
    ): Map<String, String> = SyncMerge.merge(
        selected(base),
        selected(local),
        selected(remote),
        forceSettings,
    )

    companion object {
        fun syncedCategories(categories: Set<String>?, revision: Long): Set<String> {
            if (categories != null) return categories
            if (revision <= 0) return emptySet()
            return SyncCategory.entries.mapTo(LinkedHashSet()) { it.id }
        }
    }
}
