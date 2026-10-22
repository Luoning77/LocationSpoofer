package com.vincenthzr.locationspoofer.xposed.hooks.vendor.profiles.versions;

import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemVersionVendor;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.profiles.ColorOsVendor;
import defpackage.am1;
import defpackage.di3;
import defpackage.l13;
import defpackage.s13;
import defpackage.wh2;
import defpackage.yh2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ColorOs16Vendor extends SystemVersionVendor {
    public static final ColorOs16Vendor INSTANCE = new ColorOs16Vendor();
    private static final String id = "coloros16";

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SystemComponent.values().length];
            try {
                iArr[SystemComponent.BLUETOOTH_SCAN_SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SystemComponent.CONNECTIVITY_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ColorOs16Vendor() {
        super(ColorOsVendor.INSTANCE);
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemVersionVendor, com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public List<String> classCandidates(SystemComponent systemComponent) {
        systemComponent.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[systemComponent.ordinal()];
        if (i != 1) {
            return i != 2 ? super.classCandidates(systemComponent) : am1.F("android.net.connectivity.com.android.server.ConnectivityService");
        }
        return am1.G("com.android.bluetooth.le_scan.ScanController", "com.android.bluetooth.le_scan.TransitionalScanHelper");
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public String getId() {
        return id;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemVersionVendor
    public boolean matchesVersion(di3 di3Var) {
        String strSubstring;
        di3Var.getClass();
        List list = yh2.a;
        String strB = di3Var.b("ro.build.version.oplusrom");
        if (l13.k0(strB)) {
            strB = di3Var.b("ro.build.version.opporom");
        }
        int length = strB.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                strSubstring = "";
                break;
            }
            if (Character.isDigit(strB.charAt(i))) {
                strSubstring = strB.substring(i);
                break;
            }
            i++;
        }
        int length2 = strSubstring.length();
        for (int i2 = 0; i2 < length2; i2++) {
            if (!Character.isDigit(strSubstring.charAt(i2))) {
                strSubstring = strSubstring.substring(0, i2);
                break;
            }
        }
        Integer numA0 = s13.a0(strSubstring);
        return yh2.a(di3Var) == wh2.h && di3Var.e == 36 && numA0 != null && numA0.intValue() == 16;
    }
}
