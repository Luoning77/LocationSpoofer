package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class o8 extends hv1 {
    public final pu0 a;

    public o8(pu0 pu0Var) {
        this.a = pu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o8) {
            return this.a == ((o8) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        p8 p8Var = new p8();
        p8Var.u = this.a;
        t tVar = new t(p8Var, 3);
        n8 n8Var = new n8();
        n8Var.s = tVar;
        p8Var.m1(n8Var);
        return p8Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((p8) cv1Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
