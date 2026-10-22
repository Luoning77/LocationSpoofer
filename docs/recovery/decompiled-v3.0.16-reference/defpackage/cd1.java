package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class cd1 extends hv1 {
    public final au0 a;
    public final bd1 b;
    public final x32 c;
    public final boolean d;

    public cd1(au0 au0Var, bd1 bd1Var, x32 x32Var, boolean z) {
        this.a = au0Var;
        this.b = bd1Var;
        this.c = x32Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd1)) {
            return false;
        }
        cd1 cd1Var = (cd1) obj;
        return this.a == cd1Var.a && o51.f(this.b, cd1Var.b) && this.c == cd1Var.c && this.d == cd1Var.d;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new gd1(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        gd1 gd1Var = (gd1) cv1Var;
        gd1Var.s = this.a;
        gd1Var.t = this.b;
        x32 x32Var = gd1Var.u;
        x32 x32Var2 = this.c;
        if (x32Var != x32Var2) {
            gd1Var.u = x32Var2;
            ee0.C(gd1Var);
        }
        boolean z = gd1Var.v;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        gd1Var.v = z2;
        gd1Var.m1();
        ee0.C(gd1Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p91.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
