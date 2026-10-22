package org.maplibre.android.maps;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import defpackage.d31;
import defpackage.gn;
import defpackage.ha2;
import defpackage.ia2;
import defpackage.ij;
import defpackage.iv;
import defpackage.j21;
import defpackage.jf3;
import defpackage.jj;
import defpackage.jr2;
import defpackage.kv;
import defpackage.lj;
import defpackage.lv;
import defpackage.mn2;
import defpackage.n01;
import defpackage.nx0;
import defpackage.sq1;
import defpackage.ty1;
import defpackage.wh1;
import defpackage.zj1;
import java.util.ArrayList;
import java.util.HashMap;
import org.maplibre.android.annotations.BubbleLayout;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.annotations.Polygon;
import org.maplibre.android.annotations.Polyline;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g {
    public final ty1 a;
    public final jf3 b;
    public final l c;
    public final n d;
    public final kv e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g;
    public jr2 h;
    public d31 i;
    public lj j;
    public m k;

    public g(ty1 ty1Var, n nVar, jf3 jf3Var, l lVar, kv kvVar, ArrayList arrayList) {
        this.a = ty1Var;
        this.b = jf3Var;
        this.c = lVar;
        this.d = nVar;
        this.e = kvVar;
        this.g = arrayList;
    }

    public final Marker a(sq1 sq1Var) {
        gn gnVar = (gn) this.j.i;
        b bVar = (b) gnVar.c;
        LatLng latLng = sq1Var.e;
        if (latLng == null) {
            throw new iv("Adding an invalid Marker to a Map. Missing the required position field. Provide a non null LatLng as position to the Marker.");
        }
        Marker marker = new Marker(latLng, sq1Var.h, sq1Var.g, sq1Var.f);
        n01 n01VarC = marker.h;
        if (n01VarC == null) {
            n01VarC = bVar.c(marker);
        } else {
            Bitmap bitmapA = n01VarC.a();
            int width = bitmapA.getWidth();
            int height = bitmapA.getHeight();
            if (width > bVar.c) {
                bVar.c = width;
            }
            if (height > bVar.d) {
                bVar.d = height;
            }
        }
        bVar.a(n01VarC);
        marker.l = bVar.b(n01VarC);
        ty1 ty1Var = (ty1) gnVar.a;
        long jD = ty1Var != null ? ((NativeMapView) ty1Var).d(marker) : 0L;
        marker.f = this;
        marker.e = jD;
        ((zj1) gnVar.b).g(jD, marker);
        return marker;
    }

    public final void b(ha2 ha2Var) {
        jj jjVar = (jj) this.j.j;
        Polygon polygon = ha2Var.e;
        ty1 ty1Var = jjVar.a;
        long jE = ty1Var != null ? ((NativeMapView) ty1Var).e(polygon) : 0L;
        polygon.e = jE;
        polygon.f = this;
        jjVar.b.g(jE, polygon);
    }

    public final void c(ia2 ia2Var) {
        jj jjVar = (jj) this.j.k;
        Polyline polyline = ia2Var.e;
        ty1 ty1Var = jjVar.a;
        long jF = ty1Var != null ? ((NativeMapView) ty1Var).f(polyline) : 0L;
        polyline.f = this;
        polyline.e = jF;
        jjVar.b.g(jF, polyline);
    }

    public final void d(lv lvVar) {
        j();
        CameraPosition cameraPositionA = lvVar.a(this);
        if (cameraPositionA != null) {
            n nVar = this.d;
            if (cameraPositionA.equals(nVar.d)) {
                return;
            }
            nVar.a();
            nVar.e.c(3);
            nVar.b.e.c.add(nVar);
            ((NativeMapView) nVar.a).k(cameraPositionA.target, cameraPositionA.zoom, cameraPositionA.bearing, cameraPositionA.tilt, cameraPositionA.padding, 300L);
        }
    }

    public final void e() {
        lj ljVar = this.j;
        zj1 zj1Var = (zj1) ljVar.e;
        int iJ = zj1Var.j();
        long[] jArr = new long[iJ];
        ljVar.a.clear();
        for (int i = 0; i < iJ; i++) {
            long jF = zj1Var.f(i);
            jArr[i] = jF;
            ij ijVar = (ij) zj1Var.c(jF);
            if (ijVar instanceof Marker) {
                Marker marker = (Marker) ijVar;
                j21 j21Var = marker.j;
                if (j21Var != null) {
                    j21Var.a();
                }
                marker.k = false;
                b bVar = (b) ljVar.c;
                n01 n01Var = marker.h;
                HashMap map = bVar.a;
                Integer num = (Integer) map.get(n01Var);
                if (num != null) {
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue == 0) {
                        ((NativeMapView) bVar.b).C(n01Var.b);
                        map.remove(n01Var);
                    } else {
                        map.put(n01Var, Integer.valueOf(iIntValue));
                    }
                }
            }
        }
        jj jjVar = (jj) ljVar.g;
        zj1 zj1Var2 = jjVar.b;
        int iJ2 = zj1Var2.j();
        long[] jArr2 = new long[iJ2];
        for (int i2 = 0; i2 < iJ2; i2++) {
            jArr2[i2] = zj1Var2.f(i2);
        }
        ty1 ty1Var = jjVar.a;
        if (ty1Var != null) {
            ((NativeMapView) ty1Var).D(jArr2);
        }
        zj1Var2.a();
    }

    public final CameraPosition f(LatLngBounds latLngBounds, int[] iArr) {
        ty1 ty1Var = this.d.a;
        return g(latLngBounds, iArr, ((NativeMapView) ty1Var).m(), ((NativeMapView) ty1Var).q());
    }

    public final CameraPosition g(LatLngBounds latLngBounds, int[] iArr, double d, double d2) {
        return ((NativeMapView) this.a).n(latLngBounds, iArr, d, d2);
    }

    public final CameraPosition h() {
        n nVar = this.d;
        CameraPosition cameraPosition = nVar.d;
        if (cameraPosition != null) {
            return cameraPosition;
        }
        CameraPosition cameraPositionD = nVar.d();
        nVar.d = cameraPositionD;
        return cameraPositionD;
    }

    public final m i() {
        m mVar = this.k;
        if (mVar == null || !mVar.f) {
            return null;
        }
        return mVar;
    }

    public final void j() {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d31 d31Var = ((wh1) obj).a;
        }
    }

    public final void k() {
        ArrayList arrayList = ((nx0) this.j.d).a;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j21 j21Var = (j21) obj;
            g gVar = (g) j21Var.b.get();
            Marker marker = (Marker) j21Var.a.get();
            View view = (View) j21Var.c.get();
            if (gVar != null && marker != null && view != null) {
                PointF pointFD = gVar.c.d(marker.a());
                j21Var.g = pointFD;
                boolean z = view instanceof BubbleLayout;
                float f = pointFD.x;
                if (z) {
                    view.setX((f + j21Var.e) - j21Var.d);
                } else {
                    view.setX((f - (view.getMeasuredWidth() / 2)) - j21Var.d);
                }
                view.setY(j21Var.g.y + j21Var.f);
            }
        }
    }

    public final void l(String str, jr2 jr2Var) {
        mn2 mn2Var = new mn2(7);
        mn2Var.h = str;
        this.h = jr2Var;
        this.i.getClass();
        m mVar = this.k;
        if (mVar != null) {
            mVar.d();
        }
        ty1 ty1Var = this.a;
        this.k = new m(mn2Var, ty1Var);
        if (!TextUtils.isEmpty((String) mn2Var.h)) {
            ((NativeMapView) ty1Var).T((String) mn2Var.h);
        } else if (TextUtils.isEmpty(null)) {
            ((NativeMapView) ty1Var).S("{\"version\": 8,\"sources\": {},\"layers\": []}");
        } else {
            ((NativeMapView) ty1Var).S(null);
        }
    }

    public final void m(Marker marker) {
        n01 n01Var;
        lj ljVar = this.j;
        if (!ljVar.h(marker)) {
            lj.i(marker);
            return;
        }
        gn gnVar = (gn) ljVar.i;
        b bVar = (b) gnVar.c;
        n01 n01VarC = marker.h;
        if (n01VarC == null) {
            n01VarC = bVar.c(marker);
        }
        bVar.a(n01VarC);
        long j = marker.e;
        Marker marker2 = j != -1 ? (Marker) ((ij) ((jj) this.j.g).b.c(j)) : null;
        if (marker2 == null || (n01Var = marker2.h) == null || n01Var != marker.h) {
            marker.l = bVar.b(n01VarC);
        }
        ((NativeMapView) ((ty1) gnVar.a)).V(marker);
        zj1 zj1Var = (zj1) gnVar.b;
        zj1Var.i(zj1Var.d(marker.e), marker);
    }

    public final void n(Polygon polygon) {
        lj ljVar = this.j;
        if (!ljVar.h(polygon)) {
            lj.i(polygon);
            return;
        }
        jj jjVar = (jj) ljVar.j;
        ((NativeMapView) jjVar.a).W(polygon);
        zj1 zj1Var = jjVar.b;
        zj1Var.i(zj1Var.d(polygon.e), polygon);
    }

    public final void o(Polyline polyline) {
        lj ljVar = this.j;
        if (!ljVar.h(polyline)) {
            lj.i(polyline);
            return;
        }
        jj jjVar = (jj) ljVar.k;
        ((NativeMapView) jjVar.a).X(polyline);
        zj1 zj1Var = jjVar.b;
        zj1Var.i(zj1Var.d(polyline.e), polyline);
    }
}
