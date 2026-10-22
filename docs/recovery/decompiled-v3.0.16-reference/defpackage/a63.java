package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class a63 extends hv1 {
    public final pu0 a;

    public a63(pu0 pu0Var) {
        this.a = pu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a63) {
            return this.a == ((a63) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new c63(this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((c63) cv1Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
