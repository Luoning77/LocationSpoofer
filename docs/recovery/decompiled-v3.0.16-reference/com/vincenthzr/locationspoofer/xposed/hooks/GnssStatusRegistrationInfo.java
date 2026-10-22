package com.vincenthzr.locationspoofer.xposed.hooks;

import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class GnssStatusRegistrationInfo {
    private final GnssSessionState lifecycle;
    private final Object listener;
    private final String packageName;
    private final long registeredTime;
    private final int uid;

    public /* synthetic */ GnssStatusRegistrationInfo(Object obj, String str, long j, int i, GnssSessionState gnssSessionState, int i2, ca0 ca0Var) {
        this(obj, str, (i2 & 4) != 0 ? System.currentTimeMillis() : j, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? new GnssSessionState() : gnssSessionState);
    }

    public static /* synthetic */ GnssStatusRegistrationInfo copy$default(GnssStatusRegistrationInfo gnssStatusRegistrationInfo, Object obj, String str, long j, int i, GnssSessionState gnssSessionState, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = gnssStatusRegistrationInfo.listener;
        }
        if ((i2 & 2) != 0) {
            str = gnssStatusRegistrationInfo.packageName;
        }
        if ((i2 & 4) != 0) {
            j = gnssStatusRegistrationInfo.registeredTime;
        }
        if ((i2 & 8) != 0) {
            i = gnssStatusRegistrationInfo.uid;
        }
        if ((i2 & 16) != 0) {
            gnssSessionState = gnssStatusRegistrationInfo.lifecycle;
        }
        long j2 = j;
        return gnssStatusRegistrationInfo.copy(obj, str, j2, i, gnssSessionState);
    }

    public final Object component1() {
        return this.listener;
    }

    public final String component2() {
        return this.packageName;
    }

    public final long component3() {
        return this.registeredTime;
    }

    public final int component4() {
        return this.uid;
    }

    public final GnssSessionState component5() {
        return this.lifecycle;
    }

    public final GnssStatusRegistrationInfo copy(Object obj, String str, long j, int i, GnssSessionState gnssSessionState) {
        obj.getClass();
        str.getClass();
        gnssSessionState.getClass();
        return new GnssStatusRegistrationInfo(obj, str, j, i, gnssSessionState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GnssStatusRegistrationInfo)) {
            return false;
        }
        GnssStatusRegistrationInfo gnssStatusRegistrationInfo = (GnssStatusRegistrationInfo) obj;
        return o51.f(this.listener, gnssStatusRegistrationInfo.listener) && o51.f(this.packageName, gnssStatusRegistrationInfo.packageName) && this.registeredTime == gnssStatusRegistrationInfo.registeredTime && this.uid == gnssStatusRegistrationInfo.uid && o51.f(this.lifecycle, gnssStatusRegistrationInfo.lifecycle);
    }

    public final GnssSessionState getLifecycle() {
        return this.lifecycle;
    }

    public final Object getListener() {
        return this.listener;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getRegisteredTime() {
        return this.registeredTime;
    }

    public final int getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.lifecycle.hashCode() + p91.b(this.uid, p91.c(p91.d(this.listener.hashCode() * 31, 31, this.packageName), 31, this.registeredTime), 31);
    }

    public String toString() {
        return "GnssStatusRegistrationInfo(listener=" + this.listener + ", packageName=" + this.packageName + ", registeredTime=" + this.registeredTime + ", uid=" + this.uid + ", lifecycle=" + this.lifecycle + ")";
    }

    public GnssStatusRegistrationInfo(Object obj, String str, long j, int i, GnssSessionState gnssSessionState) {
        obj.getClass();
        str.getClass();
        gnssSessionState.getClass();
        this.listener = obj;
        this.packageName = str;
        this.registeredTime = j;
        this.uid = i;
        this.lifecycle = gnssSessionState;
    }
}
