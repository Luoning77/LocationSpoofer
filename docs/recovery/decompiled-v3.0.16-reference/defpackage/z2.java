package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class z2 implements qu0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, int i) {
        this.e = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        c30 c30Var = d30.a;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (i) {
            case 0:
                String str = (String) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                AccountBenefitsRepository accountBenefitsRepository = (AccountBenefitsRepository) obj4;
                f30 f30Var = (f30) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bc1) obj).getClass();
                ov0 ov0Var = (ov0) f30Var;
                if (!ov0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ov0Var.W();
                } else {
                    boolean zF = ov0Var.f(str) | ov0Var.h(coroutineScope) | ov0Var.h(accountBenefitsRepository);
                    Object objQ = ov0Var.Q();
                    ey1 ey1Var = this.g;
                    if (zF || objQ == c30Var) {
                        d3 d3Var = new d3(accountBenefitsRepository, this.f, str, coroutineScope, ey1Var, this.h);
                        ov0Var.m0(d3Var);
                        objQ = d3Var;
                    }
                    n51.a((au0) objQ, null, !xq1.p(ey1Var), null, xq1.z(ov0Var), null, null, null, ks.s, ov0Var, 805306368, 490);
                }
                break;
            default:
                lr2 lr2Var = (lr2) obj6;
                op0 op0Var = (op0) obj5;
                ny2 ny2Var = (ny2) obj4;
                f30 f30Var2 = (f30) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((zz) obj).getClass();
                ov0 ov0Var2 = (ov0) f30Var2;
                if (!ov0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ov0Var2.W();
                } else {
                    dv1 dv1VarH = iw2.h(av1.a, 0.0f, 280.0f, 1);
                    boolean zH = ov0Var2.h(lr2Var) | ov0Var2.h(op0Var) | ov0Var2.f(ny2Var);
                    Object objQ2 = ov0Var2.Q();
                    if (zH || objQ2 == c30Var) {
                        x2 x2Var = new x2(this.f, lr2Var, op0Var, ny2Var, this.g, this.h);
                        ov0Var2.m0(x2Var);
                        objQ2 = x2Var;
                    }
                    ke0.d(dv1VarH, null, null, null, null, null, false, null, (lu0) objQ2, ov0Var2, 6, 510);
                }
                break;
        }
        return mf3Var;
    }
}
