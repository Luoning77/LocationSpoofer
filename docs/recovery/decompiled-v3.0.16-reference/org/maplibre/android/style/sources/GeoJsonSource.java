package org.maplibre.android.style.sources;

import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import org.maplibre.geojson.Geometry;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class GeoJsonSource extends Source {
    public GeoJsonSource(long j) {
        super(j);
    }

    private final native Feature[] nativeGetClusterChildren(Feature feature);

    private final native int nativeGetClusterExpansionZoom(Feature feature);

    private final native Feature[] nativeGetClusterLeaves(Feature feature, long j, long j2);

    private final native boolean nativeIsUpdateSynchronous();

    private final native void nativeSetFeature(Feature feature);

    private final native void nativeSetFeatureCollection(FeatureCollection featureCollection);

    private final native void nativeSetGeoJsonString(String str);

    private final native void nativeSetGeometry(Geometry geometry);

    private final native void nativeSetOverrideSynchronousUpdate(boolean z);

    private final native Feature[] querySourceFeatures(Object[] objArr);

    public final native void finalize();

    public final native void initialize(String str, Object obj);

    public final native String nativeGetUrl();

    public final native void nativeSetUrl(String str);
}
