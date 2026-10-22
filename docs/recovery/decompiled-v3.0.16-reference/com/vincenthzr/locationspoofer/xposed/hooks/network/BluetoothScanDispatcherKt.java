package com.vincenthzr.locationspoofer.xposed.hooks.network;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt;
import com.vincenthzr.locationspoofer.xposed.utils.CallScope;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.a6;
import defpackage.am1;
import defpackage.az;
import defpackage.az2;
import defpackage.d0;
import defpackage.hg;
import defpackage.mf3;
import defpackage.o51;
import defpackage.od2;
import defpackage.p91;
import defpackage.zm3;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BluetoothScanDispatcherKt {
    private static final CallScope<Boolean> syntheticBleDelivery = new CallScope<>();

    public static final void deliverBleScanResults(final LocationHooker locationHooker, JSONObject jSONObject, final Object obj, ClassLoader classLoader) {
        JSONArray jSONArrayOptJSONArray;
        int i;
        Object objCallStaticMethod;
        JSONObject jSONObject2 = jSONObject;
        ClassLoader classLoader2 = classLoader;
        locationHooker.getClass();
        jSONObject2.getClass();
        obj.getClass();
        classLoader2.getClass();
        Handler handler = new Handler(Looper.getMainLooper());
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.bluetooth.le.ScanRecord", classLoader2);
        if (!jSONObject2.optBoolean("mock_bluetooth", true) || (jSONArrayOptJSONArray = jSONObject2.optJSONArray("bluetooth_json")) == null || jSONArrayOptJSONArray.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Class<?> clsFindClassIfExists2 = xposedHelpers.findClassIfExists("android.bluetooth.le.ScanRecord", classLoader2);
        Class<?> cls = clsFindClassIfExists2 == null ? clsFindClassIfExists : clsFindClassIfExists2;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int length = jSONArrayOptJSONArray.length();
        int i2 = 0;
        while (i2 < length) {
            try {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                final String strOptString = jSONObject3.optString("address", "00:11:22:33:44:55");
                String strOptString2 = jSONObject3.optString("name", "");
                int i3 = i2;
                try {
                    final int iOptInt = jSONObject3.optInt("rssi", -60) + (jSONObject2.optBoolean("enable_jitter", true) ? od2.e.d(-2, 3) : 0);
                    String strOptString3 = jSONObject3.optString("scanRecordHex", "");
                    strOptString2.getClass();
                    strOptString3.getClass();
                    strOptString.getClass();
                    final byte[] bArrBuildScanRecordBytes = BluetoothScanRecordBuilderKt.buildScanRecordBytes(strOptString2, strOptString3, strOptString);
                    Object objCreateBluetoothDevice = BluetoothScanRecordBuilderKt.createBluetoothDevice(classLoader2, strOptString);
                    if (objCreateBluetoothDevice == null) {
                        XposedBridge.INSTANCE.log("[LocationSpoofer] 创建虚拟蓝牙设备失败 address=" + strOptString);
                        i = i3;
                    } else {
                        if (cls == null || bArrBuildScanRecordBytes.length == 0) {
                            objCallStaticMethod = null;
                        } else {
                            try {
                                objCallStaticMethod = XposedHelpers.INSTANCE.callStaticMethod(cls, "parseFromBytes", bArrBuildScanRecordBytes);
                            } catch (Throwable th) {
                                XposedBridge.INSTANCE.log("[LocationSpoofer] ScanRecord.parseFromBytes 异常: " + th);
                                objCallStaticMethod = null;
                            }
                        }
                        i = i3;
                        try {
                            final Object objCreateScanResult = BluetoothScanRecordBuilderKt.createScanResult(classLoader2, objCreateBluetoothDevice, objCallStaticMethod, iOptInt, jElapsedRealtimeNanos);
                            if (objCreateScanResult != null) {
                                arrayList.add(objCreateScanResult);
                                handler.post(new Runnable() { // from class: wr
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BluetoothScanDispatcherKt.deliverBleScanResults$lambda$39(obj, strOptString, iOptInt, bArrBuildScanRecordBytes, locationHooker, objCreateScanResult);
                                    }
                                });
                            } else {
                                XposedBridge.INSTANCE.log("[LocationSpoofer] 创建 ScanResult 失败 address=" + strOptString);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            XposedBridge.INSTANCE.log("[LocationSpoofer] 构造虚拟BLE失败: " + th);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = i3;
                }
            } catch (Throwable th4) {
                th = th4;
                i = i2;
            }
            i2 = i + 1;
            jSONObject2 = jSONObject;
            classLoader2 = classLoader;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        handler.post(new hg(locationHooker, obj, arrayList, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deliverBleScanResults$lambda$39(Object obj, String str, int i, byte[] bArr, LocationHooker locationHooker, Object obj2) {
        try {
            syntheticBleDelivery.withValue(Boolean.TRUE, new a6(locationHooker, obj, obj2, 2));
            XposedBridge.INSTANCE.log("[LocationSpoofer] 成功派发 onScanResult 给 " + obj.getClass().getName() + " | MAC=" + str + " RSSI=" + i + " 广播包长=" + bArr.length);
        } catch (Throwable th) {
            XposedBridge.INSTANCE.log("[LocationSpoofer] 派发 onScanResult 异常: " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deliverBleScanResults$lambda$39$lambda$38(LocationHooker locationHooker, Object obj, Object obj2) {
        dispatchScanResultToCallback(locationHooker, obj, obj2);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deliverBleScanResults$lambda$41(LocationHooker locationHooker, Object obj, ArrayList arrayList) {
        try {
            syntheticBleDelivery.withValue(Boolean.TRUE, new a6(locationHooker, obj, arrayList, 3));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 deliverBleScanResults$lambda$41$lambda$40(LocationHooker locationHooker, Object obj, ArrayList arrayList) {
        dispatchBatchResultsToCallback(locationHooker, obj, arrayList);
        return mf3.a;
    }

    public static final void deliverOldLeScanResults(LocationHooker locationHooker, JSONObject jSONObject, final Object obj, ClassLoader classLoader) {
        JSONArray jSONArrayOptJSONArray;
        locationHooker.getClass();
        jSONObject.getClass();
        obj.getClass();
        classLoader.getClass();
        Handler handler = new Handler(Looper.getMainLooper());
        if (!jSONObject.optBoolean("mock_bluetooth", true) || (jSONArrayOptJSONArray = jSONObject.optJSONArray("bluetooth_json")) == null || jSONArrayOptJSONArray.length() == 0) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                String strOptString = jSONObject2.optString("address", "00:11:22:33:44:55");
                String strOptString2 = jSONObject2.optString("name", "");
                final int iOptInt = jSONObject2.optInt("rssi", -60) + (jSONObject.optBoolean("enable_jitter", true) ? od2.e.d(-2, 3) : 0);
                String strOptString3 = jSONObject2.optString("scanRecordHex", "");
                strOptString2.getClass();
                strOptString3.getClass();
                strOptString.getClass();
                final byte[] bArrBuildScanRecordBytes = BluetoothScanRecordBuilderKt.buildScanRecordBytes(strOptString2, strOptString3, strOptString);
                try {
                    final Object objCreateBluetoothDevice = BluetoothScanRecordBuilderKt.createBluetoothDevice(classLoader, strOptString);
                    if (objCreateBluetoothDevice != null) {
                        try {
                            handler.post(new Runnable() { // from class: vr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BluetoothScanDispatcherKt.deliverOldLeScanResults$lambda$42(obj, objCreateBluetoothDevice, iOptInt, bArrBuildScanRecordBytes);
                                }
                            });
                        } catch (Throwable th) {
                            th = th;
                            XposedBridge.INSTANCE.log("[LocationSpoofer] 构造旧版LeScan失败: " + th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deliverOldLeScanResults$lambda$42(Object obj, Object obj2, int i, byte[] bArr) {
        try {
            XposedHelpers.INSTANCE.callMethod(obj, "onLeScan", obj2, Integer.valueOf(i), bArr);
        } catch (Throwable unused) {
        }
    }

    public static final void dispatchBatchResultsToCallback(LocationHooker locationHooker, Object obj, List<? extends Object> list) {
        locationHooker.getClass();
        obj.getClass();
        list.getClass();
        boolean z = false;
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            d0 d0VarY = zm3.y(superclass.getDeclaredMethods());
            while (d0VarY.hasNext()) {
                Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "onBatchScanResults") && method.getParameterCount() == 1) {
                    try {
                        method.setAccessible(true);
                        method.invoke(obj, list);
                        z = true;
                        break;
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
            if (z) {
                break;
            }
        }
        if (z) {
            return;
        }
        try {
            XposedHelpers.INSTANCE.callMethod(obj, "onBatchScanResults", list);
        } catch (Throwable unused2) {
        }
    }

    public static final void dispatchScanResultToCallback(LocationHooker locationHooker, Object obj, Object obj2) {
        boolean z = true;
        locationHooker.getClass();
        obj.getClass();
        obj2.getClass();
        boolean z2 = false;
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            d0 d0VarY = zm3.y(superclass.getDeclaredMethods());
            while (d0VarY.hasNext()) {
                Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "onScanResult")) {
                    if (method.getParameterCount() == 2) {
                        try {
                            method.setAccessible(true);
                            method.invoke(obj, 1, obj2);
                        } catch (Throwable th) {
                            th = th;
                            XposedBridge xposedBridge = XposedBridge.INSTANCE;
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                th = cause;
                            }
                            xposedBridge.log("[LocationSpoofer] dispatch onScanResult (2-args) direct error: " + th);
                        }
                    } else if (method.getParameterCount() == 1) {
                        try {
                            method.setAccessible(true);
                            method.invoke(obj, obj2);
                        } catch (Throwable th2) {
                            th = th2;
                            XposedBridge xposedBridge2 = XposedBridge.INSTANCE;
                            Throwable cause2 = th.getCause();
                            if (cause2 != null) {
                                th = cause2;
                            }
                            xposedBridge2.log("[LocationSpoofer] dispatch onScanResult (1-arg) direct error: " + th);
                        }
                    } else {
                        continue;
                    }
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                break;
            }
        }
        if (z2) {
            z = z2;
        } else {
            try {
                try {
                    XposedHelpers.INSTANCE.callMethod(obj, "onScanResult", 1, obj2);
                } catch (Throwable unused) {
                    z = z2;
                }
            } catch (Throwable unused2) {
                XposedHelpers.INSTANCE.callMethod(obj, "onScanResult", obj2);
            }
        }
        if (z) {
            return;
        }
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Object objectField = xposedHelpers.getObjectField(obj, "mScanCallback");
            if (objectField == null) {
                objectField = xposedHelpers.getObjectField(obj, "mCallback");
            }
            if (objectField != null) {
                dispatchScanResultToCallback(locationHooker, objectField, obj2);
            }
        } catch (Throwable unused3) {
        }
    }

    public static final CallScope<Boolean> getSyntheticBleDelivery() {
        return syntheticBleDelivery;
    }

    public static final void hookBluetoothLE(final LocationHooker locationHooker, final ClassLoader classLoader, boolean z) {
        Class<?> cls;
        String[] strArr;
        String[] strArr2;
        Class<?> cls2;
        locationHooker.getClass();
        classLoader.getClass();
        if (z) {
            XposedBridge.INSTANCE.log("[LocationSpoofer] Skipping Bluetooth LE hooks in core system process");
            return;
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.bluetooth.le.ScanRecord", classLoader);
        final Class<?> clsFindClassIfExists2 = xposedHelpers.findClassIfExists("android.bluetooth.le.BluetoothLeScanner", classLoader);
        if (clsFindClassIfExists2 != null) {
            String[] strArr3 = {"startScan", "startScanFromSource"};
            int i = 0;
            for (int i2 = 2; i < i2; i2 = 2) {
                final String str = strArr3[i];
                try {
                    XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    d0 d0VarY = zm3.y(clsFindClassIfExists2.getDeclaredMethods());
                    int i3 = 0;
                    while (d0VarY.hasNext()) {
                        final Method method = (Method) d0VarY.next();
                        if (!o51.f(method.getName(), str) || Modifier.isAbstract(method.getModifiers())) {
                            cls2 = clsFindClassIfExists;
                        } else {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept = xposedHelpers2.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$1
                                    public Object intercept(XposedInterface.Chain chain) {
                                        Object objPrevious;
                                        chain.getClass();
                                        Method method2 = method;
                                        method2.getClass();
                                        XposedBridge xposedBridge = XposedBridge.INSTANCE;
                                        String str2 = str;
                                        List args = chain.getArgs();
                                        args.getClass();
                                        ArrayList arrayList2 = new ArrayList(az.Y(args, 10));
                                        Iterator it = args.iterator();
                                        while (true) {
                                            String simpleName = null;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (next != null) {
                                                simpleName = next.getClass().getSimpleName();
                                            }
                                            arrayList2.add(simpleName);
                                        }
                                        xposedBridge.log("[LocationSpoofer] 捕获到 BluetoothLeScanner." + str2 + ": args=" + arrayList2);
                                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                            XposedBridge.INSTANCE.log("[LocationSpoofer] BluetoothLeScanner." + str + " 放行原生系统 (active/mock_bt 为 false)");
                                            List args2 = chain.getArgs();
                                            args2.getClass();
                                            return chain.proceed(args2.toArray(new Object[0]));
                                        }
                                        List args3 = chain.getArgs();
                                        args3.getClass();
                                        Iterator it2 = args3.iterator();
                                        do {
                                            if (!it2.hasNext()) {
                                                objPrevious = null;
                                                break;
                                            }
                                            objPrevious = it2.next();
                                        } while (!BluetoothScanRecordBuilderKt.isScanCallback(objPrevious));
                                        if (objPrevious == null) {
                                            List args4 = chain.getArgs();
                                            args4.getClass();
                                            ListIterator listIterator = args4.listIterator(args4.size());
                                            while (true) {
                                                if (!listIterator.hasPrevious()) {
                                                    objPrevious = null;
                                                    break;
                                                }
                                                objPrevious = listIterator.previous();
                                                if (objPrevious != null && !(objPrevious instanceof List) && !(objPrevious instanceof Collection) && !p91.z(objPrevious, "ScanFilter", false) && !p91.z(objPrevious, "ScanSettings", false) && !p91.z(objPrevious, "PendingIntent", false) && !p91.z(objPrevious, "WorkSource", false)) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (objPrevious != null) {
                                            XposedBridge.INSTANCE.log(az2.l("[LocationSpoofer] 成功拦截 ", str, ", 目标回调=", objPrevious.getClass().getName(), ", 启动心跳分发"));
                                            BluetoothScanDispatcherKt.startBleTimer(locationHooker, objPrevious, classLoader);
                                        } else {
                                            XposedBridge xposedBridge2 = XposedBridge.INSTANCE;
                                            String str3 = str;
                                            List args5 = chain.getArgs();
                                            args5.getClass();
                                            ArrayList arrayList3 = new ArrayList(az.Y(args5, 10));
                                            Iterator it3 = args5.iterator();
                                            while (it3.hasNext()) {
                                                Object next2 = it3.next();
                                                arrayList3.add(next2 != null ? next2.getClass().getName() : null);
                                            }
                                            xposedBridge2.log("[LocationSpoofer] " + str3 + " 未找到匹配的 ScanCallback, args=" + arrayList3);
                                        }
                                        return o51.f(method2.getReturnType(), Integer.TYPE) ? 0 : null;
                                    }
                                });
                                hookHandleIntercept.getClass();
                                arrayList.add(hookHandleIntercept);
                                i3++;
                            } catch (Throwable th) {
                                cls2 = clsFindClassIfExists;
                                try {
                                    HookStatus.INSTANCE.error(clsFindClassIfExists2.getName() + "#" + str, th);
                                    clsFindClassIfExists = cls2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    XposedBridge.INSTANCE.log("[LocationSpoofer] Hook BluetoothLeScanner." + str + " 异常: " + th);
                                    i++;
                                    clsFindClassIfExists = cls2;
                                }
                            }
                        }
                        clsFindClassIfExists = cls2;
                    }
                    cls2 = clsFindClassIfExists;
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists2.getName(), str, i3);
                } catch (Throwable th3) {
                    th = th3;
                    cls2 = clsFindClassIfExists;
                }
                i++;
                clsFindClassIfExists = cls2;
            }
            cls = clsFindClassIfExists;
            try {
                XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarY2 = zm3.y(clsFindClassIfExists2.getDeclaredMethods());
                int i4 = 0;
                while (d0VarY2.hasNext()) {
                    final Method method2 = (Method) d0VarY2.next();
                    if (o51.f(method2.getName(), "stopScan") && !Modifier.isAbstract(method2.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers3.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$2
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object obj;
                                    Object next;
                                    chain.getClass();
                                    method2.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Iterator it = args.iterator();
                                    do {
                                        obj = null;
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!BluetoothScanRecordBuilderKt.isScanCallback(next));
                                    if (next == null) {
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        ListIterator listIterator = args2.listIterator(args2.size());
                                        while (listIterator.hasPrevious()) {
                                            Object objPrevious = listIterator.previous();
                                            if (objPrevious != null && !(objPrevious instanceof List) && !p91.z(objPrevious, "PendingIntent", false)) {
                                                obj = objPrevious;
                                                break;
                                            }
                                        }
                                    } else {
                                        obj = next;
                                    }
                                    if (obj != null) {
                                        BluetoothScanDispatcherKt.stopBleTimer(locationHooker, obj);
                                    }
                                    List args3 = chain.getArgs();
                                    args3.getClass();
                                    return chain.proceed(args3.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept2.getClass();
                            arrayList2.add(hookHandleIntercept2);
                            i4++;
                        } catch (Throwable th4) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists2.getName() + "#stopScan", th4);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists2.getName(), "stopScan", i4);
            } catch (Throwable unused) {
            }
        } else {
            cls = clsFindClassIfExists;
        }
        XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists3 = xposedHelpers4.findClassIfExists("android.bluetooth.BluetoothAdapter", classLoader);
        if (clsFindClassIfExists3 != null) {
            ArrayList arrayList3 = new ArrayList();
            d0 d0VarY3 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
            int i5 = 0;
            while (d0VarY3.hasNext()) {
                final Method method3 = (Method) d0VarY3.next();
                if (o51.f(method3.getName(), "startLeScan") && !Modifier.isAbstract(method3.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers4.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$3
                            public Object intercept(XposedInterface.Chain chain) {
                                Object simpleName;
                                Object next;
                                chain.getClass();
                                method3.getClass();
                                XposedBridge xposedBridge = XposedBridge.INSTANCE;
                                List args = chain.getArgs();
                                args.getClass();
                                ArrayList arrayList4 = new ArrayList(az.Y(args, 10));
                                Iterator it = args.iterator();
                                while (true) {
                                    simpleName = null;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next2 = it.next();
                                    if (next2 != null) {
                                        simpleName = next2.getClass().getSimpleName();
                                    }
                                    arrayList4.add(simpleName);
                                }
                                xposedBridge.log("[LocationSpoofer] 捕获到 BluetoothAdapter.startLeScan: args=" + arrayList4);
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                                List args3 = chain.getArgs();
                                args3.getClass();
                                Iterator it2 = args3.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!BluetoothScanRecordBuilderKt.isLeScanCallback(next));
                                if (next == null) {
                                    List args4 = chain.getArgs();
                                    args4.getClass();
                                    ListIterator listIterator = args4.listIterator(args4.size());
                                    while (listIterator.hasPrevious()) {
                                        Object objPrevious = listIterator.previous();
                                        if (objPrevious != null && !(objPrevious instanceof Object[])) {
                                            simpleName = objPrevious;
                                            break;
                                        }
                                    }
                                } else {
                                    simpleName = next;
                                }
                                if (simpleName != null) {
                                    XposedBridge.INSTANCE.log("[LocationSpoofer] 成功拦截 startLeScan, 目标回调=".concat(simpleName.getClass().getName()));
                                    BluetoothScanDispatcherKt.startOldLeScanTimer(locationHooker, simpleName, classLoader);
                                }
                                return Boolean.TRUE;
                            }
                        });
                        hookHandleIntercept3.getClass();
                        arrayList3.add(hookHandleIntercept3);
                        i5++;
                    } catch (Throwable th5) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#startLeScan", th5);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "startLeScan", i5);
            try {
                XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                ArrayList arrayList4 = new ArrayList();
                d0 d0VarY4 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i6 = 0;
                while (d0VarY4.hasNext()) {
                    final Method method4 = (Method) d0VarY4.next();
                    if (o51.f(method4.getName(), "stopLeScan") && !Modifier.isAbstract(method4.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers5.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$4
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object obj;
                                    Object objPrevious;
                                    chain.getClass();
                                    method4.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Iterator it = args.iterator();
                                    do {
                                        obj = null;
                                        if (!it.hasNext()) {
                                            objPrevious = null;
                                            break;
                                        }
                                        objPrevious = it.next();
                                    } while (!BluetoothScanRecordBuilderKt.isLeScanCallback(objPrevious));
                                    if (objPrevious != null) {
                                        obj = objPrevious;
                                        break;
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    ListIterator listIterator = args2.listIterator(args2.size());
                                    while (listIterator.hasPrevious()) {
                                        objPrevious = listIterator.previous();
                                        if (objPrevious != null && !(objPrevious instanceof Object[])) {
                                            obj = objPrevious;
                                            break;
                                        }
                                    }
                                    if (obj != null) {
                                        BluetoothScanDispatcherKt.stopBleTimer(locationHooker, obj);
                                    }
                                    List args3 = chain.getArgs();
                                    args3.getClass();
                                    return chain.proceed(args3.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept4.getClass();
                            arrayList4.add(hookHandleIntercept4);
                            i6++;
                        } catch (Throwable th6) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#stopLeScan", th6);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "stopLeScan", i6);
            } catch (Throwable unused2) {
            }
            try {
                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                ArrayList arrayList5 = new ArrayList();
                d0 d0VarY5 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i7 = 0;
                while (d0VarY5.hasNext()) {
                    final Method method5 = (Method) d0VarY5.next();
                    if (o51.f(method5.getName(), "getRemoteDevice") && !Modifier.isAbstract(method5.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept5 = xposedHelpers6.getModule().hook(method5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$5
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    Object objCreateBluetoothDevice;
                                    chain.getClass();
                                    method5.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    if (objProceed != null) {
                                        return objProceed;
                                    }
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        Iterator it = args2.iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!(next instanceof String));
                                        String str2 = next instanceof String ? (String) next : null;
                                        if (str2 != null && (objCreateBluetoothDevice = BluetoothScanRecordBuilderKt.createBluetoothDevice(classLoader, str2)) != null) {
                                            return objCreateBluetoothDevice;
                                        }
                                    }
                                    return null;
                                }
                            });
                            hookHandleIntercept5.getClass();
                            arrayList5.add(hookHandleIntercept5);
                            i7++;
                        } catch (Throwable th7) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#getRemoteDevice", th7);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "getRemoteDevice", i7);
            } catch (Throwable unused3) {
            }
            String[] strArr4 = {"isEnabled", "isLeEnabled", "getLeAccess", "isOffloadedFilteringSupported", "isOffloadedScanBatchingSupported", "isMultipleAdvertisementSupported", "isLe2MPhySupported", "isLeCodedPhySupported", "isLeExtendedAdvertisingSupported", "isLePeriodicAdvertisingSupported"};
            int i8 = 0;
            while (i8 < 10) {
                String str2 = strArr4[i8];
                try {
                    XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                    ArrayList arrayList6 = new ArrayList();
                    d0 d0VarY6 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                    int i9 = 0;
                    while (d0VarY6.hasNext()) {
                        final Method method6 = (Method) d0VarY6.next();
                        if (!o51.f(method6.getName(), str2) || Modifier.isAbstract(method6.getModifiers())) {
                            strArr2 = strArr4;
                            strArr4 = strArr2;
                        } else {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept6 = xposedHelpers7.getModule().hook(method6).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$6
                                    public Object intercept(XposedInterface.Chain chain) {
                                        chain.getClass();
                                        method6.getClass();
                                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                            return Boolean.TRUE;
                                        }
                                        List args = chain.getArgs();
                                        args.getClass();
                                        return chain.proceed(args.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept6.getClass();
                                arrayList6.add(hookHandleIntercept6);
                                i9++;
                            } catch (Throwable th8) {
                                strArr2 = strArr4;
                                try {
                                    HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#" + str2, th8);
                                    strArr4 = strArr2;
                                } catch (Throwable unused4) {
                                }
                            }
                        }
                    }
                    strArr2 = strArr4;
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), str2, i9);
                } catch (Throwable unused5) {
                    strArr2 = strArr4;
                }
                i8++;
                strArr4 = strArr2;
            }
            String[] strArr5 = {"getState", "getLeState"};
            int i10 = 0;
            while (i10 < 2) {
                String str3 = strArr5[i10];
                try {
                    XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                    ArrayList arrayList7 = new ArrayList();
                    d0 d0VarY7 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                    int i11 = 0;
                    while (d0VarY7.hasNext()) {
                        final Method method7 = (Method) d0VarY7.next();
                        if (!o51.f(method7.getName(), str3) || Modifier.isAbstract(method7.getModifiers())) {
                            strArr = strArr5;
                        } else {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept7 = xposedHelpers8.getModule().hook(method7).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$7
                                    public Object intercept(XposedInterface.Chain chain) {
                                        chain.getClass();
                                        method7.getClass();
                                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                            return 12;
                                        }
                                        List args = chain.getArgs();
                                        args.getClass();
                                        return chain.proceed(args.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept7.getClass();
                                arrayList7.add(hookHandleIntercept7);
                                i11++;
                            } catch (Throwable th9) {
                                strArr = strArr5;
                                try {
                                    HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#" + str3, th9);
                                    strArr5 = strArr;
                                } catch (Throwable unused6) {
                                }
                            }
                        }
                        strArr5 = strArr;
                    }
                    strArr = strArr5;
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), str3, i11);
                } catch (Throwable unused7) {
                    strArr = strArr5;
                }
                i10++;
                strArr5 = strArr;
            }
            try {
                XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
                ArrayList arrayList8 = new ArrayList();
                d0 d0VarY8 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i12 = 0;
                while (d0VarY8.hasNext()) {
                    final Method method8 = (Method) d0VarY8.next();
                    if (o51.f(method8.getName(), "getBluetoothLeScanner") && !Modifier.isAbstract(method8.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept8 = xposedHelpers9.getModule().hook(method8).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$8
                                public Object intercept(XposedInterface.Chain chain) {
                                    Class cls3;
                                    chain.getClass();
                                    method8.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (objProceed != null || config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                        return objProceed;
                                    }
                                    Object thisObject = chain.getThisObject();
                                    try {
                                        XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
                                        thisObject.getClass();
                                        Object objectField = xposedHelpers10.getObjectField(thisObject, "mBluetoothLeScanner");
                                        if (objectField == null && (cls3 = clsFindClassIfExists2) != null) {
                                            d0 d0VarY9 = zm3.y(cls3.getDeclaredConstructors());
                                            while (d0VarY9.hasNext()) {
                                                Constructor constructor = (Constructor) d0VarY9.next();
                                                try {
                                                    constructor.setAccessible(true);
                                                    int parameterCount = constructor.getParameterCount();
                                                    objectField = constructor.newInstance(Arrays.copyOf(new Object[parameterCount], parameterCount));
                                                    if (objectField != null) {
                                                        break;
                                                    }
                                                } catch (Throwable unused8) {
                                                }
                                            }
                                            if (objectField != null) {
                                                try {
                                                    XposedHelpers.INSTANCE.setObjectField(thisObject, "mBluetoothLeScanner", objectField);
                                                } catch (Throwable unused9) {
                                                }
                                            }
                                        }
                                        return objectField == null ? objProceed : objectField;
                                    } catch (Throwable unused10) {
                                        return objProceed;
                                    }
                                }
                            });
                            hookHandleIntercept8.getClass();
                            arrayList8.add(hookHandleIntercept8);
                            i12++;
                        } catch (Throwable th10) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#getBluetoothLeScanner", th10);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "getBluetoothLeScanner", i12);
            } catch (Throwable unused8) {
            }
            XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
            ArrayList arrayList9 = new ArrayList();
            d0 d0VarY9 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
            int i13 = 0;
            while (d0VarY9.hasNext()) {
                final Method method9 = (Method) d0VarY9.next();
                if (o51.f(method9.getName(), "getBondedDevices") && !Modifier.isAbstract(method9.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept9 = xposedHelpers10.getModule().hook(method9).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$9
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method9.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease == null) {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                                if (!config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                                HashSet hashSet = new HashSet();
                                try {
                                    JSONArray jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json");
                                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                        int length = jSONArrayOptJSONArray.length();
                                        for (int i14 = 0; i14 < length; i14++) {
                                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i14);
                                            if (jSONObject.optBoolean("isConnected", false)) {
                                                String strOptString = jSONObject.optString("address", "00:00:00:00:00:00");
                                                ClassLoader classLoader2 = classLoader;
                                                strOptString.getClass();
                                                Object objCreateBluetoothDevice = BluetoothScanRecordBuilderKt.createBluetoothDevice(classLoader2, strOptString);
                                                if (objCreateBluetoothDevice != null) {
                                                    hashSet.add(objCreateBluetoothDevice);
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable unused9) {
                                }
                                return hashSet;
                            }
                        });
                        hookHandleIntercept9.getClass();
                        arrayList9.add(hookHandleIntercept9);
                        i13++;
                    } catch (Throwable th11) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#getBondedDevices", th11);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "getBondedDevices", i13);
            try {
                XposedHelpers xposedHelpers11 = XposedHelpers.INSTANCE;
                ArrayList arrayList10 = new ArrayList();
                d0 d0VarY10 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i14 = 0;
                while (d0VarY10.hasNext()) {
                    final Method method10 = (Method) d0VarY10.next();
                    if (o51.f(method10.getName(), "startDiscovery") && !Modifier.isAbstract(method10.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept10 = xposedHelpers11.getModule().hook(method10).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$10
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method10.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease == null) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        return chain.proceed(args.toArray(new Object[0]));
                                    }
                                    if (!config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        return chain.proceed(args2.toArray(new Object[0]));
                                    }
                                    JSONArray jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json");
                                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                        try {
                                            XposedHelpers xposedHelpers12 = XposedHelpers.INSTANCE;
                                            Class<?> clsFindClassIfExists4 = xposedHelpers12.findClassIfExists("android.app.ActivityThread", classLoader);
                                            final Context context = null;
                                            if (clsFindClassIfExists4 != null) {
                                                Object objCallStaticMethod = xposedHelpers12.callStaticMethod(clsFindClassIfExists4, "currentApplication", new Object[0]);
                                                if (objCallStaticMethod instanceof Context) {
                                                    context = (Context) objCallStaticMethod;
                                                }
                                            }
                                            if (context != null) {
                                                handler.postDelayed(new Runnable() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$18$1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        try {
                                                            context.sendBroadcast(new Intent("android.bluetooth.adapter.action.DISCOVERY_STARTED"));
                                                        } catch (Throwable unused9) {
                                                        }
                                                    }
                                                }, 50L);
                                                int length = jSONArrayOptJSONArray.length();
                                                for (int i15 = 0; i15 < length; i15++) {
                                                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i15);
                                                    String strOptString = jSONObject.optString("address", "00:11:22:33:44:55");
                                                    final String strOptString2 = jSONObject.optString("name", "");
                                                    final int iOptInt = jSONObject.optInt("rssi", -60);
                                                    ClassLoader classLoader2 = classLoader;
                                                    strOptString.getClass();
                                                    final Object objCreateBluetoothDevice = BluetoothScanRecordBuilderKt.createBluetoothDevice(classLoader2, strOptString);
                                                    if (objCreateBluetoothDevice != null) {
                                                        handler.postDelayed(new Runnable() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$18$2
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                try {
                                                                    Intent intent = new Intent("android.bluetooth.device.action.FOUND");
                                                                    Object obj = objCreateBluetoothDevice;
                                                                    String str4 = strOptString2;
                                                                    int i16 = iOptInt;
                                                                    obj.getClass();
                                                                    intent.putExtra("android.bluetooth.device.extra.DEVICE", (Parcelable) obj);
                                                                    intent.putExtra("android.bluetooth.device.extra.NAME", str4);
                                                                    intent.putExtra("android.bluetooth.device.extra.RSSI", (short) i16);
                                                                    context.sendBroadcast(intent);
                                                                } catch (Throwable unused9) {
                                                                }
                                                            }
                                                        }, (i15 * 150) + 100);
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused9) {
                                        }
                                    }
                                    return Boolean.TRUE;
                                }
                            });
                            hookHandleIntercept10.getClass();
                            arrayList10.add(hookHandleIntercept10);
                            i14++;
                        } catch (Throwable th12) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#startDiscovery", th12);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "startDiscovery", i14);
            } catch (Throwable unused9) {
            }
        }
        XposedHelpers xposedHelpers12 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists4 = xposedHelpers12.findClassIfExists("android.bluetooth.BluetoothDevice", classLoader);
        if (clsFindClassIfExists4 != null) {
            ArrayList arrayList11 = new ArrayList();
            d0 d0VarY11 = zm3.y(clsFindClassIfExists4.getDeclaredMethods());
            int i15 = 0;
            while (d0VarY11.hasNext()) {
                final Method method11 = (Method) d0VarY11.next();
                if (o51.f(method11.getName(), "getAddress") && !Modifier.isAbstract(method11.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept11 = xposedHelpers12.getModule().hook(method11).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$11
                            public Object intercept(XposedInterface.Chain chain) {
                                JSONObject config$xposed_globalRelease;
                                JSONArray jSONArrayOptJSONArray;
                                chain.getClass();
                                method11.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                String str4 = objProceed instanceof String ? (String) objProceed : null;
                                if ((str4 == null || str4.length() == 0 || o51.f(str4, "00:00:00:00:00:00")) && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && (jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json")) != null && jSONArrayOptJSONArray.length() > 0) {
                                    String strOptString = jSONArrayOptJSONArray.getJSONObject(0).optString("address", "");
                                    strOptString.getClass();
                                    if (strOptString.length() > 0) {
                                        return BluetoothScanRecordBuilderKt.normalizeMacAddress(strOptString);
                                    }
                                }
                                return str4;
                            }
                        });
                        hookHandleIntercept11.getClass();
                        arrayList11.add(hookHandleIntercept11);
                        i15++;
                    } catch (Throwable th13) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists4.getName() + "#getAddress", th13);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists4.getName(), "getAddress", i15);
            XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
            ArrayList arrayList12 = new ArrayList();
            d0 d0VarY12 = zm3.y(clsFindClassIfExists4.getDeclaredMethods());
            int i16 = 0;
            while (d0VarY12.hasNext()) {
                final Method method12 = (Method) d0VarY12.next();
                if (o51.f(method12.getName(), "getName") && !Modifier.isAbstract(method12.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept12 = xposedHelpers13.getModule().hook(method12).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$12
                            public Object intercept(XposedInterface.Chain chain) throws JSONException, NoSuchMethodException {
                                chain.getClass();
                                method12.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                    Object thisObject = chain.getThisObject();
                                    XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                                    thisObject.getClass();
                                    Object objCallMethod = xposedHelpers14.callMethod(thisObject, "getAddress", new Object[0]);
                                    String upperCase = null;
                                    String str4 = objCallMethod instanceof String ? (String) objCallMethod : null;
                                    if (str4 != null) {
                                        upperCase = str4.toUpperCase(Locale.ROOT);
                                        upperCase.getClass();
                                    }
                                    JSONArray jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json");
                                    if (upperCase != null && jSONArrayOptJSONArray != null) {
                                        int length = jSONArrayOptJSONArray.length();
                                        for (int i17 = 0; i17 < length; i17++) {
                                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i17);
                                            String strOptString = jSONObject.optString("address");
                                            strOptString.getClass();
                                            String upperCase2 = strOptString.toUpperCase(Locale.ROOT);
                                            upperCase2.getClass();
                                            if (upperCase2.equals(upperCase)) {
                                                String strOptString2 = jSONObject.optString("name");
                                                strOptString2.getClass();
                                                if (strOptString2.length() > 0) {
                                                    return strOptString2;
                                                }
                                            }
                                        }
                                    }
                                }
                                List args = chain.getArgs();
                                args.getClass();
                                return chain.proceed(args.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept12.getClass();
                        arrayList12.add(hookHandleIntercept12);
                        i16++;
                    } catch (Throwable th14) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists4.getName() + "#getName", th14);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists4.getName(), "getName", i16);
            try {
                XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                ArrayList arrayList13 = new ArrayList();
                d0 d0VarY13 = zm3.y(clsFindClassIfExists4.getDeclaredMethods());
                int i17 = 0;
                while (d0VarY13.hasNext()) {
                    final Method method13 = (Method) d0VarY13.next();
                    if (o51.f(method13.getName(), "getAlias") && !Modifier.isAbstract(method13.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept13 = xposedHelpers14.getModule().hook(method13).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$13
                                public Object intercept(XposedInterface.Chain chain) throws JSONException, NoSuchMethodException {
                                    chain.getClass();
                                    method13.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                        Object thisObject = chain.getThisObject();
                                        XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
                                        thisObject.getClass();
                                        Object objCallMethod = xposedHelpers15.callMethod(thisObject, "getAddress", new Object[0]);
                                        String upperCase = null;
                                        String str4 = objCallMethod instanceof String ? (String) objCallMethod : null;
                                        if (str4 != null) {
                                            upperCase = str4.toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                        }
                                        JSONArray jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json");
                                        if (upperCase != null && jSONArrayOptJSONArray != null) {
                                            int length = jSONArrayOptJSONArray.length();
                                            for (int i18 = 0; i18 < length; i18++) {
                                                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i18);
                                                String strOptString = jSONObject.optString("address");
                                                strOptString.getClass();
                                                String upperCase2 = strOptString.toUpperCase(Locale.ROOT);
                                                upperCase2.getClass();
                                                if (upperCase2.equals(upperCase)) {
                                                    String strOptString2 = jSONObject.optString("name");
                                                    strOptString2.getClass();
                                                    if (strOptString2.length() > 0) {
                                                        return strOptString2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept13.getClass();
                            arrayList13.add(hookHandleIntercept13);
                            i17++;
                        } catch (Throwable th15) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists4.getName() + "#getAlias", th15);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists4.getName(), "getAlias", i17);
            } catch (Throwable unused10) {
            }
            XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
            ArrayList arrayList14 = new ArrayList();
            d0 d0VarY14 = zm3.y(clsFindClassIfExists4.getDeclaredMethods());
            int i18 = 0;
            while (d0VarY14.hasNext()) {
                final Method method14 = (Method) d0VarY14.next();
                if (o51.f(method14.getName(), "getType") && !Modifier.isAbstract(method14.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept14 = xposedHelpers15.getModule().hook(method14).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$14
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method14.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                    return 2;
                                }
                                List args = chain.getArgs();
                                args.getClass();
                                return chain.proceed(args.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept14.getClass();
                        arrayList14.add(hookHandleIntercept14);
                        i18++;
                    } catch (Throwable th16) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists4.getName() + "#getType", th16);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists4.getName(), "getType", i18);
            XposedHelpers xposedHelpers16 = XposedHelpers.INSTANCE;
            ArrayList arrayList15 = new ArrayList();
            d0 d0VarY15 = zm3.y(clsFindClassIfExists4.getDeclaredMethods());
            int i19 = 0;
            while (d0VarY15.hasNext()) {
                final Method method15 = (Method) d0VarY15.next();
                if (o51.f(method15.getName(), "getBondState") && !Modifier.isAbstract(method15.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept15 = xposedHelpers16.getModule().hook(method15).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$15
                            public Object intercept(XposedInterface.Chain chain) throws JSONException, NoSuchMethodException {
                                chain.getClass();
                                method15.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                                Object thisObject = chain.getThisObject();
                                XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
                                thisObject.getClass();
                                Object objCallMethod = xposedHelpers17.callMethod(thisObject, "getAddress", new Object[0]);
                                String upperCase = null;
                                String str4 = objCallMethod instanceof String ? (String) objCallMethod : null;
                                if (str4 != null) {
                                    upperCase = str4.toUpperCase(Locale.ROOT);
                                    upperCase.getClass();
                                }
                                JSONArray jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json");
                                if (upperCase != null && jSONArrayOptJSONArray != null) {
                                    int length = jSONArrayOptJSONArray.length();
                                    for (int i20 = 0; i20 < length; i20++) {
                                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i20);
                                        String strOptString = jSONObject.optString("address");
                                        strOptString.getClass();
                                        String upperCase2 = strOptString.toUpperCase(Locale.ROOT);
                                        upperCase2.getClass();
                                        if (upperCase2.equals(upperCase) && jSONObject.optBoolean("isConnected", false)) {
                                            return 12;
                                        }
                                    }
                                }
                                return 10;
                            }
                        });
                        hookHandleIntercept15.getClass();
                        arrayList15.add(hookHandleIntercept15);
                        i19++;
                    } catch (Throwable th17) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists4.getName() + "#getBondState", th17);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists4.getName(), "getBondState", i19);
            try {
                XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
                ArrayList arrayList16 = new ArrayList();
                d0 d0VarY16 = zm3.y(clsFindClassIfExists4.getDeclaredMethods());
                int i20 = 0;
                while (d0VarY16.hasNext()) {
                    final Method method16 = (Method) d0VarY16.next();
                    if (o51.f(method16.getName(), "getUuids") && !Modifier.isAbstract(method16.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept16 = xposedHelpers17.getModule().hook(method16).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$16
                                public Object intercept(XposedInterface.Chain chain) {
                                    XposedHelpers xposedHelpers18;
                                    Class<?> clsFindClassIfExists5;
                                    chain.getClass();
                                    method16.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && (clsFindClassIfExists5 = (xposedHelpers18 = XposedHelpers.INSTANCE).findClassIfExists("android.os.ParcelUuid", classLoader)) != null) {
                                        try {
                                            Object objCallStaticMethod = xposedHelpers18.callStaticMethod(clsFindClassIfExists5, "fromString", "0000fe3c-0000-1000-8000-00805f9b34fb");
                                            if (objCallStaticMethod != null) {
                                                Object objNewInstance = Array.newInstance(clsFindClassIfExists5, 1);
                                                Array.set(objNewInstance, 0, objCallStaticMethod);
                                                return objNewInstance;
                                            }
                                        } catch (Throwable unused11) {
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept16.getClass();
                            arrayList16.add(hookHandleIntercept16);
                            i20++;
                        } catch (Throwable th18) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists4.getName() + "#getUuids", th18);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists4.getName(), "getUuids", i20);
            } catch (Throwable unused11) {
            }
            try {
                XposedHelpers xposedHelpers18 = XposedHelpers.INSTANCE;
                ArrayList arrayList17 = new ArrayList();
                d0 d0VarY17 = zm3.y(clsFindClassIfExists4.getDeclaredMethods());
                int i21 = 0;
                while (d0VarY17.hasNext()) {
                    final Method method17 = (Method) d0VarY17.next();
                    if (o51.f(method17.getName(), "connectGatt") && !Modifier.isAbstract(method17.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept17 = xposedHelpers18.getModule().hook(method17).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$17
                                public Object intercept(XposedInterface.Chain chain) {
                                    final Object next;
                                    chain.getClass();
                                    method17.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        return chain.proceed(args.toArray(new Object[0]));
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    Iterator it = args2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (next != null && p91.z(next, "GattCallback", false)) {
                                            break;
                                        }
                                    }
                                    List args3 = chain.getArgs();
                                    args3.getClass();
                                    final Object objProceed = chain.proceed(args3.toArray(new Object[0]));
                                    if (next != null && objProceed != null) {
                                        handler.postDelayed(new Runnable() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$32$1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                try {
                                                    XposedHelpers.INSTANCE.callMethod(next, "onConnectionStateChange", objProceed, 0, 2);
                                                } catch (Throwable unused12) {
                                                }
                                            }
                                        }, 200L);
                                    }
                                    return objProceed;
                                }
                            });
                            hookHandleIntercept17.getClass();
                            arrayList17.add(hookHandleIntercept17);
                            i21++;
                        } catch (Throwable th19) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists4.getName() + "#connectGatt", th19);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists4.getName(), "connectGatt", i21);
            } catch (Throwable unused12) {
            }
        }
        if (cls != null) {
            XposedHelpers xposedHelpers19 = XposedHelpers.INSTANCE;
            ArrayList arrayList18 = new ArrayList();
            d0 d0VarY18 = zm3.y(cls.getDeclaredMethods());
            int i22 = 0;
            while (d0VarY18.hasNext()) {
                final Method method18 = (Method) d0VarY18.next();
                if (o51.f(method18.getName(), "getDeviceName") && !Modifier.isAbstract(method18.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept18 = xposedHelpers19.getModule().hook(method18).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$18
                            public Object intercept(XposedInterface.Chain chain) {
                                JSONArray jSONArrayOptJSONArray;
                                chain.getClass();
                                method18.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                if (objProceed != null) {
                                    String str4 = objProceed instanceof String ? (String) objProceed : null;
                                    if (str4 != null && str4.length() > 0) {
                                        return objProceed;
                                    }
                                }
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && (jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json")) != null && jSONArrayOptJSONArray.length() > 0) {
                                    String strOptString = jSONArrayOptJSONArray.getJSONObject(0).optString("name", "");
                                    strOptString.getClass();
                                    if (strOptString.length() > 0) {
                                        return strOptString;
                                    }
                                }
                                return objProceed;
                            }
                        });
                        hookHandleIntercept18.getClass();
                        arrayList18.add(hookHandleIntercept18);
                        i22++;
                    } catch (Throwable th20) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getDeviceName", th20);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getDeviceName", i22);
            XposedHelpers xposedHelpers20 = XposedHelpers.INSTANCE;
            ArrayList arrayList19 = new ArrayList();
            d0 d0VarY19 = zm3.y(cls.getDeclaredMethods());
            int i23 = 0;
            while (d0VarY19.hasNext()) {
                final Method method19 = (Method) d0VarY19.next();
                if (o51.f(method19.getName(), "getServiceUuids") && !Modifier.isAbstract(method19.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept19 = xposedHelpers20.getModule().hook(method19).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$19
                            public Object intercept(XposedInterface.Chain chain) {
                                JSONObject config$xposed_globalRelease;
                                XposedHelpers xposedHelpers21;
                                Class<?> clsFindClassIfExists5;
                                chain.getClass();
                                method19.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                List list = objProceed instanceof List ? (List) objProceed : null;
                                if ((list == null || list.isEmpty()) && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && (clsFindClassIfExists5 = (xposedHelpers21 = XposedHelpers.INSTANCE).findClassIfExists("android.os.ParcelUuid", classLoader)) != null) {
                                    try {
                                        Object objCallStaticMethod = xposedHelpers21.callStaticMethod(clsFindClassIfExists5, "fromString", "0000fe3c-0000-1000-8000-00805f9b34fb");
                                        if (objCallStaticMethod != null) {
                                            return am1.F(objCallStaticMethod);
                                        }
                                    } catch (Throwable unused13) {
                                    }
                                }
                                return list;
                            }
                        });
                        hookHandleIntercept19.getClass();
                        arrayList19.add(hookHandleIntercept19);
                        i23++;
                    } catch (Throwable th21) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getServiceUuids", th21);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getServiceUuids", i23);
            try {
                XposedHelpers xposedHelpers21 = XposedHelpers.INSTANCE;
                ArrayList arrayList20 = new ArrayList();
                d0 d0VarY20 = zm3.y(cls.getDeclaredMethods());
                int i24 = 0;
                while (d0VarY20.hasNext()) {
                    final Method method20 = (Method) d0VarY20.next();
                    if (o51.f(method20.getName(), "getManufacturerSpecificData") && !Modifier.isAbstract(method20.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept20 = xposedHelpers21.getModule().hook(method20).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$20
                                public Object intercept(XposedInterface.Chain chain) {
                                    JSONArray jSONArrayOptJSONArray;
                                    chain.getClass();
                                    method20.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && (jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json")) != null && jSONArrayOptJSONArray.length() > 0) {
                                        String strOptString = jSONArrayOptJSONArray.getJSONObject(0).optString("scanRecordHex", jSONArrayOptJSONArray.getJSONObject(0).optString("rawBytes", ""));
                                        strOptString.getClass();
                                        byte[] bArrHexStringToByteArray = strOptString.length() > 0 ? BluetoothScanRecordBuilderKt.hexStringToByteArray(strOptString) : new byte[0];
                                        if (!(bArrHexStringToByteArray.length == 0)) {
                                            if (!chain.getArgs().isEmpty()) {
                                                return bArrHexStringToByteArray;
                                            }
                                            SparseArray sparseArray = new SparseArray();
                                            sparseArray.put(256, bArrHexStringToByteArray);
                                            sparseArray.put(1, bArrHexStringToByteArray);
                                            sparseArray.put(256, bArrHexStringToByteArray);
                                            sparseArray.put(1, bArrHexStringToByteArray);
                                            sparseArray.put(0, bArrHexStringToByteArray);
                                            return sparseArray;
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept20.getClass();
                            arrayList20.add(hookHandleIntercept20);
                            i24++;
                        } catch (Throwable th22) {
                            HookStatus.INSTANCE.error(cls.getName() + "#getManufacturerSpecificData", th22);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), "getManufacturerSpecificData", i24);
            } catch (Throwable unused13) {
            }
            try {
                XposedHelpers xposedHelpers22 = XposedHelpers.INSTANCE;
                ArrayList arrayList21 = new ArrayList();
                d0 d0VarY21 = zm3.y(cls.getDeclaredMethods());
                int i25 = 0;
                while (d0VarY21.hasNext()) {
                    final Method method21 = (Method) d0VarY21.next();
                    if (o51.f(method21.getName(), "getBytes") && !Modifier.isAbstract(method21.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept21 = xposedHelpers22.getModule().hook(method21).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$21
                                public Object intercept(XposedInterface.Chain chain) throws JSONException {
                                    JSONArray jSONArrayOptJSONArray;
                                    chain.getClass();
                                    method21.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        if (config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && (jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json")) != null && jSONArrayOptJSONArray.length() > 0) {
                                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(0);
                                            String strOptString = jSONObject.optString("scanRecordHex", jSONObject.optString("rawBytes", ""));
                                            String strOptString2 = jSONObject.optString("name", "");
                                            String strOptString3 = jSONObject.optString("address", "");
                                            strOptString2.getClass();
                                            strOptString.getClass();
                                            strOptString3.getClass();
                                            byte[] bArrBuildScanRecordBytes = BluetoothScanRecordBuilderKt.buildScanRecordBytes(strOptString2, strOptString, strOptString3);
                                            if (!(bArrBuildScanRecordBytes.length == 0)) {
                                                return bArrBuildScanRecordBytes;
                                            }
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept21.getClass();
                            arrayList21.add(hookHandleIntercept21);
                            i25++;
                        } catch (Throwable th23) {
                            HookStatus.INSTANCE.error(cls.getName() + "#getBytes", th23);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), "getBytes", i25);
            } catch (Throwable unused14) {
            }
        }
        XposedHelpers xposedHelpers23 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists5 = xposedHelpers23.findClassIfExists("android.bluetooth.le.ScanFilter", classLoader);
        if (clsFindClassIfExists5 != null) {
            try {
                ArrayList arrayList22 = new ArrayList();
                d0 d0VarY22 = zm3.y(clsFindClassIfExists5.getDeclaredMethods());
                int i26 = 0;
                while (d0VarY22.hasNext()) {
                    final Method method22 = (Method) d0VarY22.next();
                    if (o51.f(method22.getName(), "matches") && !Modifier.isAbstract(method22.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept22 = xposedHelpers23.getModule().hook(method22).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$22
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method22.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
                                        return Boolean.TRUE;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept22.getClass();
                            arrayList22.add(hookHandleIntercept22);
                            i26++;
                        } catch (Throwable th24) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists5.getName() + "#matches", th24);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists5.getName(), "matches", i26);
            } catch (Throwable unused15) {
            }
        }
        XposedHelpers xposedHelpers24 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists6 = xposedHelpers24.findClassIfExists("android.bluetooth.BluetoothManager", classLoader);
        if (clsFindClassIfExists6 != null) {
            try {
                ArrayList arrayList23 = new ArrayList();
                d0 d0VarY23 = zm3.y(clsFindClassIfExists6.getDeclaredMethods());
                int i27 = 0;
                while (d0VarY23.hasNext()) {
                    final Method method23 = (Method) d0VarY23.next();
                    if (o51.f(method23.getName(), "getAdapter") && !Modifier.isAbstract(method23.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept23 = xposedHelpers24.getModule().hook(method23).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$23
                                public Object intercept(XposedInterface.Chain chain) {
                                    XposedHelpers xposedHelpers25;
                                    Class<?> clsFindClassIfExists7;
                                    chain.getClass();
                                    method23.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    if (objProceed != null) {
                                        return objProceed;
                                    }
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || !config$xposed_globalRelease.optBoolean("mock_bluetooth", true) || (clsFindClassIfExists7 = (xposedHelpers25 = XposedHelpers.INSTANCE).findClassIfExists("android.bluetooth.BluetoothAdapter", classLoader)) == null) {
                                        return null;
                                    }
                                    return xposedHelpers25.callStaticMethod(clsFindClassIfExists7, "getDefaultAdapter", new Object[0]);
                                }
                            });
                            hookHandleIntercept23.getClass();
                            arrayList23.add(hookHandleIntercept23);
                            i27++;
                        } catch (Throwable th25) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists6.getName() + "#getAdapter", th25);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists6.getName(), "getAdapter", i27);
            } catch (Throwable unused16) {
            }
            XposedHelpers xposedHelpers25 = XposedHelpers.INSTANCE;
            ArrayList arrayList24 = new ArrayList();
            d0 d0VarY24 = zm3.y(clsFindClassIfExists6.getDeclaredMethods());
            int i28 = 0;
            while (d0VarY24.hasNext()) {
                final Method method24 = (Method) d0VarY24.next();
                if (o51.f(method24.getName(), "getConnectedDevices") && !Modifier.isAbstract(method24.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept24 = xposedHelpers25.getModule().hook(method24).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$24
                            public Object intercept(XposedInterface.Chain chain) throws JSONException {
                                JSONArray jSONArrayOptJSONArray;
                                chain.getClass();
                                method24.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && (jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json")) != null && jSONArrayOptJSONArray.length() > 0) {
                                    ArrayList arrayList25 = new ArrayList();
                                    int length = jSONArrayOptJSONArray.length();
                                    for (int i29 = 0; i29 < length; i29++) {
                                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i29);
                                        if (jSONObject.optBoolean("isConnected", false) || jSONObject.optBoolean("isDesignated", false)) {
                                            String strOptString = jSONObject.optString("address", "00:00:00:00:00:00");
                                            ClassLoader classLoader2 = classLoader;
                                            strOptString.getClass();
                                            Object objCreateBluetoothDevice = BluetoothScanRecordBuilderKt.createBluetoothDevice(classLoader2, strOptString);
                                            if (objCreateBluetoothDevice != null) {
                                                arrayList25.add(objCreateBluetoothDevice);
                                            }
                                        }
                                    }
                                    if (!arrayList25.isEmpty()) {
                                        return arrayList25;
                                    }
                                }
                                List args = chain.getArgs();
                                args.getClass();
                                return chain.proceed(args.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept24.getClass();
                        arrayList24.add(hookHandleIntercept24);
                        i28++;
                    } catch (Throwable th26) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists6.getName() + "#getConnectedDevices", th26);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists6.getName(), "getConnectedDevices", i28);
            try {
                XposedHelpers xposedHelpers26 = XposedHelpers.INSTANCE;
                ArrayList arrayList25 = new ArrayList();
                d0 d0VarY25 = zm3.y(clsFindClassIfExists6.getDeclaredMethods());
                int i29 = 0;
                while (d0VarY25.hasNext()) {
                    final Method method25 = (Method) d0VarY25.next();
                    if (o51.f(method25.getName(), "getDevicesMatchingConnectionStates") && !Modifier.isAbstract(method25.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept25 = xposedHelpers26.getModule().hook(method25).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt$hookBluetoothLE$$inlined$hookAllMethods$25
                                public Object intercept(XposedInterface.Chain chain) throws JSONException {
                                    JSONArray jSONArrayOptJSONArray;
                                    chain.getClass();
                                    method25.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true) && (jSONArrayOptJSONArray = config$xposed_globalRelease.optJSONArray("bluetooth_json")) != null && jSONArrayOptJSONArray.length() > 0) {
                                        ArrayList arrayList26 = new ArrayList();
                                        int length = jSONArrayOptJSONArray.length();
                                        for (int i30 = 0; i30 < length; i30++) {
                                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i30);
                                            if (jSONObject.optBoolean("isConnected", false) || jSONObject.optBoolean("isDesignated", false)) {
                                                String strOptString = jSONObject.optString("address", "00:00:00:00:00:00");
                                                ClassLoader classLoader2 = classLoader;
                                                strOptString.getClass();
                                                Object objCreateBluetoothDevice = BluetoothScanRecordBuilderKt.createBluetoothDevice(classLoader2, strOptString);
                                                if (objCreateBluetoothDevice != null) {
                                                    arrayList26.add(objCreateBluetoothDevice);
                                                }
                                            }
                                        }
                                        if (!arrayList26.isEmpty()) {
                                            return arrayList26;
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept25.getClass();
                            arrayList25.add(hookHandleIntercept25);
                            i29++;
                        } catch (Throwable th27) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists6.getName() + "#getDevicesMatchingConnectionStates", th27);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists6.getName(), "getDevicesMatchingConnectionStates", i29);
            } catch (Throwable unused17) {
            }
        }
        XposedBridge.INSTANCE.log("[LocationSpoofer] Bluetooth LE hooks installed");
    }

    public static /* synthetic */ void hookBluetoothLE$default(LocationHooker locationHooker, ClassLoader classLoader, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hookBluetoothLE(locationHooker, classLoader, z);
    }

    public static final void startBleTimer(final LocationHooker locationHooker, final Object obj, final ClassLoader classLoader) {
        locationHooker.getClass();
        obj.getClass();
        classLoader.getClass();
        Timer timerRemove = locationHooker.getBleScanTimers$xposed_globalRelease().remove(obj);
        if (timerRemove != null) {
            timerRemove.cancel();
        }
        Timer timer = new Timer("LocationSpoofer-BleTimer", true);
        locationHooker.getBleScanTimers$xposed_globalRelease().put(obj, timer);
        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
            deliverBleScanResults(locationHooker, config$xposed_globalRelease, obj, classLoader);
        }
        timer.schedule(new TimerTask() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt.startBleTimer.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                JSONObject config$xposed_globalRelease2 = locationHooker.readConfig$xposed_globalRelease();
                if (config$xposed_globalRelease2 != null && config$xposed_globalRelease2.optBoolean("active", false) && config$xposed_globalRelease2.optBoolean("mock_bluetooth", true)) {
                    BluetoothScanDispatcherKt.deliverBleScanResults(locationHooker, config$xposed_globalRelease2, obj, classLoader);
                } else {
                    cancel();
                    locationHooker.getBleScanTimers$xposed_globalRelease().remove(obj);
                }
            }
        }, 200L, 200L);
    }

    public static final void startOldLeScanTimer(final LocationHooker locationHooker, final Object obj, final ClassLoader classLoader) {
        locationHooker.getClass();
        obj.getClass();
        classLoader.getClass();
        Timer timerRemove = locationHooker.getBleScanTimers$xposed_globalRelease().remove(obj);
        if (timerRemove != null) {
            timerRemove.cancel();
        }
        Timer timer = new Timer("LocationSpoofer-OldBleTimer", true);
        locationHooker.getBleScanTimers$xposed_globalRelease().put(obj, timer);
        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("mock_bluetooth", true)) {
            deliverOldLeScanResults(locationHooker, config$xposed_globalRelease, obj, classLoader);
        }
        timer.schedule(new TimerTask() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt.startOldLeScanTimer.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                JSONObject config$xposed_globalRelease2 = locationHooker.readConfig$xposed_globalRelease();
                if (config$xposed_globalRelease2 != null && config$xposed_globalRelease2.optBoolean("active", false) && config$xposed_globalRelease2.optBoolean("mock_bluetooth", true)) {
                    BluetoothScanDispatcherKt.deliverOldLeScanResults(locationHooker, config$xposed_globalRelease2, obj, classLoader);
                } else {
                    cancel();
                    locationHooker.getBleScanTimers$xposed_globalRelease().remove(obj);
                }
            }
        }, 200L, 200L);
    }

    public static final void stopBleTimer(LocationHooker locationHooker, Object obj) {
        locationHooker.getClass();
        obj.getClass();
        Timer timerRemove = locationHooker.getBleScanTimers$xposed_globalRelease().remove(obj);
        if (timerRemove != null) {
            timerRemove.cancel();
        }
    }
}
