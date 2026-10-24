package com.vincenthzr.locationspoofer.data.update

import com.vincenthzr.locationspoofer.data.cloud.CloudException
import org.json.JSONObject

object AccountUpdates {
    const val CHECK_PATH = "/v2/client/updates"
    const val PREFERENCE_PATH = "/v2/account/beta"

    private fun <T> decode(block: () -> T): T = try {
        block()
    } catch (_: Exception) {
        throw CloudException("invalid_response")
    }

    fun parse(json: JSONObject, scheme: String, abis: Set<String>): AccountUpdateCatalog = decode {
        require(json.keys().asSequence().toSet() == setOf("schemaVersion", "betaEnabled", "catalog"))
        require(json.get("schemaVersion") == 1)
        val betaEnabled = json.get("betaEnabled") as Boolean
        val catalog = SelfHostedUpdates.parseCatalog(json.getJSONObject("catalog"), scheme, abis)
        if (!betaEnabled && catalog.any { it.isPrerelease }) {
            error("Check failed.")
        }
        AccountUpdateCatalog(betaEnabled, catalog)
    }

    fun parsePreference(json: JSONObject): Boolean = decode {
        require(json.keys().asSequence().toSet() == setOf("schemaVersion", "enabled"))
        require(json.get("schemaVersion") == 1)
        json.get("enabled") as Boolean
    }
}
