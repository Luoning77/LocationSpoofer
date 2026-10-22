package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.RewardCoupon;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d4 implements ru0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ long f;
    public final /* synthetic */ au0 g;

    public d4(List list, long j, au0 au0Var) {
        this.e = list;
        this.f = j;
        this.g = au0Var;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        bc1 bc1Var = (bc1) obj;
        int iIntValue = ((Number) obj2).intValue();
        f30 f30Var = (f30) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((ov0) f30Var).f(bc1Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((ov0) f30Var).d(iIntValue) ? 32 : 16;
        }
        ov0 ov0Var = (ov0) f30Var;
        if (ov0Var.T(i & 1, (i & 147) != 146)) {
            RewardCoupon rewardCoupon = (RewardCoupon) this.e.get(iIntValue);
            ov0Var.c0(-589262762);
            sb.C(null, null, ym3.t(this.f, 0L, ov0Var, 0, 14), null, sb.a0(1257756017, new b4(rewardCoupon, this.g), ov0Var), ov0Var, 196608, 27);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
