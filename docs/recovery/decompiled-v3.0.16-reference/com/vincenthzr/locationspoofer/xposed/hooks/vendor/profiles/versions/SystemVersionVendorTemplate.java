package com.vincenthzr.locationspoofer.xposed.hooks.vendor.profiles.versions;

import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemVersionVendor;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.profiles.HyperOsVendor;
import defpackage.di3;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemVersionVendorTemplate extends SystemVersionVendor {
    public static final SystemVersionVendorTemplate INSTANCE = new SystemVersionVendorTemplate();
    private static final String id = "system-version-template";

    private SystemVersionVendorTemplate() {
        super(HyperOsVendor.INSTANCE);
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public String getId() {
        return id;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemVersionVendor
    public boolean matchesVersion(di3 di3Var) {
        di3Var.getClass();
        return false;
    }
}
