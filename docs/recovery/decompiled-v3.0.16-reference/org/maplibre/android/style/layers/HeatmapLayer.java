package org.maplibre.android.style.layers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class HeatmapLayer extends Layer {
    public HeatmapLayer(long j) {
        super(j);
    }

    private native Object nativeGetHeatmapColor();

    private native Object nativeGetHeatmapIntensity();

    private native TransitionOptions nativeGetHeatmapIntensityTransition();

    private native Object nativeGetHeatmapOpacity();

    private native TransitionOptions nativeGetHeatmapOpacityTransition();

    private native Object nativeGetHeatmapRadius();

    private native TransitionOptions nativeGetHeatmapRadiusTransition();

    private native Object nativeGetHeatmapWeight();

    private native void nativeSetHeatmapIntensityTransition(long j, long j2);

    private native void nativeSetHeatmapOpacityTransition(long j, long j2);

    private native void nativeSetHeatmapRadiusTransition(long j, long j2);

    @Override // org.maplibre.android.style.layers.Layer
    public native void finalize();

    public native void initialize(String str, String str2);
}
