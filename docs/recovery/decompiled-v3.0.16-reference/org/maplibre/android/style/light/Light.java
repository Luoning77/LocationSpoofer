package org.maplibre.android.style.light;

import defpackage.q73;
import org.maplibre.android.style.layers.TransitionOptions;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class Light {
    private long nativePtr;

    public Light(long j) {
        q73.a("Mbgl-Light");
        this.nativePtr = j;
    }

    private native String nativeGetAnchor();

    private native String nativeGetColor();

    private native TransitionOptions nativeGetColorTransition();

    private native float nativeGetIntensity();

    private native TransitionOptions nativeGetIntensityTransition();

    private native Position nativeGetPosition();

    private native TransitionOptions nativeGetPositionTransition();

    private native void nativeSetAnchor(String str);

    private native void nativeSetColor(String str);

    private native void nativeSetColorTransition(long j, long j2);

    private native void nativeSetIntensity(float f);

    private native void nativeSetIntensityTransition(long j, long j2);

    private native void nativeSetPosition(Position position);

    private native void nativeSetPositionTransition(long j, long j2);
}
