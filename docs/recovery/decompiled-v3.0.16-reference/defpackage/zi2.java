package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.maplibre.android.maps.c;
import org.maplibre.android.maps.d;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zi2 extends xc2 {
    public static final HashSet y;
    public float v;
    public float w;
    public float x;

    static {
        HashSet hashSet = new HashSet();
        y = hashSet;
        hashSet.add(2);
    }

    @Override // defpackage.jw1, defpackage.pq
    public final boolean b(int i) {
        return Math.abs(this.w) >= this.v && super.b(2);
    }

    @Override // defpackage.jw1
    public final boolean c() {
        ArrayList arrayList = this.l;
        iw1 iw1Var = (iw1) this.m.get(new o92((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
        float degrees = (float) Math.toDegrees(Math.atan2(iw1Var.b, iw1Var.a) - Math.atan2(iw1Var.d, iw1Var.c));
        this.x = degrees;
        this.w += degrees;
        if (this.q && degrees != 0.0f) {
            ((d) this.h).a(this, degrees);
            return true;
        }
        if (b(2)) {
            d dVar = (d) this.h;
            dp1 dp1Var = dVar.f;
            jf3 jf3Var = dp1Var.c;
            if (jf3Var.k) {
                float fAbs = Math.abs(this.x);
                double eventTime = this.d.getEventTime();
                double eventTime2 = this.e.getEventTime();
                if (eventTime != eventTime2) {
                    double d = ((double) fAbs) / (eventTime - eventTime2);
                    float fAbs2 = Math.abs(this.w);
                    if (d >= 0.04d && ((d <= 0.07d || fAbs2 >= 5.0f) && ((d <= 0.15d || fAbs2 >= 7.0f) && (d <= 0.5d || fAbs2 >= 15.0f)))) {
                        if (jf3Var.v) {
                            m03 m03Var = dp1Var.o.d;
                            m03Var.E = dVar.a;
                            if (m03Var.q) {
                                m03Var.r = true;
                            }
                        }
                        if (dp1Var.d()) {
                            dp1Var.a.a();
                        }
                        Iterator it = dp1Var.j.iterator();
                        if (it.hasNext()) {
                            throw az2.g(it);
                        }
                        h();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jw1
    public final void g() {
        this.w = 0.0f;
    }

    @Override // defpackage.xc2
    public final void i() {
        super.i();
        if (this.x == 0.0f) {
            this.t = 0.0f;
            this.u = 0.0f;
        }
        float f = this.t;
        float f2 = this.u;
        PointF pointF = this.n;
        float f3 = pointF.x;
        float fAbs = Math.abs((float) (((double) ((pointF.y * f) + (f2 * f3))) / (Math.pow(this.n.y, 2.0d) + Math.pow(f3, 2.0d))));
        if (this.x < 0.0f) {
            fAbs = -fAbs;
        }
        d dVar = (d) this.h;
        float f4 = this.t;
        float f5 = this.u;
        dp1 dp1Var = dVar.f;
        jf3 jf3Var = dp1Var.c;
        if (jf3Var.v) {
            dp1Var.o.d.E = dVar.e;
        }
        Iterator it = dp1Var.j.iterator();
        if (it.hasNext()) {
            throw az2.g(it);
        }
        float fMax = Math.max(-30.0f, Math.min(30.0f, fAbs * dVar.b));
        double dAbs = Math.abs(this.x) / (Math.abs(f5) + Math.abs(f4));
        if (!jf3Var.s || Math.abs(fMax) < dVar.c || (dp1Var.o.d.q && dAbs < dVar.d)) {
            dp1Var.c();
            return;
        }
        long jLog = (long) ((Math.log((1.0d / Math.pow(2.718281828459045d, 2.0d)) + ((double) Math.abs(fMax))) + 2.0d) * 150.0d);
        PointF pointF2 = dVar.f.m;
        if (pointF2 == null) {
            pointF2 = this.n;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMax, 0.0f);
        valueAnimatorOfFloat.setDuration(jLog);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new c(dVar, pointF2));
        valueAnimatorOfFloat.addListener(new v6(dVar, 2));
        dp1Var.q = valueAnimatorOfFloat;
        dp1Var.e(valueAnimatorOfFloat);
    }

    @Override // defpackage.xc2
    public final HashSet j() {
        return y;
    }
}
