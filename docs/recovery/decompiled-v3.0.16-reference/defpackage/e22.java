package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class e22 extends hv1 {
    public final lu0 a;

    public e22(lu0 lu0Var) {
        this.a = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e22) {
            return this.a == ((e22) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        f22 f22Var = new f22();
        f22Var.s = this.a;
        f22Var.t = -9223372034707292160L;
        return f22Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        f22 f22Var = (f22) cv1Var;
        f22Var.s = this.a;
        f22Var.t = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
