package com.vincenthzr.locationspoofer.xposed.hooks;

import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ListenerRegistrationInfo {
    private final Object listener;
    private final String packageName;
    private final String provider;
    private final long registeredTime;

    public /* synthetic */ ListenerRegistrationInfo(Object obj, String str, String str2, long j, int i, ca0 ca0Var) {
        this(obj, str, (i & 4) != 0 ? "gps" : str2, (i & 8) != 0 ? System.currentTimeMillis() : j);
    }

    public static /* synthetic */ ListenerRegistrationInfo copy$default(ListenerRegistrationInfo listenerRegistrationInfo, Object obj, String str, String str2, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = listenerRegistrationInfo.listener;
        }
        if ((i & 2) != 0) {
            str = listenerRegistrationInfo.packageName;
        }
        if ((i & 4) != 0) {
            str2 = listenerRegistrationInfo.provider;
        }
        if ((i & 8) != 0) {
            j = listenerRegistrationInfo.registeredTime;
        }
        String str3 = str2;
        return listenerRegistrationInfo.copy(obj, str, str3, j);
    }

    public final Object component1() {
        return this.listener;
    }

    public final String component2() {
        return this.packageName;
    }

    public final String component3() {
        return this.provider;
    }

    public final long component4() {
        return this.registeredTime;
    }

    public final ListenerRegistrationInfo copy(Object obj, String str, String str2, long j) {
        obj.getClass();
        str.getClass();
        str2.getClass();
        return new ListenerRegistrationInfo(obj, str, str2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListenerRegistrationInfo)) {
            return false;
        }
        ListenerRegistrationInfo listenerRegistrationInfo = (ListenerRegistrationInfo) obj;
        return o51.f(this.listener, listenerRegistrationInfo.listener) && o51.f(this.packageName, listenerRegistrationInfo.packageName) && o51.f(this.provider, listenerRegistrationInfo.provider) && this.registeredTime == listenerRegistrationInfo.registeredTime;
    }

    public final Object getListener() {
        return this.listener;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final long getRegisteredTime() {
        return this.registeredTime;
    }

    public int hashCode() {
        return Long.hashCode(this.registeredTime) + p91.d(p91.d(this.listener.hashCode() * 31, 31, this.packageName), 31, this.provider);
    }

    public String toString() {
        return "ListenerRegistrationInfo(listener=" + this.listener + ", packageName=" + this.packageName + ", provider=" + this.provider + ", registeredTime=" + this.registeredTime + ")";
    }

    public ListenerRegistrationInfo(Object obj, String str, String str2, long j) {
        obj.getClass();
        str.getClass();
        str2.getClass();
        this.listener = obj;
        this.packageName = str;
        this.provider = str2;
        this.registeredTime = j;
    }
}
