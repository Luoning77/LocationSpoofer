package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fw implements pu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p10 f;

    public /* synthetic */ fw(p10 p10Var, int i) {
        this.e = i;
        this.f = p10Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        zz zzVar = zz.a;
        av1 av1Var = av1.a;
        mf3 mf3Var = mf3.a;
        p10 p10Var = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj;
                int iIntValue = ((Number) obj2).intValue();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ov0Var.W();
                } else {
                    yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
                    int iT = ks.T(ov0Var);
                    l72 l72VarL = ov0Var.l();
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
                    gh ghVar = v20.f;
                    if (ov0Var.S || !o51.f(ov0Var.Q(), Integer.valueOf(iT))) {
                        az2.r(iT, ov0Var, iT, ghVar);
                    }
                    q73.h(ov0Var, v20.c, dv1VarH);
                    p10Var.invoke(zzVar, ov0Var, 6);
                    ov0Var.p(true);
                }
                break;
            case 1:
                f30 f30Var2 = (f30) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ov0Var2.W();
                } else {
                    yz yzVarA2 = wz.a(am1.g, j9.r, ov0Var2, 0);
                    int iT2 = ks.T(ov0Var2);
                    l72 l72VarL2 = ov0Var2.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var2, av1Var);
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
                    gh ghVar2 = v20.f;
                    if (ov0Var2.S || !o51.f(ov0Var2.Q(), Integer.valueOf(iT2))) {
                        az2.r(iT2, ov0Var2, iT2, ghVar2);
                    }
                    q73.h(ov0Var2, v20.c, dv1VarH2);
                    p10Var.invoke(zzVar, ov0Var2, 6);
                    ov0Var2.p(true);
                }
                break;
            default:
                f30 f30Var3 = (f30) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ov0Var3.W();
                } else {
                    if (1.0f <= 0.0d) {
                        n21.a("invalid weight; must be greater than zero");
                    }
                    dv1 dv1VarG = zm3.G(new wb1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 0.0f, 0.0f, 10);
                    er1 er1VarC = ws.c(j9.f, false);
                    int iT3 = ks.T(ov0Var3);
                    l72 l72VarL3 = ov0Var3.l();
                    dv1 dv1VarH3 = xp1.H(ov0Var3, dv1VarG);
                    w20.b.getClass();
                    x30 x30Var3 = v20.b;
                    ov0Var3.g0();
                    if (ov0Var3.S) {
                        ov0Var3.k(x30Var3);
                    } else {
                        ov0Var3.p0();
                    }
                    q73.h(ov0Var3, v20.e, er1VarC);
                    q73.h(ov0Var3, v20.d, l72VarL3);
                    gh ghVar3 = v20.f;
                    if (ov0Var3.S || !o51.f(ov0Var3.Q(), Integer.valueOf(iT3))) {
                        az2.r(iT3, ov0Var3, iT3, ghVar3);
                    }
                    q73.h(ov0Var3, v20.c, dv1VarH3);
                    p10Var.invoke(ov0Var3, 0);
                    ov0Var3.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
