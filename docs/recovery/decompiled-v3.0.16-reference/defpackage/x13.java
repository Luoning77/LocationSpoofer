package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x13 extends lb0 implements ba2, fp0, xp0 {
    public au0 u;
    public boolean v;
    public final q33 w;

    public x13(au0 au0Var) {
        this.u = au0Var;
        qc qcVar = new qc(this, 5);
        p92 p92Var = m33.a;
        q33 q33Var = new q33(null, null, qcVar);
        m1(q33Var);
        this.w = q33Var;
    }

    @Override // defpackage.ba2
    public final long I() {
        yd0 yd0Var = n51.P;
        xb0 xb0Var = xp1.O(this).D;
        yd0Var.getClass();
        int i = ob3.b;
        return l93.e(xb0Var.n0(10.0f), xb0Var.n0(40.0f), xb0Var.n0(10.0f), xb0Var.n0(40.0f));
    }

    @Override // defpackage.ba2
    public final void K0() {
        this.w.K0();
    }

    @Override // defpackage.ba2
    public final void d0(p92 p92Var, q92 q92Var, long j) {
        this.w.d0(p92Var, q92Var, j);
    }

    @Override // defpackage.fp0
    public final void u0(zp0 zp0Var) {
        this.v = zp0Var.b();
    }
}
