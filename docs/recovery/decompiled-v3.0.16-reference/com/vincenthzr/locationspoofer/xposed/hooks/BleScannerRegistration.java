package com.vincenthzr.locationspoofer.xposed.hooks;

import defpackage.ca0;
import defpackage.o51;
import defpackage.p91;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class BleScannerRegistration {
    private final WeakReference<Object> callbackRef;
    private final String packageName;
    private final long registeredTime;

    public BleScannerRegistration(WeakReference<Object> weakReference, String str, long j) {
        weakReference.getClass();
        str.getClass();
        this.callbackRef = weakReference;
        this.packageName = str;
        this.registeredTime = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleScannerRegistration copy$default(BleScannerRegistration bleScannerRegistration, WeakReference weakReference, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            weakReference = bleScannerRegistration.callbackRef;
        }
        if ((i & 2) != 0) {
            str = bleScannerRegistration.packageName;
        }
        if ((i & 4) != 0) {
            j = bleScannerRegistration.registeredTime;
        }
        return bleScannerRegistration.copy(weakReference, str, j);
    }

    public final WeakReference<Object> component1() {
        return this.callbackRef;
    }

    public final String component2() {
        return this.packageName;
    }

    public final long component3() {
        return this.registeredTime;
    }

    public final BleScannerRegistration copy(WeakReference<Object> weakReference, String str, long j) {
        weakReference.getClass();
        str.getClass();
        return new BleScannerRegistration(weakReference, str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleScannerRegistration)) {
            return false;
        }
        BleScannerRegistration bleScannerRegistration = (BleScannerRegistration) obj;
        return o51.f(this.callbackRef, bleScannerRegistration.callbackRef) && o51.f(this.packageName, bleScannerRegistration.packageName) && this.registeredTime == bleScannerRegistration.registeredTime;
    }

    public final WeakReference<Object> getCallbackRef() {
        return this.callbackRef;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getRegisteredTime() {
        return this.registeredTime;
    }

    public int hashCode() {
        return Long.hashCode(this.registeredTime) + p91.d(this.callbackRef.hashCode() * 31, 31, this.packageName);
    }

    public String toString() {
        return "BleScannerRegistration(callbackRef=" + this.callbackRef + ", packageName=" + this.packageName + ", registeredTime=" + this.registeredTime + ")";
    }

    public /* synthetic */ BleScannerRegistration(WeakReference weakReference, String str, long j, int i, ca0 ca0Var) {
        this(weakReference, str, (i & 4) != 0 ? System.currentTimeMillis() : j);
    }
}
