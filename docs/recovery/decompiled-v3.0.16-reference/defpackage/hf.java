package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hf extends aa1 implements pu0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ya2 g;
    public final /* synthetic */ ey1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hf(ya2 ya2Var, ey1 ey1Var, int i) {
        super(2);
        this.f = i;
        this.g = ya2Var;
        this.h = ey1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.h;
        ya2 ya2Var = this.g;
        int i2 = 0;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    Object objQ = ov0Var.Q();
                    c30 c30Var = d30.a;
                    if (objQ == c30Var) {
                        objQ = wa.n;
                        ov0Var.m0(objQ);
                    }
                    dv1 dv1VarA = gs2.a(av1.a, false, (lu0) objQ);
                    boolean zH = ov0Var.h(ya2Var);
                    Object objQ2 = ov0Var.Q();
                    if (zH || objQ2 == c30Var) {
                        objQ2 = new ef(ya2Var, 1);
                        ov0Var.m0(objQ2);
                    }
                    dv1 dv1VarC = am1.c(ji2.K(dv1VarA, (lu0) objQ2), ya2Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                    hh0 hh0Var = jf.a;
                    pu0 pu0Var = (pu0) ey1Var.getValue();
                    Object objQ3 = ov0Var.Q();
                    if (objQ3 == c30Var) {
                        objQ3 = lc.c;
                        ov0Var.m0(objQ3);
                    }
                    er1 er1Var = (er1) objQ3;
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarC);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, er1Var);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    pu0Var.invoke(ov0Var, 0);
                    ov0Var.p(true);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    k22.b(jf.b.a(Boolean.TRUE), sb.a0(1022273628, new hf(ya2Var, ey1Var, i2), ov0Var2), ov0Var2, 56);
                }
                break;
        }
        return mf3Var;
    }
}
