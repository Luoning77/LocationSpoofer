package com.vincenthzr.locationspoofer.xposed.hooks.network

import com.vincenthzr.locationspoofer.xposed.LocationHooker
import java.util.Locale
import org.json.JSONArray
import org.json.JSONObject
import kotlin.math.min

/**
 * 基站信息列表构造辅助：从环境点 JSON 读取小区参数并做回退计算。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/network/CellInfoListBuilderKt.java
 * （buildFakeCellInfoList 主方法为 jadx bad-code，见③档语义恢复留档）
 */
object CellInfoListBuilderKt {

    /** 小区区域码：tac → lac → area，首个正数生效 */
    fun cellAreaCode(hooker: LocationHooker, json: JSONObject, fallback: Int): Int =
        positiveJsonInt(hooker, json, arrayOf("tac", "lac", "area"), fallback)

    /** 小区识别码：ci → cid → cellid → cell，首个正数生效 */
    fun cellIdentityCode(hooker: LocationHooker, json: JSONObject, fallback: Int): Int =
        positiveJsonInt(hooker, json, arrayOf("ci", "cid", "cellid", "cell"), fallback)

    /** 无配置时按经纬度稳定散列回退区域码（10000..59999） */
    fun fallbackAreaCode(hooker: LocationHooker, lat: Double, lng: Double): Int {
        val mixed = ((lat * 100000.0).toLong() xor (lng * 100000.0).toLong()) and 65535L
        val value = (mixed.toInt() % 50000) + 10000
        return value.coerceIn(1, 65534)
    }

    /** 无配置时按经纬度稳定散列回退小区识别码（100000..999999） */
    fun fallbackCellIdentity(hooker: LocationHooker, lat: Double, lng: Double): Int {
        val mixed = (((lat * 100000.0).toLong() xor (lng * 100000.0).toLong()) shr 8) and 16777215L
        val value = (mixed.toInt() % 900000) + 100000
        return value.coerceIn(1, 268435455)
    }

    /** 环境点 cell_json 数组的第一项，缺失或空时 null */
    fun firstCell(hooker: LocationHooker, json: JSONObject?): JSONObject? {
        val cells = json?.optJSONArray("cell_json") ?: return null
        if (cells.length() <= 0) return null
        return cells.optJSONObject(0)
    }

    /** 判断对象是否为 TelephonyCallback 的指定监听子类型（按类名匹配） */
    fun isTelephonyCallbackListener(
        hooker: LocationHooker,
        classLoader: ClassLoader,
        listener: Any,
        simpleName: String,
    ): Boolean = LocationHooker.hasTypeByName(listener.javaClass, "android.telephony.TelephonyCallback\$$simpleName")

    /** 归一化网络制式名：5G/NR/NR5G→NR、UMTS→WCDMA、GSM→GSM、其余→LTE */
    fun normalizeCellType(hooker: LocationHooker, type: String): String {
        val upper = type.uppercase(Locale.US)
        return when (upper) {
            "5G", "NR", "NR5G" -> "NR"
            "GSM" -> "GSM"
            "UMTS", "WCDMA" -> "WCDMA"
            else -> "LTE"
        }
    }

    /** 依次尝试 JSON 键，取第一个正数（int 或字符串解析），否则返回 fallback */
    fun positiveJsonInt(hooker: LocationHooker, json: JSONObject, keys: Array<String>, fallback: Int): Int {
        for (key in keys) {
            if (json.has(key) && !json.isNull(key)) {
                val value = json.optInt(key, Int.MIN_VALUE)
                if (value > 0) return value
                val parsed = json.optString(key).toIntOrNull()
                if (parsed != null && parsed > 0) return parsed
            }
        }
        return fallback
    }

    /** 信号强度：dbm → averageSignalStrength → signal 依次取 [-140,-39)，否则按 index 衰减（下限 -110） */
    fun signalDbm(hooker: LocationHooker, json: JSONObject, index: Int): Int {
        val dbm = json.optInt("dbm", Int.MIN_VALUE)
        if (dbm in -140..-40) return dbm
        val average = json.optInt("averageSignalStrength", Int.MIN_VALUE)
        if (average in -140..-40) return average
        val signal = json.optInt("signal", Int.MIN_VALUE)
        if (signal in -140..-40) return signal
        return (-70 - index * 3).coerceAtLeast(-110)
    }
}
