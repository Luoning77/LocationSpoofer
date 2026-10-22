package org.maplibre.android.style.sources;

import defpackage.gn;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class RasterSource extends Source {
    public RasterSource(gn gnVar) {
        checkThread();
        HashMap map = new HashMap();
        map.put("tilejson", "2.1.0");
        map.put("tiles", (String[]) gnVar.a);
        Float f = (Float) gnVar.b;
        if (f != null) {
            map.put("minzoom", f);
        }
        Float f2 = (Float) gnVar.c;
        if (f2 != null) {
            map.put("maxzoom", f2);
        }
        initialize("subscriber-satellite", map, 256);
    }

    public final native void finalize();

    public final native void initialize(String str, Object obj, int i);

    public final native String nativeGetUrl();

    public RasterSource(long j) {
        super(j);
    }
}
