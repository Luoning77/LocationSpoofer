package com.vincenthzr.locationspoofer.xposed.hooks.vendor.profiles;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemComponent;
import com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor;
import defpackage.di3;
import defpackage.uj0;
import defpackage.wh2;
import defpackage.yh2;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ColorOsVendor implements SystemHookVendor {
    public static final ColorOsVendor INSTANCE = new ColorOsVendor();
    private static final String id = "coloros";
    private static final wh2 family = wh2.h;
    private static final int priority = 90;

    private ColorOsVendor() {
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public Set<String> additionalExemptPackages() {
        return super.additionalExemptPackages();
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public List<String> classCandidates(SystemComponent systemComponent) {
        systemComponent.getClass();
        return uj0.e;
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
        return yh2.a(di3Var) == getFamily();
    }
}
