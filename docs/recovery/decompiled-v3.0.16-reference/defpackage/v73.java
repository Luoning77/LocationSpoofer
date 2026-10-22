package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v73 implements s63 {
    public f93 b;
    public final /* synthetic */ x73 d;
    public boolean a = true;
    public yp2 c = u92.l;

    public v73(x73 x73Var) {
        this.d = x73Var;
    }

    @Override // defpackage.s63
    public final void a(long j, yp2 yp2Var) {
        long j2;
        y83 y83VarD;
        y83 y83VarD2;
        x73 x73Var = this.d;
        if (x73Var.i() && ((bx0) x73Var.r.getValue()) == null) {
            x73Var.q(bx0.g);
            x73Var.t = -1;
            this.a = true;
            this.c = yp2Var;
            x73Var.m();
            me1 me1Var = x73Var.d;
            if (me1Var == null || (y83VarD2 = me1Var.d()) == null || !y83VarD2.c(j)) {
                j2 = j;
                me1 me1Var2 = x73Var.d;
                if (me1Var2 != null && (y83VarD = me1Var2.d()) != null) {
                    int iN = x73Var.b.n(y83VarD.b(j2, true));
                    f83 f83VarB = x73.b(x73Var.l().a, g93.a(iN, iN));
                    x73Var.e(false);
                    jx0 jx0Var = x73Var.k;
                    if (jx0Var != null) {
                        ((m82) jx0Var).a(0);
                    }
                    x73Var.c.invoke(f83VarB);
                    x73Var.w = new f93(f83VarB.b);
                }
                this.a = false;
            } else {
                if (x73Var.l().a.f.length() == 0) {
                    return;
                }
                x73Var.e(false);
                long jV = x73Var.v(f83.a(x73Var.l(), null, f93.b, 5), j, true, false, this.c, true, new kx0(0));
                j2 = j;
                x73Var.p = new f93(jV);
                this.b = new f93(jV);
            }
            x73Var.r(dx0.e);
            x73Var.o = j2;
            x73Var.p(new c12(j2));
            x73Var.q = 0L;
        }
    }

    @Override // defpackage.s63
    public final void b() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    @Override // defpackage.s63
    public final void e(long j) {
        y83 y83VarD;
        f93 f93Var;
        int iB;
        long jV;
        x73 x73Var = this.d;
        if (!x73Var.i() || x73Var.l().a.f.length() == 0) {
            return;
        }
        x73Var.q = c12.e(x73Var.q, j);
        me1 me1Var = x73Var.d;
        if (me1Var != null && (y83VarD = me1Var.d()) != null) {
            x73Var.p(new c12(c12.e(x73Var.o, x73Var.q)));
            if (x73Var.p == null) {
                c12 c12VarG = x73Var.g();
                c12VarG.getClass();
                if (y83VarD.c(c12VarG.a)) {
                    f93Var = x73Var.p;
                    if (f93Var != null) {
                        iB = (int) (f93Var.a >> 32);
                    } else {
                        iB = y83VarD.b(x73Var.o, false);
                    }
                    c12 c12VarG2 = x73Var.g();
                    c12VarG2.getClass();
                    int iB2 = y83VarD.b(c12VarG2.a, false);
                    if (x73Var.p != null && iB == iB2) {
                        return;
                    }
                    f83 f83VarL = x73Var.l();
                    c12 c12VarG3 = x73Var.g();
                    c12VarG3.getClass();
                    jV = x73Var.v(f83VarL, c12VarG3.a, false, false, this.c, true, new kx0(9));
                } else {
                    int iN = x73Var.b.n(y83VarD.b(x73Var.o, true));
                    e12 e12Var = x73Var.b;
                    c12 c12VarG4 = x73Var.g();
                    c12VarG4.getClass();
                    yp2 yp2Var = iN == e12Var.n(y83VarD.b(c12VarG4.a, true)) ? u92.l : u92.m;
                    f83 f83VarL2 = x73Var.l();
                    c12 c12VarG5 = x73Var.g();
                    c12VarG5.getClass();
                    jV = x73Var.v(f83VarL2, c12VarG5.a, false, false, yp2Var, true, new kx0(9));
                }
            } else {
                f93Var = x73Var.p;
                if (f93Var != null) {
                    iB = (int) (f93Var.a >> 32);
                } else {
                    iB = y83VarD.b(x73Var.o, false);
                }
                c12 c12VarG6 = x73Var.g();
                c12VarG6.getClass();
                int iB3 = y83VarD.b(c12VarG6.a, false);
                if (x73Var.p != null) {
                }
                f83 f83VarL3 = x73Var.l();
                c12 c12VarG7 = x73Var.g();
                c12VarG7.getClass();
                jV = x73Var.v(f83VarL3, c12VarG7.a, false, false, this.c, true, new kx0(9));
            }
            this.b = new f93(jV);
            if (!f93.a(jV, x73Var.p)) {
                this.a = false;
            }
        }
        x73Var.u(false);
    }

    public final void f() {
        x73 x73Var = this.d;
        x73Var.q(null);
        x73Var.p(null);
        this.c = u92.l;
        x73Var.u(true);
        f93 f93Var = this.b;
        boolean zC = f93.c(f93Var != null ? f93Var.a : x73Var.l().b);
        x73Var.r(zC ? dx0.g : dx0.f);
        me1 me1Var = x73Var.d;
        if (me1Var != null) {
            me1Var.m.setValue(Boolean.valueOf(!zC && a83.g(x73Var, true)));
        }
        me1 me1Var2 = x73Var.d;
        if (me1Var2 != null) {
            me1Var2.n.setValue(Boolean.valueOf(!zC && a83.g(x73Var, false)));
        }
        me1 me1Var3 = x73Var.d;
        if (me1Var3 != null) {
            me1Var3.o.setValue(Boolean.valueOf(zC && a83.g(x73Var, true)));
        }
        if (this.a) {
            x73Var.n(x73Var.p);
        }
        x73Var.p = null;
    }

    @Override // defpackage.s63
    public final void onCancel() {
        f();
    }

    @Override // defpackage.s63
    public final void c() {
    }

    @Override // defpackage.s63
    public final void d() {
    }
}
