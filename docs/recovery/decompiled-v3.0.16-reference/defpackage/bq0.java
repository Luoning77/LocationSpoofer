package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bq0 extends lb0 implements z02, u30 {
    public final dq0 u;
    public rc1 v;

    public bq0() {
        dq0 dq0Var = new dq0(0, new t5(2, this, bq0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 2), 9);
        m1(dq0Var);
        this.u = dq0Var;
    }

    @Override // defpackage.z02
    public final void f0() {
        we2 we2Var = new we2();
        gh0.H(this, new ta(4, we2Var, this));
        rc1 rc1Var = (rc1) we2Var.e;
        if (this.u.r1().b()) {
            rc1 rc1Var2 = this.v;
            if (rc1Var2 != null) {
                rc1Var2.b();
            }
            if (rc1Var != null) {
                rc1Var.a();
            } else {
                rc1Var = null;
            }
            this.v = rc1Var;
        }
    }
}
