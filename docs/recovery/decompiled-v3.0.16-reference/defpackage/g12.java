package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class g12 extends hv1 {
    public final lu0 a;

    public g12(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g12 g12Var = obj instanceof g12 ? (g12) obj : null;
        return g12Var != null && this.a == g12Var.a;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        h12 h12Var = new h12();
        h12Var.s = this.a;
        h12Var.t = true;
        return h12Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        h12 h12Var = (h12) cv1Var;
        lu0 lu0Var = h12Var.s;
        lu0 lu0Var2 = this.a;
        if (lu0Var != lu0Var2 || !h12Var.t) {
            xp1.O(h12Var).U(false);
        }
        h12Var.s = lu0Var2;
        h12Var.t = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
