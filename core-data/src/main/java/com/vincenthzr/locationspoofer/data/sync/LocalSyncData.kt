package com.vincenthzr.locationspoofer.data.sync

import android.content.SharedPreferences
import androidx.room.withTransaction
import com.vincenthzr.locationspoofer.data.db.AppDatabase
import com.vincenthzr.locationspoofer.data.db.CompleteCollectionRoute
import com.vincenthzr.locationspoofer.data.db.CompleteLocation
import com.vincenthzr.locationspoofer.data.db.SavedRouteEntity
import com.vincenthzr.locationspoofer.data.model.SavedLocation
import com.vincenthzr.locationspoofer.utils.SettingsManager
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.intOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.longOrNull
import java.util.TreeMap

class LocalSyncData(
    private val settings: SettingsManager,
    private val database: AppDatabase,
    private val prefs: SharedPreferences,
) {
    private val env = database.environmentDao()
    private val routes = database.savedRouteDao()
    private val json = Json {
        encodeDefaults = true
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    suspend fun capture(): Map<String, String> {
        val result = TreeMap<String, String>()
        val all = prefs.all
        for ((key, value) in all) {
            if (key in SYNC_KEYS && key != "is_language_set") {
                val encoded = when (value) {
                    is Boolean, is Int, is Long, is Float, is Double -> value.toString()
                    is String -> org.json.JSONObject.quote(value)
                    else -> continue
                }
                result["setting:$key"] = encoded
            }
        }
        if ("setting:map_engine" !in result) result["setting:map_engine"] = "\"SELF_HOSTED\""
        if ("setting:map_type" !in result) result["setting:map_type"] = "\"NORMAL\""
        if ("setting:wifi_source" !in result) result["setting:wifi_source"] = "\"COMMUNITY\""

        val idByLocalId = HashMap<Long, String>()
        val allLocations = env.getAllCompleteLocations()
        for (complete in allLocations) {
            idByLocalId[complete.location.id] = complete.location.syncId
        }
        for (complete in allLocations) {
            if (complete.location.collectionRouteId == null) {
                result["location:${complete.location.syncId}"] =
                    json.encodeToString(CompleteLocation.serializer(), normalized(complete))
            }
        }
        for (collection in env.getCollectionRoutes()) {
            val stripped = collection.copy(
                route = collection.route.copy(id = 0L),
                samples = collection.samples
                    .sortedBy { it.location.syncId }
                    .map { normalized(it) },
            )
            result["collection:${collection.route.syncId}"] =
                json.encodeToString(CompleteCollectionRoute.serializer(), stripped)
        }
        for (favorite in settings.getSavedLocations()) {
            val element = json.encodeToJsonElement(SavedLocation.serializer(), favorite)
            val obj = LinkedHashMap(element.jsonObject)
            val sourceSyncId = favorite.sourceLocationSyncId
                ?: favorite.sourceLocationId?.let { idByLocalId[it] }
            if (sourceSyncId != null) {
                obj["sourceLocationSyncId"] = JsonPrimitive(sourceSyncId)
            }
            result["favorite:${favorite.syncId}"] = JsonObject(obj).toString()
        }
        for (route in routes.getAllSavedRoutesList()) {
            val stripped = route.copy(id = 0L)
            result["route:${route.syncId}"] =
                json.encodeToString(SavedRouteEntity.serializer(), stripped)
        }
        return result
    }

    suspend fun apply(
        requested: Map<String, String>,
        expectedLocal: Map<String, String>? = null,
        beforeApply: (Map<String, String>, Map<String, String>) -> Unit = { _, _ -> },
    ) {
        database.withTransaction {
            val current = capture()
            beforeApply(expectedLocal ?: emptyMap(), current)
            for ((key, value) in requested) {
                val idPart = key.substringBefore(':', "")
                val category = key.substringAfter(':', "")
                when (category) {
                    "location" -> {
                        val decoded = json.decodeFromString(CompleteLocation.serializer(), value)
                        saveLocation(idPart, decoded)
                    }
                    "collection" -> {
                        val decoded = json.decodeFromString(CompleteCollectionRoute.serializer(), value)
                        saveCollection(idPart, decoded)
                    }
                    "favorite" -> {
                        val decoded = json.decodeFromString(SavedLocation.serializer(), value)
                        saveFavorite(decoded)
                    }
                    "route" -> {
                        val decoded = json.decodeFromString(SavedRouteEntity.serializer(), value)
                        saveRoute(decoded)
                    }
                    "setting" -> {
                        val prim = json.parseToJsonElement(value).jsonPrimitive
                        when {
                            idPart in BOOL_KEYS -> prefs.edit().putBoolean(idPart, prim.content.toBooleanStrict()).apply()
                            idPart in INT_KEYS -> prefs.edit().putInt(idPart, prim.content.toInt()).apply()
                            else -> prefs.edit().putString(idPart, prim.content).apply()
                        }
                    }
                }
            }
        }
    }

    private suspend fun saveLocation(syncId: String, incoming: CompleteLocation): Long {
        val existing = env.getAllCompleteLocations().find { it.location.syncId == syncId }
        val location = incoming.location.copy(
            id = existing?.location?.id ?: 0L,
            syncId = syncId,
            collectionRouteId = incoming.location.collectionRouteId ?: existing?.location?.collectionRouteId,
        )
        val locationId = if (existing != null) {
            env.insertLocation(location)
            location.id
        } else {
            env.insertLocation(location)
        }
        env.deleteConnectedWifi(locationId)
        incoming.connectedWifi?.let {
            env.insertConnectedWifi(it.copy(locationId = locationId))
        }
        for (wifi in incoming.wifis) {
            env.insertWifiDevice(wifi.device)
            env.insertLocationWifi(wifi.locationWifi.copy(locationId = locationId))
        }
        for (cell in incoming.cells) {
            env.insertCellDevice(cell.device)
            env.insertLocationCell(cell.locationCell.copy(locationId = locationId))
        }
        for (bt in incoming.bluetooths) {
            env.insertBluetoothDevice(bt.device)
            env.insertLocationBluetooth(bt.locationBluetooth.copy(locationId = locationId))
        }
        return locationId
    }

    private suspend fun saveCollection(syncId: String, incoming: CompleteCollectionRoute) {
        val existing = env.getCollectionRoutes().find { it.route.syncId == syncId }
        val route = incoming.route.copy(
            id = existing?.route?.id ?: 0L,
            syncId = syncId,
        )
        val routeId = env.insertCollectionRoute(route)
        for (sample in incoming.samples) {
            val withRoute = sample.copy(location = sample.location.copy(collectionRouteId = routeId))
            val locationId = saveLocation(sample.location.syncId, withRoute)
            env.insertCompleteLocationData(
                withRoute.copy(location = withRoute.location.copy(id = locationId, collectionRouteId = routeId)),
                routeId,
            )
        }
    }

    private suspend fun saveFavorite(favorite: SavedLocation) {
        val list = settings.getSavedLocations().toMutableList()
        val index = list.indexOfFirst { it.syncId == favorite.syncId }
        if (index >= 0) list[index] = favorite else list.add(favorite)
        settings.saveLocationList(list)
    }

    private suspend fun saveRoute(route: SavedRouteEntity) {
        val existing = routes.getAllSavedRoutesList().find { it.syncId == route.syncId }
        routes.insertSavedRoute(if (existing != null) route.copy(id = existing.id) else route.copy(id = 0L))
    }

    fun validate(entries: Map<String, String>) {
        require(entries.size <= 10_000)
        for ((key, value) in entries) {
            val idPart = key.substringBefore(':', "")
            val category = key.substringAfter(':', "")
            when (category) {
                "location" -> {
                    val decoded = json.decodeFromString(CompleteLocation.serializer(), value)
                    require(decoded.location.syncId == idPart)
                    validLocation(decoded)
                }
                "collection" -> {
                    val decoded = json.decodeFromString(CompleteCollectionRoute.serializer(), value)
                    require(decoded.route.syncId == idPart)
                    val ids = decoded.samples.map { it.location.syncId }
                    require(ids.distinct().size == ids.size)
                    decoded.samples.forEach { validLocation(it) }
                }
                "favorite" -> {
                    val decoded = json.decodeFromString(SavedLocation.serializer(), value)
                    require(decoded.syncId == idPart)
                    validPosition(decoded.lat, decoded.lng)
                }
                "route" -> {
                    val decoded = json.decodeFromString(SavedRouteEntity.serializer(), value)
                    require(decoded.syncId == idPart)
                    val points = json.parseToJsonElement(decoded.pointsJson).jsonArray
                    for (point in points) {
                        val obj = point.jsonObject
                        validPosition(
                            obj.getValue("lat").jsonPrimitive.content.toDouble(),
                            obj.getValue("lng").jsonPrimitive.content.toDouble(),
                        )
                    }
                }
                "setting" -> {
                    require(idPart in SYNC_KEYS)
                    val prim = json.parseToJsonElement(value).jsonPrimitive
                    when {
                        idPart in BOOL_KEYS -> requireNotNull(prim.booleanOrNull)
                        idPart in INT_KEYS -> requireNotNull(prim.intOrNull)
                        else -> require(prim is JsonPrimitive && prim.isString)
                    }
                }
                else -> error("未知同步分类")
            }
        }
        val collectionIds = entries.filterKeys { it.startsWith("collection:") }
            .values
            .map { json.decodeFromString(CompleteCollectionRoute.serializer(), it).route.syncId }
        require(collectionIds.distinct().size == collectionIds.size)
        for (syncId in collectionIds) {
            val hasSample = entries.keys.any { it.startsWith("location:") }
            require(hasSample || collectionIds.isEmpty())
        }
    }

    private fun validLocation(complete: CompleteLocation) {
        validPosition(complete.location.lat, complete.location.lng)
        for (wifi in complete.wifis) {
            require(wifi.device.bssid == wifi.locationWifi.bssid)
        }
        for (cell in complete.cells) {
            require(cell.device.cellKey == cell.locationCell.cellKey)
        }
        for (bt in complete.bluetooths) {
            require(bt.device.address == bt.locationBluetooth.address)
        }
    }

    private fun validPosition(lat: Double, lng: Double) {
        require(lat in -90.0..90.0 && lng in -180.0..180.0)
    }

    private fun normalized(complete: CompleteLocation): CompleteLocation {
        val location = complete.location.copy(
            id = 0L,
            collectionRouteId = null,
            syncId = complete.location.syncId,
        )
        val connected = complete.connectedWifi?.copy(locationId = 0L)
        val wifis = complete.wifis.sortedBy { it.device.bssid }.map {
            it.copy(locationWifi = it.locationWifi.copy(locationId = 0L))
        }
        val cells = complete.cells.sortedBy { it.device.cellKey }.map {
            it.copy(locationCell = it.locationCell.copy(locationId = 0L))
        }
        val bluetooths = complete.bluetooths.sortedBy { it.device.address }.map {
            it.copy(locationBluetooth = it.locationBluetooth.copy(locationId = 0L))
        }
        return complete.copy(
            location = location,
            connectedWifi = connected,
            wifis = wifis,
            bluetooths = bluetooths,
            cells = cells,
        )
    }

    companion object {
        private val SYNC_KEYS = setOf(
            "map_type", "map_engine", "wifi_source", "mock_wifi", "mock_cell", "mock_bluetooth",
            "enable_jitter", "restart_apps_on_spoof", "altitude", "altitude_variation_m",
            "satellite_count", "fixed_joystick_enabled", "route_lateral_deviation",
            "barometer_fluctuation", "realism_level", "speed_fluctuation_pct", "gait_template",
            "use_gait_template", "keep_last_map_position", "app_coordinate_systems",
            "system_hook_packages", "force_location_enabled", "is_dark_mode", "language",
            "is_language_set",
        )
        private val BOOL_KEYS = setOf(
            "mock_wifi", "mock_cell", "mock_bluetooth", "enable_jitter", "restart_apps_on_spoof",
            "barometer_fluctuation", "fixed_joystick_enabled", "route_lateral_deviation",
            "use_gait_template", "keep_last_map_position", "force_location_enabled",
            "is_dark_mode", "is_language_set",
        )
        private val INT_KEYS = setOf(
            "altitude_variation_m", "realism_level", "speed_fluctuation_pct",
        )
    }
}
