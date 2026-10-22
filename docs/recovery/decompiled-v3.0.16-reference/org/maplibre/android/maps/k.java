package org.maplibre.android.maps;

import android.animation.Animator;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.bq1;
import defpackage.cq1;
import defpackage.d31;
import defpackage.dp1;
import defpackage.dq1;
import defpackage.ep1;
import defpackage.fo;
import defpackage.iv;
import defpackage.jf3;
import defpackage.jp1;
import defpackage.kv;
import defpackage.ma3;
import defpackage.mn2;
import defpackage.na3;
import defpackage.pp1;
import defpackage.pq;
import defpackage.r00;
import defpackage.ty1;
import defpackage.vo1;
import defpackage.w;
import defpackage.xp1;
import java.util.ArrayList;
import org.maplibre.android.MapLibre;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.storage.FileSource;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k extends FrameLayout {
    public final vo1 e;
    public final j f;
    public final dq1 g;
    public ty1 h;
    public g i;
    public final View j;
    public bq1 k;
    public final jp1 l;
    public final MapRenderer m;
    public boolean n;
    public r00 o;
    public PointF p;
    public final cq1 q;
    public final kv r;
    public dp1 s;
    public mn2 t;
    public Bundle u;
    public boolean v;

    public k(Context context, jp1 jp1Var) {
        super(context);
        vo1 vo1Var = new vo1();
        this.e = vo1Var;
        this.f = new j(this);
        this.g = new dq1(this);
        this.q = new cq1(this);
        this.r = new kv();
        na3.a.getClass();
        ma3.a(new Object[0]);
        if (isInEditMode()) {
            return;
        }
        if (!MapLibre.hasInstance()) {
            throw new iv();
        }
        setForeground(new ColorDrawable(jp1Var.M));
        this.l = jp1Var;
        setContentDescription(context.getString(2131624689));
        setWillNotDraw(false);
        MapRenderer mapRendererCreate = MapRenderer.create(jp1Var, getContext(), new w(this, 11));
        this.m = mapRendererCreate;
        View view = mapRendererCreate.getView();
        this.j = view;
        addView(view, 0);
        jp1Var.N = getPixelRatio();
        this.h = new NativeMapView(getContext(), jp1Var, this, vo1Var, this.m);
    }

    public static void setMapStrictModeEnabled(boolean z) {
        synchronized (xp1.class) {
            xp1.a = z;
        }
    }

    public final ImageView a() {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        imageView.setTag("attrView");
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = -2;
        imageView.setAdjustViewBounds(true);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setContentDescription(getResources().getString(2131624687));
        Drawable drawable = getContext().getDrawable(2131165283);
        if (drawable == null) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        bq1 bq1Var = new bq1(getContext(), this.i);
        this.k = bq1Var;
        imageView.setOnClickListener(bq1Var);
        return imageView;
    }

    public final r00 b() {
        Context context = getContext();
        r00 r00Var = new r00(context);
        r00Var.e = 0.0f;
        r00Var.f = true;
        r00Var.i = false;
        r00Var.setEnabled(false);
        int i = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        r00Var.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        this.o = r00Var;
        addView(r00Var);
        this.o.setTag("compassView");
        this.o.getLayoutParams().width = -2;
        this.o.getLayoutParams().height = -2;
        this.o.setContentDescription(getResources().getString(2131624688));
        r00 r00Var2 = this.o;
        kv kvVar = this.r;
        r00Var2.h = new d31(23, this, kvVar, false);
        r00Var2.setOnClickListener(new h(this, kvVar));
        return this.o;
    }

    public final ImageView c() {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        imageView.setTag("logoView");
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = -2;
        Drawable drawable = getContext().getDrawable(2131165287);
        if (drawable == null) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    public final void d() {
        this.n = true;
        vo1 vo1Var = this.e;
        vo1Var.a.clear();
        vo1Var.b.clear();
        vo1Var.c.clear();
        vo1Var.d.clear();
        vo1Var.e.clear();
        vo1Var.f.clear();
        vo1Var.g.clear();
        vo1Var.h.clear();
        vo1Var.j.clear();
        vo1Var.k.clear();
        vo1Var.l.clear();
        vo1Var.m.clear();
        vo1Var.n.clear();
        vo1Var.o.clear();
        vo1Var.p.clear();
        vo1Var.q.clear();
        vo1Var.r.clear();
        vo1Var.s.clear();
        vo1Var.t.clear();
        vo1Var.u.clear();
        vo1Var.v.clear();
        vo1Var.w.clear();
        vo1Var.x.clear();
        vo1Var.y.clear();
        vo1Var.z.clear();
        vo1Var.A.clear();
        vo1Var.B.clear();
        j jVar = this.f;
        jVar.a.clear();
        vo1 vo1Var2 = jVar.b.e;
        vo1Var2.m.remove(jVar);
        vo1Var2.i.remove(jVar);
        vo1Var2.e.remove(jVar);
        vo1Var2.b.remove(jVar);
        vo1Var2.c.remove(jVar);
        vo1Var2.f.remove(jVar);
        dq1 dq1Var = this.g;
        dq1Var.b.e.i.remove(dq1Var);
        r00 r00Var = this.o;
        if (r00Var != null) {
            r00Var.b();
        }
        g gVar = this.i;
        if (gVar != null) {
            gVar.i.getClass();
            m mVar = gVar.k;
            if (mVar != null) {
                mVar.d();
            }
            kv kvVar = gVar.e;
            kvVar.a.removeCallbacksAndMessages(null);
            kvVar.d.clear();
            kvVar.e.clear();
            kvVar.f.clear();
            kvVar.g.clear();
        }
        ty1 ty1Var = this.h;
        if (ty1Var != null) {
            ((NativeMapView) ty1Var).j();
            this.h = null;
        }
        MapRenderer mapRenderer = this.m;
        if (mapRenderer != null) {
            mapRenderer.onDestroy();
        }
    }

    public final void e() {
        ty1 ty1Var = this.h;
        if (ty1Var == null || this.i == null || this.n) {
            return;
        }
        ((NativeMapView) ty1Var).y();
    }

    public final void f() {
        bq1 bq1Var = this.k;
        if (bq1Var != null) {
            ((jf3) bq1Var.g).getClass();
            a aVar = (a) bq1Var.f;
            AlertDialog alertDialog = aVar.h;
            if (alertDialog != null && alertDialog.isShowing()) {
                aVar.h.dismiss();
            }
        }
        if (this.i != null) {
            this.s.a();
            this.i.i.getClass();
        }
        MapRenderer mapRenderer = this.m;
        if (mapRenderer != null) {
            mapRenderer.onStop();
        }
        if (this.v) {
            org.maplibre.android.net.a aVarA = org.maplibre.android.net.a.a(getContext());
            int i = aVarA.c - 1;
            aVarA.c = i;
            if (i == 0) {
                aVarA.b.unregisterReceiver(org.maplibre.android.net.a.e);
            }
            FileSource.b(getContext()).deactivate();
            this.v = false;
        }
    }

    public g getMapLibreMap() {
        return this.i;
    }

    public float getPixelRatio() {
        float f = this.l.N;
        return f == 0.0f ? getResources().getDisplayMetrics().density : f;
    }

    public View getRenderView() {
        return this.j;
    }

    public pp1 getRenderingRefreshMode() {
        MapRenderer mapRenderer = this.m;
        if (mapRenderer != null) {
            return mapRenderer.getRenderingRefreshMode();
        }
        fo.n("Calling MapView#getRenderingRefreshMode before mapRenderer is created.");
        return null;
    }

    public Bitmap getViewContent() {
        setDrawingCacheEnabled(true);
        setDrawingCacheQuality(524288);
        buildDrawingCache();
        if (getDrawingCache() == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawingCache());
        setDrawingCacheEnabled(false);
        destroyDrawingCache();
        return bitmapCreateBitmap;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        dp1 dp1Var = this.s;
        if (dp1Var == null) {
            return super.onGenericMotionEvent(motionEvent);
        }
        n nVar = dp1Var.a;
        if ((motionEvent.getSource() & 2) != 2 || motionEvent.getActionMasked() != 8 || !dp1Var.c.m) {
            return super.onGenericMotionEvent(motionEvent);
        }
        nVar.a();
        nVar.h(motionEvent.getAxisValue(9), new PointF(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        mn2 mn2Var = this.t;
        if (mn2Var == null) {
            return super.onKeyDown(i, keyEvent);
        }
        n nVar = (n) mn2Var.e;
        n nVar2 = (n) mn2Var.e;
        jf3 jf3Var = (jf3) mn2Var.f;
        double d = keyEvent.getRepeatCount() >= 5 ? 50.0d : 10.0d;
        if (i != 66) {
            switch (i) {
                case 19:
                    if (jf3Var.n) {
                        nVar.a();
                        nVar2.e(0.0d, d, 0L);
                        return true;
                    }
                    break;
                case 20:
                    if (jf3Var.n) {
                        nVar.a();
                        nVar2.e(0.0d, -d, 0L);
                        return true;
                    }
                    break;
                case 21:
                    if (jf3Var.n) {
                        nVar.a();
                        nVar2.e(d, 0.0d, 0L);
                        return true;
                    }
                    break;
                case 22:
                    if (jf3Var.n) {
                        nVar.a();
                        nVar2.e(-d, 0.0d, 0L);
                        return true;
                    }
                    break;
            }
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        mn2 mn2Var = this.t;
        if (mn2Var == null) {
            return super.onKeyLongPress(i, keyEvent);
        }
        jf3 jf3Var = (jf3) mn2Var.f;
        if (i == 23 || i == 66) {
            boolean z = jf3Var.m;
            l lVar = jf3Var.c;
            if (z) {
                ((dp1) mn2Var.g).f(false, new PointF(lVar.c() / 2.0f, lVar.b() / 2.0f), true);
                return true;
            }
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        mn2 mn2Var = this.t;
        if (mn2Var == null) {
            return super.onKeyUp(i, keyEvent);
        }
        jf3 jf3Var = (jf3) mn2Var.f;
        if (!keyEvent.isCanceled() && (i == 23 || i == 66)) {
            boolean z = jf3Var.m;
            l lVar = jf3Var.c;
            if (z) {
                ((dp1) mn2Var.g).f(true, new PointF(lVar.c() / 2.0f, lVar.b() / 2.0f), true);
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ty1 ty1Var;
        if (isInEditMode() || (ty1Var = this.h) == null) {
            return;
        }
        ((NativeMapView) ty1Var).H(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        dp1 dp1Var = this.s;
        if (dp1Var == null) {
            return super.onTouchEvent(motionEvent);
        }
        n nVar = dp1Var.a;
        ArrayList arrayList = dp1Var.r;
        if (motionEvent != null && (motionEvent.getButtonState() == 0 || motionEvent.getButtonState() == 1)) {
            if (motionEvent.getActionMasked() == 0) {
                dp1Var.a();
                ((NativeMapView) nVar.a).K(true);
            }
            ArrayList arrayList2 = dp1Var.o.b;
            int size = arrayList2.size();
            z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                pq pqVar = (pq) obj;
                MotionEvent motionEvent2 = pqVar.e;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    pqVar.e = null;
                }
                MotionEvent motionEvent3 = pqVar.d;
                if (motionEvent3 != null) {
                    pqVar.e = MotionEvent.obtain(motionEvent3);
                    pqVar.d.recycle();
                    pqVar.d = null;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                pqVar.d = motionEventObtain;
                pqVar.f = motionEventObtain.getEventTime() - pqVar.d.getDownTime();
                if (pqVar.a(motionEvent)) {
                    z = true;
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                if (dp1Var.t) {
                    dp1Var.o.h.g = true;
                    dp1Var.t = false;
                }
                ((NativeMapView) nVar.a).K(false);
                nVar.d();
                if (!arrayList.isEmpty()) {
                    dp1Var.s.removeCallbacksAndMessages(null);
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        ((Animator) obj2).start();
                    }
                    arrayList.clear();
                }
            } else if (actionMasked == 3) {
                arrayList.clear();
                ((NativeMapView) nVar.a).K(false);
                nVar.d();
                if (dp1Var.t) {
                    dp1Var.o.h.g = true;
                    dp1Var.t = false;
                }
            } else if (actionMasked == 5 && dp1Var.t) {
                dp1Var.o.h.g = true;
                dp1Var.t = false;
            }
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[RETURN] */
    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        mn2 mn2Var = this.t;
        if (mn2Var == null) {
            return super.onTrackballEvent(motionEvent);
        }
        jf3 jf3Var = (jf3) mn2Var.f;
        n nVar = (n) mn2Var.e;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ep1 ep1Var = (ep1) mn2Var.h;
            if (ep1Var != null) {
                ep1Var.e = true;
                mn2Var.h = null;
            }
            mn2Var.h = new ep1(mn2Var);
            new Handler(Looper.getMainLooper()).postDelayed((ep1) mn2Var.h, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    ep1 ep1Var2 = (ep1) mn2Var.h;
                    if (ep1Var2 != null) {
                        ep1Var2.e = true;
                        mn2Var.h = null;
                        return true;
                    }
                }
            } else if (jf3Var.n) {
                nVar.a();
                nVar.e(((double) motionEvent.getX()) * (-10.0d), ((double) motionEvent.getY()) * (-10.0d), 0L);
                return true;
            }
            if (super.onTrackballEvent(motionEvent)) {
                return false;
            }
        } else {
            boolean z = jf3Var.m;
            l lVar = jf3Var.c;
            if (z) {
                if (((ep1) mn2Var.h) != null) {
                    ((dp1) mn2Var.g).f(true, new PointF(lVar.c() / 2.0f, lVar.b() / 2.0f), true);
                }
            } else if (super.onTrackballEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    public void setMapLibreMap(g gVar) {
        this.i = gVar;
    }

    public void setMaximumFps(int i) {
        MapRenderer mapRenderer = this.m;
        if (mapRenderer != null) {
            mapRenderer.setMaximumFps(i);
        } else {
            fo.n("Calling MapView#setMaximumFps before mapRenderer is created.");
        }
    }

    public void setRenderingRefreshMode(pp1 pp1Var) {
        MapRenderer mapRenderer = this.m;
        if (mapRenderer != null) {
            mapRenderer.setRenderingRefreshMode(pp1Var);
        } else {
            fo.n("Calling MapView#setRenderingRefreshMode before mapRenderer is created.");
        }
    }
}
