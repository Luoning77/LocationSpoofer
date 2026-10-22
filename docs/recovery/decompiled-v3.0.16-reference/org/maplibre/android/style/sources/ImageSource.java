package org.maplibre.android.style.sources;

import android.graphics.Bitmap;
import org.maplibre.android.geometry.LatLngQuad;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ImageSource extends Source {
    public ImageSource(long j) {
        super(j);
    }

    public final native void finalize();

    public final native void initialize(String str, LatLngQuad latLngQuad);

    public final native String nativeGetUrl();

    public final native void nativeSetCoordinates(LatLngQuad latLngQuad);

    public final native void nativeSetImage(Bitmap bitmap);

    public final native void nativeSetUrl(String str);
}
