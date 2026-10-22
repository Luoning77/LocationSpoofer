package org.maplibre.android.net;

import defpackage.a50;
import defpackage.se1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
class NativeConnectivityListener implements a50 {
    private boolean invalidated;
    private long nativePtr;

    static {
        se1.a();
    }

    public NativeConnectivityListener(long j) {
        this.nativePtr = j;
    }

    public native void finalize();

    public native void initialize();

    public native void nativeOnConnectivityStateChanged(boolean z);
}
