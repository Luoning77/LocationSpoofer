package com.vincenthzr.locationspoofer.data.cloud

import org.json.JSONObject

fun parseCloudPlaceDetails(json: JSONObject): CloudPlaceDetails? {
    if (!json.has("details") || json.isNull("details")) return null
    try {
        val details = json.getJSONObject("details")
        val boundingBox: List<Double> = details.optJSONArray("boundingBox")?.let { arr ->
            if (arr.length() != 0 && arr.length() != 4) throw CloudException("invalid_response")
            (0 until arr.length()).map { arr.getDouble(it) }
        } ?: run {
            if (details.has("boundingBox")) throw CloudException("invalid_response")
            emptyList()
        }
        if (boundingBox.isNotEmpty()) {
            for (v in boundingBox) {
                if (kotlin.math.abs(v) > Double.MAX_VALUE) throw CloudException("invalid_response")
            }
            val south = boundingBox[0]
            val north = boundingBox[1]
            val west = boundingBox[2]
            val east = boundingBox[3]
            val ok = south in -90.0..90.0 &&
                south <= north && north <= 90.0 &&
                west in -180.0..180.0 &&
                west <= east && east <= 180.0
            if (!ok) throw CloudException("invalid_response")
        }
        val osmId = if (details.has("osmId") && !details.isNull("osmId")) details.getLong("osmId") else null
        val placeRank = if (details.has("placeRank") && !details.isNull("placeRank")) details.getInt("placeRank") else null
        if (osmId != null && osmId <= 0) throw CloudException("invalid_response")
        if (placeRank != null && placeRank !in 0..30) throw CloudException("invalid_response")
        val osmType = text(details, "osmType")
        return CloudPlaceDetails(
            osmType = osmType.ifEmpty { null },
            osmId = osmId,
            category = text(details, "category"),
            type = text(details, "type"),
            addressType = text(details, "addressType"),
            placeRank = placeRank,
            addressParts = fields(details, "addressParts"),
            names = fields(details, "names"),
            extraTags = fields(details, "extraTags"),
            boundingBox = boundingBox,
            attribution = text(details, "attribution"),
            attributionUrl = text(details, "attributionUrl"),
        )
    } catch (e: CloudException) {
        throw e
    } catch (_: Exception) {
        throw CloudException("invalid_response")
    }
}

private fun text(json: JSONObject, key: String): String {
    if (!json.has(key) || json.isNull(key)) return ""
    val value = json.get(key) as? String
    if (value != null && value.length <= 8192) return value
    throw CloudException("invalid_response")
}

private fun fields(json: JSONObject, key: String): Map<String, String> {
    if (!json.has(key)) return emptyMap()
    val obj = json.getJSONObject(key)
    if (obj.length() > 128) throw CloudException("invalid_response")
    val map = LinkedHashMap<String, String>()
    for (k in obj.keys()) {
        var value = obj.get(k) as? String
        if (value != null) {
            if (k.length > 256 || value.length > 8192) value = null
            if (value != null) {
                map[k] = value
                continue
            }
        }
        throw CloudException("invalid_response")
    }
    return map
}
