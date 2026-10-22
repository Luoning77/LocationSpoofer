package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class o11 extends hv1 {
    public final ix1 a;
    public final q11 b;

    public o11(q11 q11Var, ix1 ix1Var) {
        this.a = ix1Var;
        this.b = q11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o11)) {
            return false;
        }
        o11 o11Var = (o11) obj;
        return o51.f(this.a, o11Var.a) && this.b.equals(o11Var.b);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        kb0 kb0VarA = this.b.a(this.a);
        p11 p11Var = new p11();
        p11Var.u = kb0VarA;
        p11Var.m1(kb0VarA);
        return p11Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        p11 p11Var = (p11) cv1Var;
        kb0 kb0VarA = this.b.a(this.a);
        p11Var.n1(p11Var.u);
        p11Var.u = kb0VarA;
        p11Var.m1(kb0VarA);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
