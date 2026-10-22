package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class iu2 extends aa1 implements lu0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ h82 g;
    public final /* synthetic */ ju2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu2(ju2 ju2Var, h82 h82Var) {
        super(1);
        this.h = ju2Var;
        this.g = h82Var;
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        long j;
        char c;
        long j2;
        pe2 pe2VarD;
        long jE;
        pa1 pa1VarH;
        int i = this.f;
        mf3 mf3Var = mf3.a;
        ju2 ju2Var = this.h;
        h82 h82Var = this.g;
        c12 c12Var = null;
        switch (i) {
            case 0:
                g82 g82Var = (g82) obj;
                ju2Var.t = true;
                ju2Var.s = null;
                cv2 cv2VarA = ju2Var.u.e().c.a();
                if (!ju2Var.u.h()) {
                    g82.z(g82Var, h82Var, 0, 0);
                    return mf3Var;
                }
                if (!cv2VarA.d()) {
                    g82.z(g82Var, h82Var, 0, 0);
                    return mf3Var;
                }
                mn2 mn2VarE = cv2VarA.e();
                if (mn2VarE != null) {
                    pe2 pe2VarC = cv2VarA.c();
                    if (pe2VarC != null) {
                        if (!ju2Var.u.e().b.a()) {
                            if (ju2Var.u.d().b()) {
                                g82.z(g82Var, h82Var, 0, 0);
                                return mf3Var;
                            }
                            pa1 pa1VarH2 = g82Var.h();
                            long jO = pa1VarH2 != null ? gh0.O(c12.d(pe2VarC.e(), ju2Var.n1().L(pa1VarH2, 0L))) : 0L;
                            g82.z(g82Var, h82Var, (int) (jO >> 32), (int) (jO & 4294967295L));
                            return mf3Var;
                        }
                        pa1 pa1VarH3 = g82Var.h();
                        if (pa1VarH3 == null) {
                            g82.z(g82Var, h82Var, 0, 0);
                            return mf3Var;
                        }
                        boolean zB = ju2Var.u.e().c.a().b();
                        long jL = ju2Var.n1().L(pa1VarH3, 0L);
                        ce0.E(mn2VarE);
                        pu2 pu2Var = ju2Var.u;
                        if (zB) {
                            j = 4294967295L;
                            pu2Var.d().a(pe2VarC, ce0.E(mn2VarE), null);
                        } else {
                            j = 4294967295L;
                            pu2Var.d().a(pe2VarC, ce0.E(mn2VarE), new ui1(2));
                        }
                        pe2 pe2VarC2 = ju2Var.u.d().c();
                        if (pe2VarC2 != null) {
                            c = ' ';
                            c12Var = new c12(c12.e(c12.d(pe2VarC2.e(), ((c12) ((w52) mn2VarE.f).getValue()).a), ((c12) ((w52) mn2VarE.h).getValue()).a));
                        } else {
                            c = ' ';
                        }
                        if (ju2Var.u.d().b() || !zB) {
                            long j3 = c12Var != null ? c12Var.a : jL;
                            if (c12Var == null) {
                                j2 = jL;
                                pe2VarD = ce0.d(j2, mc0.J(pa1VarH3.f0()));
                            } else {
                                j2 = jL;
                                pe2VarD = ce0.d(c12Var.a, pe2VarC2.d());
                            }
                            ju2Var.u.e().c.a().i(pe2VarD);
                            jE = j3;
                        } else {
                            jE = c12Var != null ? c12Var.a : pe2VarC.e();
                            j2 = jL;
                        }
                        long jD = c12.d(jE, j2);
                        g82.z(g82Var, h82Var, Math.round(Float.intBitsToFloat((int) (jD >> c))), Math.round(Float.intBitsToFloat((int) (jD & j))));
                        return mf3Var;
                    }
                    b81.z(cv2VarA, "Match State is configured, but current bounds is null. State = ");
                } else {
                    b81.z(cv2VarA, "Match State is configured, but target data is null. State = ");
                }
                return null;
            default:
                g82 g82Var2 = (g82) obj;
                g82.z(g82Var2, h82Var, 0, 0);
                nu2 nu2VarE = ju2Var.u.e();
                pu2 pu2Var2 = ju2Var.u;
                dv2 dv2Var = nu2VarE.c;
                dv2Var.c();
                if (o51.f(dv2Var.a(), pz1.a) || !pu2Var2.h()) {
                    return mf3Var;
                }
                cv2 cv2VarA2 = dv2Var.a();
                if (!pu2Var2.d().b() || !cv2VarA2.b() || (pa1VarH = g82Var2.h()) == null) {
                    return mf3Var;
                }
                long J = mc0.J(pa1VarH.f0());
                wu2 wu2Var = pu2Var2.e().b;
                pa1 pa1Var = pu2Var2.e().b.j;
                if (pa1Var != null) {
                    long jH = wu2Var.e.h(pa1Var, pa1VarH);
                    wu2 wu2Var2 = pu2Var2.e().b;
                    pa1 pa1Var2 = pu2Var2.e().b.j;
                    if (pa1Var2 != null) {
                        long jG = pa1.G(pa1Var2, pa1VarH, 2);
                        cv2 cv2VarA3 = dv2Var.a();
                        nu2 nu2Var = dv2Var.a;
                        ju2 ju2Var2 = dv2Var.f;
                        ju2Var2.getClass();
                        dv2Var.b.setValue(cv2VarA3.a(nu2Var, ju2Var2, J, jH, jG));
                        return mf3Var;
                    }
                    fo.i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                } else {
                    fo.i("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu2(h82 h82Var, ju2 ju2Var) {
        super(1);
        this.g = h82Var;
        this.h = ju2Var;
    }
}
