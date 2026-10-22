package com.vincenthzr.locationspoofer.xposed.hooks.network

import com.vincenthzr.locationspoofer.xposed.LocationHooker
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers
import java.lang.reflect.Constructor
import java.util.Locale
import org.json.JSONArray
import org.json.JSONObject

/**
 * ServiceState / SignalStrength / CellIdentity 构造辅助。
 * 恢复自 v3.0.16 APK（build 303f46d）xposed/hooks/network/CellStateAndSignalBuilderKt.java
 * （constructCellIdentityByType 主方法为 jadx bad-code，见③档语义恢复留档）
 */
object CellStateAndSignalBuilderKt {

    /** 构造已注册的 ServiceState：按 PLMN 推导运营商名（移动/联通/电信）并填满全部字段 */
    fun buildFakeServiceState(hooker: LocationHooker, classLoader: ClassLoader, cellJson: JSONArray?): Any? {
        XposedBridge.logOpenCellIdEvery(
            "buildFakeServiceState:called:${cellJson?.length() ?: 0}",
            "buildFakeServiceState called cellJsonCount=${cellJson?.length() ?: 0}",
        )
        return try {
            val serviceState = XposedHelpers.newInstance(XposedHelpers.findClass("android.telephony.ServiceState", classLoader))
            val first = if (cellJson != null && cellJson.length() > 0) cellJson.optJSONObject(0) else null
            val numeric = if (first != null) {
                val mcc = CellInfoListBuilderKt.positiveJsonInt(hooker, first, arrayOf("mcc"), 460)
                val mnc = CellInfoListBuilderKt.positiveJsonInt(hooker, first, arrayOf("mnc", "net"), 0)
                String.format(Locale.US, "%d%02d", mcc, mnc)
            } else {
                "46000"
            }
            // MNC 尾位判运营商：1/9/6→联通，3/11/5→电信，其余→移动
            val operatorName = when (numeric.takeLast(2).toIntOrNull()) {
                1 -> "中国联通"
                3 -> "中国电信"
                9 -> "中国联通"
                11, 5 -> "中国电信"
                6 -> "中国联通"
                else -> "中国移动"
            }
            trySet { XposedHelpers.callMethod(serviceState, "setState", 0) }
            trySet { XposedHelpers.callMethod(serviceState, "setVoiceRegState", 0) }
            trySet { XposedHelpers.callMethod(serviceState, "setDataRegState", 0) }
            trySet { XposedHelpers.callMethod(serviceState, "setOperatorName", operatorName, operatorName, numeric) }
            trySet { XposedHelpers.setIntField(serviceState, "mVoiceRegState", 0) }
            trySet { XposedHelpers.setIntField(serviceState, "mDataRegState", 0) }
            trySet { XposedHelpers.setObjectField(serviceState, "mVoiceOperatorAlphaLong", operatorName) }
            trySet { XposedHelpers.setObjectField(serviceState, "mVoiceOperatorAlphaShort", operatorName) }
            trySet { XposedHelpers.setObjectField(serviceState, "mVoiceOperatorNumeric", numeric) }
            trySet { XposedHelpers.setObjectField(serviceState, "mDataOperatorAlphaLong", operatorName) }
            trySet { XposedHelpers.setObjectField(serviceState, "mDataOperatorAlphaShort", operatorName) }
            trySet { XposedHelpers.setObjectField(serviceState, "mDataOperatorNumeric", numeric) }
            XposedBridge.logOpenCellIdEvery(
                "buildFakeServiceState:success:$numeric:$operatorName",
                "buildFakeServiceState success operator=$numeric operatorName=$operatorName",
            )
            serviceState
        } catch (t: Throwable) {
            XposedBridge.logOpenCellId("buildFakeServiceState failed", t)
            null
        }
    }

    /** 构造 SignalStrength：LTE 主承载，rsrp 取环境点 dbm */
    fun buildFakeSignalStrength(hooker: LocationHooker, classLoader: ClassLoader, json: JSONObject?): Any? {
        val cellJsonCount = json?.optJSONArray("cell_json")?.length() ?: 0
        XposedBridge.logOpenCellIdEvery(
            "buildFakeSignalStrength:called:$cellJsonCount",
            "buildFakeSignalStrength called cellJsonCount=$cellJsonCount",
        )
        return try {
            val signalStrength = XposedHelpers.newInstance(XposedHelpers.findClass("android.telephony.SignalStrength", classLoader))
            var cell = CellInfoListBuilderKt.firstCell(hooker, json) ?: JSONObject()
            val dbm = CellInfoListBuilderKt.signalDbm(hooker, cell, 0)
            val lte = XposedHelpers.newInstance(XposedHelpers.findClass("android.telephony.CellSignalStrengthLte", classLoader))
            trySet { XposedHelpers.setIntField(lte, "mRsrp", dbm) }
            trySet { XposedHelpers.setIntField(lte, "mRsrq", -10) }
            trySet { XposedHelpers.setIntField(lte, "mRssnr", 300) }
            trySet { XposedHelpers.setIntField(lte, "mSignalStrength", dbm + 113) }
            trySet { XposedHelpers.setObjectField(signalStrength, "mLte", lte) }
            trySet { XposedHelpers.setObjectField(signalStrength, "mCellSignalStrengths", listOf(lte)) }
            trySet { XposedHelpers.setBooleanField(signalStrength, "mLteAsPrimaryInNrNsa", true) }
            XposedBridge.logOpenCellIdEvery(
                "buildFakeSignalStrength:success:$dbm",
                "buildFakeSignalStrength success dbm=$dbm",
            )
            signalStrength
        } catch (t: Throwable) {
            XposedBridge.logOpenCellId("buildFakeSignalStrength failed", t)
            null
        }
    }

    /** 空值兜底：mAdditionalPlmns/mAlphaLong/mAlphaShort 缺省时补默认值（全部吞异常） */
    private fun sanitizeCellIdentity(emptySet: Any, identity: Any) {
        try {
            try {
                if (XposedHelpers.getObjectField(identity, "mAdditionalPlmns") == null) {
                    XposedHelpers.setObjectField(identity, "mAdditionalPlmns", emptySet)
                }
            } catch (_: Throwable) {
                XposedHelpers.setObjectField(identity, "mAdditionalPlmns", emptySet)
            }
        } catch (_: Throwable) {
        }
        trySet {
            if (XposedHelpers.getObjectField(identity, "mAlphaLong") == null) {
                XposedHelpers.setObjectField(identity, "mAlphaLong", "")
            }
        }
        trySet {
            if (XposedHelpers.getObjectField(identity, "mAlphaShort") == null) {
                XposedHelpers.setObjectField(identity, "mAlphaShort", "")
            }
        }
    }

    /** 在候选构造器中找参数个数匹配的一个并实例化；失败返回 null */
    private fun tryNewInstance(constructors: Array<Constructor<*>>, vararg args: Any?): Any? {
        val constructor = constructors.firstOrNull { it.parameterCount == args.size } ?: return null
        return try {
            constructor.newInstance(*args)
        } catch (_: Throwable) {
            null
        }
    }

    private inline fun trySet(block: () -> Unit) {
        try {
            block()
        } catch (_: Throwable) {
        }
    }
}
