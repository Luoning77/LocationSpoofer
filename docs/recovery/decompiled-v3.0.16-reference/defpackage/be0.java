package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class be0 extends cv1 implements tc3, na1 {
    public be0 s;
    public be0 t;
    public long u;

    @Override // defpackage.tc3
    public final Object H() {
        return j9.F;
    }

    @Override // defpackage.cv1
    public final void f1() {
        this.t = null;
        this.s = null;
    }

    @Override // defpackage.na1, defpackage.hr1
    public final void h(long j) {
        this.u = j;
    }

    public final boolean m1() {
        be0 be0Var = this.s;
        if (be0Var != null) {
            return be0Var.m1();
        }
        be0 be0Var2 = this.t;
        if (be0Var2 != null) {
            return be0Var2.m1();
        }
        return false;
    }

    public final void n1() {
        be0 be0Var = this.t;
        if (be0Var != null) {
            be0Var.n1();
            return;
        }
        be0 be0Var2 = this.s;
        if (be0Var2 != null) {
            be0Var2.n1();
        }
    }

    public final void o1() {
        be0 be0Var = this.t;
        if (be0Var != null) {
            be0Var.o1();
        }
        be0 be0Var2 = this.s;
        if (be0Var2 != null) {
            be0Var2.o1();
        }
        this.s = null;
    }

    public final void p1(t1 t1Var) {
        tc3 tc3Var;
        be0 be0Var;
        be0 be0Var2 = this.s;
        if (be0Var2 == null || !ce0.l(be0Var2, ee0.A(t1Var))) {
            if (this.e.r) {
                we2 we2Var = new we2();
                q73.l(this, new ah(we2Var, this, t1Var, 4));
                tc3Var = (tc3) we2Var.e;
            } else {
                tc3Var = null;
            }
            be0Var = (be0) tc3Var;
        } else {
            be0Var = be0Var2;
        }
        if (be0Var != null && be0Var2 == null) {
            be0Var.n1();
            be0Var.p1(t1Var);
            be0 be0Var3 = this.t;
            if (be0Var3 != null) {
                be0Var3.o1();
            }
        } else if (be0Var == null && be0Var2 != null) {
            be0 be0Var4 = this.t;
            if (be0Var4 != null) {
                be0Var4.n1();
                be0Var4.p1(t1Var);
            }
            be0Var2.o1();
        } else if (!o51.f(be0Var, be0Var2)) {
            if (be0Var != null) {
                be0Var.n1();
                be0Var.p1(t1Var);
            }
            if (be0Var2 != null) {
                be0Var2.o1();
            }
        } else if (be0Var != null) {
            be0Var.p1(t1Var);
        } else {
            be0 be0Var5 = this.t;
            if (be0Var5 != null) {
                be0Var5.p1(t1Var);
            }
        }
        this.s = be0Var;
    }

    public final void q1() {
        be0 be0Var = this.t;
        if (be0Var != null) {
            be0Var.q1();
            return;
        }
        be0 be0Var2 = this.s;
        if (be0Var2 != null) {
            be0Var2.q1();
        }
    }
}
