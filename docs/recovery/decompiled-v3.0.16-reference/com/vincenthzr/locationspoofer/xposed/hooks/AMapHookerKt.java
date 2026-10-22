package com.vincenthzr.locationspoofer.xposed.hooks;

import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.d0;
import defpackage.l13;
import defpackage.o51;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AMapHookerKt {
    public static final void hookAMapSDK(final LocationHooker locationHooker, final ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("com.amap.api.location.AMapLocation", classLoader);
        int i = 0;
        if (clsFindClassIfExists != null && locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists, Boolean.TRUE) == null) {
            d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredConstructors());
            while (d0VarY.hasNext()) {
                final Constructor constructor = (Constructor) d0VarY.next();
                xposedHelpers.getModule().hook(constructor).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllConstructors$1
                    public Object intercept(XposedInterface.Chain chain) {
                        JSONObject config$xposed_globalRelease;
                        SpoofedMotion currentSpoofedMotion;
                        chain.getClass();
                        constructor.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        Object thisObject = chain.getThisObject();
                        if (thisObject != null && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null && config$xposed_globalRelease.optBoolean("active", false) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02")) != null) {
                            try {
                                XposedHelpers.INSTANCE.callMethod(thisObject, "setLatitude", Double.valueOf(currentSpoofedMotion.getLat()));
                            } catch (Throwable unused) {
                            }
                            try {
                                XposedHelpers.INSTANCE.callMethod(thisObject, "setLongitude", Double.valueOf(currentSpoofedMotion.getLng()));
                            } catch (Throwable unused2) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setDoubleField(thisObject, "mLatitude", currentSpoofedMotion.getLat());
                            } catch (Throwable unused3) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setDoubleField(thisObject, "mLongitude", currentSpoofedMotion.getLng());
                            } catch (Throwable unused4) {
                            }
                            try {
                                XposedHelpers.INSTANCE.callMethod(thisObject, "setLocationType", 1);
                            } catch (Throwable unused5) {
                            }
                            try {
                                XposedHelpers.INSTANCE.callMethod(thisObject, "setGpsAccuracyStatus", 1);
                            } catch (Throwable unused6) {
                            }
                            try {
                                XposedHelpers.INSTANCE.callMethod(thisObject, "setSatellites", Integer.valueOf(config$xposed_globalRelease.optInt("satellite_count", 20)));
                            } catch (Throwable unused7) {
                            }
                        }
                        return objProceed;
                    }
                }).getClass();
            }
            try {
                XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                ArrayList arrayList = new ArrayList();
                d0 d0VarY2 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i2 = 0;
                while (d0VarY2.hasNext()) {
                    final Method method = (Method) d0VarY2.next();
                    if (o51.f(method.getName(), "getLatitude") && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers2.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    SpoofedMotion currentSpoofedMotion;
                                    chain.getClass();
                                    method.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return (l13.A0(locationHooker.getCurrentPackageName$xposed_globalRelease(), ":").equals(SelfHostedUpdates.APPLICATION_ID) || (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02")) == null) ? chain.proceed(args.toArray(new Object[0])) : Double.valueOf(currentSpoofedMotion.getLat());
                                }
                            });
                            hookHandleIntercept.getClass();
                            arrayList.add(hookHandleIntercept);
                            i2++;
                        } catch (Throwable th) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getLatitude", th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getLatitude", i2);
                XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarY3 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i3 = 0;
                while (d0VarY3.hasNext()) {
                    final Method method2 = (Method) d0VarY3.next();
                    if (o51.f(method2.getName(), "getLongitude") && !Modifier.isAbstract(method2.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers3.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$2
                                public Object intercept(XposedInterface.Chain chain) {
                                    SpoofedMotion currentSpoofedMotion;
                                    chain.getClass();
                                    method2.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return (l13.A0(locationHooker.getCurrentPackageName$xposed_globalRelease(), ":").equals(SelfHostedUpdates.APPLICATION_ID) || (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02")) == null) ? chain.proceed(args.toArray(new Object[0])) : Double.valueOf(currentSpoofedMotion.getLng());
                                }
                            });
                            hookHandleIntercept2.getClass();
                            arrayList2.add(hookHandleIntercept2);
                            i3++;
                        } catch (Throwable th2) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getLongitude", th2);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getLongitude", i3);
                XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                ArrayList arrayList3 = new ArrayList();
                d0 d0VarY4 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i4 = 0;
                while (d0VarY4.hasNext()) {
                    final Method method3 = (Method) d0VarY4.next();
                    if (o51.f(method3.getName(), "getAccuracy") && !Modifier.isAbstract(method3.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers4.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$3
                                public Object intercept(XposedInterface.Chain chain) {
                                    JSONObject config$xposed_globalRelease;
                                    chain.getClass();
                                    method3.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return (l13.A0(locationHooker.getCurrentPackageName$xposed_globalRelease(), ":").equals(SelfHostedUpdates.APPLICATION_ID) || (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) == null || !config$xposed_globalRelease.optBoolean("active", false)) ? chain.proceed(args.toArray(new Object[0])) : Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker));
                                }
                            });
                            hookHandleIntercept3.getClass();
                            arrayList3.add(hookHandleIntercept3);
                            i4++;
                        } catch (Throwable th3) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getAccuracy", th3);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getAccuracy", i4);
                XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                ArrayList arrayList4 = new ArrayList();
                d0 d0VarY5 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i5 = 0;
                while (d0VarY5.hasNext()) {
                    final Method method4 = (Method) d0VarY5.next();
                    if (o51.f(method4.getName(), "getSpeed") && !Modifier.isAbstract(method4.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers5.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$4
                                public Object intercept(XposedInterface.Chain chain) {
                                    SpoofedMotion currentSpoofedMotion;
                                    chain.getClass();
                                    method4.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return (l13.A0(locationHooker.getCurrentPackageName$xposed_globalRelease(), ":").equals(SelfHostedUpdates.APPLICATION_ID) || (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02")) == null) ? chain.proceed(args.toArray(new Object[0])) : Float.valueOf(currentSpoofedMotion.getSpeed());
                                }
                            });
                            hookHandleIntercept4.getClass();
                            arrayList4.add(hookHandleIntercept4);
                            i5++;
                        } catch (Throwable th4) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getSpeed", th4);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getSpeed", i5);
                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                ArrayList arrayList5 = new ArrayList();
                d0 d0VarY6 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i6 = 0;
                while (d0VarY6.hasNext()) {
                    final Method method5 = (Method) d0VarY6.next();
                    if (o51.f(method5.getName(), "getBearing") && !Modifier.isAbstract(method5.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept5 = xposedHelpers6.getModule().hook(method5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$5
                                public Object intercept(XposedInterface.Chain chain) {
                                    SpoofedMotion currentSpoofedMotion;
                                    chain.getClass();
                                    method5.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return (l13.A0(locationHooker.getCurrentPackageName$xposed_globalRelease(), ":").equals(SelfHostedUpdates.APPLICATION_ID) || (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02")) == null) ? chain.proceed(args.toArray(new Object[0])) : Float.valueOf(currentSpoofedMotion.getBearing());
                                }
                            });
                            hookHandleIntercept5.getClass();
                            arrayList5.add(hookHandleIntercept5);
                            i6++;
                        } catch (Throwable th5) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getBearing", th5);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getBearing", i6);
                XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                ArrayList arrayList6 = new ArrayList();
                d0 d0VarY7 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i7 = 0;
                while (d0VarY7.hasNext()) {
                    final Method method6 = (Method) d0VarY7.next();
                    if (o51.f(method6.getName(), "getSatellites") && !Modifier.isAbstract(method6.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept6 = xposedHelpers7.getModule().hook(method6).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$6
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method6.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Integer.valueOf(config$xposed_globalRelease.optInt("satellite_count", 20));
                                }
                            });
                            hookHandleIntercept6.getClass();
                            arrayList6.add(hookHandleIntercept6);
                            i7++;
                        } catch (Throwable th6) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getSatellites", th6);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getSatellites", i7);
                XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                ArrayList arrayList7 = new ArrayList();
                d0 d0VarY8 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i8 = 0;
                while (d0VarY8.hasNext()) {
                    final Method method7 = (Method) d0VarY8.next();
                    if (o51.f(method7.getName(), "getGpsAccuracyStatus") && !Modifier.isAbstract(method7.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept7 = xposedHelpers8.getModule().hook(method7).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$7
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method7.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                                        return objProceed;
                                    }
                                    return 1;
                                }
                            });
                            hookHandleIntercept7.getClass();
                            arrayList7.add(hookHandleIntercept7);
                            i8++;
                        } catch (Throwable th7) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getGpsAccuracyStatus", th7);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getGpsAccuracyStatus", i8);
                XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
                ArrayList arrayList8 = new ArrayList();
                d0 d0VarY9 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i9 = 0;
                while (d0VarY9.hasNext()) {
                    final Method method8 = (Method) d0VarY9.next();
                    if (o51.f(method8.getName(), "getLocationType") && !Modifier.isAbstract(method8.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept8 = xposedHelpers9.getModule().hook(method8).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$8
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
                                    return 1;
                                }
                            });
                            hookHandleIntercept8.getClass();
                            arrayList8.add(hookHandleIntercept8);
                            i9++;
                        } catch (Throwable th8) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getLocationType", th8);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getLocationType", i9);
                XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
                ArrayList arrayList9 = new ArrayList();
                d0 d0VarY10 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i10 = 0;
                while (d0VarY10.hasNext()) {
                    final Method method9 = (Method) d0VarY10.next();
                    if (o51.f(method9.getName(), "getAltitude") && !Modifier.isAbstract(method9.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept9 = xposedHelpers10.getModule().hook(method9).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$9
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method9.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Double.valueOf(RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null));
                                }
                            });
                            hookHandleIntercept9.getClass();
                            arrayList9.add(hookHandleIntercept9);
                            i10++;
                        } catch (Throwable th9) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getAltitude", th9);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getAltitude", i10);
                XposedHelpers xposedHelpers11 = XposedHelpers.INSTANCE;
                ArrayList arrayList10 = new ArrayList();
                d0 d0VarY11 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i11 = 0;
                while (d0VarY11.hasNext()) {
                    final Method method10 = (Method) d0VarY11.next();
                    if (o51.f(method10.getName(), "getTime") && !Modifier.isAbstract(method10.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept10 = xposedHelpers11.getModule().hook(method10).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$10
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method10.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Long.valueOf(System.currentTimeMillis());
                                }
                            });
                            hookHandleIntercept10.getClass();
                            arrayList10.add(hookHandleIntercept10);
                            i11++;
                        } catch (Throwable th10) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getTime", th10);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getTime", i11);
                XposedHelpers xposedHelpers12 = XposedHelpers.INSTANCE;
                ArrayList arrayList11 = new ArrayList();
                d0 d0VarY12 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i12 = 0;
                while (d0VarY12.hasNext()) {
                    final Method method11 = (Method) d0VarY12.next();
                    if (o51.f(method11.getName(), "getErrorCode") && !Modifier.isAbstract(method11.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept11 = xposedHelpers12.getModule().hook(method11).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$11
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method11.getClass();
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
                            hookHandleIntercept11.getClass();
                            arrayList11.add(hookHandleIntercept11);
                            i12++;
                        } catch (Throwable th11) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getErrorCode", th11);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getErrorCode", i12);
                XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
                ArrayList arrayList12 = new ArrayList();
                d0 d0VarY13 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i13 = 0;
                while (d0VarY13.hasNext()) {
                    final Method method12 = (Method) d0VarY13.next();
                    if (o51.f(method12.getName(), "isMock") && !Modifier.isAbstract(method12.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept12 = xposedHelpers13.getModule().hook(method12).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$12
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method12.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Boolean.FALSE;
                                }
                            });
                            hookHandleIntercept12.getClass();
                            arrayList12.add(hookHandleIntercept12);
                            i13++;
                        } catch (Throwable th12) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#isMock", th12);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "isMock", i13);
                XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                ArrayList arrayList13 = new ArrayList();
                d0 d0VarY14 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i14 = 0;
                while (d0VarY14.hasNext()) {
                    final Method method13 = (Method) d0VarY14.next();
                    if (o51.f(method13.getName(), "isFixLastLocation") && !Modifier.isAbstract(method13.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept13 = xposedHelpers14.getModule().hook(method13).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$13
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method13.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Boolean.FALSE;
                                }
                            });
                            hookHandleIntercept13.getClass();
                            arrayList13.add(hookHandleIntercept13);
                            i14++;
                        } catch (Throwable th13) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#isFixLastLocation", th13);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "isFixLastLocation", i14);
                XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
                ArrayList arrayList14 = new ArrayList();
                d0 d0VarY15 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i15 = 0;
                while (d0VarY15.hasNext()) {
                    final Method method14 = (Method) d0VarY15.next();
                    if (o51.f(method14.getName(), "getMockData") && !Modifier.isAbstract(method14.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept14 = xposedHelpers15.getModule().hook(method14).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$14
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method14.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return null;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept14.getClass();
                            arrayList14.add(hookHandleIntercept14);
                            i15++;
                        } catch (Throwable th14) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getMockData", th14);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getMockData", i15);
                GoogleAndAddressHookerKt.hookAddressFields(locationHooker, clsFindClassIfExists, classLoader);
                XposedBridge.INSTANCE.log("[LocationSpoofer] AMapLocation hooks installed on " + clsFindClassIfExists.getName());
            } catch (Throwable th15) {
                XposedBridge.INSTANCE.log("[LocationSpoofer] AMapLocation hook failed: " + th15);
            }
        }
        XposedHelpers xposedHelpers16 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists2 = xposedHelpers16.findClassIfExists("com.amap.api.location.AMapLocationClient", classLoader);
        if (clsFindClassIfExists2 != null) {
            try {
                ArrayList arrayList15 = new ArrayList();
                d0 d0VarY16 = zm3.y(clsFindClassIfExists2.getDeclaredMethods());
                int i16 = 0;
                while (d0VarY16.hasNext()) {
                    final Method method15 = (Method) d0VarY16.next();
                    if (o51.f(method15.getName(), "setLocationListener") && !Modifier.isAbstract(method15.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept15 = xposedHelpers16.getModule().hook(method15).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$15
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method15.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objP0 = zy.p0(args, 0);
                                    if (objP0 != null) {
                                        try {
                                            Class<?> cls = objP0.getClass();
                                            if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) == null) {
                                                try {
                                                    XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
                                                    ArrayList arrayList16 = new ArrayList();
                                                    d0 d0VarY17 = zm3.y(cls.getDeclaredMethods());
                                                    int i17 = 0;
                                                    while (d0VarY17.hasNext()) {
                                                        final Method method16 = (Method) d0VarY17.next();
                                                        if (o51.f(method16.getName(), "onLocationChanged") && !Modifier.isAbstract(method16.getModifiers())) {
                                                            try {
                                                                XposedInterface.HookBuilder hookBuilderHook = xposedHelpers17.getModule().hook(method16);
                                                                final LocationHooker locationHooker2 = locationHooker;
                                                                XposedInterface.HookHandle hookHandleIntercept16 = hookBuilderHook.intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$lambda$16$$inlined$hookAllMethods$1
                                                                    public Object intercept(XposedInterface.Chain chain2) {
                                                                        chain2.getClass();
                                                                        method16.getClass();
                                                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                                        if (config$xposed_globalRelease == null) {
                                                                            List args2 = chain2.getArgs();
                                                                            args2.getClass();
                                                                            return chain2.proceed(args2.toArray(new Object[0]));
                                                                        }
                                                                        if (!config$xposed_globalRelease.optBoolean("active", false) || chain2.getArgs().isEmpty()) {
                                                                            List args3 = chain2.getArgs();
                                                                            args3.getClass();
                                                                            return chain2.proceed(args3.toArray(new Object[0]));
                                                                        }
                                                                        Object obj = chain2.getArgs().get(0);
                                                                        if (obj == null) {
                                                                            List args4 = chain2.getArgs();
                                                                            args4.getClass();
                                                                            return chain2.proceed(args4.toArray(new Object[0]));
                                                                        }
                                                                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "GCJ-02");
                                                                        if (currentSpoofedMotion == null) {
                                                                            List args5 = chain2.getArgs();
                                                                            args5.getClass();
                                                                            return chain2.proceed(args5.toArray(new Object[0]));
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setLatitude", Double.valueOf(currentSpoofedMotion.getLat()));
                                                                        } catch (Throwable unused) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setLongitude", Double.valueOf(currentSpoofedMotion.getLng()));
                                                                        } catch (Throwable unused2) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.setDoubleField(obj, "mLatitude", currentSpoofedMotion.getLat());
                                                                        } catch (Throwable unused3) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.setDoubleField(obj, "mLongitude", currentSpoofedMotion.getLng());
                                                                        } catch (Throwable unused4) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setAccuracy", Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker2)));
                                                                        } catch (Throwable unused5) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setSpeed", Float.valueOf(currentSpoofedMotion.getSpeed()));
                                                                        } catch (Throwable unused6) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setBearing", Float.valueOf(currentSpoofedMotion.getBearing()));
                                                                        } catch (Throwable unused7) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setAltitude", Double.valueOf(RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null)));
                                                                        } catch (Throwable unused8) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setTime", Long.valueOf(System.currentTimeMillis()));
                                                                        } catch (Throwable unused9) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setSatellites", Integer.valueOf(config$xposed_globalRelease.optInt("satellite_count", 20)));
                                                                        } catch (Throwable unused10) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setGpsAccuracyStatus", 1);
                                                                        } catch (Throwable unused11) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj, "setLocationType", 1);
                                                                        } catch (Throwable unused12) {
                                                                        }
                                                                        List args6 = chain2.getArgs();
                                                                        args6.getClass();
                                                                        return chain2.proceed(args6.toArray(new Object[0]));
                                                                    }
                                                                });
                                                                hookHandleIntercept16.getClass();
                                                                arrayList16.add(hookHandleIntercept16);
                                                                i17++;
                                                            } catch (Throwable th16) {
                                                                HookStatus.INSTANCE.error(cls.getName() + "#onLocationChanged", th16);
                                                            }
                                                        }
                                                    }
                                                    HookStatus.INSTANCE.methodHooked(cls.getName(), "onLocationChanged", i17);
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            if (LocationHooker.Companion.hasTypeByName(objP0.getClass(), "com.amap.api.location.AMapLocationListener")) {
                                                locationHooker.getCapturedAMapListeners$xposed_globalRelease().addIfAbsent(objP0);
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept15.getClass();
                            arrayList15.add(hookHandleIntercept15);
                            i16++;
                        } catch (Throwable th16) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists2.getName() + "#setLocationListener", th16);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists2.getName(), "setLocationListener", i16);
                XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
                ArrayList arrayList16 = new ArrayList();
                d0 d0VarY17 = zm3.y(clsFindClassIfExists2.getDeclaredMethods());
                int i17 = 0;
                while (d0VarY17.hasNext()) {
                    final Method method16 = (Method) d0VarY17.next();
                    if (o51.f(method16.getName(), "unRegisterLocationListener") && !Modifier.isAbstract(method16.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept16 = xposedHelpers17.getModule().hook(method16).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$16
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method16.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objP0 = zy.p0(args, 0);
                                    if (objP0 != null) {
                                        locationHooker.getCapturedAMapListeners$xposed_globalRelease().remove(objP0);
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept16.getClass();
                            arrayList16.add(hookHandleIntercept16);
                            i17++;
                        } catch (Throwable th17) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists2.getName() + "#unRegisterLocationListener", th17);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists2.getName(), "unRegisterLocationListener", i17);
                XposedHelpers xposedHelpers18 = XposedHelpers.INSTANCE;
                ArrayList arrayList17 = new ArrayList();
                d0 d0VarY18 = zm3.y(clsFindClassIfExists2.getDeclaredMethods());
                int i18 = 0;
                while (d0VarY18.hasNext()) {
                    final Method method17 = (Method) d0VarY18.next();
                    if (o51.f(method17.getName(), "getLastKnownLocation") && !Modifier.isAbstract(method17.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept17 = xposedHelpers18.getModule().hook(method17).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$17
                                public Object intercept(XposedInterface.Chain chain) {
                                    SpoofedMotion currentSpoofedMotion;
                                    Object objNewInstance;
                                    chain.getClass();
                                    method17.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "GCJ-02")) == null) {
                                        return objProceed;
                                    }
                                    if (objProceed == null) {
                                        try {
                                            objNewInstance = XposedHelpers.INSTANCE.findClass("com.amap.api.location.AMapLocation", classLoader).getConstructor(String.class).newInstance("gps");
                                        } catch (Throwable unused) {
                                            objNewInstance = null;
                                        }
                                    } else {
                                        objNewInstance = objProceed;
                                    }
                                    if (objNewInstance == null) {
                                        return objProceed;
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setLatitude", Double.valueOf(currentSpoofedMotion.getLat()));
                                    } catch (Throwable unused2) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setLongitude", Double.valueOf(currentSpoofedMotion.getLng()));
                                    } catch (Throwable unused3) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setDoubleField(objNewInstance, "mLatitude", currentSpoofedMotion.getLat());
                                    } catch (Throwable unused4) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setDoubleField(objNewInstance, "mLongitude", currentSpoofedMotion.getLng());
                                    } catch (Throwable unused5) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setLocationType", 1);
                                    } catch (Throwable unused6) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setGpsAccuracyStatus", 1);
                                    } catch (Throwable unused7) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setSatellites", Integer.valueOf(config$xposed_globalRelease.optInt("satellite_count", 20)));
                                    } catch (Throwable unused8) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setRadius", Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker)));
                                    } catch (Throwable unused9) {
                                    }
                                    return objNewInstance;
                                }
                            });
                            hookHandleIntercept17.getClass();
                            arrayList17.add(hookHandleIntercept17);
                            i18++;
                        } catch (Throwable th18) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists2.getName() + "#getLastKnownLocation", th18);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists2.getName(), "getLastKnownLocation", i18);
                XposedHelpers xposedHelpers19 = XposedHelpers.INSTANCE;
                ArrayList arrayList18 = new ArrayList();
                d0 d0VarY19 = zm3.y(clsFindClassIfExists2.getDeclaredMethods());
                int i19 = 0;
                while (d0VarY19.hasNext()) {
                    final Method method18 = (Method) d0VarY19.next();
                    if (o51.f(method18.getName(), "setMockEnable") && !Modifier.isAbstract(method18.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept18 = xposedHelpers19.getModule().hook(method18).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$18
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method18.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        if (!args.isEmpty()) {
                                            chain.getArgs().set(0, Boolean.TRUE);
                                        }
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept18.getClass();
                            arrayList18.add(hookHandleIntercept18);
                            i19++;
                        } catch (Throwable th19) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists2.getName() + "#setMockEnable", th19);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists2.getName(), "setMockEnable", i19);
            } catch (Throwable unused) {
            }
        }
        XposedHelpers xposedHelpers20 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists3 = xposedHelpers20.findClassIfExists("com.amap.api.location.AMapLocationQualityReport", classLoader);
        if (clsFindClassIfExists3 != null) {
            try {
                ArrayList arrayList19 = new ArrayList();
                d0 d0VarY20 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i20 = 0;
                while (d0VarY20.hasNext()) {
                    final Method method19 = (Method) d0VarY20.next();
                    if (o51.f(method19.getName(), "isWifiAble") && !Modifier.isAbstract(method19.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept19 = xposedHelpers20.getModule().hook(method19).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$19
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method19.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return Boolean.TRUE;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept19.getClass();
                            arrayList19.add(hookHandleIntercept19);
                            i20++;
                        } catch (Throwable th20) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#isWifiAble", th20);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "isWifiAble", i20);
                XposedHelpers xposedHelpers21 = XposedHelpers.INSTANCE;
                ArrayList arrayList20 = new ArrayList();
                d0 d0VarY21 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i21 = 0;
                while (d0VarY21.hasNext()) {
                    final Method method20 = (Method) d0VarY21.next();
                    if (o51.f(method20.getName(), "isInstalledHighDangerMockApp") && !Modifier.isAbstract(method20.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept20 = xposedHelpers21.getModule().hook(method20).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$20
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method20.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return Boolean.FALSE;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept20.getClass();
                            arrayList20.add(hookHandleIntercept20);
                            i21++;
                        } catch (Throwable th21) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#isInstalledHighDangerMockApp", th21);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "isInstalledHighDangerMockApp", i21);
                XposedHelpers xposedHelpers22 = XposedHelpers.INSTANCE;
                ArrayList arrayList21 = new ArrayList();
                d0 d0VarY22 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i22 = 0;
                while (d0VarY22.hasNext()) {
                    final Method method21 = (Method) d0VarY22.next();
                    if (o51.f(method21.getName(), "getGPSSatellites") && !Modifier.isAbstract(method21.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept21 = xposedHelpers22.getModule().hook(method21).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$21
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method21.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return Integer.valueOf(config$xposed_globalRelease.optInt("satellite_count", 20));
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept21.getClass();
                            arrayList21.add(hookHandleIntercept21);
                            i22++;
                        } catch (Throwable th22) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#getGPSSatellites", th22);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "getGPSSatellites", i22);
                XposedHelpers xposedHelpers23 = XposedHelpers.INSTANCE;
                ArrayList arrayList22 = new ArrayList();
                d0 d0VarY23 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                while (d0VarY23.hasNext()) {
                    final Method method22 = (Method) d0VarY23.next();
                    if (o51.f(method22.getName(), "getGPSStatus") && !Modifier.isAbstract(method22.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept22 = xposedHelpers23.getModule().hook(method22).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt$hookAMapSDK$$inlined$hookAllMethods$22
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method22.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return 0;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept22.getClass();
                            arrayList22.add(hookHandleIntercept22);
                            i++;
                        } catch (Throwable th23) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#getGPSStatus", th23);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "getGPSStatus", i);
            } catch (Throwable unused2) {
            }
        }
    }
}
