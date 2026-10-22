package com.vincenthzr.locationspoofer.xposed.hooks.network;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.l13;
import defpackage.p91;
import defpackage.s13;
import defpackage.wg2;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CellStateAndSignalBuilderKt {
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    public static final Object buildFakeServiceState(LocationHooker locationHooker, ClassLoader classLoader, JSONArray jSONArray) {
        String str;
        String str2;
        locationHooker.getClass();
        classLoader.getClass();
        XposedBridge.logOpenCellIdEvery$default(XposedBridge.INSTANCE, p91.l(jSONArray != null ? jSONArray.length() : 0, "buildFakeServiceState:called:"), p91.l(jSONArray != null ? jSONArray.length() : 0, "buildFakeServiceState called cellJsonCount="), 0L, 4, null);
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Object objNewInstance = xposedHelpers.newInstance(xposedHelpers.findClass("android.telephony.ServiceState", classLoader), new Object[0]);
            JSONObject jSONObjectOptJSONObject = (jSONArray == null || jSONArray.length() <= 0) ? null : jSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject != null) {
                str = String.format(Locale.US, "%d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(CellInfoListBuilderKt.positiveJsonInt(locationHooker, jSONObjectOptJSONObject, new String[]{"mcc"}, 460)), Integer.valueOf(CellInfoListBuilderKt.positiveJsonInt(locationHooker, jSONObjectOptJSONObject, new String[]{"mnc", "net"}, 0))}, 2));
            } else {
                str = "46000";
            }
            Integer numA0 = s13.a0(l13.C0(2, str));
            int iIntValue = numA0 != null ? numA0.intValue() : 0;
            if (iIntValue == 1) {
                str2 = "中国联通";
            } else if (iIntValue == 3) {
                str2 = "中国电信";
            } else if (iIntValue == 9) {
                str2 = "中国联通";
            } else if (iIntValue == 11 || iIntValue == 5) {
                str2 = "中国电信";
            } else if (iIntValue != 6) {
                str2 = "中国移动";
            } else {
                str2 = "中国联通";
            }
            try {
                xposedHelpers.callMethod(objNewInstance, "setState", 0);
            } catch (Throwable unused) {
            }
            try {
                XposedHelpers.INSTANCE.callMethod(objNewInstance, "setVoiceRegState", 0);
            } catch (Throwable unused2) {
            }
            try {
                XposedHelpers.INSTANCE.callMethod(objNewInstance, "setDataRegState", 0);
            } catch (Throwable unused3) {
            }
            try {
                XposedHelpers.INSTANCE.callMethod(objNewInstance, "setOperatorName", str2, str2, str);
            } catch (Throwable unused4) {
            }
            try {
                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mVoiceRegState", 0);
            } catch (Throwable unused5) {
            }
            try {
                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mDataRegState", 0);
            } catch (Throwable unused6) {
            }
            try {
                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mVoiceOperatorAlphaLong", str2);
            } catch (Throwable unused7) {
            }
            try {
                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mVoiceOperatorAlphaShort", str2);
            } catch (Throwable unused8) {
            }
            try {
                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mVoiceOperatorNumeric", str);
            } catch (Throwable unused9) {
            }
            try {
                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mDataOperatorAlphaLong", str2);
            } catch (Throwable unused10) {
            }
            try {
                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mDataOperatorAlphaShort", str2);
            } catch (Throwable unused11) {
            }
            try {
                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mDataOperatorNumeric", str);
            } catch (Throwable unused12) {
            }
            XposedBridge.logOpenCellIdEvery$default(XposedBridge.INSTANCE, "buildFakeServiceState:success:" + str + ":" + str2, "buildFakeServiceState success operator=" + str + " operatorName=" + str2, 0L, 4, null);
            return objNewInstance;
        } catch (Throwable th) {
            XposedBridge.INSTANCE.logOpenCellId("buildFakeServiceState failed", th);
            return null;
        }
    }

    public static final Object buildFakeSignalStrength(LocationHooker locationHooker, ClassLoader classLoader, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        locationHooker.getClass();
        classLoader.getClass();
        int length = (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("cell_json")) == null) ? 0 : jSONArrayOptJSONArray.length();
        XposedBridge.logOpenCellIdEvery$default(XposedBridge.INSTANCE, p91.l(length, "buildFakeSignalStrength:called:"), p91.l(length, "buildFakeSignalStrength called cellJsonCount="), 0L, 4, null);
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Object objNewInstance = xposedHelpers.newInstance(xposedHelpers.findClass("android.telephony.SignalStrength", classLoader), new Object[0]);
            JSONObject jSONObjectFirstCell = CellInfoListBuilderKt.firstCell(locationHooker, jSONObject);
            if (jSONObjectFirstCell == null) {
                jSONObjectFirstCell = new JSONObject();
            }
            int iSignalDbm = CellInfoListBuilderKt.signalDbm(locationHooker, jSONObjectFirstCell, 0);
            Object objNewInstance2 = xposedHelpers.newInstance(xposedHelpers.findClass("android.telephony.CellSignalStrengthLte", classLoader), new Object[0]);
            try {
                xposedHelpers.setIntField(objNewInstance2, "mRsrp", iSignalDbm);
            } catch (Throwable unused) {
            }
            try {
                XposedHelpers.INSTANCE.setIntField(objNewInstance2, "mRsrq", -10);
            } catch (Throwable unused2) {
            }
            try {
                XposedHelpers.INSTANCE.setIntField(objNewInstance2, "mRssnr", 300);
            } catch (Throwable unused3) {
            }
            try {
                XposedHelpers.INSTANCE.setIntField(objNewInstance2, "mSignalStrength", iSignalDbm + 113);
            } catch (Throwable unused4) {
            }
            try {
                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mLte", objNewInstance2);
            } catch (Throwable unused5) {
            }
            try {
                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mCellSignalStrengths", am1.F(objNewInstance2));
            } catch (Throwable unused6) {
            }
            try {
                XposedHelpers.INSTANCE.setBooleanField(objNewInstance, "mLteAsPrimaryInNrNsa", true);
            } catch (Throwable unused7) {
            }
            XposedBridge.logOpenCellIdEvery$default(XposedBridge.INSTANCE, "buildFakeSignalStrength:success:" + iSignalDbm, "buildFakeSignalStrength success dbm=" + iSignalDbm, 0L, 4, null);
            return objNewInstance;
        } catch (Throwable th) {
            XposedBridge.INSTANCE.logOpenCellId("buildFakeSignalStrength failed", th);
            return null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 22341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final java.lang.Object constructCellIdentityByType(com.vincenthzr.locationspoofer.xposed.LocationHooker r43, java.lang.String r44, java.lang.Class<?> r45, int r46, java.lang.String r47, int r48, java.lang.String r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 2234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.xposed.hooks.network.CellStateAndSignalBuilderKt.constructCellIdentityByType(com.vincenthzr.locationspoofer.xposed.LocationHooker, java.lang.String, java.lang.Class, int, java.lang.String, int, java.lang.String, int, int, int):java.lang.Object");
    }

    private static final void constructCellIdentityByType$sanitizeCellIdentity(Object obj, Object obj2) {
        try {
            try {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                if (xposedHelpers.getObjectField(obj2, "mAdditionalPlmns") == null) {
                    xposedHelpers.setObjectField(obj2, "mAdditionalPlmns", obj);
                }
            } catch (Throwable unused) {
                XposedHelpers.INSTANCE.setObjectField(obj2, "mAdditionalPlmns", obj);
            }
        } catch (Throwable unused2) {
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            if (xposedHelpers2.getObjectField(obj2, "mAlphaLong") == null) {
                xposedHelpers2.setObjectField(obj2, "mAlphaLong", "");
            }
        } catch (Throwable unused3) {
        }
        try {
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            if (xposedHelpers3.getObjectField(obj2, "mAlphaShort") == null) {
                xposedHelpers3.setObjectField(obj2, "mAlphaShort", "");
            }
        } catch (Throwable unused4) {
        }
    }

    private static final Object constructCellIdentityByType$tryNewInstance(Constructor<?>[] constructorArr, Object... objArr) {
        Constructor<?> constructor;
        Object wg2Var;
        int length = constructorArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                constructor = null;
                break;
            }
            constructor = constructorArr[i];
            if (constructor.getParameterCount() == objArr.length) {
                break;
            }
            i++;
        }
        if (constructor == null) {
            return null;
        }
        try {
            wg2Var = constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            return null;
        }
        return wg2Var;
    }
}
