package com.vincenthzr.locationspoofer.data.model;

import defpackage.o51;
import defpackage.p91;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class AppInfoItem {
    private final String appName;
    private final boolean isSystem;
    private final String packageName;

    public AppInfoItem(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.packageName = str;
        this.appName = str2;
        this.isSystem = z;
    }

    public static /* synthetic */ AppInfoItem copy$default(AppInfoItem appInfoItem, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfoItem.packageName;
        }
        if ((i & 2) != 0) {
            str2 = appInfoItem.appName;
        }
        if ((i & 4) != 0) {
            z = appInfoItem.isSystem;
        }
        return appInfoItem.copy(str, str2, z);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.appName;
    }

    public final boolean component3() {
        return this.isSystem;
    }

    public final AppInfoItem copy(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return new AppInfoItem(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfoItem)) {
            return false;
        }
        AppInfoItem appInfoItem = (AppInfoItem) obj;
        return o51.f(this.packageName, appInfoItem.packageName) && o51.f(this.appName, appInfoItem.appName) && this.isSystem == appInfoItem.isSystem;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSystem) + p91.d(this.packageName.hashCode() * 31, 31, this.appName);
    }

    public final boolean isSystem() {
        return this.isSystem;
    }

    public String toString() {
        String str = this.packageName;
        String str2 = this.appName;
        boolean z = this.isSystem;
        StringBuilder sbT = p91.t("AppInfoItem(packageName=", str, ", appName=", str2, ", isSystem=");
        sbT.append(z);
        sbT.append(")");
        return sbT.toString();
    }
}
