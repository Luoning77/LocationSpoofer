package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class w13 extends hv1 {
    public final au0 a;

    public w13(au0 au0Var) {
        this.a = au0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w13) {
            return this.a == ((w13) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new x13(this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((x13) cv1Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
