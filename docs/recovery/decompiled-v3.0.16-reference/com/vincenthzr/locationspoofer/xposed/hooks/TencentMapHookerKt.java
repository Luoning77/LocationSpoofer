package com.vincenthzr.locationspoofer.xposed.hooks;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.d0;
import defpackage.l13;
import defpackage.o51;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class TencentMapHookerKt {
    public static final void hookTencentLocationCallback(final LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("com.tencent.map.geolocation.TencentLocationListener", classLoader);
        if (clsFindClassIfExists == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredMethods());
            int i = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "onLocationChanged") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationCallback$$inlined$hookAllMethods$1
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
                                if (objP0 == null) {
                                    List args3 = chain.getArgs();
                                    args3.getClass();
                                    return chain.proceed(args3.toArray(new Object[0]));
                                }
                                SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02");
                                if (currentSpoofedMotion == null) {
                                    List args4 = chain.getArgs();
                                    args4.getClass();
                                    return chain.proceed(args4.toArray(new Object[0]));
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                XposedHelpers.INSTANCE.callMethod(objP0, "setLatitude", Double.valueOf(currentSpoofedMotion.getLat()));
                                            } catch (Throwable unused) {
                                                XposedHelpers.INSTANCE.setDoubleField(objP0, "a", currentSpoofedMotion.getLat());
                                            }
                                        } catch (Throwable unused2) {
                                            XposedHelpers.INSTANCE.setDoubleField(objP0, "mLatitude", currentSpoofedMotion.getLat());
                                        }
                                    } catch (Throwable unused3) {
                                        XposedHelpers.INSTANCE.setDoubleField(objP0, "latitude", currentSpoofedMotion.getLat());
                                    }
                                } catch (Throwable unused4) {
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                XposedHelpers.INSTANCE.callMethod(objP0, "setLongitude", Double.valueOf(currentSpoofedMotion.getLng()));
                                            } catch (Throwable unused5) {
                                                XposedHelpers.INSTANCE.setDoubleField(objP0, "longitude", currentSpoofedMotion.getLng());
                                            }
                                        } catch (Throwable unused6) {
                                        }
                                    } catch (Throwable unused7) {
                                        XposedHelpers.INSTANCE.setDoubleField(objP0, "b", currentSpoofedMotion.getLng());
                                    }
                                } catch (Throwable unused8) {
                                    XposedHelpers.INSTANCE.setDoubleField(objP0, "mLongitude", currentSpoofedMotion.getLng());
                                }
                                List args5 = chain.getArgs();
                                args5.getClass();
                                return chain.proceed(args5.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#onLocationChanged", th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "onLocationChanged", i);
            XposedBridge.INSTANCE.log("[LocationSpoofer] TencentLocationListener callback hook installed");
        } catch (Throwable th2) {
            XposedBridge.INSTANCE.log("[LocationSpoofer] TencentLocationListener hook failed: " + th2);
        }
    }

    public static final void hookTencentLocationClass(final LocationHooker locationHooker, Class<?> cls, ClassLoader classLoader) {
        locationHooker.getClass();
        cls.getClass();
        classLoader.getClass();
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(cls.getDeclaredMethods());
            int i = 0;
            int i2 = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "getLatitude") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationClass$$inlined$hookAllMethods$1
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02");
                                return currentSpoofedMotion != null ? Double.valueOf(currentSpoofedMotion.getLat()) : objProceed;
                            }
                        });
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i2++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getLatitude", th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getLatitude", i2);
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            d0 d0VarY2 = zm3.y(cls.getDeclaredMethods());
            int i3 = 0;
            while (d0VarY2.hasNext()) {
                final Method method2 = (Method) d0VarY2.next();
                if (o51.f(method2.getName(), "getLongitude") && !Modifier.isAbstract(method2.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationClass$$inlined$hookAllMethods$2
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method2.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02");
                                return currentSpoofedMotion != null ? Double.valueOf(currentSpoofedMotion.getLng()) : objProceed;
                            }
                        });
                        hookHandleIntercept2.getClass();
                        arrayList2.add(hookHandleIntercept2);
                        i3++;
                    } catch (Throwable th2) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getLongitude", th2);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getLongitude", i3);
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            ArrayList arrayList3 = new ArrayList();
            d0 d0VarY3 = zm3.y(cls.getDeclaredMethods());
            int i4 = 0;
            while (d0VarY3.hasNext()) {
                final Method method3 = (Method) d0VarY3.next();
                if (o51.f(method3.getName(), "getSpeed") && !Modifier.isAbstract(method3.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers3.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationClass$$inlined$hookAllMethods$3
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method3.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Float.valueOf(RouteEngine.calculateCurrentPosition$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null).getSpeed());
                            }
                        });
                        hookHandleIntercept3.getClass();
                        arrayList3.add(hookHandleIntercept3);
                        i4++;
                    } catch (Throwable th3) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getSpeed", th3);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getSpeed", i4);
            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
            ArrayList arrayList4 = new ArrayList();
            d0 d0VarY4 = zm3.y(cls.getDeclaredMethods());
            int i5 = 0;
            while (d0VarY4.hasNext()) {
                final Method method4 = (Method) d0VarY4.next();
                if (o51.f(method4.getName(), "getBearing") && !Modifier.isAbstract(method4.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers4.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationClass$$inlined$hookAllMethods$4
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method4.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Float.valueOf(RouteEngine.calculateCurrentPosition$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null).getBearing());
                            }
                        });
                        hookHandleIntercept4.getClass();
                        arrayList4.add(hookHandleIntercept4);
                        i5++;
                    } catch (Throwable th4) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getBearing", th4);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getBearing", i5);
            XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
            ArrayList arrayList5 = new ArrayList();
            d0 d0VarY5 = zm3.y(cls.getDeclaredMethods());
            int i6 = 0;
            while (d0VarY5.hasNext()) {
                final Method method5 = (Method) d0VarY5.next();
                if (o51.f(method5.getName(), "getTime") && !Modifier.isAbstract(method5.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept5 = xposedHelpers5.getModule().hook(method5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationClass$$inlined$hookAllMethods$5
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method5.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Long.valueOf(System.currentTimeMillis());
                            }
                        });
                        hookHandleIntercept5.getClass();
                        arrayList5.add(hookHandleIntercept5);
                        i6++;
                    } catch (Throwable th5) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getTime", th5);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getTime", i6);
            try {
                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                ArrayList arrayList6 = new ArrayList();
                d0 d0VarY6 = zm3.y(cls.getDeclaredMethods());
                int i7 = 0;
                while (d0VarY6.hasNext()) {
                    final Method method6 = (Method) d0VarY6.next();
                    if (o51.f(method6.getName(), "getProvider") && !Modifier.isAbstract(method6.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept6 = xposedHelpers6.getModule().hook(method6).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationClass$$inlined$hookAllMethods$6
                                public Object intercept(XposedInterface.Chain chain) {
                                    String str;
                                    String str2;
                                    chain.getClass();
                                    method6.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    Object obj = objProceed;
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        if (objProceed instanceof String) {
                                            obj = objProceed;
                                            str = (String) objProceed;
                                        } else {
                                            obj = objProceed;
                                            str = null;
                                        }
                                        str2 = str;
                                        if (str == null) {
                                            str2 = "gps";
                                        }
                                        boolean zEquals = str2.equals("network");
                                        obj = str2;
                                        if (!zEquals && !l13.c0(str2, "wifi", true)) {
                                            obj = str2;
                                            return "gps";
                                        }
                                    }
                                    obj = str2;
                                    obj = objProceed;
                                    return obj;
                                }
                            });
                            hookHandleIntercept6.getClass();
                            arrayList6.add(hookHandleIntercept6);
                            i7++;
                        } catch (Throwable th6) {
                            HookStatus.INSTANCE.error(cls.getName() + "#getProvider", th6);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), "getProvider", i7);
            } catch (Throwable unused) {
            }
            XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
            ArrayList arrayList7 = new ArrayList();
            d0 d0VarY7 = zm3.y(cls.getDeclaredMethods());
            int i8 = 0;
            while (d0VarY7.hasNext()) {
                final Method method7 = (Method) d0VarY7.next();
                if (o51.f(method7.getName(), "getAccuracy") && !Modifier.isAbstract(method7.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept7 = xposedHelpers7.getModule().hook(method7).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationClass$$inlined$hookAllMethods$7
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method7.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker));
                            }
                        });
                        hookHandleIntercept7.getClass();
                        arrayList7.add(hookHandleIntercept7);
                        i8++;
                    } catch (Throwable th7) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getAccuracy", th7);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getAccuracy", i8);
            try {
                XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                ArrayList arrayList8 = new ArrayList();
                d0 d0VarY8 = zm3.y(cls.getDeclaredMethods());
                while (d0VarY8.hasNext()) {
                    final Method method8 = (Method) d0VarY8.next();
                    if (o51.f(method8.getName(), "isMockGps") && !Modifier.isAbstract(method8.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept8 = xposedHelpers8.getModule().hook(method8).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentLocationClass$$inlined$hookAllMethods$8
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method8.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                                        return objProceed;
                                    }
                                    return 0;
                                }
                            });
                            hookHandleIntercept8.getClass();
                            arrayList8.add(hookHandleIntercept8);
                            i++;
                        } catch (Throwable th8) {
                            HookStatus.INSTANCE.error(cls.getName() + "#isMockGps", th8);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), "isMockGps", i);
            } catch (Throwable unused2) {
            }
            GoogleAndAddressHookerKt.hookAddressFields(locationHooker, cls, classLoader);
            XposedBridge.INSTANCE.log("[LocationSpoofer] TencentLocation hooks installed on ".concat(cls.getName()));
        } catch (Throwable th9) {
            XposedBridge.INSTANCE.log("[LocationSpoofer] TencentLocation class hook failed: " + th9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    public static final void hookTencentSDK(final LocationHooker locationHooker, ClassLoader classLoader) {
        boolean z;
        int i;
        boolean z2;
        locationHooker.getClass();
        classLoader.getClass();
        Iterator it = am1.G("com.tencent.map.geolocation.internal.TencentLocationImpl", "com.tencent.map.geolocation.TencentLocationImpl", "com.tencent.tencentmap.mapsdk.map.model.TencentLocationImpl").iterator();
        while (true) {
            z = true;
            i = 0;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            String str = (String) it.next();
            Class<?> clsFindClassIfExists = XposedHelpers.INSTANCE.findClassIfExists(str, classLoader);
            if (clsFindClassIfExists != null) {
                if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists, Boolean.TRUE) == null) {
                    hookTencentLocationClass(locationHooker, clsFindClassIfExists, classLoader);
                }
                XposedBridge.INSTANCE.log("[LocationSpoofer] TencentLocation impl found: " + str);
                z2 = true;
                break;
            }
        }
        if (z2) {
            z = z2;
        } else {
            Class<?> clsFindClassIfExists2 = XposedHelpers.INSTANCE.findClassIfExists("com.tencent.map.geolocation.TencentLocation", classLoader);
            if (clsFindClassIfExists2 == null || !clsFindClassIfExists2.isInterface()) {
                if (clsFindClassIfExists2 == null) {
                    z = z2;
                } else if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists2, Boolean.TRUE) == null) {
                    hookTencentLocationClass(locationHooker, clsFindClassIfExists2, classLoader);
                }
            } else if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists2, Boolean.TRUE) == null) {
                hookTencentLocationCallback(locationHooker, classLoader);
            }
        }
        if (!z) {
            XposedBridge.INSTANCE.log("[LocationSpoofer] TencentLocation SDK not found, skipped");
        }
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists3 = xposedHelpers.findClassIfExists("com.tencent.map.geolocation.TencentLocationManager", classLoader);
        if (clsFindClassIfExists3 == null || locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists3, Boolean.TRUE) != null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "requestLocationUpdates") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt$hookTencentSDK$$inlined$hookAllMethods$1
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method.getClass();
                                for (Object obj : chain.getArgs()) {
                                    if (obj != null) {
                                        try {
                                            if (LocationHooker.Companion.hasTypeByName(obj.getClass(), "com.tencent.map.geolocation.TencentLocationListener")) {
                                                locationHooker.getCapturedTencentListeners$xposed_globalRelease().addIfAbsent(obj);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                List args = chain.getArgs();
                                args.getClass();
                                return chain.proceed(args.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#requestLocationUpdates", th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "requestLocationUpdates", i);
        } catch (Throwable unused) {
        }
    }
}
