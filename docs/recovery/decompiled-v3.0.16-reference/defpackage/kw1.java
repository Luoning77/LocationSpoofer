package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kw1 extends jw1 {
    public long p;
    public float q;
    public boolean r;
    public boolean s;
    public int t;

    @Override // defpackage.jw1, defpackage.pq
    public final boolean a(MotionEvent motionEvent) {
        super.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        boolean z2 = true;
        if (actionMasked == 1) {
            if (b(4)) {
                cp1 cp1Var = (cp1) this.h;
                int i = this.t;
                dp1 dp1Var = cp1Var.a;
                if (dp1Var.c.m && i == 2) {
                    dp1Var.a.a();
                    dp1Var.e.c(1);
                    PointF pointF = dp1Var.m;
                    if (pointF == null) {
                        pointF = this.n;
                    }
                    dp1Var.f(false, pointF, false);
                    z = true;
                }
            }
            g();
            return z;
        }
        if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (this.s) {
                    this.r = true;
                }
                this.t = this.l.size();
                return false;
            }
            if (actionMasked == 6) {
                this.s = true;
                return false;
            }
        } else if (!this.r) {
            for (iw1 iw1Var : this.m.values()) {
                float fAbs = Math.abs(iw1Var.c - iw1Var.a);
                float fAbs2 = Math.abs(iw1Var.d - iw1Var.b);
                float f = this.q;
                boolean z3 = fAbs > f || fAbs2 > f;
                this.r = z3;
                if (z3) {
                    this.r = z2;
                    return false;
                }
            }
            z2 = false;
            this.r = z2;
            return false;
        }
        return false;
    }

    @Override // defpackage.jw1, defpackage.pq
    public final boolean b(int i) {
        return this.t > 1 && !this.r && this.f < this.p && super.b(4);
    }

    @Override // defpackage.jw1
    public final void g() {
        this.t = 0;
        this.r = false;
        this.s = false;
    }
}
