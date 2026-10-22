package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class wc3 extends hv1 {
    public final xa3 a;
    public final ix1 b;
    public final q11 c;
    public final boolean d;
    public final vh2 e;
    public final au0 f;

    public wc3(xa3 xa3Var, ix1 ix1Var, uh2 uh2Var, boolean z, vh2 vh2Var, au0 au0Var) {
        this.a = xa3Var;
        this.b = ix1Var;
        this.c = uh2Var;
        this.d = z;
        this.e = vh2Var;
        this.f = au0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wc3.class != obj.getClass()) {
            return false;
        }
        wc3 wc3Var = (wc3) obj;
        return this.a == wc3Var.a && o51.f(this.b, wc3Var.b) && o51.f(this.c, wc3Var.c) && this.d == wc3Var.d && this.e.equals(wc3Var.e) && this.f == wc3Var.f;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        xc3 xc3Var = new xc3(this.b, this.c, false, this.d, null, this.e, this.f);
        xc3Var.R = this.a;
        return xc3Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        xc3 xc3Var = (xc3) cv1Var;
        xa3 xa3Var = xc3Var.R;
        xa3 xa3Var2 = this.a;
        if (xa3Var != xa3Var2) {
            xc3Var.R = xa3Var2;
            ee0.C(xc3Var);
        }
        xc3Var.A1(this.b, this.c, false, this.d, null, this.e, this.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ix1 ix1Var = this.b;
        int iHashCode2 = (iHashCode + (ix1Var != null ? ix1Var.hashCode() : 0)) * 31;
        q11 q11Var = this.c;
        return this.f.hashCode() + p91.b(this.e.a, p91.e(p91.e((iHashCode2 + (q11Var != null ? q11Var.hashCode() : 0)) * 31, 31, false), 31, this.d), 31);
    }
}
