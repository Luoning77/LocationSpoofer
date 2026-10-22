package org.maplibre.android.maps;

import android.graphics.PointF;
import defpackage.ty1;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l {
    public final ty1 a;
    public final k b;

    public l(ty1 ty1Var, k kVar) {
        this.a = ty1Var;
        this.b = kVar;
    }

    public final LatLng a(PointF pointF) {
        return ((NativeMapView) this.a).w(pointF);
    }

    public final float b() {
        return this.b.getHeight();
    }

    public final float c() {
        return this.b.getWidth();
    }

    public final PointF d(LatLng latLng) {
        return ((NativeMapView) this.a).z(latLng);
    }
}
