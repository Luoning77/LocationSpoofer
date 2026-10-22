package com.vincenthzr.locationspoofer.xposed.hooks.delivery;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.diagnostics.HookStatus;
import defpackage.au0;
import defpackage.mf3;
import defpackage.ns0;
import defpackage.z90;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FrameworkAdapters {
    public static final FrameworkAdapters INSTANCE = new FrameworkAdapters();

    private FrameworkAdapters() {
    }

    private static final boolean install$acquire(LocationHooker locationHooker, String str, au0 au0Var) {
        boolean zAcquire = AdapterInstallation.INSTANCE.acquire(locationHooker.getVendorExtraHooks$xposed_globalRelease(), au0Var, new z90(str, 1));
        HookStatus.INSTANCE.capability(str, zAcquire, "runtime-signatures");
        return zAcquire;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 install$acquire$lambda$0(String str, Throwable th) {
        th.getClass();
        HookStatus.INSTANCE.error(str, th);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemDeliveryAdapter install$lambda$1(LocationHooker locationHooker, ClassLoader classLoader) {
        return new FrameworkLocationDelivery(locationHooker, classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemDeliveryAdapter install$lambda$2(LocationHooker locationHooker, ClassLoader classLoader) {
        return new FrameworkLocationAvailability(locationHooker, classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemDeliveryAdapter install$lambda$3(LocationHooker locationHooker, ClassLoader classLoader) {
        return new FrameworkBleDelivery(locationHooker, classLoader);
    }

    public final SystemHookCapabilities install(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        if (locationHooker.isSystemServerProcess$xposed_globalRelease()) {
            return new SystemHookCapabilities(install$acquire(locationHooker, "FRAMEWORK_LOCATION", new ns0(locationHooker, classLoader, 0)), false, install$acquire(locationHooker, "FRAMEWORK_LOCATION_AVAILABILITY", new ns0(locationHooker, classLoader, 1)), 2, null);
        }
        if (locationHooker.isBluetoothProcessInstance$xposed_globalRelease()) {
            return new SystemHookCapabilities(false, install$acquire(locationHooker, "FRAMEWORK_BLE", new ns0(locationHooker, classLoader, 2)), false, 5, null);
        }
        return new SystemHookCapabilities(false, false, false, 7, null);
    }
}
