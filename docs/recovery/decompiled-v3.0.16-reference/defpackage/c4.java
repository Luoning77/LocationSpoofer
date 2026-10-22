package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.RewardEntry;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c4 implements ru0 {
    public final /* synthetic */ List e;

    public c4(List list) {
        this.e = list;
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
            RewardEntry rewardEntry = (RewardEntry) this.e.get(iIntValue);
            ov0Var.c0(-556569320);
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            kk2 kk2VarA = jk2.a(am1.e, j9.o, ov0Var, 0);
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
            q73.h(ov0Var, v20.e, kk2VarA);
            q73.h(ov0Var, v20.d, l72VarL);
            q73.h(ov0Var, v20.f, Integer.valueOf(iHashCode));
            q73.g(ov0Var, v20.g);
            q73.h(ov0Var, v20.c, dv1VarH);
            String strV = xq1.v(rewardEntry.getCreatedAt());
            strV.getClass();
            s83.b(strV, new wb1(1.0f, true), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262140);
            int delta = rewardEntry.getDelta();
            int delta2 = rewardEntry.getDelta();
            s83.b(delta > 0 ? p91.l(delta2, "+") : String.valueOf(delta2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ov0Var, 0, 0, 262142);
            ov0Var.p(true);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
