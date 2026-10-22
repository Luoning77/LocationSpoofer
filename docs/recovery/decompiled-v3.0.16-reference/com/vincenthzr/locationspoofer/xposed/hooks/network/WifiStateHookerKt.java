package com.vincenthzr.locationspoofer.xposed.hooks.network;

import android.os.SystemClock;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.az2;
import defpackage.d0;
import defpackage.l13;
import defpackage.o51;
import defpackage.s13;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class WifiStateHookerKt {
    public static final void hookWifiState(final LocationHooker locationHooker, final ClassLoader classLoader, boolean z) {
        locationHooker.getClass();
        classLoader.getClass();
        int i = 0;
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass = xposedHelpers.findClass("android.net.wifi.WifiManager", classLoader);
                Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact = xposedHelpers.findMethodExact(clsFindClass, "getWifiState", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                xposedHelpers.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiStateHookerKt$hookWifiState$$inlined$hookMethod$1
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
                        if (config$xposed_globalRelease.optBoolean("mock_wifi", true)) {
                            return 3;
                        }
                        List args3 = chain.getArgs();
                        args3.getClass();
                        return chain.proceed(args3.toArray(new Object[0]));
                    }
                }).getClass();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            XposedBridge.INSTANCE.log(th);
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass2 = xposedHelpers2.findClass("android.net.wifi.WifiManager", classLoader);
                Class[] clsArr2 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact2 = xposedHelpers2.findMethodExact(clsFindClass2, "isWifiEnabled", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                xposedHelpers2.getModule().hook(methodFindMethodExact2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiStateHookerKt$hookWifiState$$inlined$hookMethod$2
                    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
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
                        boolean z2 = true;
                        boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_wifi", true);
                        JSONObject jSONObjectOptJSONObject = config$xposed_globalRelease.optJSONObject("wifi_json");
                        if (jSONObjectOptJSONObject == null) {
                            z2 = false;
                        } else if (!jSONObjectOptJSONObject.has("connectedWifi")) {
                            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("nearbyWifi");
                            if ((jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0) <= 0) {
                                z2 = false;
                            }
                        }
                        if (zOptBoolean) {
                            return Boolean.valueOf(z2);
                        }
                        List args3 = chain.getArgs();
                        args3.getClass();
                        return chain.proceed(args3.toArray(new Object[0]));
                    }
                }).getClass();
            } catch (Throwable unused2) {
            }
        } catch (Throwable th2) {
            XposedBridge.INSTANCE.log(th2);
        }
        try {
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass3 = xposedHelpers3.findClass("android.net.wifi.WifiManager", classLoader);
                Class[] clsArr3 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact3 = xposedHelpers3.findMethodExact(clsFindClass3, "getConfiguredNetworks", (Class[]) Arrays.copyOf(clsArr3, clsArr3.length));
                xposedHelpers3.getModule().hook(methodFindMethodExact3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiStateHookerKt$hookWifiState$$inlined$hookMethod$3
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease == null) {
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                        if (config$xposed_globalRelease.optBoolean("active", false)) {
                            return new ArrayList();
                        }
                        List args2 = chain.getArgs();
                        args2.getClass();
                        return chain.proceed(args2.toArray(new Object[0]));
                    }
                }).getClass();
            } catch (Throwable unused3) {
            }
        } catch (Throwable th3) {
            XposedBridge.INSTANCE.log(th3);
        }
        try {
            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass4 = xposedHelpers4.findClass("android.net.wifi.WifiManager", classLoader);
                Class[] clsArr4 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact4 = xposedHelpers4.findMethodExact(clsFindClass4, "getDhcpInfo", (Class[]) Arrays.copyOf(clsArr4, clsArr4.length));
                xposedHelpers4.getModule().hook(methodFindMethodExact4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiStateHookerKt$hookWifiState$$inlined$hookMethod$4
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
                        try {
                            XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                            Object objNewInstance = xposedHelpers5.newInstance(xposedHelpers5.findClass("android.net.DhcpInfo", classLoader), new Object[0]);
                            xposedHelpers5.setIntField(objNewInstance, "ipAddress", 1677830336);
                            xposedHelpers5.setIntField(objNewInstance, "gateway", 16885952);
                            xposedHelpers5.setIntField(objNewInstance, "netmask", 16777215);
                            xposedHelpers5.setIntField(objNewInstance, "dns1", 16885952);
                            xposedHelpers5.setIntField(objNewInstance, "dns2", 134744072);
                            xposedHelpers5.setIntField(objNewInstance, "serverAddress", 16885952);
                            return objNewInstance;
                        } catch (Throwable unused4) {
                            List args3 = chain.getArgs();
                            args3.getClass();
                            return chain.proceed(args3.toArray(new Object[0]));
                        }
                    }
                }).getClass();
            } catch (Throwable unused4) {
            }
        } catch (Throwable th4) {
            XposedBridge.INSTANCE.log(th4);
        }
        try {
            XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass5 = xposedHelpers5.findClass("android.net.NetworkInfo", classLoader);
                Class[] clsArr5 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact5 = xposedHelpers5.findMethodExact(clsFindClass5, "getExtraInfo", (Class[]) Arrays.copyOf(clsArr5, clsArr5.length));
                xposedHelpers5.getModule().hook(methodFindMethodExact5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiStateHookerKt$hookWifiState$$inlined$hookMethod$5
                    public Object intercept(XposedInterface.Chain chain) {
                        JSONObject jSONObjectOptJSONObject;
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
                        if (jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("isConnected", false) : false) {
                            jSONObjectOptJSONObject2.getClass();
                            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("connectedWifi");
                        } else {
                            jSONObjectOptJSONObject = null;
                        }
                        if (jSONObjectOptJSONObject != null) {
                            return az2.k("\"", jSONObjectOptJSONObject.optString("ssid", "HOME_WIFI"), "\"");
                        }
                        return null;
                    }
                }).getClass();
            } catch (Throwable unused5) {
            }
        } catch (Throwable th5) {
            XposedBridge.INSTANCE.log(th5);
        }
        try {
            XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
            Class<?> clsFindClass6 = xposedHelpers6.findClass("android.net.wifi.ScanResult", classLoader);
            Class[] clsArr6 = (Class[]) new ArrayList(0).toArray(new Class[0]);
            final Method methodFindMethodExact6 = xposedHelpers6.findMethodExact(clsFindClass6, "getInformationElements", (Class[]) Arrays.copyOf(clsArr6, clsArr6.length));
            xposedHelpers6.getModule().hook(methodFindMethodExact6).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiStateHookerKt$hookWifiState$$inlined$hookMethod$6
                public Object intercept(XposedInterface.Chain chain) {
                    Object objProceed;
                    chain.getClass();
                    try {
                        List args = chain.getArgs();
                        args.getClass();
                        objProceed = chain.proceed(args.toArray(new Object[0]));
                    } catch (Throwable unused6) {
                        objProceed = null;
                    }
                    return objProceed == null ? Collections.EMPTY_LIST : objProceed;
                }
            }).getClass();
        } catch (Throwable unused6) {
        }
        if (!z) {
            try {
                XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                Class<?> clsFindClassIfExists = xposedHelpers7.findClassIfExists("android.net.wifi.WifiScanner", classLoader);
                if (clsFindClassIfExists != null) {
                    ArrayList arrayList = new ArrayList();
                    d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                    while (d0VarY.hasNext()) {
                        final Method method = (Method) d0VarY.next();
                        if (o51.f(method.getName(), "startScan") && !Modifier.isAbstract(method.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept = xposedHelpers7.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiStateHookerKt$hookWifiState$$inlined$hookAllMethods$1
                                    public Object intercept(XposedInterface.Chain chain) {
                                        chain.getClass();
                                        method.getClass();
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
                                        List args3 = chain.getArgs();
                                        args3.getClass();
                                        Object objU0 = zy.u0(args3);
                                        if (objU0 == null) {
                                            return null;
                                        }
                                        boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_wifi", true);
                                        JSONObject jSONObjectOptJSONObject = zOptBoolean ? config$xposed_globalRelease.optJSONObject("wifi_json") : null;
                                        if (zOptBoolean) {
                                            try {
                                                Class<?> clsFindClass7 = XposedHelpers.INSTANCE.findClass("android.net.wifi.ScanResult", classLoader);
                                                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                                ArrayList arrayList2 = new ArrayList();
                                                if (jSONObjectOptJSONObject != null) {
                                                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optBoolean("isConnected", false) ? jSONObjectOptJSONObject.optJSONObject("connectedWifi") : null;
                                                    if (jSONObjectOptJSONObject2 != null) {
                                                        WifiStateHookerKt.hookWifiState$lambda$6$addFakeScanResult(clsFindClass7, classLoader, locationHooker, jElapsedRealtimeNanos, arrayList2, jSONObjectOptJSONObject2);
                                                    }
                                                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("nearbyWifi");
                                                    if (jSONArrayOptJSONArray != null) {
                                                        int length = jSONArrayOptJSONArray.length();
                                                        for (int i2 = 0; i2 < length; i2++) {
                                                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                                                            ClassLoader classLoader2 = classLoader;
                                                            LocationHooker locationHooker2 = locationHooker;
                                                            jSONObject.getClass();
                                                            WifiStateHookerKt.hookWifiState$lambda$6$addFakeScanResult(clsFindClass7, classLoader2, locationHooker2, jElapsedRealtimeNanos, arrayList2, jSONObject);
                                                        }
                                                    }
                                                }
                                                if (arrayList2.isEmpty()) {
                                                    Random random = new Random(((long) (config$xposed_globalRelease.optDouble("lng", 0.0d) * 100000.0d)) ^ ((long) (config$xposed_globalRelease.optDouble("lat", 0.0d) * 100000.0d)));
                                                    int i3 = 0;
                                                    while (i3 < 5) {
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        jSONObject2.put("ssid", "WIFI_" + (random.nextInt(9000) + 1000));
                                                        jSONObject2.put("bssid", String.format("%02x:%02x:%02x:%02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256))}, 6)));
                                                        jSONObject2.put("level", (-40) - random.nextInt(50));
                                                        jSONObject2.put("frequency", random.nextBoolean() ? 2412 : 5180);
                                                        jSONObject2.put("capabilities", "[WPA2-PSK-CCMP][ESS]");
                                                        WifiStateHookerKt.hookWifiState$lambda$6$addFakeScanResult(clsFindClass7, classLoader, locationHooker, jElapsedRealtimeNanos, arrayList2, jSONObject2);
                                                        i3++;
                                                        arrayList2 = arrayList2;
                                                    }
                                                }
                                                ArrayList arrayList3 = arrayList2;
                                                if (arrayList3.isEmpty()) {
                                                    XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                                                    Class<?> clsFindClass8 = xposedHelpers8.findClass("android.net.wifi.WifiScanner$ScanData", classLoader);
                                                    Object objNewInstance = xposedHelpers8.newInstance(clsFindClass8, 0, 0, Array.newInstance(clsFindClass7, 0));
                                                    Object objNewInstance2 = Array.newInstance(clsFindClass8, 1);
                                                    Array.set(objNewInstance2, 0, objNewInstance);
                                                    xposedHelpers8.callMethod(objU0, "onResults", objNewInstance2);
                                                } else {
                                                    Object objNewInstance3 = Array.newInstance(clsFindClass7, arrayList3.size());
                                                    int size = arrayList3.size();
                                                    for (int i4 = 0; i4 < size; i4++) {
                                                        Array.set(objNewInstance3, i4, arrayList3.get(i4));
                                                    }
                                                    XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
                                                    Class<?> clsFindClass9 = xposedHelpers9.findClass("android.net.wifi.WifiScanner$ScanData", classLoader);
                                                    Object objNewInstance4 = xposedHelpers9.newInstance(clsFindClass9, 0, 0, objNewInstance3);
                                                    Object objNewInstance5 = Array.newInstance(clsFindClass9, 1);
                                                    Array.set(objNewInstance5, 0, objNewInstance4);
                                                    xposedHelpers9.callMethod(objU0, "onResults", objNewInstance5);
                                                }
                                            } catch (Throwable th6) {
                                                XposedBridge.INSTANCE.log("[LocationSpoofer] WifiScanner 伪造失败: " + th6);
                                            }
                                        } else {
                                            try {
                                                XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
                                                Class<?> clsFindClass10 = xposedHelpers10.findClass("android.net.wifi.WifiScanner$ScanData", classLoader);
                                                Object objNewInstance6 = xposedHelpers10.newInstance(clsFindClass10, 0, 0, Array.newInstance(xposedHelpers10.findClass("android.net.wifi.ScanResult", classLoader), 0));
                                                Object objNewInstance7 = Array.newInstance(clsFindClass10, 1);
                                                Array.set(objNewInstance7, 0, objNewInstance6);
                                                xposedHelpers10.callMethod(objU0, "onResults", objNewInstance7);
                                            } catch (Throwable unused7) {
                                            }
                                        }
                                        return null;
                                    }
                                });
                                hookHandleIntercept.getClass();
                                arrayList.add(hookHandleIntercept);
                                i++;
                            } catch (Throwable th6) {
                                HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#startScan", th6);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "startScan", i);
                }
            } catch (Throwable th7) {
                XposedBridge.INSTANCE.log(th7);
            }
        }
        XposedBridge.INSTANCE.log("[LocationSpoofer] Wi-Fi environment hooks installed");
    }

    public static /* synthetic */ void hookWifiState$default(LocationHooker locationHooker, ClassLoader classLoader, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hookWifiState(locationHooker, classLoader, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hookWifiState$lambda$6$addFakeScanResult(Class<?> cls, ClassLoader classLoader, LocationHooker locationHooker, long j, ArrayList<Object> arrayList, JSONObject jSONObject) {
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Object objNewInstance = xposedHelpers.newInstance(cls, new Object[0]);
        String strOptString = jSONObject.optString("ssid", "");
        String strOptString2 = jSONObject.optString("bssid", "");
        strOptString.getClass();
        if (strOptString.length() == 0 || strOptString.equals("<unknown ssid>")) {
            strOptString2.getClass();
            strOptString = "WIFI_".concat(s13.X(l13.C0(5, strOptString2), ":", "", false));
        }
        xposedHelpers.setObjectField(objNewInstance, "SSID", strOptString);
        xposedHelpers.setObjectField(objNewInstance, "BSSID", strOptString2);
        xposedHelpers.setIntField(objNewInstance, "level", jSONObject.optInt("level", -65));
        xposedHelpers.setIntField(objNewInstance, "frequency", jSONObject.optInt("frequency", 2412));
        xposedHelpers.setObjectField(objNewInstance, "capabilities", jSONObject.optString("capabilities", "[WPA2-PSK-CCMP][ESS]"));
        try {
            Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.net.wifi.ScanResult$InformationElement", classLoader);
            if (clsFindClassIfExists != null) {
                xposedHelpers.setObjectField(objNewInstance, "informationElements", Array.newInstance(clsFindClassIfExists, 0));
            }
        } catch (Throwable unused) {
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists2 = xposedHelpers2.findClassIfExists("android.net.wifi.ScanResult$RadioChainInfo", classLoader);
            if (clsFindClassIfExists2 != null) {
                xposedHelpers2.setObjectField(objNewInstance, "radioChainInfos", Array.newInstance(clsFindClassIfExists2, 0));
            }
        } catch (Throwable unused2) {
        }
        try {
            XposedHelpers.INSTANCE.setLongField(objNewInstance, "timestamp", (j - (((long) locationHooker.getRng$xposed_globalRelease().nextInt(200000)) * 1000)) / 1000);
        } catch (Throwable unused3) {
        }
        arrayList.add(objNewInstance);
    }
}
