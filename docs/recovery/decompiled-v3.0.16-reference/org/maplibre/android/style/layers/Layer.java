package org.maplibre.android.style.layers;

import com.google.gson.JsonElement;
import defpackage.q73;
import defpackage.se1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class Layer {
    public boolean a;
    private boolean invalidated;
    private long nativePtr;

    static {
        se1.a();
    }

    public Layer(long j) {
        q73.a("Mbgl-Layer");
        this.nativePtr = j;
    }

    public final long a() {
        return this.nativePtr;
    }

    public native void finalize();

    public native JsonElement nativeGetFilter();

    public native String nativeGetId();

    public native float nativeGetMaxZoom();

    public native float nativeGetMinZoom();

    public native String nativeGetSourceId();

    public native String nativeGetSourceLayer();

    public native Object nativeGetVisibility();

    public native void nativeSetFilter(Object[] objArr);

    public native void nativeSetLayoutProperty(String str, Object obj);

    public native void nativeSetMaxZoom(float f);

    public native void nativeSetMinZoom(float f);

    public native void nativeSetPaintProperty(String str, Object obj);

    public native void nativeSetSourceLayer(String str);
}
