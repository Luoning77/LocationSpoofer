package org.maplibre.android.style.layers;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class FillExtrusionLayer extends Layer {
    public FillExtrusionLayer(long j) {
        super(j);
    }

    private native Object nativeGetFillExtrusionBase();

    private native TransitionOptions nativeGetFillExtrusionBaseTransition();

    private native Object nativeGetFillExtrusionColor();

    private native TransitionOptions nativeGetFillExtrusionColorTransition();

    private native Object nativeGetFillExtrusionHeight();

    private native TransitionOptions nativeGetFillExtrusionHeightTransition();

    private native Object nativeGetFillExtrusionOpacity();

    private native TransitionOptions nativeGetFillExtrusionOpacityTransition();

    private native Object nativeGetFillExtrusionPattern();

    private native TransitionOptions nativeGetFillExtrusionPatternTransition();

    private native Object nativeGetFillExtrusionRoundedCornerDistance();

    private native Object nativeGetFillExtrusionTranslate();

    private native Object nativeGetFillExtrusionTranslateAnchor();

    private native TransitionOptions nativeGetFillExtrusionTranslateTransition();

    private native Object nativeGetFillExtrusionVerticalGradient();

    private native void nativeSetFillExtrusionBaseTransition(long j, long j2);

    private native void nativeSetFillExtrusionColorTransition(long j, long j2);

    private native void nativeSetFillExtrusionHeightTransition(long j, long j2);

    private native void nativeSetFillExtrusionOpacityTransition(long j, long j2);

    private native void nativeSetFillExtrusionPatternTransition(long j, long j2);

    private native void nativeSetFillExtrusionTranslateTransition(long j, long j2);

    @Override // org.maplibre.android.style.layers.Layer
    public native void finalize();

    public native void initialize(String str, String str2);
}
