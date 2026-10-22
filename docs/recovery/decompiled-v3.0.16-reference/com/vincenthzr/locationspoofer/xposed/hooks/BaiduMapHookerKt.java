package com.vincenthzr.locationspoofer.xposed.hooks;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.az2;
import defpackage.d0;
import defpackage.i52;
import defpackage.o51;
import defpackage.zm3;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BaiduMapHookerKt {
    public static final void hookBaiduSDK(final LocationHooker locationHooker, final ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("com.baidu.location.BDLocation", classLoader);
        int i = 0;
        if (clsFindClassIfExists != null && locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists, Boolean.TRUE) == null) {
            d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredConstructors());
            while (d0VarY.hasNext()) {
                final Constructor constructor = (Constructor) d0VarY.next();
                xposedHelpers.getModule().hook(constructor).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllConstructors$1
                    public Object intercept(XposedInterface.Chain chain) {
                        JSONObject config$xposed_globalRelease;
                        chain.getClass();
                        constructor.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        Object thisObject = chain.getThisObject();
                        if (thisObject != null && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null && config$xposed_globalRelease.optBoolean("active", false)) {
                            String str = null;
                            try {
                                Object objCallMethod = XposedHelpers.INSTANCE.callMethod(thisObject, "getCoorType", new Object[0]);
                                if (objCallMethod instanceof String) {
                                    str = (String) objCallMethod;
                                }
                            } catch (Throwable unused) {
                            }
                            i52 i52VarResolveBaiduCoordSystem = BaiduMapHookerKt.resolveBaiduCoordSystem(str);
                            String str2 = (String) i52VarResolveBaiduCoordSystem.e;
                            boolean zBooleanValue = ((Boolean) i52VarResolveBaiduCoordSystem.f).booleanValue();
                            SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, str2);
                            if (currentSpoofedMotion != null) {
                                i52 i52VarBd09llToBd09mc = zBooleanValue ? CoordinateConverterKt.bd09llToBd09mc(currentSpoofedMotion.getLat(), currentSpoofedMotion.getLng()) : new i52(Double.valueOf(currentSpoofedMotion.getLat()), Double.valueOf(currentSpoofedMotion.getLng()));
                                double dDoubleValue = ((Number) i52VarBd09llToBd09mc.e).doubleValue();
                                double dDoubleValue2 = ((Number) i52VarBd09llToBd09mc.f).doubleValue();
                                try {
                                    XposedHelpers.INSTANCE.setDoubleField(thisObject, "mLatitude", dDoubleValue);
                                } catch (Throwable unused2) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setDoubleField(thisObject, "mLongitude", dDoubleValue2);
                                } catch (Throwable unused3) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setDoubleField(thisObject, "latitude", dDoubleValue);
                                } catch (Throwable unused4) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setDoubleField(thisObject, "longitude", dDoubleValue2);
                                } catch (Throwable unused5) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setObjectField(thisObject, "mCoorType", zBooleanValue ? "bd09mc" : "bd09ll");
                                } catch (Throwable unused6) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setIntField(thisObject, "mLocType", 61);
                                } catch (Throwable unused7) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setIntField(thisObject, "locType", 61);
                                } catch (Throwable unused8) {
                                }
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
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers2.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    String str = null;
                                    try {
                                        XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                                        Object thisObject = chain.getThisObject();
                                        thisObject.getClass();
                                        Object objCallMethod = xposedHelpers3.callMethod(thisObject, "getCoorType", new Object[0]);
                                        if (objCallMethod instanceof String) {
                                            str = (String) objCallMethod;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    i52 i52VarResolveBaiduCoordSystem = BaiduMapHookerKt.resolveBaiduCoordSystem(str);
                                    String str2 = (String) i52VarResolveBaiduCoordSystem.e;
                                    boolean zBooleanValue = ((Boolean) i52VarResolveBaiduCoordSystem.f).booleanValue();
                                    SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, str2);
                                    if (currentSpoofedMotion != null) {
                                        return zBooleanValue ? CoordinateConverterKt.bd09llToBd09mc(currentSpoofedMotion.getLat(), currentSpoofedMotion.getLng()).e : Double.valueOf(currentSpoofedMotion.getLat());
                                    }
                                    return objProceed;
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
                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers3.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$2
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method2.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    String str = null;
                                    try {
                                        XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                                        Object thisObject = chain.getThisObject();
                                        thisObject.getClass();
                                        Object objCallMethod = xposedHelpers4.callMethod(thisObject, "getCoorType", new Object[0]);
                                        if (objCallMethod instanceof String) {
                                            str = (String) objCallMethod;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    i52 i52VarResolveBaiduCoordSystem = BaiduMapHookerKt.resolveBaiduCoordSystem(str);
                                    String str2 = (String) i52VarResolveBaiduCoordSystem.e;
                                    boolean zBooleanValue = ((Boolean) i52VarResolveBaiduCoordSystem.f).booleanValue();
                                    SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, str2);
                                    if (currentSpoofedMotion != null) {
                                        return zBooleanValue ? CoordinateConverterKt.bd09llToBd09mc(currentSpoofedMotion.getLat(), currentSpoofedMotion.getLng()).f : Double.valueOf(currentSpoofedMotion.getLng());
                                    }
                                    return objProceed;
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
                try {
                    XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                    ArrayList arrayList3 = new ArrayList();
                    d0 d0VarY4 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                    int i4 = 0;
                    while (d0VarY4.hasNext()) {
                        final Method method3 = (Method) d0VarY4.next();
                        if (o51.f(method3.getName(), "getCoorType") && !Modifier.isAbstract(method3.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers4.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$3
                                    public Object intercept(XposedInterface.Chain chain) {
                                        chain.getClass();
                                        method3.getClass();
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                            String str = objProceed instanceof String ? (String) objProceed : null;
                                            if (str == null || str.length() == 0 || o51.f(str, "null")) {
                                                return "bd09ll";
                                            }
                                        }
                                        return objProceed;
                                    }
                                });
                                hookHandleIntercept3.getClass();
                                arrayList3.add(hookHandleIntercept3);
                                i4++;
                            } catch (Throwable th3) {
                                HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getCoorType", th3);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getCoorType", i4);
                } catch (Throwable unused) {
                }
                XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                ArrayList arrayList4 = new ArrayList();
                d0 d0VarY5 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i5 = 0;
                while (d0VarY5.hasNext()) {
                    final Method method4 = (Method) d0VarY5.next();
                    if (o51.f(method4.getName(), "getLocType") && !Modifier.isAbstract(method4.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers5.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$4
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method4.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                                        return objProceed;
                                    }
                                    Integer num = objProceed instanceof Integer ? (Integer) objProceed : null;
                                    int iIntValue = num != null ? num.intValue() : 61;
                                    if (iIntValue == 161 || iIntValue == 601) {
                                        return Integer.valueOf(iIntValue);
                                    }
                                    return 61;
                                }
                            });
                            hookHandleIntercept4.getClass();
                            arrayList4.add(hookHandleIntercept4);
                            i5++;
                        } catch (Throwable th4) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getLocType", th4);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getLocType", i5);
                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                ArrayList arrayList5 = new ArrayList();
                d0 d0VarY6 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i6 = 0;
                while (d0VarY6.hasNext()) {
                    final Method method5 = (Method) d0VarY6.next();
                    if (o51.f(method5.getName(), "getRadius") && !Modifier.isAbstract(method5.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept5 = xposedHelpers6.getModule().hook(method5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$5
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method5.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker));
                                }
                            });
                            hookHandleIntercept5.getClass();
                            arrayList5.add(hookHandleIntercept5);
                            i6++;
                        } catch (Throwable th5) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getRadius", th5);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getRadius", i6);
                XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                ArrayList arrayList6 = new ArrayList();
                d0 d0VarY7 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i7 = 0;
                while (d0VarY7.hasNext()) {
                    final Method method6 = (Method) d0VarY7.next();
                    if (o51.f(method6.getName(), "getSpeed") && !Modifier.isAbstract(method6.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept6 = xposedHelpers7.getModule().hook(method6).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$6
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method6.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return Float.valueOf(RouteEngine.calculateCurrentPosition$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null).getSpeed() * 3.6f);
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept6.getClass();
                            arrayList6.add(hookHandleIntercept6);
                            i7++;
                        } catch (Throwable th6) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getSpeed", th6);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getSpeed", i7);
                XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                ArrayList arrayList7 = new ArrayList();
                d0 d0VarY8 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i8 = 0;
                while (d0VarY8.hasNext()) {
                    final Method method7 = (Method) d0VarY8.next();
                    if (o51.f(method7.getName(), "hasSpeed") && !Modifier.isAbstract(method7.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept7 = xposedHelpers8.getModule().hook(method7).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$7
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method7.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return Boolean.TRUE;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept7.getClass();
                            arrayList7.add(hookHandleIntercept7);
                            i8++;
                        } catch (Throwable th7) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#hasSpeed", th7);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "hasSpeed", i8);
                XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
                ArrayList arrayList8 = new ArrayList();
                d0 d0VarY9 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i9 = 0;
                while (d0VarY9.hasNext()) {
                    final Method method8 = (Method) d0VarY9.next();
                    if (o51.f(method8.getName(), "getDirection") && !Modifier.isAbstract(method8.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept8 = xposedHelpers9.getModule().hook(method8).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$8
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method8.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return Float.valueOf(RouteEngine.calculateCurrentPosition$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null).getBearing());
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept8.getClass();
                            arrayList8.add(hookHandleIntercept8);
                            i9++;
                        } catch (Throwable th8) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getDirection", th8);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getDirection", i9);
                XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
                ArrayList arrayList9 = new ArrayList();
                d0 d0VarY10 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i10 = 0;
                while (d0VarY10.hasNext()) {
                    final Method method9 = (Method) d0VarY10.next();
                    if (o51.f(method9.getName(), "getGpsCheckStatus") && !Modifier.isAbstract(method9.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept9 = xposedHelpers10.getModule().hook(method9).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$9
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method9.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return 1;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept9.getClass();
                            arrayList9.add(hookHandleIntercept9);
                            i10++;
                        } catch (Throwable th9) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getGpsCheckStatus", th9);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getGpsCheckStatus", i10);
                XposedHelpers xposedHelpers11 = XposedHelpers.INSTANCE;
                ArrayList arrayList10 = new ArrayList();
                d0 d0VarY11 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i11 = 0;
                while (d0VarY11.hasNext()) {
                    final Method method10 = (Method) d0VarY11.next();
                    if (o51.f(method10.getName(), "getGpsAccuracyStatus") && !Modifier.isAbstract(method10.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept10 = xposedHelpers11.getModule().hook(method10).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$10
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method10.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return 1;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept10.getClass();
                            arrayList10.add(hookHandleIntercept10);
                            i11++;
                        } catch (Throwable th10) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getGpsAccuracyStatus", th10);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getGpsAccuracyStatus", i11);
                XposedHelpers xposedHelpers12 = XposedHelpers.INSTANCE;
                ArrayList arrayList11 = new ArrayList();
                d0 d0VarY12 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i12 = 0;
                while (d0VarY12.hasNext()) {
                    final Method method11 = (Method) d0VarY12.next();
                    if (o51.f(method11.getName(), "hasAddr") && !Modifier.isAbstract(method11.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept11 = xposedHelpers12.getModule().hook(method11).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$11
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method11.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return Boolean.TRUE;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept11.getClass();
                            arrayList11.add(hookHandleIntercept11);
                            i12++;
                        } catch (Throwable th11) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#hasAddr", th11);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "hasAddr", i12);
                XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
                ArrayList arrayList12 = new ArrayList();
                d0 d0VarY13 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i13 = 0;
                while (d0VarY13.hasNext()) {
                    final Method method12 = (Method) d0VarY13.next();
                    if (o51.f(method12.getName(), "hasAddress") && !Modifier.isAbstract(method12.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept12 = xposedHelpers13.getModule().hook(method12).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$12
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method12.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return Boolean.TRUE;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept12.getClass();
                            arrayList12.add(hookHandleIntercept12);
                            i13++;
                        } catch (Throwable th12) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#hasAddress", th12);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "hasAddress", i13);
                XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                ArrayList arrayList13 = new ArrayList();
                d0 d0VarY14 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i14 = 0;
                while (d0VarY14.hasNext()) {
                    final Method method13 = (Method) d0VarY14.next();
                    if (o51.f(method13.getName(), "getTime") && !Modifier.isAbstract(method13.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept13 = xposedHelpers14.getModule().hook(method13).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$13
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method13.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date());
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept13.getClass();
                            arrayList13.add(hookHandleIntercept13);
                            i14++;
                        } catch (Throwable th13) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getTime", th13);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getTime", i14);
                XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
                ArrayList arrayList14 = new ArrayList();
                d0 d0VarY15 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i15 = 0;
                while (d0VarY15.hasNext()) {
                    final Method method14 = (Method) d0VarY15.next();
                    if (o51.f(method14.getName(), "getMockGps") && !Modifier.isAbstract(method14.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept14 = xposedHelpers15.getModule().hook(method14).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$14
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method14.getClass();
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
                            hookHandleIntercept14.getClass();
                            arrayList14.add(hookHandleIntercept14);
                            i15++;
                        } catch (Throwable th14) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getMockGps", th14);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getMockGps", i15);
                try {
                    XposedHelpers xposedHelpers16 = XposedHelpers.INSTANCE;
                    ArrayList arrayList15 = new ArrayList();
                    d0 d0VarY16 = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                    int i16 = 0;
                    while (d0VarY16.hasNext()) {
                        final Method method15 = (Method) d0VarY16.next();
                        if (o51.f(method15.getName(), "getSatelliteNumber") && !Modifier.isAbstract(method15.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept15 = xposedHelpers16.getModule().hook(method15).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$15
                                    public Object intercept(XposedInterface.Chain chain) {
                                        chain.getClass();
                                        method15.getClass();
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Integer.valueOf(config$xposed_globalRelease.optInt("satellite_count", 20));
                                    }
                                });
                                hookHandleIntercept15.getClass();
                                arrayList15.add(hookHandleIntercept15);
                                i16++;
                            } catch (Throwable th15) {
                                HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#getSatelliteNumber", th15);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "getSatelliteNumber", i16);
                } catch (Throwable unused2) {
                }
                GoogleAndAddressHookerKt.hookAddressFields(locationHooker, clsFindClassIfExists, classLoader);
                XposedBridge.INSTANCE.log("[LocationSpoofer] BDLocation method hooks installed");
            } catch (Throwable th16) {
                XposedBridge.INSTANCE.log("[LocationSpoofer] BDLocation method hook failed: " + th16);
            }
        }
        for (String str : am1.G("com.baidu.location.BDAbstractLocationListener", "com.baidu.location.BDLocationListener")) {
            XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists2 = xposedHelpers17.findClassIfExists(str, classLoader);
            if (clsFindClassIfExists2 != null) {
                try {
                    ArrayList arrayList16 = new ArrayList();
                    d0 d0VarY17 = zm3.y(clsFindClassIfExists2.getDeclaredMethods());
                    int i17 = 0;
                    while (d0VarY17.hasNext()) {
                        final Method method16 = (Method) d0VarY17.next();
                        if (o51.f(method16.getName(), "onReceiveLocation") && !Modifier.isAbstract(method16.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept16 = xposedHelpers17.getModule().hook(method16).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$16
                                    public Object intercept(XposedInterface.Chain chain) {
                                        chain.getClass();
                                        method16.getClass();
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
                                        if (chain.getArgs().isEmpty()) {
                                            List args3 = chain.getArgs();
                                            args3.getClass();
                                            return chain.proceed(args3.toArray(new Object[0]));
                                        }
                                        Object obj = chain.getArgs().get(0);
                                        if (obj == null) {
                                            List args4 = chain.getArgs();
                                            args4.getClass();
                                            return chain.proceed(args4.toArray(new Object[0]));
                                        }
                                        String str2 = null;
                                        try {
                                            Object objCallMethod = XposedHelpers.INSTANCE.callMethod(obj, "getCoorType", new Object[0]);
                                            if (objCallMethod instanceof String) {
                                                str2 = (String) objCallMethod;
                                            }
                                        } catch (Throwable unused3) {
                                        }
                                        i52 i52VarResolveBaiduCoordSystem = BaiduMapHookerKt.resolveBaiduCoordSystem(str2);
                                        String str3 = (String) i52VarResolveBaiduCoordSystem.e;
                                        boolean zBooleanValue = ((Boolean) i52VarResolveBaiduCoordSystem.f).booleanValue();
                                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, str3);
                                        if (currentSpoofedMotion == null) {
                                            List args5 = chain.getArgs();
                                            args5.getClass();
                                            return chain.proceed(args5.toArray(new Object[0]));
                                        }
                                        double lat = currentSpoofedMotion.getLat();
                                        i52 i52VarBd09llToBd09mc = zBooleanValue ? CoordinateConverterKt.bd09llToBd09mc(lat, currentSpoofedMotion.getLng()) : new i52(Double.valueOf(lat), Double.valueOf(currentSpoofedMotion.getLng()));
                                        double dDoubleValue = ((Number) i52VarBd09llToBd09mc.e).doubleValue();
                                        double dDoubleValue2 = ((Number) i52VarBd09llToBd09mc.f).doubleValue();
                                        String str4 = zBooleanValue ? "bd09mc" : "bd09ll";
                                        XposedBridge xposedBridge = XposedBridge.INSTANCE;
                                        StringBuilder sb = new StringBuilder("onReceiveLocation coorType=");
                                        sb.append(str2);
                                        sb.append(" isMercator=");
                                        sb.append(zBooleanValue);
                                        sb.append(" inject=(");
                                        sb.append(dDoubleValue);
                                        az2.x(sb, ",", dDoubleValue2, ",");
                                        XposedBridge.logOpenCellIdEvery$default(xposedBridge, "baidu_onReceiveLocation", az2.p(sb, str4, ")"), 0L, 4, null);
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setLatitude", Double.valueOf(dDoubleValue));
                                        } catch (Throwable unused4) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setLongitude", Double.valueOf(dDoubleValue2));
                                        } catch (Throwable unused5) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setDoubleField(obj, "mLatitude", dDoubleValue);
                                        } catch (Throwable unused6) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setDoubleField(obj, "mLongitude", dDoubleValue2);
                                        } catch (Throwable unused7) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setDoubleField(obj, "latitude", dDoubleValue);
                                        } catch (Throwable unused8) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setDoubleField(obj, "longitude", dDoubleValue2);
                                        } catch (Throwable unused9) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setLocType", 61);
                                        } catch (Throwable unused10) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setIntField(obj, "mLocType", 61);
                                        } catch (Throwable unused11) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setIntField(obj, "locType", 61);
                                        } catch (Throwable unused12) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setCoorType", str4);
                                        } catch (Throwable unused13) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setObjectField(obj, "mCoorType", str4);
                                        } catch (Throwable unused14) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setRadius", Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker)));
                                        } catch (Throwable unused15) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setSpeed", Float.valueOf(currentSpoofedMotion.getSpeed() * 3.6f));
                                        } catch (Throwable unused16) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setDirection", Float.valueOf(currentSpoofedMotion.getBearing()));
                                        } catch (Throwable unused17) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setSatelliteNumber", 20);
                                        } catch (Throwable unused18) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setGpsCheckStatus", 1);
                                        } catch (Throwable unused19) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setMockGps", 0);
                                        } catch (Throwable unused20) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj, "setTime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()));
                                        } catch (Throwable unused21) {
                                        }
                                        List args6 = chain.getArgs();
                                        args6.getClass();
                                        return chain.proceed(args6.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept16.getClass();
                                arrayList16.add(hookHandleIntercept16);
                                i17++;
                            } catch (Throwable th17) {
                                HookStatus.INSTANCE.error(clsFindClassIfExists2.getName() + "#onReceiveLocation", th17);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsFindClassIfExists2.getName(), "onReceiveLocation", i17);
                    XposedBridge.INSTANCE.log("[LocationSpoofer] " + str + " callback hook installed");
                } catch (Throwable unused3) {
                }
            }
        }
        XposedHelpers xposedHelpers18 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists3 = xposedHelpers18.findClassIfExists("com.baidu.location.LocationClient", classLoader);
        if (clsFindClassIfExists3 != null) {
            try {
                ArrayList arrayList17 = new ArrayList();
                d0 d0VarY18 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i18 = 0;
                while (d0VarY18.hasNext()) {
                    final Method method17 = (Method) d0VarY18.next();
                    if (o51.f(method17.getName(), "registerLocationListener") && !Modifier.isAbstract(method17.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept17 = xposedHelpers18.getModule().hook(method17).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$17
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method17.getClass();
                                    Object obj = chain.getArgs().get(0);
                                    if (obj != null) {
                                        try {
                                            Class<?> cls = obj.getClass();
                                            if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) == null) {
                                                try {
                                                    XposedHelpers xposedHelpers19 = XposedHelpers.INSTANCE;
                                                    ArrayList arrayList18 = new ArrayList();
                                                    d0 d0VarY19 = zm3.y(cls.getDeclaredMethods());
                                                    int i19 = 0;
                                                    while (d0VarY19.hasNext()) {
                                                        final Method method18 = (Method) d0VarY19.next();
                                                        if (o51.f(method18.getName(), "onReceiveLocation") && !Modifier.isAbstract(method18.getModifiers())) {
                                                            try {
                                                                XposedInterface.HookBuilder hookBuilderHook = xposedHelpers19.getModule().hook(method18);
                                                                final LocationHooker locationHooker2 = locationHooker;
                                                                XposedInterface.HookHandle hookHandleIntercept18 = hookBuilderHook.intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$lambda$18$$inlined$hookAllMethods$1
                                                                    public Object intercept(XposedInterface.Chain chain2) {
                                                                        chain2.getClass();
                                                                        method18.getClass();
                                                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                                        if (config$xposed_globalRelease == null) {
                                                                            List args = chain2.getArgs();
                                                                            args.getClass();
                                                                            return chain2.proceed(args.toArray(new Object[0]));
                                                                        }
                                                                        if (!config$xposed_globalRelease.optBoolean("active", false) || chain2.getArgs().isEmpty()) {
                                                                            List args2 = chain2.getArgs();
                                                                            args2.getClass();
                                                                            return chain2.proceed(args2.toArray(new Object[0]));
                                                                        }
                                                                        Object obj2 = chain2.getArgs().get(0);
                                                                        if (obj2 == null) {
                                                                            List args3 = chain2.getArgs();
                                                                            args3.getClass();
                                                                            return chain2.proceed(args3.toArray(new Object[0]));
                                                                        }
                                                                        String str2 = null;
                                                                        try {
                                                                            Object objCallMethod = XposedHelpers.INSTANCE.callMethod(obj2, "getCoorType", new Object[0]);
                                                                            if (objCallMethod instanceof String) {
                                                                                str2 = (String) objCallMethod;
                                                                            }
                                                                        } catch (Throwable unused4) {
                                                                        }
                                                                        i52 i52VarResolveBaiduCoordSystem = BaiduMapHookerKt.resolveBaiduCoordSystem(str2);
                                                                        String str3 = (String) i52VarResolveBaiduCoordSystem.e;
                                                                        boolean zBooleanValue = ((Boolean) i52VarResolveBaiduCoordSystem.f).booleanValue();
                                                                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, str3);
                                                                        if (currentSpoofedMotion == null) {
                                                                            List args4 = chain2.getArgs();
                                                                            args4.getClass();
                                                                            return chain2.proceed(args4.toArray(new Object[0]));
                                                                        }
                                                                        double lat = currentSpoofedMotion.getLat();
                                                                        i52 i52VarBd09llToBd09mc = zBooleanValue ? CoordinateConverterKt.bd09llToBd09mc(lat, currentSpoofedMotion.getLng()) : new i52(Double.valueOf(lat), Double.valueOf(currentSpoofedMotion.getLng()));
                                                                        double dDoubleValue = ((Number) i52VarBd09llToBd09mc.e).doubleValue();
                                                                        double dDoubleValue2 = ((Number) i52VarBd09llToBd09mc.f).doubleValue();
                                                                        String str4 = zBooleanValue ? "bd09mc" : "bd09ll";
                                                                        XposedBridge xposedBridge = XposedBridge.INSTANCE;
                                                                        StringBuilder sb = new StringBuilder("registerLocationListener onReceiveLocation coorType=");
                                                                        sb.append(str2);
                                                                        sb.append(" isMercator=");
                                                                        sb.append(zBooleanValue);
                                                                        sb.append(" inject=(");
                                                                        sb.append(dDoubleValue);
                                                                        az2.x(sb, ",", dDoubleValue2, ",");
                                                                        XposedBridge.logOpenCellIdEvery$default(xposedBridge, "baidu_registerListener_onReceiveLocation", az2.p(sb, str4, ")"), 0L, 4, null);
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setLatitude", Double.valueOf(dDoubleValue));
                                                                        } catch (Throwable unused5) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setLongitude", Double.valueOf(dDoubleValue2));
                                                                        } catch (Throwable unused6) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.setDoubleField(obj2, "mLatitude", dDoubleValue);
                                                                        } catch (Throwable unused7) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.setDoubleField(obj2, "mLongitude", dDoubleValue2);
                                                                        } catch (Throwable unused8) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setLocType", 61);
                                                                        } catch (Throwable unused9) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.setIntField(obj2, "mLocType", 61);
                                                                        } catch (Throwable unused10) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setCoorType", str4);
                                                                        } catch (Throwable unused11) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.setObjectField(obj2, "mCoorType", str4);
                                                                        } catch (Throwable unused12) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setRadius", Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker2)));
                                                                        } catch (Throwable unused13) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setSpeed", Float.valueOf(currentSpoofedMotion.getSpeed() * 3.6f));
                                                                        } catch (Throwable unused14) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setDirection", Float.valueOf(currentSpoofedMotion.getBearing()));
                                                                        } catch (Throwable unused15) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setSatelliteNumber", 20);
                                                                        } catch (Throwable unused16) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setGpsCheckStatus", 1);
                                                                        } catch (Throwable unused17) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setMockGps", 0);
                                                                        } catch (Throwable unused18) {
                                                                        }
                                                                        try {
                                                                            XposedHelpers.INSTANCE.callMethod(obj2, "setTime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()));
                                                                        } catch (Throwable unused19) {
                                                                        }
                                                                        List args5 = chain2.getArgs();
                                                                        args5.getClass();
                                                                        return chain2.proceed(args5.toArray(new Object[0]));
                                                                    }
                                                                });
                                                                hookHandleIntercept18.getClass();
                                                                arrayList18.add(hookHandleIntercept18);
                                                                i19++;
                                                            } catch (Throwable th18) {
                                                                HookStatus.INSTANCE.error(cls.getName() + "#onReceiveLocation", th18);
                                                            }
                                                        }
                                                    }
                                                    HookStatus.INSTANCE.methodHooked(cls.getName(), "onReceiveLocation", i19);
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                            LocationHooker.Companion companion = LocationHooker.Companion;
                                            if (companion.hasTypeByName(obj.getClass(), "com.baidu.location.BDAbstractLocationListener") || companion.hasTypeByName(obj.getClass(), "com.baidu.location.BDLocationListener")) {
                                                locationHooker.getCapturedBaiduListeners$xposed_globalRelease().addIfAbsent(obj);
                                            }
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept17.getClass();
                            arrayList17.add(hookHandleIntercept17);
                            i18++;
                        } catch (Throwable th18) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#registerLocationListener", th18);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "registerLocationListener", i18);
                XposedHelpers xposedHelpers19 = XposedHelpers.INSTANCE;
                ArrayList arrayList18 = new ArrayList();
                d0 d0VarY19 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i19 = 0;
                while (d0VarY19.hasNext()) {
                    final Method method18 = (Method) d0VarY19.next();
                    if (o51.f(method18.getName(), "unRegisterLocationListener") && !Modifier.isAbstract(method18.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept18 = xposedHelpers19.getModule().hook(method18).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$18
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method18.getClass();
                                    Object obj = chain.getArgs().get(0);
                                    if (obj != null) {
                                        locationHooker.getCapturedBaiduListeners$xposed_globalRelease().remove(obj);
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept18.getClass();
                            arrayList18.add(hookHandleIntercept18);
                            i19++;
                        } catch (Throwable th19) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#unRegisterLocationListener", th19);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "unRegisterLocationListener", i19);
                XposedHelpers xposedHelpers20 = XposedHelpers.INSTANCE;
                ArrayList arrayList19 = new ArrayList();
                d0 d0VarY20 = zm3.y(clsFindClassIfExists3.getDeclaredMethods());
                int i20 = 0;
                while (d0VarY20.hasNext()) {
                    final Method method19 = (Method) d0VarY20.next();
                    if (o51.f(method19.getName(), "getLastKnownLocation") && !Modifier.isAbstract(method19.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept19 = xposedHelpers20.getModule().hook(method19).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$19
                                /* JADX WARN: Code duplicated, block: B:12:0x003e  */
                                public Object intercept(XposedInterface.Chain chain) {
                                    String str2;
                                    chain.getClass();
                                    method19.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                                        return objProceed;
                                    }
                                    Object objNewInstance = null;
                                    if (objProceed != null) {
                                        try {
                                            Object objCallMethod = XposedHelpers.INSTANCE.callMethod(objProceed, "getCoorType", new Object[0]);
                                            if (objCallMethod instanceof String) {
                                                str2 = (String) objCallMethod;
                                            } else {
                                                str2 = null;
                                            }
                                        } catch (Throwable unused4) {
                                        }
                                    } else {
                                        str2 = null;
                                    }
                                    i52 i52VarResolveBaiduCoordSystem = BaiduMapHookerKt.resolveBaiduCoordSystem(str2);
                                    String str3 = (String) i52VarResolveBaiduCoordSystem.e;
                                    boolean zBooleanValue = ((Boolean) i52VarResolveBaiduCoordSystem.f).booleanValue();
                                    SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, str3);
                                    if (currentSpoofedMotion == null) {
                                        return objProceed;
                                    }
                                    double lat = currentSpoofedMotion.getLat();
                                    i52 i52VarBd09llToBd09mc = zBooleanValue ? CoordinateConverterKt.bd09llToBd09mc(lat, currentSpoofedMotion.getLng()) : new i52(Double.valueOf(lat), Double.valueOf(currentSpoofedMotion.getLng()));
                                    double dDoubleValue = ((Number) i52VarBd09llToBd09mc.e).doubleValue();
                                    double dDoubleValue2 = ((Number) i52VarBd09llToBd09mc.f).doubleValue();
                                    String str4 = zBooleanValue ? "bd09mc" : "bd09ll";
                                    if (objProceed == null) {
                                        try {
                                            objNewInstance = XposedHelpers.INSTANCE.findClass("com.baidu.location.BDLocation", classLoader).getConstructor(null).newInstance(null);
                                        } catch (Throwable unused5) {
                                        }
                                    } else {
                                        objNewInstance = objProceed;
                                    }
                                    if (objNewInstance == null) {
                                        return objProceed;
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setLatitude", Double.valueOf(dDoubleValue));
                                    } catch (Throwable unused6) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setLongitude", Double.valueOf(dDoubleValue2));
                                    } catch (Throwable unused7) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setDoubleField(objNewInstance, "mLatitude", dDoubleValue);
                                    } catch (Throwable unused8) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setDoubleField(objNewInstance, "mLongitude", dDoubleValue2);
                                    } catch (Throwable unused9) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setLocType", 61);
                                    } catch (Throwable unused10) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setIntField(objNewInstance, "mLocType", 61);
                                    } catch (Throwable unused11) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setCoorType", str4);
                                    } catch (Throwable unused12) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mCoorType", str4);
                                    } catch (Throwable unused13) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setRadius", Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker)));
                                    } catch (Throwable unused14) {
                                    }
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setSatelliteNumber", 20);
                                    } catch (Throwable unused15) {
                                    }
                                    return objNewInstance;
                                }
                            });
                            hookHandleIntercept19.getClass();
                            arrayList19.add(hookHandleIntercept19);
                            i20++;
                        } catch (Throwable th20) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists3.getName() + "#getLastKnownLocation", th20);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists3.getName(), "getLastKnownLocation", i20);
            } catch (Throwable unused4) {
            }
        }
        XposedHelpers xposedHelpers21 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists4 = xposedHelpers21.findClassIfExists("com.baidu.mapapi.map.MyLocationData", classLoader);
        XposedBridge.INSTANCE.log("[LocationSpoofer] MyLocationData class found=" + (clsFindClassIfExists4 != null) + " classLoader=" + classLoader);
        if (clsFindClassIfExists4 != null && locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists4, Boolean.TRUE) == null) {
            try {
                d0 d0VarY21 = zm3.y(clsFindClassIfExists4.getDeclaredConstructors());
                while (d0VarY21.hasNext()) {
                    final Constructor constructor2 = (Constructor) d0VarY21.next();
                    xposedHelpers21.getModule().hook(constructor2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllConstructors$2
                        public Object intercept(XposedInterface.Chain chain) {
                            JSONObject config$xposed_globalRelease;
                            SpoofedMotion currentSpoofedMotion;
                            chain.getClass();
                            constructor2.getClass();
                            List args = chain.getArgs();
                            args.getClass();
                            Object objProceed = chain.proceed(args.toArray(new Object[0]));
                            Object thisObject = chain.getThisObject();
                            if (thisObject != null && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null && config$xposed_globalRelease.optBoolean("active", false) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "BD-09")) != null) {
                                XposedBridge.logOpenCellIdEvery$default(XposedBridge.INSTANCE, "baidu_myLocationData_ctor", "MyLocationData constructor inject lat=" + currentSpoofedMotion.getLat() + " lng=" + currentSpoofedMotion.getLng(), 0L, 4, null);
                                try {
                                    XposedHelpers.INSTANCE.setDoubleField(thisObject, "latitude", currentSpoofedMotion.getLat());
                                } catch (Throwable unused5) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setDoubleField(thisObject, "longitude", currentSpoofedMotion.getLng());
                                } catch (Throwable unused6) {
                                }
                            }
                            return objProceed;
                        }
                    }).getClass();
                }
            } catch (Throwable unused5) {
            }
        }
        XposedHelpers xposedHelpers22 = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists5 = xposedHelpers22.findClassIfExists("com.baidu.mapapi.map.BaiduMap", classLoader);
        XposedBridge.INSTANCE.log("[LocationSpoofer] BaiduMap class found=" + (clsFindClassIfExists5 != null) + " classLoader=" + classLoader);
        if (clsFindClassIfExists5 == null || locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists5, Boolean.TRUE) != null) {
            return;
        }
        try {
            ArrayList arrayList20 = new ArrayList();
            d0 d0VarY22 = zm3.y(clsFindClassIfExists5.getDeclaredMethods());
            while (d0VarY22.hasNext()) {
                final Method method20 = (Method) d0VarY22.next();
                if (o51.f(method20.getName(), "setMyLocationData") && !Modifier.isAbstract(method20.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept20 = xposedHelpers22.getModule().hook(method20).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt$hookBaiduSDK$$inlined$hookAllMethods$20
                            public Object intercept(XposedInterface.Chain chain) {
                                Object obj;
                                SpoofedMotion currentSpoofedMotion;
                                Object objectField;
                                chain.getClass();
                                method20.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    if (!args.isEmpty() && (obj = chain.getArgs().get(0)) != null && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "BD-09")) != null) {
                                        Object objectField2 = null;
                                        try {
                                            objectField = XposedHelpers.INSTANCE.getObjectField(obj, "latitude");
                                        } catch (Throwable unused6) {
                                            objectField = null;
                                        }
                                        try {
                                            objectField2 = XposedHelpers.INSTANCE.getObjectField(obj, "longitude");
                                        } catch (Throwable unused7) {
                                        }
                                        XposedBridge.logOpenCellIdEvery$default(XposedBridge.INSTANCE, "baidu_setMyLocationData", "setMyLocationData before=(" + objectField + "," + objectField2 + ") inject=(" + currentSpoofedMotion.getLat() + "," + currentSpoofedMotion.getLng() + ")", 0L, 4, null);
                                        try {
                                            XposedHelpers.INSTANCE.setDoubleField(obj, "latitude", currentSpoofedMotion.getLat());
                                        } catch (Throwable unused8) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.setDoubleField(obj, "longitude", currentSpoofedMotion.getLng());
                                        } catch (Throwable unused9) {
                                        }
                                    }
                                }
                                List args2 = chain.getArgs();
                                args2.getClass();
                                return chain.proceed(args2.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept20.getClass();
                        arrayList20.add(hookHandleIntercept20);
                        i++;
                    } catch (Throwable th21) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists5.getName() + "#setMyLocationData", th21);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists5.getName(), "setMyLocationData", i);
        } catch (Throwable unused6) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i52 resolveBaiduCoordSystem(String str) {
        String lowerCase;
        XposedBridge.logOpenCellIdEvery$default(XposedBridge.INSTANCE, "baidu_coorType_".concat(str == null ? "null" : str), az2.j("resolveBaiduCoordSystem coorType=", str), 0L, 4, null);
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1395470175) {
                if (iHashCode != 98175376) {
                    if (iHashCode == 113079775 && lowerCase.equals("wgs84")) {
                        return new i52("WGS-84", Boolean.FALSE);
                    }
                } else if (lowerCase.equals("gcj02")) {
                    return new i52("GCJ-02", Boolean.FALSE);
                }
            } else if (lowerCase.equals("bd09mc")) {
                return new i52("BD-09", Boolean.TRUE);
            }
        }
        return new i52("BD-09", Boolean.FALSE);
    }
}
