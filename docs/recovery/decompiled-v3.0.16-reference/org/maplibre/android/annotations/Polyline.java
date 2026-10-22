package org.maplibre.android.annotations;

import org.maplibre.android.maps.g;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@Deprecated
public final class Polyline extends BasePointCollection {
    private int color = -16777216;
    private float width = 10.0f;

    @Override // org.maplibre.android.annotations.BasePointCollection
    public final void e() {
        g gVar = this.f;
        if (gVar != null) {
            gVar.o(this);
        }
    }

    public final int f() {
        return this.color;
    }

    public final float g() {
        return this.width;
    }

    public final void h(int i) {
        this.color = i;
        e();
    }

    public final void i(float f) {
        this.width = f;
        e();
    }
}
