package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class c83 extends hv1 {
    public final q93 a;

    public c83(q93 q93Var) {
        this.a = q93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c83)) {
            return false;
        }
        return o51.f(this.a, ((c83) obj).a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new d83(this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        d83 d83Var = (d83) cv1Var;
        d83Var.getClass();
        q93 q93VarC = r93.c(this.a, xp1.O(d83Var).E);
        d83Var.m1(q93VarC, (lq0) xq1.C(d83Var, z30.k));
        eu2 eu2Var = d83Var.u;
        if (eu2Var == null) {
            throw p91.h("Min size state is not set.");
        }
        eu2.a(eu2Var, null, null, q93VarC, 23);
        ld0.z(d83Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
