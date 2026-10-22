package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class y21 extends hv1 {
    public final bj2 a;
    public final au0 b;

    public y21(bj2 bj2Var, au0 au0Var) {
        this.a = bj2Var;
        this.b = au0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) obj;
        return this.a.equals(y21Var.a) && this.b.equals(y21Var.b);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new b31(this.a, this.b);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        b31 b31Var = (b31) cv1Var;
        b31Var.getClass();
        b31Var.s = this.a;
        b31Var.t = this.b;
        ig0.z(b31Var);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
