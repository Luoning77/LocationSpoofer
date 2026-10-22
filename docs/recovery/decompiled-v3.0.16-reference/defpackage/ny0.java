package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ny0 extends hv1 {
    public final ix1 a;

    public ny0(ix1 ix1Var) {
        this.a = ix1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny0) && o51.f(((ny0) obj).a, this.a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        ry0 ry0Var = new ry0();
        ry0Var.s = this.a;
        return ry0Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ry0 ry0Var = (ry0) cv1Var;
        ix1 ix1Var = ry0Var.s;
        ix1 ix1Var2 = this.a;
        if (o51.f(ix1Var, ix1Var2)) {
            return;
        }
        ry0Var.o1();
        ry0Var.s = ix1Var2;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
