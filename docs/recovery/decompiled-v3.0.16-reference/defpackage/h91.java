package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class h91 extends hv1 {
    public final lu0 a;
    public final lu0 b;

    public h91(lu0 lu0Var, lu0 lu0Var2) {
        this.a = lu0Var;
        this.b = lu0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h91)) {
            return false;
        }
        h91 h91Var = (h91) obj;
        return this.a == h91Var.a && this.b == h91Var.b;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        j91 j91Var = new j91();
        j91Var.s = this.a;
        j91Var.t = this.b;
        return j91Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        j91 j91Var = (j91) cv1Var;
        j91Var.s = this.a;
        j91Var.t = this.b;
    }

    public final int hashCode() {
        lu0 lu0Var = this.a;
        int iHashCode = (lu0Var != null ? lu0Var.hashCode() : 0) * 31;
        lu0 lu0Var2 = this.b;
        return iHashCode + (lu0Var2 != null ? lu0Var2.hashCode() : 0);
    }
}
