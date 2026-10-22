package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ez1 extends hv1 {
    public final dz1 a;

    public ez1(dz1 dz1Var) {
        this.a = dz1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ez1) && ((ez1) obj).a == this.a;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new hz1(xp1.b, this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        hz1 hz1Var = (hz1) cv1Var;
        hz1Var.s = xp1.b;
        dz1 dz1Var = hz1Var.t;
        if (dz1Var.a == hz1Var) {
            dz1Var.a = null;
        }
        dz1 dz1Var2 = this.a;
        if (dz1Var2 != dz1Var) {
            hz1Var.t = dz1Var2;
            dz1Var = dz1Var2;
        }
        if (hz1Var.r) {
            dz1Var.a = hz1Var;
            dz1Var.b = null;
            hz1Var.u = null;
            dz1Var.c = new ye(hz1Var, 18);
            dz1Var.d = hz1Var.a1();
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + (xp1.b.hashCode() * 31);
    }
}
