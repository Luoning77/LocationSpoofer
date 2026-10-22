package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class v9 implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ v9(String str, lu0 lu0Var, s52 s52Var, lu0 lu0Var2, Double d, int i) {
        this.e = 0;
        this.g = str;
        this.h = lu0Var;
        this.j = s52Var;
        this.i = lu0Var2;
        this.k = d;
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        ?? r4;
        int i;
        String strO;
        String strO2;
        int i2 = this.e;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.k;
        Object obj6 = this.h;
        mf3 mf3Var = mf3.a;
        int i3 = this.f;
        Object obj7 = this.g;
        switch (i2) {
            case 0:
                String str = (String) obj7;
                lu0 lu0Var = (lu0) obj6;
                s52 s52Var = (s52) obj3;
                lu0 lu0Var2 = (lu0) obj4;
                Double d = (Double) obj5;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    av1 av1Var = av1.a;
                    dv1 dv1VarE = zm3.E(iw2.e(av1Var, 1.0f), 14.0f, 10.0f);
                    yz yzVarA = wz.a(new jo(8.0f, true, new fo(0)), j9.r, ov0Var, 6);
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
                    q73.h(ov0Var, ghVar, yzVarA);
                    gh ghVar2 = v20.d;
                    q73.h(ov0Var, ghVar2, l72VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    gh ghVar3 = v20.f;
                    q73.h(ov0Var, ghVar3, numValueOf);
                    wa waVar = v20.g;
                    q73.g(ov0Var, waVar);
                    gh ghVar4 = v20.c;
                    q73.h(ov0Var, ghVar4, dv1VarH);
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    u92 u92Var = am1.i;
                    kk2 kk2VarA = jk2.a(u92Var, j9.p, ov0Var, 54);
                    int iHashCode2 = Long.hashCode(ov0Var.T);
                    l72 l72VarL2 = ov0Var.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var, dv1VarE2);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, kk2VarA);
                    q73.h(ov0Var, ghVar2, l72VarL2);
                    az2.s(iHashCode2, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH2);
                    String strN = ke0.N(2131624009, ov0Var);
                    long jC = v63.c(14);
                    jr0 jr0Var = jr0.j;
                    hh0 hh0Var = mz.a;
                    s83.b(strN, null, ((kz) ov0Var.j(hh0Var)).q, jC, jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597440, 0, 262058);
                    if (d != null) {
                        ov0Var.c0(59557431);
                        if (i3 == 0) {
                            ov0Var.c0(59608240);
                            strO2 = ke0.O(2131624006, new Object[]{xp1.y(d.doubleValue())}, ov0Var);
                            ov0Var.p(false);
                            i = 12;
                        } else {
                            ov0Var.c0(59739246);
                            i = 12;
                            double d2 = i3;
                            strO2 = ke0.O(2131624008, new Object[]{xp1.y(d.doubleValue() - d2), xp1.y(d.doubleValue() + d2)}, ov0Var);
                            ov0Var.p(false);
                        }
                        s83.b(strO2, null, bk.g, v63.c(i), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                        r4 = 0;
                    } else {
                        r4 = 0;
                        i = 12;
                        ov0Var.c0(56808041);
                    }
                    ov0Var.p(r4);
                    ov0Var.p(true);
                    dv1 dv1VarE3 = iw2.e(av1Var, 1.0f);
                    int i4 = i;
                    n91 n91Var = new n91(3, r4, 123);
                    long j = bk.g;
                    ee0.i(str, lu0Var, dv1VarE3, false, null, xq1.a, null, null, null, null, false, null, n91Var, null, true, 0, 0, null, j9.k(0L, 0L, 0L, 0L, 0L, 0L, 0L, j, 0L, 0L, j, 0L, ov0Var, 2139092991), ov0Var, 1573248, 12779520, 4030392);
                    dv1 dv1VarE4 = iw2.e(av1Var, 1.0f);
                    kk2 kk2VarA2 = jk2.a(u92Var, j9.o, ov0Var, 6);
                    int iHashCode3 = Long.hashCode(ov0Var.T);
                    l72 l72VarL3 = ov0Var.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var, dv1VarE4);
                    ov0Var.g0();
                    if (ov0Var.S) {
                        ov0Var.k(x30Var);
                    } else {
                        ov0Var.p0();
                    }
                    q73.h(ov0Var, ghVar, kk2VarA2);
                    q73.h(ov0Var, ghVar2, l72VarL3);
                    az2.s(iHashCode3, ov0Var, ghVar3, ov0Var, waVar);
                    q73.h(ov0Var, ghVar4, dv1VarH3);
                    s83.b(ke0.N(2131624010, ov0Var), null, hz.c(0.6f, ((kz) ov0Var.j(hh0Var)).q), v63.c(i4), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    if (i3 == 0) {
                        strO = az2.h(ov0Var, 418532465, 2131624012, ov0Var, false);
                    } else {
                        ov0Var.c0(418534810);
                        strO = ke0.O(2131624013, new Object[]{Integer.valueOf(i3)}, ov0Var);
                        ov0Var.p(false);
                    }
                    s83.b(strO, null, j, v63.c(i4), jr0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 1597824, 0, 262058);
                    ov0Var.p(true);
                    float fG = s52Var.g();
                    boolean zF = ov0Var.f(s52Var) | ov0Var.f(lu0Var2);
                    Object objQ = ov0Var.Q();
                    if (zF || objQ == d30.a) {
                        objQ = new u9(lu0Var2, s52Var, 0);
                        ov0Var.m0(objQ);
                    }
                    fy fyVar = new fy(0.0f, 100.0f);
                    sw2 sw2Var = sw2.a;
                    dx2.a(fG, (lu0) objQ, null, false, fyVar, 99, null, sw2.d(j, j, ((kz) ov0Var.j(hh0Var)).r, ov0Var, 1012), null, ov0Var, 196608, 332);
                    s83.b(ke0.N(2131624011, ov0Var), null, hz.c(0.55f, ((kz) ov0Var.j(hh0Var)).q), v63.c(11), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    ov0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((p10) obj7).j(this.h, this.i, this.j, this.k, (f30) obj, wc0.m0(i3) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                wq1.a((kz) obj7, (uv1) obj6, (gu2) obj4, (je3) obj3, (p10) obj5, (f30) obj, wc0.m0(i3 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                h73.g((mc3) obj7, (kc3) obj6, this.i, this.j, (ln0) obj5, (f30) obj, wc0.m0(i3 | 1));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ v9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.f = i;
    }
}
