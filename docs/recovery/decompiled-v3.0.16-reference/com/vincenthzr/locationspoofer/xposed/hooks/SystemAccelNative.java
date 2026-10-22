package com.vincenthzr.locationspoofer.xposed.hooks;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SystemAccelNative {
    public static final SystemAccelNative INSTANCE = new SystemAccelNative();

    private SystemAccelNative() {
    }

    public static final native void configureSensors(boolean z, int[] iArr, double d, double d2, double d3, long j, long j2, long j3, int i, float[] fArr, boolean z2, double d4);

    public static final native boolean configureStepSensors(int[] iArr);

    public static final native long[] diagnostics();

    public static final native void disable();

    public static final native boolean install(String str);

    public static final native int[] uids();
}
