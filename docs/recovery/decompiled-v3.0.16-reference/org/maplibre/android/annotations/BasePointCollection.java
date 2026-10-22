package org.maplibre.android.annotations;

import defpackage.ij;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.geometry.LatLng;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@Deprecated
public abstract class BasePointCollection extends ij {
    private float alpha = 1.0f;
    private List<LatLng> points = new ArrayList();

    public final void a(LatLng latLng) {
        this.points.add(latLng);
        e();
    }

    public final float b() {
        return this.alpha;
    }

    public final ArrayList c() {
        return new ArrayList(this.points);
    }

    public final void d(float f) {
        this.alpha = f;
        e();
    }

    public abstract void e();
}
