package com.vincenthzr.locationspoofer.xposed.hooks;

import android.content.ContentResolver;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.d0;
import defpackage.o51;
import defpackage.yo;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AntiDetectionHookerKt {
    public static final void hookAntiDetection(final LocationHooker locationHooker, ClassLoader classLoader) {
        int i;
        Set set;
        String[] strArr;
        Class<?> clsFindClass;
        Class<?> clsFindClass2;
        Class<?> clsFindClass3;
        String[] strArr2;
        locationHooker.getClass();
        classLoader.getClass();
        try {
            Class<?> clsFindClassIfExists = XposedHelpers.INSTANCE.findClassIfExists("android.app.AppOpsManager", classLoader);
            if (clsFindClassIfExists != null) {
                final Set setH0 = yo.H0(new Object[]{0, 1, 2, 12, 41, 42, 59, 77, "android:coarse_location", "android:fine_location", "android:gps", "android:monitor_location", "android:monitor_location_high_power", "android:bluetooth_scan", "android:bluetooth_connect", "android:bluetooth_advertise"});
                String[] strArr3 = {"checkOp", "checkOpNoThrow", "noteOp", "noteOpNoThrow", "noteProxyOp", "noteProxyOpNoThrow"};
                int i2 = 0;
                while (i2 < 6) {
                    String str = strArr3[i2];
                    try {
                        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                        ArrayList arrayList = new ArrayList();
                        d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                        int i3 = 0;
                        while (d0VarY.hasNext()) {
                            final Method method = (Method) d0VarY.next();
                            clsFindClassIfExists = clsFindClassIfExists;
                            try {
                                if (!o51.f(method.getName(), str) || Modifier.isAbstract(method.getModifiers())) {
                                    strArr2 = strArr3;
                                    strArr3 = strArr2;
                                    arrayList = arrayList;
                                } else {
                                    try {
                                        strArr2 = strArr3;
                                        try {
                                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AntiDetectionHookerKt$hookAntiDetection$$inlined$hookAllMethods$1
                                                public Object intercept(XposedInterface.Chain chain) {
                                                    chain.getClass();
                                                    method.getClass();
                                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                                                        List args = chain.getArgs();
                                                        args.getClass();
                                                        return chain.proceed(args.toArray(new Object[0]));
                                                    }
                                                    List args2 = chain.getArgs();
                                                    args2.getClass();
                                                    Object objP0 = zy.p0(args2, 0);
                                                    if (o51.f(objP0, 58) || o51.f(objP0, "android:mock_location") || o51.f(objP0, "mock_location")) {
                                                        return 1;
                                                    }
                                                    if (objP0 != null && zy.g0(setH0, objP0)) {
                                                        return 0;
                                                    }
                                                    List args3 = chain.getArgs();
                                                    args3.getClass();
                                                    return chain.proceed(args3.toArray(new Object[0]));
                                                }
                                            });
                                            hookHandleIntercept.getClass();
                                            arrayList.add(hookHandleIntercept);
                                            i3++;
                                            strArr3 = strArr2;
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#" + str, th);
                                                strArr3 = strArr2;
                                                arrayList = arrayList;
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        strArr2 = strArr3;
                                    }
                                }
                            } catch (Throwable unused2) {
                                strArr2 = strArr3;
                            }
                        }
                        clsFindClassIfExists = clsFindClassIfExists;
                        strArr2 = strArr3;
                        HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), str, i3);
                    } catch (Throwable unused3) {
                        clsFindClassIfExists = clsFindClassIfExists;
                    }
                    i2++;
                    clsFindClassIfExists = clsFindClassIfExists;
                    strArr3 = strArr2;
                }
            }
        } catch (Throwable th3) {
            XposedBridge.INSTANCE.log(th3);
        }
        XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
        Object[] objArr = {ContentResolver.class, String.class};
        Class<?> clsFindClass4 = xposedHelpers2.findClass("android.provider.Settings$Secure", classLoader);
        ArrayList arrayList2 = new ArrayList(2);
        int i4 = 0;
        for (int i5 = 2; i4 < i5; i5 = 2) {
            Object obj = objArr[i4];
            if (obj instanceof Class) {
                clsFindClass3 = (Class) obj;
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid argument type");
                }
                clsFindClass3 = XposedHelpers.INSTANCE.findClass((String) obj, clsFindClass4.getClassLoader());
            }
            arrayList2.add(clsFindClass3);
            i4++;
        }
        Class[] clsArr = (Class[]) arrayList2.toArray(new Class[0]);
        final Method methodFindMethodExact = xposedHelpers2.findMethodExact(clsFindClass4, "getInt", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        xposedHelpers2.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AntiDetectionHookerKt$hookAntiDetection$$inlined$hookMethod$1
            public Object intercept(XposedInterface.Chain chain) {
                chain.getClass();
                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                    List args = chain.getArgs();
                    args.getClass();
                    return chain.proceed(args.toArray(new Object[0]));
                }
                List args2 = chain.getArgs();
                args2.getClass();
                Object objP0 = zy.p0(args2, 1);
                if (o51.f(objP0 instanceof String ? (String) objP0 : null, "mock_location")) {
                    return 0;
                }
                List args3 = chain.getArgs();
                args3.getClass();
                return chain.proceed(args3.toArray(new Object[0]));
            }
        }).getClass();
        XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
        Class cls = Integer.TYPE;
        cls.getClass();
        Object[] objArr2 = {ContentResolver.class, String.class, cls};
        Class<?> clsFindClass5 = xposedHelpers3.findClass("android.provider.Settings$Secure", classLoader);
        ArrayList arrayList3 = new ArrayList(3);
        int i6 = 0;
        for (int i7 = 3; i6 < i7; i7 = 3) {
            Object obj2 = objArr2[i6];
            if (obj2 instanceof Class) {
                clsFindClass2 = (Class) obj2;
            } else {
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Invalid argument type");
                }
                clsFindClass2 = XposedHelpers.INSTANCE.findClass((String) obj2, clsFindClass5.getClassLoader());
            }
            arrayList3.add(clsFindClass2);
            i6++;
        }
        Class[] clsArr2 = (Class[]) arrayList3.toArray(new Class[0]);
        final Method methodFindMethodExact2 = xposedHelpers3.findMethodExact(clsFindClass5, "getInt", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
        xposedHelpers3.getModule().hook(methodFindMethodExact2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AntiDetectionHookerKt$hookAntiDetection$$inlined$hookMethod$2
            public Object intercept(XposedInterface.Chain chain) {
                chain.getClass();
                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                    List args = chain.getArgs();
                    args.getClass();
                    return chain.proceed(args.toArray(new Object[0]));
                }
                List args2 = chain.getArgs();
                args2.getClass();
                Object objP0 = zy.p0(args2, 1);
                if (o51.f(objP0 instanceof String ? (String) objP0 : null, "mock_location")) {
                    return 0;
                }
                List args3 = chain.getArgs();
                args3.getClass();
                return chain.proceed(args3.toArray(new Object[0]));
            }
        }).getClass();
        try {
            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
            Object[] objArr3 = {ContentResolver.class, String.class};
            Class<?> clsFindClass6 = xposedHelpers4.findClass("android.provider.Settings$Secure", classLoader);
            ArrayList arrayList4 = new ArrayList(2);
            for (int i8 = 0; i8 < 2; i8++) {
                Object obj3 = objArr3[i8];
                if (obj3 instanceof Class) {
                    clsFindClass = (Class) obj3;
                } else {
                    if (!(obj3 instanceof String)) {
                        throw new IllegalArgumentException("Invalid argument type");
                    }
                    clsFindClass = XposedHelpers.INSTANCE.findClass((String) obj3, clsFindClass6.getClassLoader());
                }
                arrayList4.add(clsFindClass);
            }
            i = 0;
            try {
                Class[] clsArr3 = (Class[]) arrayList4.toArray(new Class[0]);
                final Method methodFindMethodExact3 = xposedHelpers4.findMethodExact(clsFindClass6, "getString", (Class[]) Arrays.copyOf(clsArr3, clsArr3.length));
                xposedHelpers4.getModule().hook(methodFindMethodExact3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AntiDetectionHookerKt$hookAntiDetection$$inlined$hookMethod$3
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                        List args2 = chain.getArgs();
                        args2.getClass();
                        Object objP0 = zy.p0(args2, 1);
                        if (o51.f(objP0 instanceof String ? (String) objP0 : null, "mock_location")) {
                            return "0";
                        }
                        List args3 = chain.getArgs();
                        args3.getClass();
                        return chain.proceed(args3.toArray(new Object[0]));
                    }
                }).getClass();
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            i = 0;
        }
        final Set setH1 = yo.H0(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"});
        final Set setH2 = yo.H0(new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE"});
        XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
        ArrayList arrayListV0 = yo.v0(new Class[]{xposedHelpers5.findClassIfExists("android.content.Context", classLoader), xposedHelpers5.findClassIfExists("android.content.ContextWrapper", classLoader), xposedHelpers5.findClassIfExists("android.app.ContextImpl", classLoader)});
        String[] strArr4 = {"checkPermission", "checkSelfPermission", "checkCallingOrSelfPermission", "checkCallingPermission"};
        int size = arrayListV0.size();
        int i9 = i;
        while (i9 < size) {
            int i10 = i9 + 1;
            Class cls2 = (Class) arrayListV0.get(i9);
            int i11 = i;
            while (i11 < 4) {
                String str2 = strArr4[i11];
                try {
                    XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                    ArrayList arrayList5 = new ArrayList();
                    d0 d0VarY2 = zm3.y(cls2.getDeclaredMethods());
                    while (d0VarY2.hasNext()) {
                        final Method method2 = (Method) d0VarY2.next();
                        arrayListV0 = arrayListV0;
                        try {
                            if (!o51.f(method2.getName(), str2) || Modifier.isAbstract(method2.getModifiers())) {
                                set = setH1;
                                strArr = strArr4;
                                strArr4 = strArr;
                                setH1 = set;
                            } else {
                                try {
                                    strArr = strArr4;
                                    try {
                                        XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers6.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AntiDetectionHookerKt$hookAntiDetection$$inlined$hookAllMethods$2
                                            public Object intercept(XposedInterface.Chain chain) {
                                                Object next;
                                                chain.getClass();
                                                method2.getClass();
                                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                                    List args = chain.getArgs();
                                                    args.getClass();
                                                    Iterator it = args.iterator();
                                                    do {
                                                        if (!it.hasNext()) {
                                                            next = null;
                                                            break;
                                                        }
                                                        next = it.next();
                                                    } while (!(next instanceof String));
                                                    String str3 = next instanceof String ? (String) next : null;
                                                    if (str3 != null && (setH1.contains(str3) || (setH2.contains(str3) && config$xposed_globalRelease.optBoolean("mock_bluetooth", false)))) {
                                                        return 0;
                                                    }
                                                }
                                                List args2 = chain.getArgs();
                                                args2.getClass();
                                                return chain.proceed(args2.toArray(new Object[0]));
                                            }
                                        });
                                        hookHandleIntercept2.getClass();
                                        arrayList5.add(hookHandleIntercept2);
                                        i++;
                                        strArr4 = strArr;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            set = setH1;
                                            try {
                                                HookStatus.INSTANCE.error(cls2.getName() + "#" + str2, th);
                                                strArr4 = strArr;
                                                setH1 = set;
                                            } catch (Throwable unused6) {
                                            }
                                        } catch (Throwable unused7) {
                                            set = setH1;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    strArr = strArr4;
                                }
                            }
                        } catch (Throwable unused8) {
                            set = setH1;
                            strArr = strArr4;
                        }
                    }
                    set = setH1;
                    arrayListV0 = arrayListV0;
                    strArr = strArr4;
                    HookStatus.INSTANCE.methodHooked(cls2.getName(), str2, i);
                } catch (Throwable unused9) {
                    set = setH1;
                    arrayListV0 = arrayListV0;
                }
                i11++;
                arrayListV0 = arrayListV0;
                strArr4 = strArr;
                setH1 = set;
                i = 0;
            }
            i9 = i10;
        }
        try {
            XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
            ArrayList arrayListV1 = yo.v0(new Class[]{xposedHelpers7.findClassIfExists("android.app.ApplicationPackageManager", classLoader), xposedHelpers7.findClassIfExists("android.content.pm.PackageManager", classLoader)});
            int size2 = arrayListV1.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj4 = arrayListV1.get(i12);
                i12++;
                Class cls3 = (Class) obj4;
                XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                ArrayList arrayList6 = new ArrayList();
                d0 d0VarY3 = zm3.y(cls3.getDeclaredMethods());
                int i13 = 0;
                while (d0VarY3.hasNext()) {
                    final Method method3 = (Method) d0VarY3.next();
                    if (o51.f(method3.getName(), "hasSystemFeature") && !Modifier.isAbstract(method3.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers8.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AntiDetectionHookerKt$hookAntiDetection$$inlined$hookAllMethods$3
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    JSONObject config$xposed_globalRelease;
                                    chain.getClass();
                                    method3.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Iterator it = args.iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!(next instanceof String));
                                    String str3 = next instanceof String ? (String) next : null;
                                    boolean z = true;
                                    boolean z2 = o51.f(str3, "android.hardware.bluetooth_le") || o51.f(str3, "android.hardware.bluetooth");
                                    if (!o51.f(str3, "android.hardware.location.gps") && !o51.f(str3, "android.hardware.location.network")) {
                                        z = false;
                                    }
                                    if ((z2 || z) && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null && config$xposed_globalRelease.optBoolean("active", false) && (z || config$xposed_globalRelease.optBoolean("mock_bluetooth", false))) {
                                        return Boolean.TRUE;
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept3.getClass();
                            arrayList6.add(hookHandleIntercept3);
                            i13++;
                        } catch (Throwable th6) {
                            HookStatus.INSTANCE.error(cls3.getName() + "#hasSystemFeature", th6);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls3.getName(), "hasSystemFeature", i13);
            }
        } catch (Throwable unused10) {
        }
        XposedBridge.INSTANCE.log("[LocationSpoofer] Anti-detection hooks installed");
    }
}
