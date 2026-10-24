package com.vincenthzr.locationspoofer.data.sync

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import java.util.TreeMap
import java.util.UUID

object SyncMerge {

    private val json = Json {
        ignoreUnknownKeys = true
        encodeDefaults = true
    }

    private fun conflictCopy(key: String, value: String, syncId: String): String {
        val root = LinkedHashMap(json.parseToJsonElement(value).jsonObject)
        val category = when (key.substringBefore(':')) {
            "location" -> "location"
            "collection" -> "route"
            else -> null
        }
        if (category == null) {
            root["syncId"] = JsonPrimitive(syncId)
        } else {
            val nested = LinkedHashMap(root[category]?.let {
                it as? JsonObject ?: JsonObject(emptyMap())
            } ?: JsonObject(emptyMap()))
            nested["syncId"] = JsonPrimitive(syncId)
            root[category] = JsonObject(nested)
        }
        if (key.startsWith("collection:")) {
            val samples = root["samples"] as? JsonArray ?: JsonArray(emptyList())
            val updated = samples.map { sample ->
                val sampleObj = LinkedHashMap(sample.jsonObject)
                val loc = sampleObj["location"] as? JsonObject ?: JsonObject(emptyMap())
                val locObj = LinkedHashMap(loc)
                val oldSync = locObj["syncId"]?.let {
                    (it as? JsonPrimitive)?.content
                } ?: ""
                val newSync = UUID.nameUUIDFromBytes(
                    (syncId + "\n" + oldSync).toByteArray(Charsets.UTF_8),
                ).toString()
                locObj["syncId"] = JsonPrimitive(newSync)
                sampleObj["location"] = JsonObject(locObj)
                JsonObject(sampleObj)
            }
            root["samples"] = JsonArray(updated)
        }
        return JsonObject(root).toString()
    }

    fun merge(
        base: Map<String, String>,
        local: Map<String, String>,
        remote: Map<String, String>,
        forceSettings: Boolean = false,
    ): Map<String, String> {
        val keys = LinkedHashSet<String>()
        keys.addAll(base.keys)
        keys.addAll(local.keys)
        keys.addAll(remote.keys)
        val out = LinkedHashMap<String, String>()
        for (key in keys) {
            val baseV = base[key]
            var localV = local[key]
            val remoteV = remote[key]
            if ((forceSettings && key.startsWith("setting:") && remoteV != null) || localV == baseV) {
                localV = remoteV
            } else if (remoteV != baseV && localV != remoteV) {
                if (localV == null) {
                    localV = remoteV
                } else if (remoteV != null && !key.startsWith("setting:")) {
                    val id = UUID.nameUUIDFromBytes(
                        (key + "\n" + localV).toByteArray(Charsets.UTF_8),
                    ).toString()
                    out["${key.substringBefore(':')}:$id"] = conflictCopy(key, localV, id)
                    localV = remoteV
                }
            }
            if (localV != null) {
                out[key] = localV
            }
        }
        return TreeMap(out)
    }
}
