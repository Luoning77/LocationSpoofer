package com.vincenthzr.locationspoofer.xposed.hooks;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.l13;
import defpackage.o51;
import defpackage.p91;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationGetterHookerKt {
    public static final void hookLocationGetters(final LocationHooker locationHooker, ClassLoader classLoader, final String str) {
        locationHooker.getClass();
        classLoader.getClass();
        str.getClass();
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass = xposedHelpers.findClass("android.location.Location", classLoader);
                Class[] clsArr = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact = xposedHelpers.findMethodExact(clsFindClass, "getLatitude", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                xposedHelpers.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$1
                    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
                    public Object intercept(XposedInterface.Chain chain) {
                        String provider;
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        if (l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                            return objProceed;
                        }
                        Object thisObject = chain.getThisObject();
                        String str2 = "GCJ-02";
                        if (thisObject == null || (!p91.z(thisObject, "amap", true) && !p91.z(thisObject, "autonavi", true))) {
                            if (thisObject != null && p91.z(thisObject, "baidu", true)) {
                                str2 = "BD-09";
                            } else if (thisObject == null || !p91.z(thisObject, "tencent", true)) {
                                String lowerCase = null;
                                try {
                                    Location location = thisObject instanceof Location ? (Location) thisObject : null;
                                    provider = location != null ? location.getProvider() : null;
                                } catch (Throwable unused) {
                                }
                                if (provider != null) {
                                    lowerCase = provider.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                }
                                if (o51.f(lowerCase, "baidu")) {
                                    str2 = "BD-09";
                                } else {
                                    str2 = "WGS-84";
                                }
                            }
                        }
                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, str2);
                        return currentSpoofedMotion != null ? Double.valueOf(currentSpoofedMotion.getLat()) : objProceed;
                    }
                }).getClass();
            } catch (Throwable unused) {
            }
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass2 = xposedHelpers2.findClass("android.location.Location", classLoader);
                Class[] clsArr2 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact2 = xposedHelpers2.findMethodExact(clsFindClass2, "getLongitude", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                xposedHelpers2.getModule().hook(methodFindMethodExact2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$2
                    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
                    public Object intercept(XposedInterface.Chain chain) {
                        String provider;
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        if (l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                            return objProceed;
                        }
                        Object thisObject = chain.getThisObject();
                        String str2 = "GCJ-02";
                        if (thisObject == null || (!p91.z(thisObject, "amap", true) && !p91.z(thisObject, "autonavi", true))) {
                            if (thisObject != null && p91.z(thisObject, "baidu", true)) {
                                str2 = "BD-09";
                            } else if (thisObject == null || !p91.z(thisObject, "tencent", true)) {
                                String lowerCase = null;
                                try {
                                    Location location = thisObject instanceof Location ? (Location) thisObject : null;
                                    provider = location != null ? location.getProvider() : null;
                                } catch (Throwable unused2) {
                                }
                                if (provider != null) {
                                    lowerCase = provider.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                }
                                if (o51.f(lowerCase, "baidu")) {
                                    str2 = "BD-09";
                                } else {
                                    str2 = "WGS-84";
                                }
                            }
                        }
                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, str2);
                        return currentSpoofedMotion != null ? Double.valueOf(currentSpoofedMotion.getLng()) : objProceed;
                    }
                }).getClass();
            } catch (Throwable unused2) {
            }
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass3 = xposedHelpers3.findClass("android.location.Location", classLoader);
                Class[] clsArr3 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact3 = xposedHelpers3.findMethodExact(clsFindClass3, "getAccuracy", (Class[]) Arrays.copyOf(clsArr3, clsArr3.length));
                xposedHelpers3.getModule().hook(methodFindMethodExact3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$3
                    public Object intercept(XposedInterface.Chain chain) {
                        JSONObject config$xposed_globalRelease;
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        return (l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID) || (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) == null || !config$xposed_globalRelease.optBoolean("active", false)) ? chain.proceed(args.toArray(new Object[0])) : Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker));
                    }
                }).getClass();
            } catch (Throwable unused3) {
            }
            XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass4 = xposedHelpers4.findClass("android.location.Location", classLoader);
                Class[] clsArr4 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact4 = xposedHelpers4.findMethodExact(clsFindClass4, "hasAccuracy", (Class[]) Arrays.copyOf(clsArr4, clsArr4.length));
                xposedHelpers4.getModule().hook(methodFindMethodExact4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$4
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Boolean.TRUE;
                    }
                }).getClass();
            } catch (Throwable unused4) {
            }
            XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass5 = xposedHelpers5.findClass("android.location.Location", classLoader);
                Class[] clsArr5 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact5 = xposedHelpers5.findMethodExact(clsFindClass5, "getSpeed", (Class[]) Arrays.copyOf(clsArr5, clsArr5.length));
                xposedHelpers5.getModule().hook(methodFindMethodExact5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$5
                    public Object intercept(XposedInterface.Chain chain) {
                        SpoofedMotion currentSpoofedMotion$default;
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        return (l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID) || (currentSpoofedMotion$default = BaseLocationHookerKt.getCurrentSpoofedMotion$default(locationHooker, null, 1, null)) == null) ? chain.proceed(args.toArray(new Object[0])) : Float.valueOf(currentSpoofedMotion$default.getSpeed());
                    }
                }).getClass();
            } catch (Throwable unused5) {
            }
            XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass6 = xposedHelpers6.findClass("android.location.Location", classLoader);
                Class[] clsArr6 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact6 = xposedHelpers6.findMethodExact(clsFindClass6, "hasSpeed", (Class[]) Arrays.copyOf(clsArr6, clsArr6.length));
                xposedHelpers6.getModule().hook(methodFindMethodExact6).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$6
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Boolean.TRUE;
                    }
                }).getClass();
            } catch (Throwable unused6) {
            }
            XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass7 = xposedHelpers7.findClass("android.location.Location", classLoader);
                Class[] clsArr7 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact7 = xposedHelpers7.findMethodExact(clsFindClass7, "getBearing", (Class[]) Arrays.copyOf(clsArr7, clsArr7.length));
                xposedHelpers7.getModule().hook(methodFindMethodExact7).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$7
                    public Object intercept(XposedInterface.Chain chain) {
                        SpoofedMotion currentSpoofedMotion$default;
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        return (l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID) || (currentSpoofedMotion$default = BaseLocationHookerKt.getCurrentSpoofedMotion$default(locationHooker, null, 1, null)) == null) ? chain.proceed(args.toArray(new Object[0])) : Float.valueOf(currentSpoofedMotion$default.getBearing());
                    }
                }).getClass();
            } catch (Throwable unused7) {
            }
            XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass8 = xposedHelpers8.findClass("android.location.Location", classLoader);
                Class[] clsArr8 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact8 = xposedHelpers8.findMethodExact(clsFindClass8, "hasBearing", (Class[]) Arrays.copyOf(clsArr8, clsArr8.length));
                xposedHelpers8.getModule().hook(methodFindMethodExact8).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$8
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Boolean.TRUE;
                    }
                }).getClass();
            } catch (Throwable unused8) {
            }
            XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass9 = xposedHelpers9.findClass("android.location.Location", classLoader);
                Class[] clsArr9 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact9 = xposedHelpers9.findMethodExact(clsFindClass9, "getAltitude", (Class[]) Arrays.copyOf(clsArr9, clsArr9.length));
                xposedHelpers9.getModule().hook(methodFindMethodExact9).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$9
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                            return objProceed;
                        }
                        double dRealisticAltitude$default = RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null);
                        return (!config$xposed_globalRelease.optBoolean("enable_jitter", true) || dRealisticAltitude$default <= 0.0d) ? Double.valueOf(dRealisticAltitude$default) : Double.valueOf((locationHooker.getRng$xposed_globalRelease().nextDouble() - 0.5d) + dRealisticAltitude$default);
                    }
                }).getClass();
            } catch (Throwable unused9) {
            }
            XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass10 = xposedHelpers10.findClass("android.location.Location", classLoader);
                Class[] clsArr10 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact10 = xposedHelpers10.findMethodExact(clsFindClass10, "hasAltitude", (Class[]) Arrays.copyOf(clsArr10, clsArr10.length));
                xposedHelpers10.getModule().hook(methodFindMethodExact10).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$10
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Boolean.TRUE;
                    }
                }).getClass();
            } catch (Throwable unused10) {
            }
            try {
                XposedHelpers xposedHelpers11 = XposedHelpers.INSTANCE;
                try {
                    Class<?> clsFindClass11 = xposedHelpers11.findClass("android.location.Location", classLoader);
                    Class[] clsArr11 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    final Method methodFindMethodExact11 = xposedHelpers11.findMethodExact(clsFindClass11, "getSpeedAccuracyMetersPerSecond", (Class[]) Arrays.copyOf(clsArr11, clsArr11.length));
                    xposedHelpers11.getModule().hook(methodFindMethodExact11).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$11
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                return Float.valueOf(0.1f);
                            }
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                    }).getClass();
                } catch (Throwable unused11) {
                }
                XposedHelpers xposedHelpers12 = XposedHelpers.INSTANCE;
                try {
                    Class<?> clsFindClass12 = xposedHelpers12.findClass("android.location.Location", classLoader);
                    Class[] clsArr12 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    final Method methodFindMethodExact12 = xposedHelpers12.findMethodExact(clsFindClass12, "hasSpeedAccuracy", (Class[]) Arrays.copyOf(clsArr12, clsArr12.length));
                    xposedHelpers12.getModule().hook(methodFindMethodExact12).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$12
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                return Boolean.TRUE;
                            }
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                    }).getClass();
                } catch (Throwable unused12) {
                }
                XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
                try {
                    Class<?> clsFindClass13 = xposedHelpers13.findClass("android.location.Location", classLoader);
                    Class[] clsArr13 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    final Method methodFindMethodExact13 = xposedHelpers13.findMethodExact(clsFindClass13, "getBearingAccuracyDegrees", (Class[]) Arrays.copyOf(clsArr13, clsArr13.length));
                    xposedHelpers13.getModule().hook(methodFindMethodExact13).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$13
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                return Float.valueOf(1.5f);
                            }
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                    }).getClass();
                } catch (Throwable unused13) {
                }
                XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                try {
                    Class<?> clsFindClass14 = xposedHelpers14.findClass("android.location.Location", classLoader);
                    Class[] clsArr14 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    final Method methodFindMethodExact14 = xposedHelpers14.findMethodExact(clsFindClass14, "hasBearingAccuracy", (Class[]) Arrays.copyOf(clsArr14, clsArr14.length));
                    xposedHelpers14.getModule().hook(methodFindMethodExact14).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$14
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                return Boolean.TRUE;
                            }
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                    }).getClass();
                } catch (Throwable unused14) {
                }
                XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
                try {
                    Class<?> clsFindClass15 = xposedHelpers15.findClass("android.location.Location", classLoader);
                    Class[] clsArr15 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    final Method methodFindMethodExact15 = xposedHelpers15.findMethodExact(clsFindClass15, "getVerticalAccuracyMeters", (Class[]) Arrays.copyOf(clsArr15, clsArr15.length));
                    xposedHelpers15.getModule().hook(methodFindMethodExact15).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$15
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                return Float.valueOf(1.2f);
                            }
                            List args = chain.getArgs();
                            args.getClass();
                            return chain.proceed(args.toArray(new Object[0]));
                        }
                    }).getClass();
                } catch (Throwable unused15) {
                }
                XposedHelpers xposedHelpers16 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass16 = xposedHelpers16.findClass("android.location.Location", classLoader);
                Class[] clsArr16 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact16 = xposedHelpers16.findMethodExact(clsFindClass16, "hasVerticalAccuracy", (Class[]) Arrays.copyOf(clsArr16, clsArr16.length));
                xposedHelpers16.getModule().hook(methodFindMethodExact16).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$16
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                            return Boolean.TRUE;
                        }
                        List args = chain.getArgs();
                        args.getClass();
                        return chain.proceed(args.toArray(new Object[0]));
                    }
                }).getClass();
            } catch (Throwable unused16) {
            }
            XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass17 = xposedHelpers17.findClass("android.location.Location", classLoader);
                Class[] clsArr17 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact17 = xposedHelpers17.findMethodExact(clsFindClass17, "getTime", (Class[]) Arrays.copyOf(clsArr17, clsArr17.length));
                xposedHelpers17.getModule().hook(methodFindMethodExact17).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$17
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) ? objProceed : Long.valueOf(System.currentTimeMillis());
                    }
                }).getClass();
            } catch (Throwable unused17) {
            }
            try {
                XposedHelpers xposedHelpers18 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass18 = xposedHelpers18.findClass("android.location.Location", classLoader);
                Class[] clsArr18 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact18 = xposedHelpers18.findMethodExact(clsFindClass18, "getElapsedRealtimeNanos", (Class[]) Arrays.copyOf(clsArr18, clsArr18.length));
                xposedHelpers18.getModule().hook(methodFindMethodExact18).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$18
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) ? objProceed : Long.valueOf(SystemClock.elapsedRealtimeNanos());
                    }
                }).getClass();
            } catch (Throwable unused18) {
            }
            try {
                XposedHelpers xposedHelpers19 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass19 = xposedHelpers19.findClass("android.location.Location", classLoader);
                Class[] clsArr19 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact19 = xposedHelpers19.findMethodExact(clsFindClass19, "getElapsedRealtimeMillis", (Class[]) Arrays.copyOf(clsArr19, clsArr19.length));
                xposedHelpers19.getModule().hook(methodFindMethodExact19).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$19
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false) || l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) ? objProceed : Long.valueOf(SystemClock.elapsedRealtime());
                    }
                }).getClass();
            } catch (Throwable unused19) {
            }
            try {
                XposedHelpers xposedHelpers20 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass20 = xposedHelpers20.findClass("android.location.Location", classLoader);
                Class[] clsArr20 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact20 = xposedHelpers20.findMethodExact(clsFindClass20, "getElapsedRealtimeAgeMillis", (Class[]) Arrays.copyOf(clsArr20, clsArr20.length));
                xposedHelpers20.getModule().hook(methodFindMethodExact20).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$20
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                            return 0L;
                        }
                        List args = chain.getArgs();
                        args.getClass();
                        return chain.proceed(args.toArray(new Object[0]));
                    }
                }).getClass();
            } catch (Throwable unused20) {
            }
            try {
                XposedHelpers xposedHelpers21 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass21 = xposedHelpers21.findClass("android.location.Location", classLoader);
                Class[] clsArr21 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact21 = xposedHelpers21.findMethodExact(clsFindClass21, "getExtras", (Class[]) Arrays.copyOf(clsArr21, clsArr21.length));
                xposedHelpers21.getModule().hook(methodFindMethodExact21).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$21
                    public Object intercept(XposedInterface.Chain chain) {
                        Bundle bundle;
                        Bundle bundle2;
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        Object obj = objProceed;
                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                            if (objProceed instanceof Bundle) {
                                bundle2 = (Bundle) objProceed;
                            } else {
                                bundle = null;
                            }
                            if (bundle == null) {
                                obj = objProceed;
                                obj = objProceed;
                                obj = objProceed;
                                obj = objProceed;
                                bundle = bundle2;
                                bundle = new Bundle();
                            }
                            obj = objProceed;
                            obj = objProceed;
                            obj = objProceed;
                            obj = objProceed;
                            bundle = bundle2;
                            int iOptInt = config$xposed_globalRelease.optInt("satellite_count", 20);
                            bundle.putInt("satellites", iOptInt);
                            bundle.putInt("satellites_in_view", iOptInt);
                            bundle.putInt("satellites_used_in_fix", iOptInt >= 12 ? iOptInt : 12);
                            bundle.putInt("satellites_visible", iOptInt);
                            bundle.putBoolean("mockLocation", false);
                            obj = bundle;
                        }
                        obj = objProceed;
                        obj = objProceed;
                        obj = objProceed;
                        return obj;
                    }
                }).getClass();
            } catch (Throwable unused21) {
            }
            XposedHelpers xposedHelpers22 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass22 = xposedHelpers22.findClass("android.location.Location", classLoader);
                Class[] clsArr22 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact22 = xposedHelpers22.findMethodExact(clsFindClass22, "isFromMockProvider", (Class[]) Arrays.copyOf(clsArr22, clsArr22.length));
                xposedHelpers22.getModule().hook(methodFindMethodExact22).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$22
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Boolean.FALSE;
                    }
                }).getClass();
            } catch (Throwable unused22) {
            }
            try {
                XposedHelpers xposedHelpers23 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass23 = xposedHelpers23.findClass("android.location.Location", classLoader);
                Class[] clsArr23 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact23 = xposedHelpers23.findMethodExact(clsFindClass23, "isMock", (Class[]) Arrays.copyOf(clsArr23, clsArr23.length));
                xposedHelpers23.getModule().hook(methodFindMethodExact23).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$23
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        return (config$xposed_globalRelease == null || !config$xposed_globalRelease.optBoolean("active", false)) ? objProceed : Boolean.FALSE;
                    }
                }).getClass();
            } catch (Throwable unused23) {
            }
            XposedHelpers xposedHelpers24 = XposedHelpers.INSTANCE;
            try {
                Class<?> clsFindClass24 = xposedHelpers24.findClass("android.location.Location", classLoader);
                Class[] clsArr24 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                final Method methodFindMethodExact24 = xposedHelpers24.findMethodExact(clsFindClass24, "getProvider", (Class[]) Arrays.copyOf(clsArr24, clsArr24.length));
                xposedHelpers24.getModule().hook(methodFindMethodExact24).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationGetterHookerKt$hookLocationGetters$$inlined$hookMethod$24
                    public Object intercept(XposedInterface.Chain chain) {
                        chain.getClass();
                        List args = chain.getArgs();
                        args.getClass();
                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                        JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                            String str2 = objProceed instanceof String ? (String) objProceed : null;
                            if (str2 != null && (l13.c0(str2, "mock", true) || l13.c0(str2, "test", true) || l13.c0(str2, "fake", true))) {
                                return "gps";
                            }
                        }
                        return objProceed;
                    }
                }).getClass();
            } catch (Throwable unused24) {
            }
        } catch (Throwable th) {
            XposedBridge.INSTANCE.log(th);
        }
    }
}
