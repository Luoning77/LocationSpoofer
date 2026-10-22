package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class p50 extends hv1 {
    public final lu0 a;

    public p50(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p50) && ((p50) obj).a == this.a;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        q50 q50Var = new q50();
        q50Var.u = this.a;
        return q50Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        q50 q50Var = (q50) cv1Var;
        lu0 lu0Var = q50Var.u;
        lu0 lu0Var2 = this.a;
        if (lu0Var2 != lu0Var) {
            q50Var.u = lu0Var2;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
