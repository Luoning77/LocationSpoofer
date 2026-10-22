package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class a52 extends hv1 {
    public final z42 a;

    public a52(z42 z42Var) {
        this.a = z42Var;
    }

    public final boolean equals(Object obj) {
        a52 a52Var = obj instanceof a52 ? (a52) obj : null;
        if (a52Var == null) {
            return false;
        }
        return o51.f(this.a, a52Var.a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        c52 c52Var = new c52();
        c52Var.s = this.a;
        return c52Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((c52) cv1Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
