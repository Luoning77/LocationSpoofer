package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qf0 extends hv1 {
    public static final my i = new my(14);
    public final vf0 a;
    public final x32 b;
    public final boolean c;
    public final ix1 d;
    public final boolean e;
    public final qu0 f;
    public final qu0 g;
    public final boolean h;

    public qf0(vf0 vf0Var, x32 x32Var, boolean z, ix1 ix1Var, boolean z2, qu0 qu0Var, qu0 qu0Var2, boolean z3) {
        this.a = vf0Var;
        this.b = x32Var;
        this.c = z;
        this.d = ix1Var;
        this.e = z2;
        this.f = qu0Var;
        this.g = qu0Var2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qf0.class != obj.getClass()) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return o51.f(this.a, qf0Var.a) && this.b == qf0Var.b && this.c == qf0Var.c && o51.f(this.d, qf0Var.d) && this.e == qf0Var.e && o51.f(this.f, qf0Var.f) && o51.f(this.g, qf0Var.g) && this.h == qf0Var.h;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        my myVar = i;
        boolean z = this.c;
        ix1 ix1Var = this.d;
        x32 x32Var = this.b;
        uf0 uf0Var = new uf0(myVar, z, ix1Var, x32Var);
        uf0Var.N = this.a;
        uf0Var.O = x32Var;
        uf0Var.P = this.e;
        uf0Var.Q = this.f;
        uf0Var.R = this.g;
        uf0Var.S = this.h;
        return uf0Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        boolean z;
        boolean z2;
        uf0 uf0Var = (uf0) cv1Var;
        vf0 vf0Var = uf0Var.N;
        vf0 vf0Var2 = this.a;
        if (o51.f(vf0Var, vf0Var2)) {
            z = false;
        } else {
            uf0Var.N = vf0Var2;
            z = true;
        }
        x32 x32Var = uf0Var.O;
        x32 x32Var2 = this.b;
        if (x32Var != x32Var2) {
            uf0Var.O = x32Var2;
            z = true;
        }
        boolean z3 = uf0Var.S;
        boolean z4 = this.h;
        if (z3 != z4) {
            uf0Var.S = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        uf0Var.Q = this.f;
        uf0Var.R = this.g;
        uf0Var.P = this.e;
        uf0Var.G1(i, this.c, this.d, x32Var2, z2);
    }

    public final int hashCode() {
        int iE = p91.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        ix1 ix1Var = this.d;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + p91.e((iE + (ix1Var != null ? ix1Var.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }
}
