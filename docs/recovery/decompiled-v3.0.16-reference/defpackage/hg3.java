package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class hg3 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xg3 f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ hg3(xg3 xg3Var, ey1 ey1Var, int i) {
        this.e = i;
        this.f = xg3Var;
        this.g = ey1Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        av1 av1Var = av1.a;
        ey1 ey1Var = this.g;
        int i2 = 0;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA = jk2.a(am1.i, j9.p, ov0Var, 54);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarE);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    gh ghVar = v20.e;
                    q73.h(ov0Var, ghVar, kk2VarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var, ghVar4, dv1VarH);
                    dv1 dv1VarG = zm3.G(new wb1(1.0f, true), 0.0f, 0.0f, 12.0f, 0.0f, 11);
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarG);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, yzVarA);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    String strN = ke0.N(2131624106, ov0Var);
                    long jC = v63.c(15);
                    jr0 jr0Var = jr0.i;
                    hh0 hh0Var = mz.a;
                    s83.b(strN, null, ((kz) ov0Var.j(hh0Var)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    ov0 ov0Var2 = ov0Var;
                    gh0.h(ov0Var2, iw2.g(av1Var, 3.0f));
                    String str = ((og3) ey1Var.getValue()).o;
                    if (str == null) {
                        ov0Var2.c0(299758667);
                    } else {
                        ov0Var2.c0(299758668);
                        s83.b(ke0.N(ji2.A(str), ov0Var2), null, ((kz) ov0Var2.j(hh0Var)).w, v63.c(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                        ov0Var2 = ov0Var2;
                    }
                    ov0Var2.p(false);
                    ov0 ov0Var3 = ov0Var2;
                    s83.b(ke0.N(2131624105, ov0Var2), null, hz.c(0.6f, ((kz) ov0Var2.j(hh0Var)).q), v63.b(12.5d), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var3, 24576, 0, 262122);
                    ov0Var3.p(true);
                    boolean zF = o51.f(((og3) ey1Var.getValue()).m, Boolean.TRUE);
                    boolean z = (((og3) ey1Var.getValue()).m == null || ((og3) ey1Var.getValue()).a || ((og3) ey1Var.getValue()).n) ? false : true;
                    xg3 xg3Var = this.f;
                    boolean zH = ov0Var3.h(xg3Var);
                    Object objQ = ov0Var3.Q();
                    if (zH || objQ == d30.a) {
                        objQ = new l(1, xg3Var, xg3.class, "setBetaUpdates", "setBetaUpdates(Z)V", 0, 27);
                        ov0Var3.m0(objQ);
                    }
                    wc0.p(zF, (lu0) ((o81) objQ), null, null, z, ov0Var3, 0);
                    ov0Var3.p(true);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var4 = (ov0) f30Var2;
                if (!ov0Var4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var4.W();
                } else {
                    zm3.b(iw2.e(av1Var, 1.0f), 18.0f, new b52(18.0f, 14.0f, 18.0f, 14.0f), sb.a0(-402031313, new hg3(this.f, ey1Var, i2), ov0Var4), ov0Var4, 25014, 8);
                }
                break;
        }
        return mf3Var;
    }
}
