package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class h4 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ey1 g;

    public /* synthetic */ h4(int i, ey1 ey1Var, boolean z) {
        this.e = i;
        this.f = z;
        this.g = ey1Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        av1 av1Var = av1.a;
        ey1 ey1Var = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((lk2) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else if (!z) {
                    ov0Var.c0(-137667532);
                    s83.b(ke0.N(((Boolean) ey1Var.getValue()).booleanValue() ? 2131624250 : 2131624261, ov0Var), null, 0L, 0L, jr0.i, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1572864, 0, 262078);
                    ov0Var.p(false);
                } else {
                    ov0Var.c0(-137670693);
                    vc2.a(iw2.k(av1Var, 18.0f), 0L, 2.0f, 0L, 0, 0.0f, ov0Var, 390, 58);
                    ov0Var.p(false);
                }
                break;
            default:
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarD = zm3.D(av1Var, 16.0f);
                    yz yzVarA = wz.a(new jo(8.0f, true, new fo(0)), j9.r, ov0Var2, 6);
                    int iHashCode = Long.hashCode(ov0Var2.T);
                    l72 l72VarL = ov0Var2.l();
                    dv1 dv1VarH = xp1.H(ov0Var2, dv1VarD);
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
                    String strN = ke0.N(2131624205, ov0Var2);
                    hh0 hh0Var = le3.a;
                    s83.b(strN, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var)).h, ov0Var2, 0, 0, 131070);
                    s83.b(ke0.N(2131624204, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var)).l, ov0Var2, 0, 0, 131070);
                    Object objQ = ov0Var2.Q();
                    if (objQ == d30.a) {
                        objQ = new s2(ey1Var, 14);
                        ov0Var2.m0(objQ);
                    }
                    n51.h((au0) objQ, null, !z, null, null, null, null, o51.s, ov0Var2, 805306374, 506);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
