package com.vincenthzr.locationspoofer.xposed.hooks.network;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.az2;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class WifiConnectionInfoHookerKt {
    public static final void hookWifiConnectionInfo(final LocationHooker locationHooker, final ClassLoader classLoader, final boolean z) {
        locationHooker.getClass();
        classLoader.getClass();
        try {
            for (String str : am1.G("getBSSID", "getMacAddress", "getSSID", "getNetworkId", "getRssi", "getLinkSpeed", "getFrequency", "getIpAddress")) {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                Class<?> clsFindClass = xposedHelpers.findClass("android.net.wifi.WifiInfo", classLoader);
                Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact = xposedHelpers.findMethodExact(clsFindClass, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                xposedHelpers.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiConnectionInfoHookerKt$hookWifiConnectionInfo$$inlined$hookMethod$1
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    public Object intercept(XposedInterface.Chain chain) {
                        String strOptString;
                        String strOptString2;
                        String strOptString3;
                        chain.getClass();
                        Method method = methodFindMethodExact;
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease == null) {
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                        if (!config$xposed_globalRelease.optBoolean("active", false)) {
                            List args2 = chain.getArgs();
                            args2.getClass();
                            return chain.proceed(args2.toArray(new Object[0]));
                        }
                        JSONObject jSONObjectOptJSONObject = null;
                        JSONObject jSONObjectOptJSONObject2 = config$xposed_globalRelease.optBoolean("mock_wifi", true) ? config$xposed_globalRelease.optJSONObject("wifi_json") : null;
                        boolean zOptBoolean = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("isConnected", false) : false;
                        if (zOptBoolean) {
                            jSONObjectOptJSONObject2.getClass();
                            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("connectedWifi");
                        }
                        String name = method.getName();
                        if (name != null) {
                            switch (name.hashCode()) {
                                case -1645101641:
                                    if (name.equals("getLinkSpeed")) {
                                        if (jSONObjectOptJSONObject != null) {
                                            return Integer.valueOf(jSONObjectOptJSONObject.optInt("linkSpeed", -1));
                                        }
                                        return -1;
                                    }
                                    break;
                                case -79628634:
                                    if (name.equals("getFrequency")) {
                                        if (jSONObjectOptJSONObject != null) {
                                            return Integer.valueOf(jSONObjectOptJSONObject.optInt("frequency", -1));
                                        }
                                        return -1;
                                    }
                                    break;
                                case -75173935:
                                    if (name.equals("getSSID")) {
                                        String str2 = "";
                                        if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("ssid", "")) == null) {
                                            strOptString = "";
                                        }
                                        if (strOptString.length() != 0 && !strOptString.equals("<unknown ssid>")) {
                                            str2 = strOptString;
                                        }
                                        return str2.length() == 0 ? "<unknown ssid>" : az2.k("\"", str2, "\"");
                                    }
                                    break;
                                case -75171635:
                                    if (name.equals("getRssi")) {
                                        if (jSONObjectOptJSONObject != null) {
                                            return Integer.valueOf(jSONObjectOptJSONObject.optInt("level", -127));
                                        }
                                        return -127;
                                    }
                                    break;
                                case 1624428055:
                                    if (name.equals("getIpAddress")) {
                                        return Integer.valueOf(zOptBoolean ? 1677830336 : 0);
                                    }
                                    break;
                                case 1784184731:
                                    if (name.equals("getMacAddress")) {
                                        return (jSONObjectOptJSONObject == null || (strOptString2 = jSONObjectOptJSONObject.optString("macAddress")) == null) ? "02:00:00:00:00:00" : strOptString2;
                                    }
                                    break;
                                case 1948885287:
                                    if (name.equals("getBSSID")) {
                                        return (jSONObjectOptJSONObject == null || (strOptString3 = jSONObjectOptJSONObject.optString("bssid")) == null) ? "02:00:00:00:00:00" : strOptString3;
                                    }
                                    break;
                                case 2053177651:
                                    if (name.equals("getNetworkId")) {
                                        if (jSONObjectOptJSONObject != null) {
                                            return Integer.valueOf(jSONObjectOptJSONObject.optInt("networkId", -1));
                                        }
                                        return -1;
                                    }
                                    break;
                            }
                        }
                        List args3 = chain.getArgs();
                        args3.getClass();
                        return chain.proceed(args3.toArray(new Object[0]));
                    }
                }).getClass();
            }
        } catch (Throwable th) {
            XposedBridge.INSTANCE.log(th);
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Class<?> clsFindClass2 = xposedHelpers2.findClass("android.net.wifi.WifiInfo", classLoader);
            Class[] clsArr2 = (Class[]) new ArrayList(0).toArray(new Class[0]);
            final Method methodFindMethodExact2 = xposedHelpers2.findMethodExact(clsFindClass2, "getSupplicantState", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
            xposedHelpers2.getModule().hook(methodFindMethodExact2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiConnectionInfoHookerKt$hookWifiConnectionInfo$$inlined$hookMethod$2
                public Object intercept(XposedInterface.Chain chain) {
                    chain.getClass();
                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                    if (config$xposed_globalRelease == null) {
                        List args = chain.getArgs();
                        args.getClass();
                        return chain.proceed(args.toArray(new Object[0]));
                    }
                    if (!config$xposed_globalRelease.optBoolean("active", false)) {
                        List args2 = chain.getArgs();
                        args2.getClass();
                        return chain.proceed(args2.toArray(new Object[0]));
                    }
                    boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_wifi", true);
                    JSONObject jSONObjectOptJSONObject = zOptBoolean ? config$xposed_globalRelease.optJSONObject("wifi_json") : null;
                    try {
                        return XposedHelpers.INSTANCE.findClass("android.net.wifi.SupplicantState", classLoader).getField((zOptBoolean && (jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("isConnected", false) : false)) ? "COMPLETED" : "DISCONNECTED").get(null);
                    } catch (Throwable unused) {
                        List args3 = chain.getArgs();
                        args3.getClass();
                        return chain.proceed(args3.toArray(new Object[0]));
                    }
                }
            }).getClass();
        } catch (Throwable unused) {
        }
        try {
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass3 = xposedHelpers3.findClass("android.net.wifi.WifiManager", classLoader);
                Class[] clsArr3 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact3 = xposedHelpers3.findMethodExact(clsFindClass3, "getConnectionInfo", (Class[]) Arrays.copyOf(clsArr3, clsArr3.length));
                xposedHelpers3.getModule().hook(methodFindMethodExact3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiConnectionInfoHookerKt$hookWifiConnectionInfo$$inlined$hookMethod$3
                    /* JADX WARN: Code duplicated, block: B:71:0x01db A[Catch: all -> 0x0164, TRY_ENTER, TryCatch #1 {all -> 0x0164, blocks: (B:51:0x0160, B:71:0x01db, B:72:0x01e0), top: B:139:0x0160 }] */
                    /* JADX WARN: Code duplicated, block: B:72:0x01e0 A[Catch: all -> 0x0164, TRY_LEAVE, TryCatch #1 {all -> 0x0164, blocks: (B:51:0x0160, B:71:0x01db, B:72:0x01e0), top: B:139:0x0160 }] */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [com.vincenthzr.locationspoofer.xposed.hooks.network.WifiConnectionInfoHookerKt$hookWifiConnectionInfo$$inlined$hookMethod$3] */
                    /* JADX WARN: Type inference failed for: r0v1 */
                    /* JADX WARN: Type inference failed for: r0v12 */
                    /* JADX WARN: Type inference failed for: r0v2 */
                    /* JADX WARN: Type inference failed for: r0v33 */
                    /* JADX WARN: Type inference failed for: r0v34 */
                    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    public Object intercept(XposedInterface.Chain chain) {
                        JSONObject jSONObjectOptJSONObject;
                        Object obj;
                        Object obj2;
                        int i;
                        int i2;
                        String str2;
                        Object objCallMethod;
                        boolean z2;
                        int i3;
                        ?? r0 = this;
                        chain.getClass();
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease == null) {
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                        if (!config$xposed_globalRelease.optBoolean("active", false)) {
                            List args2 = chain.getArgs();
                            args2.getClass();
                            return chain.proceed(args2.toArray(new Object[0]));
                        }
                        JSONObject jSONObjectOptJSONObject2 = config$xposed_globalRelease.optBoolean("mock_wifi", true) ? config$xposed_globalRelease.optJSONObject("wifi_json") : null;
                        boolean zOptBoolean = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("isConnected", false) : false;
                        if (zOptBoolean) {
                            jSONObjectOptJSONObject2.getClass();
                            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("connectedWifi");
                        } else {
                            jSONObjectOptJSONObject = null;
                        }
                        List args3 = chain.getArgs();
                        args3.getClass();
                        Object objProceed = chain.proceed(args3.toArray(new Object[0]));
                        try {
                            if (!zOptBoolean || jSONObjectOptJSONObject == null) {
                                try {
                                    if (objProceed != null) {
                                        try {
                                            obj = objProceed;
                                            try {
                                                XposedHelpers.INSTANCE.setObjectField(obj, "mBSSID", "02:00:00:00:00:00");
                                            } catch (Throwable unused2) {
                                            }
                                        } catch (Throwable unused3) {
                                            obj = objProceed;
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setObjectField(obj, "mMacAddress", "02:00:00:00:00:00");
                                        } catch (Throwable unused4) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setIntField(obj, "mNetworkId", -1);
                                        } catch (Throwable unused5) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setIntField(obj, "mRssi", -127);
                                        } catch (Throwable unused6) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setIntField(obj, "mLinkSpeed", -1);
                                        } catch (Throwable unused7) {
                                        }
                                        XposedHelpers.INSTANCE.setIntField(obj, "mFrequency", -1);
                                    } else {
                                        obj = objProceed;
                                        if (!z) {
                                            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                                            Object objNewInstance = xposedHelpers4.newInstance(xposedHelpers4.findClass("android.net.wifi.WifiInfo", classLoader), new Object[0]);
                                            try {
                                                xposedHelpers4.setObjectField(objNewInstance, "mBSSID", "02:00:00:00:00:00");
                                            } catch (Throwable unused8) {
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mMacAddress", "02:00:00:00:00:00");
                                            } catch (Throwable unused9) {
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mNetworkId", -1);
                                            } catch (Throwable unused10) {
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mRssi", -127);
                                            } catch (Throwable unused11) {
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mLinkSpeed", -1);
                                            } catch (Throwable unused12) {
                                            }
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance, "mFrequency", -1);
                                            r0 = objNewInstance;
                                        }
                                    }
                                } catch (Throwable unused13) {
                                }
                                return obj;
                            }
                            try {
                                String strOptString = jSONObjectOptJSONObject.optString("ssid", "");
                                strOptString.getClass();
                                if (strOptString.length() == 0 || strOptString.equals("<unknown ssid>")) {
                                    strOptString = "HOME_WIFI";
                                }
                                String strOptString2 = jSONObjectOptJSONObject.optString("bssid", "02:00:00:00:00:00");
                                int iOptInt = jSONObjectOptJSONObject.optInt("frequency", 2412);
                                String strOptString3 = jSONObjectOptJSONObject.optString("macAddress", strOptString2);
                                int iOptInt2 = jSONObjectOptJSONObject.optInt("linkSpeed", 65);
                                int iOptInt3 = jSONObjectOptJSONObject.optInt("wifiStandard", 6);
                                int iOptInt4 = jSONObjectOptJSONObject.optInt("level", -65);
                                int iOptInt5 = jSONObjectOptJSONObject.optInt("networkId", 1);
                                if (objProceed != null) {
                                    try {
                                        i3 = iOptInt2;
                                        try {
                                            XposedHelpers.INSTANCE.setObjectField(objProceed, "mSSID", "\"" + strOptString + "\"");
                                        } catch (Throwable unused14) {
                                        }
                                    } catch (Throwable unused15) {
                                        i3 = iOptInt2;
                                    }
                                    try {
                                        XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                                        Class<?> clsFindClassIfExists = xposedHelpers5.findClassIfExists("android.net.wifi.WifiSsid", classLoader);
                                        if (clsFindClassIfExists != null) {
                                            xposedHelpers5.setObjectField(objProceed, "mWifiSsid", xposedHelpers5.findMethodExact(clsFindClassIfExists, "createFromAsciiEncoded", String.class).invoke(null, strOptString));
                                        }
                                    } catch (Throwable unused16) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setObjectField(objProceed, "mBSSID", strOptString2);
                                    } catch (Throwable unused17) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setObjectField(objProceed, "mMacAddress", strOptString3);
                                    } catch (Throwable unused18) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setIntField(objProceed, "mRssi", iOptInt4);
                                    } catch (Throwable unused19) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setIntField(objProceed, "mFrequency", iOptInt);
                                    } catch (Throwable unused20) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setIntField(objProceed, "mLinkSpeed", i3);
                                    } catch (Throwable unused21) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setIntField(objProceed, "mNetworkId", iOptInt5);
                                    } catch (Throwable unused22) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setIntField(objProceed, "mWifiStandard", iOptInt3);
                                    } catch (Throwable unused23) {
                                    }
                                    obj = objProceed;
                                } else {
                                    obj2 = objProceed;
                                    try {
                                        if (!z) {
                                            try {
                                                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                                                i2 = iOptInt5;
                                                i = iOptInt2;
                                                try {
                                                    str2 = "mLinkSpeed";
                                                    try {
                                                        Object objNewInstance2 = xposedHelpers6.newInstance(xposedHelpers6.findClass("android.net.wifi.WifiInfo$Builder", classLoader), new Object[0]);
                                                        xposedHelpers6.callMethod(objNewInstance2, "setSsid", strOptString);
                                                        xposedHelpers6.callMethod(objNewInstance2, "setBssid", strOptString2);
                                                        xposedHelpers6.callMethod(objNewInstance2, "setRssi", Integer.valueOf(iOptInt4));
                                                        xposedHelpers6.callMethod(objNewInstance2, "setFrequency", Integer.valueOf(iOptInt));
                                                        xposedHelpers6.callMethod(objNewInstance2, "setLinkSpeed", Integer.valueOf(i));
                                                        iOptInt = iOptInt;
                                                        try {
                                                            objCallMethod = xposedHelpers6.callMethod(objNewInstance2, "build", new Object[0]);
                                                            z2 = true;
                                                        } catch (Throwable unused24) {
                                                            objCallMethod = null;
                                                            z2 = false;
                                                        }
                                                    } catch (Throwable unused25) {
                                                        iOptInt = iOptInt;
                                                    }
                                                } catch (Throwable unused26) {
                                                    str2 = "mLinkSpeed";
                                                    objCallMethod = null;
                                                    z2 = false;
                                                    if (z2) {
                                                        objCallMethod.getClass();
                                                        return objCallMethod;
                                                    }
                                                    XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                                                    Object objNewInstance3 = xposedHelpers7.newInstance(xposedHelpers7.findClass("android.net.wifi.WifiInfo", classLoader), new Object[0]);
                                                    try {
                                                        xposedHelpers7.setObjectField(objNewInstance3, "mSSID", "\"" + strOptString + "\"");
                                                    } catch (Throwable unused27) {
                                                    }
                                                    try {
                                                        XposedHelpers.INSTANCE.setObjectField(objNewInstance3, "mBSSID", strOptString2);
                                                    } catch (Throwable unused28) {
                                                    }
                                                    try {
                                                        XposedHelpers.INSTANCE.setObjectField(objNewInstance3, "mMacAddress", strOptString3);
                                                    } catch (Throwable unused29) {
                                                    }
                                                    try {
                                                        XposedHelpers.INSTANCE.setIntField(objNewInstance3, "mRssi", iOptInt4);
                                                    } catch (Throwable unused30) {
                                                    }
                                                    try {
                                                        XposedHelpers.INSTANCE.setIntField(objNewInstance3, "mFrequency", iOptInt);
                                                    } catch (Throwable unused31) {
                                                    }
                                                    try {
                                                        XposedHelpers.INSTANCE.setIntField(objNewInstance3, str2, i);
                                                    } catch (Throwable unused32) {
                                                    }
                                                    XposedHelpers.INSTANCE.setIntField(objNewInstance3, "mNetworkId", i2);
                                                    r0 = objNewInstance3;
                                                    return r0;
                                                }
                                            } catch (Throwable unused33) {
                                                i = iOptInt2;
                                                i2 = iOptInt5;
                                            }
                                            if (z2) {
                                                objCallMethod.getClass();
                                                return objCallMethod;
                                            }
                                            XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                                            Object objNewInstance4 = xposedHelpers8.newInstance(xposedHelpers8.findClass("android.net.wifi.WifiInfo", classLoader), new Object[0]);
                                            xposedHelpers8.setObjectField(objNewInstance4, "mSSID", "\"" + strOptString + "\"");
                                            XposedHelpers.INSTANCE.setObjectField(objNewInstance4, "mBSSID", strOptString2);
                                            XposedHelpers.INSTANCE.setObjectField(objNewInstance4, "mMacAddress", strOptString3);
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance4, "mRssi", iOptInt4);
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance4, "mFrequency", iOptInt);
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance4, str2, i);
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance4, "mNetworkId", i2);
                                            r0 = objNewInstance4;
                                        }
                                    } catch (Throwable unused34) {
                                    }
                                    obj = obj2;
                                }
                            } catch (Throwable unused35) {
                                obj2 = objProceed;
                            }
                            return obj;
                        } catch (Throwable unused36) {
                        }
                        return r0;
                    }
                }).getClass();
            } catch (Throwable unused2) {
            }
        } catch (Throwable th2) {
            XposedBridge.INSTANCE.log(th2);
        }
    }

    public static /* synthetic */ void hookWifiConnectionInfo$default(LocationHooker locationHooker, ClassLoader classLoader, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hookWifiConnectionInfo(locationHooker, classLoader, z);
    }
}
