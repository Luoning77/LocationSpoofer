package com.vincenthzr.locationspoofer.xposed.hooks;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.d0;
import defpackage.o51;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class GnssStatusHookerKt {
    public static final Iterable<Object> createSpoofedGpsSatellites(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
        return GnssFastMockEngine.INSTANCE.getOrCreateSpoofedGpsSatellites(classLoader, config$xposed_globalRelease != null ? config$xposed_globalRelease.optInt("satellite_count", 20) : 20);
    }

    public static final void hookGnssStatus(final LocationHooker locationHooker, final ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Class<?> clsFindClass = xposedHelpers.findClass("android.location.LocationManager", classLoader);
            try {
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(clsFindClass.getDeclaredMethods());
                int i = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), "addGpsStatusListener") && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method.getClass();
                                    Object obj = chain.getArgs().get(0);
                                    if (obj != null) {
                                        Class<?> cls = obj.getClass();
                                        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) == null) {
                                            try {
                                                XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                                                ArrayList arrayList2 = new ArrayList();
                                                d0 d0VarY2 = zm3.y(cls.getDeclaredMethods());
                                                int i2 = 0;
                                                while (d0VarY2.hasNext()) {
                                                    final Method method2 = (Method) d0VarY2.next();
                                                    if (o51.f(method2.getName(), "onGpsStatusChanged") && !Modifier.isAbstract(method2.getModifiers())) {
                                                        try {
                                                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$lambda$1$$inlined$hookAllMethods$1
                                                                public Object intercept(XposedInterface.Chain chain2) {
                                                                    chain2.getClass();
                                                                    method2.getClass();
                                                                    List args = chain2.getArgs();
                                                                    args.getClass();
                                                                    return chain2.proceed(args.toArray(new Object[0]));
                                                                }
                                                            });
                                                            hookHandleIntercept2.getClass();
                                                            arrayList2.add(hookHandleIntercept2);
                                                            i2++;
                                                        } catch (Throwable th) {
                                                            HookStatus.INSTANCE.error(cls.getName() + "#onGpsStatusChanged", th);
                                                        }
                                                    }
                                                }
                                                HookStatus.INSTANCE.methodHooked(cls.getName(), "onGpsStatusChanged", i2);
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
                            HookStatus.INSTANCE.error(clsFindClass.getName() + "#addGpsStatusListener", th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass.getName(), "addGpsStatusListener", i);
            } catch (Throwable th2) {
                XposedBridge.INSTANCE.log(th2);
            }
            try {
                XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarY2 = zm3.y(clsFindClass.getDeclaredMethods());
                int i2 = 0;
                while (d0VarY2.hasNext()) {
                    final Method method2 = (Method) d0VarY2.next();
                    if (o51.f(method2.getName(), "registerGnssStatusCallback") && !Modifier.isAbstract(method2.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$$inlined$hookAllMethods$2
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    chain.getClass();
                                    method2.getClass();
                                    Iterator it = chain.getArgs().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (next != null && LocationHooker.Companion.hasTypeByName(next.getClass(), "android.location.GnssStatus$Callback")) {
                                            break;
                                        }
                                    }
                                    if (next != null) {
                                        final Class<?> cls = next.getClass();
                                        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) == null) {
                                            try {
                                                XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                                                ArrayList arrayList3 = new ArrayList();
                                                d0 d0VarY3 = zm3.y(cls.getDeclaredMethods());
                                                int i3 = 0;
                                                while (d0VarY3.hasNext()) {
                                                    final Method method3 = (Method) d0VarY3.next();
                                                    if (o51.f(method3.getName(), "onSatelliteStatusChanged") && !Modifier.isAbstract(method3.getModifiers())) {
                                                        try {
                                                            XposedInterface.HookBuilder hookBuilderHook = xposedHelpers3.getModule().hook(method3);
                                                            final LocationHooker locationHooker2 = locationHooker;
                                                            final ClassLoader classLoader2 = classLoader;
                                                            XposedInterface.HookHandle hookHandleIntercept3 = hookBuilderHook.intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$lambda$3$$inlined$hookAllMethods$1
                                                                public Object intercept(XposedInterface.Chain chain2) {
                                                                    chain2.getClass();
                                                                    method3.getClass();
                                                                    Object obj = chain2.getArgs().get(0);
                                                                    JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                                                        int iOptInt = config$xposed_globalRelease.optInt("satellite_count", 20);
                                                                        boolean zOptBoolean = config$xposed_globalRelease.optBoolean("enable_jitter", true);
                                                                        GnssFastMockEngine gnssFastMockEngine = GnssFastMockEngine.INSTANCE;
                                                                        ClassLoader classLoader3 = cls.getClassLoader();
                                                                        if (classLoader3 == null) {
                                                                            classLoader3 = classLoader2;
                                                                        }
                                                                        Object orCreateSpoofedGnssStatus = gnssFastMockEngine.getOrCreateSpoofedGnssStatus(classLoader3, iOptInt, zOptBoolean, obj);
                                                                        if (orCreateSpoofedGnssStatus != null) {
                                                                            chain2.getArgs().set(0, orCreateSpoofedGnssStatus);
                                                                        }
                                                                    }
                                                                    List args = chain2.getArgs();
                                                                    args.getClass();
                                                                    return chain2.proceed(args.toArray(new Object[0]));
                                                                }
                                                            });
                                                            hookHandleIntercept3.getClass();
                                                            arrayList3.add(hookHandleIntercept3);
                                                            i3++;
                                                        } catch (Throwable th3) {
                                                            HookStatus.INSTANCE.error(cls.getName() + "#onSatelliteStatusChanged", th3);
                                                        }
                                                    }
                                                }
                                                HookStatus.INSTANCE.methodHooked(cls.getName(), "onSatelliteStatusChanged", i3);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept2.getClass();
                            arrayList2.add(hookHandleIntercept2);
                            i2++;
                        } catch (Throwable th3) {
                            HookStatus.INSTANCE.error(clsFindClass.getName() + "#registerGnssStatusCallback", th3);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass.getName(), "registerGnssStatusCallback", i2);
            } catch (Throwable th4) {
                XposedBridge.INSTANCE.log(th4);
            }
            try {
                XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                ArrayList arrayList3 = new ArrayList();
                d0 d0VarY3 = zm3.y(clsFindClass.getDeclaredMethods());
                int i3 = 0;
                while (d0VarY3.hasNext()) {
                    final Method method3 = (Method) d0VarY3.next();
                    if (o51.f(method3.getName(), "registerGnssMeasurementsCallback") && !Modifier.isAbstract(method3.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers3.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$$inlined$hookAllMethods$3
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    chain.getClass();
                                    method3.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Iterator it = args.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (next != null && LocationHooker.Companion.hasTypeByName(next.getClass(), "android.location.GnssMeasurementsEvent$Callback")) {
                                            break;
                                        }
                                    }
                                    if (next != null) {
                                        GnssStatusHookerKt.hookGnssStatus$suppressRealCallbackWhenActive(locationHooker, next, "onGnssMeasurementsReceived", "onStatusChanged");
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept3.getClass();
                            arrayList3.add(hookHandleIntercept3);
                            i3++;
                        } catch (Throwable th5) {
                            HookStatus.INSTANCE.error(clsFindClass.getName() + "#registerGnssMeasurementsCallback", th5);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass.getName(), "registerGnssMeasurementsCallback", i3);
            } catch (Throwable th6) {
                XposedBridge.INSTANCE.log(th6);
            }
            try {
                XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                ArrayList arrayList4 = new ArrayList();
                d0 d0VarY4 = zm3.y(clsFindClass.getDeclaredMethods());
                int i4 = 0;
                while (d0VarY4.hasNext()) {
                    final Method method4 = (Method) d0VarY4.next();
                    if (o51.f(method4.getName(), "registerGnssNavigationMessageCallback") && !Modifier.isAbstract(method4.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers4.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$$inlined$hookAllMethods$4
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    chain.getClass();
                                    method4.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Iterator it = args.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        if (next != null && LocationHooker.Companion.hasTypeByName(next.getClass(), "android.location.GnssNavigationMessage$Callback")) {
                                            break;
                                        }
                                    }
                                    if (next != null) {
                                        GnssStatusHookerKt.hookGnssStatus$suppressRealCallbackWhenActive(locationHooker, next, "onGnssNavigationMessageReceived", "onStatusChanged");
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept4.getClass();
                            arrayList4.add(hookHandleIntercept4);
                            i4++;
                        } catch (Throwable th7) {
                            HookStatus.INSTANCE.error(clsFindClass.getName() + "#registerGnssNavigationMessageCallback", th7);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass.getName(), "registerGnssNavigationMessageCallback", i4);
            } catch (Throwable th8) {
                XposedBridge.INSTANCE.log(th8);
            }
            XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
            ArrayList arrayList5 = new ArrayList();
            d0 d0VarY5 = zm3.y(clsFindClass.getDeclaredMethods());
            int i5 = 0;
            while (d0VarY5.hasNext()) {
                final Method method5 = (Method) d0VarY5.next();
                if (o51.f(method5.getName(), "getGpsStatus") && !Modifier.isAbstract(method5.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept5 = xposedHelpers5.getModule().hook(method5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$$inlined$hookAllMethods$5
                            public Object intercept(XposedInterface.Chain chain) {
                                Object objO0;
                                chain.getClass();
                                method5.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                    int iOptInt = config$xposed_globalRelease.optInt("satellite_count", 20);
                                    if (objProceed == null) {
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        objO0 = zy.o0(args2);
                                    } else {
                                        objO0 = objProceed;
                                    }
                                    if (objO0 != null) {
                                        try {
                                            XposedHelpers.INSTANCE.setObjectField(objO0, "mSatellites", GnssFastMockEngine.INSTANCE.getOrCreateSpoofedGpsSatellites(classLoader, iOptInt));
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                return objProceed;
                            }
                        });
                        hookHandleIntercept5.getClass();
                        arrayList5.add(hookHandleIntercept5);
                        i5++;
                    } catch (Throwable th9) {
                        HookStatus.INSTANCE.error(clsFindClass.getName() + "#getGpsStatus", th9);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClass.getName(), "getGpsStatus", i5);
            try {
                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                try {
                    Class<?> clsFindClass2 = xposedHelpers6.findClass("android.location.GpsStatus", classLoader);
                    Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    final Method methodFindMethodExact = xposedHelpers6.findMethodExact(clsFindClass2, "getSatellites", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    xposedHelpers6.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$$inlined$hookMethod$1
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                return GnssFastMockEngine.INSTANCE.getOrCreateSpoofedGpsSatellites(classLoader, config$xposed_globalRelease.optInt("satellite_count", 20));
                            }
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                    }).getClass();
                } catch (Throwable unused) {
                }
            } catch (Throwable th10) {
                XposedBridge.INSTANCE.log(th10);
            }
            XposedBridge.INSTANCE.log("[LocationSpoofer] GnssStatus hooks installed (High-Performance Engine)");
        } catch (Throwable th11) {
            XposedBridge.INSTANCE.log("[LocationSpoofer] GnssStatus hook failed: " + th11);
        }
        locationHooker.readConfig$xposed_globalRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hookGnssStatus$suppressRealCallbackWhenActive(final LocationHooker locationHooker, Object obj, String... strArr) {
        Class<?> cls = obj.getClass();
        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) != null) {
            return;
        }
        for (String str : strArr) {
            try {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(cls.getDeclaredMethods());
                int i = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), str) && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt$hookGnssStatus$suppressRealCallbackWhenActive$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return null;
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
                            HookStatus.INSTANCE.error(cls.getName() + "#" + str, th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), str, i);
            } catch (Throwable unused) {
            }
        }
    }
}
