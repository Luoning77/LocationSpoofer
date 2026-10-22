package com.vincenthzr.locationspoofer.xposed.hooks.network;

import android.os.SystemClock;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.b81;
import defpackage.l13;
import defpackage.o0;
import defpackage.od2;
import defpackage.s13;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class WifiScanResultHookerKt {
    public static final void hookWifiEnvironment(LocationHooker locationHooker, ClassLoader classLoader, boolean z) {
        locationHooker.getClass();
        classLoader.getClass();
        hookWifiScanResults(locationHooker, classLoader);
        WifiConnectionInfoHookerKt.hookWifiConnectionInfo(locationHooker, classLoader, z);
        WifiStateHookerKt.hookWifiState(locationHooker, classLoader, z);
    }

    public static /* synthetic */ void hookWifiEnvironment$default(LocationHooker locationHooker, ClassLoader classLoader, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hookWifiEnvironment(locationHooker, classLoader, z);
    }

    public static final void hookWifiScanResults(final LocationHooker locationHooker, final ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        final List listG = am1.G("[WPA2-PSK-CCMP][RSN-PSK-CCMP][ESS]", "[WPA2-PSK-CCMP+TKIP][RSN-PSK-CCMP+TKIP][ESS]", "[WPA2-PSK-CCMP][ESS][WPS]", "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS]", "[RSN-PSK-CCMP][ESS]", "[WPA2-EAP-CCMP][RSN-EAP-CCMP][ESS]", "[ESS]", "[WPA2-PSK-CCMP][RSN-PSK-CCMP][ESS][WPS]", "[WPA2-SAE-CCMP][RSN-SAE-CCMP][ESS]", "[WPA2-PSK+SAE-CCMP][RSN-PSK+SAE-CCMP][ESS]");
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass = xposedHelpers.findClass("android.net.wifi.WifiManager", classLoader);
                Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact = xposedHelpers.findMethodExact(clsFindClass, "getScanResults", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                xposedHelpers.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.WifiScanResultHookerKt$hookWifiScanResults$$inlined$hookMethod$1
                    public Object intercept(XposedInterface.Chain chain) {
                        Class<?> cls;
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
                        ArrayList arrayList = new ArrayList();
                        boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_wifi", true);
                        JSONObject jSONObjectOptJSONObject = zOptBoolean ? config$xposed_globalRelease.optJSONObject("wifi_json") : null;
                        if (!zOptBoolean) {
                            return arrayList;
                        }
                        try {
                            Class<?> clsFindClass2 = XposedHelpers.INSTANCE.findClass("android.net.wifi.ScanResult", classLoader);
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            if (jSONObjectOptJSONObject != null) {
                                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optBoolean("isConnected", false) ? jSONObjectOptJSONObject.optJSONObject("connectedWifi") : null;
                                if (jSONObjectOptJSONObject2 != null) {
                                    cls = clsFindClass2;
                                    WifiScanResultHookerKt.hookWifiScanResults$lambda$0$addFakeScanResult(cls, listG, classLoader, locationHooker, jElapsedRealtimeNanos, arrayList, jSONObjectOptJSONObject2);
                                } else {
                                    cls = clsFindClass2;
                                }
                                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("nearbyWifi");
                                if (jSONArrayOptJSONArray != null) {
                                    int length = jSONArrayOptJSONArray.length();
                                    for (int i = 0; i < length; i++) {
                                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                                        List list = listG;
                                        ClassLoader classLoader2 = classLoader;
                                        LocationHooker locationHooker2 = locationHooker;
                                        jSONObject.getClass();
                                        WifiScanResultHookerKt.hookWifiScanResults$lambda$0$addFakeScanResult(cls, list, classLoader2, locationHooker2, jElapsedRealtimeNanos, arrayList, jSONObject);
                                    }
                                }
                            } else {
                                cls = clsFindClass2;
                            }
                            if (!arrayList.isEmpty()) {
                                return arrayList;
                            }
                            Random random = new Random(((long) (config$xposed_globalRelease.optDouble("lng", 0.0d) * 100000.0d)) ^ ((long) (config$xposed_globalRelease.optDouble("lat", 0.0d) * 100000.0d)));
                            for (int i2 = 0; i2 < 5; i2++) {
                                long j = jElapsedRealtimeNanos;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("ssid", "WIFI_" + (random.nextInt(9000) + 1000));
                                jSONObject2.put("bssid", String.format("%02x:%02x:%02x:%02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256))}, 6)));
                                jSONObject2.put("level", (-40) - random.nextInt(50));
                                jSONObject2.put("frequency", random.nextBoolean() ? 2412 : 5180);
                                jSONObject2.put("capabilities", "[WPA2-PSK-CCMP][ESS]");
                                Class<?> cls2 = cls;
                                ArrayList arrayList2 = arrayList;
                                try {
                                    WifiScanResultHookerKt.hookWifiScanResults$lambda$0$addFakeScanResult(cls2, listG, classLoader, locationHooker, j, arrayList2, jSONObject2);
                                    cls = cls2;
                                    jElapsedRealtimeNanos = j;
                                    arrayList = arrayList2;
                                } catch (Throwable unused) {
                                    return arrayList2;
                                }
                            }
                            return arrayList;
                        } catch (Throwable unused2) {
                            return arrayList;
                        }
                    }
                }).getClass();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            XposedBridge.INSTANCE.log(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hookWifiScanResults$lambda$0$addFakeScanResult(Class<?> cls, List<String> list, ClassLoader classLoader, LocationHooker locationHooker, long j, ArrayList<Object> arrayList, JSONObject jSONObject) {
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
        o0 o0Var = od2.e;
        list.getClass();
        if (list.isEmpty()) {
            b81.y("Collection is empty.");
            return;
        }
        xposedHelpers.setObjectField(objNewInstance, "capabilities", jSONObject.optString("capabilities", (String) zy.k0(od2.e.c(list.size()), list)));
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
