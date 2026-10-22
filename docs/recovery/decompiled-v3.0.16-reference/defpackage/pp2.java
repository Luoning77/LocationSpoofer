package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class pp2 extends hv1 {
    public final boolean a;
    public final ix1 b;
    public final q11 c;
    public final boolean d;
    public final boolean e;
    public final vh2 f;
    public final au0 g;

    public pp2(boolean z, ix1 ix1Var, uh2 uh2Var, boolean z2, boolean z3, vh2 vh2Var, au0 au0Var) {
        this.a = z;
        this.b = ix1Var;
        this.c = uh2Var;
        this.d = z2;
        this.e = z3;
        this.f = vh2Var;
        this.g = au0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pp2.class != obj.getClass()) {
            return false;
        }
        pp2 pp2Var = (pp2) obj;
        return this.a == pp2Var.a && o51.f(this.b, pp2Var.b) && o51.f(this.c, pp2Var.c) && this.d == pp2Var.d && this.e == pp2Var.e && o51.f(this.f, pp2Var.f) && this.g == pp2Var.g;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        sp2 sp2Var = new sp2(this.b, this.c, this.d, this.e, null, this.f, this.g);
        sp2Var.R = this.a;
        return sp2Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        sp2 sp2Var = (sp2) cv1Var;
        boolean z = sp2Var.R;
        boolean z2 = this.a;
        if (z != z2) {
            sp2Var.R = z2;
            ee0.C(sp2Var);
        }
        sp2Var.A1(this.b, this.c, this.d, this.e, null, this.f, this.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        ix1 ix1Var = this.b;
        int iHashCode2 = (iHashCode + (ix1Var != null ? ix1Var.hashCode() : 0)) * 31;
        q11 q11Var = this.c;
        int iE = p91.e(p91.e((iHashCode2 + (q11Var != null ? q11Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        vh2 vh2Var = this.f;
        return this.g.hashCode() + ((iE + (vh2Var != null ? Integer.hashCode(vh2Var.a) : 0)) * 31);
    }
}
