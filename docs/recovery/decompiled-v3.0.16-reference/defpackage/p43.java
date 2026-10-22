package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class p43 extends hv1 {
    public final lu0 a;

    public p43(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p43) {
            return this.a == ((p43) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        q43 q43Var = new q43(xq1.H);
        q43Var.v = this.a;
        return q43Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        q43 q43Var = (q43) cv1Var;
        lu0 lu0Var = q43Var.v;
        lu0 lu0Var2 = this.a;
        if (lu0Var != lu0Var2) {
            q43Var.v = lu0Var2;
            ul3 ul3Var = q43Var.w;
            if (ul3Var != null) {
                sk3 sk3Var = (sk3) lu0Var2.invoke(ul3Var);
                if (o51.f(sk3Var, q43Var.u)) {
                    return;
                }
                q43Var.u = sk3Var;
                q43Var.n1();
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
