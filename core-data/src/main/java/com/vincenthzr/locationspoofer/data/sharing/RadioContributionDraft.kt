package com.vincenthzr.locationspoofer.data.sharing

import com.vincenthzr.locationspoofer.data.model.SharedWifiObservation
import org.json.JSONArray
import org.json.JSONObject

data class RadioContributionDraft(
    val batchId: String,
    val lat: Double,
    val lng: Double,
    val accuracyMeters: Double,
    val observedAt: Long,
    val wifi: List<SharedWifiObservation>,
    val bluetooth: List<SharedBluetooth>,
    val cells: List<SharedCell>,
) {
    fun body(): JSONObject {
        val wifiArray = JSONArray()
        for (observation in wifi) {
            wifiArray.put(
                JSONObject()
                    .put("bssid", observation.bssid)
                    .put("ssid", observation.ssid)
                    .put("frequency", observation.frequency)
                    .put("level", observation.level)
                    .put("capabilities", observation.capabilities),
            )
        }
        val bluetoothArray = JSONArray()
        for (observation in bluetooth) {
            bluetoothArray.put(
                JSONObject()
                    .put("address", observation.address)
                    .put("name", observation.name)
                    .put("rssi", observation.rssi),
            )
        }
        val cellsArray = JSONArray()
        for (observation in cells) {
            cellsArray.put(
                JSONObject()
                    .put("radio", observation.radio)
                    .put("mcc", observation.mcc)
                    .put("mnc", observation.mnc)
                    .put("area", observation.area)
                    .put("cell", observation.cell)
                    .put("signalDbm", observation.signalDbm),
            )
        }
        return JSONObject()
            .put("batchId", batchId)
            .put("consentVersion", "radio-sharing-v1")
            .put("coordinateSystem", "WGS84")
            .put("lat", lat)
            .put("lng", lng)
            .put("accuracyMeters", accuracyMeters)
            .put("observedAt", observedAt)
            .put("mockLocation", false)
            .put("wifi", wifiArray)
            .put("bluetooth", bluetoothArray)
            .put("cells", cellsArray)
    }
}
