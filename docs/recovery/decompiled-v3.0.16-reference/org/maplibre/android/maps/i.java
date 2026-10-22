package org.maplibre.android.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.aq1;
import defpackage.cq1;
import defpackage.d31;
import defpackage.dp1;
import defpackage.gn;
import defpackage.ij;
import defpackage.j21;
import defpackage.jf3;
import defpackage.jj;
import defpackage.jp1;
import defpackage.lj;
import defpackage.mn2;
import defpackage.n01;
import defpackage.nv;
import defpackage.qr2;
import defpackage.r00;
import defpackage.ty1;
import defpackage.xq1;
import defpackage.zj1;
import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.android.MapLibre;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.log.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ k e;

    public i(k kVar) {
        this.e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.e;
        if (kVar.n || kVar.i != null) {
            return;
        }
        Context context = kVar.getContext();
        cq1 cq1Var = kVar.q;
        cq1Var.a.add(new aq1(kVar));
        l lVar = new l(kVar.h, kVar);
        jf3 jf3Var = new jf3(lVar, cq1Var, kVar.getPixelRatio(), kVar);
        zj1 zj1Var = new zj1((Object) null);
        b bVar = new b(kVar.h);
        ty1 ty1Var = kVar.h;
        lj ljVar = new lj(kVar, zj1Var, bVar, new jj(ty1Var, zj1Var), new gn(ty1Var, zj1Var, bVar), new jj(ty1Var, zj1Var), new jj(ty1Var, zj1Var), new jj(ty1Var, zj1Var));
        n nVar = new n(kVar, kVar.h, kVar.r);
        ArrayList arrayList = new ArrayList();
        g gVar = new g(kVar.h, nVar, jf3Var, lVar, kVar.r, arrayList);
        kVar.i = gVar;
        ljVar.f = gVar;
        gVar.j = ljVar;
        dp1 dp1Var = new dp1(context, nVar, lVar, jf3Var, ljVar, kVar.r);
        kVar.s = dp1Var;
        mn2 mn2Var = new mn2();
        mn2Var.e = nVar;
        mn2Var.f = jf3Var;
        mn2Var.g = dp1Var;
        kVar.t = mn2Var;
        g gVar2 = kVar.i;
        gVar2.i = new d31(gVar2, arrayList);
        kVar.setClickable(true);
        kVar.setLongClickable(true);
        kVar.setFocusable(true);
        kVar.setFocusableInTouchMode(true);
        kVar.requestDisallowInterceptTouchEvent(true);
        ((NativeMapView) kVar.h).R(MapLibre.isConnected().booleanValue());
        Bundle bundle = kVar.u;
        g gVar3 = kVar.i;
        if (bundle == null) {
            jp1 jp1Var = kVar.l;
            ty1 ty1Var2 = gVar3.a;
            ty1 ty1Var3 = gVar3.a;
            n nVar2 = gVar3.d;
            ty1 ty1Var4 = nVar2.a;
            CameraPosition cameraPosition = jp1Var.e;
            if (cameraPosition != null && !cameraPosition.equals(CameraPosition.e)) {
                nVar2.f(gVar3, xq1.I(cameraPosition));
            }
            double d = jp1Var.s;
            if (d < 0.0d || d > 25.5d) {
                Logger.e("Mbgl-Transform", "Not setting minZoomPreference, value is in unsupported range: " + d);
            } else {
                ((NativeMapView) ty1Var4).O(d);
            }
            double d2 = jp1Var.t;
            if (d2 < 0.0d || d2 > 25.5d) {
                Logger.e("Mbgl-Transform", "Not setting maxZoomPreference, value is in unsupported range: " + d2);
            } else {
                ((NativeMapView) ty1Var4).M(d2);
            }
            double d3 = jp1Var.u;
            if (d3 < 0.0d || d3 > 60.0d) {
                Logger.e("Mbgl-Transform", "Not setting minPitchPreference, value is in unsupported range: " + d3);
            } else {
                ((NativeMapView) ty1Var4).N(d3);
            }
            double d4 = jp1Var.v;
            if (d4 < 0.0d || d4 > 60.0d) {
                Logger.e("Mbgl-Transform", "Not setting maxPitchPreference, value is in unsupported range: " + d4);
            } else {
                ((NativeMapView) ty1Var4).L(d4);
            }
            jf3 jf3Var2 = gVar3.b;
            Resources resources = context.getResources();
            jf3Var2.m = jp1Var.A;
            jf3Var2.n = jp1Var.x;
            jf3Var2.o = jp1Var.y;
            jf3Var2.k = jp1Var.w;
            jf3Var2.l = jp1Var.z;
            jf3Var2.p = jp1Var.B;
            jf3Var2.q = jp1Var.C;
            if (jp1Var.g) {
                jf3Var2.b(jp1Var, resources);
            }
            if (jp1Var.l) {
                jf3Var2.c(jp1Var, resources);
            }
            if (jp1Var.p) {
                jf3Var2.a(context, jp1Var);
            }
            NativeMapView nativeMapView = (NativeMapView) ty1Var2;
            nativeMapView.J(jp1Var.f);
            String str = jp1Var.J;
            if (!TextUtils.isEmpty(str) && !nativeMapView.i("setApiBaseUrl")) {
                nativeMapView.a.setApiBaseUrl(str);
            }
            if (jp1Var.D) {
                ((NativeMapView) ty1Var3).Q(jp1Var.E);
            } else {
                ((NativeMapView) ty1Var3).Q(0);
            }
        } else {
            gVar3.getClass();
            CameraPosition cameraPosition2 = (CameraPosition) bundle.getParcelable("maplibre_cameraPosition");
            jf3 jf3Var3 = gVar3.b;
            jf3Var3.o = bundle.getBoolean("maplibre_horizontalScrollEnabled");
            jf3Var3.m = bundle.getBoolean("maplibre_zoomEnabled");
            jf3Var3.n = bundle.getBoolean("maplibre_scrollEnabled");
            jf3Var3.k = bundle.getBoolean("maplibre_rotateEnabled");
            jf3Var3.l = bundle.getBoolean("maplibre_tiltEnabled");
            jf3Var3.p = bundle.getBoolean("maplibre_doubleTapEnabled");
            jf3Var3.r = bundle.getBoolean("maplibre_scaleAnimationEnabled");
            jf3Var3.s = bundle.getBoolean("maplibre_rotateAnimationEnabled");
            jf3Var3.t = bundle.getBoolean("maplibre_flingAnimationEnabled");
            bundle.getBoolean("maplibre_increaseRotateThreshold");
            jf3Var3.u = bundle.getBoolean("maplibre_disableRotateWhenScaling");
            jf3Var3.v = bundle.getBoolean("maplibre_increaseScaleThreshold");
            jf3Var3.q = bundle.getBoolean("maplibre_quickZoom");
            jf3Var3.w = bundle.getFloat("maplibre_zoomRate", 1.0f);
            k kVar2 = jf3Var3.b;
            if (bundle.getBoolean("maplibre_compassEnabled") && !jf3Var3.y) {
                jf3Var3.d = kVar2.b();
                jf3Var3.y = true;
            }
            jf3Var3.e(bundle.getBoolean("maplibre_compassEnabled"));
            int i = bundle.getInt("maplibre_compassGravity");
            r00 r00Var = jf3Var3.d;
            if (r00Var != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r00Var.getLayoutParams();
                layoutParams.gravity = i;
                r00Var.setLayoutParams(layoutParams);
            }
            int i2 = bundle.getInt("maplibre_compassMarginLeft");
            int i3 = bundle.getInt("maplibre_compassMarginTop");
            int i4 = bundle.getInt("maplibre_compassMarginRight");
            int i5 = bundle.getInt("maplibre_compassMarginBottom");
            r00 r00Var2 = jf3Var3.d;
            if (r00Var2 != null) {
                jf3.g(i2, i3, i4, i5, r00Var2, jf3Var3.e);
            }
            boolean z = bundle.getBoolean("maplibre_compassFade");
            r00 r00Var3 = jf3Var3.d;
            if (r00Var3 != null) {
                r00Var3.f = z;
            }
            Context context2 = kVar2.getContext();
            byte[] byteArray = bundle.getByteArray("maplibre_compassImage");
            BitmapDrawable bitmapDrawable = byteArray == null ? null : new BitmapDrawable(context2.getResources(), BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            r00 r00Var4 = jf3Var3.d;
            if (r00Var4 != null) {
                r00Var4.setCompassImage(bitmapDrawable);
            }
            if (bundle.getBoolean("maplibre_logoEnabled") && !jf3Var3.A) {
                jf3Var3.h = kVar2.c();
                jf3Var3.A = true;
            }
            jf3Var3.f(bundle.getBoolean("maplibre_logoEnabled"));
            int i6 = bundle.getInt("maplibre_logoGravity");
            ImageView imageView = jf3Var3.h;
            if (imageView != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams2.gravity = i6;
                imageView.setLayoutParams(layoutParams2);
            }
            int i7 = bundle.getInt("maplibre_logoMarginLeft");
            int i8 = bundle.getInt("maplibre_logoMarginTop");
            int i9 = bundle.getInt("maplibre_logoMarginRight");
            int i10 = bundle.getInt("maplibre_logoMarginBottom");
            ImageView imageView2 = jf3Var3.h;
            if (imageView2 != null) {
                jf3.g(i7, i8, i9, i10, imageView2, jf3Var3.i);
            }
            if (bundle.getBoolean("maplibre_atrrEnabled") && !jf3Var3.z) {
                jf3Var3.f = kVar2.a();
                jf3Var3.z = true;
            }
            jf3Var3.d(bundle.getBoolean("maplibre_atrrEnabled"));
            int i11 = bundle.getInt("maplibre_attrGravity");
            ImageView imageView3 = jf3Var3.f;
            if (imageView3 != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) imageView3.getLayoutParams();
                layoutParams3.gravity = i11;
                imageView3.setLayoutParams(layoutParams3);
            }
            int i12 = bundle.getInt("maplibre_attrMarginLeft");
            int i13 = bundle.getInt("maplibre_attrMarginTop");
            int i14 = bundle.getInt("maplibre_attrMarginRight");
            int i15 = bundle.getInt("maplibre_atrrMarginBottom");
            ImageView imageView4 = jf3Var3.f;
            if (imageView4 != null) {
                jf3.g(i12, i13, i14, i15, imageView4, jf3Var3.g);
            }
            jf3Var3.x = bundle.getBoolean("maplibre_deselectMarkerOnTap");
            PointF pointF = (PointF) bundle.getParcelable("maplibre_userFocalPoint");
            if (pointF != null) {
                jf3Var3.a.a(pointF);
            }
            if (cameraPosition2 != null) {
                nv nvVarI = xq1.I(new CameraPosition(cameraPosition2.target, cameraPosition2.zoom, cameraPosition2.tilt, cameraPosition2.bearing, cameraPosition2.padding));
                gVar3.j();
                gVar3.d.f(gVar3, nvVarI);
            }
            ((NativeMapView) gVar3.a).J(bundle.getBoolean("maplibre_debugActive"));
        }
        j jVar = kVar.f;
        k kVar3 = jVar.b;
        g gVar4 = kVar3.i;
        gVar4.d.d();
        gn gnVar = (gn) gVar4.j.i;
        ty1 ty1Var5 = (ty1) gnVar.a;
        zj1 zj1Var2 = (zj1) gnVar.b;
        b bVar2 = (b) gnVar.c;
        Iterator it = bVar2.a.keySet().iterator();
        while (it.hasNext()) {
            bVar2.d((n01) it.next());
        }
        int iJ = zj1Var2.j();
        for (int i16 = 0; i16 < iJ; i16++) {
            ij ijVar = (ij) zj1Var2.c(i16);
            if (ijVar instanceof Marker) {
                Marker marker = (Marker) ijVar;
                long j = ijVar.e;
                NativeMapView nativeMapView2 = (NativeMapView) ty1Var5;
                if (!nativeMapView2.i("removeAnnotation")) {
                    nativeMapView2.D(new long[]{j});
                }
                marker.e = nativeMapView2.d(marker);
            }
        }
        lj ljVar2 = gVar4.j;
        zj1 zj1Var3 = (zj1) ljVar2.e;
        int iJ2 = zj1Var3.j();
        for (int i17 = 0; i17 < iJ2; i17++) {
            ij ijVar2 = (ij) zj1Var3.c(i17);
            if (ijVar2 instanceof Marker) {
                Marker marker2 = (Marker) ijVar2;
                marker2.l = ((b) ljVar2.c).b(marker2.h);
            }
        }
        ArrayList arrayList2 = ljVar2.a;
        int size = arrayList2.size();
        int i18 = 0;
        while (i18 < size) {
            Object obj = arrayList2.get(i18);
            i18++;
            Marker marker3 = (Marker) obj;
            if (marker3.k) {
                j21 j21Var = marker3.j;
                if (j21Var != null) {
                    j21Var.a();
                }
                marker3.k = false;
                marker3.d(gVar4, (k) ljVar2.b);
            }
        }
        ArrayList arrayList3 = jVar.a;
        if (arrayList3.size() > 0) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                qr2 qr2Var = (qr2) it2.next();
                if (qr2Var != null) {
                    qr2Var.a(kVar3.i);
                }
                it2.remove();
            }
        }
        kVar3.i.d.d();
        kVar.i.i.getClass();
    }
}
