package org.maplibre.android.maps;

import defpackage.az2;
import defpackage.dp1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class e {
    public final /* synthetic */ dp1 a;

    public e(dp1 dp1Var) {
        this.a = dp1Var;
    }

    public final void a(float f) {
        dp1 dp1Var = this.a;
        dp1Var.e.c(1);
        n nVar = dp1Var.a;
        ((NativeMapView) nVar.a).P(Math.max(0.0d, Math.min(60.0d, ((NativeMapView) nVar.a).q() - ((double) (f * 0.1f)))));
        Iterator it = dp1Var.l.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
    }
}
