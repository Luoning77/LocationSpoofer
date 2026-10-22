package org.maplibre.android.maps;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import defpackage.eq1;
import defpackage.hv;
import defpackage.kv;
import defpackage.nv;
import defpackage.ty1;
import defpackage.zb3;
import org.maplibre.android.camera.CameraPosition;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n implements eq1 {
    public final ty1 a;
    public final k b;
    public CameraPosition d;
    public final kv e;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final zb3 f = new zb3(this);

    public n(k kVar, ty1 ty1Var, kv kvVar) {
        this.b = kVar;
        this.a = ty1Var;
        this.e = kvVar;
    }

    public final void a() {
        kv kvVar = this.e;
        kvVar.a.a(2);
        ((NativeMapView) this.a).h();
        kvVar.b();
    }

    @Override // defpackage.eq1
    public final void b(boolean z) {
        if (z) {
            d();
            this.e.b();
            this.b.e.c.remove(this);
        }
    }

    public final double c() {
        return ((NativeMapView) this.a).u();
    }

    public final CameraPosition d() {
        ty1 ty1Var = this.a;
        if (ty1Var != null) {
            CameraPosition cameraPositionO = ((NativeMapView) ty1Var).o();
            CameraPosition cameraPosition = this.d;
            if (cameraPosition != null && !cameraPosition.equals(cameraPositionO)) {
                this.e.a();
            }
            this.d = cameraPositionO;
        }
        return this.d;
    }

    public final void e(double d, double d2, long j) {
        if (j > 0) {
            this.b.e.c.add(this.f);
        }
        ((NativeMapView) this.a).x(d, d2, j);
    }

    public final void f(g gVar, nv nvVar) {
        CameraPosition cameraPositionA = nvVar.a(gVar);
        if (cameraPositionA.equals(this.d)) {
            return;
        }
        a();
        kv kvVar = this.e;
        kvVar.c(3);
        ((NativeMapView) this.a).v(cameraPositionA.target, cameraPositionA.zoom, cameraPositionA.tilt, cameraPositionA.bearing, cameraPositionA.padding);
        d();
        kvVar.b();
        this.c.post(new hv(2));
    }

    public final void g(double d, PointF pointF) {
        ((NativeMapView) this.a).U(d, pointF);
    }

    public final void h(double d, PointF pointF) {
        g(((NativeMapView) this.a).u() + d, pointF);
    }
}
