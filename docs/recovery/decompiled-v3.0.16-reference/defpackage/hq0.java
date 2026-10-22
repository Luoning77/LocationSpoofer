package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class hq0 extends hv1 {
    public final ix1 a;

    public hq0(ix1 ix1Var) {
        this.a = ix1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hq0) {
            return o51.f(this.a, ((hq0) obj).a);
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new iq0(this.a, 1, null);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((iq0) cv1Var).q1(this.a);
    }

    public final int hashCode() {
        ix1 ix1Var = this.a;
        if (ix1Var != null) {
            return ix1Var.hashCode();
        }
        return 0;
    }
}
