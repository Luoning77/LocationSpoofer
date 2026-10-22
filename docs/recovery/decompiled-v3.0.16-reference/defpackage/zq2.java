package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zq2 implements s63 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public zq2(x73 x73Var, boolean z) {
        this.c = x73Var;
        this.b = z;
    }

    @Override // defpackage.s63
    public final void a(long j, yp2 yp2Var) {
        switch (this.a) {
            case 0:
                ar2 ar2Var = (ar2) this.c;
                if (ar2Var.e() != null) {
                    xp2 xp2VarF = ar2Var.f();
                    xp2VarF.getClass();
                    boolean z = this.b;
                    Object objE = ar2Var.a.c.e((z ? xp2VarF.a : xp2VarF.b).c);
                    if (objE == null) {
                        s21.d("SelectionRegistrar should contain the current selection's selectableIds");
                        fo.d();
                        break;
                    } else {
                        bx1 bx1Var = (bx1) objE;
                        pa1 pa1VarC = bx1Var.c();
                        if (pa1VarC == null) {
                            s21.d("Current selectable should have layout coordinates.");
                            fo.d();
                            break;
                        } else {
                            long jA = bx1Var.a(xp2VarF, z);
                            if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                ar2Var.n.setValue(new c12(ar2Var.j().L(pa1VarC, tq2.a(jA))));
                                ar2Var.o.setValue(new c12(0L));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.s63
    public final void b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ar2 ar2Var = (ar2) obj;
                ar2Var.x = true;
                ar2Var.o();
                ar2Var.r.setValue(null);
                ar2Var.s.setValue(null);
                break;
            default:
                x73 x73Var = (x73) obj;
                x73Var.q(null);
                x73Var.p(null);
                x73Var.u(true);
                break;
        }
    }

    @Override // defpackage.s63
    public final void c() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ar2 ar2Var = (ar2) obj;
                ar2Var.x = true;
                ar2Var.o();
                ar2Var.r.setValue(null);
                ar2Var.s.setValue(null);
                break;
            default:
                x73 x73Var = (x73) obj;
                x73Var.q(null);
                x73Var.p(null);
                x73Var.u(true);
                break;
        }
    }

    @Override // defpackage.s63
    public final void d() {
        xp2 xp2VarF;
        pa1 pa1VarC;
        y83 y83VarD;
        int i = this.a;
        bx0 bx0Var = bx0.g;
        bx0 bx0Var2 = bx0.f;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ar2 ar2Var = (ar2) obj;
                if ((z ? (c12) ar2Var.p.getValue() : (c12) ar2Var.q.getValue()) != null && (xp2VarF = ar2Var.f()) != null) {
                    bx1 bx1VarC = ar2Var.c(z ? xp2VarF.a : xp2VarF.b);
                    if (bx1VarC != null && (pa1VarC = bx1VarC.c()) != null) {
                        long jA = bx1VarC.a(xp2VarF, z);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            ar2Var.s.setValue(new c12(ar2Var.j().L(pa1VarC, tq2.a(jA))));
                            if (z) {
                                bx0Var = bx0Var2;
                            }
                            ar2Var.r.setValue(bx0Var);
                            ar2Var.x = false;
                            ar2Var.o();
                            break;
                        }
                    }
                }
                break;
            default:
                x73 x73Var = (x73) obj;
                if (z) {
                    bx0Var = bx0Var2;
                }
                x73Var.q(bx0Var);
                long jA2 = tq2.a(x73Var.j(z));
                me1 me1Var = x73Var.d;
                if (me1Var != null && (y83VarD = me1Var.d()) != null) {
                    long jE = y83VarD.e(jA2);
                    x73Var.o = jE;
                    x73Var.p(new c12(jE));
                    x73Var.q = 0L;
                    x73Var.t = -1;
                    me1 me1Var2 = x73Var.d;
                    if (me1Var2 != null) {
                        me1Var2.q.setValue(Boolean.TRUE);
                    }
                    x73Var.u(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s63
    public final void e(long j) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ar2 ar2Var = (ar2) obj;
                w52 w52Var = ar2Var.n;
                w52 w52Var2 = ar2Var.o;
                if (ar2Var.e() != null) {
                    w52Var2.setValue(new c12(c12.e(((c12) w52Var2.getValue()).a, j)));
                    long jE = c12.e(((c12) w52Var.getValue()).a, ((c12) w52Var2.getValue()).a);
                    if (ar2Var.n(jE, ((c12) ar2Var.n.getValue()).a, this.b, u92.o)) {
                        w52Var.setValue(new c12(jE));
                        w52Var2.setValue(new c12(0L));
                    }
                    break;
                }
                break;
            default:
                x73 x73Var = (x73) obj;
                long jE2 = c12.e(x73Var.q, j);
                x73Var.q = jE2;
                x73Var.p(new c12(c12.e(x73Var.o, jE2)));
                f83 f83VarL = x73Var.l();
                c12 c12VarG = x73Var.g();
                c12VarG.getClass();
                x73Var.v(f83VarL, c12VarG.a, false, this.b, u92.o, true, new kx0(9));
                x73Var.u(false);
                break;
        }
    }

    @Override // defpackage.s63
    public final void onCancel() {
        switch (this.a) {
            case 0:
                ar2 ar2Var = (ar2) this.c;
                ar2Var.x = true;
                ar2Var.o();
                ar2Var.r.setValue(null);
                ar2Var.s.setValue(null);
                break;
        }
    }

    public zq2(boolean z, ar2 ar2Var) {
        this.b = z;
        this.c = ar2Var;
    }

    private final void f() {
    }

    private final void g(long j, yp2 yp2Var) {
    }
}
