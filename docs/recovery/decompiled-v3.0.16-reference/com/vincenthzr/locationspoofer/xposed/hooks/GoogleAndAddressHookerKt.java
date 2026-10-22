package com.vincenthzr.locationspoofer.xposed.hooks;

import android.location.Location;
import android.os.SystemClock;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.az2;
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
public final class GoogleAndAddressHookerKt {
    public static final void hookAddressFields(final LocationHooker locationHooker, Class<?> cls, ClassLoader classLoader) {
        locationHooker.getClass();
        cls.getClass();
        classLoader.getClass();
        String[] strArr = {"getCity", "getProvince", "getDistrict", "getAddress", "getAddrStr", "getCountry", "getNation", "getStreet", "getStreetNum", "getStreetNumber", "getStreetNo", "getCityCode", "getAdCode", "getPoiName", "getAoiName", "getTown", "getVillage", "getLocationDescribe"};
        for (int i = 0; i < 18; i++) {
            String str = strArr[i];
            try {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(cls.getDeclaredMethods());
                int i2 = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), str) && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GoogleAndAddressHookerKt$hookAddressFields$$inlined$hookAllMethods$1
                                    public Object intercept(XposedInterface.Chain chain) {
                                        JSONObject config$xposed_globalRelease;
                                        String str2;
                                        chain.getClass();
                                        Method method2 = method;
                                        method2.getClass();
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                        if (o51.f(method2.getReturnType(), String.class) && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                            String str3 = objProceed instanceof String ? (String) objProceed : null;
                                            if (str3 == null || str3.length() == 0 || l13.c0(str3, "Unknown", true)) {
                                                String name = method2.getName();
                                                if (name == null) {
                                                    return "";
                                                }
                                                switch (name.hashCode()) {
                                                    case -1928105724:
                                                        return !name.equals("getDistrict") ? "" : locationHooker.getCachedDistrict$xposed_globalRelease();
                                                    case -426007910:
                                                        if (!name.equals("getStreetNo")) {
                                                            return "";
                                                        }
                                                        return locationHooker.getCachedStreetNum$xposed_globalRelease();
                                                    case -321343027:
                                                        if (!name.equals("getStreetNum")) {
                                                            return "";
                                                        }
                                                        return locationHooker.getCachedStreetNum$xposed_globalRelease();
                                                    case -268002026:
                                                        return !name.equals("getLocationDescribe") ? "" : az2.k("在", locationHooker.getCachedPoiName$xposed_globalRelease(), "附近");
                                                    case -110848950:
                                                        if (!name.equals("getAddrStr")) {
                                                            return "";
                                                        }
                                                        return locationHooker.getCachedAddress$xposed_globalRelease();
                                                    case -110831682:
                                                        if (!name.equals("getAddress")) {
                                                            return "";
                                                        }
                                                        return locationHooker.getCachedAddress$xposed_globalRelease();
                                                    case -75628063:
                                                        return name.equals("getCity") ? locationHooker.getCachedCity$xposed_globalRelease() : "";
                                                    case -75115768:
                                                        str2 = "getTown";
                                                        name.equals(str2);
                                                        return "";
                                                    case 207630064:
                                                        return !name.equals("getAoiName") ? "" : locationHooker.getCachedPoiName$xposed_globalRelease();
                                                    case 272533414:
                                                        str2 = "getAdCode";
                                                        name.equals(str2);
                                                        return "";
                                                    case 352082850:
                                                        if (!name.equals("getStreetNumber")) {
                                                            return "";
                                                        }
                                                        return locationHooker.getCachedStreetNum$xposed_globalRelease();
                                                    case 635283391:
                                                        return !name.equals("getPoiName") ? "" : locationHooker.getCachedPoiName$xposed_globalRelease();
                                                    case 643396157:
                                                        if (!name.equals("getNation")) {
                                                            return "";
                                                        }
                                                        return locationHooker.getCachedCountry$xposed_globalRelease();
                                                    case 655903598:
                                                        str2 = "getCityCode";
                                                        name.equals(str2);
                                                        return "";
                                                    case 804025081:
                                                        return !name.equals("getStreet") ? "" : locationHooker.getCachedStreet$xposed_globalRelease();
                                                    case 1090414758:
                                                        return !name.equals("getProvince") ? "" : locationHooker.getCachedProvince$xposed_globalRelease();
                                                    case 1497227382:
                                                        str2 = "getVillage";
                                                        name.equals(str2);
                                                        return "";
                                                    case 1994691424:
                                                        if (!name.equals("getCountry")) {
                                                            return "";
                                                        }
                                                        return locationHooker.getCachedCountry$xposed_globalRelease();
                                                    default:
                                                        return "";
                                                }
                                            }
                                        }
                                        return objProceed;
                                    }
                                });
                                hookHandleIntercept.getClass();
                                arrayList.add(hookHandleIntercept);
                                i2++;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    HookStatus.INSTANCE.error(cls.getName() + "#" + str, th);
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), str, i2);
            } catch (Throwable unused2) {
            }
        }
    }

    public static final void hookGoogleFusedLocation(final LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Class<?> clsFindClass = xposedHelpers.findClass("com.google.android.gms.location.FusedLocationProviderClient", classLoader);
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(clsFindClass.getDeclaredMethods());
            int i = 0;
            int i2 = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "requestLocationUpdates") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GoogleAndAddressHookerKt$hookGoogleFusedLocation$$inlined$hookAllMethods$1
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method.getClass();
                                Iterator it = chain.getArgs().iterator();
                                while (true) {
                                    int i3 = 0;
                                    if (!it.hasNext()) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        return chain.proceed(args.toArray(new Object[0]));
                                    }
                                    Object next = it.next();
                                    if (next != null && LocationHooker.Companion.hasTypeByName(next.getClass(), "com.google.android.gms.location.LocationCallback")) {
                                        locationHooker.getCapturedFusedLocationCallbacks$xposed_globalRelease().addIfAbsent(next);
                                        Class<?> cls = next.getClass();
                                        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) == null) {
                                            try {
                                                XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                                                ArrayList arrayList2 = new ArrayList();
                                                d0 d0VarY2 = zm3.y(cls.getDeclaredMethods());
                                                while (d0VarY2.hasNext()) {
                                                    final Method method2 = (Method) d0VarY2.next();
                                                    if (o51.f(method2.getName(), "onLocationResult") && !Modifier.isAbstract(method2.getModifiers())) {
                                                        try {
                                                            XposedInterface.HookBuilder hookBuilderHook = xposedHelpers2.getModule().hook(method2);
                                                            final LocationHooker locationHooker2 = locationHooker;
                                                            XposedInterface.HookHandle hookHandleIntercept2 = hookBuilderHook.intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GoogleAndAddressHookerKt$hookGoogleFusedLocation$lambda$3$$inlined$hookAllMethods$1
                                                                public Object intercept(XposedInterface.Chain chain2) {
                                                                    SpoofedMotion currentSpoofedMotion;
                                                                    chain2.getClass();
                                                                    method2.getClass();
                                                                    JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(locationHooker2.getCurrentPackageName$xposed_globalRelease(), ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                                                                        List args2 = chain2.getArgs();
                                                                        args2.getClass();
                                                                        Object objP0 = zy.p0(args2, 0);
                                                                        if (objP0 != null) {
                                                                            try {
                                                                                Object objCallMethod = XposedHelpers.INSTANCE.callMethod(objP0, "getLocations", new Object[0]);
                                                                                List list = objCallMethod instanceof List ? (List) objCallMethod : null;
                                                                                if (list != null) {
                                                                                    for (Object obj : list) {
                                                                                        if ((obj instanceof Location) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84")) != null) {
                                                                                            ((Location) obj).setLatitude(currentSpoofedMotion.getLat());
                                                                                            ((Location) obj).setLongitude(currentSpoofedMotion.getLng());
                                                                                            ((Location) obj).setAccuracy(CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                                                            ((Location) obj).setSpeed(currentSpoofedMotion.getSpeed());
                                                                                            ((Location) obj).setBearing(currentSpoofedMotion.getBearing());
                                                                                            ((Location) obj).setTime(System.currentTimeMillis());
                                                                                            ((Location) obj).setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } catch (Throwable unused) {
                                                                            }
                                                                        }
                                                                    }
                                                                    List args3 = chain2.getArgs();
                                                                    args3.getClass();
                                                                    return chain2.proceed(args3.toArray(new Object[0]));
                                                                }
                                                            });
                                                            hookHandleIntercept2.getClass();
                                                            arrayList2.add(hookHandleIntercept2);
                                                            i3++;
                                                        } catch (Throwable th) {
                                                            HookStatus.INSTANCE.error(cls.getName() + "#onLocationResult", th);
                                                        }
                                                    }
                                                }
                                                HookStatus.INSTANCE.methodHooked(cls.getName(), "onLocationResult", i3);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        });
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i2++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(clsFindClass.getName() + "#requestLocationUpdates", th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClass.getName(), "requestLocationUpdates", i2);
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            d0 d0VarY2 = zm3.y(clsFindClass.getDeclaredMethods());
            int i3 = 0;
            while (d0VarY2.hasNext()) {
                final Method method2 = (Method) d0VarY2.next();
                if (o51.f(method2.getName(), "removeLocationUpdates") && !Modifier.isAbstract(method2.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GoogleAndAddressHookerKt$hookGoogleFusedLocation$$inlined$hookAllMethods$2
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method2.getClass();
                                for (Object obj : chain.getArgs()) {
                                    if (obj != null) {
                                        locationHooker.getCapturedFusedLocationCallbacks$xposed_globalRelease().remove(obj);
                                    }
                                }
                                List args = chain.getArgs();
                                args.getClass();
                                return chain.proceed(args.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept2.getClass();
                        arrayList2.add(hookHandleIntercept2);
                        i3++;
                    } catch (Throwable th2) {
                        HookStatus.INSTANCE.error(clsFindClass.getName() + "#removeLocationUpdates", th2);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClass.getName(), "removeLocationUpdates", i3);
            try {
                XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass2 = xposedHelpers3.findClass("com.google.android.gms.tasks.OnSuccessListener", classLoader);
                ArrayList arrayList3 = new ArrayList();
                d0 d0VarY3 = zm3.y(clsFindClass2.getDeclaredMethods());
                while (d0VarY3.hasNext()) {
                    final Method method3 = (Method) d0VarY3.next();
                    if (o51.f(method3.getName(), "onSuccess") && !Modifier.isAbstract(method3.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers3.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.GoogleAndAddressHookerKt$hookGoogleFusedLocation$$inlined$hookAllMethods$3
                                public Object intercept(XposedInterface.Chain chain) {
                                    JSONObject config$xposed_globalRelease;
                                    SpoofedMotion currentSpoofedMotion;
                                    chain.getClass();
                                    method3.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objP0 = zy.p0(args, 0);
                                    if ((objP0 instanceof Location) && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(locationHooker.getCurrentPackageName$xposed_globalRelease(), ":").equals(SelfHostedUpdates.APPLICATION_ID) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "WGS-84")) != null) {
                                        Location location = (Location) objP0;
                                        location.setLatitude(currentSpoofedMotion.getLat());
                                        location.setLongitude(currentSpoofedMotion.getLng());
                                        location.setAccuracy(CoordinateConverterKt.getJitteredAccuracy(locationHooker));
                                        location.setTime(System.currentTimeMillis());
                                        location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept3.getClass();
                            arrayList3.add(hookHandleIntercept3);
                            i++;
                        } catch (Throwable th3) {
                            HookStatus.INSTANCE.error(clsFindClass2.getName() + "#onSuccess", th3);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass2.getName(), "onSuccess", i);
            } catch (Throwable unused) {
            }
            XposedBridge.INSTANCE.log("[LocationSpoofer] Google FusedLocationProvider hooks installed");
        } catch (Throwable unused2) {
            XposedBridge.INSTANCE.log("[LocationSpoofer] Google Play Services location not found, skipped");
        }
    }
}
