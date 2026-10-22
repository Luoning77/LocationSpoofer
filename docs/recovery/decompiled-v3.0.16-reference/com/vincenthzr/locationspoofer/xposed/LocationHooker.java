package com.vincenthzr.locationspoofer.xposed;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.vincenthzr.locationspoofer.data.update.SelfHostedUpdates;
import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import com.vincenthzr.locationspoofer.xposed.hooks.AMapHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.AntiDetectionHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.BaiduMapHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.BaseLocationHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.GnssStatusHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.GoogleAndAddressHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.SensorStepHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemAccelHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemAppOpsHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemBluetoothServiceHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemLocationServiceHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemTelephonyServiceHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.SystemWifiServiceHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.TencentMapHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.FrameworkAdapters;
import com.vincenthzr.locationspoofer.xposed.hooks.delivery.SystemHookCapabilities;
import com.vincenthzr.locationspoofer.xposed.hooks.network.BluetoothScanDispatcherKt;
import com.vincenthzr.locationspoofer.xposed.hooks.network.CellularMethodHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.network.ConnectivityHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.network.WifiScanResultHookerKt;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemProcess;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.VendorRegistry;
import com.vincenthzr.locationspoofer.xposed.utils.CoordinateConverterKt;
import com.vincenthzr.locationspoofer.xposed.utils.FrameworkConfigReceiver;
import com.vincenthzr.locationspoofer.xposed.utils.FrameworkConfigSnapshot;
import com.vincenthzr.locationspoofer.xposed.utils.HotReloadHost;
import com.vincenthzr.locationspoofer.xposed.utils.HotReloadHostKt;
import com.vincenthzr.locationspoofer.xposed.utils.ModuleBinderDeaths;
import com.vincenthzr.locationspoofer.xposed.utils.RouteEngine;
import com.vincenthzr.locationspoofer.xposed.utils.SpoofedMotion;
import com.vincenthzr.locationspoofer.xposed.utils.XposedBridge;
import com.vincenthzr.locationspoofer.xposed.utils.XposedHelpers;
import defpackage.am1;
import defpackage.au0;
import defpackage.az2;
import defpackage.bv0;
import defpackage.ca0;
import defpackage.d0;
import defpackage.dh2;
import defpackage.eh2;
import defpackage.ei1;
import defpackage.fi1;
import defpackage.fz;
import defpackage.gh0;
import defpackage.i52;
import defpackage.ji1;
import defpackage.ji2;
import defpackage.jq1;
import defpackage.l13;
import defpackage.l93;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.ns0;
import defpackage.o51;
import defpackage.p91;
import defpackage.s13;
import defpackage.sw;
import defpackage.vk0;
import defpackage.vk2;
import defpackage.wg2;
import defpackage.yo;
import defpackage.zm3;
import defpackage.zs0;
import defpackage.zy;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.DebugKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LocationHooker extends XposedModule {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> SYSTEM_PACKAGES = yo.H0(new String[]{"android", "system", "com.android.phone"});
    public static final boolean VERBOSE_CELL_BUILD_LOGS = false;
    private final ConcurrentHashMap<Object, Timer> bleScanTimers;
    private volatile String cachedAddress;
    private volatile String cachedCity;
    private volatile String cachedCountry;
    private volatile String cachedDistrict;
    private Iterable<? extends Object> cachedGpsSatellitesList;
    private volatile String cachedPoiName;
    private volatile String cachedProvince;
    private volatile String cachedStreet;
    private volatile String cachedStreetNum;
    private final CopyOnWriteArrayList<Object> capturedAMapListeners;
    private final CopyOnWriteArrayList<Object> capturedBaiduListeners;
    private final CopyOnWriteArrayList<Object> capturedFusedLocationCallbacks;
    private final CopyOnWriteArrayList<Object> capturedLocationListeners;
    private final CopyOnWriteArrayList<Object> capturedTencentListeners;
    private volatile FrameworkConfigReceiver configReceiver;
    private volatile Thread configWorker;
    private volatile ClassLoader currentClassLoader;
    private volatile String currentPackageName;
    private volatile boolean environmentHooksInstalled;
    private double hookAccuracyDrift;
    private double hookDriftLat;
    private double hookDriftLng;
    private long hookLastCallTime;
    private final ConcurrentHashMap<Class<?>, Boolean> hookedCallbackClasses;
    private volatile boolean isBluetoothProcessInstance;
    private volatile boolean isConfigWorkerStarted;
    private volatile boolean isPhoneProcessInstance;
    private volatile boolean isSystemServerProcess;
    private volatile JSONObject lastConfig;
    private volatile double lastGeocodedLat;
    private volatile double lastGeocodedLng;
    private long lastGpsSatellitesUpdate;
    private volatile String lastOpenCellConfigLogKey;
    private volatile double lastSpoofedLat;
    private volatile double lastSpoofedLng;
    private final ConcurrentHashMap<Object, Timer> nmeaTimers;
    private final Set<Timer> ownedReloadTimers;
    private final Object pollingLock;
    private Class<?> restoredNativeSensorApi;
    private volatile boolean retiringGeneration;
    private final Random rng;
    private volatile Thread sensorWorker;
    private long startTimestamp;
    private volatile SystemAccelHooker systemAccelHooker;
    private SystemHookCapabilities systemCapabilities;
    private volatile boolean systemHooksInstalled;
    private final List<AutoCloseable> vendorExtraHooks;

    /* JADX INFO: renamed from: com.vincenthzr.locationspoofer.xposed.LocationHooker$startFrameworkConfigReceiver$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final /* synthetic */ class AnonymousClass5 extends bv0 implements au0 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
        }

        @Override // defpackage.au0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public LocationHooker() {
        XposedHelpers.INSTANCE.setModule(this);
        this.nmeaTimers = new ConcurrentHashMap<>();
        this.bleScanTimers = new ConcurrentHashMap<>();
        this.hookedCallbackClasses = new ConcurrentHashMap<>();
        this.systemCapabilities = new SystemHookCapabilities(false, false, false, 7, null);
        this.capturedLocationListeners = new CopyOnWriteArrayList<>();
        this.capturedAMapListeners = new CopyOnWriteArrayList<>();
        this.capturedBaiduListeners = new CopyOnWriteArrayList<>();
        this.capturedTencentListeners = new CopyOnWriteArrayList<>();
        this.capturedFusedLocationCallbacks = new CopyOnWriteArrayList<>();
        this.currentPackageName = "";
        this.cachedProvince = "";
        this.cachedCity = "";
        this.cachedDistrict = "";
        this.cachedStreet = "";
        this.cachedStreetNum = "";
        this.cachedAddress = "";
        this.cachedCountry = "";
        this.cachedPoiName = "";
        this.lastGeocodedLat = -999.0d;
        this.lastGeocodedLng = -999.0d;
        this.vendorExtraHooks = new ArrayList();
        this.ownedReloadTimers = Collections.synchronizedSet(new LinkedHashSet());
        this.startTimestamp = System.currentTimeMillis();
        this.rng = new Random();
        this.pollingLock = new Object();
    }

    private final boolean handleSystemProcessGlobal(String str, String str2, ClassLoader classLoader) {
        SystemProcess systemProcess;
        JSONArray jSONArrayOptJSONArray;
        if (!o51.f(str, "com.android.systemui") && !o51.f(str2, "com.android.systemui")) {
            int length = 0;
            boolean z = o51.f(str2, "system_server") || o51.f(str2, "system");
            if (z || (!o51.f(str, "android") && !o51.f(str, "system"))) {
                boolean z2 = o51.f(str, "com.android.phone") || o51.f(str2, "com.android.phone");
                boolean z3 = o51.f(str, "com.android.bluetooth") || s13.Z(str2, "com.android.bluetooth", false);
                if (z) {
                    this.isSystemServerProcess = true;
                }
                if (z2) {
                    this.isPhoneProcessInstance = true;
                }
                if (z3) {
                    this.isBluetoothProcessInstance = true;
                }
                if (!z && !z2 && !z3) {
                    return false;
                }
                int iMyUid = Process.myUid();
                StringBuilder sbT = p91.t("[SysHook] Core system process detected: pkg=", str, ", process=", str2, ", myUid=");
                sbT.append(iMyUid);
                Log.e("LocationSpoofer", sbT.toString());
                if (this.systemHooksInstalled) {
                    readConfig$xposed_globalRelease();
                    return true;
                }
                this.systemHooksInstalled = true;
                XposedBridge.INSTANCE.log("[SysHook] Deploying system framework hooks in " + str2 + "...");
                JSONObject config$xposed_globalRelease = readConfig$xposed_globalRelease();
                VendorRegistry vendorRegistry = VendorRegistry.INSTANCE;
                vendorRegistry.applyManualOverride(config$xposed_globalRelease != null ? config$xposed_globalRelease.optString("vendor_override", DebugKt.DEBUG_PROPERTY_VALUE_AUTO) : null);
                HookStatus hookStatus = HookStatus.INSTANCE;
                if (z) {
                    systemProcess = SystemProcess.SYSTEM_SERVER;
                } else {
                    systemProcess = z2 ? SystemProcess.PHONE : SystemProcess.BLUETOOTH;
                }
                hookStatus.begin(systemProcess);
                handleSystemProcessGlobal$deploy("frameworkCapabilities", new ns0(this, classLoader, 12));
                if (z) {
                    if (config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("debug_dump_system_services", false)) {
                        handleSystemProcessGlobal$deploy("dumpSystemServiceInternals", new ns0(this, classLoader, 3));
                    }
                    handleSystemProcessGlobal$deploy("hookSystemLocationService", new ns0(this, classLoader, 4));
                    handleSystemProcessGlobal$deploy("hookSystemWifiService", new ns0(this, classLoader, 5));
                    handleSystemProcessGlobal$deploy("hookSystemConnectivityService", new ns0(this, classLoader, 6));
                    handleSystemProcessGlobal$deploy("hookSystemTelephonyRegistry", new ns0(this, classLoader, 7));
                    handleSystemProcessGlobal$deploy("hookSystemAppOpsService", new ns0(this, classLoader, 8));
                }
                if (z2) {
                    handleSystemProcessGlobal$deploy("hookSystemTelephonyService", new ns0(this, classLoader, 9));
                }
                if (z3) {
                    handleSystemProcessGlobal$deploy("hookSystemBluetoothService", new ns0(this, classLoader, 10));
                }
                vendorRegistry.logSelectionOnce();
                handleSystemProcessGlobal$deploy("installExtraHooks", new ns0(this, classLoader, 11));
                if (z) {
                    handleSystemProcessGlobal$deploy("globalSensorAdapter", new ei1(this, length));
                }
                JSONObject config$xposed_globalRelease2 = readConfig$xposed_globalRelease();
                Boolean boolValueOf = config$xposed_globalRelease2 != null ? Boolean.valueOf(config$xposed_globalRelease2.optBoolean("active")) : null;
                Boolean boolValueOf2 = config$xposed_globalRelease2 != null ? Boolean.valueOf(config$xposed_globalRelease2.optBoolean("system_hook_global_mode")) : null;
                if (config$xposed_globalRelease2 != null && (jSONArrayOptJSONArray = config$xposed_globalRelease2.optJSONArray("system_hook_packages")) != null) {
                    length = jSONArrayOptJSONArray.length();
                }
                Log.e("LocationSpoofer", "[SysHook] System framework hooks deployed in " + str2 + ". Config active=" + boolValueOf + ", globalMode=" + boolValueOf2 + ", targetPkgs=" + length);
            }
        }
        return true;
    }

    private static final void handleSystemProcessGlobal$deploy(String str, au0 au0Var) {
        try {
            au0Var.invoke();
        } catch (Throwable th) {
            XposedBridge.INSTANCE.log("[SysHook] " + str + " error: " + th);
            HookStatus.INSTANCE.error(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$25(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.systemCapabilities = FrameworkAdapters.INSTANCE.install(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$26(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.dumpSystemServiceInternals$xposed_globalRelease(classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$27(LocationHooker locationHooker, ClassLoader classLoader) {
        SystemLocationServiceHookerKt.hookSystemLocationService(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$28(LocationHooker locationHooker, ClassLoader classLoader) {
        SystemWifiServiceHookerKt.hookSystemWifiService(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$29(LocationHooker locationHooker, ClassLoader classLoader) {
        SystemWifiServiceHookerKt.hookSystemConnectivityService(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$30(LocationHooker locationHooker, ClassLoader classLoader) {
        SystemTelephonyServiceHookerKt.hookSystemTelephonyRegistry(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$31(LocationHooker locationHooker, ClassLoader classLoader) {
        SystemAppOpsHookerKt.hookSystemAppOpsService(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$32(LocationHooker locationHooker, ClassLoader classLoader) {
        SystemTelephonyServiceHookerKt.hookSystemTelephonyService(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$33(LocationHooker locationHooker, ClassLoader classLoader) {
        SystemBluetoothServiceHookerKt.hookSystemBluetoothService(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$34(LocationHooker locationHooker, ClassLoader classLoader) {
        VendorRegistry.INSTANCE.installExtraHooks(locationHooker, classLoader);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 handleSystemProcessGlobal$lambda$36(LocationHooker locationHooker) {
        SystemAccelHooker systemAccelHooker = new SystemAccelHooker(locationHooker, locationHooker.restoredNativeSensorApi);
        systemAccelHooker.install();
        locationHooker.systemAccelHooker = systemAccelHooker;
        locationHooker.restoredNativeSensorApi = null;
        return mf3.a;
    }

    private final boolean handleSystemProcessScoped(String str, String str2, ClassLoader classLoader) {
        if (!o51.f(str, "com.android.systemui") && !o51.f(str, "com.android.bluetooth") && !l13.c0(str2, "com.android.bluetooth", false)) {
            if (!str2.equals("system_server") && !str2.equals("system") && !str2.equals("com.android.phone") && !str2.equals("com.android.systemui")) {
                return false;
            }
            XposedBridge.INSTANCE.log(az2.l("[LocationSpoofer] Core system process (", str, " / ", str2, ") detected, skipping environment hooks to prevent system crash."));
            BaseLocationHookerKt.hookLocationAPIs(this, classLoader, str);
            GnssStatusHookerKt.hookGnssStatus(this, classLoader);
            readConfig$xposed_globalRelease();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onHotReloaded$lambda$13(LocationHooker locationHooker, XposedModuleInterface.HotReloadedParam hotReloadedParam) {
        super.onHotReloaded(hotReloadedParam);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onHotReloaded$lambda$17(LocationHooker locationHooker, Map map, XposedModuleInterface.HotReloadedParam hotReloadedParam, HotReloadHost hotReloadHost) {
        hotReloadHost.getClass();
        locationHooker.currentPackageName = hotReloadHost.getPackageName();
        locationHooker.currentClassLoader = hotReloadHost.getClassLoader();
        HookStatus.INSTANCE.markHotReload();
        locationHooker.startFrameworkConfigReceiver();
        locationHooker.handleLoadPackage(hotReloadHost.getPackageName(), hotReloadHost.getClassLoader());
        Object obj = map != null ? map.get("callbacks") : null;
        Object[] objArr = obj instanceof Object[] ? (Object[]) obj : null;
        int i = 0;
        int i2 = 0;
        for (Object obj2 : am1.G(locationHooker.capturedLocationListeners, locationHooker.capturedAMapListeners, locationHooker.capturedBaiduListeners, locationHooker.capturedTencentListeners, locationHooker.capturedFusedLocationCallbacks)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                am1.X();
                throw null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) obj2;
            Object objX0 = objArr != null ? yo.x0(objArr, i2) : null;
            Object[] objArr2 = objX0 instanceof Object[] ? (Object[]) objX0 : null;
            if (objArr2 != null) {
                copyOnWriteArrayList.addAll(yo.v0(objArr2));
            }
            i2 = i3;
        }
        SystemLocationServiceHookerKt.restoreSystemLocationReloadState(locationHooker, map != null ? map.get("system_location") : null);
        SystemBluetoothServiceHookerKt.restoreSystemBleReloadState(locationHooker, map != null ? map.get("system_ble") : null);
        SensorStepHooker.INSTANCE.restoreReloadState$xposed_globalRelease(map != null ? map.get("sensor") : null);
        Object objX1 = objArr != null ? yo.x0(objArr, 5) : null;
        Object[] objArr3 = objX1 instanceof Object[] ? (Object[]) objX1 : null;
        if (objArr3 != null) {
            ArrayList arrayListV0 = yo.v0(objArr3);
            int size = arrayListV0.size();
            while (i < size) {
                Object obj3 = arrayListV0.get(i);
                i++;
                if (Companion.hasTypeByName(obj3.getClass(), "android.bluetooth.BluetoothAdapter$LeScanCallback")) {
                    BluetoothScanDispatcherKt.startOldLeScanTimer(locationHooker, obj3, hotReloadHost.getClassLoader());
                } else {
                    BluetoothScanDispatcherKt.startBleTimer(locationHooker, obj3, hotReloadHost.getClassLoader());
                }
            }
        }
        Log.i("LocationSpoofer", "[HotReload] Reinstalled hooks in " + hotReloadedParam.getProcessName() + "; generation=" + HookStatus.INSTANCE.getGenerationId());
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HotReloadHost resolveRunningHost(XposedModuleInterface.HotReloadedParam hotReloadedParam) {
        Object wg2Var;
        Object wg2Var2;
        Object wg2Var3;
        ClassLoader classLoader;
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
            wg2Var = objInvoke instanceof Application ? (Application) objInvoke : null;
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (wg2Var instanceof wg2) {
            wg2Var = null;
        }
        Application application = (Application) wg2Var;
        if (!hotReloadedParam.isSystemServer() && application != null) {
            String packageName = application.getPackageName();
            packageName.getClass();
            ClassLoader classLoader2 = application.getClassLoader();
            classLoader2.getClass();
            return new HotReloadHost(packageName, classLoader2);
        }
        if (!hotReloadedParam.isSystemServer()) {
            return null;
        }
        List oldHookHandles = hotReloadedParam.getOldHookHandles();
        oldHookHandles.getClass();
        Iterator it = oldHookHandles.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                try {
                    Object objInvoke2 = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class).invoke(null, "location");
                    wg2Var2 = objInvoke2 != null ? objInvoke2.getClass().getClassLoader() : null;
                } catch (Throwable th2) {
                    wg2Var2 = new wg2(th2);
                }
                if (wg2Var2 instanceof wg2) {
                    wg2Var2 = null;
                }
                ClassLoader classLoader3 = (ClassLoader) wg2Var2;
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                ClassLoader classLoader4 = LocationHooker.class.getClassLoader();
                ArrayList arrayListV0 = yo.v0(new ClassLoader[]{classLoader3, contextClassLoader, systemClassLoader, classLoader4 != null ? classLoader4.getParent() : null});
                int size = arrayListV0.size();
                while (i < size) {
                    Object obj = arrayListV0.get(i);
                    i++;
                    try {
                        wg2Var3 = ((ClassLoader) obj).loadClass("com.android.server.SystemServer").getClassLoader();
                    } catch (Throwable th3) {
                        wg2Var3 = new wg2(th3);
                    }
                    if (wg2Var3 instanceof wg2) {
                        wg2Var3 = null;
                    }
                    ClassLoader classLoader5 = (ClassLoader) wg2Var3;
                    if (classLoader5 != null) {
                        return new HotReloadHost("android", classLoader5);
                    }
                }
                return null;
            }
            Class<?> declaringClass = ((XposedInterface.HookHandle) it.next()).getExecutable().getDeclaringClass();
            if (s13.Z(declaringClass.getName(), "com.android.server.", false) && (classLoader = declaringClass.getClassLoader()) != null) {
                return new HotReloadHost("android", classLoader);
            }
        }
    }

    private final void startConfigWorker() {
        startSensorWorker();
        if (this.isConfigWorkerStarted) {
            return;
        }
        synchronized (this.pollingLock) {
            if (!this.isConfigWorkerStarted) {
                this.isConfigWorkerStarted = true;
                Thread thread = new Thread(new fi1(this, 1));
                thread.setDaemon(true);
                thread.setName("LocationSpoofer_MotionWorker");
                this.configWorker = thread;
                thread.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConfigWorker$lambda$58$lambda$56(LocationHooker locationHooker) {
        String str;
        final Thread thread;
        Handler handler;
        final LocationHooker locationHooker2 = locationHooker;
        String str2 = "";
        Thread threadCurrentThread = Thread.currentThread();
        while (locationHooker2.configWorker == threadCurrentThread && !threadCurrentThread.isInterrupted()) {
            try {
                try {
                    Thread.sleep(1000L);
                    final JSONObject config$xposed_globalRelease = locationHooker2.readConfig$xposed_globalRelease();
                    if (locationHooker2.isSystemServerProcess && !SystemWifiServiceHookerKt.isWifiServiceHooked() && locationHooker2.currentClassLoader != null) {
                        try {
                            ClassLoader classLoader = locationHooker2.currentClassLoader;
                            classLoader.getClass();
                            SystemWifiServiceHookerKt.hookSystemWifiService(locationHooker2, classLoader);
                        } catch (Throwable th) {
                            XposedBridge.INSTANCE.log("[SysWifi] Poller hookSystemWifiService error: " + th);
                        }
                    }
                    if (locationHooker2.isPhoneProcessInstance && !SystemTelephonyServiceHookerKt.isTelephonyServiceHooked() && locationHooker2.currentClassLoader != null) {
                        try {
                            ClassLoader classLoader2 = locationHooker2.currentClassLoader;
                            classLoader2.getClass();
                            SystemTelephonyServiceHookerKt.hookSystemTelephonyService(locationHooker2, classLoader2);
                        } catch (Throwable th2) {
                            XposedBridge.INSTANCE.log("[SysCell] Poller hookSystemTelephonyService error: " + th2);
                        }
                    }
                    if (locationHooker2.isBluetoothProcessInstance && !SystemBluetoothServiceHookerKt.isBluetoothServiceHooked() && locationHooker2.currentClassLoader != null) {
                        try {
                            ClassLoader classLoader3 = locationHooker2.currentClassLoader;
                            classLoader3.getClass();
                            SystemBluetoothServiceHookerKt.hookSystemBluetoothService(locationHooker2, classLoader3);
                        } catch (Throwable th3) {
                            XposedBridge.INSTANCE.log("[SysBle] Poller hookSystemBluetoothService error: " + th3);
                        }
                    }
                    if (config$xposed_globalRelease != null) {
                        if (config$xposed_globalRelease.optBoolean("active", false)) {
                            double dOptDouble = config$xposed_globalRelease.optDouble("lat", 0.0d);
                            double dOptDouble2 = config$xposed_globalRelease.optDouble("lng", 0.0d);
                            locationHooker2.lastSpoofedLat = dOptDouble;
                            locationHooker2.lastSpoofedLng = dOptDouble2;
                            String strOptString = config$xposed_globalRelease.optString("province", str2);
                            strOptString.getClass();
                            locationHooker2.cachedProvince = strOptString;
                            String strOptString2 = config$xposed_globalRelease.optString("city", str2);
                            strOptString2.getClass();
                            locationHooker2.cachedCity = strOptString2;
                            String strOptString3 = config$xposed_globalRelease.optString("district", str2);
                            strOptString3.getClass();
                            locationHooker2.cachedDistrict = strOptString3;
                            String strOptString4 = config$xposed_globalRelease.optString("street", str2);
                            strOptString4.getClass();
                            locationHooker2.cachedStreet = strOptString4;
                            String strOptString5 = config$xposed_globalRelease.optString("streetNum", str2);
                            strOptString5.getClass();
                            locationHooker2.cachedStreetNum = strOptString5;
                            String strOptString6 = config$xposed_globalRelease.optString("address", str2);
                            strOptString6.getClass();
                            locationHooker2.cachedAddress = strOptString6;
                            String strOptString7 = config$xposed_globalRelease.optString("country", str2);
                            strOptString7.getClass();
                            locationHooker2.cachedCountry = strOptString7;
                            String strOptString8 = config$xposed_globalRelease.optString("poiName", str2);
                            strOptString8.getClass();
                            locationHooker2.cachedPoiName = strOptString8;
                            final long jCurrentTimeMillis = System.currentTimeMillis();
                            final long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            RouteEngine routeEngine = RouteEngine.INSTANCE;
                            final SpoofedMotion spoofedMotionCalculateCurrentPosition = routeEngine.calculateCurrentPosition(config$xposed_globalRelease, jCurrentTimeMillis);
                            locationHooker2.lastSpoofedLat = spoofedMotionCalculateCurrentPosition.getLat();
                            locationHooker2.lastSpoofedLng = spoofedMotionCalculateCurrentPosition.getLng();
                            if (!l13.A0(locationHooker2.currentPackageName, ":").equals(SelfHostedUpdates.APPLICATION_ID)) {
                                final ClassLoader classLoader4 = locationHooker2.currentClassLoader;
                                final int size = locationHooker2.capturedLocationListeners.size();
                                final int size2 = locationHooker2.capturedAMapListeners.size();
                                final int size3 = locationHooker2.capturedBaiduListeners.size();
                                final int size4 = locationHooker2.capturedTencentListeners.size();
                                final int size5 = locationHooker2.capturedFusedLocationCallbacks.size();
                                final boolean z = ((double) spoofedMotionCalculateCurrentPosition.getSpeed()) <= 0.05d;
                                i52 appTargetCoordinate = CoordinateConverterKt.getAppTargetCoordinate(locationHooker2, spoofedMotionCalculateCurrentPosition.getLat(), spoofedMotionCalculateCurrentPosition.getLng(), config$xposed_globalRelease, "WGS-84");
                                double dDoubleValue = ((Number) appTargetCoordinate.e).doubleValue();
                                double dDoubleValue2 = ((Number) appTargetCoordinate.f).doubleValue();
                                double dDoubleValue3 = z ? dDoubleValue : ((Number) CoordinateConverterKt.getJitteredLocation(locationHooker2, dDoubleValue, dDoubleValue2).e).doubleValue();
                                if (!z) {
                                    dDoubleValue2 = ((Number) CoordinateConverterKt.getJitteredLocation(locationHooker2, dDoubleValue, dDoubleValue2).f).doubleValue();
                                }
                                final double d = dDoubleValue2;
                                final float speed = spoofedMotionCalculateCurrentPosition.getSpeed();
                                final float bearing = spoofedMotionCalculateCurrentPosition.getBearing();
                                float jitteredAccuracy = z ? 2.5f : CoordinateConverterKt.getJitteredAccuracy(locationHooker2);
                                final double dRealisticAltitude$default = RouteEngine.realisticAltitude$default(routeEngine, config$xposed_globalRelease, 0L, 2, null);
                                try {
                                    handler = new Handler(Looper.getMainLooper());
                                } catch (Throwable unused) {
                                    handler = null;
                                }
                                Handler handler2 = handler;
                                final double d2 = dDoubleValue3;
                                str = str2;
                                Thread thread2 = threadCurrentThread;
                                final float f = jitteredAccuracy;
                                thread = thread2;
                                try {
                                    Runnable runnable = new Runnable() { // from class: hi1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            LocationHooker.startConfigWorker$lambda$58$lambda$56$lambda$55(this.e, thread, size, classLoader4, d2, d, f, speed, bearing, dRealisticAltitude$default, jCurrentTimeMillis, jElapsedRealtimeNanos, size5, size2, spoofedMotionCalculateCurrentPosition, config$xposed_globalRelease, z, size3, size4);
                                        }
                                    };
                                    if (handler2 != null) {
                                        handler2.post(runnable);
                                    } else {
                                        runnable.run();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    XposedBridge.INSTANCE.log("ConfigWorker error: " + th.getClass().getSimpleName() + ": " + th.getMessage());
                                }
                                locationHooker2 = locationHooker;
                                threadCurrentThread = thread;
                                str2 = str;
                            }
                        }
                    }
                    locationHooker2 = locationHooker;
                } catch (InterruptedException unused2) {
                    return;
                }
            } catch (Throwable th5) {
                th = th5;
                str = str2;
                thread = threadCurrentThread;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:294:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0184  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 4 */
    public static final void startConfigWorker$lambda$58$lambda$56$lambda$55(LocationHooker locationHooker, Thread thread, int i, ClassLoader classLoader, double d, double d2, final float f, final float f2, final float f3, double d3, final long j, long j2, int i2, int i3, SpoofedMotion spoofedMotion, JSONObject jSONObject, boolean z, int i4, int i5) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer num;
        Object obj;
        Iterator it;
        double d4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Iterator it2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Object obj2;
        Object obj3;
        boolean z2;
        boolean z3;
        if (locationHooker.configWorker != thread) {
            return;
        }
        String str26 = "satellites_used_in_fix";
        String str27 = "satellites_in_view";
        String str28 = "satellites";
        String str29 = "android.location.Location";
        String str30 = "satellite_count";
        String str31 = "setElapsedRealtimeNanos";
        Integer num2 = 0;
        Object obj4 = "bd09ll";
        String str32 = "onLocationChanged";
        String str33 = "setTime";
        String str34 = "setIsFromMockProvider";
        String str35 = "setExtras";
        String str36 = "mockLocation";
        if (i <= 0 || classLoader == null) {
            str = "setTime";
            str2 = "satellites_in_view";
            str3 = "android.location.Location";
            str4 = "setElapsedRealtimeNanos";
            str5 = "satellites_visible";
        } else {
            str5 = "satellites_visible";
            Iterator it3 = zy.J0(locationHooker.capturedLocationListeners).iterator();
            while (it3.hasNext()) {
                Iterator it4 = it3;
                Object next = it4.next();
                try {
                    ClassLoader classLoader2 = next.getClass().getClassLoader();
                    Object objNewInstance = Class.forName(str29, false, classLoader2 == null ? classLoader : classLoader2).getConstructor(String.class).newInstance("gps");
                    XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
                    objNewInstance.getClass();
                    str19 = str29;
                    try {
                        xposedHelpers.callMethod(objNewInstance, "setLatitude", Double.valueOf(d));
                        xposedHelpers.callMethod(objNewInstance, "setLongitude", Double.valueOf(d2));
                        xposedHelpers.callMethod(objNewInstance, "setAccuracy", Float.valueOf(f));
                        xposedHelpers.callMethod(objNewInstance, "setSpeed", Float.valueOf(f2));
                        xposedHelpers.callMethod(objNewInstance, "setBearing", Float.valueOf(f3));
                        xposedHelpers.callMethod(objNewInstance, "setAltitude", Double.valueOf(d3));
                        xposedHelpers.callMethod(objNewInstance, str33, Long.valueOf(j));
                        xposedHelpers.callMethod(objNewInstance, str31, Long.valueOf(j2));
                        try {
                            Bundle bundle = new Bundle();
                            str33 = str33;
                            str20 = str31;
                            try {
                                int iOptInt = jSONObject.optInt("satellite_count", 20);
                                bundle.putInt("satellites", iOptInt);
                                bundle.putInt(str27, iOptInt);
                                bundle.putInt(str26, iOptInt < 12 ? 12 : iOptInt);
                                str25 = str5;
                                try {
                                    bundle.putInt(str25, iOptInt);
                                    str36 = str36;
                                    str24 = str26;
                                    try {
                                        bundle.putBoolean(str36, false);
                                        Object[] objArr = {bundle};
                                        str35 = str35;
                                        try {
                                            xposedHelpers.callMethod(objNewInstance, str35, objArr);
                                        } catch (Throwable unused) {
                                        }
                                    } catch (Throwable unused2) {
                                        str35 = str35;
                                    }
                                } catch (Throwable unused3) {
                                    str24 = str26;
                                }
                            } catch (Throwable unused4) {
                                str25 = str5;
                                str24 = str26;
                                str5 = str25;
                                str22 = str34;
                                XposedHelpers.INSTANCE.callMethod(objNewInstance, str22, Boolean.FALSE);
                                Object[] objArr2 = {objNewInstance};
                                String str37 = str32;
                                str23 = str36;
                                str21 = str37;
                                obj2 = objNewInstance;
                                obj3 = next;
                                XposedHelpers.INSTANCE.callMethod(obj3, str21, objArr2);
                                z2 = true;
                                if (z2) {
                                    str27 = str27;
                                    z3 = z2;
                                } else {
                                    try {
                                        str27 = str27;
                                        try {
                                            XposedHelpers.INSTANCE.callMethod(obj3, "accept", obj2);
                                            z3 = true;
                                        } catch (Throwable unused5) {
                                            z3 = z2;
                                        }
                                    } catch (Throwable unused6) {
                                        str27 = str27;
                                    }
                                }
                                if (!z3) {
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(obj3, str21, am1.F(obj2));
                                    } catch (Throwable unused7) {
                                    }
                                }
                                it3 = it4;
                                str35 = str35;
                                str34 = str22;
                                str26 = str24;
                                str27 = str27;
                                str31 = str20;
                                str29 = str19;
                                str36 = str23;
                                str32 = str21;
                                str33 = str33;
                            }
                        } catch (Throwable unused8) {
                            str33 = str33;
                            str20 = str31;
                        }
                        try {
                            str5 = str25;
                            str22 = str34;
                            try {
                                XposedHelpers.INSTANCE.callMethod(objNewInstance, str22, Boolean.FALSE);
                            } catch (Throwable unused9) {
                            }
                        } catch (Throwable unused10) {
                            str5 = str25;
                            str22 = str34;
                        }
                        try {
                            Object[] objArr3 = {objNewInstance};
                            String str38 = str32;
                            str23 = str36;
                            str21 = str38;
                            obj2 = objNewInstance;
                            obj3 = next;
                            try {
                                XposedHelpers.INSTANCE.callMethod(obj3, str21, objArr3);
                                z2 = true;
                            } catch (Throwable unused11) {
                                z2 = false;
                            }
                        } catch (Throwable unused12) {
                            String str39 = str32;
                            str23 = str36;
                            str21 = str39;
                            obj2 = objNewInstance;
                            obj3 = next;
                        }
                        if (z2) {
                            str27 = str27;
                            XposedHelpers.INSTANCE.callMethod(obj3, "accept", obj2);
                            z3 = true;
                        } else {
                            str27 = str27;
                            z3 = z2;
                        }
                        if (!z3) {
                            XposedHelpers.INSTANCE.callMethod(obj3, str21, am1.F(obj2));
                        }
                    } catch (Throwable unused13) {
                        str20 = str31;
                        str21 = str32;
                        str22 = str34;
                        str35 = str35;
                        str23 = str36;
                        str24 = str26;
                    }
                } catch (Throwable unused14) {
                    str19 = str29;
                }
                it3 = it4;
                str35 = str35;
                str34 = str22;
                str26 = str24;
                str27 = str27;
                str31 = str20;
                str29 = str19;
                str36 = str23;
                str32 = str21;
                str33 = str33;
            }
            str = str33;
            str2 = str27;
            str3 = str29;
            str4 = str31;
        }
        String str40 = str32;
        String str41 = str34;
        String str42 = str35;
        String str43 = str36;
        String str44 = str26;
        if (i2 > 0 && classLoader != null) {
            Iterator it5 = zy.J0(locationHooker.capturedFusedLocationCallbacks).iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                try {
                    ClassLoader classLoader3 = next2.getClass().getClassLoader();
                    if (classLoader3 == null) {
                        classLoader3 = classLoader;
                    }
                    str14 = str40;
                    it2 = it5;
                    String str45 = str3;
                    try {
                        Object objNewInstance2 = Class.forName(str45, false, classLoader3).getConstructor(String.class).newInstance("gps");
                        XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
                        objNewInstance2.getClass();
                        str3 = str45;
                        try {
                            xposedHelpers2.callMethod(objNewInstance2, "setLatitude", Double.valueOf(d));
                            xposedHelpers2.callMethod(objNewInstance2, "setLongitude", Double.valueOf(d2));
                            xposedHelpers2.callMethod(objNewInstance2, "setAccuracy", Float.valueOf(f));
                            xposedHelpers2.callMethod(objNewInstance2, "setSpeed", Float.valueOf(f2));
                            xposedHelpers2.callMethod(objNewInstance2, "setBearing", Float.valueOf(f3));
                            xposedHelpers2.callMethod(objNewInstance2, "setAltitude", Double.valueOf(d3));
                            str15 = str28;
                            str16 = str;
                            try {
                                xposedHelpers2.callMethod(objNewInstance2, str16, Long.valueOf(j));
                                str17 = str30;
                                str18 = str4;
                                try {
                                    xposedHelpers2.callMethod(objNewInstance2, str18, Long.valueOf(j2));
                                    try {
                                        xposedHelpers2.callMethod(objNewInstance2, str41, Boolean.FALSE);
                                    } catch (Throwable unused15) {
                                    }
                                    Class<?> cls = Class.forName("com.google.android.gms.location.LocationResult", false, classLoader3);
                                    List listSingletonList = Collections.singletonList(objNewInstance2);
                                    XposedHelpers xposedHelpers3 = XposedHelpers.INSTANCE;
                                    cls.getClass();
                                    xposedHelpers3.callMethod(next2, "onLocationResult", xposedHelpers3.callStaticMethod(cls, "create", listSingletonList));
                                } catch (Throwable unused16) {
                                }
                            } catch (Throwable unused17) {
                                str17 = str30;
                                str18 = str4;
                            }
                        } catch (Throwable unused18) {
                            str15 = str28;
                            str16 = str;
                            str17 = str30;
                            str18 = str4;
                            it5 = it2;
                            str4 = str18;
                            str40 = str14;
                            str30 = str17;
                            str = str16;
                            str28 = str15;
                        }
                    } catch (Throwable unused19) {
                        str3 = str45;
                    }
                } catch (Throwable unused20) {
                    str14 = str40;
                    it2 = it5;
                }
                it5 = it2;
                str4 = str18;
                str40 = str14;
                str30 = str17;
                str = str16;
                str28 = str15;
            }
        }
        String str46 = str40;
        String str47 = str28;
        String str48 = str;
        String str49 = str30;
        String str50 = str4;
        if (i3 <= 0 || classLoader == null) {
            str6 = str48;
            str7 = str46;
        } else {
            String str51 = str42;
            String str52 = str41;
            String str53 = str50;
            String str54 = str46;
            String str55 = str44;
            String str56 = str2;
            str6 = str48;
            String str57 = str43;
            i52 appTargetCoordinate = CoordinateConverterKt.getAppTargetCoordinate(locationHooker, spoofedMotion.getLat(), spoofedMotion.getLng(), jSONObject, "GCJ-02");
            double dDoubleValue = ((Number) appTargetCoordinate.e).doubleValue();
            double dDoubleValue2 = ((Number) appTargetCoordinate.f).doubleValue();
            double dDoubleValue3 = z ? dDoubleValue : ((Number) CoordinateConverterKt.getJitteredLocation(locationHooker, dDoubleValue, dDoubleValue2).e).doubleValue();
            if (!z) {
                dDoubleValue2 = ((Number) CoordinateConverterKt.getJitteredLocation(locationHooker, dDoubleValue, dDoubleValue2).f).doubleValue();
            }
            Iterator it6 = zy.J0(locationHooker.capturedAMapListeners).iterator();
            while (it6.hasNext()) {
                Object next3 = it6.next();
                try {
                    ClassLoader classLoader4 = next3.getClass().getClassLoader();
                    if (classLoader4 == null) {
                        classLoader4 = classLoader;
                    }
                    Object objNewInstance3 = Class.forName("com.amap.api.location.AMapLocation", false, classLoader4).getConstructor(String.class).newInstance("gps");
                    XposedHelpers xposedHelpers4 = XposedHelpers.INSTANCE;
                    objNewInstance3.getClass();
                    xposedHelpers4.callMethod(objNewInstance3, "setLatitude", Double.valueOf(dDoubleValue3));
                    xposedHelpers4.callMethod(objNewInstance3, "setLongitude", Double.valueOf(dDoubleValue2));
                    xposedHelpers4.callMethod(objNewInstance3, "setAccuracy", Float.valueOf(f));
                    xposedHelpers4.callMethod(objNewInstance3, "setSpeed", Float.valueOf(f2));
                    xposedHelpers4.callMethod(objNewInstance3, "setBearing", Float.valueOf(f3));
                    xposedHelpers4.callMethod(objNewInstance3, "setAltitude", Double.valueOf(d3));
                    xposedHelpers4.callMethod(objNewInstance3, str6, Long.valueOf(j));
                    it = it6;
                    d4 = dDoubleValue2;
                    str49 = str49;
                    try {
                        xposedHelpers4.callMethod(objNewInstance3, "setSatellites", Integer.valueOf(jSONObject.optInt(str49, 20)));
                        xposedHelpers4.callMethod(objNewInstance3, "setGpsAccuracyStatus", 1);
                        xposedHelpers4.callMethod(objNewInstance3, "setLocationType", 1);
                    } catch (Throwable unused21) {
                    }
                    try {
                        Bundle bundle2 = new Bundle();
                        int iOptInt2 = jSONObject.optInt(str49, 20);
                        bundle2.putInt(str47, iOptInt2);
                        bundle2.putInt(str56, iOptInt2);
                        String str58 = str55;
                        try {
                            bundle2.putInt(str58, iOptInt2 >= 12 ? iOptInt2 : 12);
                            str10 = str5;
                            try {
                                bundle2.putInt(str10, iOptInt2);
                                str57 = str57;
                                str12 = str58;
                                try {
                                    bundle2.putBoolean(str57, false);
                                    str49 = str49;
                                    str51 = str51;
                                    try {
                                        XposedHelpers.INSTANCE.callMethod(objNewInstance3, str51, bundle2);
                                    } catch (Throwable unused22) {
                                    }
                                } catch (Throwable unused23) {
                                    str49 = str49;
                                    str51 = str51;
                                }
                            } catch (Throwable unused24) {
                                str12 = str58;
                            }
                        } catch (Throwable unused25) {
                            str10 = str5;
                        }
                    } catch (Throwable unused26) {
                        str49 = str49;
                        str51 = str51;
                        str57 = str57;
                        str10 = str5;
                        str12 = str55;
                    }
                    try {
                        str51 = str51;
                        str13 = str53;
                        try {
                            XposedHelpers.INSTANCE.callMethod(objNewInstance3, str13, Long.valueOf(j2));
                        } catch (Throwable unused27) {
                        }
                    } catch (Throwable unused28) {
                        str51 = str51;
                        str13 = str53;
                    }
                    try {
                        str53 = str13;
                        str9 = str52;
                        try {
                            XposedHelpers.INSTANCE.callMethod(objNewInstance3, str9, Boolean.FALSE);
                        } catch (Throwable unused29) {
                        }
                    } catch (Throwable unused30) {
                        str53 = str13;
                        str9 = str52;
                    }
                    try {
                        str11 = str54;
                        try {
                            XposedHelpers.INSTANCE.callMethod(next3, str11, objNewInstance3);
                        } catch (Throwable unused31) {
                        }
                    } catch (Throwable unused32) {
                        str11 = str54;
                    }
                } catch (Throwable unused33) {
                    it = it6;
                    d4 = dDoubleValue2;
                    str9 = str52;
                    str57 = str57;
                    str10 = str5;
                    str11 = str54;
                    str12 = str55;
                }
                it6 = it;
                str54 = str11;
                str52 = str9;
                str5 = str10;
                str55 = str12;
                dDoubleValue2 = d4;
                str57 = str57;
            }
            str7 = str54;
        }
        if (i4 <= 0 || classLoader == null) {
            str8 = str7;
        } else {
            str8 = str7;
            i52 appTargetCoordinate2 = CoordinateConverterKt.getAppTargetCoordinate(locationHooker, spoofedMotion.getLat(), spoofedMotion.getLng(), jSONObject, "BD-09");
            double dDoubleValue4 = ((Number) appTargetCoordinate2.e).doubleValue();
            double dDoubleValue5 = ((Number) appTargetCoordinate2.f).doubleValue();
            double dDoubleValue6 = z ? dDoubleValue4 : ((Number) CoordinateConverterKt.getJitteredLocation(locationHooker, dDoubleValue4, dDoubleValue5).e).doubleValue();
            if (!z) {
                dDoubleValue5 = ((Number) CoordinateConverterKt.getJitteredLocation(locationHooker, dDoubleValue4, dDoubleValue5).f).doubleValue();
            }
            Iterator it7 = zy.J0(locationHooker.capturedBaiduListeners).iterator();
            while (it7.hasNext()) {
                Object next4 = it7.next();
                try {
                    ClassLoader classLoader5 = next4.getClass().getClassLoader();
                    if (classLoader5 == null) {
                        classLoader5 = classLoader;
                    }
                    Object objNewInstance4 = Class.forName("com.baidu.location.BDLocation", false, classLoader5).getConstructor(null).newInstance(null);
                    XposedHelpers xposedHelpers5 = XposedHelpers.INSTANCE;
                    objNewInstance4.getClass();
                    xposedHelpers5.callMethod(objNewInstance4, "setLatitude", Double.valueOf(dDoubleValue6));
                    xposedHelpers5.callMethod(objNewInstance4, "setLongitude", Double.valueOf(dDoubleValue5));
                    try {
                        xposedHelpers5.setDoubleField(objNewInstance4, "mLatitude", dDoubleValue6);
                    } catch (Throwable unused34) {
                    }
                    try {
                        XposedHelpers.INSTANCE.setDoubleField(objNewInstance4, "mLongitude", dDoubleValue5);
                    } catch (Throwable unused35) {
                    }
                    try {
                        XposedHelpers.INSTANCE.callMethod(objNewInstance4, "setCoorType", obj4);
                    } catch (Throwable unused36) {
                    }
                    try {
                        obj = obj4;
                        try {
                            XposedHelpers.INSTANCE.setObjectField(objNewInstance4, "mCoorType", obj);
                        } catch (Throwable unused37) {
                        }
                    } catch (Throwable unused38) {
                        obj = obj4;
                    }
                    try {
                        XposedHelpers xposedHelpers6 = XposedHelpers.INSTANCE;
                        xposedHelpers6.callMethod(objNewInstance4, "setRadius", Float.valueOf(f));
                        xposedHelpers6.callMethod(objNewInstance4, "setSpeed", Float.valueOf(3.6f * f2));
                        xposedHelpers6.callMethod(objNewInstance4, "setDirection", Float.valueOf(f3));
                        xposedHelpers6.callMethod(objNewInstance4, "setLocType", 61);
                        try {
                            xposedHelpers6.callMethod(objNewInstance4, "setSatelliteNumber", 20);
                            xposedHelpers6.callMethod(objNewInstance4, "setGpsCheckStatus", 1);
                            try {
                                xposedHelpers6.callMethod(objNewInstance4, "setMockGps", null);
                            } catch (Throwable unused39) {
                            }
                            try {
                                it7 = it7;
                                try {
                                    XposedHelpers.INSTANCE.callMethod(objNewInstance4, str6, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()));
                                } catch (Throwable unused40) {
                                }
                            } catch (Throwable unused41) {
                                it7 = it7;
                            }
                            try {
                                XposedHelpers.INSTANCE.callMethod(next4, "onReceiveLocation", objNewInstance4);
                            } catch (Throwable unused42) {
                            }
                        } catch (Throwable unused43) {
                            it7 = it7;
                        }
                    } catch (Throwable unused44) {
                    }
                } catch (Throwable unused45) {
                    obj = obj4;
                }
                it7 = it7;
                obj4 = obj;
            }
        }
        if (i5 <= 0 || classLoader == null) {
            return;
        }
        try {
            i52 appTargetCoordinate3 = CoordinateConverterKt.getAppTargetCoordinate(locationHooker, spoofedMotion.getLat(), spoofedMotion.getLng(), jSONObject, "GCJ-02");
            double dDoubleValue7 = ((Number) appTargetCoordinate3.e).doubleValue();
            double dDoubleValue8 = ((Number) appTargetCoordinate3.f).doubleValue();
            final double dDoubleValue9 = z ? dDoubleValue7 : ((Number) CoordinateConverterKt.getJitteredLocation(locationHooker, dDoubleValue7, dDoubleValue8).e).doubleValue();
            if (!z) {
                dDoubleValue8 = ((Number) CoordinateConverterKt.getJitteredLocation(locationHooker, dDoubleValue7, dDoubleValue8).f).doubleValue();
            }
            final double d5 = dDoubleValue8;
            Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{Class.forName("com.tencent.map.geolocation.TencentLocation", false, classLoader)}, new InvocationHandler() { // from class: gi1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj5, Method method, Object[] objArr4) {
                    return LocationHooker.startConfigWorker$lambda$58$lambda$56$lambda$55$lambda$54(dDoubleValue9, d5, f, f2, f3, j, obj5, method, objArr4);
                }
            });
            for (Object obj5 : zy.J0(locationHooker.capturedTencentListeners)) {
                try {
                    XposedHelpers xposedHelpers7 = XposedHelpers.INSTANCE;
                    obj5.getClass();
                    num = num2;
                    try {
                        xposedHelpers7.callMethod(obj5, str8, objNewProxyInstance, num, "ok");
                    } catch (Throwable unused46) {
                    }
                } catch (Throwable unused47) {
                    num = num2;
                }
                num2 = num;
            }
        } catch (Throwable unused48) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object startConfigWorker$lambda$58$lambda$56$lambda$55$lambda$54(double d, double d2, float f, float f2, float f3, long j, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name == null) {
            return null;
        }
        switch (name.hashCode()) {
            case -75121853:
                if (name.equals("getTime")) {
                    return Long.valueOf(j);
                }
                return null;
            case -53807505:
                if (name.equals("getAccuracy")) {
                    return Float.valueOf(f);
                }
                return null;
            case 127761145:
                if (name.equals("getLongitude")) {
                    return Double.valueOf(d2);
                }
                return null;
            case 637921762:
                if (name.equals("getLatitude")) {
                    return Double.valueOf(d);
                }
                return null;
            case 802534264:
                if (name.equals("getBearing")) {
                    return Float.valueOf(f3);
                }
                return null;
            case 1090405223:
                if (name.equals("getProvider")) {
                    return "gps";
                }
                return null;
            case 1965467281:
                if (name.equals("getSpeed")) {
                    return Float.valueOf(f2);
                }
                return null;
            default:
                return null;
        }
    }

    private final void startFrameworkConfigReceiver() {
        if (this.configReceiver != null) {
            return;
        }
        ei1 ei1Var = new ei1(this, 1);
        final int i = 0;
        lu0 lu0Var = new lu0(this) { // from class: ki1
            public final /* synthetic */ LocationHooker f;

            {
                this.f = this;
            }

            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                int i2 = i;
                LocationHooker locationHooker = this.f;
                switch (i2) {
                    case 0:
                        return LocationHooker.startFrameworkConfigReceiver$lambda$43(locationHooker, (String) obj);
                    default:
                        return LocationHooker.startFrameworkConfigReceiver$lambda$44(locationHooker, (FrameworkConfigSnapshot) obj);
                }
            }
        };
        final int i2 = 1;
        FrameworkConfigReceiver frameworkConfigReceiver = new FrameworkConfigReceiver(ei1Var, lu0Var, new lu0(this) { // from class: ki1
            public final /* synthetic */ LocationHooker f;

            {
                this.f = this;
            }

            @Override // defpackage.lu0
            public final Object invoke(Object obj) {
                int i3 = i2;
                LocationHooker locationHooker = this.f;
                switch (i3) {
                    case 0:
                        return LocationHooker.startFrameworkConfigReceiver$lambda$43(locationHooker, (String) obj);
                    default:
                        return LocationHooker.startFrameworkConfigReceiver$lambda$44(locationHooker, (FrameworkConfigSnapshot) obj);
                }
            }
        }, new zs0(27), new vk2(3, AnonymousClass5.INSTANCE));
        frameworkConfigReceiver.start();
        this.configReceiver = frameworkConfigReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences startFrameworkConfigReceiver$lambda$41(LocationHooker locationHooker) {
        SharedPreferences remotePreferences = locationHooker.getRemotePreferences("locationspoofer_config");
        remotePreferences.getClass();
        return remotePreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String startFrameworkConfigReceiver$lambda$43(LocationHooker locationHooker, String str) throws IOException {
        str.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ParcelFileDescriptor.AutoCloseInputStream(locationHooker.openRemoteFile(str)), sw.a), 8192);
        try {
            String strF = l93.f(bufferedReader);
            bufferedReader.close();
            return strF;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ji2.z(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 startFrameworkConfigReceiver$lambda$44(LocationHooker locationHooker, FrameworkConfigSnapshot frameworkConfigSnapshot) throws JSONException {
        frameworkConfigSnapshot.getClass();
        JSONObject jSONObjectNormalizeConfig$xposed_globalRelease = locationHooker.normalizeConfig$xposed_globalRelease(frameworkConfigSnapshot.getConfig());
        locationHooker.lastConfig = jSONObjectNormalizeConfig$xposed_globalRelease;
        HookStatus.INSTANCE.configLoaded(frameworkConfigSnapshot.getSource(), frameworkConfigSnapshot.getPublishedAt());
        locationHooker.logOpenCellConfigLoaded$xposed_globalRelease(frameworkConfigSnapshot.getSource(), jSONObjectNormalizeConfig$xposed_globalRelease);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 startFrameworkConfigReceiver$lambda$45(Exception exc) {
        exc.getClass();
        XposedBridge.INSTANCE.log("[Config] Framework receive failed: " + exc.getClass().getSimpleName() + ": " + exc.getMessage());
        return mf3.a;
    }

    private final void startSensorWorker() {
        synchronized (this.pollingLock) {
            if (this.sensorWorker == null && !this.retiringGeneration) {
                Thread thread = new Thread(new fi1(this, 0));
                thread.setDaemon(true);
                thread.setName("LocationSpoofer_SensorWorker");
                this.sensorWorker = thread;
                thread.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSensorWorker$lambda$51$lambda$49(LocationHooker locationHooker) {
        long j;
        SystemAccelHooker systemAccelHooker;
        SystemAccelHooker systemAccelHooker2;
        ClassLoader classLoader;
        Thread threadCurrentThread = Thread.currentThread();
        while (locationHooker.sensorWorker == threadCurrentThread && !threadCurrentThread.isInterrupted()) {
            try {
                try {
                    JSONObject config$xposed_globalRelease = locationHooker.readConfig$xposed_globalRelease();
                    if (config$xposed_globalRelease != null) {
                        SensorStepHooker.INSTANCE.observeConfig(config$xposed_globalRelease);
                    }
                    SystemAccelHooker systemAccelHooker3 = locationHooker.systemAccelHooker;
                    if (systemAccelHooker3 != null) {
                        systemAccelHooker3.update(config$xposed_globalRelease);
                    }
                    boolean z = config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("active", false);
                    if (z && config$xposed_globalRelease != null && !l13.A0(locationHooker.currentPackageName, ":").equals(SelfHostedUpdates.APPLICATION_ID) && (classLoader = locationHooker.currentClassLoader) != null) {
                        SensorStepHooker.INSTANCE.dispatchStepEvents(config$xposed_globalRelease, classLoader);
                    }
                    if (!z || config$xposed_globalRelease == null || config$xposed_globalRelease.optDouble("speed_m_s", 0.0d) <= 0.05d || !config$xposed_globalRelease.optBoolean("enable_step_simulation", true) || (SensorStepHooker.INSTANCE.getCapturedListeners().isEmpty() && ((systemAccelHooker2 = locationHooker.systemAccelHooker) == null || !systemAccelHooker2.getReady()))) {
                        j = (z && config$xposed_globalRelease != null && config$xposed_globalRelease.optBoolean("barometer_fluctuation", false) && (systemAccelHooker = locationHooker.systemAccelHooker) != null && systemAccelHooker.getReady()) ? 250L : 1000L;
                    } else {
                        j = 50;
                    }
                    Thread.sleep(j);
                } catch (Throwable th) {
                    XposedBridge.INSTANCE.logOpenCellIdEvery("SensorWorker", "SensorWorker: ".concat(th.getClass().getSimpleName()), 10000L);
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final void dumpSystemServiceInternals$xposed_globalRelease(ClassLoader classLoader) {
        ArrayList arrayList;
        classLoader.getClass();
        vk0 entries = SystemComponent.getEntries();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (((SystemComponent) obj).getProcess() == SystemProcess.SYSTEM_SERVER) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            fz.b0(arrayList3, VendorRegistry.INSTANCE.classCandidates((SystemComponent) obj2));
        }
        ArrayList arrayListX0 = zy.x0(arrayList3, am1.G("com.android.server.location.gnss.GnssLocationProvider", "com.android.server.location.gnss.GnssManagerService"));
        int size2 = arrayListX0.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            String str = (String) arrayListX0.get(i2);
            try {
                Class<?> clsLoadClass = classLoader.loadClass(str);
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                declaredMethods.getClass();
                ArrayList arrayList4 = new ArrayList(declaredMethods.length);
                for (Method method : declaredMethods) {
                    arrayList4.add(method.getName());
                }
                List listB0 = zy.B0(zy.h0(arrayList4));
                Field[] declaredFields = clsLoadClass.getDeclaredFields();
                declaredFields.getClass();
                ArrayList arrayList5 = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    arrayList5.add(field.getType().getSimpleName() + " " + field.getName());
                }
                List listB1 = zy.B0(arrayList5);
                XposedBridge xposedBridge = XposedBridge.INSTANCE;
                Class<? super Object> superclass = clsLoadClass.getSuperclass();
                arrayList = arrayListX0;
                try {
                    xposedBridge.log("[LocationSpoofer][SysDump] FOUND " + str + " (superclass=" + (superclass != null ? superclass.getName() : null) + ")\n  methods(" + listB0.size() + ")=" + zy.s0(listB0, ",", null, null, null, 62) + "\n  fields(" + listB1.size() + ")=" + zy.s0(listB1, ",", null, null, null, 62));
                } catch (ClassNotFoundException unused) {
                    XposedBridge.INSTANCE.log("[LocationSpoofer][SysDump] not found: " + str);
                } catch (Throwable th) {
                    th = th;
                    XposedBridge.INSTANCE.log("[LocationSpoofer][SysDump] error dumping " + str + ": " + th);
                }
            } catch (ClassNotFoundException unused2) {
                arrayList = arrayListX0;
            } catch (Throwable th2) {
                th = th2;
                arrayList = arrayListX0;
            }
            i2 = i3;
            arrayListX0 = arrayList;
        }
    }

    public final ConcurrentHashMap<Object, Timer> getBleScanTimers$xposed_globalRelease() {
        return this.bleScanTimers;
    }

    public final String getCachedAddress$xposed_globalRelease() {
        return this.cachedAddress;
    }

    public final String getCachedCity$xposed_globalRelease() {
        return this.cachedCity;
    }

    public final String getCachedCountry$xposed_globalRelease() {
        return this.cachedCountry;
    }

    public final String getCachedDistrict$xposed_globalRelease() {
        return this.cachedDistrict;
    }

    public final Iterable<Object> getCachedGpsSatellitesList$xposed_globalRelease() {
        return this.cachedGpsSatellitesList;
    }

    public final String getCachedPoiName$xposed_globalRelease() {
        return this.cachedPoiName;
    }

    public final String getCachedProvince$xposed_globalRelease() {
        return this.cachedProvince;
    }

    public final String getCachedStreet$xposed_globalRelease() {
        return this.cachedStreet;
    }

    public final String getCachedStreetNum$xposed_globalRelease() {
        return this.cachedStreetNum;
    }

    public final CopyOnWriteArrayList<Object> getCapturedAMapListeners$xposed_globalRelease() {
        return this.capturedAMapListeners;
    }

    public final CopyOnWriteArrayList<Object> getCapturedBaiduListeners$xposed_globalRelease() {
        return this.capturedBaiduListeners;
    }

    public final CopyOnWriteArrayList<Object> getCapturedFusedLocationCallbacks$xposed_globalRelease() {
        return this.capturedFusedLocationCallbacks;
    }

    public final CopyOnWriteArrayList<Object> getCapturedLocationListeners$xposed_globalRelease() {
        return this.capturedLocationListeners;
    }

    public final CopyOnWriteArrayList<Object> getCapturedTencentListeners$xposed_globalRelease() {
        return this.capturedTencentListeners;
    }

    public final ClassLoader getCurrentClassLoader$xposed_globalRelease() {
        return this.currentClassLoader;
    }

    public final String getCurrentPackageName$xposed_globalRelease() {
        return this.currentPackageName;
    }

    public final boolean getEnvironmentHooksInstalled$xposed_globalRelease() {
        return this.environmentHooksInstalled;
    }

    public final double getHookAccuracyDrift$xposed_globalRelease() {
        return this.hookAccuracyDrift;
    }

    public final double getHookDriftLat$xposed_globalRelease() {
        return this.hookDriftLat;
    }

    public final double getHookDriftLng$xposed_globalRelease() {
        return this.hookDriftLng;
    }

    public final long getHookLastCallTime$xposed_globalRelease() {
        return this.hookLastCallTime;
    }

    public final ConcurrentHashMap<Class<?>, Boolean> getHookedCallbackClasses$xposed_globalRelease() {
        return this.hookedCallbackClasses;
    }

    public final JSONObject getLastConfig$xposed_globalRelease() {
        return this.lastConfig;
    }

    public final double getLastGeocodedLat$xposed_globalRelease() {
        return this.lastGeocodedLat;
    }

    public final double getLastGeocodedLng$xposed_globalRelease() {
        return this.lastGeocodedLng;
    }

    public final long getLastGpsSatellitesUpdate$xposed_globalRelease() {
        return this.lastGpsSatellitesUpdate;
    }

    public final String getLastOpenCellConfigLogKey$xposed_globalRelease() {
        return this.lastOpenCellConfigLogKey;
    }

    public final double getLastSpoofedLat$xposed_globalRelease() {
        return this.lastSpoofedLat;
    }

    public final double getLastSpoofedLng$xposed_globalRelease() {
        return this.lastSpoofedLng;
    }

    public final ConcurrentHashMap<Object, Timer> getNmeaTimers$xposed_globalRelease() {
        return this.nmeaTimers;
    }

    public final boolean getRetiringGeneration$xposed_globalRelease() {
        return this.retiringGeneration;
    }

    public final Random getRng$xposed_globalRelease() {
        return this.rng;
    }

    public final long getStartTimestamp$xposed_globalRelease() {
        return this.startTimestamp;
    }

    public final SystemHookCapabilities getSystemCapabilities$xposed_globalRelease() {
        return this.systemCapabilities;
    }

    public final boolean getSystemHooksInstalled$xposed_globalRelease() {
        return this.systemHooksInstalled;
    }

    public final List<AutoCloseable> getVendorExtraHooks$xposed_globalRelease() {
        return this.vendorExtraHooks;
    }

    public final void handleLoadPackage(String str, final ClassLoader classLoader) {
        String string;
        Class<?> clsFindClass;
        str.getClass();
        classLoader.getClass();
        try {
            String strM = gh0.M(new File("/proc/self/cmdline"));
            char[] cArr = {0, ' ', '\n'};
            int length = strM.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean zI0 = yo.i0(cArr, strM.charAt(!z ? i : length));
                if (z) {
                    if (!zI0) {
                        break;
                    } else {
                        length--;
                    }
                } else if (zI0) {
                    i++;
                } else {
                    z = true;
                }
            }
            string = strM.subSequence(i, length + 1).toString();
        } catch (Exception unused) {
            string = str;
        }
        String strA0 = l13.A0(string, ":");
        if (!l13.k0(strA0) && !s13.Z(strA0, "android", false) && !strA0.equals("system_server") && !strA0.equals("system")) {
            this.currentPackageName = strA0;
        } else if (this.currentPackageName.length() == 0) {
            this.currentPackageName = str;
        }
        if (this.currentClassLoader == null || str.equals(this.currentPackageName)) {
            this.currentClassLoader = classLoader;
        }
        startConfigWorker();
        if (handleSystemProcessGlobal(str, string, classLoader)) {
            return;
        }
        if (this.environmentHooksInstalled) {
            readConfig$xposed_globalRelease();
            return;
        }
        this.environmentHooksInstalled = true;
        XposedBridge xposedBridge = XposedBridge.INSTANCE;
        xposedBridge.log("[LocationSpoofer] Hooking package: ".concat(str));
        Log.e("LocationSpoofer", "[INJECTED] Hooking package: " + str + " process=" + string);
        xposedBridge.logOpenCellId("handleLoadPackage pkg=" + str + " classLoader=" + classLoader);
        AntiDetectionHookerKt.hookAntiDetection(this, classLoader);
        BaseLocationHookerKt.hookLocationAPIs(this, classLoader, str);
        GnssStatusHookerKt.hookGnssStatus(this, classLoader);
        try {
            XposedHelpers xposedHelpers = XposedHelpers.INSTANCE;
            Class<?> clsFindClass2 = xposedHelpers.findClass("android.app.Application", classLoader);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{Context.class}[0];
            if (obj instanceof Class) {
                clsFindClass = (Class) obj;
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid argument type");
                }
                clsFindClass = xposedHelpers.findClass((String) obj, clsFindClass2.getClassLoader());
            }
            arrayList.add(clsFindClass);
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            final Method methodFindMethodExact = xposedHelpers.findMethodExact(clsFindClass2, "attachBaseContext", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            xposedHelpers.getModule().hook(methodFindMethodExact).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.LocationHooker$handleLoadPackage$$inlined$hookMethod$1
                public Object intercept(XposedInterface.Chain chain) {
                    chain.getClass();
                    List args = chain.getArgs();
                    args.getClass();
                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                    Object thisObject = chain.getThisObject();
                    Application application = thisObject instanceof Application ? (Application) thisObject : null;
                    ClassLoader classLoader2 = application != null ? application.getClassLoader() : null;
                    XposedBridge.INSTANCE.log("[LocationSpoofer] attachBaseContext fired, appClassLoader=" + classLoader2 + " sameAsInitial=" + (classLoader2 == classLoader));
                    if (classLoader2 != null) {
                        this.hookAllMapSdks$xposed_globalRelease(classLoader2);
                    }
                    return objProceed;
                }
            }).getClass();
        } catch (Throwable unused2) {
        }
        try {
            XposedHelpers xposedHelpers2 = XposedHelpers.INSTANCE;
            Class<?> clsFindClass3 = xposedHelpers2.findClass("android.app.Application", classLoader);
            Class[] clsArr2 = (Class[]) new ArrayList(0).toArray(new Class[0]);
            final Method methodFindMethodExact2 = xposedHelpers2.findMethodExact(clsFindClass3, "onCreate", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
            xposedHelpers2.getModule().hook(methodFindMethodExact2).intercept(new XposedInterface.Hooker() { // from class: com.vincenthzr.locationspoofer.xposed.LocationHooker$handleLoadPackage$$inlined$hookMethod$2
                public Object intercept(XposedInterface.Chain chain) {
                    chain.getClass();
                    List args = chain.getArgs();
                    args.getClass();
                    Object objProceed = chain.proceed(args.toArray(new Object[0]));
                    Object thisObject = chain.getThisObject();
                    Application application = thisObject instanceof Application ? (Application) thisObject : null;
                    ClassLoader classLoader2 = application != null ? application.getClassLoader() : null;
                    XposedBridge.INSTANCE.log("[LocationSpoofer] Application.onCreate fired, appClassLoader=" + classLoader2 + " sameAsInitial=" + (classLoader2 == classLoader));
                    if (classLoader2 != null) {
                        this.hookAllMapSdks$xposed_globalRelease(classLoader2);
                    }
                    return objProceed;
                }
            }).getClass();
        } catch (Throwable unused3) {
        }
        WifiScanResultHookerKt.hookWifiEnvironment$default(this, classLoader, false, 2, null);
        CellularMethodHookerKt.hookCellEnvironment$default(this, classLoader, false, 2, null);
        ConnectivityHookerKt.hookConnectivityLayer$default(this, classLoader, false, 2, null);
        BluetoothScanDispatcherKt.hookBluetoothLE$default(this, classLoader, false, 2, null);
        SensorStepHooker.INSTANCE.hookSensorStepSimulation(classLoader);
        readConfig$xposed_globalRelease();
    }

    public final void hookAllMapSdks$xposed_globalRelease(ClassLoader classLoader) {
        classLoader.getClass();
        try {
            AMapHookerKt.hookAMapSDK(this, classLoader);
        } catch (Throwable unused) {
        }
        try {
            TencentMapHookerKt.hookTencentSDK(this, classLoader);
        } catch (Throwable unused2) {
        }
        try {
            BaiduMapHookerKt.hookBaiduSDK(this, classLoader);
        } catch (Throwable unused3) {
        }
        try {
            GoogleAndAddressHookerKt.hookGoogleFusedLocation(this, classLoader);
        } catch (Throwable unused4) {
        }
    }

    public final boolean isBluetoothProcessInstance$xposed_globalRelease() {
        return this.isBluetoothProcessInstance;
    }

    public final boolean isPhoneProcessInstance$xposed_globalRelease() {
        return this.isPhoneProcessInstance;
    }

    public final boolean isSystemServerProcess$xposed_globalRelease() {
        return this.isSystemServerProcess;
    }

    public final void logOpenCellConfigLoaded$xposed_globalRelease(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cell_json");
        int length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("bluetooth_json");
        int length2 = jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.length() : 0;
        boolean zOptBoolean = jSONObject.optBoolean("active", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("mock_bluetooth", true);
        double dOptDouble = jSONObject.optDouble("lat", 0.0d);
        double dOptDouble2 = jSONObject.optDouble("lng", 0.0d);
        boolean zOptBoolean3 = jSONObject.optBoolean("system_hook_global_mode", false);
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("system_hook_packages");
        int length3 = jSONArrayOptJSONArray3 != null ? jSONArrayOptJSONArray3.length() : 0;
        StringBuilder sb = new StringBuilder();
        sb.append(zOptBoolean);
        sb.append("|");
        sb.append(zOptBoolean2);
        sb.append("|");
        sb.append(dOptDouble);
        az2.x(sb, "|", dOptDouble2, "|");
        az2.w(sb, length, "|", length2, "|");
        sb.append(zOptBoolean3);
        sb.append("|");
        sb.append(length3);
        String string = sb.toString();
        if (string.equals(this.lastOpenCellConfigLogKey)) {
            return;
        }
        this.lastOpenCellConfigLogKey = string;
        StringBuilder sb2 = new StringBuilder("[SysHook] 配置已加载[");
        sb2.append(str);
        sb2.append("]: active=");
        sb2.append(zOptBoolean);
        sb2.append(", globalMode=");
        sb2.append(zOptBoolean3);
        sb2.append(", 目标应用数=");
        sb2.append(length3);
        sb2.append(", lat=");
        sb2.append(dOptDouble);
        az2.x(sb2, ", lng=", dOptDouble2, ", 蓝牙数=");
        sb2.append(length2);
        sb2.append(", 基站数=");
        sb2.append(length);
        String string2 = sb2.toString();
        Log.i("LocationSpoofer", string2);
        XposedBridge.INSTANCE.log(string2);
    }

    public final long nativeSensorRemainingMillis$xposed_globalRelease(JSONObject jSONObject) {
        jSONObject.getClass();
        FrameworkConfigReceiver frameworkConfigReceiver = this.configReceiver;
        if (frameworkConfigReceiver != null) {
            return frameworkConfigReceiver.remainingValidityMillis(jSONObject);
        }
        return 0L;
    }

    public final JSONObject normalizeConfig$xposed_globalRelease(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        if (!jSONObject.has("wifi_json")) {
            jSONObject.put("wifi_json", new JSONArray());
        }
        double dOptDouble = jSONObject.optDouble("lat", 0.0d);
        double dOptDouble2 = jSONObject.optDouble("lng", 0.0d);
        i52 i52VarGcj02ToBd09 = CoordinateConverterKt.gcj02ToBd09(this, dOptDouble, dOptDouble2);
        jSONObject.put("bd09_lat", ((Number) i52VarGcj02ToBd09.e).doubleValue());
        jSONObject.put("bd09_lng", ((Number) i52VarGcj02ToBd09.f).doubleValue());
        i52 i52VarGcj02ToWgs84 = CoordinateConverterKt.gcj02ToWgs84(this, dOptDouble, dOptDouble2);
        jSONObject.put("wgs84_lat", ((Number) i52VarGcj02ToWgs84.e).doubleValue());
        jSONObject.put("wgs84_lng", ((Number) i52VarGcj02ToWgs84.f).doubleValue());
        return jSONObject;
    }

    public void onHotReloaded(final XposedModuleInterface.HotReloadedParam hotReloadedParam) {
        hotReloadedParam.getClass();
        Object savedInstanceState = hotReloadedParam.getSavedInstanceState();
        Map map = savedInstanceState instanceof Map ? (Map) savedInstanceState : null;
        Object obj = map != null ? map.get("native_sensor_api") : null;
        Class<?> cls = obj instanceof Class ? (Class) obj : null;
        if (cls == null || !cls.getName().equals("com.vincenthzr.locationspoofer.xposed.hooks.SystemAccelNative")) {
            cls = null;
        }
        this.restoredNativeSensorApi = cls;
        final int i = 0;
        final int i2 = 1;
        HotReloadHostKt.reinstallAfterHotReload(map != null ? map.get("host") : null, new au0(this) { // from class: ii1
            public final /* synthetic */ LocationHooker f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int i3 = i;
                LocationHooker locationHooker = this.f;
                XposedModuleInterface.HotReloadedParam hotReloadedParam2 = hotReloadedParam;
                switch (i3) {
                    case 0:
                        return locationHooker.resolveRunningHost(hotReloadedParam2);
                    default:
                        return LocationHooker.onHotReloaded$lambda$13(locationHooker, hotReloadedParam2);
                }
            }
        }, new au0(this) { // from class: ii1
            public final /* synthetic */ LocationHooker f;

            {
                this.f = this;
            }

            @Override // defpackage.au0
            public final Object invoke() {
                int i3 = i2;
                LocationHooker locationHooker = this.f;
                XposedModuleInterface.HotReloadedParam hotReloadedParam2 = hotReloadedParam;
                switch (i3) {
                    case 0:
                        return locationHooker.resolveRunningHost(hotReloadedParam2);
                    default:
                        return LocationHooker.onHotReloaded$lambda$13(locationHooker, hotReloadedParam2);
                }
            }
        }, new ji1(this, map, hotReloadedParam, i));
    }

    public boolean onHotReloading(XposedModuleInterface.HotReloadingParam hotReloadingParam) throws InterruptedException {
        Class<?> clsSaveApi;
        ArrayList arrayListV0;
        hotReloadingParam.getClass();
        ClassLoader classLoader = this.currentClassLoader;
        if (classLoader == null || l13.k0(this.currentPackageName)) {
            return false;
        }
        i52 i52Var = new i52("host", new HotReloadHost(this.currentPackageName, classLoader).save());
        Object[] array = this.capturedLocationListeners.toArray(new Object[0]);
        Object[] array2 = this.capturedAMapListeners.toArray(new Object[0]);
        Object[] array3 = this.capturedBaiduListeners.toArray(new Object[0]);
        Object[] array4 = this.capturedTencentListeners.toArray(new Object[0]);
        Object[] array5 = this.capturedFusedLocationCallbacks.toArray(new Object[0]);
        Set<Object> setKeySet = this.bleScanTimers.keySet();
        setKeySet.getClass();
        i52 i52Var2 = new i52("callbacks", new Object[][]{array, array2, array3, array4, array5, setKeySet.toArray(new Object[0])});
        i52 i52Var3 = new i52("system_location", SystemLocationServiceHookerKt.saveSystemLocationReloadState());
        i52 i52Var4 = new i52("system_ble", SystemBluetoothServiceHookerKt.saveSystemBleReloadState());
        i52 i52Var5 = new i52("sensor", SensorStepHooker.INSTANCE.saveReloadState$xposed_globalRelease());
        SystemAccelHooker systemAccelHooker = this.systemAccelHooker;
        if (systemAccelHooker == null || (clsSaveApi = systemAccelHooker.saveApi()) == null) {
            clsSaveApi = Void.class;
        }
        i52[] i52VarArr = {i52Var, i52Var2, i52Var3, i52Var4, i52Var5, new i52("native_sensor_api", clsSaveApi)};
        HashMap map = new HashMap(jq1.M(6));
        jq1.P(map, i52VarArr);
        hotReloadingParam.setSavedInstanceState(map);
        this.retiringGeneration = true;
        synchronized (this.pollingLock) {
            arrayListV0 = yo.v0(new Thread[]{this.configWorker, this.sensorWorker});
            this.configWorker = null;
            this.sensorWorker = null;
            this.isConfigWorkerStarted = false;
            int size = arrayListV0.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListV0.get(i);
                i++;
                ((Thread) obj).interrupt();
            }
        }
        int size2 = arrayListV0.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayListV0.get(i2);
            i2++;
            ((Thread) obj2).join(2000L);
        }
        if (!arrayListV0.isEmpty()) {
            int size3 = arrayListV0.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayListV0.get(i3);
                i3++;
                if (((Thread) obj3).isAlive()) {
                    this.retiringGeneration = false;
                    startConfigWorker();
                    return false;
                }
            }
        }
        SystemAccelHooker systemAccelHooker2 = this.systemAccelHooker;
        if (systemAccelHooker2 != null) {
            systemAccelHooker2.close();
        }
        this.systemAccelHooker = null;
        FrameworkConfigReceiver frameworkConfigReceiver = this.configReceiver;
        if (frameworkConfigReceiver != null) {
            frameworkConfigReceiver.close();
        }
        this.configReceiver = null;
        this.lastConfig = null;
        Set<Timer> set = this.ownedReloadTimers;
        set.getClass();
        synchronized (set) {
            try {
                Set<Timer> set2 = this.ownedReloadTimers;
                set2.getClass();
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    ((Timer) it.next()).cancel();
                }
                this.ownedReloadTimers.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        List<AutoCloseable> list = this.vendorExtraHooks;
        list.getClass();
        Iterator it2 = new eh2(list).iterator();
        while (true) {
            dh2 dh2Var = (dh2) it2;
            if (!((ListIterator) dh2Var.f).hasPrevious()) {
                break;
            }
            p91.w((AutoCloseable) ((ListIterator) dh2Var.f).previous());
        }
        this.vendorExtraHooks.clear();
        ModuleBinderDeaths.INSTANCE.close();
        HookStatus.INSTANCE.close();
        Collection<Timer> collectionValues = this.nmeaTimers.values();
        collectionValues.getClass();
        Iterator<T> it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            ((Timer) it3.next()).cancel();
        }
        this.nmeaTimers.clear();
        Collection<Timer> collectionValues2 = this.bleScanTimers.values();
        collectionValues2.getClass();
        Iterator<T> it4 = collectionValues2.iterator();
        while (it4.hasNext()) {
            ((Timer) it4.next()).cancel();
        }
        this.bleScanTimers.clear();
        SystemLocationServiceHookerKt.clearSystemLocationReloadState();
        SystemBluetoothServiceHookerKt.clearSystemBleReloadState();
        SensorStepHooker.INSTANCE.clearReloadState$xposed_globalRelease();
        this.capturedLocationListeners.clear();
        this.capturedAMapListeners.clear();
        this.capturedBaiduListeners.clear();
        this.capturedTencentListeners.clear();
        this.capturedFusedLocationCallbacks.clear();
        return true;
    }

    public void onModuleLoaded(XposedModuleInterface.ModuleLoadedParam moduleLoadedParam) {
        moduleLoadedParam.getClass();
        startFrameworkConfigReceiver();
    }

    public void onPackageLoaded(XposedModuleInterface.PackageLoadedParam packageLoadedParam) {
        packageLoadedParam.getClass();
    }

    public void onPackageReady(XposedModuleInterface.PackageReadyParam packageReadyParam) {
        packageReadyParam.getClass();
        String packageName = packageReadyParam.getPackageName();
        packageName.getClass();
        ClassLoader classLoader = packageReadyParam.getClassLoader();
        classLoader.getClass();
        handleLoadPackage(packageName, classLoader);
    }

    public void onSystemServerStarting(XposedModuleInterface.SystemServerStartingParam systemServerStartingParam) {
        systemServerStartingParam.getClass();
        Log.e("LocationSpoofer", "[SysHook] onSystemServerStarting invoked! system_server classLoader=" + systemServerStartingParam.getClassLoader());
        ClassLoader classLoader = systemServerStartingParam.getClassLoader();
        classLoader.getClass();
        handleLoadPackage("android", classLoader);
    }

    public final Timer ownReloadTimer$xposed_globalRelease(Timer timer) {
        timer.getClass();
        Set<Timer> set = this.ownedReloadTimers;
        set.getClass();
        synchronized (set) {
            try {
                if (this.retiringGeneration) {
                    timer.cancel();
                } else {
                    this.ownedReloadTimers.add(timer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return timer;
    }

    public final JSONObject readConfig$xposed_globalRelease() {
        JSONObject jSONObject = this.lastConfig;
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.optBoolean("active", false)) {
            return jSONObject;
        }
        FrameworkConfigReceiver frameworkConfigReceiver = this.configReceiver;
        if (frameworkConfigReceiver == null || !frameworkConfigReceiver.canUse(jSONObject)) {
            return null;
        }
        return jSONObject;
    }

    public final void releaseReloadTimer$xposed_globalRelease(Timer timer) {
        timer.getClass();
        this.ownedReloadTimers.remove(timer);
    }

    public final void setBluetoothProcessInstance$xposed_globalRelease(boolean z) {
        this.isBluetoothProcessInstance = z;
    }

    public final void setCachedAddress$xposed_globalRelease(String str) {
        str.getClass();
        this.cachedAddress = str;
    }

    public final void setCachedCity$xposed_globalRelease(String str) {
        str.getClass();
        this.cachedCity = str;
    }

    public final void setCachedCountry$xposed_globalRelease(String str) {
        str.getClass();
        this.cachedCountry = str;
    }

    public final void setCachedDistrict$xposed_globalRelease(String str) {
        str.getClass();
        this.cachedDistrict = str;
    }

    public final void setCachedGpsSatellitesList$xposed_globalRelease(Iterable<? extends Object> iterable) {
        this.cachedGpsSatellitesList = iterable;
    }

    public final void setCachedPoiName$xposed_globalRelease(String str) {
        str.getClass();
        this.cachedPoiName = str;
    }

    public final void setCachedProvince$xposed_globalRelease(String str) {
        str.getClass();
        this.cachedProvince = str;
    }

    public final void setCachedStreet$xposed_globalRelease(String str) {
        str.getClass();
        this.cachedStreet = str;
    }

    public final void setCachedStreetNum$xposed_globalRelease(String str) {
        str.getClass();
        this.cachedStreetNum = str;
    }

    public final void setCurrentClassLoader$xposed_globalRelease(ClassLoader classLoader) {
        this.currentClassLoader = classLoader;
    }

    public final void setCurrentPackageName$xposed_globalRelease(String str) {
        str.getClass();
        this.currentPackageName = str;
    }

    public final void setEnvironmentHooksInstalled$xposed_globalRelease(boolean z) {
        this.environmentHooksInstalled = z;
    }

    public final void setHookAccuracyDrift$xposed_globalRelease(double d) {
        this.hookAccuracyDrift = d;
    }

    public final void setHookDriftLat$xposed_globalRelease(double d) {
        this.hookDriftLat = d;
    }

    public final void setHookDriftLng$xposed_globalRelease(double d) {
        this.hookDriftLng = d;
    }

    public final void setHookLastCallTime$xposed_globalRelease(long j) {
        this.hookLastCallTime = j;
    }

    public final void setLastConfig$xposed_globalRelease(JSONObject jSONObject) {
        this.lastConfig = jSONObject;
    }

    public final void setLastGeocodedLat$xposed_globalRelease(double d) {
        this.lastGeocodedLat = d;
    }

    public final void setLastGeocodedLng$xposed_globalRelease(double d) {
        this.lastGeocodedLng = d;
    }

    public final void setLastGpsSatellitesUpdate$xposed_globalRelease(long j) {
        this.lastGpsSatellitesUpdate = j;
    }

    public final void setLastOpenCellConfigLogKey$xposed_globalRelease(String str) {
        this.lastOpenCellConfigLogKey = str;
    }

    public final void setLastSpoofedLat$xposed_globalRelease(double d) {
        this.lastSpoofedLat = d;
    }

    public final void setLastSpoofedLng$xposed_globalRelease(double d) {
        this.lastSpoofedLng = d;
    }

    public final void setPhoneProcessInstance$xposed_globalRelease(boolean z) {
        this.isPhoneProcessInstance = z;
    }

    public final void setRetiringGeneration$xposed_globalRelease(boolean z) {
        this.retiringGeneration = z;
    }

    public final void setStartTimestamp$xposed_globalRelease(long j) {
        this.startTimestamp = j;
    }

    public final void setSystemHooksInstalled$xposed_globalRelease(boolean z) {
        this.systemHooksInstalled = z;
    }

    public final void setSystemServerProcess$xposed_globalRelease(boolean z) {
        this.isSystemServerProcess = z;
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Companion {
        public /* synthetic */ Companion(ca0 ca0Var) {
            this();
        }

        public final Set<String> getSYSTEM_PACKAGES() {
            return LocationHooker.SYSTEM_PACKAGES;
        }

        public final boolean hasTypeByName(Class<?> cls, String str) {
            str.getClass();
            if (cls == null) {
                return false;
            }
            if (cls.getName().equals(str)) {
                return true;
            }
            d0 d0VarY = zm3.y(cls.getInterfaces());
            while (d0VarY.hasNext()) {
                if (hasTypeByName((Class) d0VarY.next(), str)) {
                    return true;
                }
            }
            return hasTypeByName(cls.getSuperclass(), str);
        }

        private Companion() {
        }
    }
}
