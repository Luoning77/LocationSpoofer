package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u73 implements s63 {
    public final /* synthetic */ x73 a;

    public u73(x73 x73Var) {
        this.a = x73Var;
    }

    @Override // defpackage.s63
    public final void a(long j, yp2 yp2Var) {
        y83 y83VarD;
        x73 x73Var = this.a;
        long jA = tq2.a(x73Var.j(true));
        me1 me1Var = x73Var.d;
        if (me1Var == null || (y83VarD = me1Var.d()) == null) {
            return;
        }
        long jE = y83VarD.e(jA);
        x73Var.o = jE;
        x73Var.p(new c12(jE));
        x73Var.q = 0L;
        x73Var.q(bx0.e);
        x73Var.u(false);
    }

    @Override // defpackage.s63
    public final void b() {
        x73 x73Var = this.a;
        x73Var.q(null);
        x73Var.p(null);
    }

    @Override // defpackage.s63
    public final void c() {
        x73 x73Var = this.a;
        x73Var.q(null);
        x73Var.p(null);
    }

    @Override // defpackage.s63
    public final void e(long j) {
        y83 y83VarD;
        jx0 jx0Var;
        x73 x73Var = this.a;
        x73Var.q = c12.e(x73Var.q, j);
        me1 me1Var = x73Var.d;
        if (me1Var == null || (y83VarD = me1Var.d()) == null) {
            return;
        }
        x73Var.p(new c12(c12.e(x73Var.o, x73Var.q)));
        e12 e12Var = x73Var.b;
        c12 c12VarG = x73Var.g();
        c12VarG.getClass();
        int iN = e12Var.n(y83VarD.b(c12VarG.a, true));
        long jA = g93.a(iN, iN);
        if (f93.b(jA, x73Var.l().b)) {
            return;
        }
        me1 me1Var2 = x73Var.d;
        if ((me1Var2 == null || ((Boolean) me1Var2.q.getValue()).booleanValue()) && (jx0Var = x73Var.k) != null) {
            ((m82) jx0Var).a(9);
        }
        x73Var.c.invoke(x73.b(x73Var.l().a, jA));
        x73Var.w = new f93(jA);
    }

    @Override // defpackage.s63
    public final void d() {
    }

    @Override // defpackage.s63
    public final void onCancel() {
    }
}
