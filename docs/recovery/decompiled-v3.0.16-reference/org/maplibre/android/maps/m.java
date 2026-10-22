package org.maplibre.android.maps;

import android.graphics.Bitmap;
import defpackage.az2;
import defpackage.fo;
import defpackage.mn2;
import defpackage.q73;
import defpackage.ty1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.RasterLayer;
import org.maplibre.android.style.sources.Source;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m {
    public final ty1 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final mn2 e;
    public boolean f;

    public m(mn2 mn2Var, ty1 ty1Var) {
        this.e = mn2Var;
        this.a = ty1Var;
    }

    public final void a(RasterLayer rasterLayer) {
        h("addLayer");
        ((NativeMapView) this.a).b(rasterLayer);
        q73.a("Mbgl-Layer");
        this.c.put(rasterLayer.nativeGetId(), rasterLayer);
    }

    public final void b(RasterLayer rasterLayer, String str) {
        h("addLayerBelow");
        ((NativeMapView) this.a).c(rasterLayer, str);
        q73.a("Mbgl-Layer");
        this.c.put(rasterLayer.nativeGetId(), rasterLayer);
    }

    public final void c(Source source) {
        h("addSource");
        ((NativeMapView) this.a).g(source);
        this.b.put(source.getId(), source);
    }

    public final void d() {
        this.f = false;
        HashMap map = this.c;
        for (Layer layer : map.values()) {
            if (layer != null) {
                layer.a = true;
            }
        }
        HashMap map2 = this.b;
        for (Source source : map2.values()) {
            if (source != null) {
                source.setDetached();
            }
        }
        HashMap map3 = this.d;
        for (Map.Entry entry : map3.entrySet()) {
            ((NativeMapView) this.a).E((String) entry.getKey());
            ((Bitmap) entry.getValue()).recycle();
        }
        map2.clear();
        map.clear();
        map3.clear();
    }

    public final List e() {
        h("getLayers");
        return ((NativeMapView) this.a).p();
    }

    public final void f() {
        h("removeLayer");
        this.c.remove("subscriber-satellite");
        ((NativeMapView) this.a).F();
    }

    public final void g() {
        h("removeSource");
        if (((NativeMapView) this.a).G()) {
            this.b.remove("subscriber-satellite");
        }
    }

    public final void h(String str) {
        if (this.f) {
            return;
        }
        fo.n(az2.k("Calling ", str, " when a newer style is loading/has loaded."));
    }
}
