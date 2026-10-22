package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v10 implements qu0 {
    public static final v10 f = new v10(0);
    public static final v10 g = new v10(1);
    public final /* synthetic */ int e;

    public /* synthetic */ v10(int i) {
        this.e = i;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        av1 av1Var = av1.a;
        c30 c30Var = d30.a;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                }
                break;
            case 1:
                jg0 jg0Var = (jg0) obj;
                long j = ((c12) obj2).a;
                long j2 = ((hz) obj3).a;
                sw2 sw2Var = sw2.a;
                jg0.Y(jg0Var, j2, jg0Var.R(sw2.c) / 2.0f, j, null, 120);
                break;
            case 2:
                f30 f30Var2 = (f30) obj2;
                ((Number) obj3).intValue();
                b52 b52Var = ix.a;
                ov0 ov0Var2 = (ov0) f30Var2;
                ov0Var2.c0(1575618259);
                ov0Var2.p(false);
                ov0 ov0Var3 = (ov0) f30Var2;
                Object objQ = ov0Var3.Q();
                if (objQ == c30Var) {
                    objQ = ke0.H(null);
                    ov0Var3.m0(objQ);
                }
                ey1 ey1Var = (ey1) objQ;
                er1 er1VarC = ws.c(j9.j, false);
                int iT = ks.T(f30Var2);
                ov0 ov0Var4 = (ov0) f30Var2;
                l72 l72VarL = ov0Var4.l();
                dv1 dv1VarH = xp1.H(f30Var2, av1Var);
                w20.b.getClass();
                x30 x30Var = v20.b;
                ov0Var4.g0();
                if (ov0Var4.S) {
                    ov0Var4.k(x30Var);
                } else {
                    ov0Var4.p0();
                }
                q73.h(f30Var2, v20.e, er1VarC);
                q73.h(f30Var2, v20.d, l72VarL);
                gh ghVar = v20.f;
                if (ov0Var4.S || !o51.f(ov0Var4.Q(), Integer.valueOf(iT))) {
                    az2.r(iT, ov0Var4, iT, ghVar);
                }
                q73.h(f30Var2, v20.c, dv1VarH);
                pu0 pu0Var = (pu0) ey1Var.getValue();
                if (pu0Var == null) {
                    ov0Var4.c0(-1538103400);
                } else {
                    ov0Var4.c0(-326710903);
                    pu0Var.invoke(f30Var2, 0);
                }
                ov0Var4.p(false);
                ov0Var4.p(true);
                break;
            default:
                f30 f30Var3 = (f30) obj2;
                ((Number) obj3).intValue();
                b52 b52Var2 = ix.a;
                ov0 ov0Var5 = (ov0) f30Var3;
                ov0Var5.c0(-1218863531);
                ov0Var5.p(false);
                ov0 ov0Var6 = (ov0) f30Var3;
                Object objQ2 = ov0Var6.Q();
                if (objQ2 == c30Var) {
                    objQ2 = ke0.H(null);
                    ov0Var6.m0(objQ2);
                }
                ey1 ey1Var2 = (ey1) objQ2;
                er1 er1VarC2 = ws.c(j9.j, false);
                int iT2 = ks.T(f30Var3);
                ov0 ov0Var7 = (ov0) f30Var3;
                l72 l72VarL2 = ov0Var7.l();
                dv1 dv1VarH2 = xp1.H(f30Var3, av1Var);
                w20.b.getClass();
                x30 x30Var2 = v20.b;
                ov0Var7.g0();
                if (ov0Var7.S) {
                    ov0Var7.k(x30Var2);
                } else {
                    ov0Var7.p0();
                }
                q73.h(f30Var3, v20.e, er1VarC2);
                q73.h(f30Var3, v20.d, l72VarL2);
                gh ghVar2 = v20.f;
                if (ov0Var7.S || !o51.f(ov0Var7.Q(), Integer.valueOf(iT2))) {
                    az2.r(iT2, ov0Var7, iT2, ghVar2);
                }
                q73.h(f30Var3, v20.c, dv1VarH2);
                pu0 pu0Var2 = (pu0) ey1Var2.getValue();
                if (pu0Var2 == null) {
                    ov0Var7.c0(-2101783313);
                } else {
                    ov0Var7.c0(-344894126);
                    pu0Var2.invoke(f30Var3, 0);
                }
                ov0Var7.p(false);
                ov0Var7.p(true);
                break;
        }
        return mf3Var;
    }
}
