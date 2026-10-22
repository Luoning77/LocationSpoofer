package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class o31 extends hv1 {
    public final sk3 a;

    public o31(sk3 sk3Var) {
        this.a = sk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o31) {
            return o51.f(((o31) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new q31(this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        q31 q31Var = (q31) cv1Var;
        sk3 sk3Var = q31Var.u;
        sk3 sk3Var2 = this.a;
        if (o51.f(sk3Var2, sk3Var)) {
            return;
        }
        q31Var.u = sk3Var2;
        q31Var.n1();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
