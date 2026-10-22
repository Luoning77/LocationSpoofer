package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class cc implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cc(long j, ey1 ey1Var, ey1 ey1Var2) {
        this.e = 1;
        this.f = j;
        this.g = ey1Var;
        this.h = ey1Var2;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        int i2 = 1;
        mf3 mf3Var = mf3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gc.a((f12) obj4, (dv1) obj3, this.f, (f30) obj, wc0.m0(1));
                break;
            case 1:
                ey1 ey1Var = (ey1) obj4;
                ey1 ey1Var2 = (ey1) obj3;
                f30 f30Var = (f30) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 0;
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
                    int iHashCode = Long.hashCode(ov0Var.T);
                    l72 l72VarL = ov0Var.l();
                    av1 av1Var = av1.a;
                    dv1 dv1VarH = xp1.H(ov0Var, av1Var);
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
                    String strN = ke0.N(2131624365, ov0Var);
                    long jC = v63.c(14);
                    long j = this.f;
                    s83.b(strN, null, j, jC, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    gh0.h(ov0Var, iw2.g(av1Var, 16.0f));
                    String str = (String) ey1Var.getValue();
                    n91 n91Var = new n91(9, 0, 123);
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    t63 t63VarK = am1.k(ov0Var);
                    Object objQ = ov0Var.Q();
                    c30 c30Var = d30.a;
                    if (objQ == c30Var) {
                        objQ = new f4(ey1Var, 20);
                        ov0Var.m0(objQ);
                    }
                    ee0.i(str, (lu0) objQ, dv1VarE, false, null, am1.p, sb.a0(243341943, new p80(i3, j), ov0Var), sb.a0(-215293576, new p80(i2, j), ov0Var), null, null, false, null, n91Var, null, true, 0, 0, null, t63VarK, ov0Var, 114819504, 12779520, 4030008);
                    gh0.h(ov0Var, iw2.g(av1Var, 8.0f));
                    String str2 = (String) ey1Var2.getValue();
                    n91 n91Var2 = new n91(9, 0, 123);
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    t63 t63VarK2 = am1.k(ov0Var);
                    Object objQ2 = ov0Var.Q();
                    if (objQ2 == c30Var) {
                        objQ2 = new f4(ey1Var2, 21);
                        ov0Var.m0(objQ2);
                    }
                    ee0.i(str2, (lu0) objQ2, dv1VarE2, false, null, am1.q, sb.a0(1504118304, new p80(2, j), ov0Var), sb.a0(-1157951263, new p80(3, j), ov0Var), null, null, false, null, n91Var2, null, true, 0, 0, null, t63VarK2, ov0Var, 114819504, 12779520, 4030008);
                    ov0Var.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mc0.i((x01) obj4, (String) obj3, this.f, (f30) obj, wc0.m0(385));
                break;
        }
        return mf3Var;
    }

    public /* synthetic */ cc(Object obj, Object obj2, long j, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.f = j;
    }
}
