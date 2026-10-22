package org.maplibre.android.style.layers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ColorReliefLayer extends Layer {
    public ColorReliefLayer(long j) {
        super(j);
    }

    private native Object nativeGetColorReliefColor();

    private native Object nativeGetColorReliefOpacity();

    private native TransitionOptions nativeGetColorReliefOpacityTransition();

    private native void nativeSetColorReliefOpacityTransition(long j, long j2);

    @Override // org.maplibre.android.style.layers.Layer
    public native void finalize();

    public native void initialize(String str, String str2);
}
