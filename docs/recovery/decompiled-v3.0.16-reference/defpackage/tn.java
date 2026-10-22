package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tn extends hv1 implements fs2 {
    public final boolean a;
    public final lu0 b;

    public tn(lu0 lu0Var, boolean z) {
        this.a = z;
        this.b = lu0Var;
    }

    @Override // defpackage.fs2
    public final es2 e() {
        es2 es2Var = new es2();
        es2Var.g = this.a;
        this.b.invoke(es2Var);
        return es2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn)) {
            return false;
        }
        tn tnVar = (tn) obj;
        return this.a == tnVar.a && this.b == tnVar.b;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new c70(this.a, false, this.b);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        c70 c70Var = (c70) cv1Var;
        c70Var.s = this.a;
        c70Var.u = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
