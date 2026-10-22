package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class by0 extends hv1 {
    public final nr a;

    public by0(nr nrVar) {
        this.a = nrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        by0 by0Var = obj instanceof by0 ? (by0) obj : null;
        if (by0Var == null) {
            return false;
        }
        return this.a.equals(by0Var.a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        cy0 cy0Var = new cy0();
        cy0Var.s = this.a;
        return cy0Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((cy0) cv1Var).s = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
