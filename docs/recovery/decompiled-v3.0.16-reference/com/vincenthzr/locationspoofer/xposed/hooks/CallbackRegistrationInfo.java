package com.vincenthzr.locationspoofer.xposed.hooks;

import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CallbackRegistrationInfo {
    private final Object callback;
    private final String packageName;
    private final long registeredTime;

    public CallbackRegistrationInfo(Object obj, String str, long j) {
        obj.getClass();
        str.getClass();
        this.callback = obj;
        this.packageName = str;
        this.registeredTime = j;
    }

    public static /* synthetic */ CallbackRegistrationInfo copy$default(CallbackRegistrationInfo callbackRegistrationInfo, Object obj, String str, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = callbackRegistrationInfo.callback;
        }
        if ((i & 2) != 0) {
            str = callbackRegistrationInfo.packageName;
        }
        if ((i & 4) != 0) {
            j = callbackRegistrationInfo.registeredTime;
        }
        return callbackRegistrationInfo.copy(obj, str, j);
    }

    public final Object component1() {
        return this.callback;
    }

    public final String component2() {
        return this.packageName;
    }

    public final long component3() {
        return this.registeredTime;
    }

    public final CallbackRegistrationInfo copy(Object obj, String str, long j) {
        obj.getClass();
        str.getClass();
        return new CallbackRegistrationInfo(obj, str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallbackRegistrationInfo)) {
            return false;
        }
        CallbackRegistrationInfo callbackRegistrationInfo = (CallbackRegistrationInfo) obj;
        return o51.f(this.callback, callbackRegistrationInfo.callback) && o51.f(this.packageName, callbackRegistrationInfo.packageName) && this.registeredTime == callbackRegistrationInfo.registeredTime;
    }

    public final Object getCallback() {
        return this.callback;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getRegisteredTime() {
        return this.registeredTime;
    }

    public int hashCode() {
        return Long.hashCode(this.registeredTime) + p91.d(this.callback.hashCode() * 31, 31, this.packageName);
    }

    public String toString() {
        return "CallbackRegistrationInfo(callback=" + this.callback + ", packageName=" + this.packageName + ", registeredTime=" + this.registeredTime + ")";
    }

    public /* synthetic */ CallbackRegistrationInfo(Object obj, String str, long j, int i, ca0 ca0Var) {
        this(obj, str, (i & 4) != 0 ? System.currentTimeMillis() : j);
    }
}
