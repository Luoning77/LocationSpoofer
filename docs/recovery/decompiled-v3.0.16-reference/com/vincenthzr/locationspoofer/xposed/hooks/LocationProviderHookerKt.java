package com.vincenthzr.locationspoofer.xposed.hooks;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.d0;
import defpackage.da0;
import defpackage.l13;
import defpackage.o51;
import defpackage.p91;
import defpackage.we2;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationProviderHookerKt {
    /* JADX WARN: Code duplicated, block: B:115:0x03fb A[Catch: all -> 0x05b6, TryCatch #13 {all -> 0x05b6, blocks: (B:112:0x03df, B:113:0x03f5, B:115:0x03fb, B:117:0x040b, B:122:0x0432, B:123:0x044e, B:124:0x0469, B:126:0x046f, B:128:0x047f, B:133:0x04a6, B:134:0x04c2, B:135:0x04db, B:137:0x04e1, B:139:0x04f1, B:144:0x0518, B:145:0x0534, B:146:0x054d, B:148:0x0553, B:150:0x0563, B:155:0x058a, B:156:0x05a6, B:130:0x0489, B:152:0x056d, B:119:0x0415, B:141:0x04fb), top: B:188:0x03df, inners: #1, #6, #11, #14 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x046f A[Catch: all -> 0x05b6, TryCatch #13 {all -> 0x05b6, blocks: (B:112:0x03df, B:113:0x03f5, B:115:0x03fb, B:117:0x040b, B:122:0x0432, B:123:0x044e, B:124:0x0469, B:126:0x046f, B:128:0x047f, B:133:0x04a6, B:134:0x04c2, B:135:0x04db, B:137:0x04e1, B:139:0x04f1, B:144:0x0518, B:145:0x0534, B:146:0x054d, B:148:0x0553, B:150:0x0563, B:155:0x058a, B:156:0x05a6, B:130:0x0489, B:152:0x056d, B:119:0x0415, B:141:0x04fb), top: B:188:0x03df, inners: #1, #6, #11, #14 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x04e1 A[Catch: all -> 0x05b6, TryCatch #13 {all -> 0x05b6, blocks: (B:112:0x03df, B:113:0x03f5, B:115:0x03fb, B:117:0x040b, B:122:0x0432, B:123:0x044e, B:124:0x0469, B:126:0x046f, B:128:0x047f, B:133:0x04a6, B:134:0x04c2, B:135:0x04db, B:137:0x04e1, B:139:0x04f1, B:144:0x0518, B:145:0x0534, B:146:0x054d, B:148:0x0553, B:150:0x0563, B:155:0x058a, B:156:0x05a6, B:130:0x0489, B:152:0x056d, B:119:0x0415, B:141:0x04fb), top: B:188:0x03df, inners: #1, #6, #11, #14 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0553 A[Catch: all -> 0x05b6, TryCatch #13 {all -> 0x05b6, blocks: (B:112:0x03df, B:113:0x03f5, B:115:0x03fb, B:117:0x040b, B:122:0x0432, B:123:0x044e, B:124:0x0469, B:126:0x046f, B:128:0x047f, B:133:0x04a6, B:134:0x04c2, B:135:0x04db, B:137:0x04e1, B:139:0x04f1, B:144:0x0518, B:145:0x0534, B:146:0x054d, B:148:0x0553, B:150:0x0563, B:155:0x058a, B:156:0x05a6, B:130:0x0489, B:152:0x056d, B:119:0x0415, B:141:0x04fb), top: B:188:0x03df, inners: #1, #6, #11, #14 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x03ba A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x03f5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x047f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0469 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x04db A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0563 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x054d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d4 A[Catch: all -> 0x0229, TryCatch #7 {all -> 0x0229, blocks: (B:50:0x01b8, B:51:0x01ce, B:53:0x01d4, B:55:0x01e4, B:60:0x020b, B:65:0x0231, B:66:0x024c, B:68:0x0252, B:70:0x0262, B:75:0x0289, B:78:0x02ac, B:79:0x02c7, B:81:0x02cd, B:83:0x02dd, B:88:0x0304, B:91:0x0327, B:85:0x02e7, B:72:0x026c, B:57:0x01ee), top: B:178:0x01b8, outer: #10, inners: #0, #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0252 A[Catch: all -> 0x0229, TryCatch #7 {all -> 0x0229, blocks: (B:50:0x01b8, B:51:0x01ce, B:53:0x01d4, B:55:0x01e4, B:60:0x020b, B:65:0x0231, B:66:0x024c, B:68:0x0252, B:70:0x0262, B:75:0x0289, B:78:0x02ac, B:79:0x02c7, B:81:0x02cd, B:83:0x02dd, B:88:0x0304, B:91:0x0327, B:85:0x02e7, B:72:0x026c, B:57:0x01ee), top: B:178:0x01b8, outer: #10, inners: #0, #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x02cd A[Catch: all -> 0x0229, TryCatch #7 {all -> 0x0229, blocks: (B:50:0x01b8, B:51:0x01ce, B:53:0x01d4, B:55:0x01e4, B:60:0x020b, B:65:0x0231, B:66:0x024c, B:68:0x0252, B:70:0x0262, B:75:0x0289, B:78:0x02ac, B:79:0x02c7, B:81:0x02cd, B:83:0x02dd, B:88:0x0304, B:91:0x0327, B:85:0x02e7, B:72:0x026c, B:57:0x01ee), top: B:178:0x01b8, outer: #10, inners: #0, #5, #8 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0363 A[Catch: all -> 0x03b8, TryCatch #15 {all -> 0x03b8, blocks: (B:94:0x0347, B:95:0x035d, B:97:0x0363, B:99:0x0373, B:104:0x039a, B:109:0x03bf, B:101:0x037d), top: B:192:0x0347, outer: #10, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0373 A[Catch: all -> 0x03b8, TRY_LEAVE, TryCatch #15 {all -> 0x03b8, blocks: (B:94:0x0347, B:95:0x035d, B:97:0x0363, B:99:0x0373, B:104:0x039a, B:109:0x03bf, B:101:0x037d), top: B:192:0x0347, outer: #10, inners: #16 }] */
    public static final void hookLocationProviders(final LocationHooker locationHooker, final ClassLoader classLoader, final String str) {
        d0 d0VarY;
        d0 d0VarY2;
        d0 d0VarY3;
        d0 d0VarY4;
        final Method method;
        final Method method2;
        final Method method3;
        final Method method4;
        XposedHelpers xposedHelpers;
        d0 d0VarY5;
        final Method method5;
        XposedHelpers xposedHelpers2;
        d0 d0VarY6;
        XposedHelpers xposedHelpers3;
        d0 d0VarY7;
        XposedHelpers xposedHelpers4;
        d0 d0VarY8;
        final Method method6;
        final Method method7;
        final Method method8;
        Class<?> clsFindClass;
        locationHooker.getClass();
        classLoader.getClass();
        str.getClass();
        try {
            try {
                XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                Class cls = Boolean.TYPE;
                cls.getClass();
                Object[] objArr = {cls};
                try {
                    Class<?> clsFindClass2 = xposedHelpers5.findClass("android.location.LocationManager", classLoader);
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = objArr[0];
                    if (obj instanceof Class) {
                        clsFindClass = (Class) obj;
                    } else {
                        if (!(obj instanceof String)) {
                            throw new IllegalArgumentException("Invalid argument type");
                        }
                        clsFindClass = xposedHelpers5.findClass((String) obj, clsFindClass2.getClassLoader());
                    }
                    arrayList.add(clsFindClass);
                    Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
                    final Method methodFindMethodExact = xposedHelpers5.findMethodExact(clsFindClass2, "getProviders", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    xposedHelpers5.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookMethod$1
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            List args = chain.getArgs();
                            args.getClass();
                            Object objProceed = chain.proceed(args.toArray(new Object[0]));
                            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                List list = da0.B(objProceed) ? (List) objProceed : null;
                                if (list != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : list) {
                                        String str2 = (String) obj2;
                                        if (!l13.c0(str2, "mock", true) && !l13.c0(str2, "test", true) && !l13.c0(str2, "fake", true)) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(arrayList2);
                                    if (!arrayList3.contains("gps")) {
                                        arrayList3.add("gps");
                                    }
                                    return arrayList3;
                                }
                            }
                            return objProceed;
                        }
                    }).getClass();
                } catch (Throwable unused) {
                }
                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                try {
                    Class<?> clsFindClass3 = xposedHelpers6.findClass("android.location.LocationManager", classLoader);
                    Class[] clsArr2 = (Class[]) new ArrayList(0).toArray(new Class[0]);
                    final Method methodFindMethodExact2 = xposedHelpers6.findMethodExact(clsFindClass3, "getAllProviders", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    xposedHelpers6.getModule().hook(methodFindMethodExact2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookMethod$2
                        public Object intercept(XposedInterface.Chain chain) {
                            chain.getClass();
                            List args = chain.getArgs();
                            args.getClass();
                            Object objProceed = chain.proceed(args.toArray(new Object[0]));
                            JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                List list = da0.B(objProceed) ? (List) objProceed : null;
                                if (list != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : list) {
                                        String str2 = (String) obj2;
                                        if (!l13.c0(str2, "mock", true) && !l13.c0(str2, "test", true) && !l13.c0(str2, "fake", true)) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(arrayList2);
                                    if (!arrayList3.contains("gps")) {
                                        arrayList3.add("gps");
                                    }
                                    return arrayList3;
                                }
                            }
                            return objProceed;
                        }
                    }).getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                XposedBridge.INSTANCE.log(th);
            }
            try {
                XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass4 = xposedHelpers7.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarY9 = zm3.y(clsFindClass4.getDeclaredMethods());
                int i = 0;
                while (d0VarY9.hasNext()) {
                    final Method method9 = (Method) d0VarY9.next();
                    if (o51.f(method9.getName(), "addNmeaListener") && !Modifier.isAbstract(method9.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers7.getModule().hook(method9).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    boolean zHasTypeByName;
                                    boolean zHasTypeByName2;
                                    chain.getClass();
                                    method9.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    int size = args.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        Object obj2 = args.get(i2);
                                        if (obj2 != null) {
                                            try {
                                                zHasTypeByName = LocationHooker.Companion.hasTypeByName(obj2.getClass(), "android.location.OnNmeaMessageListener");
                                            } catch (Exception unused3) {
                                                zHasTypeByName = false;
                                            }
                                            try {
                                                zHasTypeByName2 = LocationHooker.Companion.hasTypeByName(obj2.getClass(), "android.location.GpsStatus$NmeaListener");
                                            } catch (Exception unused4) {
                                                zHasTypeByName2 = false;
                                            }
                                            if (zHasTypeByName) {
                                                XposedBridge.INSTANCE.log("[GPS_Spoofer] Detected addNmeaListener(OnNmeaMessageListener)! Starting active injector.");
                                                args.set(i2, NmeaSpoofingKt.createOnNmeaMessageListenerProxy(locationHooker, obj2, classLoader));
                                            } else if (zHasTypeByName2) {
                                                XposedBridge.INSTANCE.log("[GPS_Spoofer] Detected addNmeaListener(GpsStatus.NmeaListener)! Starting active injector.");
                                                args.set(i2, NmeaSpoofingKt.createGpsStatusNmeaListenerProxy(locationHooker, obj2, classLoader));
                                            }
                                        }
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept.getClass();
                            arrayList2.add(hookHandleIntercept);
                            i++;
                        } catch (Throwable th2) {
                            HookStatus.INSTANCE.error(clsFindClass4.getName() + "#addNmeaListener", th2);
                            xposedHelpers7 = xposedHelpers7;
                        }
                    }
                    xposedHelpers7 = xposedHelpers7;
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass4.getName(), "addNmeaListener", i);
                XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                ArrayList arrayList3 = new ArrayList();
                d0 d0VarY10 = zm3.y(clsFindClass4.getDeclaredMethods());
                int i2 = 0;
                while (d0VarY10.hasNext()) {
                    final Method method10 = (Method) d0VarY10.next();
                    if (!o51.f(method10.getName(), "removeNmeaListener") || Modifier.isAbstract(method10.getModifiers())) {
                        xposedHelpers8 = xposedHelpers8;
                    } else {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers8.getModule().hook(method10).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$2
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method10.getClass();
                                    for (Object obj2 : chain.getArgs()) {
                                        if (obj2 != null) {
                                            Timer timerRemove = locationHooker.getNmeaTimers$xposed_globalRelease().remove(obj2);
                                            if (timerRemove != null) {
                                                timerRemove.cancel();
                                            }
                                            XposedBridge.INSTANCE.log("[GPS_Spoofer] removeNmeaListener called, canceled timer.");
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept2.getClass();
                            arrayList3.add(hookHandleIntercept2);
                            i2++;
                        } catch (Throwable th3) {
                            HookStatus.INSTANCE.error(clsFindClass4.getName() + "#removeNmeaListener", th3);
                            xposedHelpers8 = xposedHelpers8;
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass4.getName(), "removeNmeaListener", i2);
            } catch (Throwable th4) {
                XposedBridge.INSTANCE.log(th4);
                xposedHelpers2 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass5 = xposedHelpers2.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList4 = new ArrayList();
                d0VarY6 = zm3.y(clsFindClass5.getDeclaredMethods());
                int i3 = 0;
                while (d0VarY6.hasNext()) {
                    method8 = (Method) d0VarY6.next();
                    if (o51.f(method8.getName(), "requestLocationUpdates")) {
                    }
                    xposedHelpers2 = xposedHelpers2;
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass5.getName(), "requestLocationUpdates", i3);
                xposedHelpers3 = XposedHelpers.INSTANCE;
                ArrayList arrayList5 = new ArrayList();
                d0VarY7 = zm3.y(clsFindClass5.getDeclaredMethods());
                int i4 = 0;
                while (d0VarY7.hasNext()) {
                    method7 = (Method) d0VarY7.next();
                    if (o51.f(method7.getName(), "removeUpdates")) {
                    }
                    xposedHelpers3 = xposedHelpers3;
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass5.getName(), "removeUpdates", i4);
                xposedHelpers4 = XposedHelpers.INSTANCE;
                ArrayList arrayList6 = new ArrayList();
                d0VarY8 = zm3.y(clsFindClass5.getDeclaredMethods());
                int i5 = 0;
                while (d0VarY8.hasNext()) {
                    method6 = (Method) d0VarY8.next();
                    if (o51.f(method6.getName(), "getCurrentLocation")) {
                    }
                    xposedHelpers4 = xposedHelpers4;
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass5.getName(), "getCurrentLocation", i5);
                xposedHelpers = XposedHelpers.INSTANCE;
                Class<?> clsFindClass6 = xposedHelpers.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList7 = new ArrayList();
                d0VarY5 = zm3.y(clsFindClass6.getDeclaredMethods());
                int i6 = 0;
                while (d0VarY5.hasNext()) {
                    method5 = (Method) d0VarY5.next();
                    if (o51.f(method5.getName(), "getLastKnownLocation")) {
                    }
                    xposedHelpers = xposedHelpers;
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass6.getName(), "getLastKnownLocation", i6);
                XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass7 = xposedHelpers9.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList8 = new ArrayList();
                d0VarY = zm3.y(clsFindClass7.getDeclaredMethods());
                int i7 = 0;
                while (d0VarY.hasNext()) {
                    method4 = (Method) d0VarY.next();
                    if (!o51.f(method4.getName(), "isLocationEnabled")) {
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass7.getName(), "isLocationEnabled", i7);
                XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
                ArrayList arrayList9 = new ArrayList();
                d0VarY2 = zm3.y(clsFindClass7.getDeclaredMethods());
                int i8 = 0;
                while (d0VarY2.hasNext()) {
                    method3 = (Method) d0VarY2.next();
                    if (!o51.f(method3.getName(), "isProviderEnabled")) {
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass7.getName(), "isProviderEnabled", i8);
                XposedHelpers xposedHelpers11 = XposedHelpers.INSTANCE;
                ArrayList arrayList10 = new ArrayList();
                d0VarY3 = zm3.y(clsFindClass7.getDeclaredMethods());
                int i9 = 0;
                while (d0VarY3.hasNext()) {
                    method2 = (Method) d0VarY3.next();
                    if (!o51.f(method2.getName(), "getAllProviders")) {
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass7.getName(), "getAllProviders", i9);
                XposedHelpers xposedHelpers12 = XposedHelpers.INSTANCE;
                ArrayList arrayList11 = new ArrayList();
                d0VarY4 = zm3.y(clsFindClass7.getDeclaredMethods());
                int i10 = 0;
                while (d0VarY4.hasNext()) {
                    method = (Method) d0VarY4.next();
                    if (!o51.f(method.getName(), "getProviders")) {
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass7.getName(), "getProviders", i10);
            }
            try {
                xposedHelpers2 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass8 = xposedHelpers2.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList12 = new ArrayList();
                d0VarY6 = zm3.y(clsFindClass8.getDeclaredMethods());
                int i11 = 0;
                while (d0VarY6.hasNext()) {
                    method8 = (Method) d0VarY6.next();
                    if (o51.f(method8.getName(), "requestLocationUpdates") || Modifier.isAbstract(method8.getModifiers())) {
                        xposedHelpers2 = xposedHelpers2;
                    } else {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers2.getModule().hook(method8).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$3
                                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                /* JADX WARN: Code duplicated, block: B:41:0x00d9 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:21:0x0050, B:23:0x005e, B:25:0x006a, B:27:0x0076, B:30:0x0083, B:32:0x008f, B:34:0x009b, B:36:0x00a7, B:38:0x00c2, B:39:0x00d3, B:41:0x00d9, B:43:0x00e9, B:48:0x0114, B:49:0x0132, B:45:0x00f3), top: B:54:0x0050, inners: #1 }] */
                                /* JADX WARN: Code duplicated, block: B:54:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:63:0x005e A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:71:0x00c2 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:76:0x0010 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:80:0x0010 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:87:0x00e9 A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:90:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                public Object intercept(XposedInterface.Chain chain) {
                                    LocationHooker.Companion companion;
                                    Class<?> cls2;
                                    d0 d0VarY11;
                                    final Method method11;
                                    chain.getClass();
                                    method8.getClass();
                                    Iterator it = chain.getArgs().iterator();
                                    while (true) {
                                        int i12 = 0;
                                        if (!it.hasNext()) {
                                            List args = chain.getArgs();
                                            args.getClass();
                                            return chain.proceed(args.toArray(new Object[0]));
                                        }
                                        Object next = it.next();
                                        if (next != null) {
                                            String name = next.getClass().getName();
                                            switch (name.hashCode()) {
                                                case -1471587488:
                                                    if (!name.equals("android.location.LocationRequest")) {
                                                        try {
                                                            companion = LocationHooker.Companion;
                                                            if (companion.hasTypeByName(next.getClass(), "com.amap.api.location.AMapLocationListener") && !companion.hasTypeByName(next.getClass(), "com.baidu.location.BDLocationListener") && !companion.hasTypeByName(next.getClass(), "com.baidu.location.BDAbstractLocationListener") && !companion.hasTypeByName(next.getClass(), "com.tencent.map.geolocation.TencentLocationListener") && (companion.hasTypeByName(next.getClass(), "android.location.LocationListener") || companion.hasTypeByName(next.getClass(), "java.util.function.Consumer") || companion.hasTypeByName(next.getClass(), "androidx.core.util.Consumer"))) {
                                                                locationHooker.getCapturedLocationListeners$xposed_globalRelease().addIfAbsent(next);
                                                                cls2 = next.getClass();
                                                                if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls2, Boolean.TRUE) == null) {
                                                                    XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
                                                                    ArrayList arrayList13 = new ArrayList();
                                                                    d0VarY11 = zm3.y(cls2.getDeclaredMethods());
                                                                    while (d0VarY11.hasNext()) {
                                                                        method11 = (Method) d0VarY11.next();
                                                                        if (!o51.f(method11.getName(), "onLocationChanged") && !Modifier.isAbstract(method11.getModifiers())) {
                                                                            try {
                                                                                XposedInterface.HookBuilder hookBuilderHook = xposedHelpers13.getModule().hook(method11);
                                                                                final LocationHooker locationHooker2 = locationHooker;
                                                                                final String str2 = str;
                                                                                XposedInterface.HookHandle hookHandleIntercept4 = hookBuilderHook.intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$lambda$7$$inlined$hookAllMethods$1
                                                                                    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
                                                                                    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
                                                                                    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
                                                                                    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
                                                                                    public Object intercept(XposedInterface.Chain chain2) {
                                                                                        Object obj2;
                                                                                        String str3;
                                                                                        String str4;
                                                                                        char c;
                                                                                        char c2;
                                                                                        String provider;
                                                                                        String lowerCase;
                                                                                        String str5;
                                                                                        String provider2;
                                                                                        chain2.getClass();
                                                                                        method11.getClass();
                                                                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(str2, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                                                                                            List args2 = chain2.getArgs();
                                                                                            args2.getClass();
                                                                                            if (!args2.isEmpty() && (obj2 = chain2.getArgs().get(0)) != null) {
                                                                                                int i13 = 12;
                                                                                                char c3 = 20;
                                                                                                String str6 = "satellite_count";
                                                                                                String str7 = "tencent";
                                                                                                String str8 = "autonavi";
                                                                                                String str9 = "amap";
                                                                                                String str10 = "baidu";
                                                                                                String lowerCase2 = null;
                                                                                                boolean z = true;
                                                                                                if (obj2 instanceof Location) {
                                                                                                    if (p91.z(obj2, "amap", true) || p91.z(obj2, "autonavi", true)) {
                                                                                                        str5 = "GCJ-02";
                                                                                                    } else if (p91.z(obj2, "baidu", true)) {
                                                                                                        str5 = "BD-09";
                                                                                                    } else if (p91.z(obj2, "tencent", true)) {
                                                                                                        str5 = "GCJ-02";
                                                                                                    } else {
                                                                                                        try {
                                                                                                            provider2 = ((Location) obj2).getProvider();
                                                                                                        } catch (Throwable unused3) {
                                                                                                            provider2 = null;
                                                                                                        }
                                                                                                        if (provider2 != null) {
                                                                                                            lowerCase2 = provider2.toLowerCase(Locale.ROOT);
                                                                                                            lowerCase2.getClass();
                                                                                                        }
                                                                                                        if (o51.f(lowerCase2, "baidu")) {
                                                                                                            str5 = "BD-09";
                                                                                                        } else {
                                                                                                            str5 = "WGS-84";
                                                                                                        }
                                                                                                    }
                                                                                                    SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, str5);
                                                                                                    if (currentSpoofedMotion != null) {
                                                                                                        Location location = (Location) obj2;
                                                                                                        location.setLatitude(currentSpoofedMotion.getLat());
                                                                                                        location.setLongitude(currentSpoofedMotion.getLng());
                                                                                                        location.setAccuracy(CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                                                                        location.setSpeed(currentSpoofedMotion.getSpeed());
                                                                                                        location.setBearing(currentSpoofedMotion.getBearing());
                                                                                                        location.setAltitude(RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null));
                                                                                                        location.setTime(System.currentTimeMillis());
                                                                                                        location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
                                                                                                        try {
                                                                                                            Bundle extras = ((Location) obj2).getExtras();
                                                                                                            if (extras == null) {
                                                                                                                extras = new Bundle();
                                                                                                            }
                                                                                                            int iOptInt = config$xposed_globalRelease.optInt("satellite_count", 20);
                                                                                                            extras.putInt("satellites", iOptInt);
                                                                                                            extras.putInt("satellites_in_view", iOptInt);
                                                                                                            if (iOptInt >= 12) {
                                                                                                                i13 = iOptInt;
                                                                                                            }
                                                                                                            extras.putInt("satellites_used_in_fix", i13);
                                                                                                            extras.putBoolean("mockLocation", false);
                                                                                                            ((Location) obj2).setExtras(extras);
                                                                                                        } catch (Throwable unused4) {
                                                                                                        }
                                                                                                    }
                                                                                                } else if (obj2 instanceof List) {
                                                                                                    for (Object obj3 : (List) obj2) {
                                                                                                        if (obj3 instanceof Location) {
                                                                                                            if (p91.z(obj3, str9, z) || p91.z(obj3, str8, z)) {
                                                                                                                str3 = "GCJ-02";
                                                                                                            } else if (p91.z(obj3, str10, z)) {
                                                                                                                str3 = "BD-09";
                                                                                                            } else if (p91.z(obj3, str7, z)) {
                                                                                                                str3 = "GCJ-02";
                                                                                                            } else {
                                                                                                                try {
                                                                                                                    provider = ((Location) obj3).getProvider();
                                                                                                                } catch (Throwable unused5) {
                                                                                                                    provider = null;
                                                                                                                }
                                                                                                                if (provider != null) {
                                                                                                                    lowerCase = provider.toLowerCase(Locale.ROOT);
                                                                                                                    lowerCase.getClass();
                                                                                                                } else {
                                                                                                                    lowerCase = null;
                                                                                                                }
                                                                                                                if (o51.f(lowerCase, str10)) {
                                                                                                                    str3 = "BD-09";
                                                                                                                } else {
                                                                                                                    str3 = "WGS-84";
                                                                                                                }
                                                                                                            }
                                                                                                            SpoofedMotion currentSpoofedMotion2 = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, str3);
                                                                                                            if (currentSpoofedMotion2 != null) {
                                                                                                                Location location2 = (Location) obj3;
                                                                                                                String str11 = str6;
                                                                                                                location2.setLatitude(currentSpoofedMotion2.getLat());
                                                                                                                location2.setLongitude(currentSpoofedMotion2.getLng());
                                                                                                                location2.setAccuracy(CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                                                                                location2.setSpeed(currentSpoofedMotion2.getSpeed());
                                                                                                                location2.setBearing(currentSpoofedMotion2.getBearing());
                                                                                                                String str12 = str9;
                                                                                                                String str13 = str10;
                                                                                                                String str14 = str7;
                                                                                                                String str15 = str8;
                                                                                                                location2.setAltitude(RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null));
                                                                                                                location2.setTime(System.currentTimeMillis());
                                                                                                                location2.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
                                                                                                                try {
                                                                                                                    Bundle extras2 = ((Location) obj3).getExtras();
                                                                                                                    if (extras2 == null) {
                                                                                                                        extras2 = new Bundle();
                                                                                                                    }
                                                                                                                    str4 = str11;
                                                                                                                    c = 20;
                                                                                                                    try {
                                                                                                                        int iOptInt2 = config$xposed_globalRelease.optInt(str4, 20);
                                                                                                                        extras2.putInt("satellites", iOptInt2);
                                                                                                                        extras2.putInt("satellites_in_view", iOptInt2);
                                                                                                                        c2 = '\f';
                                                                                                                        try {
                                                                                                                            extras2.putInt("satellites_used_in_fix", iOptInt2 < 12 ? 12 : iOptInt2);
                                                                                                                            extras2.putInt("satellites_visible", iOptInt2);
                                                                                                                            extras2.putBoolean("mockLocation", false);
                                                                                                                            ((Location) obj3).setExtras(extras2);
                                                                                                                        } catch (Throwable unused6) {
                                                                                                                        }
                                                                                                                    } catch (Throwable unused7) {
                                                                                                                        c2 = '\f';
                                                                                                                    }
                                                                                                                } catch (Throwable unused8) {
                                                                                                                    str4 = str11;
                                                                                                                    c = 20;
                                                                                                                }
                                                                                                                str9 = str12;
                                                                                                                str10 = str13;
                                                                                                                z = true;
                                                                                                                c3 = c;
                                                                                                                str6 = str4;
                                                                                                                str7 = str14;
                                                                                                                str8 = str15;
                                                                                                            } else {
                                                                                                                str7 = str7;
                                                                                                                str8 = str8;
                                                                                                                z = true;
                                                                                                            }
                                                                                                        } else {
                                                                                                            str7 = str7;
                                                                                                            str8 = str8;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        List args3 = chain2.getArgs();
                                                                                        args3.getClass();
                                                                                        return chain2.proceed(args3.toArray(new Object[0]));
                                                                                    }
                                                                                });
                                                                                hookHandleIntercept4.getClass();
                                                                                arrayList13.add(hookHandleIntercept4);
                                                                                i12++;
                                                                            } catch (Throwable th5) {
                                                                                HookStatus.INSTANCE.error(cls2.getName() + "#onLocationChanged", th5);
                                                                            }
                                                                        }
                                                                    }
                                                                    HookStatus.INSTANCE.methodHooked(cls2.getName(), "onLocationChanged", i12);
                                                                }
                                                            }
                                                        } catch (Throwable unused3) {
                                                        }
                                                    }
                                                    break;
                                                case -907337476:
                                                    if (!name.equals("android.os.Looper")) {
                                                        companion = LocationHooker.Companion;
                                                        if (companion.hasTypeByName(next.getClass(), "com.amap.api.location.AMapLocationListener")) {
                                                            locationHooker.getCapturedLocationListeners$xposed_globalRelease().addIfAbsent(next);
                                                            cls2 = next.getClass();
                                                            if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls2, Boolean.TRUE) == null) {
                                                                XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                                                                ArrayList arrayList14 = new ArrayList();
                                                                d0VarY11 = zm3.y(cls2.getDeclaredMethods());
                                                                while (d0VarY11.hasNext()) {
                                                                    method11 = (Method) d0VarY11.next();
                                                                    if (!o51.f(method11.getName(), "onLocationChanged")) {
                                                                    }
                                                                }
                                                                HookStatus.INSTANCE.methodHooked(cls2.getName(), "onLocationChanged", i12);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 1195259493:
                                                    if (!name.equals("java.lang.String")) {
                                                        companion = LocationHooker.Companion;
                                                        if (companion.hasTypeByName(next.getClass(), "com.amap.api.location.AMapLocationListener")) {
                                                            locationHooker.getCapturedLocationListeners$xposed_globalRelease().addIfAbsent(next);
                                                            cls2 = next.getClass();
                                                            if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls2, Boolean.TRUE) == null) {
                                                                XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
                                                                ArrayList arrayList15 = new ArrayList();
                                                                d0VarY11 = zm3.y(cls2.getDeclaredMethods());
                                                                while (d0VarY11.hasNext()) {
                                                                    method11 = (Method) d0VarY11.next();
                                                                    if (!o51.f(method11.getName(), "onLocationChanged")) {
                                                                    }
                                                                }
                                                                HookStatus.INSTANCE.methodHooked(cls2.getName(), "onLocationChanged", i12);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 1805528025:
                                                    if (!name.equals("android.location.Criteria")) {
                                                        companion = LocationHooker.Companion;
                                                        if (companion.hasTypeByName(next.getClass(), "com.amap.api.location.AMapLocationListener")) {
                                                            locationHooker.getCapturedLocationListeners$xposed_globalRelease().addIfAbsent(next);
                                                            cls2 = next.getClass();
                                                            if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls2, Boolean.TRUE) == null) {
                                                                XposedHelpers xposedHelpers16 = XposedHelpers.INSTANCE;
                                                                ArrayList arrayList16 = new ArrayList();
                                                                d0VarY11 = zm3.y(cls2.getDeclaredMethods());
                                                                while (d0VarY11.hasNext()) {
                                                                    method11 = (Method) d0VarY11.next();
                                                                    if (!o51.f(method11.getName(), "onLocationChanged")) {
                                                                    }
                                                                }
                                                                HookStatus.INSTANCE.methodHooked(cls2.getName(), "onLocationChanged", i12);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    companion = LocationHooker.Companion;
                                                    if (companion.hasTypeByName(next.getClass(), "com.amap.api.location.AMapLocationListener")) {
                                                        locationHooker.getCapturedLocationListeners$xposed_globalRelease().addIfAbsent(next);
                                                        cls2 = next.getClass();
                                                        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls2, Boolean.TRUE) == null) {
                                                            XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
                                                            ArrayList arrayList17 = new ArrayList();
                                                            d0VarY11 = zm3.y(cls2.getDeclaredMethods());
                                                            while (d0VarY11.hasNext()) {
                                                                method11 = (Method) d0VarY11.next();
                                                                if (!o51.f(method11.getName(), "onLocationChanged")) {
                                                                }
                                                            }
                                                            HookStatus.INSTANCE.methodHooked(cls2.getName(), "onLocationChanged", i12);
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                }
                            });
                            hookHandleIntercept3.getClass();
                            arrayList12.add(hookHandleIntercept3);
                            i11++;
                        } catch (Throwable th5) {
                            HookStatus.INSTANCE.error(clsFindClass8.getName() + "#requestLocationUpdates", th5);
                            xposedHelpers2 = xposedHelpers2;
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass8.getName(), "requestLocationUpdates", i11);
                xposedHelpers3 = XposedHelpers.INSTANCE;
                ArrayList arrayList13 = new ArrayList();
                d0VarY7 = zm3.y(clsFindClass8.getDeclaredMethods());
                int i12 = 0;
                while (d0VarY7.hasNext()) {
                    method7 = (Method) d0VarY7.next();
                    if (o51.f(method7.getName(), "removeUpdates") || Modifier.isAbstract(method7.getModifiers())) {
                        xposedHelpers3 = xposedHelpers3;
                    } else {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers3.getModule().hook(method7).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$4
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method7.getClass();
                                    for (Object obj2 : chain.getArgs()) {
                                        if (obj2 != null) {
                                            try {
                                                locationHooker.getCapturedLocationListeners$xposed_globalRelease().remove(obj2);
                                            } catch (Throwable unused3) {
                                            }
                                        }
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept4.getClass();
                            arrayList13.add(hookHandleIntercept4);
                            i12++;
                        } catch (Throwable th6) {
                            HookStatus.INSTANCE.error(clsFindClass8.getName() + "#removeUpdates", th6);
                            xposedHelpers3 = xposedHelpers3;
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass8.getName(), "removeUpdates", i12);
                xposedHelpers4 = XposedHelpers.INSTANCE;
                ArrayList arrayList14 = new ArrayList();
                d0VarY8 = zm3.y(clsFindClass8.getDeclaredMethods());
                int i13 = 0;
                while (d0VarY8.hasNext()) {
                    method6 = (Method) d0VarY8.next();
                    if (o51.f(method6.getName(), "getCurrentLocation") || Modifier.isAbstract(method6.getModifiers())) {
                        xposedHelpers4 = xposedHelpers4;
                    } else {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept5 = xposedHelpers4.getModule().hook(method6).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$5
                                public Object intercept(XposedInterface.Chain chain) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
                                    chain.getClass();
                                    method6.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Object objP0 = zy.p0(args, 0);
                                        String str2 = objP0 instanceof String ? (String) objP0 : null;
                                        if (str2 == null) {
                                            str2 = "gps";
                                        }
                                        String lowerCase = str2.toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, lowerCase.equals("baidu") ? "BD-09" : "WGS-84");
                                        if (currentSpoofedMotion != null) {
                                            final we2 we2Var = new we2();
                                            Executor executor = null;
                                            for (Object obj2 : chain.getArgs()) {
                                                if (obj2 instanceof Executor) {
                                                    executor = (Executor) obj2;
                                                } else if (obj2 != null) {
                                                    if (!p91.z(obj2, "Consumer", false)) {
                                                        LocationHooker.Companion companion = LocationHooker.Companion;
                                                        if (companion.hasTypeByName(obj2.getClass(), "java.util.function.Consumer") || companion.hasTypeByName(obj2.getClass(), "androidx.core.util.Consumer")) {
                                                        }
                                                    }
                                                    we2Var.e = obj2;
                                                }
                                            }
                                            if (we2Var.e != null) {
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                final Object objNewInstance = Class.forName("android.location.Location", false, classLoader).getConstructor(String.class).newInstance(l13.k0(str2) ? "gps" : str2);
                                                XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
                                                objNewInstance.getClass();
                                                xposedHelpers13.callMethod(objNewInstance, "setLatitude", Double.valueOf(currentSpoofedMotion.getLat()));
                                                xposedHelpers13.callMethod(objNewInstance, "setLongitude", Double.valueOf(currentSpoofedMotion.getLng()));
                                                xposedHelpers13.callMethod(objNewInstance, "setAccuracy", Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker)));
                                                xposedHelpers13.callMethod(objNewInstance, "setSpeed", Float.valueOf(currentSpoofedMotion.getSpeed()));
                                                xposedHelpers13.callMethod(objNewInstance, "setBearing", Float.valueOf(currentSpoofedMotion.getBearing()));
                                                xposedHelpers13.callMethod(objNewInstance, "setAltitude", Double.valueOf(RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null)));
                                                xposedHelpers13.callMethod(objNewInstance, "setTime", Long.valueOf(jCurrentTimeMillis));
                                                xposedHelpers13.callMethod(objNewInstance, "setElapsedRealtimeNanos", Long.valueOf(SystemClock.elapsedRealtimeNanos()));
                                                try {
                                                    Bundle bundle = new Bundle();
                                                    int iOptInt = config$xposed_globalRelease.optInt("satellite_count", 20);
                                                    bundle.putInt("satellites", iOptInt);
                                                    bundle.putInt("satellites_in_view", iOptInt);
                                                    int i14 = 12;
                                                    if (iOptInt >= 12) {
                                                        i14 = iOptInt;
                                                    }
                                                    bundle.putInt("satellites_used_in_fix", i14);
                                                    bundle.putInt("satellites_visible", iOptInt);
                                                    bundle.putBoolean("mockLocation", false);
                                                    xposedHelpers13.callMethod(objNewInstance, "setExtras", bundle);
                                                } catch (Throwable unused3) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.callMethod(objNewInstance, "setIsFromMockProvider", Boolean.FALSE);
                                                } catch (Throwable unused4) {
                                                }
                                                Runnable runnable = new Runnable() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$7$runDispatch$1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        try {
                                                            XposedHelpers.INSTANCE.callMethod(we2Var.e, "accept", objNewInstance);
                                                        } catch (Throwable unused5) {
                                                        }
                                                    }
                                                };
                                                if (executor != null) {
                                                    executor.execute(runnable);
                                                } else {
                                                    new Handler(Looper.getMainLooper()).post(runnable);
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept5.getClass();
                            arrayList14.add(hookHandleIntercept5);
                            i13++;
                        } catch (Throwable th7) {
                            HookStatus.INSTANCE.error(clsFindClass8.getName() + "#getCurrentLocation", th7);
                            xposedHelpers4 = xposedHelpers4;
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass8.getName(), "getCurrentLocation", i13);
            } catch (Throwable th8) {
                XposedBridge.INSTANCE.log("[LocationSpoofer] Failed to hook requestLocationUpdates/getCurrentLocation: " + th8);
                xposedHelpers = XposedHelpers.INSTANCE;
                Class<?> clsFindClass9 = xposedHelpers.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList15 = new ArrayList();
                d0VarY5 = zm3.y(clsFindClass9.getDeclaredMethods());
                int i14 = 0;
                while (d0VarY5.hasNext()) {
                    method5 = (Method) d0VarY5.next();
                    if (o51.f(method5.getName(), "getLastKnownLocation")) {
                    }
                    xposedHelpers = xposedHelpers;
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass9.getName(), "getLastKnownLocation", i14);
                XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass10 = xposedHelpers13.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList16 = new ArrayList();
                d0VarY = zm3.y(clsFindClass10.getDeclaredMethods());
                int i15 = 0;
                while (d0VarY.hasNext()) {
                    method4 = (Method) d0VarY.next();
                    if (!o51.f(method4.getName(), "isLocationEnabled")) {
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass10.getName(), "isLocationEnabled", i15);
                XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                ArrayList arrayList17 = new ArrayList();
                d0VarY2 = zm3.y(clsFindClass10.getDeclaredMethods());
                int i16 = 0;
                while (d0VarY2.hasNext()) {
                    method3 = (Method) d0VarY2.next();
                    if (!o51.f(method3.getName(), "isProviderEnabled")) {
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass10.getName(), "isProviderEnabled", i16);
                XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
                ArrayList arrayList18 = new ArrayList();
                d0VarY3 = zm3.y(clsFindClass10.getDeclaredMethods());
                int i17 = 0;
                while (d0VarY3.hasNext()) {
                    method2 = (Method) d0VarY3.next();
                    if (!o51.f(method2.getName(), "getAllProviders")) {
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass10.getName(), "getAllProviders", i17);
                XposedHelpers xposedHelpers16 = XposedHelpers.INSTANCE;
                ArrayList arrayList19 = new ArrayList();
                d0VarY4 = zm3.y(clsFindClass10.getDeclaredMethods());
                int i18 = 0;
                while (d0VarY4.hasNext()) {
                    method = (Method) d0VarY4.next();
                    if (!o51.f(method.getName(), "getProviders")) {
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass10.getName(), "getProviders", i18);
            }
            try {
                xposedHelpers = XposedHelpers.INSTANCE;
                Class<?> clsFindClass11 = xposedHelpers.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList110 = new ArrayList();
                d0VarY5 = zm3.y(clsFindClass11.getDeclaredMethods());
                int i19 = 0;
                while (d0VarY5.hasNext()) {
                    method5 = (Method) d0VarY5.next();
                    if (o51.f(method5.getName(), "getLastKnownLocation") || Modifier.isAbstract(method5.getModifiers())) {
                        xposedHelpers = xposedHelpers;
                    } else {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept6 = xposedHelpers.getModule().hook(method5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$6
                                public Object intercept(XposedInterface.Chain chain) {
                                    JSONObject config$xposed_globalRelease;
                                    chain.getClass();
                                    method5.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    if (l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID) || (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) == null || !config$xposed_globalRelease.optBoolean("active", false)) {
                                        return objProceed;
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    Object objP0 = zy.p0(args2, 0);
                                    String str2 = objP0 instanceof String ? (String) objP0 : null;
                                    if (str2 == null) {
                                        str2 = "gps";
                                    }
                                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, lowerCase.equals("baidu") ? "BD-09" : "WGS-84");
                                    if (currentSpoofedMotion == null) {
                                        return objProceed;
                                    }
                                    try {
                                        Object objNewInstance = Class.forName("android.location.Location", false, classLoader).getConstructor(String.class).newInstance(l13.k0(str2) ? "gps" : str2);
                                        XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
                                        objNewInstance.getClass();
                                        xposedHelpers17.callMethod(objNewInstance, "setLatitude", Double.valueOf(currentSpoofedMotion.getLat()));
                                        xposedHelpers17.callMethod(objNewInstance, "setLongitude", Double.valueOf(currentSpoofedMotion.getLng()));
                                        xposedHelpers17.callMethod(objNewInstance, "setAccuracy", Float.valueOf(CoordinateConverterKt.getJitteredAccuracy(locationHooker)));
                                        xposedHelpers17.callMethod(objNewInstance, "setSpeed", Float.valueOf(currentSpoofedMotion.getSpeed()));
                                        xposedHelpers17.callMethod(objNewInstance, "setBearing", Float.valueOf(currentSpoofedMotion.getBearing()));
                                        xposedHelpers17.callMethod(objNewInstance, "setAltitude", Double.valueOf(RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null)));
                                        xposedHelpers17.callMethod(objNewInstance, "setTime", Long.valueOf(System.currentTimeMillis()));
                                        xposedHelpers17.callMethod(objNewInstance, "setElapsedRealtimeNanos", Long.valueOf(SystemClock.elapsedRealtimeNanos()));
                                        try {
                                            Bundle bundle = new Bundle();
                                            int iOptInt = config$xposed_globalRelease.optInt("satellite_count", 20);
                                            bundle.putInt("satellites", iOptInt);
                                            bundle.putInt("satellites_in_view", iOptInt);
                                            int i20 = 12;
                                            if (iOptInt >= 12) {
                                                i20 = iOptInt;
                                            }
                                            bundle.putInt("satellites_used_in_fix", i20);
                                            bundle.putInt("satellites_visible", iOptInt);
                                            bundle.putBoolean("mockLocation", false);
                                            xposedHelpers17.callMethod(objNewInstance, "setExtras", bundle);
                                        } catch (Throwable unused3) {
                                        }
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(objNewInstance, "setIsFromMockProvider", Boolean.FALSE);
                                        } catch (Throwable unused4) {
                                        }
                                        return objNewInstance;
                                    } catch (Throwable th9) {
                                        XposedBridge.INSTANCE.log("[LocationSpoofer] getLastKnownLocation build error: " + th9);
                                        return objProceed;
                                    }
                                }
                            });
                            hookHandleIntercept6.getClass();
                            arrayList110.add(hookHandleIntercept6);
                            i19++;
                        } catch (Throwable th9) {
                            HookStatus.INSTANCE.error(clsFindClass11.getName() + "#getLastKnownLocation", th9);
                            xposedHelpers = xposedHelpers;
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass11.getName(), "getLastKnownLocation", i19);
            } catch (Throwable th10) {
                XposedBridge.INSTANCE.log("[LocationSpoofer] Failed to hook getLastKnownLocation: " + th10);
            }
            try {
                XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
                Class<?> clsFindClass12 = xposedHelpers17.findClass("android.location.LocationManager", classLoader);
                ArrayList arrayList111 = new ArrayList();
                d0VarY = zm3.y(clsFindClass12.getDeclaredMethods());
                int i110 = 0;
                while (d0VarY.hasNext()) {
                    method4 = (Method) d0VarY.next();
                    if (!o51.f(method4.getName(), "isLocationEnabled") && !Modifier.isAbstract(method4.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept7 = xposedHelpers17.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$7
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method4.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                                        return Boolean.TRUE;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept7.getClass();
                            arrayList111.add(hookHandleIntercept7);
                            i110++;
                        } catch (Throwable th11) {
                            HookStatus.INSTANCE.error(clsFindClass12.getName() + "#isLocationEnabled", th11);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass12.getName(), "isLocationEnabled", i110);
                XposedHelpers xposedHelpers18 = XposedHelpers.INSTANCE;
                ArrayList arrayList112 = new ArrayList();
                d0VarY2 = zm3.y(clsFindClass12.getDeclaredMethods());
                int i111 = 0;
                while (d0VarY2.hasNext()) {
                    method3 = (Method) d0VarY2.next();
                    if (!o51.f(method3.getName(), "isProviderEnabled") && !Modifier.isAbstract(method3.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept8 = xposedHelpers18.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$8
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method3.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                                        return Boolean.TRUE;
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept8.getClass();
                            arrayList112.add(hookHandleIntercept8);
                            i111++;
                        } catch (Throwable th12) {
                            HookStatus.INSTANCE.error(clsFindClass12.getName() + "#isProviderEnabled", th12);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass12.getName(), "isProviderEnabled", i111);
                XposedHelpers xposedHelpers19 = XposedHelpers.INSTANCE;
                ArrayList arrayList113 = new ArrayList();
                d0VarY3 = zm3.y(clsFindClass12.getDeclaredMethods());
                int i112 = 0;
                while (d0VarY3.hasNext()) {
                    method2 = (Method) d0VarY3.next();
                    if (!o51.f(method2.getName(), "getAllProviders") && !Modifier.isAbstract(method2.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept9 = xposedHelpers19.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$9
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method2.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                                        return am1.G("gps", "network", "passive");
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept9.getClass();
                            arrayList113.add(hookHandleIntercept9);
                            i112++;
                        } catch (Throwable th13) {
                            HookStatus.INSTANCE.error(clsFindClass12.getName() + "#getAllProviders", th13);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass12.getName(), "getAllProviders", i112);
                XposedHelpers xposedHelpers110 = XposedHelpers.INSTANCE;
                ArrayList arrayList114 = new ArrayList();
                d0VarY4 = zm3.y(clsFindClass12.getDeclaredMethods());
                int i113 = 0;
                while (d0VarY4.hasNext()) {
                    method = (Method) d0VarY4.next();
                    if (!o51.f(method.getName(), "getProviders") && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept10 = xposedHelpers110.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.LocationProviderHookerKt$hookLocationProviders$$inlined$hookAllMethods$10
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method.getClass();
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && !l13.A0(str, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                                        return am1.G("gps", "network", "passive");
                                    }
                                    List args = chain.getArgs();
                                    args.getClass();
                                    return chain.proceed(args.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept10.getClass();
                            arrayList114.add(hookHandleIntercept10);
                            i113++;
                        } catch (Throwable th14) {
                            HookStatus.INSTANCE.error(clsFindClass12.getName() + "#getProviders", th14);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClass12.getName(), "getProviders", i113);
            } catch (Throwable unused3) {
            }
        } catch (Throwable th15) {
            XposedBridge.INSTANCE.log(th15);
        }
    }
}
