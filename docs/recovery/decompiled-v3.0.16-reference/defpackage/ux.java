package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ux extends hv1 {
    public final ix1 a;
    public final q11 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final vh2 f;
    public final au0 g;

    public ux(ix1 ix1Var, uh2 uh2Var, boolean z, boolean z2, String str, vh2 vh2Var, au0 au0Var) {
        this.a = ix1Var;
        this.b = uh2Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = vh2Var;
        this.g = au0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ux.class != obj.getClass()) {
            return false;
        }
        ux uxVar = (ux) obj;
        return o51.f(this.a, uxVar.a) && o51.f(this.b, uxVar.b) && this.c == uxVar.c && this.d == uxVar.d && o51.f(this.e, uxVar.e) && o51.f(this.f, uxVar.f) && this.g == uxVar.g;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new wx(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((wx) cv1Var).A1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final int hashCode() {
        ix1 ix1Var = this.a;
        int iHashCode = (ix1Var != null ? ix1Var.hashCode() : 0) * 31;
        q11 q11Var = this.b;
        int iE = p91.e(p91.e((iHashCode + (q11Var != null ? q11Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iE + (str != null ? str.hashCode() : 0)) * 31;
        vh2 vh2Var = this.f;
        return this.g.hashCode() + ((iHashCode2 + (vh2Var != null ? Integer.hashCode(vh2Var.a) : 0)) * 31);
    }
}
