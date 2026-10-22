package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.maps.d;
import org.maplibre.android.maps.e;
import org.maplibre.android.maps.f;
import org.maplibre.android.maps.l;
import org.maplibre.android.maps.n;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class dp1 {
    public final n a;
    public final l b;
    public final jf3 c;
    public final lj d;
    public final kv e;
    public PointF m;
    public final pd o;
    public ValueAnimator p;
    public ValueAnimator q;
    public boolean t;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList k = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList l = new CopyOnWriteArrayList();
    public PointF n = new PointF();
    public final ArrayList r = new ArrayList();
    public final Handler s = new Handler(Looper.getMainLooper());
    public final ab u = new ab(this, 5);

    public dp1(Context context, n nVar, l lVar, jf3 jf3Var, lj ljVar, kv kvVar) {
        this.d = ljVar;
        this.a = nVar;
        this.b = lVar;
        this.c = jf3Var;
        this.e = kvVar;
        if (context != null) {
            pd pdVar = new pd(context);
            HashSet hashSet = new HashSet();
            hashSet.add(3);
            hashSet.add(1);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(3);
            hashSet2.add(2);
            HashSet hashSet3 = new HashSet();
            hashSet3.add(1);
            hashSet3.add(6);
            List listAsList = Arrays.asList(hashSet, hashSet2, hashSet3);
            ArrayList arrayList = pdVar.a;
            arrayList.clear();
            arrayList.addAll(listAsList);
            pdVar.e.v = 3.0f;
            hw1 hw1Var = pdVar.h;
            hw1Var.x = hw1Var.a.getResources().getDimension(2131099760);
            this.o = pdVar;
            f fVar = new f(this, context.getResources().getDimension(2131099746));
            ap1 ap1Var = new ap1(this);
            bp1 bp1Var = new bp1(this, context.getResources().getDimension(2131099751), context.getResources().getDimension(2131099762), context.getResources().getDimension(2131099758), context.getResources().getDimension(2131099763));
            d dVar = new d(this, context.getResources().getDimension(2131099761), context.getResources().getDimension(2131099751), context.getResources().getDimension(2131099750), context.getResources().getDimension(2131099759), context.getResources().getDimension(2131099746));
            e eVar = new e(this);
            cp1 cp1Var = new cp1(this);
            pd pdVar2 = this.o;
            pdVar2.c.h = fVar;
            pdVar2.h.h = ap1Var;
            pdVar2.d.h = bp1Var;
            pdVar2.e.h = dVar;
            pdVar2.f.h = eVar;
            pdVar2.g.h = cp1Var;
        }
    }

    public final void a() {
        this.s.removeCallbacksAndMessages(null);
        this.r.clear();
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.q;
        if (valueAnimator2 != null && valueAnimator2.isStarted()) {
            valueAnimator2.cancel();
        }
        c();
    }

    public final ValueAnimator b(double d, double d2, PointF pointF, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((float) d, (float) (d + d2));
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new zo1(this, pointF));
        valueAnimatorOfFloat.addListener(new v6(this, 1));
        return valueAnimatorOfFloat;
    }

    public final void c() {
        if (d()) {
            this.a.d();
            this.e.b();
        }
    }

    public final boolean d() {
        jf3 jf3Var = this.c;
        boolean z = jf3Var.n;
        pd pdVar = this.o;
        if (z && pdVar.h.q) {
            return false;
        }
        if (jf3Var.m && pdVar.d.q) {
            return false;
        }
        if (jf3Var.k && pdVar.e.q) {
            return false;
        }
        return (jf3Var.l && pdVar.f.q) ? false : true;
    }

    public final void e(ValueAnimator valueAnimator) {
        this.r.add(valueAnimator);
        Handler handler = this.s;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(this.u, 150L);
    }

    public final void f(boolean z, PointF pointF, boolean z2) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorB = b(this.a.c(), z ? 1.0d : -1.0d, pointF, 300L);
        this.p = valueAnimatorB;
        if (z2) {
            valueAnimatorB.start();
        } else {
            e(valueAnimatorB);
        }
    }
}
