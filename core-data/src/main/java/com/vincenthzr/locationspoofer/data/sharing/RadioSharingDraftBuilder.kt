package com.vincenthzr.locationspoofer.data.sharing

import com.vincenthzr.locationspoofer.data.model.SharedWifiObservation
import java.util.Locale
import java.util.UUID
import java.util.regex.Pattern
import org.json.JSONArray
import org.json.JSONObject

object RadioSharingDraftBuilder {

    private val MAC_PATTERN = Pattern.compile("[0-9a-f]{2}(:[0-9a-f]{2}){5}")
    private val BLOCKED_MACS =
        setOf("00:00:00:00:00:00", "02:00:00:00:00:00", "ff:ff:ff:ff:ff:ff")

    private fun fresh(
        minElapsedNanos: Long,
        nowElapsedNanos: Long,
        observedElapsedNanos: Long,
    ): Boolean {
        if (observedElapsedNanos <= 0L || observedElapsedNanos < minElapsedNanos) return false
        val ageNanos = nowElapsedNanos - observedElapsedNanos
        return ageNanos in 0..15_000_000_000L
    }

    private fun validMac(address: String): Boolean =
        MAC_PATTERN.matcher(address).matches() && address !in BLOCKED_MACS

    private fun areaKey(type: String?): String = when (type) {
        "NR", "LTE" -> "tac"
        "CDMA" -> "networkId"
        else -> "lac"
    }

    private fun cellKey(type: String?): String = when (type) {
        "NR" -> "nci"
        "LTE" -> "ci"
        "CDMA" -> "basestationId"
        else -> "cid"
    }

    private fun maxCellId(type: String?): Long = when (type) {
        "NR" -> 68_719_476_735L
        "GSM", "LTE", "WCDMA" -> 268_435_455L
        "CDMA" -> 65_535L
        else -> -1L
    }

    private fun maxAreaId(type: String?): Long = if (type == "NR") 16_777_215L else 65_535L

    fun build(
        location: SharingLocation,
        minElapsedNanos: Long,
        nowElapsedNanos: Long,
        wifiJson: String,
        bluetoothJson: String,
        cellsJson: String,
    ): RadioContributionDraft? {
        val lat = location.lat
        val lng = location.lng
        val accuracy = location.accuracy
        val elapsedNanos = nowElapsedNanos - location.elapsedNanos
        if (location.mock) return null
        if (accuracy !in 0.1f..50.0f) return null
        if (elapsedNanos !in 0..30_000_000_000L) return null
        if (lat !in -90.0..90.0) return null
        if (lng !in -180.0..180.0) return null

        val wifiObservations = mutableListOf<SharedWifiObservation>()
        val wifiRoot = JSONObject(wifiJson)
        val wifiItems = mutableListOf<JSONObject>()
        wifiRoot.optJSONObject("connectedWifi")?.let { wifiItems.add(it) }
        val nearbyArray = wifiRoot.optJSONArray("nearbyWifi") ?: JSONArray()
        for (index in 0 until nearbyArray.length()) {
            wifiItems.add(nearbyArray.getJSONObject(index))
        }
        for (item in wifiItems) {
            val observedElapsedMicros = item.optLong("observedElapsedMicros", 0L) * 1000L
            if (!fresh(minElapsedNanos, nowElapsedNanos, observedElapsedMicros)) continue
            val bssid = item.optString("bssid").lowercase(Locale.ROOT)
            val ssid = item.optString("ssid")
            val frequency = item.optInt("frequency")
            val level = item.optInt("level")
            val capabilities = item.optString("capabilities")
            val ageMicros = (nowElapsedNanos - observedElapsedMicros) / 1000L
            if (ageMicros !in 0..15_000_000L) continue
            if (!MAC_PATTERN.matcher(bssid).matches()) continue
            if ((bssid.take(2).toInt(16) and 1) != 0) continue
            if (bssid in BLOCKED_MACS) continue
            if (ssid.isBlank()) continue
            if (ssid.toByteArray(Charsets.UTF_8).size > 32) continue
            if (ssid.any { it.isISOControl() }) continue
            if (frequency !in 2400..7125) continue
            if (level !in -100..-10) continue
            val cleanedCapabilities =
                capabilities.filterNot { it.isISOControl() }.take(64)
            wifiObservations.add(
                SharedWifiObservation(bssid, ssid, frequency, level, cleanedCapabilities),
            )
        }
        val wifiFinal = wifiObservations.distinctBy { it.bssid }.take(40)

        val bluetoothObservations = mutableListOf<SharedBluetooth>()
        val bluetoothArray = JSONArray(bluetoothJson)
        for (index in 0 until bluetoothArray.length()) {
            val item = bluetoothArray.getJSONObject(index)
            if (!fresh(minElapsedNanos, nowElapsedNanos, item.optLong("observedElapsedNanos"))) {
                continue
            }
            val address = item.optString("address").lowercase(Locale.ROOT)
            if (!validMac(address)) continue
            val name = item.optString("name")
            if (name.toByteArray(Charsets.UTF_8).size > 64) continue
            if (name.any { it.isISOControl() }) continue
            val rssi = item.optInt("rssi")
            if (rssi !in -127..-1) continue
            bluetoothObservations.add(SharedBluetooth(address, name, rssi))
        }
        val bluetoothFinal = bluetoothObservations.distinctBy { it.address }.take(20)

        val cellObservations = mutableListOf<SharedCell>()
        val cellsArray = JSONArray(cellsJson)
        for (index in 0 until cellsArray.length()) {
            val item = cellsArray.getJSONObject(index)
            if (!item.optBoolean("sharingIdentityKnown")) continue
            if (!fresh(minElapsedNanos, nowElapsedNanos, item.optLong("observedElapsedNanos"))) {
                continue
            }
            val type = item.optString("type")
            val mcc = if (type == "CDMA") 0 else item.optInt("mcc", -1)
            val mnc = if (type == "CDMA") item.optInt("systemId", -1) else item.optInt("mnc", -1)
            val area = item.optLong(areaKey(type), -1L)
            val cellId = item.optLong(cellKey(type), -1L)
            val maxArea = maxAreaId(type)
            val maxCell = maxCellId(type)
            val dbm = item.optInt("dbm")
            if (area !in 0..maxArea) continue
            if (cellId !in 0..maxCell) continue
            if (dbm !in -160..-1) continue
            if (type == "CDMA") {
                if (mnc in 0..32_767) {
                    cellObservations.add(SharedCell(type, mcc, mnc, area, cellId, dbm))
                }
            } else {
                if (mcc in 100..999 && mnc in 0..999) {
                    cellObservations.add(SharedCell(type, mcc, mnc, area, cellId, dbm))
                }
            }
        }
        val cellsFinal = cellObservations
            .distinctBy { listOf(it.radio, it.mcc, it.mnc, it.area, it.cell) }
            .take(20)

        if (wifiFinal.isEmpty() && bluetoothFinal.isEmpty() && cellsFinal.isEmpty()) return null
        val draft = RadioContributionDraft(
            batchId = UUID.randomUUID().toString(),
            lat = location.lat,
            lng = location.lng,
            accuracyMeters = location.accuracy.toDouble(),
            observedAt = location.time,
            wifi = wifiFinal,
            bluetooth = bluetoothFinal,
            cells = cellsFinal,
        )
        if (draft.body().toString().toByteArray(Charsets.UTF_8).size > 16_384) return null
        return draft
    }
}
