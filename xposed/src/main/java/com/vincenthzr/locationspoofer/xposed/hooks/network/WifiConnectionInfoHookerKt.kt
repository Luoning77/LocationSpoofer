package com.vincenthzr.locationspoofer.xposed.hooks.network

import com.vincenthzr.locationspoofer.xposed.LocationHooker
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers
import org.json.JSONObject

/**
 * WifiInfo 连接信息伪造：SSID/BSSID/MAC/RSSI/频率/链路速率/IP/网络 ID + SupplicantState。
 *
 * @param createWhenAbsent 拿不到系统 WifiInfo 实例时是否新建/构造（system_server 内 false）
 */
fun LocationHooker.hookWifiConnectionInfo(classLoader: ClassLoader, createWhenAbsent: Boolean = false) {
    val hooker = this

    // 1) WifiInfo 的逐 getter 伪造（无参方法）
    try {
        val wifiInfoClass = XposedHelpers.findClass("android.net.wifi.WifiInfo", classLoader)
        for (name in listOf(
            "getBSSID", "getMacAddress", "getSSID", "getNetworkId",
            "getRssi", "getLinkSpeed", "getFrequency", "getIpAddress",
        )) {
            val method = XposedHelpers.findMethodExact(wifiInfoClass, name)
            XposedHelpers.module.hook(method).intercept { chain ->
                val config = hooker.readConfig() ?: return@intercept chain.proceed(chain.args.toTypedArray())
                if (!config.optBoolean("active", false)) {
                    return@intercept chain.proceed(chain.args.toTypedArray())
                }
                val wifiJson = if (config.optBoolean("mock_wifi", true)) config.optJSONObject("wifi_json") else null
                val connected = wifiJson?.optBoolean("isConnected", false) == true
                val connectedWifi: JSONObject? = if (connected) wifiJson?.optJSONObject("connectedWifi") else null
                when (name) {
                    "getLinkSpeed" -> return@intercept connectedWifi?.optInt("linkSpeed", -1) ?: -1
                    "getFrequency" -> return@intercept connectedWifi?.optInt("frequency", -1) ?: -1
                    "getSSID" -> {
                        val ssid = connectedWifi?.optString("ssid", "") ?: ""
                        return@intercept if (ssid.isNotEmpty() && ssid != "<unknown ssid>") "\"$ssid\"" else "<unknown ssid>"
                    }
                    "getRssi" -> return@intercept connectedWifi?.optInt("level", -127) ?: -127
                    "getIpAddress" -> return@intercept if (connected) 1677830336 else 0
                    "getMacAddress" -> return@intercept connectedWifi?.optString("macAddress", "02:00:00:00:00:00")
                        ?: "02:00:00:00:00:00"
                    "getBSSID" -> return@intercept connectedWifi?.optString("bssid", "02:00:00:00:00:00")
                        ?: "02:00:00:00:00:00"
                    "getNetworkId" -> return@intercept connectedWifi?.optInt("networkId", -1) ?: -1
                }
                chain.proceed(chain.args.toTypedArray())
            }
        }
    } catch (t: Throwable) {
        XposedBridge.log(t)
    }

    // 2) SupplicantState：连接→COMPLETED，否则 DISCONNECTED
    try {
        val wifiInfoClass = XposedHelpers.findClass("android.net.wifi.WifiInfo", classLoader)
        val method = XposedHelpers.findMethodExact(wifiInfoClass, "getSupplicantState")
        XposedHelpers.module.hook(method).intercept { chain ->
            val config = hooker.readConfig() ?: return@intercept chain.proceed(chain.args.toTypedArray())
            if (!config.optBoolean("active", false)) {
                return@intercept chain.proceed(chain.args.toTypedArray())
            }
            val mockWifi = config.optBoolean("mock_wifi", true)
            val wifiJson = if (mockWifi) config.optJSONObject("wifi_json") else null
            try {
                val stateName = if (mockWifi && wifiJson?.optBoolean("isConnected", false) == true) {
                    "COMPLETED"
                } else {
                    "DISCONNECTED"
                }
                XposedHelpers.findClass("android.net.wifi.SupplicantState", classLoader)
                    .getField(stateName).get(null)
            } catch (_: Throwable) {
                chain.proceed(chain.args.toTypedArray())
            }
        }
    } catch (_: Throwable) {
    }

    // 3) WifiManager.getConnectionInfo：在真实返回值上改字段；必要时新建/构造 WifiInfo
    try {
        val wifiManagerClass = XposedHelpers.findClass("android.net.wifi.WifiManager", classLoader)
        val method = XposedHelpers.findMethodExact(wifiManagerClass, "getConnectionInfo")
        XposedHelpers.module.hook(method).intercept { chain ->
            val hooker2 = this@hookWifiConnectionInfo
            val config = hooker2.readConfig() ?: return@intercept chain.proceed(chain.args.toTypedArray())
            if (!config.optBoolean("active", false)) {
                return@intercept chain.proceed(chain.args.toTypedArray())
            }
            val wifiJson = if (config.optBoolean("mock_wifi", true)) config.optJSONObject("wifi_json") else null
            val connected = wifiJson?.optBoolean("isConnected", false) == true
            val connectedWifi: JSONObject? = if (connected) wifiJson?.optJSONObject("connectedWifi") else null
            val original = chain.proceed(chain.args.toTypedArray())
            try {
                if (!connected || connectedWifi == null) {
                    // 未连接：抹掉真实连接信息
                    if (original != null) {
                        setAbsentInfoFields(original)
                    } else if (createWhenAbsent) {
                        val fresh = XposedHelpers.newInstance(XposedHelpers.findClass("android.net.wifi.WifiInfo", classLoader))
                        setAbsentInfoFields(fresh)
                        return@intercept fresh
                    }
                    return@intercept original
                }

                // 已连接：读取 connectedWifi 配置
                var ssid = connectedWifi.optString("ssid", "")
                if (ssid.isEmpty() || ssid == "<unknown ssid>") ssid = "HOME_WIFI"
                val bssid = connectedWifi.optString("bssid", "02:00:00:00:00:00")
                val frequency = connectedWifi.optInt("frequency", 2412)
                val macAddress = connectedWifi.optString("macAddress", bssid)
                val linkSpeed = connectedWifi.optInt("linkSpeed", 65)
                val wifiStandard = connectedWifi.optInt("wifiStandard", 6)
                val level = connectedWifi.optInt("level", -65)
                val networkId = connectedWifi.optInt("networkId", 1)

                if (original != null) {
                    trySet { XposedHelpers.setObjectField(original, "mSSID", "\"$ssid\"") }
                    trySet {
                        val wifiSsidClass = XposedHelpers.findClassIfExists("android.net.wifi.WifiSsid", classLoader)
                        if (wifiSsidClass != null) {
                            val fromAscii = XposedHelpers.findMethodExact(wifiSsidClass, "createFromAsciiEncoded", String::class.java)
                            XposedHelpers.setObjectField(original, "mWifiSsid", fromAscii.invoke(null, ssid))
                        }
                    }
                    trySet { XposedHelpers.setObjectField(original, "mBSSID", bssid) }
                    trySet { XposedHelpers.setObjectField(original, "mMacAddress", macAddress) }
                    trySet { XposedHelpers.setIntField(original, "mRssi", level) }
                    trySet { XposedHelpers.setIntField(original, "mFrequency", frequency) }
                    trySet { XposedHelpers.setIntField(original, "mLinkSpeed", linkSpeed) }
                    trySet { XposedHelpers.setIntField(original, "mNetworkId", networkId) }
                    trySet { XposedHelpers.setIntField(original, "mWifiStandard", wifiStandard) }
                    return@intercept original
                }

                if (!createWhenAbsent) return@intercept original

                // 无实例：优先 WifiInfo.Builder，失败则反射新建 WifiInfo 再填字段
                var built: Any? = null
                try {
                    val builder = XposedHelpers.newInstance(XposedHelpers.findClass("android.net.wifi.WifiInfo\$Builder", classLoader))
                    XposedHelpers.callMethod(builder, "setSsid", ssid)
                    XposedHelpers.callMethod(builder, "setBssid", bssid)
                    XposedHelpers.callMethod(builder, "setRssi", level)
                    XposedHelpers.callMethod(builder, "setFrequency", frequency)
                    XposedHelpers.callMethod(builder, "setLinkSpeed", linkSpeed)
                    built = XposedHelpers.callMethod(builder, "build")
                } catch (_: Throwable) {
                    built = null
                }
                if (built != null) return@intercept built

                val fresh = XposedHelpers.newInstance(XposedHelpers.findClass("android.net.wifi.WifiInfo", classLoader))
                trySet { XposedHelpers.setObjectField(fresh, "mSSID", "\"$ssid\"") }
                trySet { XposedHelpers.setObjectField(fresh, "mBSSID", bssid) }
                trySet { XposedHelpers.setObjectField(fresh, "mMacAddress", macAddress) }
                trySet { XposedHelpers.setIntField(fresh, "mRssi", level) }
                trySet { XposedHelpers.setIntField(fresh, "mFrequency", frequency) }
                trySet { XposedHelpers.setIntField(fresh, "mLinkSpeed", linkSpeed) }
                trySet { XposedHelpers.setIntField(fresh, "mNetworkId", networkId) }
                fresh
            } catch (_: Throwable) {
                original
            }
        }
    } catch (t: Throwable) {
        XposedBridge.log(t)
    }
}

/** 未连接时逐字段抹掉真实连接信息（全部吞异常） */
private fun setAbsentInfoFields(info: Any) {
    trySet { XposedHelpers.setObjectField(info, "mBSSID", "02:00:00:00:00:00") }
    trySet { XposedHelpers.setObjectField(info, "mMacAddress", "02:00:00:00:00:00") }
    trySet { XposedHelpers.setIntField(info, "mNetworkId", -1) }
    trySet { XposedHelpers.setIntField(info, "mRssi", -127) }
    trySet { XposedHelpers.setIntField(info, "mLinkSpeed", -1) }
    trySet { XposedHelpers.setIntField(info, "mFrequency", -1) }
}

private inline fun trySet(block: () -> Unit) {
    try {
        block()
    } catch (_: Throwable) {
    }
}
