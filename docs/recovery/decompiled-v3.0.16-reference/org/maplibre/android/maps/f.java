package org.maplibre.android.maps;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import defpackage.az2;
import defpackage.b81;
import defpackage.dp1;
import defpackage.gn;
import defpackage.hw1;
import defpackage.i03;
import defpackage.ij;
import defpackage.j21;
import defpackage.jf3;
import defpackage.jj;
import defpackage.kj;
import defpackage.lj;
import defpackage.nx0;
import defpackage.ty1;
import defpackage.zj1;
import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.android.MapLibre;
import org.maplibre.android.annotations.Marker;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f implements i03 {
    public final float a;
    public final /* synthetic */ dp1 b;

    public f(dp1 dp1Var, float f) {
        this.b = dp1Var;
        this.a = f;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        dp1 dp1Var = this.b;
        if (actionMasked == 0) {
            dp1Var.n = new PointF(motionEvent.getX(), motionEvent.getY());
            hw1 hw1Var = dp1Var.o.h;
            hw1Var.g = false;
            if (hw1Var.q) {
                hw1Var.r = true;
            }
            dp1Var.t = true;
        }
        if (motionEvent.getActionMasked() == 1) {
            float fAbs = Math.abs(motionEvent.getX() - dp1Var.n.x);
            float fAbs2 = Math.abs(motionEvent.getY() - dp1Var.n.y);
            float f = this.a;
            if (fAbs <= f && fAbs2 <= f) {
                jf3 jf3Var = dp1Var.c;
                if (jf3Var.m && jf3Var.p) {
                    PointF pointF = dp1Var.m;
                    if (pointF != null) {
                        dp1Var.n = pointF;
                    }
                    dp1Var.f(true, dp1Var.n, false);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        double d;
        dp1 dp1Var = this.b;
        n nVar = dp1Var.a;
        jf3 jf3Var = dp1Var.c;
        if (!jf3Var.n || !jf3Var.t) {
            return false;
        }
        float f3 = jf3Var.j;
        double dHypot = Math.hypot(f / f3, f2 / f3);
        jf3Var.getClass();
        if (dHypot < 1000.0d) {
            return false;
        }
        double dQ = ((NativeMapView) nVar.a).q();
        double d2 = dQ != 0.0d ? dQ / 10.0d : 0.0d;
        jf3Var.getClass();
        long j = (long) (((dHypot / 7.0d) / (d2 + 1.5d)) + 150.0d);
        float f4 = j;
        double d3 = (((double) (f * f4)) * 0.28d) / 1000.0d;
        double d4 = (((double) (f4 * f2)) * 0.28d) / 1000.0d;
        if (jf3Var.o) {
            d = d3;
        } else {
            if (Math.abs(Math.toDegrees(Math.atan(d3 / d4))) > 75.0d) {
                return false;
            }
            d = 0.0d;
        }
        nVar.a();
        Iterator it = dp1Var.h.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
        dp1Var.e.c(1);
        dp1Var.a.e(d, d4, j);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        dp1 dp1Var = this.b;
        Iterator it = dp1Var.g.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                b81.u();
            } else {
                dp1Var.b.a(pointF);
                throw null;
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        dp1 dp1Var = this.b;
        lj ljVar = dp1Var.d;
        b bVar = (b) ljVar.c;
        ArrayList arrayList = ljVar.a;
        int i = (int) (((double) bVar.d) * 1.5d);
        int i2 = (int) (((double) bVar.c) * 1.5d);
        float f = pointF.x;
        float f2 = i;
        float f3 = pointF.y;
        float f4 = i2;
        RectF rectF = new RectF(f - f2, f3 - f4, f + f2, f3 + f4);
        gn gnVar = (gn) ljVar.i;
        NativeMapView nativeMapView = (NativeMapView) ((ty1) gnVar.a);
        nativeMapView.getClass();
        float f5 = rectF.left;
        float f6 = nativeMapView.e;
        long[] jArrA = nativeMapView.A(new RectF(f5 / f6, rectF.top / f6, rectF.right / f6, rectF.bottom / f6));
        ArrayList arrayList2 = new ArrayList(jArrA.length);
        for (long j : jArrA) {
            arrayList2.add(Long.valueOf(j));
        }
        ArrayList arrayList3 = new ArrayList(jArrA.length);
        zj1 zj1Var = (zj1) gnVar.b;
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < zj1Var.j(); i3++) {
            arrayList4.add((ij) zj1Var.c(zj1Var.f(i3)));
        }
        int size = arrayList4.size();
        for (int i4 = 0; i4 < size; i4++) {
            ij ijVar = (ij) arrayList4.get(i4);
            if ((ijVar instanceof Marker) && arrayList2.contains(Long.valueOf(ijVar.e))) {
                arrayList3.add((Marker) ijVar);
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList3);
        kj kjVar = new kj((g) ljVar.f);
        int size2 = arrayList5.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList5.get(i5);
            i5++;
            Marker marker = (Marker) obj;
            kjVar.f = kjVar.a.d(marker.a());
            Bitmap bitmapA = marker.h.a();
            kjVar.c = bitmapA;
            int height = bitmapA.getHeight();
            kjVar.e = height;
            int i6 = kjVar.b;
            if (height < i6) {
                kjVar.e = i6;
            }
            int width = kjVar.c.getWidth();
            kjVar.d = width;
            if (width < i6) {
                kjVar.d = i6;
            } else {
                i6 = width;
            }
            float f7 = i6;
            float f8 = kjVar.e;
            RectF rectF2 = kjVar.g;
            rectF2.set(0.0f, 0.0f, f7, f8);
            PointF pointF2 = kjVar.f;
            rectF2.offsetTo(pointF2.x - (kjVar.d / 2), pointF2.y - (kjVar.e / 2));
            if (rectF2.contains(rectF.centerX(), rectF.centerY())) {
                rectF2.intersect(rectF);
                if (rectF2.height() * rectF2.width() > kjVar.h.height() * kjVar.h.width()) {
                    kjVar.h = new RectF(rectF2);
                    kjVar.i = marker.e;
                }
            }
        }
        long j2 = kjVar.i;
        if (j2 != -1) {
            Marker marker2 = (Marker) ((ij) ((jj) ljVar.g).b.c(j2));
            if (!arrayList.contains(marker2)) {
                nx0 nx0Var = (nx0) ljVar.d;
                if (!arrayList.contains(marker2)) {
                    ljVar.b();
                    if (marker2 != null && (!TextUtils.isEmpty(marker2.i) || !TextUtils.isEmpty(marker2.g))) {
                        nx0Var.a.add(marker2.d((g) ljVar.f, (k) ljVar.b));
                    }
                    arrayList.add(marker2);
                    return true;
                }
            } else if (arrayList.contains(marker2)) {
                if (marker2.k) {
                    j21 j21Var = marker2.j;
                    if (j21Var != null) {
                        j21Var.a();
                    }
                    marker2.k = false;
                }
                arrayList.remove(marker2);
                return true;
            }
        } else {
            float dimension = MapLibre.getApplicationContext().getResources().getDimension(2131099752);
            float f9 = pointF.x;
            float f10 = pointF.y;
            RectF rectF3 = new RectF(f9 - dimension, f10 - dimension, f9 + dimension, f10 + dimension);
            jj jjVar = (jj) ljVar.h;
            NativeMapView nativeMapView2 = (NativeMapView) jjVar.a;
            nativeMapView2.getClass();
            float f11 = rectF3.left;
            float f12 = nativeMapView2.e;
            long[] jArrB = nativeMapView2.B(new RectF(f11 / f12, rectF3.top / f12, rectF3.right / f12, rectF3.bottom / f12));
            ArrayList arrayList6 = new ArrayList();
            for (long j3 : jArrB) {
                ij ijVar2 = (ij) jjVar.b.c(j3);
                if (ijVar2 != null) {
                    arrayList6.add(ijVar2);
                }
            }
            if (arrayList6.size() > 0) {
            }
            if (dp1Var.c.x) {
                ljVar.b();
            }
            Iterator it = dp1Var.f.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    b81.u();
                    return false;
                }
                dp1Var.b.a(pointF);
                throw null;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.b.a.a();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
