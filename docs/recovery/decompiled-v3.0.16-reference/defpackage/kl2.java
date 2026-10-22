package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.ContributionStatus;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class kl2 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kl2(int i, long j, Object obj) {
        this.e = i;
        this.f = j;
        this.g = obj;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.e;
        av1 av1Var = av1.a;
        long j = this.f;
        mf3 mf3Var = mf3.a;
        Object obj4 = this.g;
        switch (i2) {
            case 0:
                ey1 ey1Var = (ey1) obj4;
                pu0 pu0Var = (pu0) obj;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pu0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ov0) f30Var).h(pu0Var) ? 4 : 2;
                }
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ov0Var.W();
                } else {
                    dv1 dv1VarE = iw2.e(av1Var, 1.0f);
                    er1 er1VarC = ws.c(j9.f, false);
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
                    q73.h(ov0Var, v20.e, er1VarC);
                    q73.h(ov0Var, v20.d, l72VarL);
                    q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
                    q73.g(ov0Var, v20.g);
                    q73.h(ov0Var, v20.c, dv1VarH);
                    if (((String) ey1Var.getValue()).length() == 0) {
                        ov0Var.c0(1470809260);
                        s83.b(ke0.N(2131624777, ov0Var), null, hz.c(0.6f, j), v63.c(15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 24576, 0, 262122);
                    } else {
                        ov0Var.c0(1464966256);
                    }
                    ov0Var.p(false);
                    pu0Var.invoke(ov0Var, Integer.valueOf(iIntValue & 14));
                    ov0Var.p(true);
                }
                break;
            case 1:
                ey1 ey1Var2 = (ey1) obj4;
                pu0 pu0Var2 = (pu0) obj;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pu0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = 15;
                    iIntValue2 |= ((ov0) f30Var2).h(pu0Var2) ? 4 : 2;
                } else {
                    i = 15;
                }
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarE2 = iw2.e(av1Var, 1.0f);
                    er1 er1VarC2 = ws.c(j9.f, false);
                    int iHashCode2 = Long.hashCode(ov0Var2.T);
                    l72 l72VarL2 = ov0Var2.l();
                    dv1 dv1VarH2 = xp1.H(ov0Var2, dv1VarE2);
                    w20.b.getClass();
                    x30 x30Var2 = v20.b;
                    ov0Var2.g0();
                    if (ov0Var2.S) {
                        ov0Var2.k(x30Var2);
                    } else {
                        ov0Var2.p0();
                    }
                    q73.h(ov0Var2, v20.e, er1VarC2);
                    q73.h(ov0Var2, v20.d, l72VarL2);
                    q73.h(ov0Var2, v20.f, Integer.valueOf(iHashCode2));
                    q73.g(ov0Var2, v20.g);
                    q73.h(ov0Var2, v20.c, dv1VarH2);
                    if (((String) ey1Var2.getValue()).length() == 0) {
                        ov0Var2.c0(-186501248);
                        s83.b(ke0.N(2131624905, ov0Var2), null, hz.c(0.6f, j), v63.c(i), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 24576, 0, 262122);
                    } else {
                        ov0Var2.c0(-193142006);
                    }
                    ov0Var2.p(false);
                    pu0Var2.invoke(ov0Var2, Integer.valueOf(iIntValue2 & 14));
                    ov0Var2.p(true);
                }
                break;
            default:
                ContributionStatus contributionStatus = (ContributionStatus) obj4;
                f30 f30Var3 = (f30) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var3 = (ov0) f30Var3;
                if (!ov0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ov0Var3.W();
                } else {
                    sb.C(null, null, ym3.t(this.f, 0L, ov0Var3, 0, 14), null, sb.a0(1463302667, new a3(contributionStatus, 1), ov0Var3), ov0Var3, 196608, 27);
                }
                break;
        }
        return mf3Var;
    }
}
