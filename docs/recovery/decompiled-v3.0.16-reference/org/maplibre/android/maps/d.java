package org.maplibre.android.maps;

import android.graphics.PointF;
import defpackage.az2;
import defpackage.dp1;
import defpackage.zi2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d {
    public final float a;
    public final float b;
    public final float c;
    public final double d;
    public final float e;
    public final /* synthetic */ dp1 f;

    public d(dp1 dp1Var, float f, double d, float f2, float f3, float f4) {
        this.f = dp1Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = d * 2.2000000000000003E-4d;
        this.e = f4;
    }

    public final void a(zi2 zi2Var, float f) {
        dp1 dp1Var = this.f;
        dp1Var.e.c(1);
        n nVar = dp1Var.a;
        double dM = ((NativeMapView) nVar.a).m() + ((double) f);
        PointF pointF = dp1Var.m;
        if (pointF == null) {
            pointF = zi2Var.n;
        }
        ((NativeMapView) nVar.a).I(dM, pointF.x, pointF.y, 0L);
        Iterator it = dp1Var.j.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
    }
}
