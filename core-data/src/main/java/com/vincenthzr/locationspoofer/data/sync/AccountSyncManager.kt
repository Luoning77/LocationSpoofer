package com.vincenthzr.locationspoofer.data.sync

import android.content.Context
import android.util.AtomicFile
import com.vincenthzr.locationspoofer.data.cloud.CloudException
import com.vincenthzr.locationspoofer.data.cloud.CloudRepository
import com.vincenthzr.locationspoofer.data.db.AppDatabase
import com.vincenthzr.locationspoofer.utils.SettingsManager
import java.io.File
import java.io.FileNotFoundException
import java.security.MessageDigest
import java.util.concurrent.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.longOrNull
import org.json.JSONArray
import java.util.TreeMap
import org.json.JSONObject

class AccountSyncManager(
    context: Context,
    private val cloud: CloudRepository,
    private val settings: SettingsManager,
    private val database: AppDatabase,
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val mutex = Mutex()
    private val prefs = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE)
    private val local = LocalSyncData(settings, database, prefs)
    private val permissionPause = SyncPermissionPause()
    private val file = AtomicFile(
        File(
            context.noBackupFilesDir,
            "account-sync-" + MessageDigest.getInstance("SHA-256")
                .digest(cloud.originScope.toByteArray())
                .joinToString("") { "%02x".format(it) } + ".json",
        ),
    )
    private val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }
    private var journal: JsonObject? = null
    private var started = false
    private val _state = MutableStateFlow(AccountSyncState())
    val state: StateFlow<AccountSyncState> = _state.asStateFlow()

    fun start() {
        if (started) return
        started = true
        scope.launch {
            cloud.state
                .map { SyncAccess.accountKey(it) }
                .distinctUntilChanged()
                .collectLatest { runSync() }
        }
        scope.launch {
            val settingsFlow = callbackSettingsFlow()
            val tables = arrayOf(
                "location_records", "collection_routes", "saved_routes", "wifi_devices",
                "location_wifi", "location_connected_wifi", "cell_devices", "location_cells",
                "bluetooth_devices", "location_bluetooth",
            )
            val dbFlow = database.invalidationTracker.createFlow(*tables).map { }
            merge(settingsFlow, dbFlow).debounce(2000).collect { runSync() }
        }
        scope.launch {
            while (isActive) {
                delay(60_000)
                runSync()
            }
        }
    }

    fun refresh() {
        scope.launch { runSync(force = true) }
    }

    private fun callbackSettingsFlow() = callbackFlow {
        val watch = SYNC_WATCH_KEYS + setOf("saved_locations", "saved_routes", "sync_enabled", "sync_categories")
        val listener = android.content.SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
            if (key != null && key in watch) {
                trySend(Unit)
            }
        }
        prefs.registerOnSharedPreferenceChangeListener(listener)
        trySend(Unit)
        awaitClose { prefs.unregisterOnSharedPreferenceChangeListener(listener) }
    }

    private fun currentSelection(): SyncSelection {
        val stored = prefs.getStringSet("sync_categories", null)
        val categories = SyncCategory.entries.filter {
            stored == null || stored.contains(it.id)
        }.toSet()
        return SyncSelection(
            enabled = prefs.getBoolean("sync_enabled", false),
            categories = categories,
        )
    }

    private fun saveSelection(selection: SyncSelection) {
        prefs.edit()
            .putBoolean("sync_enabled", selection.enabled)
            .putStringSet("sync_categories", selection.categories.map { it.id }.toSet())
            .commit()
    }

    private fun accountScope(): String? {
        val state = cloud.state.value
        if (!state.validated) return null
        val account = state.account ?: return null
        return if (account.isGuest) "guest" else account.id
    }

    private fun requireScope(expected: String?) {
        if (accountScope() != expected) throw CancellationException("账号已切换")
    }

    private fun requireSelection(selection: SyncSelection) {
        if (currentSelection() != selection || !SyncAccess.allowed(cloud.state.value)) {
            throw CancellationException("同步选择或会员权益已改变")
        }
    }

    private fun load(): JsonObject {
        journal?.let { return it }
        return try {
            file.openRead().use { input ->
                val text = input.readBytes().decodeToString()
                json.parseToJsonElement(text).jsonObject.also { journal = it }
            }
        } catch (_: FileNotFoundException) {
            JsonObject(emptyMap())
        }
    }

    private fun save(value: JsonObject) {
        val stream = file.startWrite()
        try {
            stream.write(value.toString().toByteArray())
            file.finishWrite(stream)
            journal = value
        } catch (t: Throwable) {
            file.failWrite(stream)
            throw t
        }
    }

    private fun profile(root: JsonObject, account: String): JsonObject {
        val profiles = root["profiles"] as? JsonObject ?: return JsonObject(emptyMap())
        return profiles[account] as? JsonObject ?: JsonObject(emptyMap())
    }

    private fun withProfile(root: JsonObject, account: String, value: JsonObject): JsonObject {
        val profiles = root["profiles"] as? JsonObject ?: JsonObject(emptyMap())
        val map = LinkedHashMap(profiles)
        map[account] = value
        val out = LinkedHashMap(root)
        out["profiles"] = JsonObject(map)
        return JsonObject(out)
    }

    private fun entries(element: JsonElement?): Map<String, String> {
        val obj = element as? JsonObject ?: return emptyMap()
        val map = LinkedHashMap<String, String>()
        for ((k, v) in obj) {
            map[k] = v.jsonPrimitive.content
        }
        return map
    }

    private fun objectEntries(map: Map<String, String>): JsonObject {
        val sorted = TreeMap(map)
        val out = LinkedHashMap<String, JsonElement>()
        for ((k, v) in sorted) {
            out[k] = JsonPrimitive(v)
        }
        return JsonObject(out)
    }

    private fun syncProfile(
        account: String,
        localMap: Map<String, String>,
        base: Map<String, String>,
        revision: Long,
        categories: Set<String>?,
    ): JsonObject {
        val map = LinkedHashMap(profile(load(), account))
        map["local"] = objectEntries(localMap)
        map["base"] = objectEntries(base)
        map["revision"] = JsonPrimitive(revision)
        if (categories != null) {
            map["syncedCategories"] = JsonArray(categories.map { JsonPrimitive(it) })
        }
        return JsonObject(map)
    }

    private fun syncedCategories(profile: JsonObject): Set<String> {
        val cats = (profile["syncedCategories"] as? JsonArray)
            ?.mapNotNull { (it as? JsonPrimitive)?.content }
            ?.toSet()
        val revision = (profile["revision"] as? JsonPrimitive)?.longOrNull ?: 0L
        return SyncSelection.syncedCategories(cats, revision)
    }

    private suspend fun recoverPending() {
        val pending = load()["pending"] as? JsonObject ?: return
        val owner = (pending["owner"] as JsonPrimitive).content
        var value = (pending["profile"] as JsonObject)
        withContext(NonCancellable) {
            val previous = pending["previous"]?.let { entries(it) }
            val afterHolder = arrayOf<Map<String, String>>(emptyMap())
            local.apply(
                entries(value["local"]),
                previous,
            ) { _, after ->
                afterHolder[0] = after
                val map = LinkedHashMap(value)
                map["local"] = objectEntries(after)
                value = JsonObject(map)
                val journalMap = LinkedHashMap(load())
                journalMap["pending"] = JsonObject(
                    linkedMapOf(
                        "owner" to JsonPrimitive(owner),
                        "profile" to value,
                        "previous" to objectEntries(after),
                    ),
                )
                save(JsonObject(journalMap))
            }
        }
        val journalMap = LinkedHashMap(withProfile(load(), owner, value))
        journalMap["owner"] = JsonPrimitive(owner)
        journalMap.remove("pending")
        save(JsonObject(journalMap))
    }

    private suspend fun activate(account: String) {
        recoverPending()
        val root = load()
        val owner = (root["owner"] as? JsonPrimitive)?.content ?: account
        if (owner != account) {
            _state.value = AccountSyncState(syncing = true)
            val captured = local.capture()
            val oldProfile = profile(root, owner)
            val updatedProfile = LinkedHashMap(oldProfile)
            updatedProfile["local"] = objectEntries(captured)
            val saved = withProfile(root, owner, JsonObject(updatedProfile))
            save(saved)
            val nextProfile = profile(saved, account)
            val localMap = if (nextProfile.isNotEmpty()) entries(nextProfile["local"]) else emptyMap()
            val base = entries(nextProfile["base"])
            val revision = (nextProfile["revision"] as? JsonPrimitive)?.longOrNull ?: 0L
            applyLogged(account, localMap, base, revision)
        } else {
            val nextProfile = profile(root, account)
            val localMap = if (nextProfile.isNotEmpty()) entries(nextProfile["local"]) else emptyMap()
            val base = entries(nextProfile["base"])
            val revision = (nextProfile["revision"] as? JsonPrimitive)?.longOrNull ?: 0L
            applyLogged(account, localMap, base, revision)
        }
    }

    private suspend fun applyLogged(
        account: String,
        target: Map<String, String>,
        expectedLocal: Map<String, String>,
        revision: Long,
        baseline: Map<String, String>? = null,
        selection: SyncSelection? = null,
        categories: Set<String>? = null,
    ) {
        requireScope(account)
        local.validate(target)
        var nextProfile: JsonObject? = null
        withContext(NonCancellable) {
            local.apply(target, expectedLocal) { _, after ->
                requireScope(account)
                selection?.let { requireSelection(it) }
                val profileJson = syncProfile(account, after, baseline ?: emptyMap(), revision, categories)
                nextProfile = profileJson
                val pending = JsonObject(
                    linkedMapOf(
                        "owner" to JsonPrimitive(account),
                        "profile" to profileJson,
                        "previous" to objectEntries(after),
                    ),
                )
                val journalMap = LinkedHashMap(load())
                journalMap["pending"] = pending
                save(JsonObject(journalMap))
            }
        }
        val completed = nextProfile ?: return
        val journalMap = LinkedHashMap(withProfile(load(), account, completed))
        journalMap["owner"] = JsonPrimitive(account)
        journalMap.remove("pending")
        save(JsonObject(journalMap))
    }

    private suspend fun runSync(force: Boolean = false) {
        mutex.withLock {
            try {
                permissionPause.update(cloud.state.value, force)
                val scope = accountScope()
                if (scope == null) {
                    _state.value = AccountSyncState()
                    return
                }
                if (cloud.state.value.validated) {
                    val current = currentSelection()
                    val adjusted = SyncAccess.selection(cloud.state.value, current)
                    if (adjusted != current) saveSelection(adjusted)
                }
                if (permissionPause.code != null) {
                    _state.value = _state.value.copy(accessDeniedCode = permissionPause.code)
                    return
                }
                _state.value = _state.value.copy(syncing = true)
                activate(scope)
                requireScope(scope)
                if (scope == "guest" || !SyncAccess.allowed(cloud.state.value)) {
                    _state.value = AccountSyncState()
                    return
                }
                val selection = currentSelection()
                if (!selection.active) {
                    _state.value = AccountSyncState()
                    return
                }
                val profile = profile(load(), scope)
                val base = entries(profile["base"])
                val syncedCats = syncedCategories(profile)
                var categories = (syncedCats + selection.categories.map { it.id }).toMutableSet()
                if (SyncCategory.SETTINGS.id !in syncedCats) {
                    categories.remove(SyncCategory.SETTINGS.id)
                }
                var attempt = 0
                while (attempt < 4) {
                    attempt++
                    requireScope(scope)
                    requireSelection(selection)
                    val before = local.capture()
                    val remoteJson = cloud.authenticatedJson(
                        path = "/v2/account/sync",
                        expectedAccountId = if (scope == "guest") null else scope,
                    )
                    requireScope(scope)
                    requireSelection(selection)
                    val revision = remoteJson.getLong("revision")
                    val remoteObj = remoteJson.getJSONObject("entries")
                    val remote = LinkedHashMap<String, String>()
                    val keys = remoteObj.keys()
                    while (keys.hasNext()) {
                        val k = keys.next()
                        remote[k] = remoteObj.getString(k)
                    }
                    local.validate(remote)
                    val preferRemote = SyncCategory.SETTINGS.id in syncedCats && revision > 0
                    val merged = selection.merge(base, before, remote, preferRemote)
                    val nextLocal = selection.replaceSelected(before, merged)
                    local.validate(nextLocal)
                    requireSelection(selection)
                    if (nextLocal == before) {
                        val currentProfile = profile(load(), scope)
                        val nextProfile = syncProfile(scope, before, base, revision, categories)
                        if (currentProfile != nextProfile) {
                            save(withProfile(load(), scope, nextProfile))
                        }
                    } else {
                        requireScope(scope)
                        requireSelection(selection)
                        val after = local.capture()
                        val nextMerged = selection.merge(base, after, remote, preferRemote)
                        val nextLocal2 = selection.replaceSelected(after, nextMerged)
                        val nextBase = selection.replaceSelected(base, nextMerged)
                        if (nextLocal2 != after) {
                            applyLogged(scope, nextLocal2, nextBase, revision, after, selection, categories)
                        } else {
                            requireSelection(selection)
                            val currentProfile = profile(load(), scope)
                            val nextProfile = syncProfile(scope, before, base, revision, categories)
                            if (currentProfile != nextProfile) {
                                save(withProfile(load(), scope, nextProfile))
                            }
                        }
                    }
                    _state.value = AccountSyncState(lastSyncedAt = System.currentTimeMillis())
                    return
                }
                throw CloudException("sync_revision_conflict")
            } catch (e: CloudException) {
                if (e.code == "sync_revision_conflict") {
                    _state.value = _state.value.copy(syncing = false)
                    throw e
                }
                handleSyncError(e)
            } catch (e: CancellationException) {
                _state.value = _state.value.copy(syncing = false)
                throw e
            } catch (e: Exception) {
                handleSyncError(e)
            }
        }
    }

    private fun handleSyncError(e: Exception) {
        if (SyncAccess.denied(e)) {
            permissionPause.reject(e)
            _state.value = _state.value.copy(
                error = null,
                accessDeniedCode = permissionPause.code,
                syncing = false,
            )
        } else {
            val code = (e as? CloudException)?.code ?: "sync_failed"
            _state.value = _state.value.copy(error = code, syncing = false)
        }
    }

    suspend fun checkpointBeforeImport() {
        runSync()
        mutex.withLock {
            try {
                val scope = accountScope()?.takeIf { it != "guest" } ?: return@withLock
                permissionPause.update(cloud.state.value)
                if (permissionPause.code != null &&
                    SyncAccess.allowed(cloud.state.value) &&
                    currentSelection().active
                ) {
                    val current = cloud.authenticatedJson(
                        path = "/v2/account/sync",
                        expectedAccountId = scope,
                    )
                    requireScope(scope)
                    val body = JSONObject()
                        .put("baseRevision", current.getLong("revision"))
                        .put("entries", current.getJSONObject("entries"))
                        .put("reason", "before_import")
                    cloud.authenticatedJson(
                        path = "/v2/account/sync",
                        body = body,
                        expectedAccountId = scope,
                    )
                }
            } catch (e: CancellationException) {
                throw e
            } catch (e: Exception) {
                if (SyncAccess.denied(e)) {
                    permissionPause.reject(e)
                    _state.value = _state.value.copy(
                        error = null,
                        accessDeniedCode = permissionPause.code,
                    )
                } else {
                    throw e
                }
            } finally {
                _state.value = _state.value.copy(syncing = false)
            }
        }
    }

    suspend fun restoreArchive(
        account: String?,
        requestId: String?,
        sources: Map<String, Set<String>>?,
        kind: String?,
    ) {
        val target = account ?: return
        mutex.withLock {
            try {
                requireScope(target)
                activate(target)
                requireScope(target)
                val base = entries(profile(load(), target)["base"])
                val current = cloud.authenticatedJson(
                    path = "/v2/account/archives/current",
                    expectedAccountId = if (target == "guest") null else target,
                )
                requireScope(target)
                val sourceArray = JSONArray()
                for ((id, keys) in sources ?: emptyMap()) {
                    sourceArray.put(
                        JSONObject()
                            .put("id", id)
                            .put("keys", JSONArray(keys.toList())),
                    )
                }
                val body = JSONObject()
                    .put("requestId", requestId)
                    .put("kind", kind)
                    .put("baseRevision", current.getLong("revision"))
                    .put("sources", sourceArray)
                val restored = cloud.authenticatedJson(
                    path = "/v2/account/archives/restore",
                    body = body,
                    expectedAccountId = if (target == "guest") null else target,
                )
                requireScope(target)
                val entriesJson = restored.getJSONObject("entries")
                val restoredEntries = LinkedHashMap<String, String>()
                val it = entriesJson.keys()
                while (it.hasNext()) {
                    val k = it.next()
                    restoredEntries[k] = entriesJson.getString(k)
                }
                local.validate(restoredEntries)
                val restoredKeysArray = restored.getJSONArray("restoredKeys")
                require(restoredKeysArray.length() <= 10_000)
                val restoredKeys = (0 until restoredKeysArray.length())
                    .map { restoredKeysArray.getString(it) }
                    .toSet()
                val selectedEntries = restoredEntries.filterKeys { it in restoredKeys }
                val before = local.capture()
                val after = LinkedHashMap(before)
                after.putAll(selectedEntries)
                val categories = syncedCategories(profile(load(), target))
                val revision = restored.getLong("revision")
                applyLogged(
                    account = target,
                    target = after,
                    expectedLocal = LinkedHashMap(base).apply { putAll(selectedEntries) },
                    revision = revision,
                    baseline = before,
                    categories = categories,
                )
                _state.value = AccountSyncState(lastSyncedAt = System.currentTimeMillis())
            } finally {
                _state.value = _state.value.copy(syncing = false)
            }
        }
    }

    companion object {
        private val SYNC_WATCH_KEYS = setOf(
            "map_type", "map_engine", "wifi_source", "mock_wifi", "mock_cell", "mock_bluetooth",
            "enable_jitter", "restart_apps_on_spoof", "altitude", "altitude_variation_m",
            "satellite_count", "fixed_joystick_enabled", "route_lateral_deviation",
            "barometer_fluctuation", "realism_level", "speed_fluctuation_pct", "gait_template",
            "use_gait_template", "keep_last_map_position", "app_coordinate_systems",
            "system_hook_packages", "force_location_enabled", "is_dark_mode", "language",
            "is_language_set",
        )
    }
}
