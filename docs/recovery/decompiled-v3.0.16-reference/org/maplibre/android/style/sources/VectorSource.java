package org.maplibre.android.style.sources;

import org.maplibre.geojson.Feature;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class VectorSource extends Source {
    public VectorSource(long j) {
        super(j);
    }

    private final native Feature[] querySourceFeatures(String[] strArr, Object[] objArr);

    public final native void finalize();

    public final native void initialize(String str, Object obj);

    public final native String nativeGetUrl();
}
