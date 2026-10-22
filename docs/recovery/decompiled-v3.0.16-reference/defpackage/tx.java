package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tx extends hv1 implements fs2 {
    public final lu0 a;

    public tx(lu0 lu0Var) {
        this.a = lu0Var;
    }

    @Override // defpackage.fs2
    public final es2 e() {
        es2 es2Var = new es2();
        es2Var.g = false;
        es2Var.h = true;
        this.a.invoke(es2Var);
        return es2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tx) {
            return this.a == ((tx) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new c70(false, true, this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((c70) cv1Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
