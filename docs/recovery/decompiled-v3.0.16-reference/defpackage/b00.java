package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class b00 extends hv1 {
    public final ix1 a;
    public final au0 b;

    public b00(au0 au0Var, ix1 ix1Var) {
        this.a = ix1Var;
        this.b = au0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b00.class != obj.getClass()) {
            return false;
        }
        b00 b00Var = (b00) obj;
        return o51.f(this.a, b00Var.a) && this.b == b00Var.b;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new d00(this.b, this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        d00 d00Var = (d00) cv1Var;
        d00Var.getClass();
        boolean z = !d00Var.z;
        d00Var.A1(this.a, null, false, true, null, null, this.b);
        if (z) {
            d00Var.B1(false);
            d00Var.B1(true);
        }
    }

    public final int hashCode() {
        ix1 ix1Var = this.a;
        return Boolean.hashCode(true) + ((this.b.hashCode() + p91.e(p91.e((ix1Var != null ? ix1Var.hashCode() : 0) * 961, 31, false), 29791, true)) * 923521);
    }
}
