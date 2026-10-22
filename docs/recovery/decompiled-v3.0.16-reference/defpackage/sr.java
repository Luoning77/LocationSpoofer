package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class sr extends hv1 {
    public final lu0 a;

    public sr(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sr) {
            return this.a == ((sr) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new tr(this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        xz1 xz1Var;
        tr trVar = (tr) cv1Var;
        lu0 lu0Var = this.a;
        trVar.s = lu0Var;
        if (trVar.e.r && (xz1Var = xp1.L(trVar, 2).v) != null) {
            xz1Var.S1(lu0Var, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
