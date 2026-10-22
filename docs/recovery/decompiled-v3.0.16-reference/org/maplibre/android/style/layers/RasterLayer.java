package org.maplibre.android.style.layers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class RasterLayer extends Layer {
    public RasterLayer(long j) {
        super(j);
    }

    private native Object nativeGetRasterBrightnessMax();

    private native TransitionOptions nativeGetRasterBrightnessMaxTransition();

    private native Object nativeGetRasterBrightnessMin();

    private native TransitionOptions nativeGetRasterBrightnessMinTransition();

    private native Object nativeGetRasterContrast();

    private native TransitionOptions nativeGetRasterContrastTransition();

    private native Object nativeGetRasterFadeDuration();

    private native Object nativeGetRasterHueRotate();

    private native TransitionOptions nativeGetRasterHueRotateTransition();

    private native Object nativeGetRasterOpacity();

    private native TransitionOptions nativeGetRasterOpacityTransition();

    private native Object nativeGetRasterResampling();

    private native Object nativeGetRasterSaturation();

    private native TransitionOptions nativeGetRasterSaturationTransition();

    private native void nativeSetRasterBrightnessMaxTransition(long j, long j2);

    private native void nativeSetRasterBrightnessMinTransition(long j, long j2);

    private native void nativeSetRasterContrastTransition(long j, long j2);

    private native void nativeSetRasterHueRotateTransition(long j, long j2);

    private native void nativeSetRasterOpacityTransition(long j, long j2);

    private native void nativeSetRasterSaturationTransition(long j, long j2);

    @Override // org.maplibre.android.style.layers.Layer
    public native void finalize();

    public native void initialize(String str, String str2);
}
