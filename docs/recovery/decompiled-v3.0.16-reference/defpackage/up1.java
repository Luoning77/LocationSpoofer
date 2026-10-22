package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class up1 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ tg f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ t52 j;

    public /* synthetic */ up1(tg tgVar, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, t52 t52Var, int i) {
        this.e = i;
        this.f = tgVar;
        this.g = ey1Var;
        this.h = ey1Var2;
        this.i = ey1Var3;
        this.j = t52Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        av1 av1Var = av1.a;
        switch (i) {
            case 0:
                z42 z42Var = (z42) obj;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                z42Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ov0) f30Var).f(z42Var) ? 4 : 2;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarD = zm3.D(zm3.P(zm3.C(iw2.c, z42Var), zm3.O(ov0Var), true), 16.0f);
                    yz yzVarA = wz.a(new jo(16.0f, true, new fo(0)), j9.r, ov0Var, 6);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    dv1 dv1VarH = xp1.H(ov0Var, dv1VarD);
                    w20.b.getClass();
                    x30 x30Var = v20.b;
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, v20.e, yzVarA);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    tg tgVar = this.f;
                    sb.C(dv1VarE, null, null, null, sb.a0(277944694, new au(tgVar, 3), ov0Var), ov0Var, 196614, 30);
                    ov0Var.c0(-1717822534);
                    sb.C(iw2.e(av1Var, 1.0f), null, null, null, sb.a0(-1613972421, new up1(tgVar, this.g, this.h, this.i, this.j, 1), ov0Var), ov0Var, 196614, 30);
                    ov0Var.p(false);
                    ov0Var.p(true);
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
                    dv1 dv1VarD2 = zm3.D(av1Var, 20.0f);
                    yz yzVarA2 = wz.a(new jo(12.0f, true, new fo(0)), j9.r, ov0Var2, 6);
                    int iHashCode2 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL2 = ov0Var2.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarD2);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, yzVarA2);
                    q73.h(ov0Var2, v20.d, l72VarL2);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH2);
                    hh0 hh0Var = le3.a;
                    s83.b("Sentinel-2", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var)).g, ov0Var2, 6, 0, 131070);
                    s83.b(ke0.N(2131624927, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                    s83.b(ke0.N(2131624920, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                    s83.b("Contains modified Copernicus Sentinel data 2026", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var)).l, ov0Var2, 6, 0, 131070);
                    if (((Boolean) this.g.getValue()).booleanValue()) {
                        ov0Var2.c0(-1171560043);
                        vc2.c(iw2.e(av1Var, 1.0f), 0L, 0L, 0, 0.0f, ov0Var2, 6, 30);
                    } else {
                        ov0Var2.c0(-1962141091);
                    }
                    ov0Var2.p(false);
                    String str = (String) this.h.getValue();
                    if (str == null) {
                        ov0Var2.c0(-1958545216);
                    } else {
                        ov0Var2.c0(-1958545215);
                        s83.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(hh0Var)).l, ov0Var2, 0, 0, 131070);
                    }
                    ov0Var2.p(false);
                    boolean zBooleanValue = ((Boolean) this.i.getValue()).booleanValue();
                    c30 c30Var = d30.a;
                    if (zBooleanValue) {
                        ov0Var2.c0(-1958446914);
                        s83.b(ke0.N(2131624923, ov0Var2), null, ((kz) ov0Var2.j(mz.a)).w, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262138);
                        Object objQ = ov0Var2.Q();
                        if (objQ == c30Var) {
                            objQ = new id(this.j, 4);
                            ov0Var2.m0(objQ);
                        }
                        n51.j((au0) objQ, null, false, null, null, null, am1.u, ov0Var2, 805306374, 510);
                    } else {
                        ov0Var2.c0(-1962141091);
                    }
                    ov0Var2.p(false);
                    tg tgVar2 = this.f;
                    boolean zH = ov0Var2.h(tgVar2);
                    Object objQ2 = ov0Var2.Q();
                    if (zH || objQ2 == c30Var) {
                        objQ2 = new vp1(tgVar2, 0);
                        ov0Var2.m0(objQ2);
                    }
                    n51.j((au0) objQ2, null, false, null, null, null, am1.v, ov0Var2, 805306368, 510);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
