package com.vincenthzr.locationspoofer.data.cloud

import com.vincenthzr.locationspoofer.data.model.RoutePoint
import com.vincenthzr.locationspoofer.utils.CoordinateUtils
import kotlinx.coroutines.flow.StateFlow
import org.json.JSONArray
import org.json.JSONObject
import kotlin.math.abs

class CloudGeoRepository(cloudRepository: CloudRepository) {
    private val cloud: CloudRepository = cloudRepository
    val accountState: StateFlow<CloudAccountState> = cloudRepository.state

    private fun validatePoint(lat: Double, lng: Double) {
        if (abs(lat) > Double.MAX_VALUE || abs(lng) > Double.MAX_VALUE ||
            lat < -90.0 || lat > 90.0 || lng < -180.0 || lng > 180.0
        ) {
            throw CloudException("invalid_coordinates")
        }
    }

    private fun pointBody(lat: Double, lng: Double): JSONObject {
        validatePoint(lat, lng)
        return JSONObject().put("lat", lat).put("lng", lng)
    }

    private suspend fun environment(kind: String, lat: Double, lng: Double, maxResults: Int): String {
        val json = cloud.authenticatedJson(
            path = "/v2/environment/$kind",
            body = pointBody(lat, lng),
        )
        val result = json.getJSONArray("result")
        if (result.length() > maxResults) {
            throw CloudException("invalid_response")
        }
        return result.toString()
    }

    suspend fun cells(lat: Double, lng: Double): String = environment("cells", lat, lng, 20)

    suspend fun providers(): Map<String, Boolean> {
        val json = cloud.authenticatedJson("/v2/providers")
        return listOf("cells", "nominatim", "community_wifi").associateWith {
            json.optBoolean(it, false)
        }
    }

    fun reportFrameworkPublicationFailure() {
        cloud.reportDiagnostic("framework_publish", CloudException("configuration_publish_failed"))
    }

    suspend fun reverse(lat: Double, lng: Double, engine: String?): CloudAddress {
        if (engine != "nominatim") {
            throw CloudException("invalid_engine")
        }
        validatePoint(lat, lng)
        val converted = CoordinateUtils.gcj02ToWgs84(lat, lng)
        val body = pointBody(converted.lat, converted.lng).put("engine", engine)
        val json = cloud.authenticatedJson("/v2/places/reverse", body = body)
        val result = json.getJSONObject("result")
        if (result.getString("coordinateSystem") != "WGS84") {
            throw CloudException("invalid_response")
        }
        val outLat = if (!result.has("lat") || result.isNull("lat")) null else result.getDouble("lat")
        val outLng = if (!result.has("lng") || result.isNull("lng")) null else result.getDouble("lng")
        if ((outLat == null) != (outLng == null)) {
            throw CloudException("invalid_response")
        }
        if (outLat != null && outLng != null) {
            validatePoint(outLat, outLng)
        }
        return CloudAddress(
            address = result.getString("address"),
            country = result.getString("country"),
            province = result.getString("province"),
            city = result.getString("city"),
            district = result.getString("district"),
            road = result.getString("road"),
            source = result.getString("source"),
            lat = outLat,
            lng = outLng,
            details = parseCloudPlaceDetails(result),
        )
    }

    suspend fun route(points: List<RoutePoint>, engine: String?, mode: String = "driving"): CloudRoute {
        if (engine !in setOf("self_hosted", "nominatim")) {
            throw CloudException("invalid_engine")
        }
        if (mode !in setOf("walking", "cycling", "driving")) {
            throw CloudException("invalid_route")
        }
        if (points.size < 2 || points.size >= 13) {
            throw CloudException("invalid_route")
        }
        for (p in points) {
            validatePoint(p.lat, p.lng)
        }
        val body = JSONObject().put("engine", engine).put("mode", mode)
        val arr = JSONArray()
        for (p in points) {
            val gcj = CoordinateUtils.wgs84ToGcj02(p.lat, p.lng)
            arr.put(pointBody(gcj.lat, gcj.lng))
        }
        body.put("points", arr)
        val json = cloud.authenticatedJson("/v2/routes/plan", body = body)
        val result = json.getJSONObject("result")
        if (result.getString("coordinateSystem") != "WGS84") {
            throw CloudException("invalid_response")
        }
        val pointsArr = result.getJSONArray("points")
        val length = pointsArr.length()
        if (length < 2 || length >= 10001) {
            throw CloudException("invalid_response")
        }
        val out = ArrayList<RoutePoint>(length)
        for (i in 0 until length) {
            val o = pointsArr.getJSONObject(i)
            val dLat = o.getDouble("lat")
            val dLng = o.getDouble("lng")
            val waitSec = o.optDouble("waitSec", 0.0)
            validatePoint(dLat, dLng)
            if (abs(waitSec) > Double.MAX_VALUE || waitSec < 0.0 || waitSec > 3600.0) {
                throw CloudException("invalid_response")
            }
            val gcj = CoordinateUtils.wgs84ToGcj02(dLat, dLng)
            out.add(RoutePoint(gcj.lat, gcj.lng, waitSec))
        }
        return CloudRoute(out, result.getString("source"))
    }

    suspend fun search(engine: String?, query: String): List<CloudPlace> {
        if (engine != "nominatim") {
            throw CloudException("invalid_engine")
        }
        val places = cloud.search(engine, query)
        return places.map { place ->
            val gcj = CoordinateUtils.wgs84ToGcj02(place.lat, place.lng)
            place.copy(lat = gcj.lat, lng = gcj.lng)
        }
    }
}
