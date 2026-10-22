package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class cp0 extends hv1 {
    public final lu0 a;

    public cp0(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cp0) {
            return this.a == ((cp0) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        dp0 dp0Var = new dp0();
        dp0Var.s = this.a;
        return dp0Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((dp0) cv1Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
