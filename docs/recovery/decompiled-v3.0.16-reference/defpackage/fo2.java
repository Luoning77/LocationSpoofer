package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class fo2 extends hv1 {
    public final qo2 a;
    public final x32 b;
    public final boolean c;
    public final boolean d;
    public final ix1 e;

    public fo2(qo2 qo2Var, x32 x32Var, boolean z, boolean z2, ix1 ix1Var) {
        this.a = qo2Var;
        this.b = x32Var;
        this.c = z;
        this.d = z2;
        this.e = ix1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo2)) {
            return false;
        }
        fo2 fo2Var = (fo2) obj;
        return o51.f(this.a, fo2Var.a) && this.b == fo2Var.b && this.c == fo2Var.c && this.d == fo2Var.d && o51.f(this.e, fo2Var.e);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new po2(null, this.e, this.b, null, this.a, this.c, this.d);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((po2) cv1Var).H1(null, this.e, this.b, null, this.a, this.c, this.d);
    }

    public final int hashCode() {
        int iE = p91.e(p91.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.d);
        ix1 ix1Var = this.e;
        return (iE + (ix1Var != null ? ix1Var.hashCode() : 0)) * 31;
    }
}
