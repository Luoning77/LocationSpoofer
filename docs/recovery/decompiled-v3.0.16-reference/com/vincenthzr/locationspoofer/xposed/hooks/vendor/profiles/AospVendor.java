package com.vincenthzr.locationspoofer.xposed.hooks.vendor.profiles;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor;
import defpackage.am1;
import defpackage.b81;
import defpackage.di3;
import defpackage.mc0;
import defpackage.wh2;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AospVendor implements SystemHookVendor {
    public static final AospVendor INSTANCE = new AospVendor();
    private static final String id = "aosp";
    private static final wh2 family = wh2.f;
    private static final int priority = Integer.MIN_VALUE;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SystemComponent.values().length];
            try {
                iArr[SystemComponent.LOCATION_MANAGER_SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SystemComponent.LOCATION_PROVIDER_MANAGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SystemComponent.WIFI_SERVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SystemComponent.WIFI_SCANNER_SERVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SystemComponent.CONNECTIVITY_SERVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SystemComponent.TELEPHONY_PHONE_MANAGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SystemComponent.TELEPHONY_REGISTRY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SystemComponent.APPOPS_SERVICE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SystemComponent.BLUETOOTH_SCAN_SERVICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AospVendor() {
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public Set<String> additionalExemptPackages() {
        return super.additionalExemptPackages();
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public List<String> classCandidates(SystemComponent systemComponent) {
        systemComponent.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[systemComponent.ordinal()]) {
            case 1:
                return am1.G("com.android.server.location.LocationManagerService", "com.android.server.LocationManagerService");
            case 2:
                return am1.F("com.android.server.location.provider.LocationProviderManager");
            case 3:
                return am1.G("com.android.server.wifi.WifiServiceImpl", "com.android.server.WifiService");
            case 4:
                return am1.F("com.android.server.wifi.scanner.WifiScanningServiceImpl");
            case Logger.WARN /* 5 */:
                return am1.G("android.net.connectivity.com.android.server.ConnectivityService", "com.android.server.ConnectivityService", "com.android.server.connectivity.ConnectivityService");
            case Logger.ERROR /* 6 */:
                return am1.G("com.android.internal.telephony.PhoneInterfaceManager", "com.android.server.telephony.PhoneInterfaceManager", "com.android.phone.PhoneInterfaceManager");
            case WorkQueueKt.BUFFER_CAPACITY_BASE /* 7 */:
                return am1.F("com.android.server.TelephonyRegistry");
            case 8:
                return am1.G("com.android.server.appop.AppOpsService", "com.android.server.AppOpsService");
            case mc0.b /* 9 */:
                return am1.G("com.android.bluetooth.le_scan.ScanController", "com.android.bluetooth.le_scan.TransitionalScanHelper", "com.android.bluetooth.le_scan.ScanBinder", "com.android.bluetooth.gatt.GattService", "com.android.bluetooth.btservice.AdapterService");
            default:
                b81.d();
                return null;
        }
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public wh2 getFamily() {
        return family;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public String getId() {
        return id;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public int getPriority() {
        return priority;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public void installExtraHooks(LocationHooker locationHooker, ClassLoader classLoader) {
        super.installExtraHooks(locationHooker, classLoader);
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public boolean matches(di3 di3Var) {
        di3Var.getClass();
        return true;
    }
}
