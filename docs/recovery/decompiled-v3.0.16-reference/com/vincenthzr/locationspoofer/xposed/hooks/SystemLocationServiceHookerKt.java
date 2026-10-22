package com.vincenthzr.locationspoofer.xposed.hooks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.ModuleBinderDeaths;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.au0;
import defpackage.az2;
import defpackage.d0;
import defpackage.da0;
import defpackage.k43;
import defpackage.l13;
import defpackage.mf3;
import defpackage.mh0;
import defpackage.o51;
import defpackage.p91;
import defpackage.uj0;
import defpackage.wg2;
import defpackage.yo;
import defpackage.zm3;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemLocationServiceHookerKt {
    private static final ConcurrentHashMap<IBinder, CallbackRegistrationInfo> activeCallbackBinders;
    private static final ConcurrentHashMap<IBinder, GnssNmeaRegistrationInfo> activeGnssNmeaBinders;
    private static final ConcurrentHashMap<IBinder, GnssStatusRegistrationInfo> activeGnssStatusBinders;
    private static final ConcurrentHashMap<IBinder, ListenerRegistrationInfo> activeListenerBinders;
    private static final ConcurrentHashMap<PendingIntent, String> activePendingIntents;
    private static volatile boolean isHeartbeatTimerStarted;
    private static final Set<Object> spoofedListenerInstances;
    private static final ThreadLocal<Boolean> syntheticNmeaDispatch;

    static {
        Set<Object> setSynchronizedSet = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        setSynchronizedSet.getClass();
        spoofedListenerInstances = setSynchronizedSet;
        activeListenerBinders = new ConcurrentHashMap<>();
        activeGnssStatusBinders = new ConcurrentHashMap<>();
        syntheticNmeaDispatch = new ThreadLocal<>();
        activeGnssNmeaBinders = new ConcurrentHashMap<>();
        activeCallbackBinders = new ConcurrentHashMap<>();
        activePendingIntents = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> buildMockNmeaSentences(LocationHooker locationHooker, SpoofedMotion spoofedMotion, double d, float f, JSONObject jSONObject) {
        return GnssNmea.INSTANCE.build(spoofedMotion.getLat(), spoofedMotion.getLng(), spoofedMotion.getSpeed(), spoofedMotion.getBearing(), d, jSONObject.optInt("satellite_count", 20), jSONObject.optBoolean("enable_jitter", true), System.currentTimeMillis());
    }

    public static final void clearSystemLocationReloadState() {
        isHeartbeatTimerStarted = false;
        activeListenerBinders.clear();
        activeGnssStatusBinders.clear();
        activeGnssNmeaBinders.clear();
        activeCallbackBinders.clear();
        activePendingIntents.clear();
        spoofedListenerInstances.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createDummyCancellationSignal() {
        return new AnonymousClass1();
    }

    private static final Object createDummyRemoteCallback() {
        return new BinderC00931();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchFakeLocationToListener(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        Method method;
        Method method2;
        Method[] methods = obj.getClass().getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methods[i];
            if (o51.f(method.getName(), "onLocationChanged") && method.getParameterTypes().length == 1 && LocationHooker.Companion.hasTypeByName(method.getParameterTypes()[0], "android.location.Location")) {
                break;
            } else {
                i++;
            }
        }
        if (method != null) {
            method.invoke(obj, obj2);
            return;
        }
        int length2 = methods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (o51.f(method2.getName(), "onLocationChanged")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (!(parameterTypes.length == 0) && List.class.isAssignableFrom(method2.getParameterTypes()[0])) {
                    break;
                }
            }
            i2++;
        }
        if (method2 != null) {
            int length3 = method2.getParameterTypes().length;
            Object[] objArr = new Object[length3];
            objArr[0] = am1.F(obj2);
            if (length3 > 1) {
                objArr[1] = createDummyRemoteCallback();
            }
            try {
                method2.invoke(obj, Arrays.copyOf(objArr, length3));
            } catch (Throwable unused) {
                if (length3 > 1) {
                    objArr[1] = null;
                    try {
                        method2.invoke(obj, Arrays.copyOf(objArr, length3));
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchGnssStatus(LocationHooker locationHooker, Object obj, Object obj2, ClassLoader classLoader) {
        IBinder iBinderAsBinder;
        GnssStatusRegistrationInfo gnssStatusRegistrationInfo;
        JSONObject config$xposed_globalRelease;
        Method method;
        Method method2;
        Method method3;
        int i;
        Class<?> cls = obj.getClass();
        IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
        if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
            iBinderAsBinder = obj instanceof IBinder ? (IBinder) obj : null;
        }
        if (iBinderAsBinder == null || (gnssStatusRegistrationInfo = activeGnssStatusBinders.get(iBinderAsBinder)) == null || (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) == null || !isGnssTarget(gnssStatusRegistrationInfo.getPackageName(), gnssStatusRegistrationInfo.getUid(), config$xposed_globalRelease)) {
            return;
        }
        long jOptLong = config$xposed_globalRelease.optLong("start_timestamp");
        int i2 = 0;
        if (gnssStatusRegistrationInfo.getLifecycle().needsStarted(jOptLong)) {
            try {
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length = methods.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i3];
                    if (o51.f(method.getName(), "onGnssStarted") && method.getParameterCount() == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (method != null) {
                    method.invoke(obj, null);
                }
            } catch (Throwable unused) {
            }
        }
        if (gnssStatusRegistrationInfo.getLifecycle().needsFirstFix(jOptLong)) {
            try {
                Method[] methods2 = cls.getMethods();
                methods2.getClass();
                int length2 = methods2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        method2 = null;
                        break;
                    }
                    method2 = methods2[i4];
                    if (o51.f(method2.getName(), "onFirstFix") && method2.getParameterCount() == 1) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (method2 != null) {
                    method2.invoke(obj, 0);
                }
            } catch (Throwable unused2) {
            }
        }
        Method[] methods3 = cls.getMethods();
        methods3.getClass();
        int length3 = methods3.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length3) {
                method3 = null;
                break;
            }
            method3 = methods3[i5];
            if (o51.f(method3.getName(), "onSvStatusChanged")) {
                break;
            } else {
                i5++;
            }
        }
        if (method3 != null) {
            try {
                if (method3.getParameterCount() == 1) {
                    if (obj2 == null) {
                        obj2 = GnssFastMockEngine.INSTANCE.getOrCreateSpoofedGnssStatus(classLoader, 20, true, null);
                    }
                    if (obj2 != null) {
                        method3.invoke(obj, obj2);
                        return;
                    }
                    return;
                }
                if (method3.getParameterCount() == 6) {
                    int[] iArr = new int[20];
                    float[] fArr = new float[20];
                    float[] fArr2 = new float[20];
                    float[] fArr3 = new float[20];
                    float[] fArr4 = new float[20];
                    Random random = new Random();
                    while (i2 < 20) {
                        if (i2 < 10) {
                            i = i2 + 1;
                        } else {
                            i = i2 < 16 ? i2 + 191 : i2 + 49;
                        }
                        iArr[i2] = (i << 4) | 7;
                        fArr[i2] = (random.nextFloat() * 12.0f) + 30.0f;
                        fArr2[i2] = (random.nextFloat() * 65.0f) + 20.0f;
                        fArr3[i2] = random.nextFloat() * 360.0f;
                        fArr4[i2] = 1.57542E9f;
                        i2++;
                    }
                    method3.invoke(obj, 20, iArr, fArr, fArr2, fArr3, fArr4);
                }
            } catch (Throwable th) {
                logLoc("[SysLoc] dispatch onSvStatusChanged error: " + th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchNmea(Object obj, long j, String str) {
        Method method;
        Method method2;
        ThreadLocal<Boolean> threadLocal = syntheticNmeaDispatch;
        Boolean bool = threadLocal.get();
        threadLocal.set(Boolean.TRUE);
        try {
            Class<?> cls = obj.getClass();
            Method[] methods = cls.getMethods();
            methods.getClass();
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i];
                if (o51.f(method2.getName(), "onNmeaReceived")) {
                    break;
                } else {
                    i++;
                }
            }
            if (method2 == null) {
                Method[] methods2 = cls.getMethods();
                methods2.getClass();
                for (Method method3 : methods2) {
                    if (o51.f(method3.getName(), "onNmeaMessage")) {
                        method = method3;
                        break;
                    }
                }
                method2 = method;
            }
            if (method2 != null) {
                try {
                    if (method2.getParameterTypes().length == 2) {
                        Class<?> cls2 = method2.getParameterTypes()[0];
                        Class cls3 = Long.TYPE;
                        if (o51.f(cls2, cls3) || o51.f(method2.getParameterTypes()[0], cls3)) {
                            method2.invoke(obj, Long.valueOf(j), str);
                        } else {
                            method2.invoke(obj, str, Long.valueOf(j));
                        }
                    } else if (method2.getParameterTypes().length == 1 && o51.f(method2.getParameterTypes()[0], String.class)) {
                        method2.invoke(obj, str);
                    }
                } catch (Throwable unused) {
                }
            }
        } finally {
            ThreadLocal<Boolean> threadLocal2 = syntheticNmeaDispatch;
            if (bool == null) {
                threadLocal2.remove();
            } else {
                threadLocal2.set(bool);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureCallbackHooked(final LocationHooker locationHooker, Object obj, String... strArr) {
        Class<?> cls = obj.getClass();
        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) != null) {
            return;
        }
        for (final String str : strArr) {
            try {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(cls.getDeclaredMethods());
                int i = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), str) && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$ensureCallbackHooked$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    SpoofedMotion currentSpoofedMotion;
                                    IBinder iBinderAsBinder;
                                    chain.getClass();
                                    method.getClass();
                                    Object thisObject = chain.getThisObject();
                                    IBinder iBinder = null;
                                    IInterface iInterface = thisObject instanceof IInterface ? (IInterface) thisObject : null;
                                    if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                        Object thisObject2 = chain.getThisObject();
                                        if (thisObject2 instanceof IBinder) {
                                            iBinder = (IBinder) thisObject2;
                                        }
                                    } else {
                                        iBinder = iBinderAsBinder;
                                    }
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    boolean z = config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("system_hook_global_mode", false);
                                    if (((iBinder != null && (SystemLocationServiceHookerKt.activeListenerBinders.containsKey(iBinder) || SystemLocationServiceHookerKt.activeCallbackBinders.containsKey(iBinder))) || SystemLocationServiceHookerKt.spoofedListenerInstances.contains(chain.getThisObject()) || z) && config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "WGS-84")) != null) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        SystemLocationServiceHookerKt.rewriteLocationArgs(args, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker));
                                        String str2 = str;
                                        double lat = currentSpoofedMotion.getLat();
                                        double lng = currentSpoofedMotion.getLng();
                                        StringBuilder sb = new StringBuilder("[SysLoc] Rewrote location in callback ");
                                        sb.append(str2);
                                        sb.append(" for target binder (lat=");
                                        sb.append(lat);
                                        az2.x(sb, ", lng=", lng, ", isGlobal=");
                                        sb.append(z);
                                        sb.append(")");
                                        SystemLocationServiceHookerKt.logLoc(sb.toString());
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hookGnssNmeaListenerCallback(final LocationHooker locationHooker, Object obj) {
        Class<?> cls = obj.getClass();
        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) != null) {
            return;
        }
        for (String str : am1.G("onNmeaReceived", "onNmeaMessage")) {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(cls.getDeclaredMethods());
            int i = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), str) && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookGnssNmeaListenerCallback$lambda$86$$inlined$hookAllMethods$1
                            public Object intercept(XposedInterface.Chain chain) {
                                IBinder iBinderAsBinder;
                                chain.getClass();
                                method.getClass();
                                Object thisObject = chain.getThisObject();
                                IInterface iInterface = thisObject instanceof IInterface ? (IInterface) thisObject : null;
                                if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                    Object thisObject2 = chain.getThisObject();
                                    iBinderAsBinder = thisObject2 instanceof IBinder ? (IBinder) thisObject2 : null;
                                }
                                GnssNmeaRegistrationInfo gnssNmeaRegistrationInfo = iBinderAsBinder != null ? (GnssNmeaRegistrationInfo) SystemLocationServiceHookerKt.activeGnssNmeaBinders.get(iBinderAsBinder) : null;
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (gnssNmeaRegistrationInfo != null && config$xposed_globalRelease != null && SystemLocationServiceHookerKt.isGnssTarget(gnssNmeaRegistrationInfo.getPackageName(), gnssNmeaRegistrationInfo.getUid(), config$xposed_globalRelease) && !o51.f(SystemLocationServiceHookerKt.syntheticNmeaDispatch.get(), Boolean.TRUE)) {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hookGnssStatusListenerCallback(final LocationHooker locationHooker, Object obj) {
        final Class<?> cls = obj.getClass();
        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) != null) {
            return;
        }
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(cls.getDeclaredMethods());
            int i = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "onSvStatusChanged") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookGnssStatusListenerCallback$$inlined$hookAllMethods$1
                            public Object intercept(XposedInterface.Chain chain) {
                                IBinder iBinderAsBinder;
                                int i2;
                                chain.getClass();
                                method.getClass();
                                Object thisObject = chain.getThisObject();
                                IInterface iInterface = thisObject instanceof IInterface ? (IInterface) thisObject : null;
                                if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                    Object thisObject2 = chain.getThisObject();
                                    iBinderAsBinder = thisObject2 instanceof IBinder ? (IBinder) thisObject2 : null;
                                }
                                GnssStatusRegistrationInfo gnssStatusRegistrationInfo = iBinderAsBinder != null ? (GnssStatusRegistrationInfo) SystemLocationServiceHookerKt.activeGnssStatusBinders.get(iBinderAsBinder) : null;
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (gnssStatusRegistrationInfo != null && config$xposed_globalRelease != null && SystemLocationServiceHookerKt.isGnssTarget(gnssStatusRegistrationInfo.getPackageName(), gnssStatusRegistrationInfo.getUid(), config$xposed_globalRelease)) {
                                    List args = chain.getArgs();
                                    args.getClass();
                                    int iOptInt = config$xposed_globalRelease.optInt("satellite_count", 20);
                                    boolean zOptBoolean = config$xposed_globalRelease.optBoolean("enable_jitter", true);
                                    if (args.size() == 1) {
                                        GnssFastMockEngine gnssFastMockEngine = GnssFastMockEngine.INSTANCE;
                                        ClassLoader classLoader = cls.getClassLoader();
                                        if (classLoader == null) {
                                            classLoader = ClassLoader.getSystemClassLoader();
                                        }
                                        classLoader.getClass();
                                        Object orCreateSpoofedGnssStatus = gnssFastMockEngine.getOrCreateSpoofedGnssStatus(classLoader, iOptInt, zOptBoolean, args.get(0));
                                        if (orCreateSpoofedGnssStatus != null) {
                                            return chain.proceed(new Object[]{orCreateSpoofedGnssStatus});
                                        }
                                    } else if (args.size() >= 6) {
                                        int iV = mh0.v(iOptInt, 4, 32);
                                        int[] iArr = new int[iV];
                                        float[] fArr = new float[iV];
                                        float[] fArr2 = new float[iV];
                                        float[] fArr3 = new float[iV];
                                        float[] fArr4 = new float[iV];
                                        Random random = new Random();
                                        int i3 = 0;
                                        while (i3 < iV) {
                                            if (i3 < 10) {
                                                i2 = i3 + 1;
                                            } else {
                                                i2 = i3 < 16 ? i3 + 191 : i3 + 49;
                                            }
                                            iArr[i3] = (i2 << 4) | 7;
                                            fArr[i3] = (random.nextFloat() * 12.0f) + 30.0f;
                                            fArr2[i3] = (random.nextFloat() * 65.0f) + 20.0f;
                                            fArr3[i3] = random.nextFloat() * 360.0f;
                                            fArr4[i3] = 1.57542E9f;
                                            i3++;
                                        }
                                        ArrayList arrayList2 = new ArrayList(args);
                                        arrayList2.set(0, Integer.valueOf(iV));
                                        arrayList2.set(1, iArr);
                                        arrayList2.set(2, fArr);
                                        arrayList2.set(3, fArr2);
                                        arrayList2.set(4, fArr3);
                                        arrayList2.set(5, fArr4);
                                        return chain.proceed(arrayList2.toArray(new Object[0]));
                                    }
                                }
                                List args2 = chain.getArgs();
                                args2.getClass();
                                return chain.proceed(args2.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(cls.getName() + "#onSvStatusChanged", th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "onSvStatusChanged", i);
            for (final String str : am1.G("onGnssStarted", "onFirstFix", "onGnssStopped")) {
                XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarY2 = zm3.y(cls.getDeclaredMethods());
                int i2 = 0;
                while (d0VarY2.hasNext()) {
                    final Method method2 = (Method) d0VarY2.next();
                    if (o51.f(method2.getName(), str) && !Modifier.isAbstract(method2.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookGnssStatusListenerCallback$$inlined$hookAllMethods$2
                                public Object intercept(XposedInterface.Chain chain) {
                                    IBinder iBinderAsBinder;
                                    boolean zAcceptFirstFix;
                                    chain.getClass();
                                    method2.getClass();
                                    Object thisObject = chain.getThisObject();
                                    IInterface iInterface = thisObject instanceof IInterface ? (IInterface) thisObject : null;
                                    if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                        Object thisObject2 = chain.getThisObject();
                                        iBinderAsBinder = thisObject2 instanceof IBinder ? (IBinder) thisObject2 : null;
                                    }
                                    GnssStatusRegistrationInfo gnssStatusRegistrationInfo = iBinderAsBinder != null ? (GnssStatusRegistrationInfo) SystemLocationServiceHookerKt.activeGnssStatusBinders.get(iBinderAsBinder) : null;
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (gnssStatusRegistrationInfo == null) {
                                        List args = chain.getArgs();
                                        args.getClass();
                                        return chain.proceed(args.toArray(new Object[0]));
                                    }
                                    if (config$xposed_globalRelease == null || !SystemLocationServiceHookerKt.isGnssTarget(gnssStatusRegistrationInfo.getPackageName(), gnssStatusRegistrationInfo.getUid(), config$xposed_globalRelease)) {
                                        gnssStatusRegistrationInfo.getLifecycle().reset();
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        return chain.proceed(args2.toArray(new Object[0]));
                                    }
                                    long jOptLong = config$xposed_globalRelease.optLong("start_timestamp");
                                    String str2 = str;
                                    if (o51.f(str2, "onGnssStarted")) {
                                        zAcceptFirstFix = gnssStatusRegistrationInfo.getLifecycle().acceptStarted(jOptLong);
                                    } else {
                                        zAcceptFirstFix = o51.f(str2, "onFirstFix") ? gnssStatusRegistrationInfo.getLifecycle().acceptFirstFix(jOptLong) : false;
                                    }
                                    if (!zAcceptFirstFix) {
                                        return null;
                                    }
                                    List args3 = chain.getArgs();
                                    args3.getClass();
                                    return chain.proceed(args3.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept2.getClass();
                            arrayList2.add(hookHandleIntercept2);
                            i2++;
                        } catch (Throwable th2) {
                            HookStatus.INSTANCE.error(cls.getName() + "#" + str, th2);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), str, i2);
            }
        } catch (Throwable unused) {
        }
    }

    private static final void hookPendingIntentDelivery(final LocationHooker locationHooker, ClassLoader classLoader) {
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.app.PendingIntent", classLoader);
        if (clsFindClassIfExists != null && locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsFindClassIfExists, Boolean.TRUE) == null) {
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredMethods());
            int i = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "send") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookPendingIntentDelivery$$inlined$hookAllMethods$1
                            public Object intercept(XposedInterface.Chain chain) {
                                JSONObject jSONObject;
                                chain.getClass();
                                method.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                    Object thisObject = chain.getThisObject();
                                    PendingIntent pendingIntent = thisObject instanceof PendingIntent ? (PendingIntent) thisObject : null;
                                    if (pendingIntent == null || !SystemLocationServiceHookerKt.activePendingIntents.containsKey(pendingIntent)) {
                                        String creatorPackage = pendingIntent != null ? pendingIntent.getCreatorPackage() : null;
                                        if (creatorPackage != null) {
                                            jSONObject = config$xposed_globalRelease;
                                            if (SystemHookUtils.isTargetCaller$default(SystemHookUtils.INSTANCE, chain.getThisObject(), creatorPackage, jSONObject, null, 8, null)) {
                                            }
                                        }
                                    } else {
                                        jSONObject = config$xposed_globalRelease;
                                    }
                                    SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "WGS-84");
                                    if (currentSpoofedMotion != null) {
                                        double dRealisticAltitude$default = RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, jSONObject, 0L, 2, null);
                                        float jitteredAccuracy = CoordinateConverterKt.getJitteredAccuracy(locationHooker);
                                        for (Object obj : chain.getArgs()) {
                                            if (obj instanceof Intent) {
                                                Intent intent = (Intent) obj;
                                                Location location = (Location) intent.getParcelableExtra("location");
                                                if (location == null) {
                                                    location = (Location) intent.getParcelableExtra("location");
                                                }
                                                Location location2 = location;
                                                if (location2 != null) {
                                                    SystemHookUtils.INSTANCE.applyFakeLocationFields(location2, currentSpoofedMotion, dRealisticAltitude$default, jitteredAccuracy);
                                                }
                                                try {
                                                    ArrayList parcelableArrayListExtra = ((Intent) obj).getParcelableArrayListExtra("locations");
                                                    if (parcelableArrayListExtra != null) {
                                                        int size = parcelableArrayListExtra.size();
                                                        int i2 = 0;
                                                        while (i2 < size) {
                                                            Object obj2 = parcelableArrayListExtra.get(i2);
                                                            i2++;
                                                            Location location3 = (Location) obj2;
                                                            SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                                            location3.getClass();
                                                            systemHookUtils.applyFakeLocationFields(location3, currentSpoofedMotion, dRealisticAltitude$default, jitteredAccuracy);
                                                        }
                                                    }
                                                } catch (Throwable unused) {
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
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(clsFindClassIfExists.getName().concat("#send"), th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "send", i);
            logLoc("[SysLoc] PendingIntent.send hooked for location intent rewrite");
        }
    }

    /* JADX WARN: Code duplicated, block: B:350:0x08e2 A[Catch: all -> 0x0935, TryCatch #8 {all -> 0x0935, blocks: (B:347:0x08cb, B:348:0x08dc, B:350:0x08e2, B:352:0x08f2, B:357:0x0919, B:360:0x0937, B:354:0x08fc), top: B:571:0x08cb, inners: #71 }] */
    /* JADX WARN: Code duplicated, block: B:366:0x0966  */
    /* JADX WARN: Code duplicated, block: B:370:0x097f A[Catch: all -> 0x09d2, TryCatch #25 {all -> 0x09d2, blocks: (B:367:0x0968, B:368:0x0979, B:370:0x097f, B:372:0x098f, B:377:0x09b6, B:381:0x09d8, B:374:0x0999), top: B:605:0x0968, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:390:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:394:0x0a48 A[Catch: all -> 0x0a9e, TryCatch #79 {all -> 0x0a9e, blocks: (B:391:0x0a31, B:392:0x0a42, B:394:0x0a48, B:396:0x0a58, B:402:0x0a80), top: B:713:0x0a31 }] */
    /* JADX WARN: Code duplicated, block: B:406:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:414:0x0ad3 A[Catch: all -> 0x0b26, TryCatch #2 {all -> 0x0b26, blocks: (B:411:0x0aba, B:412:0x0acd, B:414:0x0ad3, B:416:0x0ae3, B:421:0x0b0a, B:424:0x0b28, B:418:0x0aed), top: B:559:0x0aba, inners: #59 }] */
    /* JADX WARN: Code duplicated, block: B:430:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0b9b A[Catch: all -> 0x0c12, TRY_LEAVE, TryCatch #63 {all -> 0x0c12, blocks: (B:432:0x0b82, B:433:0x0b95, B:435:0x0b9b), top: B:681:0x0b82 }] */
    /* JADX WARN: Code duplicated, block: B:468:0x0c8e  */
    /* JADX WARN: Code duplicated, block: B:474:0x0cbd A[Catch: all -> 0x0d36, TRY_LEAVE, TryCatch #10 {all -> 0x0d36, blocks: (B:472:0x0cb7, B:474:0x0cbd), top: B:575:0x0cb7 }] */
    /* JADX WARN: Code duplicated, block: B:507:0x0d8c  */
    /* JADX WARN: Code duplicated, block: B:513:0x0dae  */
    /* JADX WARN: Code duplicated, block: B:517:0x0dc7 A[Catch: all -> 0x0e1b, TryCatch #76 {all -> 0x0e1b, blocks: (B:514:0x0db0, B:515:0x0dc1, B:517:0x0dc7, B:519:0x0dd7, B:524:0x0dff, B:528:0x0e23, B:521:0x0de1), top: B:707:0x0db0, inners: #51 }] */
    /* JADX WARN: Code duplicated, block: B:537:0x0e6c  */
    /* JADX WARN: Code duplicated, block: B:635:0x0ca2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0b82 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:0x0c65 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:876:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v27 */
    /* JADX WARN: Type inference failed for: r17v28 */
    /* JADX WARN: Type inference failed for: r17v29, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v32 */
    /* JADX WARN: Type inference failed for: r17v33 */
    /* JADX WARN: Type inference failed for: r17v34 */
    /* JADX WARN: Type inference failed for: r17v36 */
    /* JADX WARN: Type inference failed for: r17v37 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v39 */
    /* JADX WARN: Type inference failed for: r17v40 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v159 */
    /* JADX WARN: Type inference failed for: r2v160 */
    /* JADX WARN: Type inference failed for: r2v161 */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v99 */
    public static final void hookSystemLocationService(LocationHooker locationHooker, ClassLoader classLoader) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String[] strArr;
        XposedHelpers xposedHelpers;
        String str6;
        String str7;
        final ClassLoader classLoader2;
        XposedInterface.Hooker hooker;
        Class<?> cls;
        String str8;
        String[] strArr2;
        int i2;
        final String str9;
        String str10;
        d0 d0VarY;
        final Method method;
        String[] strArr3;
        int i3;
        String[] strArr4;
        int i4;
        ?? r17;
        ?? r2;
        ?? r18;
        ArrayList arrayListV0;
        int size;
        int i5;
        ArrayList arrayListV1;
        int size2;
        int i6;
        int i7;
        final Class<?> cls2;
        ArrayList arrayList;
        Class<?> cls3;
        int i8;
        d0 d0VarY2;
        final Method method2;
        Class<?> cls4;
        int i9;
        Class<?> cls5;
        d0 d0VarY3;
        final Method method3;
        d0 d0VarY4;
        final Method method4;
        String str11;
        ?? r19;
        d0 d0VarY5;
        final Method method5;
        final String str12;
        String str13;
        String str14;
        d0 d0VarY6;
        final Method method6;
        d0 d0VarY7;
        final Method method7;
        String[] strArr5;
        int i10;
        String[] strArr6;
        int i11;
        String[] strArr7;
        int i12;
        String[] strArr8;
        String str15;
        String str16;
        String[] strArr9;
        int i13;
        XposedHelpers xposedHelpers2;
        int i14;
        final LocationHooker locationHooker2 = locationHooker;
        locationHooker2.getClass();
        classLoader.getClass();
        final ClassLoader classLoader3 = classLoader;
        Class<?> clsLocate$default = SystemClassLocator.locate$default(SystemClassLocator.INSTANCE, SystemComponent.LOCATION_MANAGER_SERVICE, classLoader3, null, null, null, false, null, null, 252, null);
        if (clsLocate$default == null) {
            logLoc("[SysHook] LocationManagerService not found, skip system-level location hook");
            return;
        }
        logLoc("[SysHook] hookSystemLocationService invoked on ".concat(clsLocate$default.getName()));
        if (locationHooker2.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsLocate$default, Boolean.TRUE) != null) {
            return;
        }
        startSystemLocationHeartbeat(locationHooker, classLoader);
        String str17 = "registerLocationPendingIntent";
        String str18 = "registerLocationListener";
        String str19 = "getLastLocation";
        String str20 = " failed: ";
        String str21 = " hooked";
        if (locationHooker2.getSystemCapabilities$xposed_globalRelease().getLocationDelivery()) {
            str = "registerLocationPendingIntent";
            str2 = "registerLocationListener";
            str3 = "getLastLocation";
        } else {
            try {
                XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarY8 = zm3.y(clsLocate$default.getDeclaredMethods());
                int i15 = 0;
                while (d0VarY8.hasNext()) {
                    final Method method8 = (Method) d0VarY8.next();
                    if (!o51.f(method8.getName(), "getLastLocation") || Modifier.isAbstract(method8.getModifiers())) {
                        xposedHelpers = xposedHelpers3;
                        xposedHelpers3 = xposedHelpers;
                        arrayList2 = arrayList2;
                    } else {
                        try {
                            xposedHelpers = xposedHelpers3;
                            try {
                                XposedInterface.HookHandle hookHandleIntercept = xposedHelpers3.getModule().hook(method8).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$1
                                    public Object intercept(XposedInterface.Chain chain) {
                                        chain.getClass();
                                        method8.getClass();
                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease == null) {
                                            List args = chain.getArgs();
                                            args.getClass();
                                            return chain.proceed(args.toArray(new Object[0]));
                                        }
                                        SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                        List<? extends Object> args2 = chain.getArgs();
                                        args2.getClass();
                                        String strExtractPackageName = systemHookUtils.extractPackageName(args2);
                                        List<? extends Object> args3 = chain.getArgs();
                                        args3.getClass();
                                        if (!systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args3))) {
                                            List args4 = chain.getArgs();
                                            args4.getClass();
                                            return chain.proceed(args4.toArray(new Object[0]));
                                        }
                                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84");
                                        if (currentSpoofedMotion == null) {
                                            List args5 = chain.getArgs();
                                            args5.getClass();
                                            return chain.proceed(args5.toArray(new Object[0]));
                                        }
                                        List<? extends Object> args6 = chain.getArgs();
                                        args6.getClass();
                                        String strExtractProvider = systemHookUtils.extractProvider(args6);
                                        Object objBuildFakeLocation = systemHookUtils.buildFakeLocation(classLoader3, strExtractProvider, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                        if (objBuildFakeLocation == null) {
                                            List args7 = chain.getArgs();
                                            args7.getClass();
                                            return chain.proceed(args7.toArray(new Object[0]));
                                        }
                                        if (strExtractPackageName == null) {
                                            strExtractPackageName = "caller";
                                        }
                                        double lat = currentSpoofedMotion.getLat();
                                        double lng = currentSpoofedMotion.getLng();
                                        StringBuilder sb = new StringBuilder("[SysHook] Injected fake location for ");
                                        sb.append(strExtractPackageName);
                                        sb.append(" (getLastLocation): lat=");
                                        sb.append(lat);
                                        az2.x(sb, ", lng=", lng, ", provider=");
                                        sb.append(strExtractProvider);
                                        SystemLocationServiceHookerKt.logLoc(sb.toString());
                                        return objBuildFakeLocation;
                                    }
                                });
                                hookHandleIntercept.getClass();
                                arrayList2.add(hookHandleIntercept);
                                i15++;
                                xposedHelpers3 = xposedHelpers;
                            } catch (Throwable th) {
                                th = th;
                                HookStatus.INSTANCE.error(clsLocate$default.getName() + "#getLastLocation", th);
                                xposedHelpers3 = xposedHelpers;
                                arrayList2 = arrayList2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            xposedHelpers = xposedHelpers3;
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), "getLastLocation", i15);
                logLoc("[SysHook] LocationManagerService.getLastLocation hooked");
            } catch (Throwable th3) {
                logLoc("[SysHook] hook getLastLocation failed: " + th3);
            }
            String[] strArr10 = {"registerLocationListener", "requestLocationUpdates", "registerLocationPendingIntent"};
            int i16 = 0;
            while (i16 < 3) {
                final String str22 = strArr10[i16];
                try {
                    XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                    str4 = str17;
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        d0 d0VarY9 = zm3.y(clsLocate$default.getDeclaredMethods());
                        str5 = str18;
                        int i17 = 0;
                        while (d0VarY9.hasNext()) {
                            try {
                                final Method method9 = (Method) d0VarY9.next();
                                str19 = str19;
                                try {
                                    if (!o51.f(method9.getName(), str22) || Modifier.isAbstract(method9.getModifiers())) {
                                        strArr = strArr10;
                                        strArr10 = strArr;
                                        arrayList3 = arrayList3;
                                    } else {
                                        try {
                                            strArr = strArr10;
                                            try {
                                                XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers4.getModule().hook(method9).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$2
                                                    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
                                                    /* JADX WARN: Code duplicated, block: B:62:0x016f A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:3:0x000a, B:5:0x0012, B:7:0x0034, B:8:0x003f, B:10:0x0045, B:12:0x004b, B:18:0x005f, B:21:0x0074, B:23:0x0078, B:26:0x007f, B:36:0x0096, B:40:0x00b5, B:45:0x00ce, B:47:0x00fd, B:59:0x015e, B:60:0x0169, B:62:0x016f, B:66:0x0179, B:68:0x017d, B:72:0x0186, B:75:0x018e, B:57:0x0147, B:28:0x0085, B:30:0x0089, B:50:0x011f, B:54:0x0126), top: B:85:0x000a, inners: #1 }] */
                                                    /* JADX WARN: Code duplicated, block: B:68:0x017d A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:3:0x000a, B:5:0x0012, B:7:0x0034, B:8:0x003f, B:10:0x0045, B:12:0x004b, B:18:0x005f, B:21:0x0074, B:23:0x0078, B:26:0x007f, B:36:0x0096, B:40:0x00b5, B:45:0x00ce, B:47:0x00fd, B:59:0x015e, B:60:0x0169, B:62:0x016f, B:66:0x0179, B:68:0x017d, B:72:0x0186, B:75:0x018e, B:57:0x0147, B:28:0x0085, B:30:0x0089, B:50:0x011f, B:54:0x0126), top: B:85:0x000a, inners: #1 }] */
                                                    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
                                                    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
                                                    /* JADX WARN: Code duplicated, block: B:93:0x0178 A[SYNTHETIC] */
                                                    public Object intercept(XposedInterface.Chain chain) {
                                                        Object obj;
                                                        String str23;
                                                        String str24;
                                                        Iterator it;
                                                        Object next;
                                                        PendingIntent pendingIntent;
                                                        final IBinder iBinderAsBinder;
                                                        String str25;
                                                        chain.getClass();
                                                        method9.getClass();
                                                        try {
                                                            JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                            if (config$xposed_globalRelease != null) {
                                                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                                                List<? extends Object> args = chain.getArgs();
                                                                args.getClass();
                                                                String strExtractPackageName = systemHookUtils.extractPackageName(args);
                                                                List<? extends Object> args2 = chain.getArgs();
                                                                args2.getClass();
                                                                if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args2))) {
                                                                    List args3 = chain.getArgs();
                                                                    args3.getClass();
                                                                    Iterator it2 = args3.iterator();
                                                                    while (true) {
                                                                        if (!it2.hasNext()) {
                                                                            obj = null;
                                                                            break;
                                                                        }
                                                                        Object next2 = it2.next();
                                                                        if (next2 != null && LocationHooker.Companion.hasTypeByName(next2.getClass(), "android.location.ILocationListener")) {
                                                                            obj = next2;
                                                                            break;
                                                                        }
                                                                    }
                                                                    SystemHookUtils systemHookUtils2 = SystemHookUtils.INSTANCE;
                                                                    List<? extends Object> args4 = chain.getArgs();
                                                                    args4.getClass();
                                                                    String strExtractProvider = systemHookUtils2.extractProvider(args4);
                                                                    if (obj == null) {
                                                                        str23 = " (total active: ";
                                                                        str24 = ")";
                                                                        List args5 = chain.getArgs();
                                                                        args5.getClass();
                                                                        it = args5.iterator();
                                                                        do {
                                                                            if (it.hasNext()) {
                                                                                next = null;
                                                                                break;
                                                                            }
                                                                            next = it.next();
                                                                        } while (!(next instanceof PendingIntent));
                                                                        if (next instanceof PendingIntent) {
                                                                            pendingIntent = (PendingIntent) next;
                                                                        } else {
                                                                            pendingIntent = null;
                                                                        }
                                                                        if (pendingIntent != null) {
                                                                            if (strExtractPackageName == null && (strExtractPackageName = pendingIntent.getCreatorPackage()) == null) {
                                                                                strExtractPackageName = "unknown";
                                                                            }
                                                                            SystemLocationServiceHookerKt.activePendingIntents.put(pendingIntent, strExtractPackageName);
                                                                            SystemLocationServiceHookerKt.logLoc("[SysHook] Registered target location PendingIntent for " + strExtractPackageName + str23 + SystemLocationServiceHookerKt.activePendingIntents.size() + str24);
                                                                        }
                                                                    } else {
                                                                        IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
                                                                        if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                                                            iBinderAsBinder = obj instanceof IBinder ? (IBinder) obj : null;
                                                                        }
                                                                        final String str26 = strExtractPackageName == null ? "unknown" : strExtractPackageName;
                                                                        if (iBinderAsBinder != null) {
                                                                            str25 = strExtractProvider;
                                                                            SystemLocationServiceHookerKt.activeListenerBinders.put(iBinderAsBinder, new ListenerRegistrationInfo(obj, str26, str25, 0L, 8, null));
                                                                            try {
                                                                                ModuleBinderDeaths.INSTANCE.watch(iBinderAsBinder, new au0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$2$1
                                                                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                                                    public final void m6invoke() {
                                                                                        SystemLocationServiceHookerKt.activeListenerBinders.remove(iBinderAsBinder);
                                                                                        SystemLocationServiceHookerKt.logLoc("[SysHook] Listener died and removed for " + str26);
                                                                                    }

                                                                                    @Override // defpackage.au0
                                                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                                                        m6invoke();
                                                                                        return mf3.a;
                                                                                    }
                                                                                });
                                                                            } catch (Throwable unused) {
                                                                            }
                                                                        } else {
                                                                            str25 = strExtractProvider;
                                                                        }
                                                                        SystemLocationServiceHookerKt.spoofedListenerInstances.add(obj);
                                                                        SystemLocationServiceHookerKt.ensureCallbackHooked(locationHooker2, obj, "onLocationChanged");
                                                                        String str27 = "caller";
                                                                        String str28 = strExtractPackageName == null ? "caller" : strExtractPackageName;
                                                                        SystemLocationServiceHookerKt.logLoc("[SysHook] Registered target location listener for " + str28 + " (total active: " + SystemLocationServiceHookerKt.activeListenerBinders.size() + ")");
                                                                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84");
                                                                        if (currentSpoofedMotion != null) {
                                                                            String str29 = str25;
                                                                            str23 = " (total active: ";
                                                                            str24 = ")";
                                                                            Object objBuildFakeLocation = SystemHookUtils.INSTANCE.buildFakeLocation(classLoader3, str29, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                                            if (objBuildFakeLocation != null) {
                                                                                try {
                                                                                    SystemLocationServiceHookerKt.dispatchFakeLocationToListener(obj, objBuildFakeLocation);
                                                                                    if (strExtractPackageName != null) {
                                                                                        str27 = strExtractPackageName;
                                                                                    }
                                                                                    SystemLocationServiceHookerKt.logLoc("[SysHook] Proactively dispatched instant fake location to listener for " + str27 + " (provider=" + str29 + str24);
                                                                                } catch (Throwable th4) {
                                                                                    SystemLocationServiceHookerKt.logLoc("[SysHook] instant proactive dispatch failed: " + th4);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str23 = " (total active: ";
                                                                            str24 = ")";
                                                                        }
                                                                        List args6 = chain.getArgs();
                                                                        args6.getClass();
                                                                        it = args6.iterator();
                                                                        do {
                                                                            if (it.hasNext()) {
                                                                                next = null;
                                                                                break;
                                                                            }
                                                                            next = it.next();
                                                                        } while (!(next instanceof PendingIntent));
                                                                        if (next instanceof PendingIntent) {
                                                                            pendingIntent = (PendingIntent) next;
                                                                        } else {
                                                                            pendingIntent = null;
                                                                        }
                                                                        if (pendingIntent != null) {
                                                                            if (strExtractPackageName == null) {
                                                                                strExtractPackageName = "unknown";
                                                                            }
                                                                            SystemLocationServiceHookerKt.activePendingIntents.put(pendingIntent, strExtractPackageName);
                                                                            SystemLocationServiceHookerKt.logLoc("[SysHook] Registered target location PendingIntent for " + strExtractPackageName + str23 + SystemLocationServiceHookerKt.activePendingIntents.size() + str24);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            SystemLocationServiceHookerKt.logLoc("[SysHook] " + str22 + " pre-hook error: " + th5);
                                                        }
                                                        List args7 = chain.getArgs();
                                                        args7.getClass();
                                                        return chain.proceed(args7.toArray(new Object[0]));
                                                    }
                                                });
                                                hookHandleIntercept2.getClass();
                                                arrayList3.add(hookHandleIntercept2);
                                                i17++;
                                                strArr10 = strArr;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                try {
                                                    HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str22, th);
                                                    strArr10 = strArr;
                                                    arrayList3 = arrayList3;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    logLoc("[SysHook] hook " + str22 + " failed: " + th);
                                                    i16++;
                                                    str17 = str4;
                                                    str18 = str5;
                                                    str19 = str19;
                                                    strArr10 = strArr;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            strArr = strArr10;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    strArr = strArr10;
                                    logLoc("[SysHook] hook " + str22 + " failed: " + th);
                                    i16++;
                                    str17 = str4;
                                    str18 = str5;
                                    str19 = str19;
                                    strArr10 = strArr;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                str19 = str19;
                                strArr = strArr10;
                                logLoc("[SysHook] hook " + str22 + " failed: " + th);
                                i16++;
                                str17 = str4;
                                str18 = str5;
                                str19 = str19;
                                strArr10 = strArr;
                            }
                        }
                        str19 = str19;
                        strArr = strArr10;
                        HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str22, i17);
                        logLoc("[SysHook] LocationManagerService." + str22 + " hooked");
                    } catch (Throwable th9) {
                        th = th9;
                        str5 = str18;
                        str19 = str19;
                        strArr = strArr10;
                        logLoc("[SysHook] hook " + str22 + " failed: " + th);
                        i16++;
                        str17 = str4;
                        str18 = str5;
                        str19 = str19;
                        strArr10 = strArr;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    str4 = str17;
                }
                i16++;
                str17 = str4;
                str18 = str5;
                str19 = str19;
                strArr10 = strArr;
            }
            str = str17;
            str2 = str18;
            str3 = str19;
            String[] strArr11 = {"unregisterLocationListener", "removeUpdates"};
            int i18 = 0;
            while (i18 < 2) {
                String str23 = strArr11[i18];
                try {
                    XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                    ArrayList arrayList4 = new ArrayList();
                    d0 d0VarY10 = zm3.y(clsLocate$default.getDeclaredMethods());
                    int i19 = 0;
                    while (d0VarY10.hasNext()) {
                        final Method method10 = (Method) d0VarY10.next();
                        strArr11 = strArr11;
                        try {
                            if (!o51.f(method10.getName(), str23) || Modifier.isAbstract(method10.getModifiers())) {
                                i = i18;
                                i18 = i;
                                xposedHelpers5 = xposedHelpers5;
                            } else {
                                try {
                                    i = i18;
                                    try {
                                        XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers5.getModule().hook(method10).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$3
                                            public Object intercept(XposedInterface.Chain chain) {
                                                Object next;
                                                Object next2;
                                                IBinder iBinderAsBinder;
                                                chain.getClass();
                                                method10.getClass();
                                                try {
                                                    List args = chain.getArgs();
                                                    args.getClass();
                                                    Iterator it = args.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            next = null;
                                                            break;
                                                        }
                                                        next = it.next();
                                                        if (next != null && LocationHooker.Companion.hasTypeByName(next.getClass(), "android.location.ILocationListener")) {
                                                            break;
                                                        }
                                                    }
                                                    if (next != null) {
                                                        IInterface iInterface = next instanceof IInterface ? (IInterface) next : null;
                                                        if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                                            iBinderAsBinder = next instanceof IBinder ? (IBinder) next : null;
                                                        }
                                                        if (iBinderAsBinder != null) {
                                                            SystemLocationServiceHookerKt.activeListenerBinders.remove(iBinderAsBinder);
                                                        }
                                                        SystemLocationServiceHookerKt.spoofedListenerInstances.remove(next);
                                                    }
                                                    List args2 = chain.getArgs();
                                                    args2.getClass();
                                                    Iterator it2 = args2.iterator();
                                                    do {
                                                        if (!it2.hasNext()) {
                                                            next2 = null;
                                                            break;
                                                        }
                                                        next2 = it2.next();
                                                    } while (!(next2 instanceof PendingIntent));
                                                    PendingIntent pendingIntent = next2 instanceof PendingIntent ? (PendingIntent) next2 : null;
                                                    if (pendingIntent != null) {
                                                        SystemLocationServiceHookerKt.activePendingIntents.remove(pendingIntent);
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                                List args3 = chain.getArgs();
                                                args3.getClass();
                                                return chain.proceed(args3.toArray(new Object[0]));
                                            }
                                        });
                                        hookHandleIntercept3.getClass();
                                        arrayList4.add(hookHandleIntercept3);
                                        i19++;
                                        i18 = i;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        try {
                                            HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str23, th);
                                            i18 = i;
                                            xposedHelpers5 = xposedHelpers5;
                                        } catch (Throwable unused) {
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    i = i18;
                                }
                            }
                        } catch (Throwable unused2) {
                            i = i18;
                        }
                    }
                    strArr11 = strArr11;
                    i = i18;
                    HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str23, i19);
                } catch (Throwable unused3) {
                    strArr11 = strArr11;
                }
                i18 = i + 1;
                strArr11 = strArr11;
            }
            try {
                XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                ArrayList arrayList5 = new ArrayList();
                d0 d0VarY11 = zm3.y(clsLocate$default.getDeclaredMethods());
                int i20 = 0;
                while (d0VarY11.hasNext()) {
                    final Method method11 = (Method) d0VarY11.next();
                    if (o51.f(method11.getName(), "getCurrentLocation") && !Modifier.isAbstract(method11.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept4 = xposedHelpers6.getModule().hook(method11).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$4
                                public Object intercept(XposedInterface.Chain chain) {
                                    Method method12;
                                    Object obj;
                                    final IBinder iBinderAsBinder;
                                    chain.getClass();
                                    method11.getClass();
                                    try {
                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease != null) {
                                            SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                            List<? extends Object> args = chain.getArgs();
                                            args.getClass();
                                            String strExtractPackageName = systemHookUtils.extractPackageName(args);
                                            List<? extends Object> args2 = chain.getArgs();
                                            args2.getClass();
                                            if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args2))) {
                                                List args3 = chain.getArgs();
                                                args3.getClass();
                                                Iterator it = args3.iterator();
                                                while (true) {
                                                    method12 = null;
                                                    if (!it.hasNext()) {
                                                        obj = null;
                                                        break;
                                                    }
                                                    Object next = it.next();
                                                    if (next != null && LocationHooker.Companion.hasTypeByName(next.getClass(), "android.location.ILocationCallback")) {
                                                        obj = next;
                                                        break;
                                                    }
                                                }
                                                if (obj != null) {
                                                    IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
                                                    if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                                        iBinderAsBinder = obj instanceof IBinder ? (IBinder) obj : null;
                                                    }
                                                    if (strExtractPackageName == null) {
                                                        strExtractPackageName = "caller";
                                                    }
                                                    final String str24 = strExtractPackageName;
                                                    if (iBinderAsBinder != null) {
                                                        SystemLocationServiceHookerKt.activeCallbackBinders.put(iBinderAsBinder, new CallbackRegistrationInfo(obj, str24, 0L, 4, null));
                                                        try {
                                                            ModuleBinderDeaths.INSTANCE.watch(iBinderAsBinder, new au0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$5$1
                                                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                                public final void m9invoke() {
                                                                    SystemLocationServiceHookerKt.activeCallbackBinders.remove(iBinderAsBinder);
                                                                    SystemLocationServiceHookerKt.logLoc("[SysLoc] Callback binder died: " + str24);
                                                                }

                                                                @Override // defpackage.au0
                                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                                    m9invoke();
                                                                    return mf3.a;
                                                                }
                                                            });
                                                        } catch (Throwable unused4) {
                                                        }
                                                    }
                                                    SystemLocationServiceHookerKt.spoofedListenerInstances.add(obj);
                                                    SystemLocationServiceHookerKt.ensureCallbackHooked(locationHooker2, obj, "onLocation");
                                                    SystemLocationServiceHookerKt.logLoc("[SysLoc] Registered getCurrentLocation callback for " + str24 + " (active callbacks: " + SystemLocationServiceHookerKt.activeCallbackBinders.size() + ")");
                                                    SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84");
                                                    if (currentSpoofedMotion != null) {
                                                        SystemHookUtils systemHookUtils2 = SystemHookUtils.INSTANCE;
                                                        List<? extends Object> args4 = chain.getArgs();
                                                        args4.getClass();
                                                        String strExtractProvider = systemHookUtils2.extractProvider(args4);
                                                        Object objBuildFakeLocation = systemHookUtils2.buildFakeLocation(classLoader3, strExtractProvider, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                        if (objBuildFakeLocation != null) {
                                                            Method[] methods = obj.getClass().getMethods();
                                                            methods.getClass();
                                                            for (Method method13 : methods) {
                                                                if (o51.f(method13.getName(), "onLocation") && method13.getParameterTypes().length == 1) {
                                                                    method12 = method13;
                                                                    break;
                                                                }
                                                            }
                                                            if (method12 != null) {
                                                                try {
                                                                    method12.invoke(obj, objBuildFakeLocation);
                                                                    SystemLocationServiceHookerKt.logLoc("[SysLoc] Proactively dispatched fake location to getCurrentLocation callback for " + str24 + " (lat=" + currentSpoofedMotion.getLat() + ", lng=" + currentSpoofedMotion.getLng() + ", provider=" + strExtractProvider + ")");
                                                                    return SystemLocationServiceHookerKt.createDummyCancellationSignal();
                                                                } catch (Throwable th13) {
                                                                    SystemLocationServiceHookerKt.logLoc("[SysLoc] proactive callback invoke failed: " + th13);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th14) {
                                        SystemLocationServiceHookerKt.logLoc("[SysLoc] getCurrentLocation pre-hook failed: " + th14);
                                    }
                                    List args5 = chain.getArgs();
                                    args5.getClass();
                                    return chain.proceed(args5.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept4.getClass();
                            arrayList5.add(hookHandleIntercept4);
                            i20++;
                        } catch (Throwable th13) {
                            HookStatus.INSTANCE.error(clsLocate$default.getName() + "#getCurrentLocation", th13);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), "getCurrentLocation", i20);
                logLoc("[SysLoc] LocationManagerService.getCurrentLocation hooked");
            } catch (Throwable th14) {
                logLoc("[SysLoc] hook getCurrentLocation failed: " + th14);
            }
        }
        String[] strArr12 = {"isProviderEnabled", "isProviderEnabledForUser"};
        int i21 = 0;
        while (i21 < 2) {
            String str24 = strArr12[i21];
            try {
                XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                ArrayList arrayList6 = new ArrayList();
                d0 d0VarY12 = zm3.y(clsLocate$default.getDeclaredMethods());
                int i22 = 0;
                while (d0VarY12.hasNext()) {
                    final Method method12 = (Method) d0VarY12.next();
                    strArr12 = strArr12;
                    try {
                        if (!o51.f(method12.getName(), str24) || Modifier.isAbstract(method12.getModifiers())) {
                            i14 = i21;
                            i21 = i14;
                            xposedHelpers7 = xposedHelpers7;
                        } else {
                            try {
                                i14 = i21;
                                try {
                                    XposedInterface.HookHandle hookHandleIntercept5 = xposedHelpers7.getModule().hook(method12).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$5
                                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                        /* JADX WARN: Code duplicated, block: B:25:0x0066  */
                                        /* JADX WARN: Code duplicated, block: B:27:0x0086  */
                                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                        public Object intercept(XposedInterface.Chain chain) {
                                            String strExtractPackageName;
                                            List<? extends Object> args;
                                            chain.getClass();
                                            method12.getClass();
                                            JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                            if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && (!locationHooker2.getSystemCapabilities$xposed_globalRelease().getLocationAvailability() || config$xposed_globalRelease.optBoolean("force_location_enabled", false))) {
                                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                                List<? extends Object> args2 = chain.getArgs();
                                                args2.getClass();
                                                String strExtractProvider = systemHookUtils.extractProvider(args2);
                                                switch (strExtractProvider.hashCode()) {
                                                    case -792039641:
                                                        if (strExtractProvider.equals("passive")) {
                                                            List<? extends Object> args3 = chain.getArgs();
                                                            args3.getClass();
                                                            strExtractPackageName = systemHookUtils.extractPackageName(args3);
                                                            args = chain.getArgs();
                                                            args.getClass();
                                                            if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args))) {
                                                                return Boolean.TRUE;
                                                            }
                                                        }
                                                        break;
                                                    case 102570:
                                                        if (strExtractProvider.equals("gps")) {
                                                            List<? extends Object> args4 = chain.getArgs();
                                                            args4.getClass();
                                                            strExtractPackageName = systemHookUtils.extractPackageName(args4);
                                                            args = chain.getArgs();
                                                            args.getClass();
                                                            if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args))) {
                                                                return Boolean.TRUE;
                                                            }
                                                        }
                                                        break;
                                                    case 97798435:
                                                        if (strExtractProvider.equals("fused")) {
                                                            List<? extends Object> args5 = chain.getArgs();
                                                            args5.getClass();
                                                            strExtractPackageName = systemHookUtils.extractPackageName(args5);
                                                            args = chain.getArgs();
                                                            args.getClass();
                                                            if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args))) {
                                                                return Boolean.TRUE;
                                                            }
                                                        }
                                                        break;
                                                    case 1843485230:
                                                        if (strExtractProvider.equals("network")) {
                                                            List<? extends Object> args6 = chain.getArgs();
                                                            args6.getClass();
                                                            strExtractPackageName = systemHookUtils.extractPackageName(args6);
                                                            args = chain.getArgs();
                                                            args.getClass();
                                                            if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args))) {
                                                                return Boolean.TRUE;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            List args7 = chain.getArgs();
                                            args7.getClass();
                                            return chain.proceed(args7.toArray(new Object[0]));
                                        }
                                    });
                                    hookHandleIntercept5.getClass();
                                    arrayList6.add(hookHandleIntercept5);
                                    i22++;
                                    i21 = i14;
                                } catch (Throwable th15) {
                                    th = th15;
                                    try {
                                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str24, th);
                                        i21 = i14;
                                        xposedHelpers7 = xposedHelpers7;
                                    } catch (Throwable unused4) {
                                    }
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                i14 = i21;
                            }
                        }
                    } catch (Throwable unused5) {
                        i14 = i21;
                    }
                }
                strArr12 = strArr12;
                i14 = i21;
                HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str24, i22);
            } catch (Throwable unused6) {
                strArr12 = strArr12;
            }
            i21 = i14 + 1;
            strArr12 = strArr12;
        }
        String[] strArr13 = {"registerGnssStatusCallback", "addGpsStatusListener"};
        int i23 = 0;
        while (true) {
            str6 = "[SysLoc] LocationManagerService.";
            str7 = "[SysLoc] hook ";
            if (i23 >= 2) {
                break;
            }
            final String str25 = strArr13[i23];
            try {
                XposedHelpers xposedHelpers8 = XposedHelpers.INSTANCE;
                ArrayList arrayList7 = new ArrayList();
                d0 d0VarY13 = zm3.y(clsLocate$default.getDeclaredMethods());
                strArr9 = strArr13;
                int i24 = 0;
                while (d0VarY13.hasNext()) {
                    try {
                        final Method method13 = (Method) d0VarY13.next();
                        i13 = i23;
                        try {
                            if (!o51.f(method13.getName(), str25) || Modifier.isAbstract(method13.getModifiers())) {
                                xposedHelpers2 = xposedHelpers8;
                            } else {
                                try {
                                    xposedHelpers2 = xposedHelpers8;
                                    try {
                                        XposedInterface.HookHandle hookHandleIntercept6 = xposedHelpers8.getModule().hook(method13).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$6
                                            public Object intercept(XposedInterface.Chain chain) {
                                                Object next;
                                                final IBinder iBinderAsBinder;
                                                chain.getClass();
                                                method13.getClass();
                                                int callingUid = Binder.getCallingUid();
                                                List args = chain.getArgs();
                                                args.getClass();
                                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                                if (!o51.f(objProceed, Boolean.FALSE)) {
                                                    try {
                                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                                            SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                                            List<? extends Object> args2 = chain.getArgs();
                                                            args2.getClass();
                                                            final String strExtractPackageName = systemHookUtils.extractPackageName(args2);
                                                            List<? extends Object> args3 = chain.getArgs();
                                                            args3.getClass();
                                                            if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args3))) {
                                                                List args4 = chain.getArgs();
                                                                args4.getClass();
                                                                Iterator it = args4.iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        next = null;
                                                                        break;
                                                                    }
                                                                    next = it.next();
                                                                    if (next != null) {
                                                                        if (!(next instanceof IInterface) && !(next instanceof IBinder)) {
                                                                            LocationHooker.Companion companion = LocationHooker.Companion;
                                                                            if (companion.hasTypeByName(next.getClass(), "android.location.IGnssStatusListener") || companion.hasTypeByName(next.getClass(), "android.location.IGnssStatusCallback") || companion.hasTypeByName(next.getClass(), "android.location.IGpsStatusListener") || l13.c0(next.getClass().getName(), "Gnss", false) || l13.c0(next.getClass().getName(), "Gps", false)) {
                                                                                break;
                                                                                break;
                                                                                break;
                                                                                break;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                if (next != null) {
                                                                    IInterface iInterface = next instanceof IInterface ? (IInterface) next : null;
                                                                    if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                                                        iBinderAsBinder = next instanceof IBinder ? (IBinder) next : null;
                                                                    }
                                                                    if (iBinderAsBinder != null) {
                                                                        if (strExtractPackageName == null) {
                                                                            strExtractPackageName = "unknown";
                                                                        }
                                                                        SystemLocationServiceHookerKt.activeGnssStatusBinders.put(iBinderAsBinder, new GnssStatusRegistrationInfo(next, strExtractPackageName, 0L, callingUid, null, 20, null));
                                                                        try {
                                                                            ModuleBinderDeaths.INSTANCE.watch(iBinderAsBinder, new au0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$8$1
                                                                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                                                public final void m10invoke() {
                                                                                    SystemLocationServiceHookerKt.activeGnssStatusBinders.remove(iBinderAsBinder);
                                                                                    SystemLocationServiceHookerKt.logLoc("[SysLoc] GNSS status listener died: " + strExtractPackageName);
                                                                                }

                                                                                @Override // defpackage.au0
                                                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                                                    m10invoke();
                                                                                    return mf3.a;
                                                                                }
                                                                            });
                                                                        } catch (Throwable unused7) {
                                                                        }
                                                                        Object orCreateSpoofedGnssStatus = GnssFastMockEngine.INSTANCE.getOrCreateSpoofedGnssStatus(classLoader3, config$xposed_globalRelease.optInt("satellite_count", 20), config$xposed_globalRelease.optBoolean("enable_jitter", true), null);
                                                                        SystemLocationServiceHookerKt.hookGnssStatusListenerCallback(locationHooker2, next);
                                                                        SystemLocationServiceHookerKt.dispatchGnssStatus(locationHooker2, next, orCreateSpoofedGnssStatus, classLoader3);
                                                                        SystemLocationServiceHookerKt.logLoc("[SysLoc] Registered & dispatched target GNSS status callback for " + strExtractPackageName + " (active: " + SystemLocationServiceHookerKt.activeGnssStatusBinders.size() + ")");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th17) {
                                                        SystemLocationServiceHookerKt.logLoc("[SysLoc] " + str25 + " pre-hook failed: " + th17);
                                                    }
                                                }
                                                return objProceed;
                                            }
                                        });
                                        hookHandleIntercept6.getClass();
                                        arrayList7.add(hookHandleIntercept6);
                                        i24++;
                                    } catch (Throwable th17) {
                                        th = th17;
                                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str25, th);
                                        classLoader3 = classLoader;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                    xposedHelpers2 = xposedHelpers8;
                                }
                                i23 = i13;
                                xposedHelpers8 = xposedHelpers2;
                            }
                            classLoader3 = classLoader;
                            i23 = i13;
                            xposedHelpers8 = xposedHelpers2;
                        } catch (Throwable th19) {
                            th = th19;
                            logLoc("[SysLoc] hook " + str25 + " failed: " + th);
                            i23 = i13 + 1;
                            classLoader3 = classLoader;
                            strArr13 = strArr9;
                        }
                    } catch (Throwable th20) {
                        th = th20;
                        i13 = i23;
                        logLoc("[SysLoc] hook " + str25 + " failed: " + th);
                        i23 = i13 + 1;
                        classLoader3 = classLoader;
                        strArr13 = strArr9;
                    }
                }
                i13 = i23;
                HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str25, i24);
                logLoc("[SysLoc] LocationManagerService." + str25 + " hooked");
            } catch (Throwable th21) {
                th = th21;
                strArr9 = strArr13;
            }
            i23 = i13 + 1;
            classLoader3 = classLoader;
            strArr13 = strArr9;
        }
        String[] strArr14 = {"unregisterGnssStatusCallback", "removeGpsStatusListener"};
        int i25 = 0;
        while (i25 < 2) {
            String str26 = strArr14[i25];
            try {
                XposedHelpers xposedHelpers9 = XposedHelpers.INSTANCE;
                ArrayList arrayList8 = new ArrayList();
                d0 d0VarY14 = zm3.y(clsLocate$default.getDeclaredMethods());
                strArr8 = strArr14;
                int i26 = 0;
                while (d0VarY14.hasNext()) {
                    try {
                        final Method method14 = (Method) d0VarY14.next();
                        i25 = i25;
                        try {
                            if (!o51.f(method14.getName(), str26) || Modifier.isAbstract(method14.getModifiers())) {
                                str15 = str6;
                                str16 = str20;
                                str6 = str15;
                                str20 = str16;
                            } else {
                                try {
                                    str15 = str6;
                                    try {
                                        XposedInterface.HookHandle hookHandleIntercept7 = xposedHelpers9.getModule().hook(method14).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$7
                                            public Object intercept(XposedInterface.Chain chain) {
                                                IBinder iBinder;
                                                Object next;
                                                IBinder iBinderAsBinder;
                                                chain.getClass();
                                                method14.getClass();
                                                List args = chain.getArgs();
                                                args.getClass();
                                                Iterator it = args.iterator();
                                                while (true) {
                                                    iBinder = null;
                                                    if (!it.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it.next();
                                                    if (next != null && ((next instanceof IInterface) || (next instanceof IBinder))) {
                                                        break;
                                                    }
                                                }
                                                if (next != null) {
                                                    IInterface iInterface = next instanceof IInterface ? (IInterface) next : null;
                                                    if (iInterface != null && (iBinderAsBinder = iInterface.asBinder()) != null) {
                                                        iBinder = iBinderAsBinder;
                                                    } else if (next instanceof IBinder) {
                                                        iBinder = (IBinder) next;
                                                    }
                                                    if (iBinder != null) {
                                                        SystemLocationServiceHookerKt.activeGnssStatusBinders.remove(iBinder);
                                                    }
                                                }
                                                List args2 = chain.getArgs();
                                                args2.getClass();
                                                return chain.proceed(args2.toArray(new Object[0]));
                                            }
                                        });
                                        hookHandleIntercept7.getClass();
                                        arrayList8.add(hookHandleIntercept7);
                                        i26++;
                                        str6 = str15;
                                    } catch (Throwable th22) {
                                        th = th22;
                                        try {
                                            str16 = str20;
                                            try {
                                                HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str26, th);
                                                str6 = str15;
                                                str20 = str16;
                                            } catch (Throwable unused7) {
                                            }
                                        } catch (Throwable unused8) {
                                            str16 = str20;
                                        }
                                    }
                                } catch (Throwable th23) {
                                    th = th23;
                                    str15 = str6;
                                }
                            }
                        } catch (Throwable unused9) {
                            str15 = str6;
                            str16 = str20;
                            i25++;
                            strArr14 = strArr8;
                            str6 = str15;
                            str20 = str16;
                        }
                    } catch (Throwable unused10) {
                        i25 = i25;
                        str15 = str6;
                        str16 = str20;
                        i25++;
                        strArr14 = strArr8;
                        str6 = str15;
                        str20 = str16;
                    }
                }
                i25 = i25;
                str15 = str6;
                str16 = str20;
                HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str26, i26);
            } catch (Throwable unused11) {
                strArr8 = strArr14;
            }
            i25++;
            strArr14 = strArr8;
            str6 = str15;
            str20 = str16;
        }
        String str27 = str6;
        String str28 = str20;
        String[] strArr15 = {"registerGnssNmeaCallback", "addGnssBatchingCallback", "addNmeaListener"};
        int i27 = 0;
        while (i27 < 3) {
            String str29 = strArr15[i27];
            try {
                XposedHelpers xposedHelpers10 = XposedHelpers.INSTANCE;
                ArrayList arrayList9 = new ArrayList();
                d0 d0VarY15 = zm3.y(clsLocate$default.getDeclaredMethods());
                int i28 = 0;
                while (d0VarY15.hasNext()) {
                    final Method method15 = (Method) d0VarY15.next();
                    if (!o51.f(method15.getName(), str29) || Modifier.isAbstract(method15.getModifiers())) {
                        strArr7 = strArr15;
                        i12 = i27;
                    } else {
                        try {
                            strArr7 = strArr15;
                            try {
                                XposedInterface.HookHandle hookHandleIntercept8 = xposedHelpers10.getModule().hook(method15).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$8
                                    public Object intercept(XposedInterface.Chain chain) {
                                        Object next;
                                        final IBinder iBinderAsBinder;
                                        chain.getClass();
                                        method15.getClass();
                                        int callingUid = Binder.getCallingUid();
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                        if (!o51.f(objProceed, Boolean.FALSE)) {
                                            try {
                                                JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                                    SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                                    List<? extends Object> args2 = chain.getArgs();
                                                    args2.getClass();
                                                    final String strExtractPackageName = systemHookUtils.extractPackageName(args2);
                                                    List<? extends Object> args3 = chain.getArgs();
                                                    args3.getClass();
                                                    if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args3))) {
                                                        List args4 = chain.getArgs();
                                                        args4.getClass();
                                                        Iterator it = args4.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                next = null;
                                                                break;
                                                            }
                                                            next = it.next();
                                                            if (next != null && ((next instanceof IInterface) || (next instanceof IBinder) || l13.c0(next.getClass().getName(), "Nmea", false))) {
                                                                break;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (next != null) {
                                                            IInterface iInterface = next instanceof IInterface ? (IInterface) next : null;
                                                            if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                                                iBinderAsBinder = next instanceof IBinder ? (IBinder) next : null;
                                                            }
                                                            if (iBinderAsBinder != null) {
                                                                if (strExtractPackageName == null) {
                                                                    strExtractPackageName = "unknown";
                                                                }
                                                                SystemLocationServiceHookerKt.activeGnssNmeaBinders.put(iBinderAsBinder, new GnssNmeaRegistrationInfo(next, strExtractPackageName, 0L, callingUid, 4, null));
                                                                try {
                                                                    ModuleBinderDeaths.INSTANCE.watch(iBinderAsBinder, new au0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$11$1
                                                                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                                        public final void m5invoke() {
                                                                            SystemLocationServiceHookerKt.activeGnssNmeaBinders.remove(iBinderAsBinder);
                                                                            SystemLocationServiceHookerKt.logLoc("[SysLoc] NMEA listener died: " + strExtractPackageName);
                                                                        }

                                                                        @Override // defpackage.au0
                                                                        public /* bridge */ /* synthetic */ Object invoke() {
                                                                            m5invoke();
                                                                            return mf3.a;
                                                                        }
                                                                    });
                                                                } catch (Throwable unused12) {
                                                                }
                                                                SystemLocationServiceHookerKt.hookGnssNmeaListenerCallback(locationHooker2, next);
                                                                SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84");
                                                                if (currentSpoofedMotion != null) {
                                                                    List listBuildMockNmeaSentences = SystemLocationServiceHookerKt.buildMockNmeaSentences(locationHooker2, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2), config$xposed_globalRelease);
                                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                                    Iterator it2 = listBuildMockNmeaSentences.iterator();
                                                                    while (it2.hasNext()) {
                                                                        SystemLocationServiceHookerKt.dispatchNmea(next, jCurrentTimeMillis, (String) it2.next());
                                                                    }
                                                                }
                                                                SystemLocationServiceHookerKt.logLoc("[SysLoc] Registered & dispatched NMEA callback for " + strExtractPackageName + " (active: " + SystemLocationServiceHookerKt.activeGnssNmeaBinders.size() + ")");
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable unused13) {
                                            }
                                        }
                                        return objProceed;
                                    }
                                });
                                hookHandleIntercept8.getClass();
                                arrayList9.add(hookHandleIntercept8);
                                i28++;
                                strArr15 = strArr7;
                            } catch (Throwable th24) {
                                th = th24;
                                try {
                                    i12 = i27;
                                    try {
                                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str29, th);
                                        strArr15 = strArr7;
                                        i27 = i12;
                                    } catch (Throwable unused12) {
                                    }
                                } catch (Throwable unused13) {
                                    i12 = i27;
                                }
                            }
                        } catch (Throwable th25) {
                            th = th25;
                            strArr7 = strArr15;
                        }
                    }
                    strArr15 = strArr7;
                    i27 = i12;
                }
                strArr7 = strArr15;
                i12 = i27;
                HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str29, i28);
            } catch (Throwable unused14) {
                strArr7 = strArr15;
            }
            i27 = i12 + 1;
            strArr15 = strArr7;
        }
        String[] strArr16 = {"unregisterGnssNmeaCallback", "removeNmeaListener"};
        int i29 = 0;
        while (i29 < 2) {
            String str30 = strArr16[i29];
            try {
                XposedHelpers xposedHelpers11 = XposedHelpers.INSTANCE;
                ArrayList arrayList10 = new ArrayList();
                d0 d0VarY16 = zm3.y(clsLocate$default.getDeclaredMethods());
                int i30 = 0;
                while (d0VarY16.hasNext()) {
                    final Method method16 = (Method) d0VarY16.next();
                    if (!o51.f(method16.getName(), str30) || Modifier.isAbstract(method16.getModifiers())) {
                        strArr6 = strArr16;
                        i11 = i29;
                        strArr16 = strArr6;
                        i29 = i11;
                    } else {
                        try {
                            strArr6 = strArr16;
                            try {
                                XposedInterface.HookHandle hookHandleIntercept9 = xposedHelpers11.getModule().hook(method16).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$9
                                    public Object intercept(XposedInterface.Chain chain) {
                                        IBinder iBinder;
                                        Object next;
                                        IBinder iBinderAsBinder;
                                        chain.getClass();
                                        method16.getClass();
                                        List args = chain.getArgs();
                                        args.getClass();
                                        Iterator it = args.iterator();
                                        while (true) {
                                            iBinder = null;
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                            if (next != null && ((next instanceof IInterface) || (next instanceof IBinder))) {
                                                break;
                                            }
                                        }
                                        if (next != null) {
                                            IInterface iInterface = next instanceof IInterface ? (IInterface) next : null;
                                            if (iInterface != null && (iBinderAsBinder = iInterface.asBinder()) != null) {
                                                iBinder = iBinderAsBinder;
                                            } else if (next instanceof IBinder) {
                                                iBinder = (IBinder) next;
                                            }
                                            if (iBinder != null) {
                                                SystemLocationServiceHookerKt.activeGnssNmeaBinders.remove(iBinder);
                                            }
                                        }
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        return chain.proceed(args2.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept9.getClass();
                                arrayList10.add(hookHandleIntercept9);
                                i30++;
                                strArr16 = strArr6;
                            } catch (Throwable th26) {
                                th = th26;
                                try {
                                    i11 = i29;
                                    try {
                                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str30, th);
                                        strArr16 = strArr6;
                                        i29 = i11;
                                    } catch (Throwable unused15) {
                                    }
                                } catch (Throwable unused16) {
                                    i11 = i29;
                                }
                            }
                        } catch (Throwable th27) {
                            th = th27;
                            strArr6 = strArr16;
                        }
                    }
                }
                strArr6 = strArr16;
                i11 = i29;
                HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str30, i30);
            } catch (Throwable unused17) {
                strArr6 = strArr16;
            }
            i29 = i11 + 1;
            strArr16 = strArr6;
        }
        try {
            XposedHelpers xposedHelpers12 = XposedHelpers.INSTANCE;
            ArrayList arrayList11 = new ArrayList();
            d0 d0VarY17 = zm3.y(clsLocate$default.getDeclaredMethods());
            int i31 = 0;
            while (d0VarY17.hasNext()) {
                final Method method17 = (Method) d0VarY17.next();
                if (o51.f(method17.getName(), "getGnssYearOfHardware") && !Modifier.isAbstract(method17.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept10 = xposedHelpers12.getModule().hook(method17).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$10
                            public Object intercept(XposedInterface.Chain chain) {
                                chain.getClass();
                                method17.getClass();
                                List args = chain.getArgs();
                                args.getClass();
                                Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                Integer num = objProceed instanceof Integer ? (Integer) objProceed : null;
                                if (num == null || num.intValue() < 2020) {
                                    return 2024;
                                }
                                return num;
                            }
                        });
                        hookHandleIntercept10.getClass();
                        arrayList11.add(hookHandleIntercept10);
                        i31++;
                    } catch (Throwable th28) {
                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#getGnssYearOfHardware", th28);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), "getGnssYearOfHardware", i31);
        } catch (Throwable unused18) {
        }
        String[] strArr17 = {"registerGnssMeasurementsCallback", "registerGnssNavigationMessageCallback"};
        int i32 = 0;
        while (i32 < 2) {
            String str31 = strArr17[i32];
            try {
                XposedHelpers xposedHelpers13 = XposedHelpers.INSTANCE;
                ArrayList arrayList12 = new ArrayList();
                d0 d0VarY18 = zm3.y(clsLocate$default.getDeclaredMethods());
                int i33 = 0;
                while (d0VarY18.hasNext()) {
                    final Method method18 = (Method) d0VarY18.next();
                    if (!o51.f(method18.getName(), str31) || Modifier.isAbstract(method18.getModifiers())) {
                        strArr5 = strArr17;
                        i10 = i32;
                    } else {
                        try {
                            strArr5 = strArr17;
                            try {
                                XposedInterface.HookHandle hookHandleIntercept11 = xposedHelpers13.getModule().hook(method18).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$11
                                    public Object intercept(XposedInterface.Chain chain) {
                                        Object next;
                                        chain.getClass();
                                        method18.getClass();
                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                            SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                            List<? extends Object> args = chain.getArgs();
                                            args.getClass();
                                            if (SystemHookUtils.isTargetCaller$default(systemHookUtils, chain.getThisObject(), systemHookUtils.extractPackageName(args), config$xposed_globalRelease, null, 8, null)) {
                                                List args2 = chain.getArgs();
                                                args2.getClass();
                                                Iterator it = args2.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it.next();
                                                    if (next != null && !(next instanceof String) && !(next instanceof Integer)) {
                                                        break;
                                                    }
                                                }
                                                if (next != null) {
                                                    SystemLocationServiceHookerKt.suppressCallbackMethods(next, "onGnssMeasurementsReceived", "onGnssNavigationMessageReceived");
                                                }
                                            }
                                        }
                                        List args3 = chain.getArgs();
                                        args3.getClass();
                                        return chain.proceed(args3.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept11.getClass();
                                arrayList12.add(hookHandleIntercept11);
                                i33++;
                                strArr17 = strArr5;
                            } catch (Throwable th29) {
                                th = th29;
                                try {
                                    i10 = i32;
                                    try {
                                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str31, th);
                                        strArr17 = strArr5;
                                        i32 = i10;
                                    } catch (Throwable unused19) {
                                    }
                                } catch (Throwable unused20) {
                                    i10 = i32;
                                }
                            }
                        } catch (Throwable th30) {
                            th = th30;
                            strArr5 = strArr17;
                        }
                    }
                    strArr17 = strArr5;
                    i32 = i10;
                }
                strArr5 = strArr17;
                i10 = i32;
                HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str31, i33);
            } catch (Throwable unused21) {
                strArr5 = strArr17;
            }
            i32 = i10 + 1;
            strArr17 = strArr5;
        }
        if (locationHooker2.getSystemCapabilities$xposed_globalRelease().getLocationDelivery()) {
            classLoader2 = classLoader;
            hooker = "#";
            cls = clsLocate$default;
            str8 = str28;
        } else {
            hooker = null;
            String str32 = " hooked";
            cls = clsLocate$default;
            String str33 = str;
            String str34 = str3;
            XposedInterface.Hooker hooker2 = "#";
            String str35 = str28;
            classLoader2 = classLoader;
            String str36 = "unregisterLocationListener";
            int i34 = 2;
            Class<?> clsLocate$default2 = SystemClassLocator.locate$default(SystemClassLocator.INSTANCE, SystemComponent.LOCATION_PROVIDER_MANAGER, classLoader2, null, null, null, false, null, null, 252, null);
            if (clsLocate$default2 == null || locationHooker2.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsLocate$default2, Boolean.TRUE) != null) {
                str7 = "[SysLoc] hook ";
                str8 = str35;
                str21 = str32;
                hooker = hooker2;
            } else {
                try {
                    String[] strArr18 = {str34, "getLastLocationUnsafe"};
                    int i35 = 0;
                    while (i35 < 2) {
                        final String str37 = strArr18[i35];
                        XposedHelpers xposedHelpers14 = XposedHelpers.INSTANCE;
                        ArrayList arrayList13 = new ArrayList();
                        d0 d0VarY19 = zm3.y(clsLocate$default2.getDeclaredMethods());
                        int i36 = 0;
                        while (d0VarY19.hasNext()) {
                            final Method method19 = (Method) d0VarY19.next();
                            if (!o51.f(method19.getName(), str37) || Modifier.isAbstract(method19.getModifiers())) {
                                hooker = hooker2;
                                hooker2 = hooker;
                            } else {
                                try {
                                    XposedInterface.HookBuilder hookBuilderHook = xposedHelpers14.getModule().hook(method19);
                                    hooker = new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$12
                                        public Object intercept(XposedInterface.Chain chain) {
                                            SpoofedMotion currentSpoofedMotion;
                                            chain.getClass();
                                            method19.getClass();
                                            JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                            if (config$xposed_globalRelease == null) {
                                                List args = chain.getArgs();
                                                args.getClass();
                                                return chain.proceed(args.toArray(new Object[0]));
                                            }
                                            SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                            List<? extends Object> args2 = chain.getArgs();
                                            args2.getClass();
                                            String strExtractPackageName = systemHookUtils.extractPackageName(args2);
                                            List<? extends Object> args3 = chain.getArgs();
                                            args3.getClass();
                                            if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args3)) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84")) != null) {
                                                String strExtractProvider = null;
                                                try {
                                                    XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
                                                    Object thisObject = chain.getThisObject();
                                                    thisObject.getClass();
                                                    Object objectField = xposedHelpers15.getObjectField(thisObject, "mName");
                                                    if (objectField instanceof String) {
                                                        strExtractProvider = (String) objectField;
                                                    }
                                                } catch (Throwable unused22) {
                                                }
                                                if (strExtractProvider == null) {
                                                    SystemHookUtils systemHookUtils2 = SystemHookUtils.INSTANCE;
                                                    List<? extends Object> args4 = chain.getArgs();
                                                    args4.getClass();
                                                    strExtractProvider = systemHookUtils2.extractProvider(args4);
                                                }
                                                String str38 = strExtractProvider;
                                                Object objBuildFakeLocation = SystemHookUtils.INSTANCE.buildFakeLocation(classLoader2, str38, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                if (objBuildFakeLocation != null) {
                                                    String str39 = str37;
                                                    double lat = currentSpoofedMotion.getLat();
                                                    double lng = currentSpoofedMotion.getLng();
                                                    StringBuilder sbT = p91.t("[SysLoc] LocationProviderManager.", str39, " intercepted for ", strExtractPackageName, " (lat=");
                                                    sbT.append(lat);
                                                    az2.x(sbT, ", lng=", lng, ", provider=");
                                                    sbT.append(str38);
                                                    sbT.append(")");
                                                    SystemLocationServiceHookerKt.logLoc(sbT.toString());
                                                    return objBuildFakeLocation;
                                                }
                                            }
                                            List args5 = chain.getArgs();
                                            args5.getClass();
                                            return chain.proceed(args5.toArray(new Object[0]));
                                        }
                                    };
                                    XposedInterface.HookHandle hookHandleIntercept12 = hookBuilderHook.intercept(hooker);
                                    hookHandleIntercept12.getClass();
                                    arrayList13.add(hookHandleIntercept12);
                                    i36++;
                                } catch (Throwable th31) {
                                    HookStatus hookStatus = HookStatus.INSTANCE;
                                    String name = clsLocate$default2.getName();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(name);
                                    hooker = hooker2;
                                    try {
                                        sb.append((String) hooker);
                                        sb.append(str37);
                                        hookStatus.error(sb.toString(), th31);
                                        hooker2 = hooker;
                                    } catch (Throwable th32) {
                                        th = th32;
                                        logLoc("[SysLoc] hook LocationProviderManager.getLastLocation failed: " + th);
                                        XposedHelpers xposedHelpers15 = XposedHelpers.INSTANCE;
                                        ArrayList arrayList14 = new ArrayList();
                                        d0VarY7 = zm3.y(clsLocate$default2.getDeclaredMethods());
                                        int i37 = 0;
                                        while (d0VarY7.hasNext()) {
                                            method7 = (Method) d0VarY7.next();
                                            if (!o51.f(method7.getName(), "getCurrentLocation")) {
                                            }
                                        }
                                        HookStatus.INSTANCE.methodHooked(clsLocate$default2.getName(), "getCurrentLocation", i37);
                                        logLoc("[SysLoc] LocationProviderManager.getCurrentLocation hooked");
                                        strArr3 = new String[]{"registerLocationRequest", str2, str33};
                                        i3 = 0;
                                        while (i3 < 3) {
                                            str12 = strArr3[i3];
                                            try {
                                                XposedHelpers xposedHelpers16 = XposedHelpers.INSTANCE;
                                                ArrayList arrayList15 = new ArrayList();
                                                d0VarY6 = zm3.y(clsLocate$default2.getDeclaredMethods());
                                                int i38 = 0;
                                                while (d0VarY6.hasNext()) {
                                                    method6 = (Method) d0VarY6.next();
                                                    if (!o51.f(method6.getName(), str12)) {
                                                    }
                                                }
                                                HookStatus.INSTANCE.methodHooked(clsLocate$default2.getName(), str12, i38);
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("[SysLoc] LocationProviderManager.");
                                                sb2.append(str12);
                                                str13 = str32;
                                                try {
                                                    sb2.append(str13);
                                                    logLoc(sb2.toString());
                                                    str14 = str35;
                                                } catch (Throwable th33) {
                                                    th = th33;
                                                    StringBuilder sb3 = new StringBuilder("[SysLoc] hook LocationProviderManager.");
                                                    sb3.append(str12);
                                                    str14 = str35;
                                                    sb3.append(str14);
                                                    sb3.append(th);
                                                    logLoc(sb3.toString());
                                                }
                                            } catch (Throwable th34) {
                                                th = th34;
                                                str13 = str32;
                                                StringBuilder sb4 = new StringBuilder("[SysLoc] hook LocationProviderManager.");
                                                sb4.append(str12);
                                                str14 = str35;
                                                sb4.append(str14);
                                                sb4.append(th);
                                                logLoc(sb4.toString());
                                                i3++;
                                                str35 = str14;
                                                str32 = str13;
                                            }
                                            i3++;
                                            str35 = str14;
                                            str32 = str13;
                                        }
                                        str8 = str35;
                                        str21 = str32;
                                        strArr4 = new String[]{"unregisterLocationRequest", str36};
                                        i4 = 0;
                                        r2 = clsLocate$default2;
                                        r17 = str36;
                                        while (i4 < i34) {
                                            str11 = strArr4[i4];
                                            try {
                                                XposedHelpers xposedHelpers17 = XposedHelpers.INSTANCE;
                                                ArrayList arrayList16 = new ArrayList();
                                                d0VarY5 = zm3.y(r2.getDeclaredMethods());
                                                int i39 = 0;
                                                r2 = r2;
                                                r19 = r17;
                                                while (d0VarY5.hasNext()) {
                                                    method5 = (Method) d0VarY5.next();
                                                    if (o51.f(method5.getName(), str11)) {
                                                        r19 = r2;
                                                        r2 = r19;
                                                    } else {
                                                        r19 = r2;
                                                        r2 = r19;
                                                    }
                                                    r2 = r2;
                                                    r19 = r19;
                                                }
                                                r19 = r2;
                                                HookStatus.INSTANCE.methodHooked(r19.getName(), str11, i39);
                                            } catch (Throwable unused22) {
                                                r19 = r2;
                                            }
                                            i4++;
                                            r2 = r19;
                                            i34 = 2;
                                            r17 = r19;
                                        }
                                        r18 = r2;
                                        XposedHelpers xposedHelpers18 = XposedHelpers.INSTANCE;
                                        ArrayList arrayList17 = new ArrayList();
                                        d0VarY4 = zm3.y(r18.getDeclaredMethods());
                                        int i40 = 0;
                                        while (d0VarY4.hasNext()) {
                                            method4 = (Method) d0VarY4.next();
                                            if (!o51.f(method4.getName(), "onReportLocation")) {
                                            }
                                        }
                                        HookStatus.INSTANCE.methodHooked(r18.getName(), "onReportLocation", i40);
                                        logLoc("[SysLoc] LocationProviderManager.onReportLocation hooked");
                                        XposedHelpers xposedHelpers19 = XposedHelpers.INSTANCE;
                                        arrayListV0 = yo.v0(new Class[]{xposedHelpers19.findClassIfExists("com.android.server.location.provider.LocationProviderManager$Registration", classLoader2), xposedHelpers19.findClassIfExists("com.android.server.location.provider.LocationProviderManager$LocationRegistration", classLoader2), xposedHelpers19.findClassIfExists("com.android.server.location.provider.LocationProviderManager$LocationListenerRegistration", classLoader2)});
                                        size = arrayListV0.size();
                                        i5 = 0;
                                        while (i5 < size) {
                                            i5++;
                                            cls4 = (Class) arrayListV0.get(i5);
                                            if (locationHooker2.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls4, Boolean.TRUE) == null) {
                                                try {
                                                    XposedHelpers xposedHelpers20 = XposedHelpers.INSTANCE;
                                                    ArrayList arrayList18 = new ArrayList();
                                                    d0VarY3 = zm3.y(cls4.getDeclaredMethods());
                                                    int i41 = 0;
                                                    while (d0VarY3.hasNext()) {
                                                        method3 = (Method) d0VarY3.next();
                                                        arrayListV0 = arrayListV0;
                                                        try {
                                                            if (o51.f(method3.getName(), "acceptLocationChange")) {
                                                            }
                                                            i9 = size;
                                                            cls5 = cls4;
                                                            size = i9;
                                                            cls4 = cls5;
                                                        } catch (Throwable th35) {
                                                            th = th35;
                                                            i9 = size;
                                                            cls5 = cls4;
                                                            logLoc("[SysLoc] hook " + cls5.getName() + ".acceptLocationChange failed: " + th);
                                                            arrayListV0 = arrayListV0;
                                                            size = i9;
                                                        }
                                                    }
                                                    arrayListV0 = arrayListV0;
                                                    i9 = size;
                                                    Class<?> cls6 = cls4;
                                                    HookStatus.INSTANCE.methodHooked(cls6.getName(), "acceptLocationChange", i41);
                                                    logLoc("[SysLoc] " + cls6.getName() + ".acceptLocationChange hooked");
                                                } catch (Throwable th36) {
                                                    th = th36;
                                                    arrayListV0 = arrayListV0;
                                                }
                                                arrayListV0 = arrayListV0;
                                                size = i9;
                                            }
                                        }
                                        str7 = "[SysLoc] hook ";
                                        XposedHelpers xposedHelpers21 = XposedHelpers.INSTANCE;
                                        arrayListV1 = yo.v0(new Class[]{xposedHelpers21.findClassIfExists("com.android.server.location.provider.LocationProviderManager$LocationListenerTransport", classLoader2), xposedHelpers21.findClassIfExists("com.android.server.location.provider.LocationProviderManager$LocationPendingIntentTransport", classLoader2), xposedHelpers21.findClassIfExists("com.android.server.location.provider.LocationProviderManager$GetCurrentLocationTransport", classLoader2)});
                                        size2 = arrayListV1.size();
                                        for (i6 = 0; i6 < size2; i6 = i8) {
                                            i7 = i6 + 1;
                                            cls2 = (Class) arrayListV1.get(i6);
                                            if (locationHooker2.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls2, Boolean.TRUE) == null) {
                                                try {
                                                    XposedHelpers xposedHelpers22 = XposedHelpers.INSTANCE;
                                                    ArrayList arrayList19 = new ArrayList();
                                                    d0VarY2 = zm3.y(cls2.getDeclaredMethods());
                                                    arrayList = arrayListV1;
                                                    int i42 = 0;
                                                    while (d0VarY2.hasNext()) {
                                                        try {
                                                            method2 = (Method) d0VarY2.next();
                                                            size2 = size2;
                                                            try {
                                                                if (o51.f(method2.getName(), "deliverOnLocationChanged")) {
                                                                }
                                                                cls3 = cls2;
                                                                i8 = i7;
                                                                i7 = i8;
                                                                cls2 = cls3;
                                                            } catch (Throwable th37) {
                                                                th = th37;
                                                                cls3 = cls2;
                                                                i8 = i7;
                                                                logLoc(str7 + cls3.getName() + ".deliverOnLocationChanged failed: " + th);
                                                                arrayListV1 = arrayList;
                                                                size2 = size2;
                                                            }
                                                        } catch (Throwable th38) {
                                                            th = th38;
                                                            size2 = size2;
                                                            cls3 = cls2;
                                                            i8 = i7;
                                                            logLoc(str7 + cls3.getName() + ".deliverOnLocationChanged failed: " + th);
                                                            arrayListV1 = arrayList;
                                                            size2 = size2;
                                                        }
                                                    }
                                                    size2 = size2;
                                                    Class<?> cls7 = cls2;
                                                    i8 = i7;
                                                    HookStatus.INSTANCE.methodHooked(cls7.getName(), "deliverOnLocationChanged", i42);
                                                    logLoc("[SysLoc] " + cls7.getName() + ".deliverOnLocationChanged hooked");
                                                } catch (Throwable th39) {
                                                    th = th39;
                                                    arrayList = arrayListV1;
                                                }
                                                arrayListV1 = arrayList;
                                                size2 = size2;
                                            } else {
                                                i8 = i7;
                                            }
                                        }
                                        strArr2 = new String[]{"reverseGeocode", "forwardGeocode", "getFromLocation"};
                                        i2 = 0;
                                        while (i2 < 3) {
                                            str9 = strArr2[i2];
                                            try {
                                                XposedHelpers xposedHelpers23 = XposedHelpers.INSTANCE;
                                                ArrayList arrayList20 = new ArrayList();
                                                d0VarY = zm3.y(cls.getDeclaredMethods());
                                                int i43 = 0;
                                                while (d0VarY.hasNext()) {
                                                    method = (Method) d0VarY.next();
                                                    if (!o51.f(method.getName(), str9)) {
                                                    }
                                                    locationHooker2 = locationHooker;
                                                }
                                                HookStatus.INSTANCE.methodHooked(cls.getName(), str9, i43);
                                                StringBuilder sb5 = new StringBuilder();
                                                str10 = str27;
                                                try {
                                                    sb5.append(str10);
                                                    sb5.append(str9);
                                                    sb5.append(str21);
                                                    logLoc(sb5.toString());
                                                } catch (Throwable th40) {
                                                    th = th40;
                                                    logLoc(str7 + str9 + str8 + th);
                                                }
                                            } catch (Throwable th41) {
                                                th = th41;
                                                str10 = str27;
                                                logLoc(str7 + str9 + str8 + th);
                                                i2++;
                                                str27 = str10;
                                                locationHooker2 = locationHooker;
                                            }
                                            i2++;
                                            str27 = str10;
                                            locationHooker2 = locationHooker;
                                        }
                                        if (locationHooker.getSystemCapabilities$xposed_globalRelease().getLocationDelivery()) {
                                        }
                                        hookPendingIntentDelivery(locationHooker, classLoader);
                                    }
                                }
                            }
                        }
                        hooker = hooker2;
                        HookStatus.INSTANCE.methodHooked(clsLocate$default2.getName(), str37, i36);
                        i35++;
                        hooker2 = hooker;
                    }
                    hooker = hooker2;
                    logLoc("[SysLoc] LocationProviderManager.getLastLocation hooked");
                } catch (Throwable th42) {
                    th = th42;
                    hooker = hooker2;
                }
                try {
                    XposedHelpers xposedHelpers110 = XposedHelpers.INSTANCE;
                    ArrayList arrayList110 = new ArrayList();
                    d0VarY7 = zm3.y(clsLocate$default2.getDeclaredMethods());
                    int i310 = 0;
                    while (d0VarY7.hasNext()) {
                        method7 = (Method) d0VarY7.next();
                        if (!o51.f(method7.getName(), "getCurrentLocation") && !Modifier.isAbstract(method7.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept13 = xposedHelpers110.getModule().hook(method7).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$13
                                    public Object intercept(XposedInterface.Chain chain) {
                                        Method method20;
                                        Object obj;
                                        final IBinder iBinderAsBinder;
                                        String strExtractProvider;
                                        chain.getClass();
                                        method7.getClass();
                                        try {
                                            JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                            if (config$xposed_globalRelease != null) {
                                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                                List<? extends Object> args = chain.getArgs();
                                                args.getClass();
                                                String strExtractPackageName = systemHookUtils.extractPackageName(args);
                                                List<? extends Object> args2 = chain.getArgs();
                                                args2.getClass();
                                                if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args2))) {
                                                    List args3 = chain.getArgs();
                                                    args3.getClass();
                                                    Iterator it = args3.iterator();
                                                    while (true) {
                                                        method20 = null;
                                                        if (!it.hasNext()) {
                                                            obj = null;
                                                            break;
                                                        }
                                                        Object next = it.next();
                                                        if (next != null && LocationHooker.Companion.hasTypeByName(next.getClass(), "android.location.ILocationCallback")) {
                                                            obj = next;
                                                            break;
                                                        }
                                                    }
                                                    if (obj != null) {
                                                        IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
                                                        if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                                            iBinderAsBinder = obj instanceof IBinder ? (IBinder) obj : null;
                                                        }
                                                        if (strExtractPackageName == null) {
                                                            strExtractPackageName = "caller";
                                                        }
                                                        String str38 = strExtractPackageName;
                                                        if (iBinderAsBinder != null) {
                                                            SystemLocationServiceHookerKt.activeCallbackBinders.put(iBinderAsBinder, new CallbackRegistrationInfo(obj, str38, 0L, 4, null));
                                                            try {
                                                                ModuleBinderDeaths.INSTANCE.watch(iBinderAsBinder, new au0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$20$1
                                                                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                                    public final void m7invoke() {
                                                                        SystemLocationServiceHookerKt.activeCallbackBinders.remove(iBinderAsBinder);
                                                                    }

                                                                    @Override // defpackage.au0
                                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                                        m7invoke();
                                                                        return mf3.a;
                                                                    }
                                                                });
                                                            } catch (Throwable unused23) {
                                                            }
                                                        }
                                                        SystemLocationServiceHookerKt.spoofedListenerInstances.add(obj);
                                                        SystemLocationServiceHookerKt.ensureCallbackHooked(locationHooker2, obj, "onLocation");
                                                        SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84");
                                                        if (currentSpoofedMotion != null) {
                                                            try {
                                                                XposedHelpers xposedHelpers24 = XposedHelpers.INSTANCE;
                                                                Object thisObject = chain.getThisObject();
                                                                thisObject.getClass();
                                                                Object objectField = xposedHelpers24.getObjectField(thisObject, "mName");
                                                                strExtractProvider = objectField instanceof String ? (String) objectField : null;
                                                            } catch (Throwable unused24) {
                                                            }
                                                            if (strExtractProvider == null) {
                                                                SystemHookUtils systemHookUtils2 = SystemHookUtils.INSTANCE;
                                                                List<? extends Object> args4 = chain.getArgs();
                                                                args4.getClass();
                                                                strExtractProvider = systemHookUtils2.extractProvider(args4);
                                                            }
                                                            String str39 = strExtractProvider;
                                                            Object objBuildFakeLocation = SystemHookUtils.INSTANCE.buildFakeLocation(classLoader2, str39, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                            if (objBuildFakeLocation != null) {
                                                                Method[] methods = obj.getClass().getMethods();
                                                                methods.getClass();
                                                                for (Method method21 : methods) {
                                                                    if (o51.f(method21.getName(), "onLocation") && method21.getParameterTypes().length == 1) {
                                                                        method20 = method21;
                                                                        break;
                                                                    }
                                                                }
                                                                if (method20 != null) {
                                                                    method20.invoke(obj, objBuildFakeLocation);
                                                                }
                                                                SystemLocationServiceHookerKt.logLoc("[SysLoc] LocationProviderManager.getCurrentLocation proactive dispatch for " + str38 + " (lat=" + currentSpoofedMotion.getLat() + ", lng=" + currentSpoofedMotion.getLng() + ", provider=" + str39 + ")");
                                                                return SystemLocationServiceHookerKt.createDummyCancellationSignal();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused25) {
                                        }
                                        List args5 = chain.getArgs();
                                        args5.getClass();
                                        return chain.proceed(args5.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept13.getClass();
                                arrayList110.add(hookHandleIntercept13);
                                i310++;
                            } catch (Throwable th43) {
                                HookStatus.INSTANCE.error(clsLocate$default2.getName() + ((String) hooker) + "getCurrentLocation", th43);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsLocate$default2.getName(), "getCurrentLocation", i310);
                    logLoc("[SysLoc] LocationProviderManager.getCurrentLocation hooked");
                } catch (Throwable th44) {
                    logLoc("[SysLoc] hook LocationProviderManager.getCurrentLocation failed: " + th44);
                }
                strArr3 = new String[]{"registerLocationRequest", str2, str33};
                i3 = 0;
                while (i3 < 3) {
                    str12 = strArr3[i3];
                    XposedHelpers xposedHelpers111 = XposedHelpers.INSTANCE;
                    ArrayList arrayList111 = new ArrayList();
                    d0VarY6 = zm3.y(clsLocate$default2.getDeclaredMethods());
                    int i311 = 0;
                    while (d0VarY6.hasNext()) {
                        method6 = (Method) d0VarY6.next();
                        if (!o51.f(method6.getName(), str12) && !Modifier.isAbstract(method6.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept14 = xposedHelpers111.getModule().hook(method6).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$14
                                    public Object intercept(XposedInterface.Chain chain) {
                                        Object objCallMethod;
                                        String strExtractProvider;
                                        String str38;
                                        Object next;
                                        final IBinder iBinderAsBinder;
                                        chain.getClass();
                                        method6.getClass();
                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease != null) {
                                            SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                            List<? extends Object> args = chain.getArgs();
                                            args.getClass();
                                            String strExtractPackageName = systemHookUtils.extractPackageName(args);
                                            List<? extends Object> args2 = chain.getArgs();
                                            args2.getClass();
                                            if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args2))) {
                                                List args3 = chain.getArgs();
                                                args3.getClass();
                                                Iterator it = args3.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        objCallMethod = null;
                                                        break;
                                                    }
                                                    objCallMethod = it.next();
                                                    if (objCallMethod != null && (LocationHooker.Companion.hasTypeByName(objCallMethod.getClass(), "android.location.ILocationListener") || l13.c0(objCallMethod.getClass().getSimpleName(), "Listener", false))) {
                                                        break;
                                                    }
                                                }
                                                if (objCallMethod == null) {
                                                    for (Object obj : chain.getArgs()) {
                                                        if (obj != null && l13.c0(obj.getClass().getSimpleName(), "Registration", false)) {
                                                            try {
                                                                objCallMethod = XposedHelpers.INSTANCE.getObjectField(obj, "mListener");
                                                                if (objCallMethod != null) {
                                                                    break;
                                                                }
                                                                objCallMethod = XposedHelpers.INSTANCE.callMethod(obj, "getListener", new Object[0]);
                                                                if (objCallMethod != null) {
                                                                    break;
                                                                }
                                                            } catch (Throwable unused23) {
                                                            }
                                                        }
                                                    }
                                                }
                                                Object obj2 = objCallMethod;
                                                try {
                                                    XposedHelpers xposedHelpers24 = XposedHelpers.INSTANCE;
                                                    Object thisObject = chain.getThisObject();
                                                    thisObject.getClass();
                                                    Object objectField = xposedHelpers24.getObjectField(thisObject, "mName");
                                                    strExtractProvider = objectField instanceof String ? (String) objectField : null;
                                                } catch (Throwable unused24) {
                                                }
                                                if (strExtractProvider == null) {
                                                    SystemHookUtils systemHookUtils2 = SystemHookUtils.INSTANCE;
                                                    List<? extends Object> args4 = chain.getArgs();
                                                    args4.getClass();
                                                    strExtractProvider = systemHookUtils2.extractProvider(args4);
                                                }
                                                String str39 = strExtractProvider;
                                                if (obj2 != null) {
                                                    IInterface iInterface = obj2 instanceof IInterface ? (IInterface) obj2 : null;
                                                    if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                                        iBinderAsBinder = obj2 instanceof IBinder ? (IBinder) obj2 : null;
                                                    }
                                                    if (iBinderAsBinder != null) {
                                                        SystemLocationServiceHookerKt.activeListenerBinders.put(iBinderAsBinder, new ListenerRegistrationInfo(obj2, strExtractPackageName == null ? "target" : strExtractPackageName, str39, 0L, 8, null));
                                                        try {
                                                            ModuleBinderDeaths.INSTANCE.watch(iBinderAsBinder, new au0() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$21$3
                                                                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                                                                public final void m8invoke() {
                                                                    SystemLocationServiceHookerKt.activeListenerBinders.remove(iBinderAsBinder);
                                                                }

                                                                @Override // defpackage.au0
                                                                public /* bridge */ /* synthetic */ Object invoke() {
                                                                    m8invoke();
                                                                    return mf3.a;
                                                                }
                                                            });
                                                        } catch (Throwable unused25) {
                                                        }
                                                    }
                                                    SystemLocationServiceHookerKt.spoofedListenerInstances.add(obj2);
                                                    SystemLocationServiceHookerKt.ensureCallbackHooked(locationHooker2, obj2, "onLocationChanged");
                                                    SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84");
                                                    if (currentSpoofedMotion != null) {
                                                        str38 = "[SysLoc] LocationProviderManager.";
                                                        Object objBuildFakeLocation = SystemHookUtils.INSTANCE.buildFakeLocation(classLoader2, str39, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                        if (objBuildFakeLocation != null) {
                                                            try {
                                                                SystemLocationServiceHookerKt.dispatchFakeLocationToListener(obj2, objBuildFakeLocation);
                                                                SystemLocationServiceHookerKt.logLoc(str38 + str12 + " proactive dispatch for " + strExtractPackageName + " (lat=" + currentSpoofedMotion.getLat() + ", lng=" + currentSpoofedMotion.getLng() + ", provider=" + str39 + ")");
                                                            } catch (Throwable th45) {
                                                                SystemLocationServiceHookerKt.logLoc("[SysLoc] proactive dispatch error: " + th45);
                                                            }
                                                        }
                                                    } else {
                                                        str38 = "[SysLoc] LocationProviderManager.";
                                                    }
                                                    String str40 = str12;
                                                    int size3 = SystemLocationServiceHookerKt.activeListenerBinders.size();
                                                    StringBuilder sbT = p91.t(str38, str40, " captured for ", strExtractPackageName, " (active listeners: ");
                                                    sbT.append(size3);
                                                    sbT.append(")");
                                                    SystemLocationServiceHookerKt.logLoc(sbT.toString());
                                                } else {
                                                    str38 = "[SysLoc] LocationProviderManager.";
                                                }
                                                List args5 = chain.getArgs();
                                                args5.getClass();
                                                Iterator it2 = args5.iterator();
                                                do {
                                                    if (!it2.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it2.next();
                                                } while (!(next instanceof PendingIntent));
                                                PendingIntent pendingIntent = next instanceof PendingIntent ? (PendingIntent) next : null;
                                                if (pendingIntent != null) {
                                                    if (strExtractPackageName == null && (strExtractPackageName = pendingIntent.getCreatorPackage()) == null) {
                                                        strExtractPackageName = "target";
                                                    }
                                                    SystemLocationServiceHookerKt.activePendingIntents.put(pendingIntent, strExtractPackageName);
                                                    SystemLocationServiceHookerKt.logLoc(str38 + str12 + " PendingIntent captured for " + strExtractPackageName);
                                                }
                                            }
                                        }
                                        List args6 = chain.getArgs();
                                        args6.getClass();
                                        return chain.proceed(args6.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept14.getClass();
                                arrayList111.add(hookHandleIntercept14);
                                i311++;
                            } catch (Throwable th45) {
                                HookStatus.INSTANCE.error(clsLocate$default2.getName() + ((String) hooker) + str12, th45);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(clsLocate$default2.getName(), str12, i311);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("[SysLoc] LocationProviderManager.");
                    sb6.append(str12);
                    str13 = str32;
                    sb6.append(str13);
                    logLoc(sb6.toString());
                    str14 = str35;
                    i3++;
                    str35 = str14;
                    str32 = str13;
                }
                str8 = str35;
                str21 = str32;
                strArr4 = new String[]{"unregisterLocationRequest", str36};
                i4 = 0;
                r2 = clsLocate$default2;
                r17 = str36;
                while (i4 < i34) {
                    str11 = strArr4[i4];
                    XposedHelpers xposedHelpers112 = XposedHelpers.INSTANCE;
                    ArrayList arrayList112 = new ArrayList();
                    d0VarY5 = zm3.y(r2.getDeclaredMethods());
                    int i312 = 0;
                    r2 = r2;
                    r19 = r17;
                    while (d0VarY5.hasNext()) {
                        method5 = (Method) d0VarY5.next();
                        if (o51.f(method5.getName(), str11) || Modifier.isAbstract(method5.getModifiers())) {
                            r19 = r2;
                        } else {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept15 = xposedHelpers112.getModule().hook(method5).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$15
                                    public Object intercept(XposedInterface.Chain chain) {
                                        IBinder iBinderAsBinder;
                                        chain.getClass();
                                        method5.getClass();
                                        try {
                                            for (Object obj : chain.getArgs()) {
                                                if (obj != null) {
                                                    IBinder iBinder = null;
                                                    IInterface iInterface = obj instanceof IInterface ? (IInterface) obj : null;
                                                    if (iInterface != null && (iBinderAsBinder = iInterface.asBinder()) != null) {
                                                        iBinder = iBinderAsBinder;
                                                    } else if (obj instanceof IBinder) {
                                                        iBinder = (IBinder) obj;
                                                    }
                                                    if (iBinder != null) {
                                                        SystemLocationServiceHookerKt.activeListenerBinders.remove(iBinder);
                                                    }
                                                    SystemLocationServiceHookerKt.spoofedListenerInstances.remove(obj);
                                                }
                                            }
                                        } catch (Throwable unused23) {
                                        }
                                        List args = chain.getArgs();
                                        args.getClass();
                                        return chain.proceed(args.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept15.getClass();
                                arrayList112.add(hookHandleIntercept15);
                                i312++;
                            } catch (Throwable th46) {
                                r19 = r2;
                                try {
                                    HookStatus.INSTANCE.error(r2.getName() + ((String) hooker) + str11, th46);
                                    r19 = r19;
                                    r2 = r19;
                                    r2 = r2;
                                    r19 = r19;
                                } catch (Throwable unused23) {
                                }
                            }
                            r2 = r2;
                            r19 = r19;
                        }
                        r2 = r19;
                        r2 = r2;
                        r19 = r19;
                    }
                    r19 = r2;
                    HookStatus.INSTANCE.methodHooked(r19.getName(), str11, i312);
                    i4++;
                    r2 = r19;
                    i34 = 2;
                    r17 = r19;
                }
                r18 = r2;
                try {
                    XposedHelpers xposedHelpers113 = XposedHelpers.INSTANCE;
                    ArrayList arrayList113 = new ArrayList();
                    d0VarY4 = zm3.y(r18.getDeclaredMethods());
                    int i44 = 0;
                    while (d0VarY4.hasNext()) {
                        method4 = (Method) d0VarY4.next();
                        if (!o51.f(method4.getName(), "onReportLocation") && !Modifier.isAbstract(method4.getModifiers())) {
                            try {
                                XposedInterface.HookHandle hookHandleIntercept16 = xposedHelpers113.getModule().hook(method4).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$16
                                    public Object intercept(XposedInterface.Chain chain) {
                                        SpoofedMotion currentSpoofedMotion;
                                        chain.getClass();
                                        method4.getClass();
                                        JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                        if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false) && config$xposed_globalRelease.optBoolean("system_hook_global_mode", false) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84")) != null) {
                                            List args = chain.getArgs();
                                            args.getClass();
                                            SystemLocationServiceHookerKt.rewriteLocationArgs(args, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                            SystemLocationServiceHookerKt.logLoc("[SysLoc] LocationProviderManager.onReportLocation rewrote location globally");
                                        }
                                        List args2 = chain.getArgs();
                                        args2.getClass();
                                        return chain.proceed(args2.toArray(new Object[0]));
                                    }
                                });
                                hookHandleIntercept16.getClass();
                                arrayList113.add(hookHandleIntercept16);
                                i44++;
                            } catch (Throwable th47) {
                                HookStatus.INSTANCE.error(r18.getName() + ((String) hooker) + "onReportLocation", th47);
                            }
                        }
                    }
                    HookStatus.INSTANCE.methodHooked(r18.getName(), "onReportLocation", i44);
                    logLoc("[SysLoc] LocationProviderManager.onReportLocation hooked");
                } catch (Throwable th48) {
                    logLoc("[SysLoc] hook LocationProviderManager.onReportLocation failed: " + th48);
                }
                XposedHelpers xposedHelpers114 = XposedHelpers.INSTANCE;
                arrayListV0 = yo.v0(new Class[]{xposedHelpers114.findClassIfExists("com.android.server.location.provider.LocationProviderManager$Registration", classLoader2), xposedHelpers114.findClassIfExists("com.android.server.location.provider.LocationProviderManager$LocationRegistration", classLoader2), xposedHelpers114.findClassIfExists("com.android.server.location.provider.LocationProviderManager$LocationListenerRegistration", classLoader2)});
                size = arrayListV0.size();
                i5 = 0;
                while (i5 < size) {
                    i5++;
                    cls4 = (Class) arrayListV0.get(i5);
                    if (locationHooker2.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls4, Boolean.TRUE) == null) {
                        XposedHelpers xposedHelpers24 = XposedHelpers.INSTANCE;
                        ArrayList arrayList114 = new ArrayList();
                        d0VarY3 = zm3.y(cls4.getDeclaredMethods());
                        int i45 = 0;
                        while (d0VarY3.hasNext()) {
                            method3 = (Method) d0VarY3.next();
                            arrayListV0 = arrayListV0;
                            if (o51.f(method3.getName(), "acceptLocationChange") || Modifier.isAbstract(method3.getModifiers())) {
                                i9 = size;
                                cls5 = cls4;
                                size = i9;
                                cls4 = cls5;
                            } else {
                                try {
                                    i9 = size;
                                    try {
                                        XposedInterface.HookHandle hookHandleIntercept17 = xposedHelpers24.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$17
                                            /* JADX WARN: Code duplicated, block: B:17:0x0050  */
                                            public Object intercept(XposedInterface.Chain chain) {
                                                Object objCallMethod;
                                                String str38;
                                                String str39;
                                                SpoofedMotion currentSpoofedMotion;
                                                chain.getClass();
                                                method3.getClass();
                                                JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                                    Integer numValueOf = null;
                                                    try {
                                                        try {
                                                            XposedHelpers xposedHelpers25 = XposedHelpers.INSTANCE;
                                                            Object thisObject = chain.getThisObject();
                                                            thisObject.getClass();
                                                            objCallMethod = xposedHelpers25.getObjectField(thisObject, "mIdentity");
                                                        } catch (Throwable unused24) {
                                                            XposedHelpers xposedHelpers26 = XposedHelpers.INSTANCE;
                                                            Object thisObject2 = chain.getThisObject();
                                                            thisObject2.getClass();
                                                            objCallMethod = xposedHelpers26.callMethod(thisObject2, "getIdentity", new Object[0]);
                                                        }
                                                    } catch (Throwable unused25) {
                                                        objCallMethod = null;
                                                    }
                                                    if (objCallMethod != null) {
                                                        try {
                                                            try {
                                                                Object objCallMethod2 = XposedHelpers.INSTANCE.callMethod(objCallMethod, "getPackageName", new Object[0]);
                                                                if (objCallMethod2 instanceof String) {
                                                                    str38 = (String) objCallMethod2;
                                                                } else {
                                                                    str38 = null;
                                                                }
                                                            } catch (Throwable unused26) {
                                                            }
                                                        } catch (Throwable unused27) {
                                                            Object objectField = XposedHelpers.INSTANCE.getObjectField(objCallMethod, "mPackageName");
                                                            if (objectField instanceof String) {
                                                                str38 = (String) objectField;
                                                            } else {
                                                                str38 = null;
                                                            }
                                                        }
                                                        str39 = str38;
                                                    } else {
                                                        str39 = null;
                                                    }
                                                    if (objCallMethod != null) {
                                                        try {
                                                            try {
                                                                Object objCallMethod3 = XposedHelpers.INSTANCE.callMethod(objCallMethod, "getUid", new Object[0]);
                                                                if (objCallMethod3 instanceof Integer) {
                                                                    numValueOf = (Integer) objCallMethod3;
                                                                }
                                                            } catch (Throwable unused28) {
                                                            }
                                                        } catch (Throwable unused29) {
                                                            numValueOf = Integer.valueOf(XposedHelpers.INSTANCE.getIntField(objCallMethod, "mUid"));
                                                        }
                                                    }
                                                    if (SystemHookUtils.INSTANCE.isTargetCaller(chain.getThisObject(), str39, config$xposed_globalRelease, numValueOf) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84")) != null) {
                                                        List args = chain.getArgs();
                                                        args.getClass();
                                                        SystemLocationServiceHookerKt.rewriteLocationArgs(args, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                        SystemLocationServiceHookerKt.logLoc("[SysLoc] Registration.acceptLocationChange rewrote location for " + str39 + " (lat=" + currentSpoofedMotion.getLat() + ", lng=" + currentSpoofedMotion.getLng() + ")");
                                                    }
                                                }
                                                List args2 = chain.getArgs();
                                                args2.getClass();
                                                return chain.proceed(args2.toArray(new Object[0]));
                                            }
                                        });
                                        hookHandleIntercept17.getClass();
                                        arrayList114.add(hookHandleIntercept17);
                                        i45++;
                                        size = i9;
                                    } catch (Throwable th49) {
                                        th = th49;
                                        try {
                                            cls5 = cls4;
                                            try {
                                                HookStatus.INSTANCE.error(cls4.getName() + ((String) hooker) + "acceptLocationChange", th);
                                                size = i9;
                                                cls4 = cls5;
                                            } catch (Throwable th50) {
                                                th = th50;
                                                logLoc("[SysLoc] hook " + cls5.getName() + ".acceptLocationChange failed: " + th);
                                                arrayListV0 = arrayListV0;
                                                size = i9;
                                            }
                                        } catch (Throwable th51) {
                                            th = th51;
                                            cls5 = cls4;
                                            logLoc("[SysLoc] hook " + cls5.getName() + ".acceptLocationChange failed: " + th);
                                            arrayListV0 = arrayListV0;
                                            size = i9;
                                        }
                                    }
                                } catch (Throwable th52) {
                                    th = th52;
                                    i9 = size;
                                }
                            }
                        }
                        arrayListV0 = arrayListV0;
                        i9 = size;
                        Class<?> cls8 = cls4;
                        HookStatus.INSTANCE.methodHooked(cls8.getName(), "acceptLocationChange", i45);
                        logLoc("[SysLoc] " + cls8.getName() + ".acceptLocationChange hooked");
                        arrayListV0 = arrayListV0;
                        size = i9;
                    }
                }
                str7 = "[SysLoc] hook ";
                XposedHelpers xposedHelpers25 = XposedHelpers.INSTANCE;
                arrayListV1 = yo.v0(new Class[]{xposedHelpers25.findClassIfExists("com.android.server.location.provider.LocationProviderManager$LocationListenerTransport", classLoader2), xposedHelpers25.findClassIfExists("com.android.server.location.provider.LocationProviderManager$LocationPendingIntentTransport", classLoader2), xposedHelpers25.findClassIfExists("com.android.server.location.provider.LocationProviderManager$GetCurrentLocationTransport", classLoader2)});
                size2 = arrayListV1.size();
                while (i6 < size2) {
                    i7 = i6 + 1;
                    cls2 = (Class) arrayListV1.get(i6);
                    if (locationHooker2.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls2, Boolean.TRUE) == null) {
                        XposedHelpers xposedHelpers26 = XposedHelpers.INSTANCE;
                        ArrayList arrayList115 = new ArrayList();
                        d0VarY2 = zm3.y(cls2.getDeclaredMethods());
                        arrayList = arrayListV1;
                        int i46 = 0;
                        while (d0VarY2.hasNext()) {
                            method2 = (Method) d0VarY2.next();
                            size2 = size2;
                            if (o51.f(method2.getName(), "deliverOnLocationChanged") || Modifier.isAbstract(method2.getModifiers())) {
                                cls3 = cls2;
                                i8 = i7;
                                i7 = i8;
                                cls2 = cls3;
                            } else {
                                try {
                                    i8 = i7;
                                    try {
                                        XposedInterface.HookHandle hookHandleIntercept18 = xposedHelpers26.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$18
                                            public Object intercept(XposedInterface.Chain chain) {
                                                SpoofedMotion currentSpoofedMotion;
                                                Object objectField;
                                                IBinder iBinderAsBinder;
                                                PendingIntent pendingIntent;
                                                Object objectField2;
                                                IBinder iBinderAsBinder2;
                                                chain.getClass();
                                                method2.getClass();
                                                JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                                    boolean zOptBoolean = config$xposed_globalRelease.optBoolean("system_hook_global_mode", false);
                                                    if (!zOptBoolean) {
                                                        IBinder iBinder = null;
                                                        try {
                                                            XposedHelpers xposedHelpers27 = XposedHelpers.INSTANCE;
                                                            Object thisObject = chain.getThisObject();
                                                            thisObject.getClass();
                                                            objectField = xposedHelpers27.getObjectField(thisObject, "mListener");
                                                        } catch (Throwable unused24) {
                                                            objectField = null;
                                                        }
                                                        IInterface iInterface = objectField instanceof IInterface ? (IInterface) objectField : null;
                                                        if (iInterface == null || (iBinderAsBinder = iInterface.asBinder()) == null) {
                                                            iBinderAsBinder = objectField instanceof IBinder ? (IBinder) objectField : null;
                                                        }
                                                        if ((iBinderAsBinder != null && SystemLocationServiceHookerKt.activeListenerBinders.containsKey(iBinderAsBinder)) || (objectField != null && SystemLocationServiceHookerKt.spoofedListenerInstances.contains(objectField))) {
                                                            zOptBoolean = true;
                                                        }
                                                        if (!zOptBoolean) {
                                                            try {
                                                                XposedHelpers xposedHelpers28 = XposedHelpers.INSTANCE;
                                                                Object thisObject2 = chain.getThisObject();
                                                                thisObject2.getClass();
                                                                Object objectField3 = xposedHelpers28.getObjectField(thisObject2, "mPendingIntent");
                                                                pendingIntent = objectField3 instanceof PendingIntent ? (PendingIntent) objectField3 : null;
                                                            } catch (Throwable unused25) {
                                                            }
                                                            if (pendingIntent != null && SystemLocationServiceHookerKt.activePendingIntents.containsKey(pendingIntent)) {
                                                                zOptBoolean = true;
                                                            }
                                                        }
                                                        if (!zOptBoolean) {
                                                            try {
                                                                XposedHelpers xposedHelpers29 = XposedHelpers.INSTANCE;
                                                                Object thisObject3 = chain.getThisObject();
                                                                thisObject3.getClass();
                                                                objectField2 = xposedHelpers29.getObjectField(thisObject3, "mCallback");
                                                            } catch (Throwable unused26) {
                                                                objectField2 = null;
                                                            }
                                                            IInterface iInterface2 = objectField2 instanceof IInterface ? (IInterface) objectField2 : null;
                                                            if (iInterface2 != null && (iBinderAsBinder2 = iInterface2.asBinder()) != null) {
                                                                iBinder = iBinderAsBinder2;
                                                            } else if (objectField2 instanceof IBinder) {
                                                                iBinder = (IBinder) objectField2;
                                                            }
                                                            if ((iBinder != null && SystemLocationServiceHookerKt.activeCallbackBinders.containsKey(iBinder)) || (objectField2 != null && SystemLocationServiceHookerKt.spoofedListenerInstances.contains(objectField2))) {
                                                                zOptBoolean = true;
                                                            }
                                                        }
                                                    }
                                                    if (zOptBoolean && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "WGS-84")) != null) {
                                                        List args = chain.getArgs();
                                                        args.getClass();
                                                        SystemLocationServiceHookerKt.rewriteLocationArgs(args, currentSpoofedMotion, RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null), CoordinateConverterKt.getJitteredAccuracy(locationHooker2));
                                                        SystemLocationServiceHookerKt.logLoc("[SysLoc] " + cls2.getSimpleName() + ".deliverOnLocationChanged rewrote location (lat=" + currentSpoofedMotion.getLat() + ", lng=" + currentSpoofedMotion.getLng() + ")");
                                                    }
                                                }
                                                List args2 = chain.getArgs();
                                                args2.getClass();
                                                return chain.proceed(args2.toArray(new Object[0]));
                                            }
                                        });
                                        hookHandleIntercept18.getClass();
                                        arrayList115.add(hookHandleIntercept18);
                                        i46++;
                                        i7 = i8;
                                    } catch (Throwable th53) {
                                        th = th53;
                                        try {
                                            cls3 = cls2;
                                            try {
                                                HookStatus.INSTANCE.error(cls2.getName() + ((String) hooker) + "deliverOnLocationChanged", th);
                                                i7 = i8;
                                                cls2 = cls3;
                                            } catch (Throwable th54) {
                                                th = th54;
                                                logLoc(str7 + cls3.getName() + ".deliverOnLocationChanged failed: " + th);
                                                arrayListV1 = arrayList;
                                                size2 = size2;
                                            }
                                        } catch (Throwable th55) {
                                            th = th55;
                                            cls3 = cls2;
                                        }
                                    }
                                } catch (Throwable th56) {
                                    th = th56;
                                    i8 = i7;
                                }
                            }
                        }
                        size2 = size2;
                        Class<?> cls9 = cls2;
                        i8 = i7;
                        HookStatus.INSTANCE.methodHooked(cls9.getName(), "deliverOnLocationChanged", i46);
                        logLoc("[SysLoc] " + cls9.getName() + ".deliverOnLocationChanged hooked");
                        arrayListV1 = arrayList;
                        size2 = size2;
                    } else {
                        i8 = i7;
                    }
                }
            }
        }
        strArr2 = new String[]{"reverseGeocode", "forwardGeocode", "getFromLocation"};
        i2 = 0;
        while (i2 < 3) {
            str9 = strArr2[i2];
            XposedHelpers xposedHelpers27 = XposedHelpers.INSTANCE;
            ArrayList arrayList21 = new ArrayList();
            d0VarY = zm3.y(cls.getDeclaredMethods());
            int i47 = 0;
            while (d0VarY.hasNext()) {
                method = (Method) d0VarY.next();
                if (!o51.f(method.getName(), str9) && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept19 = xposedHelpers27.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$hookSystemLocationService$$inlined$hookAllMethods$19
                            public Object intercept(XposedInterface.Chain chain) {
                                SpoofedMotion currentSpoofedMotion;
                                Object next;
                                List list;
                                Object next2;
                                Method method20;
                                chain.getClass();
                                method.getClass();
                                JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                                if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                    SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                    List<? extends Object> args = chain.getArgs();
                                    args.getClass();
                                    String strExtractPackageName = systemHookUtils.extractPackageName(args);
                                    List<? extends Object> args2 = chain.getArgs();
                                    args2.getClass();
                                    if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args2)) && (currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker2, "GCJ-02")) != null) {
                                        try {
                                            XposedHelpers xposedHelpers28 = XposedHelpers.INSTANCE;
                                            Class<?> clsFindClass = xposedHelpers28.findClass("android.location.Address", classLoader2);
                                            Object objNewInstance = xposedHelpers28.newInstance(clsFindClass, Locale.getDefault());
                                            xposedHelpers28.callMethod(objNewInstance, "setLatitude", Double.valueOf(currentSpoofedMotion.getLat()));
                                            xposedHelpers28.callMethod(objNewInstance, "setLongitude", Double.valueOf(currentSpoofedMotion.getLng()));
                                            String cachedProvince$xposed_globalRelease = locationHooker2.getCachedProvince$xposed_globalRelease();
                                            String str38 = "北京市";
                                            if (cachedProvince$xposed_globalRelease.length() == 0) {
                                                cachedProvince$xposed_globalRelease = "北京市";
                                            }
                                            String cachedCity$xposed_globalRelease = locationHooker2.getCachedCity$xposed_globalRelease();
                                            if (cachedCity$xposed_globalRelease.length() != 0) {
                                                str38 = cachedCity$xposed_globalRelease;
                                            }
                                            String cachedDistrict$xposed_globalRelease = locationHooker2.getCachedDistrict$xposed_globalRelease();
                                            if (cachedDistrict$xposed_globalRelease.length() == 0) {
                                                cachedDistrict$xposed_globalRelease = "东城区";
                                            }
                                            String cachedStreet$xposed_globalRelease = locationHooker2.getCachedStreet$xposed_globalRelease();
                                            if (cachedStreet$xposed_globalRelease.length() == 0) {
                                                cachedStreet$xposed_globalRelease = "南长街";
                                            }
                                            String cachedAddress$xposed_globalRelease = locationHooker2.getCachedAddress$xposed_globalRelease();
                                            if (cachedAddress$xposed_globalRelease.length() == 0) {
                                                cachedAddress$xposed_globalRelease = cachedProvince$xposed_globalRelease + str38 + cachedDistrict$xposed_globalRelease + cachedStreet$xposed_globalRelease;
                                            }
                                            xposedHelpers28.callMethod(objNewInstance, "setAdminArea", cachedProvince$xposed_globalRelease);
                                            xposedHelpers28.callMethod(objNewInstance, "setLocality", str38);
                                            xposedHelpers28.callMethod(objNewInstance, "setSubLocality", cachedDistrict$xposed_globalRelease);
                                            xposedHelpers28.callMethod(objNewInstance, "setThoroughfare", cachedStreet$xposed_globalRelease);
                                            xposedHelpers28.callMethod(objNewInstance, "setAddressLine", 0, cachedAddress$xposed_globalRelease);
                                            List args3 = chain.getArgs();
                                            args3.getClass();
                                            Iterator it = args3.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                                if (next != null && ((next instanceof IInterface) || (next instanceof IBinder) || l13.c0(next.getClass().getSimpleName(), "Listener", false) || l13.c0(next.getClass().getSimpleName(), "Callback", false))) {
                                                    break;
                                                }
                                            }
                                            if (next != null) {
                                                Method[] methods = next.getClass().getMethods();
                                                methods.getClass();
                                                int length = methods.length;
                                                int i48 = 0;
                                                while (true) {
                                                    if (i48 >= length) {
                                                        list = null;
                                                        method20 = null;
                                                        break;
                                                    }
                                                    method20 = methods[i48];
                                                    list = null;
                                                    if (o51.f(method20.getName(), "onResults") || o51.f(method20.getName(), "onGeocode") || o51.f(method20.getName(), "onLocation")) {
                                                        break;
                                                        break;
                                                        break;
                                                    }
                                                    i48++;
                                                }
                                                if (method20 != null) {
                                                    int length2 = method20.getParameterTypes().length;
                                                    Object[] objArr = new Object[length2];
                                                    for (int i49 = 0; i49 < length2; i49++) {
                                                        Class<?> cls10 = method20.getParameterTypes()[i49];
                                                        if (List.class.isAssignableFrom(cls10)) {
                                                            objArr[i49] = am1.F(objNewInstance);
                                                        } else if (o51.f(cls10, clsFindClass)) {
                                                            objArr[i49] = objNewInstance;
                                                        }
                                                    }
                                                    method20.invoke(next, Arrays.copyOf(objArr, length2));
                                                    String str39 = str9;
                                                    if (strExtractPackageName == null) {
                                                        strExtractPackageName = "caller";
                                                    }
                                                    SystemLocationServiceHookerKt.logLoc("[SysLoc] Intercepted " + str39 + " (callback) for " + strExtractPackageName + ", returned: " + cachedAddress$xposed_globalRelease);
                                                    return list;
                                                }
                                            } else {
                                                list = null;
                                            }
                                            List args4 = chain.getArgs();
                                            args4.getClass();
                                            Iterator it2 = args4.iterator();
                                            do {
                                                if (!it2.hasNext()) {
                                                    next2 = list;
                                                    break;
                                                }
                                                next2 = it2.next();
                                            } while (!(next2 instanceof List));
                                            List list2 = da0.B(next2) ? (List) next2 : list;
                                            if (list2 == null) {
                                                String str40 = str9;
                                                if (strExtractPackageName == null) {
                                                    strExtractPackageName = "caller";
                                                }
                                                SystemLocationServiceHookerKt.logLoc("[SysLoc] Intercepted " + str40 + " for " + strExtractPackageName + ", returned: " + cachedAddress$xposed_globalRelease);
                                                return am1.F(objNewInstance);
                                            }
                                            list2.clear();
                                            list2.add(objNewInstance);
                                            String str41 = str9;
                                            if (strExtractPackageName == null) {
                                                strExtractPackageName = "caller";
                                            }
                                            SystemLocationServiceHookerKt.logLoc("[SysLoc] Intercepted " + str41 + " (inout list) for " + strExtractPackageName + ", returned: " + cachedAddress$xposed_globalRelease);
                                            return list;
                                        } catch (Throwable th57) {
                                            SystemLocationServiceHookerKt.logLoc("[SysLoc] mock Geocoder Address failed: " + th57);
                                        }
                                    }
                                }
                                List args5 = chain.getArgs();
                                args5.getClass();
                                return chain.proceed(args5.toArray(new Object[0]));
                            }
                        });
                        hookHandleIntercept19.getClass();
                        arrayList21.add(hookHandleIntercept19);
                        i47++;
                    } catch (Throwable th57) {
                        HookStatus.INSTANCE.error(cls.getName() + ((String) hooker) + str9, th57);
                        locationHooker2 = locationHooker;
                    }
                }
                locationHooker2 = locationHooker;
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), str9, i47);
            StringBuilder sb7 = new StringBuilder();
            str10 = str27;
            sb7.append(str10);
            sb7.append(str9);
            sb7.append(str21);
            logLoc(sb7.toString());
            i2++;
            str27 = str10;
            locationHooker2 = locationHooker;
        }
        if (locationHooker.getSystemCapabilities$xposed_globalRelease().getLocationDelivery()) {
            hookPendingIntentDelivery(locationHooker, classLoader);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isGnssTarget(String str, int i, JSONObject jSONObject) {
        return i >= 10000 && SystemHookUtils.INSTANCE.isTargetCaller(null, str, jSONObject, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logLoc(String str) {
        XposedBridge.INSTANCE.log(str);
    }

    private static final int resolveGnssUid(String str) {
        Object wg2Var;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        try {
            Context systemContext = SystemHookUtils.INSTANCE.getSystemContext();
            wg2Var = Integer.valueOf((systemContext == null || (packageManager = systemContext.getPackageManager()) == null || (applicationInfo = packageManager.getApplicationInfo(str, 0)) == null) ? -1 : applicationInfo.uid);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = -1;
        }
        return ((Number) wg2Var).intValue();
    }

    public static final void restoreSystemLocationReloadState(LocationHooker locationHooker, Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int iResolveGnssUid;
        char c;
        int iResolveGnssUid2;
        locationHooker.getClass();
        Object[] objArr = obj instanceof Object[] ? (Object[]) obj : null;
        if (objArr == null) {
            return;
        }
        char c2 = 0;
        Iterator<T> it = restoreSystemLocationReloadState$rows(objArr, 0).iterator();
        while (true) {
            i = 4;
            i2 = 3;
            i3 = 2;
            int i5 = 1;
            if (!it.hasNext()) {
                break;
            }
            Object[] objArr2 = (Object[]) it.next();
            Object obj2 = objArr2[0];
            obj2.getClass();
            IBinder iBinder = (IBinder) obj2;
            if (iBinder.isBinderAlive()) {
                Object obj3 = objArr2[1];
                obj3.getClass();
                ConcurrentHashMap<IBinder, ListenerRegistrationInfo> concurrentHashMap = activeListenerBinders;
                Object obj4 = objArr2[2];
                obj4.getClass();
                Object obj5 = objArr2[3];
                obj5.getClass();
                Object obj6 = objArr2[4];
                obj6.getClass();
                concurrentHashMap.put(iBinder, new ListenerRegistrationInfo(obj3, (String) obj4, (String) obj5, ((Long) obj6).longValue()));
                spoofedListenerInstances.add(obj3);
                ensureCallbackHooked(locationHooker, obj3, "onLocationChanged");
                try {
                    ModuleBinderDeaths.INSTANCE.watch(iBinder, new k43(iBinder, i5));
                } catch (Throwable unused) {
                }
            }
        }
        for (Object[] objArr3 : restoreSystemLocationReloadState$rows(objArr, 1)) {
            Object obj7 = objArr3[c2];
            obj7.getClass();
            IBinder iBinder2 = (IBinder) obj7;
            if (iBinder2.isBinderAlive()) {
                ConcurrentHashMap<IBinder, GnssStatusRegistrationInfo> concurrentHashMap2 = activeGnssStatusBinders;
                Object obj8 = objArr3[1];
                obj8.getClass();
                Object obj9 = objArr3[2];
                obj9.getClass();
                String str = (String) obj9;
                Object obj10 = objArr3[3];
                obj10.getClass();
                long jLongValue = ((Long) obj10).longValue();
                Object objX0 = yo.x0(objArr3, 4);
                c = c2;
                Integer num = objX0 instanceof Integer ? (Integer) objX0 : null;
                if (num != null) {
                    iResolveGnssUid2 = num.intValue();
                } else {
                    Object obj11 = objArr3[2];
                    obj11.getClass();
                    iResolveGnssUid2 = resolveGnssUid((String) obj11);
                }
                int i6 = iResolveGnssUid2;
                GnssSessionState gnssSessionState = new GnssSessionState();
                Object objX1 = yo.x0(objArr3, 5);
                gnssSessionState.restore(objX1 instanceof long[] ? (long[]) objX1 : null);
                concurrentHashMap2.put(iBinder2, new GnssStatusRegistrationInfo(obj8, str, jLongValue, i6, gnssSessionState));
                Object obj12 = objArr3[1];
                obj12.getClass();
                hookGnssStatusListenerCallback(locationHooker, obj12);
                try {
                    ModuleBinderDeaths.INSTANCE.watch(iBinder2, new k43(iBinder2, i3));
                } catch (Throwable unused2) {
                }
            } else {
                c = c2;
            }
            c2 = c;
        }
        char c3 = c2;
        for (Object[] objArr4 : restoreSystemLocationReloadState$rows(objArr, 2)) {
            Object obj13 = objArr4[c3];
            obj13.getClass();
            IBinder iBinder3 = (IBinder) obj13;
            if (iBinder3.isBinderAlive()) {
                ConcurrentHashMap<IBinder, GnssNmeaRegistrationInfo> concurrentHashMap3 = activeGnssNmeaBinders;
                Object obj14 = objArr4[1];
                obj14.getClass();
                Object obj15 = objArr4[i3];
                obj15.getClass();
                String str2 = (String) obj15;
                Object obj16 = objArr4[3];
                obj16.getClass();
                long jLongValue2 = ((Long) obj16).longValue();
                Object objX2 = yo.x0(objArr4, 4);
                i4 = i3;
                Integer num2 = objX2 instanceof Integer ? (Integer) objX2 : null;
                if (num2 != null) {
                    iResolveGnssUid = num2.intValue();
                } else {
                    Object obj17 = objArr4[i4];
                    obj17.getClass();
                    iResolveGnssUid = resolveGnssUid((String) obj17);
                }
                concurrentHashMap3.put(iBinder3, new GnssNmeaRegistrationInfo(obj14, str2, jLongValue2, iResolveGnssUid));
                Object obj18 = objArr4[1];
                obj18.getClass();
                hookGnssNmeaListenerCallback(locationHooker, obj18);
                try {
                    ModuleBinderDeaths.INSTANCE.watch(iBinder3, new k43(iBinder3, i2));
                } catch (Throwable unused3) {
                }
            } else {
                i4 = i3;
            }
            i3 = i4;
        }
        int i7 = i3;
        for (Object[] objArr5 : restoreSystemLocationReloadState$rows(objArr, 3)) {
            Object obj19 = objArr5[c3];
            obj19.getClass();
            IBinder iBinder4 = (IBinder) obj19;
            if (iBinder4.isBinderAlive()) {
                Object obj20 = objArr5[1];
                obj20.getClass();
                ConcurrentHashMap<IBinder, CallbackRegistrationInfo> concurrentHashMap4 = activeCallbackBinders;
                Object obj21 = objArr5[i7];
                obj21.getClass();
                Object obj22 = objArr5[3];
                obj22.getClass();
                concurrentHashMap4.put(iBinder4, new CallbackRegistrationInfo(obj20, (String) obj21, ((Long) obj22).longValue()));
                spoofedListenerInstances.add(obj20);
                ensureCallbackHooked(locationHooker, obj20, "onLocation");
                try {
                    ModuleBinderDeaths.INSTANCE.watch(iBinder4, new k43(iBinder4, i));
                } catch (Throwable unused4) {
                }
            }
        }
        for (Object[] objArr6 : restoreSystemLocationReloadState$rows(objArr, 4)) {
            ConcurrentHashMap<PendingIntent, String> concurrentHashMap5 = activePendingIntents;
            Object obj23 = objArr6[c3];
            obj23.getClass();
            Object obj24 = objArr6[1];
            obj24.getClass();
            concurrentHashMap5.put((PendingIntent) obj23, (String) obj24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 restoreSystemLocationReloadState$lambda$11$lambda$10$lambda$9(IBinder iBinder) {
        activeGnssStatusBinders.remove(iBinder);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 restoreSystemLocationReloadState$lambda$14$lambda$13$lambda$12(IBinder iBinder) {
        activeGnssNmeaBinders.remove(iBinder);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 restoreSystemLocationReloadState$lambda$17$lambda$16$lambda$15(IBinder iBinder) {
        activeCallbackBinders.remove(iBinder);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 restoreSystemLocationReloadState$lambda$7$lambda$6$lambda$5(IBinder iBinder) {
        activeListenerBinders.remove(iBinder);
        return mf3.a;
    }

    private static final List<Object[]> restoreSystemLocationReloadState$rows(Object[] objArr, int i) {
        Object objX0 = yo.x0(objArr, i);
        List list = objX0 instanceof List ? (List) objX0 : null;
        if (list == null) {
            return uj0.e;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Object[]) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rewriteLocationArgs(List<? extends Object> list, SpoofedMotion spoofedMotion, double d, float f) {
        for (Object obj : list) {
            if (obj != null) {
                if (LocationHooker.Companion.hasTypeByName(obj.getClass(), "android.location.Location")) {
                    SystemHookUtils.INSTANCE.applyFakeLocationFields(obj, spoofedMotion, d, f);
                } else {
                    SpoofedMotion spoofedMotion2 = spoofedMotion;
                    double d2 = d;
                    float f2 = f;
                    if (p91.z(obj, "LocationResult", false)) {
                        try {
                            Object objCallMethod = XposedHelpers.INSTANCE.callMethod(obj, "asList", new Object[0]);
                            List list2 = objCallMethod instanceof List ? (List) objCallMethod : null;
                            if (list2 != null) {
                                for (Object obj2 : list2) {
                                    if (obj2 != null && LocationHooker.Companion.hasTypeByName(obj2.getClass(), "android.location.Location")) {
                                        SystemHookUtils.INSTANCE.applyFakeLocationFields(obj2, spoofedMotion2, d2, f2);
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (obj instanceof List) {
                        for (Object obj3 : (Iterable) obj) {
                            if (obj3 != null && LocationHooker.Companion.hasTypeByName(obj3.getClass(), "android.location.Location")) {
                                SystemHookUtils.INSTANCE.applyFakeLocationFields(obj3, spoofedMotion2, d2, f2);
                            }
                        }
                    }
                    spoofedMotion = spoofedMotion2;
                    d = d2;
                    f = f2;
                }
            }
        }
    }

    public static final Object[] saveSystemLocationReloadState() {
        ConcurrentHashMap<IBinder, ListenerRegistrationInfo> concurrentHashMap = activeListenerBinders;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<IBinder, ListenerRegistrationInfo> entry : concurrentHashMap.entrySet()) {
            IBinder key = entry.getKey();
            ListenerRegistrationInfo value = entry.getValue();
            arrayList.add(new Object[]{key, value.getListener(), value.getPackageName(), value.getProvider(), Long.valueOf(value.getRegisteredTime())});
        }
        ConcurrentHashMap<IBinder, GnssStatusRegistrationInfo> concurrentHashMap2 = activeGnssStatusBinders;
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<IBinder, GnssStatusRegistrationInfo> entry2 : concurrentHashMap2.entrySet()) {
            IBinder key2 = entry2.getKey();
            GnssStatusRegistrationInfo value2 = entry2.getValue();
            arrayList2.add(new Object[]{key2, value2.getListener(), value2.getPackageName(), Long.valueOf(value2.getRegisteredTime()), Integer.valueOf(value2.getUid()), value2.getLifecycle().save()});
        }
        ConcurrentHashMap<IBinder, GnssNmeaRegistrationInfo> concurrentHashMap3 = activeGnssNmeaBinders;
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<IBinder, GnssNmeaRegistrationInfo> entry3 : concurrentHashMap3.entrySet()) {
            IBinder key3 = entry3.getKey();
            GnssNmeaRegistrationInfo value3 = entry3.getValue();
            arrayList3.add(new Object[]{key3, value3.getListener(), value3.getPackageName(), Long.valueOf(value3.getRegisteredTime()), Integer.valueOf(value3.getUid())});
        }
        ConcurrentHashMap<IBinder, CallbackRegistrationInfo> concurrentHashMap4 = activeCallbackBinders;
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry<IBinder, CallbackRegistrationInfo> entry4 : concurrentHashMap4.entrySet()) {
            IBinder key4 = entry4.getKey();
            CallbackRegistrationInfo value4 = entry4.getValue();
            arrayList4.add(new Object[]{key4, value4.getCallback(), value4.getPackageName(), Long.valueOf(value4.getRegisteredTime())});
        }
        ConcurrentHashMap<PendingIntent, String> concurrentHashMap5 = activePendingIntents;
        ArrayList arrayList5 = new ArrayList();
        for (Map.Entry<PendingIntent, String> entry5 : concurrentHashMap5.entrySet()) {
            arrayList5.add(new Object[]{entry5.getKey(), entry5.getValue()});
        }
        return new Object[]{arrayList, arrayList2, arrayList3, arrayList4, arrayList5};
    }

    private static final void startSystemLocationHeartbeat(final LocationHooker locationHooker, final ClassLoader classLoader) {
        if (isHeartbeatTimerStarted) {
            return;
        }
        synchronized (activeListenerBinders) {
            if (isHeartbeatTimerStarted) {
                return;
            }
            isHeartbeatTimerStarted = true;
            locationHooker.ownReloadTimer$xposed_globalRelease(new Timer("LocationSpoofer-SysHeartbeat", true)).scheduleAtFixedRate(new TimerTask() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt.startSystemLocationHeartbeat.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    JSONObject config$xposed_globalRelease;
                    try {
                        SystemWifiServiceHookerKt.tryHookPendingSystemServices(locationHooker, classLoader);
                    } catch (Throwable unused) {
                    }
                    try {
                        if ((!SystemLocationServiceHookerKt.activeListenerBinders.isEmpty() || !SystemLocationServiceHookerKt.activeGnssStatusBinders.isEmpty() || !SystemLocationServiceHookerKt.activeGnssNmeaBinders.isEmpty()) && (config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease()) != null) {
                            if (!config$xposed_globalRelease.optBoolean("active", false)) {
                                Collection collectionValues = SystemLocationServiceHookerKt.activeGnssStatusBinders.values();
                                collectionValues.getClass();
                                Iterator it = collectionValues.iterator();
                                while (it.hasNext()) {
                                    ((GnssStatusRegistrationInfo) it.next()).getLifecycle().reset();
                                }
                                return;
                            }
                            SpoofedMotion currentSpoofedMotion = BaseLocationHookerKt.getCurrentSpoofedMotion(locationHooker, "WGS-84");
                            if (currentSpoofedMotion == null) {
                                return;
                            }
                            double dRealisticAltitude$default = RouteEngine.realisticAltitude$default(RouteEngine.INSTANCE, config$xposed_globalRelease, 0L, 2, null);
                            float jitteredAccuracy = CoordinateConverterKt.getJitteredAccuracy(locationHooker);
                            if (!SystemLocationServiceHookerKt.activeListenerBinders.isEmpty()) {
                                for (Map.Entry entry : SystemLocationServiceHookerKt.activeListenerBinders.entrySet()) {
                                    IBinder iBinder = (IBinder) entry.getKey();
                                    ListenerRegistrationInfo listenerRegistrationInfo = (ListenerRegistrationInfo) entry.getValue();
                                    if (iBinder.isBinderAlive()) {
                                        double d = dRealisticAltitude$default;
                                        float f = jitteredAccuracy;
                                        SpoofedMotion spoofedMotion = currentSpoofedMotion;
                                        Object objBuildFakeLocation = SystemHookUtils.INSTANCE.buildFakeLocation(classLoader, listenerRegistrationInfo.getProvider(), spoofedMotion, d, f);
                                        if (objBuildFakeLocation != null) {
                                            try {
                                                SystemLocationServiceHookerKt.dispatchFakeLocationToListener(listenerRegistrationInfo.getListener(), objBuildFakeLocation);
                                            } catch (Throwable unused2) {
                                                if (!iBinder.isBinderAlive()) {
                                                    SystemLocationServiceHookerKt.activeListenerBinders.remove(iBinder);
                                                }
                                            }
                                        }
                                        currentSpoofedMotion = spoofedMotion;
                                        dRealisticAltitude$default = d;
                                        jitteredAccuracy = f;
                                    } else {
                                        SystemLocationServiceHookerKt.activeListenerBinders.remove(iBinder);
                                    }
                                }
                            }
                            SpoofedMotion spoofedMotion2 = currentSpoofedMotion;
                            double d2 = dRealisticAltitude$default;
                            float f2 = jitteredAccuracy;
                            if (!SystemLocationServiceHookerKt.activeGnssStatusBinders.isEmpty()) {
                                Object orCreateSpoofedGnssStatus = GnssFastMockEngine.INSTANCE.getOrCreateSpoofedGnssStatus(classLoader, config$xposed_globalRelease.optInt("satellite_count", 20), config$xposed_globalRelease.optBoolean("enable_jitter", true), null);
                                for (Map.Entry entry2 : SystemLocationServiceHookerKt.activeGnssStatusBinders.entrySet()) {
                                    IBinder iBinder2 = (IBinder) entry2.getKey();
                                    GnssStatusRegistrationInfo gnssStatusRegistrationInfo = (GnssStatusRegistrationInfo) entry2.getValue();
                                    if (!iBinder2.isBinderAlive()) {
                                        SystemLocationServiceHookerKt.activeGnssStatusBinders.remove(iBinder2);
                                    } else if (SystemLocationServiceHookerKt.isGnssTarget(gnssStatusRegistrationInfo.getPackageName(), gnssStatusRegistrationInfo.getUid(), config$xposed_globalRelease)) {
                                        try {
                                            SystemLocationServiceHookerKt.dispatchGnssStatus(locationHooker, gnssStatusRegistrationInfo.getListener(), orCreateSpoofedGnssStatus, classLoader);
                                        } catch (Throwable unused3) {
                                            if (!iBinder2.isBinderAlive()) {
                                                SystemLocationServiceHookerKt.activeGnssStatusBinders.remove(iBinder2);
                                            }
                                        }
                                    } else {
                                        gnssStatusRegistrationInfo.getLifecycle().reset();
                                    }
                                }
                            }
                            if (SystemLocationServiceHookerKt.activeGnssNmeaBinders.isEmpty()) {
                                return;
                            }
                            List listBuildMockNmeaSentences = SystemLocationServiceHookerKt.buildMockNmeaSentences(locationHooker, spoofedMotion2, d2, f2, config$xposed_globalRelease);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            for (Map.Entry entry3 : SystemLocationServiceHookerKt.activeGnssNmeaBinders.entrySet()) {
                                IBinder iBinder3 = (IBinder) entry3.getKey();
                                GnssNmeaRegistrationInfo gnssNmeaRegistrationInfo = (GnssNmeaRegistrationInfo) entry3.getValue();
                                if (!iBinder3.isBinderAlive()) {
                                    SystemLocationServiceHookerKt.activeGnssNmeaBinders.remove(iBinder3);
                                } else if (SystemLocationServiceHookerKt.isGnssTarget(gnssNmeaRegistrationInfo.getPackageName(), gnssNmeaRegistrationInfo.getUid(), config$xposed_globalRelease)) {
                                    Object listener = gnssNmeaRegistrationInfo.getListener();
                                    try {
                                        Iterator it2 = listBuildMockNmeaSentences.iterator();
                                        while (it2.hasNext()) {
                                            SystemLocationServiceHookerKt.dispatchNmea(listener, jCurrentTimeMillis, (String) it2.next());
                                        }
                                    } catch (Throwable unused4) {
                                        if (!iBinder3.isBinderAlive()) {
                                            SystemLocationServiceHookerKt.activeGnssNmeaBinders.remove(iBinder3);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused5) {
                    }
                }
            }, 1000L, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void suppressCallbackMethods(Object obj, String... strArr) {
        Class<?> cls = obj.getClass();
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
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$suppressCallbackMethods$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method.getClass();
                                    return null;
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

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$createDummyCancellationSignal$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass1 extends Binder implements IInterface {
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            parcel.getClass();
            if (parcel2 == null) {
                return true;
            }
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt$createDummyRemoteCallback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class BinderC00931 extends Binder implements IInterface {
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            parcel.getClass();
            if (parcel2 == null) {
                return true;
            }
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
