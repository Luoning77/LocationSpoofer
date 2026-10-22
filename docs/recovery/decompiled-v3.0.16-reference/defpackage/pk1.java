package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pk1 extends hv1 {
    public final lu0 a;
    public final lu0 b;
    public final q82 c;

    public pk1(lu0 lu0Var, lu0 lu0Var2, q82 q82Var) {
        this.a = lu0Var;
        this.b = lu0Var2;
        this.c = q82Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new rk1(this.a, this.b, this.c);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        rk1 rk1Var = (rk1) cv1Var;
        float f = rk1Var.u;
        long j = rk1Var.w;
        float f2 = rk1Var.x;
        boolean z = rk1Var.v;
        float f3 = rk1Var.y;
        boolean z2 = rk1Var.z;
        q82 q82Var = rk1Var.A;
        View view = rk1Var.B;
        xb0 xb0Var = rk1Var.C;
        rk1Var.s = this.a;
        rk1Var.u = Float.NaN;
        rk1Var.v = true;
        rk1Var.w = 9205357640488583168L;
        rk1Var.x = Float.NaN;
        rk1Var.y = Float.NaN;
        rk1Var.z = true;
        rk1Var.t = this.b;
        q82 q82Var2 = this.c;
        rk1Var.A = q82Var2;
        View viewN = xq1.N(rk1Var);
        xb0 xb0Var2 = xp1.O(rk1Var).D;
        if (rk1Var.D != null) {
            rs2 rs2Var = sk1.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !q82Var2.a()) || 9205357640488583168L != j || !td0.b(Float.NaN, f2) || !td0.b(Float.NaN, f3) || true != z || true != z2 || !q82Var2.equals(q82Var) || !viewN.equals(view) || !o51.f(xb0Var2, xb0Var)) {
                rk1Var.n1();
            }
        }
        rk1Var.o1();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + p91.e(az2.c(Float.NaN, az2.c(Float.NaN, p91.c(p91.e(az2.c(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
