package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.RewardCoupon;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class b4 implements qu0 {
    public final /* synthetic */ RewardCoupon e;
    public final /* synthetic */ au0 f;

    public b4(RewardCoupon rewardCoupon, au0 au0Var) {
        this.e = rewardCoupon;
        this.f = au0Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f30 f30Var = (f30) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((zz) obj).getClass();
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            dv1 dv1VarD = zm3.D(av1.a, 16.0f);
            yz yzVarA = wz.a(am1.g, j9.r, ov0Var, 0);
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
            RewardCoupon rewardCoupon = this.e;
            s83.b(ke0.O(2131624870, new Object[]{Integer.valueOf(rewardCoupon.getAmountCents() / 100), Integer.valueOf(rewardCoupon.getMinimumCents() / 100)}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
            String strV = xq1.v(rewardCoupon.getExpiresAt());
            strV.getClass();
            s83.b(ke0.O(2131624051, new Object[]{strV}, ov0Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
            b52 b52Var = hu.a;
            n51.j(this.f, null, false, null, hu.f(bk.g, ov0Var), null, ks.w, ov0Var, 805306368, 494);
            ov0Var.p(true);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
