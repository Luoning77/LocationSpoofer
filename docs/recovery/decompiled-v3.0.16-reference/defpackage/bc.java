package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class bc implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bc(long j, pu0 pu0Var, int i) {
        this.e = 2;
        this.f = j;
        this.g = pu0Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.g;
        long j = this.f;
        switch (i) {
            case 0:
                dv1 dv1Var = (dv1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else if (j == 9205357640488583168L) {
                    ov0Var.c0(-1243644858);
                    gc.b(dv1Var, ov0Var, 0, 0);
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(-1244013944);
                    dv1 dv1VarJ = iw2.j(dv1Var, xd0.b(j), xd0.a(j), 0.0f, 0.0f, 12);
                    er1 er1VarC = ws.c(j9.g, false);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarJ);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, er1VarC);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    gc.b(null, ov0Var, 0, 1);
                    ov0Var.p(true);
                    ov0Var.p(false);
                }
                break;
            case 1:
                ey1 ey1Var = (ey1) obj3;
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    Object objQ = ov0Var2.Q();
                    if (objQ == d30.a) {
                        objQ = new xj2(ey1Var, 16);
                        ov0Var2.m0(objQ);
                    }
                    n51.j((au0) objQ, null, false, null, hu.f(j, ov0Var2), null, ym3.n, ov0Var2, 805306374, 494);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                h73.f(j, (pu0) obj3, (f30) obj, wc0.m0(1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ bc(int i, long j, Object obj) {
        this.e = i;
        this.f = j;
        this.g = obj;
    }
}
