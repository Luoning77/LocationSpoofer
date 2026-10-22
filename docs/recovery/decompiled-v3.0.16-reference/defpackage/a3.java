package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.ContributionStatus;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class a3 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ContributionStatus f;

    public /* synthetic */ a3(ContributionStatus contributionStatus, int i) {
        this.e = i;
        this.f = contributionStatus;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ContributionStatus contributionStatus = this.f;
        switch (i) {
            case 0:
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    s83.b(ke0.N(2131624879, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
                    s83.b(ke0.O(2131624878, new Object[]{Integer.valueOf(contributionStatus.getMonthlySearchCap())}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var.j(le3.a)).l, ov0Var, 0, 0, 131070);
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
                    dv1 dv1VarD = zm3.D(av1.a, 16.0f);
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
                    s83.b(ke0.O(2131624865, new Object[]{Long.valueOf(contributionStatus.getAvailablePoints())}, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, ((je3) ov0Var2.j(le3.a)).f, ov0Var2, 0, 0, 131070);
                    s83.b(ke0.O(2131624875, new Object[]{Long.valueOf(contributionStatus.getPendingPoints()), Integer.valueOf(contributionStatus.getVerifiedContributions())}, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                    s83.b(ke0.O(2131624866, new Object[]{Integer.valueOf(contributionStatus.getBonusSearchRemaining())}, ov0Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var2, 0, 0, 262142);
                    ov0Var2.p(true);
                }
                break;
        }
        return mf3Var;
    }
}
