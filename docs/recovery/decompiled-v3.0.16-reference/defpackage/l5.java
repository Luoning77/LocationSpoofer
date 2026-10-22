package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class l5 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;

    public /* synthetic */ l5(boolean z, ey1 ey1Var, ey1 ey1Var2, int i) {
        this.e = i;
        this.f = z;
        this.g = ey1Var;
        this.h = ey1Var2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        c30 c30Var = d30.a;
        ey1 ey1Var = this.h;
        ey1 ey1Var2 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    Object objQ = ov0Var.Q();
                    if (objQ == c30Var) {
                        objQ = new h2(ey1Var2, ey1Var, 4);
                        ov0Var.m0(objQ);
                    }
                    n51.j((au0) objQ, null, !z, null, null, null, o51.I, ov0Var, 805306374, 506);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    yz yzVarA = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var2, 6);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    av1 av1Var = av1.a;
                    dv1 dv1VarH = xp1.H(ov0Var2, av1Var);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, yzVarA);
                    q73.h(ov0Var2, v20.d, l72VarL);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH);
                    s83.b(ke0.N(2131624307, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                    String str = (String) ey1Var2.getValue();
                    boolean z2 = !z;
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    boolean zF = ov0Var2.f(ey1Var2);
                    Object objQ2 = ov0Var2.Q();
                    if (zF || objQ2 == c30Var) {
                        objQ2 = new f4(ey1Var2, 18);
                        ov0Var2.m0(objQ2);
                    }
                    ee0.i(str, (lu0) objQ2, dv1VarE, z2, null, ym3.g, null, null, null, null, false, null, null, null, true, 0, 0, null, null, ov0Var2, 1573248, 12582912, 8257456);
                    String str2 = (String) ey1Var.getValue();
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    boolean zF2 = ov0Var2.f(ey1Var);
                    Object objQ3 = ov0Var2.Q();
                    if (zF2 || objQ3 == c30Var) {
                        objQ3 = new f4(ey1Var, 17);
                        ov0Var2.m0(objQ3);
                    }
                    ee0.i(str2, (lu0) objQ3, dv1VarE2, z2, null, ym3.h, null, null, null, null, false, null, null, null, false, 3, 0, null, null, ov0Var2, 1573248, 100663296, 8126384);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
