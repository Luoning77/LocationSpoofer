package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class qx0 extends hv1 {
    public final q93 a;
    public final int b;
    public final int c;

    public qx0(q93 q93Var, int i, int i2) {
        this.a = q93Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx0)) {
            return false;
        }
        qx0 qx0Var = (qx0) obj;
        return o51.f(this.a, qx0Var.a) && this.b == qx0Var.b && this.c == qx0Var.c;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        sx0 sx0Var = new sx0();
        sx0Var.s = this.a;
        sx0Var.t = this.b;
        sx0Var.u = this.c;
        sx0Var.w = -1;
        sx0Var.x = -1;
        return sx0Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        sx0 sx0Var = (sx0) cv1Var;
        q93 q93Var = sx0Var.s;
        q93 q93Var2 = this.a;
        boolean zF = o51.f(q93Var, q93Var2);
        int i = this.b;
        int i2 = this.c;
        if (zF && sx0Var.t == i && sx0Var.u == i2) {
            return;
        }
        sx0Var.s = q93Var2;
        sx0Var.t = i;
        sx0Var.u = i2;
        sx0Var.y = r93.c(q93Var2, xp1.O(sx0Var).E);
        sx0Var.v = true;
        ld0.z(sx0Var);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
