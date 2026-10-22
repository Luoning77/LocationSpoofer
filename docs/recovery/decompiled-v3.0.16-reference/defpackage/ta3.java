package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ta3 extends hv1 {
    public final boolean a;
    public final ix1 b;
    public final boolean c;
    public final boolean d;
    public final vh2 e;
    public final lu0 f;

    public ta3(boolean z, ix1 ix1Var, boolean z2, boolean z3, vh2 vh2Var, lu0 lu0Var) {
        this.a = z;
        this.b = ix1Var;
        this.c = z2;
        this.d = z3;
        this.e = vh2Var;
        this.f = lu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ta3.class != obj.getClass()) {
            return false;
        }
        ta3 ta3Var = (ta3) obj;
        return this.a == ta3Var.a && o51.f(this.b, ta3Var.b) && this.c == ta3Var.c && this.d == ta3Var.d && this.e.equals(ta3Var.e) && this.f == ta3Var.f;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new wa3(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        wa3 wa3Var = (wa3) cv1Var;
        boolean z = wa3Var.R;
        boolean z2 = this.a;
        if (z != z2) {
            wa3Var.R = z2;
            ee0.C(wa3Var);
        }
        wa3Var.S = this.f;
        wa3Var.A1(this.b, null, this.c, this.d, null, this.e, wa3Var.T);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        ix1 ix1Var = this.b;
        return this.f.hashCode() + p91.b(this.e.a, p91.e(p91.e((iHashCode + (ix1Var != null ? ix1Var.hashCode() : 0)) * 961, 31, this.c), 31, this.d), 31);
    }
}
