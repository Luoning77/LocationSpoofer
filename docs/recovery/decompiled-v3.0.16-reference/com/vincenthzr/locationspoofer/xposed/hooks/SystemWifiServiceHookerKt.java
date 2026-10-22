package com.vincenthzr.locationspoofer.xposed.hooks;

import android.os.SystemClock;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemClassLocator;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.d0;
import defpackage.l13;
import defpackage.o51;
import defpackage.p91;
import defpackage.s13;
import defpackage.sw;
import defpackage.zm3;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemWifiServiceHookerKt {
    private static volatile boolean isConnectivityServiceHooked;
    private static volatile boolean isWifiServiceHooked;
    private static volatile boolean wifiRegistrationHooksInstalled;

    private static final Class<?> findConnectivityServiceClass(ClassLoader classLoader) {
        return SystemClassLocator.locate$default(SystemClassLocator.INSTANCE, SystemComponent.CONNECTIVITY_SERVICE, classLoader, null, am1.G("Connect", "Tether", "Net"), am1.F("connectivity"), true, null, null, 196, null);
    }

    private static final Class<?> findWifiServiceClass(ClassLoader classLoader) {
        return SystemClassLocator.locate$default(SystemClassLocator.INSTANCE, SystemComponent.WIFI_SERVICE, classLoader, null, am1.G("Wifi", "Scan", "wlan"), am1.G("wifi", "wifiscanner"), true, null, null, 196, null);
    }

    public static final void hookSystemConnectivityService(final LocationHooker locationHooker, final ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        if (isConnectivityServiceHooked) {
            return;
        }
        Class<?> clsFindConnectivityServiceClass = findConnectivityServiceClass(classLoader);
        if (clsFindConnectivityServiceClass != null) {
            ClassLoader classLoader2 = clsFindConnectivityServiceClass.getClassLoader();
            if (classLoader2 == null) {
                classLoader2 = classLoader;
            }
            installConnectivityHooks(locationHooker, clsFindConnectivityServiceClass, classLoader2);
            isConnectivityServiceHooked = true;
            logWifi("[SysWifi] Successfully hooked ConnectivityService on ".concat(clsFindConnectivityServiceClass.getName()));
        }
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.os.ServiceManager", classLoader);
            if (clsFindClassIfExists != null) {
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), "addService") && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt$hookSystemConnectivityService$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    Object obj;
                                    chain.getClass();
                                    method.getClass();
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
                                    String str = next instanceof String ? (String) next : null;
                                    if (o51.f(str, "connectivity") && chain.getArgs().size() > 1 && (obj = chain.getArgs().get(1)) != null && !p91.z(obj, "BinderProxy", false)) {
                                        HookStatus.INSTANCE.classFound(SystemComponent.CONNECTIVITY_SERVICE, obj.getClass(), "ServiceManager.addService");
                                        LocationHooker locationHooker2 = locationHooker;
                                        Class<?> cls = obj.getClass();
                                        ClassLoader classLoader3 = obj.getClass().getClassLoader();
                                        if (classLoader3 == null) {
                                            classLoader3 = classLoader;
                                        }
                                        SystemWifiServiceHookerKt.installConnectivityHooks(locationHooker2, cls, classLoader3);
                                        SystemWifiServiceHookerKt.setConnectivityServiceHooked(true);
                                        SystemWifiServiceHookerKt.logWifi("[SysWifi] Captured " + str + " from ServiceManager.addService: " + obj.getClass().getName());
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
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#addService", th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "addService", i);
            }
        } catch (Throwable th2) {
            logWifi("[SysWifi] Hook ServiceManager for connectivity failed: " + th2);
        }
    }

    public static final void hookSystemWifiService(final LocationHooker locationHooker, final ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        logWifi("[SysWifi] hookSystemWifiService invoked, searching for WifiServiceImpl...");
        Class<?> clsFindWifiServiceClass = findWifiServiceClass(classLoader);
        if (clsFindWifiServiceClass != null) {
            ClassLoader classLoader2 = clsFindWifiServiceClass.getClassLoader();
            if (classLoader2 == null) {
                classLoader2 = classLoader;
            }
            installWifiHooks(locationHooker, clsFindWifiServiceClass, classLoader2);
            isWifiServiceHooked = true;
            logWifi("[SysWifi] Successfully hooked WifiServiceImpl on ".concat(clsFindWifiServiceClass.getName()));
        }
        if (wifiRegistrationHooksInstalled) {
            return;
        }
        wifiRegistrationHooksInstalled = true;
        int i = 0;
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("com.android.server.SystemService", classLoader);
            if (clsFindClassIfExists != null) {
                ArrayList arrayList = new ArrayList();
                d0 d0VarY = zm3.y(clsFindClassIfExists.getDeclaredMethods());
                int i2 = 0;
                while (d0VarY.hasNext()) {
                    final Method method = (Method) d0VarY.next();
                    if (o51.f(method.getName(), "publishBinderService") && !Modifier.isAbstract(method.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt$hookSystemWifiService$$inlined$hookAllMethods$1
                                /* JADX WARN: Code duplicated, block: B:36:0x00af  */
                                /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
                                /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
                                /* JADX WARN: Code duplicated, block: B:42:0x00df  */
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    ClassLoader classLoader3;
                                    SystemComponent systemComponent;
                                    chain.getClass();
                                    method.getClass();
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
                                    String str = next instanceof String ? (String) next : null;
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    Object objP0 = zy.p0(args2, 1);
                                    if (objP0 != null && !p91.z(objP0, "BinderProxy", false) && str != null) {
                                        int iHashCode = str.hashCode();
                                        if (iHashCode != -1997204151) {
                                            if (iHashCode != 3649301) {
                                                if (iHashCode == 1923312055 && str.equals("connectivity")) {
                                                    Class<?> cls = objP0.getClass();
                                                    ClassLoader classLoader4 = cls.getClassLoader();
                                                    if (classLoader4 == null) {
                                                        classLoader4 = classLoader;
                                                    }
                                                    SystemWifiServiceHookerKt.logWifi("[SysWifi] Captured " + str + " from publishBinderService: " + cls.getName());
                                                    HookStatus.INSTANCE.classFound(SystemComponent.CONNECTIVITY_SERVICE, cls, "publishBinderService");
                                                    SystemWifiServiceHookerKt.installConnectivityHooks(locationHooker, cls, classLoader4);
                                                    SystemWifiServiceHookerKt.setConnectivityServiceHooked(true);
                                                }
                                            } else if (str.equals("wifi")) {
                                                Class<?> cls2 = objP0.getClass();
                                                classLoader3 = cls2.getClassLoader();
                                                if (classLoader3 == null) {
                                                    classLoader3 = classLoader;
                                                }
                                                SystemWifiServiceHookerKt.logWifi("[SysWifi] Captured " + str + " from publishBinderService: " + cls2.getName());
                                                HookStatus hookStatus = HookStatus.INSTANCE;
                                                if (str.equals("wifi")) {
                                                    systemComponent = SystemComponent.WIFI_SERVICE;
                                                } else {
                                                    systemComponent = SystemComponent.WIFI_SCANNER_SERVICE;
                                                }
                                                hookStatus.classFound(systemComponent, cls2, "publishBinderService");
                                                SystemWifiServiceHookerKt.installWifiHooks(locationHooker, cls2, classLoader3);
                                                SystemWifiServiceHookerKt.setWifiServiceHooked(true);
                                            }
                                        } else if (str.equals("wifiscanner")) {
                                            Class<?> cls3 = objP0.getClass();
                                            classLoader3 = cls3.getClassLoader();
                                            if (classLoader3 == null) {
                                                classLoader3 = classLoader;
                                            }
                                            SystemWifiServiceHookerKt.logWifi("[SysWifi] Captured " + str + " from publishBinderService: " + cls3.getName());
                                            HookStatus hookStatus2 = HookStatus.INSTANCE;
                                            if (str.equals("wifi")) {
                                                systemComponent = SystemComponent.WIFI_SERVICE;
                                            } else {
                                                systemComponent = SystemComponent.WIFI_SCANNER_SERVICE;
                                            }
                                            hookStatus2.classFound(systemComponent, cls3, "publishBinderService");
                                            SystemWifiServiceHookerKt.installWifiHooks(locationHooker, cls3, classLoader3);
                                            SystemWifiServiceHookerKt.setWifiServiceHooked(true);
                                        }
                                    }
                                    List args3 = chain.getArgs();
                                    args3.getClass();
                                    return chain.proceed(args3.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept.getClass();
                            arrayList.add(hookHandleIntercept);
                            i2++;
                        } catch (Throwable th) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists.getName() + "#publishBinderService", th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists.getName(), "publishBinderService", i2);
                logWifi("[SysWifi] SystemService.publishBinderService hooked");
            }
        } catch (Throwable th2) {
            logWifi("[SysWifi] Hook publishBinderService failed: " + th2);
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists2 = xposedHelpers2.findClassIfExists("android.os.ServiceManager", classLoader);
            if (clsFindClassIfExists2 != null) {
                try {
                    Object objCallStaticMethod = xposedHelpers2.callStaticMethod(clsFindClassIfExists2, "getService", "wifi");
                    if (objCallStaticMethod != null && !l13.c0(objCallStaticMethod.getClass().getName(), "BinderProxy", false)) {
                        HookStatus.INSTANCE.classFound(SystemComponent.WIFI_SERVICE, objCallStaticMethod.getClass(), "ServiceManager.getService");
                        Class<?> cls = objCallStaticMethod.getClass();
                        ClassLoader classLoader3 = objCallStaticMethod.getClass().getClassLoader();
                        if (classLoader3 == null) {
                            classLoader3 = classLoader;
                        }
                        installWifiHooks(locationHooker, cls, classLoader3);
                        isWifiServiceHooked = true;
                        logWifi("[SysWifi] Hooked WifiServiceImpl directly from ServiceManager.getService(wifi): " + objCallStaticMethod.getClass().getName());
                        return;
                    }
                } catch (Throwable unused) {
                }
                XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                ArrayList arrayList2 = new ArrayList();
                d0 d0VarY2 = zm3.y(clsFindClassIfExists2.getDeclaredMethods());
                while (d0VarY2.hasNext()) {
                    final Method method2 = (Method) d0VarY2.next();
                    if (o51.f(method2.getName(), "addService") && !Modifier.isAbstract(method2.getModifiers())) {
                        try {
                            XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers3.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt$hookSystemWifiService$$inlined$hookAllMethods$2
                                public Object intercept(XposedInterface.Chain chain) {
                                    Object next;
                                    Object obj;
                                    chain.getClass();
                                    method2.getClass();
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
                                    String str = next instanceof String ? (String) next : null;
                                    if ((o51.f(str, "wifi") || o51.f(str, "wifiscanner")) && chain.getArgs().size() > 1 && (obj = chain.getArgs().get(1)) != null && !p91.z(obj, "BinderProxy", false)) {
                                        SystemWifiServiceHookerKt.logWifi("[SysWifi] Captured " + str + " from ServiceManager.addService: " + obj.getClass().getName());
                                        HookStatus.INSTANCE.classFound(o51.f(str, "wifi") ? SystemComponent.WIFI_SERVICE : SystemComponent.WIFI_SCANNER_SERVICE, obj.getClass(), "ServiceManager.addService");
                                        LocationHooker locationHooker2 = locationHooker;
                                        Class<?> cls2 = obj.getClass();
                                        ClassLoader classLoader4 = obj.getClass().getClassLoader();
                                        if (classLoader4 == null) {
                                            classLoader4 = classLoader;
                                        }
                                        SystemWifiServiceHookerKt.installWifiHooks(locationHooker2, cls2, classLoader4);
                                        SystemWifiServiceHookerKt.setWifiServiceHooked(true);
                                    }
                                    List args2 = chain.getArgs();
                                    args2.getClass();
                                    return chain.proceed(args2.toArray(new Object[0]));
                                }
                            });
                            hookHandleIntercept2.getClass();
                            arrayList2.add(hookHandleIntercept2);
                            i++;
                        } catch (Throwable th3) {
                            HookStatus.INSTANCE.error(clsFindClassIfExists2.getName() + "#addService", th3);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(clsFindClassIfExists2.getName(), "addService", i);
            }
        } catch (Throwable th4) {
            logWifi("[SysWifi] Hook ServiceManager.addService for wifi failed: " + th4);
        }
    }

    public static final void installConnectivityHooks(final LocationHooker locationHooker, Class<?> cls, final ClassLoader classLoader) {
        locationHooker.getClass();
        cls.getClass();
        classLoader.getClass();
        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) != null) {
            return;
        }
        isConnectivityServiceHooked = true;
        String[] strArr = {"getNetworkCapabilities", "getDefaultNetworkCapabilitiesForUser", "getRedactedNetworkCapabilitiesForPackage"};
        for (int i = 0; i < 3; i++) {
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
                            XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt$installConnectivityHooks$$inlined$hookAllMethods$1
                                public Object intercept(XposedInterface.Chain chain) {
                                    chain.getClass();
                                    method.getClass();
                                    List args = chain.getArgs();
                                    args.getClass();
                                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                                    if (objProceed == null) {
                                        return null;
                                    }
                                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false)) {
                                        SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                        List<? extends Object> args2 = chain.getArgs();
                                        args2.getClass();
                                        String strExtractPackageName = systemHookUtils.extractPackageName(args2);
                                        List<? extends Object> args3 = chain.getArgs();
                                        args3.getClass();
                                        if (systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args3))) {
                                            try {
                                                SystemWifiServiceHookerKt.sanitizeNetworkCapabilities(locationHooker, objProceed, config$xposed_globalRelease, classLoader, strExtractPackageName);
                                            } catch (Throwable th) {
                                                SystemWifiServiceHookerKt.logWifi("[SysWifi] sanitizeNetworkCapabilities failed: " + th);
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
                            HookStatus.INSTANCE.error(cls.getName() + "#" + str, th);
                        }
                    }
                }
                HookStatus.INSTANCE.methodHooked(cls.getName(), str, i2);
                logWifi("[SysWifi] ConnectivityService." + str + " hooked on " + cls.getName());
            } catch (Throwable th2) {
                logWifi("[SysWifi] hook ConnectivityService." + str + " failed: " + th2);
            }
        }
    }

    public static final void installWifiHooks(final LocationHooker locationHooker, Class<?> cls, final ClassLoader classLoader) {
        locationHooker.getClass();
        cls.getClass();
        classLoader.getClass();
        if (locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(cls, Boolean.TRUE) != null) {
            return;
        }
        final List listG = am1.G("[WPA2-PSK-CCMP][RSN-PSK-CCMP][ESS]", "[WPA2-PSK-CCMP+TKIP][RSN-PSK-CCMP+TKIP][ESS]", "[WPA2-PSK-CCMP][ESS][WPS]", "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS]", "[RSN-PSK-CCMP][ESS]", "[WPA2-EAP-CCMP][RSN-EAP-CCMP][ESS]", "[ESS]", "[WPA2-PSK-CCMP][RSN-PSK-CCMP][ESS][WPS]", "[WPA2-SAE-CCMP][RSN-SAE-CCMP][ESS]", "[WPA2-PSK+SAE-CCMP][RSN-PSK+SAE-CCMP][ESS]");
        int i = 0;
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            ArrayList arrayList = new ArrayList();
            d0 d0VarY = zm3.y(cls.getDeclaredMethods());
            int i2 = 0;
            while (d0VarY.hasNext()) {
                final Method method = (Method) d0VarY.next();
                if (o51.f(method.getName(), "getScanResults") && !Modifier.isAbstract(method.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept = xposedHelpers.getModule().hook(method).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt$installWifiHooks$$inlined$hookAllMethods$1
                            /* JADX WARN: Code duplicated, block: B:76:0x0270 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:15:0x0089, B:18:0x00a2, B:20:0x00aa, B:25:0x00b9, B:27:0x00c9, B:29:0x00d1, B:31:0x00d8, B:34:0x00f2, B:36:0x00f8, B:39:0x011d, B:43:0x01a0, B:45:0x01b7, B:49:0x01c2, B:52:0x01e6, B:60:0x0205, B:64:0x022f, B:75:0x025c, B:76:0x0270, B:78:0x027a, B:81:0x0286, B:86:0x0298, B:88:0x02a0, B:54:0x01f1, B:56:0x01fd, B:66:0x023e, B:69:0x0250), top: B:96:0x0089, inners: #1, #3 }] */
                            /* JADX WARN: Code duplicated, block: B:78:0x027a A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, blocks: (B:15:0x0089, B:18:0x00a2, B:20:0x00aa, B:25:0x00b9, B:27:0x00c9, B:29:0x00d1, B:31:0x00d8, B:34:0x00f2, B:36:0x00f8, B:39:0x011d, B:43:0x01a0, B:45:0x01b7, B:49:0x01c2, B:52:0x01e6, B:60:0x0205, B:64:0x022f, B:75:0x025c, B:76:0x0270, B:78:0x027a, B:81:0x0286, B:86:0x0298, B:88:0x02a0, B:54:0x01f1, B:56:0x01fd, B:66:0x023e, B:69:0x0250), top: B:96:0x0089, inners: #1, #3 }] */
                            /* JADX WARN: Code restructure failed: missing block: B:84:0x0294, code lost:
                            
                                if (r0 == null) goto L85;
                             */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r25) {
                                /*
                                    Method dump skipped, instruction units count: 725
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt$installWifiHooks$$inlined$hookAllMethods$1.intercept(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object");
                            }
                        });
                        hookHandleIntercept.getClass();
                        arrayList.add(hookHandleIntercept);
                        i2++;
                    } catch (Throwable th) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getScanResults", th);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getScanResults", i2);
            logWifi("[SysWifi] WifiServiceImpl.getScanResults hooked");
        } catch (Throwable th2) {
            logWifi("[SysWifi] hook getScanResults failed: " + th2);
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            d0 d0VarY2 = zm3.y(cls.getDeclaredMethods());
            int i3 = 0;
            while (d0VarY2.hasNext()) {
                final Method method2 = (Method) d0VarY2.next();
                if (o51.f(method2.getName(), "getConnectionInfo") && !Modifier.isAbstract(method2.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept2 = xposedHelpers2.getModule().hook(method2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt$installWifiHooks$$inlined$hookAllMethods$2
                            /* JADX WARN: Code duplicated, block: B:102:0x029b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:112:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:116:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:24:0x00af  */
                            /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
                            /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
                            /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
                            /* JADX WARN: Code duplicated, block: B:38:0x013f  */
                            /* JADX WARN: Code duplicated, block: B:41:0x01b6  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01de A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #2 {all -> 0x0262, blocks: (B:47:0x01d6, B:49:0x01de, B:57:0x0239), top: B:104:0x01d6 }] */
                            /* JADX WARN: Code duplicated, block: B:55:0x0234  */
                            /* JADX WARN: Code duplicated, block: B:56:0x0237  */
                            /* JADX WARN: Code duplicated, block: B:65:0x0286 A[Catch: all -> 0x02ab, TRY_LEAVE, TryCatch #8 {all -> 0x02ab, blocks: (B:63:0x0278, B:65:0x0286, B:68:0x02a0), top: B:116:0x0278 }] */
                            /* JADX WARN: Code duplicated, block: B:78:0x02f8  */
                            /* JADX WARN: Code duplicated, block: B:79:0x02fb  */
                            /* JADX WARN: Instruction removed from duplicated block: B:38:0x013f, please report this as an issue */
                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                            public Object intercept(XposedInterface.Chain chain) {
                                boolean z;
                                JSONObject jSONObjectOptJSONObject;
                                boolean z2;
                                String str;
                                String str2;
                                String str3;
                                int i4;
                                int iNextInt;
                                int i5;
                                int i6;
                                String str4;
                                int i7;
                                Object objProceed;
                                String str5;
                                XposedHelpers xposedHelpers3;
                                Class<?> clsFindClassIfExists;
                                Object objCallStaticMethod;
                                XposedHelpers xposedHelpers4;
                                Class<?> clsFindClassIfExists2;
                                Object objCallMethod;
                                String str6;
                                String str7 = "caller";
                                chain.getClass();
                                method2.getClass();
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
                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                List<? extends Object> args3 = chain.getArgs();
                                args3.getClass();
                                String strExtractPackageName = systemHookUtils.extractPackageName(args3);
                                List<? extends Object> args4 = chain.getArgs();
                                args4.getClass();
                                if (!systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args4))) {
                                    List args5 = chain.getArgs();
                                    args5.getClass();
                                    return chain.proceed(args5.toArray(new Object[0]));
                                }
                                boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_wifi", true);
                                JSONObject jSONObjectOptJSONObject2 = config$xposed_globalRelease.optJSONObject("wifi_json");
                                try {
                                    try {
                                        if (zOptBoolean) {
                                            z = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("isConnected", false) : false;
                                            if (z) {
                                                jSONObjectOptJSONObject2.getClass();
                                                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("connectedWifi");
                                            } else {
                                                jSONObjectOptJSONObject = null;
                                            }
                                            z2 = z;
                                            if (!zOptBoolean) {
                                                str2 = "02:00:00:00:00:00";
                                                i6 = -1;
                                                str3 = "<unknown ssid>";
                                                iNextInt = -127;
                                                i4 = -1;
                                                i5 = 0;
                                                str = str2;
                                            } else if (z2 || jSONObjectOptJSONObject == null) {
                                                Random random = new Random(((long) (config$xposed_globalRelease.optDouble("lat", 0.0d) * 100000.0d)) ^ ((long) (config$xposed_globalRelease.optDouble("lng", 0.0d) * 100000.0d)));
                                                str = String.format("02:%02x:%02x:%02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256))}, 5));
                                                String strL = p91.l(random.nextInt(9000) + 1000, "WIFI_");
                                                int i8 = random.nextBoolean() ? 2412 : 5180;
                                                str2 = str;
                                                str3 = strL;
                                                i4 = 144;
                                                iNextInt = (-50) - random.nextInt(20);
                                                i5 = i8;
                                                i6 = 1;
                                            } else {
                                                String strOptString = jSONObjectOptJSONObject.optString("ssid", "");
                                                strOptString.getClass();
                                                if (strOptString.length() == 0 || strOptString.equals("<unknown ssid>")) {
                                                    strOptString = "HOME_WIFI";
                                                }
                                                String str8 = strOptString;
                                                String strOptString2 = jSONObjectOptJSONObject.optString("bssid", "02:00:00:00:00:00");
                                                strOptString2.getClass();
                                                int iOptInt = jSONObjectOptJSONObject.optInt("frequency", 2412);
                                                String strOptString3 = jSONObjectOptJSONObject.optString("macAddress", strOptString2);
                                                strOptString3.getClass();
                                                int iOptInt2 = jSONObjectOptJSONObject.optInt("linkSpeed", 65);
                                                int iOptInt3 = jSONObjectOptJSONObject.optInt("level", -65);
                                                int iOptInt4 = jSONObjectOptJSONObject.optInt("networkId", 1);
                                                iNextInt = iOptInt3;
                                                str = strOptString2;
                                                i6 = iOptInt4;
                                                str3 = str8;
                                                i5 = iOptInt;
                                                i4 = iOptInt2;
                                                str2 = strOptString3;
                                            }
                                            xposedHelpers4 = XposedHelpers.INSTANCE;
                                            i7 = iNextInt;
                                            str4 = "\"";
                                            clsFindClassIfExists2 = xposedHelpers4.findClassIfExists("android.net.wifi.WifiInfo$Builder", classLoader);
                                            if (clsFindClassIfExists2 != null) {
                                                Object objNewInstance = xposedHelpers4.newInstance(clsFindClassIfExists2, new Object[0]);
                                                byte[] bytes = str3.getBytes(sw.a);
                                                bytes.getClass();
                                                xposedHelpers4.callMethod(objNewInstance, "setSsid", bytes);
                                                xposedHelpers4.callMethod(objNewInstance, "setBssid", str);
                                                xposedHelpers4.callMethod(objNewInstance, "setRssi", Integer.valueOf(i7));
                                                xposedHelpers4.callMethod(objNewInstance, "setNetworkId", Integer.valueOf(i6));
                                                objCallMethod = xposedHelpers4.callMethod(objNewInstance, "build", new Object[0]);
                                                if (objCallMethod != null) {
                                                    try {
                                                        xposedHelpers4.setObjectField(objCallMethod, "mMacAddress", str2);
                                                    } catch (Throwable unused) {
                                                    }
                                                    try {
                                                        XposedHelpers.INSTANCE.setIntField(objCallMethod, "mLinkSpeed", i4);
                                                    } catch (Throwable unused2) {
                                                    }
                                                    try {
                                                        XposedHelpers.INSTANCE.setIntField(objCallMethod, "mFrequency", i5);
                                                    } catch (Throwable unused3) {
                                                    }
                                                    if (strExtractPackageName == 0) {
                                                        str6 = str7;
                                                    } else {
                                                        str6 = strExtractPackageName;
                                                    }
                                                    SystemWifiServiceHookerKt.logWifi("[SysWifi] Dispatched clean synthetic WifiInfo for " + str6 + " (SSID=" + str3 + ", BSSID=" + str + ")");
                                                    return objCallMethod;
                                                }
                                            }
                                            List args6 = chain.getArgs();
                                            args6.getClass();
                                            objProceed = chain.proceed(args6.toArray(new Object[0]));
                                            if (objProceed != null) {
                                                try {
                                                    xposedHelpers3 = XposedHelpers.INSTANCE;
                                                    clsFindClassIfExists = xposedHelpers3.findClassIfExists("android.net.wifi.WifiSsid", classLoader);
                                                    if (clsFindClassIfExists != null) {
                                                        byte[] bytes2 = str3.getBytes(sw.a);
                                                        bytes2.getClass();
                                                        objCallStaticMethod = xposedHelpers3.callStaticMethod(clsFindClassIfExists, "fromBytes", bytes2);
                                                        if (objCallStaticMethod != null) {
                                                            try {
                                                                xposedHelpers3.setObjectField(objProceed, "mWifiSsid", objCallStaticMethod);
                                                            } catch (Throwable unused4) {
                                                            }
                                                            XposedHelpers.INSTANCE.callMethod(objProceed, "setSSID", objCallStaticMethod);
                                                        }
                                                    }
                                                } catch (Throwable unused5) {
                                                }
                                                try {
                                                    String str9 = str4;
                                                    XposedHelpers.INSTANCE.setObjectField(objProceed, "mSSID", str9 + str3 + str9);
                                                } catch (Throwable unused6) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setObjectField(objProceed, "mBSSID", str);
                                                } catch (Throwable unused7) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.callMethod(objProceed, "setBSSID", str);
                                                } catch (Throwable unused8) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setObjectField(objProceed, "mMacAddress", str2);
                                                } catch (Throwable unused9) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setIntField(objProceed, "mRssi", i7);
                                                } catch (Throwable unused10) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setIntField(objProceed, "mLinkSpeed", i4);
                                                } catch (Throwable unused11) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setIntField(objProceed, "mFrequency", i5);
                                                } catch (Throwable unused12) {
                                                }
                                                try {
                                                    XposedHelpers.INSTANCE.setIntField(objProceed, "mNetworkId", i6);
                                                } catch (Throwable unused13) {
                                                }
                                                if (strExtractPackageName == 0) {
                                                    str5 = str7;
                                                } else {
                                                    str5 = strExtractPackageName;
                                                }
                                                try {
                                                    SystemWifiServiceHookerKt.logWifi("[SysWifi] Injected fake connection info for " + str5 + " (SSID=" + str3 + ", BSSID=" + str + ", maskedRealBssid=true)");
                                                } catch (Throwable th3) {
                                                    SystemWifiServiceHookerKt.logWifi("[SysWifi] modify WifiInfo in-place failed: " + th3);
                                                }
                                            }
                                            return objProceed;
                                        }
                                        str7 = "caller";
                                        clsFindClassIfExists2 = xposedHelpers4.findClassIfExists("android.net.wifi.WifiInfo$Builder", classLoader);
                                        if (clsFindClassIfExists2 != null) {
                                            Object objNewInstance2 = xposedHelpers4.newInstance(clsFindClassIfExists2, new Object[0]);
                                            byte[] bytes3 = str3.getBytes(sw.a);
                                            bytes3.getClass();
                                            xposedHelpers4.callMethod(objNewInstance2, "setSsid", bytes3);
                                            xposedHelpers4.callMethod(objNewInstance2, "setBssid", str);
                                            xposedHelpers4.callMethod(objNewInstance2, "setRssi", Integer.valueOf(i7));
                                            xposedHelpers4.callMethod(objNewInstance2, "setNetworkId", Integer.valueOf(i6));
                                            objCallMethod = xposedHelpers4.callMethod(objNewInstance2, "build", new Object[0]);
                                            if (objCallMethod != null) {
                                                xposedHelpers4.setObjectField(objCallMethod, "mMacAddress", str2);
                                                XposedHelpers.INSTANCE.setIntField(objCallMethod, "mLinkSpeed", i4);
                                                XposedHelpers.INSTANCE.setIntField(objCallMethod, "mFrequency", i5);
                                                if (strExtractPackageName == 0) {
                                                    str6 = str7;
                                                } else {
                                                    str6 = strExtractPackageName;
                                                }
                                                SystemWifiServiceHookerKt.logWifi("[SysWifi] Dispatched clean synthetic WifiInfo for " + str6 + " (SSID=" + str3 + ", BSSID=" + str + ")");
                                                return objCallMethod;
                                            }
                                        }
                                    } catch (Throwable unused14) {
                                    }
                                    xposedHelpers4 = XposedHelpers.INSTANCE;
                                    i7 = iNextInt;
                                    str4 = "\"";
                                } catch (Throwable unused15) {
                                    str4 = "\"";
                                    i7 = iNextInt;
                                }
                                if (z) {
                                    jSONObjectOptJSONObject2.getClass();
                                    jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("connectedWifi");
                                } else {
                                    jSONObjectOptJSONObject = null;
                                }
                                z2 = z;
                                if (!zOptBoolean) {
                                    str2 = "02:00:00:00:00:00";
                                    i6 = -1;
                                    str3 = "<unknown ssid>";
                                    iNextInt = -127;
                                    i4 = -1;
                                    i5 = 0;
                                    str = str2;
                                } else if (z2) {
                                    Random random2 = new Random(((long) (config$xposed_globalRelease.optDouble("lat", 0.0d) * 100000.0d)) ^ ((long) (config$xposed_globalRelease.optDouble("lng", 0.0d) * 100000.0d)));
                                    str = String.format("02:%02x:%02x:%02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256))}, 5));
                                    String strL2 = p91.l(random2.nextInt(9000) + 1000, "WIFI_");
                                    if (random2.nextBoolean()) {
                                    }
                                    str2 = str;
                                    str3 = strL2;
                                    i4 = 144;
                                    iNextInt = (-50) - random2.nextInt(20);
                                    i5 = i8;
                                    i6 = 1;
                                } else {
                                    Random random3 = new Random(((long) (config$xposed_globalRelease.optDouble("lat", 0.0d) * 100000.0d)) ^ ((long) (config$xposed_globalRelease.optDouble("lng", 0.0d) * 100000.0d)));
                                    str = String.format("02:%02x:%02x:%02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(random3.nextInt(256)), Integer.valueOf(random3.nextInt(256)), Integer.valueOf(random3.nextInt(256)), Integer.valueOf(random3.nextInt(256)), Integer.valueOf(random3.nextInt(256))}, 5));
                                    String strL3 = p91.l(random3.nextInt(9000) + 1000, "WIFI_");
                                    if (random3.nextBoolean()) {
                                    }
                                    str2 = str;
                                    str3 = strL3;
                                    i4 = 144;
                                    iNextInt = (-50) - random3.nextInt(20);
                                    i5 = i8;
                                    i6 = 1;
                                }
                                List args7 = chain.getArgs();
                                args7.getClass();
                                objProceed = chain.proceed(args7.toArray(new Object[0]));
                                if (objProceed != null) {
                                    xposedHelpers3 = XposedHelpers.INSTANCE;
                                    clsFindClassIfExists = xposedHelpers3.findClassIfExists("android.net.wifi.WifiSsid", classLoader);
                                    if (clsFindClassIfExists != null) {
                                        byte[] bytes4 = str3.getBytes(sw.a);
                                        bytes4.getClass();
                                        objCallStaticMethod = xposedHelpers3.callStaticMethod(clsFindClassIfExists, "fromBytes", bytes4);
                                        if (objCallStaticMethod != null) {
                                            xposedHelpers3.setObjectField(objProceed, "mWifiSsid", objCallStaticMethod);
                                            XposedHelpers.INSTANCE.callMethod(objProceed, "setSSID", objCallStaticMethod);
                                        }
                                    }
                                    String str10 = str4;
                                    XposedHelpers.INSTANCE.setObjectField(objProceed, "mSSID", str10 + str3 + str10);
                                    XposedHelpers.INSTANCE.setObjectField(objProceed, "mBSSID", str);
                                    XposedHelpers.INSTANCE.callMethod(objProceed, "setBSSID", str);
                                    XposedHelpers.INSTANCE.setObjectField(objProceed, "mMacAddress", str2);
                                    XposedHelpers.INSTANCE.setIntField(objProceed, "mRssi", i7);
                                    XposedHelpers.INSTANCE.setIntField(objProceed, "mLinkSpeed", i4);
                                    XposedHelpers.INSTANCE.setIntField(objProceed, "mFrequency", i5);
                                    XposedHelpers.INSTANCE.setIntField(objProceed, "mNetworkId", i6);
                                    if (strExtractPackageName == 0) {
                                        str5 = str7;
                                    } else {
                                        str5 = strExtractPackageName;
                                    }
                                    SystemWifiServiceHookerKt.logWifi("[SysWifi] Injected fake connection info for " + str5 + " (SSID=" + str3 + ", BSSID=" + str + ", maskedRealBssid=true)");
                                }
                                return objProceed;
                            }
                        });
                        hookHandleIntercept2.getClass();
                        arrayList2.add(hookHandleIntercept2);
                        i3++;
                    } catch (Throwable th3) {
                        HookStatus.INSTANCE.error(cls.getName() + "#getConnectionInfo", th3);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(cls.getName(), "getConnectionInfo", i3);
            logWifi("[SysWifi] WifiServiceImpl.getConnectionInfo hooked");
        } catch (Throwable th4) {
            logWifi("[SysWifi] hook getConnectionInfo failed: " + th4);
        }
        try {
            SystemClassLocator systemClassLocator = SystemClassLocator.INSTANCE;
            SystemComponent systemComponent = SystemComponent.WIFI_SCANNER_SERVICE;
            ClassLoader classLoader2 = cls.getClassLoader();
            Class<?> clsLocate$default = SystemClassLocator.locate$default(systemClassLocator, systemComponent, classLoader2 == null ? classLoader : classLoader2, am1.F(classLoader), null, null, false, null, null, 248, null);
            if (clsLocate$default == null || locationHooker.getHookedCallbackClasses$xposed_globalRelease().putIfAbsent(clsLocate$default, Boolean.TRUE) != null) {
                return;
            }
            String str = new String[]{"getSingleScanResults"}[0];
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            ArrayList arrayList3 = new ArrayList();
            d0 d0VarY3 = zm3.y(clsLocate$default.getDeclaredMethods());
            while (d0VarY3.hasNext()) {
                final Method method3 = (Method) d0VarY3.next();
                if (o51.f(method3.getName(), str) && !Modifier.isAbstract(method3.getModifiers())) {
                    try {
                        XposedInterface.HookHandle hookHandleIntercept3 = xposedHelpers3.getModule().hook(method3).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt$installWifiHooks$$inlined$hookAllMethods$3
                            public Object intercept(XposedInterface.Chain chain) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
                                chain.getClass();
                                method3.getClass();
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
                                SystemHookUtils systemHookUtils = SystemHookUtils.INSTANCE;
                                List<? extends Object> args3 = chain.getArgs();
                                args3.getClass();
                                String strExtractPackageName = systemHookUtils.extractPackageName(args3);
                                List<? extends Object> args4 = chain.getArgs();
                                args4.getClass();
                                if (!systemHookUtils.isTargetCaller(chain.getThisObject(), strExtractPackageName, config$xposed_globalRelease, systemHookUtils.extractCallerUid(args4))) {
                                    List args5 = chain.getArgs();
                                    args5.getClass();
                                    return chain.proceed(args5.toArray(new Object[0]));
                                }
                                boolean zOptBoolean = config$xposed_globalRelease.optBoolean("mock_wifi", true);
                                ArrayList arrayList4 = new ArrayList();
                                if (!zOptBoolean) {
                                    if (strExtractPackageName == null) {
                                        strExtractPackageName = "caller";
                                    }
                                    SystemWifiServiceHookerKt.logWifi("[SysWifi] WifiScanningServiceImpl.getSingleScanResults suppressed (mock_wifi off) for ".concat(strExtractPackageName));
                                    return arrayList4;
                                }
                                Class<?> clsFindClass = XposedHelpers.INSTANCE.findClass("android.net.wifi.ScanResult", classLoader);
                                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                Random random = new Random();
                                Random random2 = new Random(((long) (config$xposed_globalRelease.optDouble("lng", 0.0d) * 100000.0d)) ^ ((long) (config$xposed_globalRelease.optDouble("lat", 0.0d) * 100000.0d)));
                                for (int i4 = 0; i4 < 5; i4++) {
                                    XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                                    Object objNewInstance = xposedHelpers4.newInstance(clsFindClass, new Object[0]);
                                    xposedHelpers4.setObjectField(objNewInstance, "SSID", "WIFI_" + (random2.nextInt(9000) + 1000));
                                    xposedHelpers4.setObjectField(objNewInstance, "BSSID", String.format("%02x:%02x:%02x:%02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256)), Integer.valueOf(random2.nextInt(256))}, 6)));
                                    xposedHelpers4.setObjectField(objNewInstance, "capabilities", "[WPA2-PSK-CCMP][ESS]");
                                    xposedHelpers4.setIntField(objNewInstance, "level", (-40) - random2.nextInt(50));
                                    xposedHelpers4.setIntField(objNewInstance, "frequency", random2.nextBoolean() ? 2412 : 5180);
                                    xposedHelpers4.setLongField(objNewInstance, "timestamp", jElapsedRealtimeNanos - (((long) random.nextInt(500)) * 1000));
                                    arrayList4.add(objNewInstance);
                                }
                                if (strExtractPackageName == null) {
                                    strExtractPackageName = "caller";
                                }
                                SystemWifiServiceHookerKt.logWifi("[SysWifi] WifiScanningServiceImpl.getSingleScanResults intercepted for ".concat(strExtractPackageName));
                                return arrayList4;
                            }
                        });
                        hookHandleIntercept3.getClass();
                        arrayList3.add(hookHandleIntercept3);
                        i++;
                    } catch (Throwable th5) {
                        HookStatus.INSTANCE.error(clsLocate$default.getName() + "#" + str, th5);
                    }
                }
            }
            HookStatus.INSTANCE.methodHooked(clsLocate$default.getName(), str, i);
            logWifi("[SysWifi] WifiScanningServiceImpl.getSingleScanResults hooked");
        } catch (Throwable th6) {
            logWifi("[SysWifi] hook WifiScanningServiceImpl failed: " + th6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installWifiHooks$lambda$6$addFakeScanResult(Class<?> cls, List<String> list, Random random, ClassLoader classLoader, long j, ArrayList<Object> arrayList, JSONObject jSONObject) {
        XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
        Object objNewInstance = xposedHelpers.newInstance(cls, new Object[0]);
        String strOptString = jSONObject.optString("ssid", "");
        String strOptString2 = jSONObject.optString("bssid", "");
        strOptString.getClass();
        if (strOptString.length() == 0 || strOptString.equals("<unknown ssid>")) {
            strOptString2.getClass();
            strOptString = "WIFI_".concat(s13.X(l13.C0(5, strOptString2), ":", "", false));
        }
        xposedHelpers.setObjectField(objNewInstance, "SSID", strOptString);
        xposedHelpers.setObjectField(objNewInstance, "BSSID", strOptString2);
        xposedHelpers.setIntField(objNewInstance, "level", jSONObject.optInt("level", -65));
        xposedHelpers.setIntField(objNewInstance, "frequency", jSONObject.optInt("frequency", 2412));
        xposedHelpers.setObjectField(objNewInstance, "capabilities", jSONObject.optString("capabilities", list.get(random.nextInt(list.size()))));
        try {
            Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.net.wifi.WifiSsid", classLoader);
            if (clsFindClassIfExists != null) {
                byte[] bytes = strOptString.getBytes(sw.a);
                bytes.getClass();
                Object objCallStaticMethod = xposedHelpers.callStaticMethod(clsFindClassIfExists, "fromBytes", bytes);
                if (objCallStaticMethod != null) {
                    xposedHelpers.setObjectField(objNewInstance, "wifiSsid", objCallStaticMethod);
                }
            }
        } catch (Throwable unused) {
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists2 = xposedHelpers2.findClassIfExists("android.net.wifi.ScanResult$InformationElement", classLoader);
            if (clsFindClassIfExists2 != null) {
                xposedHelpers2.setObjectField(objNewInstance, "informationElements", Array.newInstance(clsFindClassIfExists2, 0));
            }
        } catch (Throwable unused2) {
        }
        try {
            XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists3 = xposedHelpers3.findClassIfExists("android.net.wifi.ScanResult$RadioChainInfo", classLoader);
            if (clsFindClassIfExists3 != null) {
                xposedHelpers3.setObjectField(objNewInstance, "radioChainInfos", Array.newInstance(clsFindClassIfExists3, 0));
            }
        } catch (Throwable unused3) {
        }
        try {
            XposedHelpers.INSTANCE.setLongField(objNewInstance, "timestamp", (j - (((long) random.nextInt(200000)) * 1000)) / 1000);
        } catch (Throwable unused4) {
        }
        arrayList.add(objNewInstance);
    }

    public static final boolean isConnectivityServiceHooked() {
        return isConnectivityServiceHooked;
    }

    public static final boolean isWifiServiceHooked() {
        return isWifiServiceHooked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logWifi(String str) {
        XposedBridge.INSTANCE.log(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sanitizeNetworkCapabilities(LocationHooker locationHooker, Object obj, JSONObject jSONObject, ClassLoader classLoader, String str) {
        if (!(obj instanceof Object[])) {
            sanitizeSingleNetworkCapabilities(locationHooker, obj, jSONObject, classLoader, str);
            return;
        }
        for (Object obj2 : (Object[]) obj) {
            if (obj2 != null) {
                sanitizeSingleNetworkCapabilities(locationHooker, obj2, jSONObject, classLoader, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c7 A[Catch: all -> 0x01ec, TRY_LEAVE, TryCatch #12 {all -> 0x01ec, blocks: (B:56:0x01bd, B:58:0x01c7, B:61:0x01e1), top: B:117:0x01bd }] */
    /* JADX WARN: Code duplicated, block: B:73:0x023d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0240  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static final void sanitizeSingleNetworkCapabilities(LocationHooker locationHooker, Object obj, JSONObject jSONObject, ClassLoader classLoader, String str) {
        Object objCallMethod;
        JSONObject jSONObjectOptJSONObject;
        String str2;
        String strL;
        int iNextInt;
        int i;
        int iOptInt;
        int iOptInt2;
        String strOptString;
        String str3;
        String str4;
        Object objCallMethod2;
        Object objNewInstance;
        XposedHelpers xposedHelpers;
        Class<?> clsFindClassIfExists;
        Object objCallStaticMethod;
        String str5;
        try {
            try {
                objCallMethod = XposedHelpers.INSTANCE.getObjectField(obj, "mTransportInfo");
            } catch (Throwable unused) {
                objCallMethod = null;
            }
        } catch (Throwable unused2) {
            objCallMethod = XposedHelpers.INSTANCE.callMethod(obj, "getTransportInfo", new Object[0]);
        }
        if (objCallMethod == null) {
            return;
        }
        if (!p91.z(objCallMethod, "WifiInfo", false) && !LocationHooker.Companion.hasTypeByName(objCallMethod.getClass(), "android.net.wifi.WifiInfo")) {
            return;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("wifi_json");
        boolean zOptBoolean = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("isConnected", false) : false;
        if (zOptBoolean) {
            jSONObjectOptJSONObject2.getClass();
            jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("connectedWifi");
        } else {
            jSONObjectOptJSONObject = null;
        }
        if (!zOptBoolean || jSONObjectOptJSONObject == null) {
            Random random = new Random(((long) (jSONObject.optDouble("lat", 0.0d) * 100000.0d)) ^ ((long) (jSONObject.optDouble("lng", 0.0d) * 100000.0d)));
            str2 = String.format("02:%02x:%02x:%02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256)), Integer.valueOf(random.nextInt(256))}, 5));
            strL = p91.l(random.nextInt(9000) + 1000, "WIFI_");
            int i2 = random.nextBoolean() ? 2412 : 5180;
            iNextInt = (-50) - random.nextInt(20);
            i = 144;
            iOptInt = i2;
            iOptInt2 = 1;
            strOptString = str2;
        } else {
            String strOptString2 = jSONObjectOptJSONObject.optString("ssid", "");
            strOptString2.getClass();
            if (strOptString2.length() == 0 || strOptString2.equals("<unknown ssid>")) {
                strOptString2 = "HOME_WIFI";
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("bssid", "02:00:00:00:00:00");
            strOptString3.getClass();
            iOptInt = jSONObjectOptJSONObject.optInt("frequency", 2412);
            strOptString = jSONObjectOptJSONObject.optString("macAddress", strOptString3);
            strOptString.getClass();
            int iOptInt3 = jSONObjectOptJSONObject.optInt("linkSpeed", 65);
            String str6 = strOptString2;
            int iOptInt4 = jSONObjectOptJSONObject.optInt("level", -65);
            iOptInt2 = jSONObjectOptJSONObject.optInt("networkId", 1);
            i = iOptInt3;
            str2 = strOptString3;
            iNextInt = iOptInt4;
            strL = str6;
        }
        Object obj2 = objCallMethod;
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            str4 = "[SysWifi] Sanitized ConnectivityService NetworkCapabilities.mTransportInfo for ";
            try {
                Class<?> clsFindClassIfExists2 = xposedHelpers2.findClassIfExists("android.net.wifi.WifiInfo$Builder", classLoader);
                try {
                    if (clsFindClassIfExists2 != null) {
                        str3 = "mTransportInfo";
                        try {
                            Object objNewInstance2 = xposedHelpers2.newInstance(clsFindClassIfExists2, new Object[0]);
                            byte[] bytes = strL.getBytes(sw.a);
                            bytes.getClass();
                            xposedHelpers2.callMethod(objNewInstance2, "setSsid", bytes);
                            xposedHelpers2.callMethod(objNewInstance2, "setBssid", str2);
                            xposedHelpers2.callMethod(objNewInstance2, "setRssi", Integer.valueOf(iNextInt));
                            xposedHelpers2.callMethod(objNewInstance2, "setNetworkId", Integer.valueOf(iOptInt2));
                            objCallMethod2 = xposedHelpers2.callMethod(objNewInstance2, "build", new Object[0]);
                            if (objCallMethod2 != null) {
                                try {
                                    xposedHelpers2.setObjectField(objCallMethod2, "mMacAddress", strOptString);
                                } catch (Throwable unused3) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setIntField(objCallMethod2, "mLinkSpeed", i);
                                } catch (Throwable unused4) {
                                }
                                try {
                                    XposedHelpers.INSTANCE.setIntField(objCallMethod2, "mFrequency", iOptInt);
                                } catch (Throwable unused5) {
                                }
                            }
                        } catch (Throwable unused6) {
                            objCallMethod2 = null;
                        }
                        if (objCallMethod2 == null) {
                            try {
                                objNewInstance = XposedHelpers.INSTANCE.newInstance(obj2.getClass(), obj2);
                            } catch (Throwable unused7) {
                                objNewInstance = obj2;
                            }
                            try {
                                xposedHelpers = XposedHelpers.INSTANCE;
                                clsFindClassIfExists = xposedHelpers.findClassIfExists("android.net.wifi.WifiSsid", classLoader);
                                if (clsFindClassIfExists != null) {
                                    byte[] bytes2 = strL.getBytes(sw.a);
                                    bytes2.getClass();
                                    objCallStaticMethod = xposedHelpers.callStaticMethod(clsFindClassIfExists, "fromBytes", bytes2);
                                    if (objCallStaticMethod != null) {
                                        try {
                                            xposedHelpers.setObjectField(objNewInstance, "mWifiSsid", objCallStaticMethod);
                                        } catch (Throwable unused8) {
                                        }
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance, "setSSID", objCallStaticMethod);
                                    }
                                }
                            } catch (Throwable unused9) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mSSID", "\"" + strL + "\"");
                            } catch (Throwable unused10) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mBSSID", str2);
                            } catch (Throwable unused11) {
                            }
                            try {
                                XposedHelpers.INSTANCE.callMethod(objNewInstance, "setBSSID", str2);
                            } catch (Throwable unused12) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mMacAddress", strOptString);
                            } catch (Throwable unused13) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mRssi", iNextInt);
                            } catch (Throwable unused14) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mLinkSpeed", i);
                            } catch (Throwable unused15) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mFrequency", iOptInt);
                            } catch (Throwable unused16) {
                            }
                            try {
                                XposedHelpers.INSTANCE.setIntField(objNewInstance, "mNetworkId", iOptInt2);
                            } catch (Throwable unused17) {
                            }
                            objCallMethod2 = objNewInstance;
                        }
                        XposedHelpers.INSTANCE.setObjectField(obj, str3, objCallMethod2);
                        if (str == null) {
                            str5 = "caller";
                        } else {
                            str5 = str;
                        }
                        logWifi(str4 + str5 + " (SSID=" + strL + ", BSSID=" + str2 + ")");
                        return;
                    }
                    str3 = "mTransportInfo";
                    XposedHelpers.INSTANCE.setObjectField(obj, str3, objCallMethod2);
                    if (str == null) {
                        str5 = "caller";
                    } else {
                        str5 = str;
                    }
                    logWifi(str4 + str5 + " (SSID=" + strL + ", BSSID=" + str2 + ")");
                    return;
                } catch (Throwable th) {
                    logWifi("[SysWifi] Set mTransportInfo on NetworkCapabilities failed: " + th);
                    return;
                }
            } catch (Throwable unused18) {
            }
        } catch (Throwable unused19) {
            str3 = "mTransportInfo";
            str4 = "[SysWifi] Sanitized ConnectivityService NetworkCapabilities.mTransportInfo for ";
        }
        objCallMethod2 = null;
        if (objCallMethod2 == null) {
            objNewInstance = XposedHelpers.INSTANCE.newInstance(obj2.getClass(), obj2);
            xposedHelpers = XposedHelpers.INSTANCE;
            clsFindClassIfExists = xposedHelpers.findClassIfExists("android.net.wifi.WifiSsid", classLoader);
            if (clsFindClassIfExists != null) {
                byte[] bytes3 = strL.getBytes(sw.a);
                bytes3.getClass();
                objCallStaticMethod = xposedHelpers.callStaticMethod(clsFindClassIfExists, "fromBytes", bytes3);
                if (objCallStaticMethod != null) {
                    xposedHelpers.setObjectField(objNewInstance, "mWifiSsid", objCallStaticMethod);
                    XposedHelpers.INSTANCE.callMethod(objNewInstance, "setSSID", objCallStaticMethod);
                }
            }
            XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mSSID", "\"" + strL + "\"");
            XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mBSSID", str2);
            XposedHelpers.INSTANCE.callMethod(objNewInstance, "setBSSID", str2);
            XposedHelpers.INSTANCE.setObjectField(objNewInstance, "mMacAddress", strOptString);
            XposedHelpers.INSTANCE.setIntField(objNewInstance, "mRssi", iNextInt);
            XposedHelpers.INSTANCE.setIntField(objNewInstance, "mLinkSpeed", i);
            XposedHelpers.INSTANCE.setIntField(objNewInstance, "mFrequency", iOptInt);
            XposedHelpers.INSTANCE.setIntField(objNewInstance, "mNetworkId", iOptInt2);
            objCallMethod2 = objNewInstance;
        }
    }

    public static final void setConnectivityServiceHooked(boolean z) {
        isConnectivityServiceHooked = z;
    }

    public static final void setWifiServiceHooked(boolean z) {
        isWifiServiceHooked = z;
    }

    public static final void tryHookPendingSystemServices(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        if (!isWifiServiceHooked) {
            try {
                XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                Class<?> clsFindClassIfExists = xposedHelpers.findClassIfExists("android.os.ServiceManager", classLoader);
                Object objCallStaticMethod = clsFindClassIfExists != null ? xposedHelpers.callStaticMethod(clsFindClassIfExists, "getService", "wifi") : null;
                if (objCallStaticMethod != null && !l13.c0(objCallStaticMethod.getClass().getName(), "BinderProxy", false)) {
                    Class<?> cls = objCallStaticMethod.getClass();
                    ClassLoader classLoader2 = cls.getClassLoader();
                    if (classLoader2 == null) {
                        classLoader2 = classLoader;
                    }
                    logWifi("[SysWifi] Discovered REAL WifiServiceImpl via service poll: ".concat(cls.getName()));
                    HookStatus.INSTANCE.classFound(SystemComponent.WIFI_SERVICE, cls, "ServiceManager.getService");
                    installWifiHooks(locationHooker, cls, classLoader2);
                    isWifiServiceHooked = true;
                }
            } catch (Throwable unused) {
            }
        }
        if (isConnectivityServiceHooked) {
            return;
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Class<?> clsFindClassIfExists2 = xposedHelpers2.findClassIfExists("android.os.ServiceManager", classLoader);
            Object objCallStaticMethod2 = clsFindClassIfExists2 != null ? xposedHelpers2.callStaticMethod(clsFindClassIfExists2, "getService", "connectivity") : null;
            if (objCallStaticMethod2 == null || l13.c0(objCallStaticMethod2.getClass().getName(), "BinderProxy", false)) {
                return;
            }
            Class<?> cls2 = objCallStaticMethod2.getClass();
            ClassLoader classLoader3 = cls2.getClassLoader();
            if (classLoader3 != null) {
                classLoader = classLoader3;
            }
            logWifi("[SysWifi] Discovered REAL ConnectivityService via service poll: ".concat(cls2.getName()));
            HookStatus.INSTANCE.classFound(SystemComponent.CONNECTIVITY_SERVICE, cls2, "ServiceManager.getService");
            installConnectivityHooks(locationHooker, cls2, classLoader);
            isConnectivityServiceHooked = true;
        } catch (Throwable unused2) {
        }
    }
}
