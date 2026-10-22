package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ra1 extends hv1 {
    public final qu0 a;

    public ra1(qu0 qu0Var) {
        this.a = qu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ra1) {
            return this.a == ((ra1) obj).a;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        xa1 xa1Var = new xa1();
        xa1Var.s = this.a;
        return xa1Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((xa1) cv1Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
