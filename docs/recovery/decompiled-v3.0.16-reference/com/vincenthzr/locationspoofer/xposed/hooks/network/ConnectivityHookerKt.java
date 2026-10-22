package com.vincenthzr.locationspoofer.xposed.hooks.network;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.hd;
import defpackage.l13;
import defpackage.s13;
import defpackage.sw;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ConnectivityHookerKt {
    public static final void hookConnectivityLayer(LocationHooker locationHooker, ClassLoader classLoader, boolean z) {
        final LocationHooker locationHooker2;
        final ClassLoader classLoader2;
        final boolean z2;
        Class<?> clsFindClass;
        Class<?> clsFindClass2;
        locationHooker.getClass();
        classLoader.getClass();
        final hd hdVar = new hd(classLoader, 8);
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Class<?> clsFindClass3 = xposedHelpers.findClass("android.net.ConnectivityManager", classLoader);
            Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
            final Method methodFindMethodExact = xposedHelpers.findMethodExact(clsFindClass3, "getActiveNetworkInfo", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            locationHooker2 = locationHooker;
            classLoader2 = classLoader;
            z2 = z;
            try {
                xposedHelpers.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.ConnectivityHookerKt$hookConnectivityLayer$$inlined$hookMethod$1
                    /* JADX WARN: Code duplicated, block: B:27:0x00aa A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:28:0x00ac A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #0 {all -> 0x00dd, blocks: (B:19:0x005a, B:28:0x00ac, B:30:0x00c1), top: B:34:0x004b }] */
                    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #0 {all -> 0x00dd, blocks: (B:19:0x005a, B:28:0x00ac, B:30:0x00c1), top: B:34:0x004b }] */
                    public Object intercept(XposedInterface.Chain chain) {
                        XposedHelpers xposedHelpers2;
                        Object objCallMethod;
                        Object objInvoke;
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_wifi", true)) {
                            JSONObject jSONObjectOptJSONObject = config$xposed_globalRelease.optJSONObject("wifi_json");
                            try {
                                if (jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("isConnected", false) : false) {
                                    jSONObjectOptJSONObject.getClass();
                                    if (jSONObjectOptJSONObject.optJSONObject("connectedWifi") != null) {
                                        if (objProceed != null) {
                                            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                                            xposedHelpers3.callMethod(objProceed, "setIsAvailable", Boolean.TRUE);
                                            xposedHelpers3.setObjectField(objProceed, "mState", xposedHelpers3.findClass("android.net.NetworkInfo$State", classLoader2).getField("CONNECTED").get(null));
                                            xposedHelpers3.setObjectField(objProceed, "mDetailedState", xposedHelpers3.findClass("android.net.NetworkInfo$DetailedState", classLoader2).getField("CONNECTED").get(null));
                                            xposedHelpers3.setObjectField(objProceed, "mNetworkType", 1);
                                            xposedHelpers3.setObjectField(objProceed, "mTypeName", "WIFI");
                                        } else if (!z2 && (objInvoke = hdVar.invoke()) != null) {
                                            return objInvoke;
                                        }
                                    } else if (objProceed != null) {
                                        xposedHelpers2 = XposedHelpers.INSTANCE;
                                        objCallMethod = xposedHelpers2.callMethod(objProceed, "getType", new Object[0]);
                                        objCallMethod.getClass();
                                        if (((Integer) objCallMethod).intValue() == 1) {
                                            xposedHelpers2.setObjectField(objProceed, "mState", xposedHelpers2.findClass("android.net.NetworkInfo$State", classLoader2).getField("DISCONNECTED").get(null));
                                            xposedHelpers2.callMethod(objProceed, "setIsAvailable", Boolean.FALSE);
                                        }
                                    }
                                } else if (objProceed != null) {
                                    xposedHelpers2 = XposedHelpers.INSTANCE;
                                    objCallMethod = xposedHelpers2.callMethod(objProceed, "getType", new Object[0]);
                                    objCallMethod.getClass();
                                    if (((Integer) objCallMethod).intValue() == 1) {
                                        xposedHelpers2.setObjectField(objProceed, "mState", xposedHelpers2.findClass("android.net.NetworkInfo$State", classLoader2).getField("DISCONNECTED").get(null));
                                        xposedHelpers2.callMethod(objProceed, "setIsAvailable", Boolean.FALSE);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        return objProceed;
                    }
                }).getClass();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            locationHooker2 = locationHooker;
            classLoader2 = classLoader;
            z2 = z;
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Class cls = Integer.TYPE;
            cls.getClass();
            Class<?> clsFindClass4 = xposedHelpers2.findClass("android.net.ConnectivityManager", classLoader2);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{cls}[0];
            if (obj instanceof Class) {
                clsFindClass2 = (Class) obj;
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid argument type");
                }
                clsFindClass2 = xposedHelpers2.findClass((String) obj, clsFindClass4.getClassLoader());
            }
            arrayList.add(clsFindClass2);
            Class[] clsArr2 = (Class[]) arrayList.toArray(new Class[0]);
            final Method methodFindMethodExact2 = xposedHelpers2.findMethodExact(clsFindClass4, "getNetworkInfo", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
            xposedHelpers2.getModule().hook(methodFindMethodExact2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.ConnectivityHookerKt$hookConnectivityLayer$$inlined$hookMethod$2
                /* JADX WARN: Code duplicated, block: B:27:0x00aa A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:28:0x00ac A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #0 {all -> 0x00dd, blocks: (B:19:0x005a, B:28:0x00ac, B:30:0x00c1), top: B:34:0x004b }] */
                /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #0 {all -> 0x00dd, blocks: (B:19:0x005a, B:28:0x00ac, B:30:0x00c1), top: B:34:0x004b }] */
                public Object intercept(XposedInterface.Chain chain) {
                    XposedHelpers xposedHelpers3;
                    Object objCallMethod;
                    Object objInvoke;
                    chain.getClass();
                    List args = chain.getArgs();
                    args.getClass();
                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                    JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_wifi", true)) {
                        JSONObject jSONObjectOptJSONObject = config$xposed_globalRelease.optJSONObject("wifi_json");
                        try {
                            if (jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("isConnected", false) : false) {
                                jSONObjectOptJSONObject.getClass();
                                if (jSONObjectOptJSONObject.optJSONObject("connectedWifi") != null) {
                                    if (objProceed != null) {
                                        XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                                        xposedHelpers4.callMethod(objProceed, "setIsAvailable", Boolean.TRUE);
                                        xposedHelpers4.setObjectField(objProceed, "mState", xposedHelpers4.findClass("android.net.NetworkInfo$State", classLoader2).getField("CONNECTED").get(null));
                                        xposedHelpers4.setObjectField(objProceed, "mDetailedState", xposedHelpers4.findClass("android.net.NetworkInfo$DetailedState", classLoader2).getField("CONNECTED").get(null));
                                        xposedHelpers4.setObjectField(objProceed, "mNetworkType", 1);
                                        xposedHelpers4.setObjectField(objProceed, "mTypeName", "WIFI");
                                    } else if (!z2 && (objInvoke = hdVar.invoke()) != null) {
                                        return objInvoke;
                                    }
                                } else if (objProceed != null) {
                                    xposedHelpers3 = XposedHelpers.INSTANCE;
                                    objCallMethod = xposedHelpers3.callMethod(objProceed, "getType", new Object[0]);
                                    objCallMethod.getClass();
                                    if (((Integer) objCallMethod).intValue() == 1) {
                                        xposedHelpers3.setObjectField(objProceed, "mState", xposedHelpers3.findClass("android.net.NetworkInfo$State", classLoader2).getField("DISCONNECTED").get(null));
                                        xposedHelpers3.callMethod(objProceed, "setIsAvailable", Boolean.FALSE);
                                    }
                                }
                            } else if (objProceed != null) {
                                xposedHelpers3 = XposedHelpers.INSTANCE;
                                objCallMethod = xposedHelpers3.callMethod(objProceed, "getType", new Object[0]);
                                objCallMethod.getClass();
                                if (((Integer) objCallMethod).intValue() == 1) {
                                    xposedHelpers3.setObjectField(objProceed, "mState", xposedHelpers3.findClass("android.net.NetworkInfo$State", classLoader2).getField("DISCONNECTED").get(null));
                                    xposedHelpers3.callMethod(objProceed, "setIsAvailable", Boolean.FALSE);
                                }
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                    return objProceed;
                }
            }).getClass();
        } catch (Throwable unused3) {
        }
        try {
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            Class<?> clsFindClass5 = xposedHelpers3.findClass("android.net.ConnectivityManager", classLoader2);
            ArrayList arrayList2 = new ArrayList(1);
            Object obj2 = new Object[]{"android.net.Network"}[0];
            if (obj2 instanceof Class) {
                clsFindClass = (Class) obj2;
            } else {
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Invalid argument type");
                }
                clsFindClass = xposedHelpers3.findClass((String) obj2, clsFindClass5.getClassLoader());
            }
            arrayList2.add(clsFindClass);
            Class[] clsArr3 = (Class[]) arrayList2.toArray(new Class[0]);
            final Method methodFindMethodExact3 = xposedHelpers3.findMethodExact(clsFindClass5, "getNetworkCapabilities", (Class[]) Arrays.copyOf(clsArr3, clsArr3.length));
            xposedHelpers3.getModule().hook(methodFindMethodExact3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.ConnectivityHookerKt$hookConnectivityLayer$$inlined$hookMethod$3
                /* JADX WARN: Code duplicated, block: B:92:0x01f0 A[Catch: all -> 0x0151, TRY_ENTER, TRY_LEAVE, TryCatch #30 {all -> 0x0151, blocks: (B:37:0x00d2, B:54:0x015a, B:107:0x027c, B:92:0x01f0), top: B:203:0x00d2 }] */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
                public Object intercept(XposedInterface.Chain chain) {
                    JSONObject jSONObjectOptJSONObject;
                    Object objectField;
                    Object obj3;
                    int i;
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    boolean z3;
                    Object objNewInstance;
                    String str6;
                    Object obj4 = "setMacAddress";
                    chain.getClass();
                    List args = chain.getArgs();
                    args.getClass();
                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                    JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_wifi", true) || objProceed == null) {
                        return objProceed;
                    }
                    try {
                        JSONObject jSONObjectOptJSONObject2 = config$xposed_globalRelease.optJSONObject("wifi_json");
                        if (jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("isConnected", false) : false) {
                            jSONObjectOptJSONObject2.getClass();
                            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("connectedWifi");
                        } else {
                            jSONObjectOptJSONObject = null;
                        }
                        try {
                            if (jSONObjectOptJSONObject == null) {
                                try {
                                    XposedHelpers.INSTANCE.setObjectField(objProceed, "mTransportInfo", null);
                                } catch (Throwable unused4) {
                                }
                                XposedBridge.INSTANCE.log("[LocationSpoofer] fakeWifiInfo: No wifi data, removed TransportInfo");
                                return objProceed;
                            }
                            try {
                                objectField = XposedHelpers.INSTANCE.getObjectField(objProceed, "mTransportInfo");
                            } catch (Throwable unused5) {
                                objectField = null;
                            }
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
                            String str7 = "setMacAddress";
                            String str8 = "mFrequency";
                            if (objectField != null) {
                                try {
                                    if (l13.c0(objectField.getClass().getName(), "WifiInfo", false)) {
                                        try {
                                            XposedHelpers.INSTANCE.setObjectField(objectField, "mSSID", "\"" + strOptString + "\"");
                                        } catch (Throwable unused6) {
                                        }
                                        try {
                                            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                                            Class<?> clsFindClassIfExists = xposedHelpers4.findClassIfExists("android.net.wifi.WifiSsid", classLoader2);
                                            if (clsFindClassIfExists != null) {
                                                xposedHelpers4.setObjectField(objectField, "mWifiSsid", xposedHelpers4.findMethodExact(clsFindClassIfExists, "createFromAsciiEncoded", String.class).invoke(null, strOptString));
                                            }
                                        } catch (Throwable unused7) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setObjectField(objectField, "mBSSID", strOptString2);
                                        } catch (Throwable unused8) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setObjectField(objectField, "mMacAddress", strOptString3);
                                        } catch (Throwable unused9) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setIntField(objectField, "mFrequency", iOptInt);
                                        } catch (Throwable unused10) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setIntField(objectField, "mLinkSpeed", iOptInt2);
                                        } catch (Throwable unused11) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setIntField(objectField, "mWifiStandard", iOptInt3);
                                        } catch (Throwable unused12) {
                                        }
                                        obj3 = objProceed;
                                    } else {
                                        i = iOptInt2;
                                        str = "mLinkSpeed";
                                        str8 = "mFrequency";
                                    }
                                    try {
                                        try {
                                            Field declaredField = obj3.getClass().getDeclaredField("mTransportTypes");
                                            declaredField.setAccessible(true);
                                            declaredField.setLong(obj3, declaredField.getLong(obj3) | 2);
                                            return obj3;
                                        } catch (Throwable unused13) {
                                            return obj3;
                                        }
                                    } catch (Throwable unused14) {
                                        XposedHelpers.INSTANCE.callMethod(obj3, "addTransportType", 1);
                                        return obj3;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj4 = objProceed;
                                }
                            } else {
                                str = "mLinkSpeed";
                                i = iOptInt2;
                            }
                            if (z2) {
                                return objProceed;
                            }
                            try {
                                XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                                str5 = "mWifiSsid";
                                str3 = "createFromAsciiEncoded";
                                try {
                                    str2 = "android.net.wifi.WifiSsid";
                                    try {
                                        Object objNewInstance2 = xposedHelpers5.newInstance(xposedHelpers5.findClass("android.net.wifi.WifiInfo$Builder", classLoader2), new Object[0]);
                                        xposedHelpers5.callMethod(objNewInstance2, "setBssid", strOptString2);
                                        try {
                                            str6 = str7;
                                            try {
                                                xposedHelpers5.callMethod(objNewInstance2, str6, strOptString3);
                                            } catch (Throwable unused15) {
                                            }
                                        } catch (Throwable unused16) {
                                            str6 = str7;
                                        }
                                        try {
                                            XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                                            str7 = str6;
                                            try {
                                                byte[] bytes = strOptString.getBytes(sw.a);
                                                bytes.getClass();
                                                xposedHelpers6.callMethod(objNewInstance2, "setSsid", bytes);
                                            } catch (Throwable unused17) {
                                            }
                                        } catch (Throwable unused18) {
                                            str7 = str6;
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(objNewInstance2, "setNetworkId", 1);
                                        } catch (Throwable unused19) {
                                        }
                                        XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                                        str4 = strOptString;
                                        try {
                                            objNewInstance = xposedHelpers7.callMethod(objNewInstance2, "build", new Object[0]);
                                            if (objNewInstance != null) {
                                                try {
                                                    xposedHelpers7.setIntField(objNewInstance, str8, iOptInt);
                                                } catch (Throwable unused20) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setIntField(objNewInstance, str, i);
                                                } catch (Throwable unused21) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mMacAddress", strOptString3);
                                                } catch (Throwable unused22) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setIntField(objNewInstance, "mWifiStandard", iOptInt3);
                                                } catch (Throwable unused23) {
                                                }
                                            }
                                            z3 = true;
                                        } catch (Throwable unused24) {
                                            z3 = false;
                                            objNewInstance = null;
                                        }
                                    } catch (Throwable unused25) {
                                        str4 = strOptString;
                                        z3 = false;
                                        objNewInstance = null;
                                        if (z3) {
                                            XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                                            objNewInstance = xposedHelpers8.newInstance(xposedHelpers8.findClass("android.net.wifi.WifiInfo", classLoader2), new Object[0]);
                                            try {
                                                try {
                                                    xposedHelpers8.callMethod(objNewInstance, "setBSSID", strOptString2);
                                                } catch (Throwable unused26) {
                                                    XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mBSSID", strOptString2);
                                                    try {
                                                        XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mBssid", strOptString2);
                                                    } catch (Throwable unused27) {
                                                    }
                                                    try {
                                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, str7, strOptString3);
                                                    } catch (Throwable unused28) {
                                                        XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mMacAddress", strOptString3);
                                                    }
                                                    try {
                                                        XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
                                                        xposedHelpers9.setObjectField(objNewInstance, str5, xposedHelpers9.findMethodExact(xposedHelpers9.findClass(str2, classLoader2), str3, String.class).invoke(null, str4));
                                                    } catch (Throwable unused29) {
                                                    }
                                                    XposedHelpers.INSTANCE.setIntField(objNewInstance, "mNetworkId", 1);
                                                    XposedHelpers.INSTANCE.setIntField(objNewInstance, str8, iOptInt);
                                                    XposedHelpers.INSTANCE.setIntField(objNewInstance, str, i);
                                                    XposedHelpers.INSTANCE.setIntField(objNewInstance, "mWifiStandard", iOptInt3);
                                                    obj3 = objProceed;
                                                    XposedHelpers.INSTANCE.setObjectField(obj3, "mTransportInfo", objNewInstance);
                                                    Field declaredField2 = obj3.getClass().getDeclaredField("mTransportTypes");
                                                    declaredField2.setAccessible(true);
                                                    declaredField2.setLong(obj3, declaredField2.getLong(obj3) | 2);
                                                    return obj3;
                                                }
                                            } catch (Throwable unused30) {
                                                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mBssid", strOptString2);
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.callMethod(objNewInstance, str7, strOptString3);
                                            } catch (Throwable unused31) {
                                            }
                                            try {
                                                XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
                                                xposedHelpers10.setObjectField(objNewInstance, str5, xposedHelpers10.findMethodExact(xposedHelpers10.findClass(str2, classLoader2), str3, String.class).invoke(null, str4));
                                            } catch (Throwable unused32) {
                                                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mSSID", "\"" + str4 + "\"");
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mNetworkId", 1);
                                            } catch (Throwable unused33) {
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.setIntField(objNewInstance, str8, iOptInt);
                                            } catch (Throwable unused34) {
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.setIntField(objNewInstance, str, i);
                                            } catch (Throwable unused35) {
                                            }
                                            try {
                                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mWifiStandard", iOptInt3);
                                            } catch (Throwable unused36) {
                                            }
                                        } else {
                                            XposedHelpers xposedHelpers11 = XposedHelpers.INSTANCE;
                                            objNewInstance = xposedHelpers11.newInstance(xposedHelpers11.findClass("android.net.wifi.WifiInfo", classLoader2), new Object[0]);
                                            xposedHelpers11.callMethod(objNewInstance, "setBSSID", strOptString2);
                                            XposedHelpers.INSTANCE.callMethod(objNewInstance, str7, strOptString3);
                                            XposedHelpers xposedHelpers12 = XposedHelpers.INSTANCE;
                                            xposedHelpers12.setObjectField(objNewInstance, str5, xposedHelpers12.findMethodExact(xposedHelpers12.findClass(str2, classLoader2), str3, String.class).invoke(null, str4));
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance, "mNetworkId", 1);
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance, str8, iOptInt);
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance, str, i);
                                            XposedHelpers.INSTANCE.setIntField(objNewInstance, "mWifiStandard", iOptInt3);
                                        }
                                        obj3 = objProceed;
                                        XposedHelpers.INSTANCE.setObjectField(obj3, "mTransportInfo", objNewInstance);
                                        Field declaredField3 = obj3.getClass().getDeclaredField("mTransportTypes");
                                        declaredField3.setAccessible(true);
                                        declaredField3.setLong(obj3, declaredField3.getLong(obj3) | 2);
                                        return obj3;
                                    }
                                } catch (Throwable unused37) {
                                    str2 = "android.net.wifi.WifiSsid";
                                }
                            } catch (Throwable unused38) {
                                str2 = "android.net.wifi.WifiSsid";
                                str3 = "createFromAsciiEncoded";
                                str4 = strOptString;
                                str5 = "mWifiSsid";
                            }
                            if (z3 || objNewInstance == null) {
                                XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
                                objNewInstance = xposedHelpers13.newInstance(xposedHelpers13.findClass("android.net.wifi.WifiInfo", classLoader2), new Object[0]);
                                xposedHelpers13.callMethod(objNewInstance, "setBSSID", strOptString2);
                                XposedHelpers.INSTANCE.callMethod(objNewInstance, str7, strOptString3);
                                XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                                xposedHelpers14.setObjectField(objNewInstance, str5, xposedHelpers14.findMethodExact(xposedHelpers14.findClass(str2, classLoader2), str3, String.class).invoke(null, str4));
                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mNetworkId", 1);
                                XposedHelpers.INSTANCE.setIntField(objNewInstance, str8, iOptInt);
                                XposedHelpers.INSTANCE.setIntField(objNewInstance, str, i);
                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mWifiStandard", iOptInt3);
                            }
                            obj3 = objProceed;
                            XposedHelpers.INSTANCE.setObjectField(obj3, "mTransportInfo", objNewInstance);
                            Field declaredField4 = obj3.getClass().getDeclaredField("mTransportTypes");
                            declaredField4.setAccessible(true);
                            declaredField4.setLong(obj3, declaredField4.getLong(obj3) | 2);
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj4 = objProceed;
                    }
                    XposedBridge.INSTANCE.log("[LocationSpoofer] fakeWifiInfo error: " + th.getMessage());
                    return obj4;
                }
            }).getClass();
        } catch (Throwable unused4) {
        }
        try {
            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
            Class<?> clsFindClass6 = xposedHelpers4.findClass("java.net.NetworkInterface", classLoader2);
            Class[] clsArr4 = (Class[]) new ArrayList(0).toArray(new Class[0]);
            final Method methodFindMethodExact4 = xposedHelpers4.findMethodExact(clsFindClass6, "getNetworkInterfaces", (Class[]) Arrays.copyOf(clsArr4, clsArr4.length));
            xposedHelpers4.getModule().hook(methodFindMethodExact4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.ConnectivityHookerKt$hookConnectivityLayer$$inlined$hookMethod$4
                public Object intercept(XposedInterface.Chain chain) {
                    String name;
                    chain.getClass();
                    List args = chain.getArgs();
                    args.getClass();
                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                    JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                        Enumeration enumeration = objProceed instanceof Enumeration ? (Enumeration) objProceed : null;
                        if (enumeration != null) {
                            ArrayList list = Collections.list(enumeration);
                            list.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            int size = list.size();
                            int i = 0;
                            while (i < size) {
                                Object obj3 = list.get(i);
                                i++;
                                try {
                                    obj3.getClass();
                                    name = ((NetworkInterface) obj3).getName();
                                } catch (Throwable unused5) {
                                    name = "";
                                }
                                name.getClass();
                                if (!s13.Z(name, "wlan", false) && !s13.Z(name, "p2p", false) && !s13.Z(name, "swlan", false)) {
                                    arrayList3.add(obj3);
                                }
                            }
                            return Collections.enumeration(arrayList3);
                        }
                    }
                    return objProceed;
                }
            }).getClass();
        } catch (Throwable unused5) {
        }
        XposedBridge.INSTANCE.log("[LocationSpoofer] Connectivity layer hooks installed");
    }

    public static /* synthetic */ void hookConnectivityLayer$default(LocationHooker locationHooker, ClassLoader classLoader, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hookConnectivityLayer(locationHooker, classLoader, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object hookConnectivityLayer$lambda$0(ClassLoader classLoader) {
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Object objNewInstance = xposedHelpers.newInstance(xposedHelpers.findClass("android.net.NetworkInfo", classLoader), 1, 0, "WIFI", "");
            xposedHelpers.callMethod(objNewInstance, "setIsAvailable", Boolean.TRUE);
            try {
                xposedHelpers.setObjectField(objNewInstance, "mState", xposedHelpers.findClass("android.net.NetworkInfo$State", classLoader).getField("CONNECTED").get(null));
            } catch (Throwable unused) {
            }
            try {
                XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                xposedHelpers2.setObjectField(objNewInstance, "mDetailedState", xposedHelpers2.findClass("android.net.NetworkInfo$DetailedState", classLoader).getField("CONNECTED").get(null));
            } catch (Throwable unused2) {
            }
            return objNewInstance;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
