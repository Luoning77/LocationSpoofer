package org.maplibre.android.maps.renderer;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
class MapRendererRunnable implements Runnable {
    private final long nativePtr;

    public MapRendererRunnable(long j) {
        this.nativePtr = j;
    }

    private native void nativeInitialize();

    public native void finalize();

    @Override // java.lang.Runnable
    public native void run();
}
