package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class do2 extends hv1 {
    public final qo2 a;
    public final x32 b;
    public final boolean c;
    public final ka0 d;
    public final ix1 e;
    public final boolean f;
    public final o42 g;

    public do2(ka0 ka0Var, ix1 ix1Var, x32 x32Var, o42 o42Var, qo2 qo2Var, boolean z, boolean z2) {
        this.a = qo2Var;
        this.b = x32Var;
        this.c = z;
        this.d = ka0Var;
        this.e = ix1Var;
        this.f = z2;
        this.g = o42Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || do2.class != obj.getClass()) {
            return false;
        }
        do2 do2Var = (do2) obj;
        return this.a.equals(do2Var.a) && this.b == do2Var.b && this.c == do2Var.c && o51.f(this.d, do2Var.d) && o51.f(this.e, do2Var.e) && this.f == do2Var.f && o51.f(this.g, do2Var.g);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        eo2 eo2Var = new eo2();
        eo2Var.u = this.a;
        eo2Var.v = this.b;
        eo2Var.w = this.c;
        eo2Var.x = this.d;
        eo2Var.y = this.e;
        eo2Var.z = this.f;
        eo2Var.A = this.g;
        return eo2Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((eo2) cv1Var).r1(this.d, this.e, this.b, this.g, this.a, this.f, this.c);
    }

    public final int hashCode() {
        int iE = p91.e(p91.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        ka0 ka0Var = this.d;
        int iHashCode = (iE + (ka0Var != null ? ka0Var.hashCode() : 0)) * 31;
        ix1 ix1Var = this.e;
        int iE2 = p91.e((iHashCode + (ix1Var != null ? ix1Var.hashCode() : 0)) * 961, 31, this.f);
        o42 o42Var = this.g;
        return iE2 + (o42Var != null ? o42Var.hashCode() : 0);
    }
}
