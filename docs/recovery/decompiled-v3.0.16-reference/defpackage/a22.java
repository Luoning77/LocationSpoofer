package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class a22 extends hv1 {
    public final lu0 a;

    public a22(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a22) {
            return this.a == ((a22) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        b22 b22Var = new b22();
        b22Var.s = this.a;
        return b22Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((b22) cv1Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
