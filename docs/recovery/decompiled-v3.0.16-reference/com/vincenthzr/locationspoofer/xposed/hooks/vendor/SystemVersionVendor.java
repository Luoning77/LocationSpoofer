package com.vincenthzr.locationspoofer.xposed.hooks.vendor;

import com.vincenthzr.locationspoofer.xposed.LocationHooker;
import defpackage.di3;
import defpackage.s13;
import defpackage.wh2;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class SystemVersionVendor implements SystemHookVendor {
    private final SystemHookVendor parent;
    private final int priority;

    public SystemVersionVendor(SystemHookVendor systemHookVendor) {
        systemHookVendor.getClass();
        this.parent = systemHookVendor;
        this.priority = systemHookVendor.getPriority() + 10;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public Set<String> additionalExemptPackages() {
        return this.parent.additionalExemptPackages();
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public List<String> classCandidates(SystemComponent systemComponent) {
        systemComponent.getClass();
        return this.parent.classCandidates(systemComponent);
    }

    public final Integer extractLeadingMajorVersion(String str) {
        String strSubstring;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                strSubstring = "";
                break;
            }
            if (Character.isDigit(str.charAt(i))) {
                strSubstring = str.substring(i);
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
        return s13.a0(strSubstring);
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public wh2 getFamily() {
        return this.parent.getFamily();
    }

    public final SystemHookVendor getParent() {
        return this.parent;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public int getPriority() {
        return this.priority;
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public void installExtraHooks(LocationHooker locationHooker, ClassLoader classLoader) {
        locationHooker.getClass();
        classLoader.getClass();
        this.parent.installExtraHooks(locationHooker, classLoader);
    }

    @Override // com.vincenthzr.locationspoofer.xposed.hooks.vendor.SystemHookVendor
    public final boolean matches(di3 di3Var) {
        di3Var.getClass();
        if (!this.parent.matches(di3Var)) {
            return false;
        }
        try {
            return matchesVersion(di3Var);
        } catch (Throwable unused) {
            return false;
        }
    }

    public abstract boolean matchesVersion(di3 di3Var);
}
