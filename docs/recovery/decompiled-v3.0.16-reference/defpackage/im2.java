package defpackage;

import android.content.Context;
import com.vincenthzr.locationspoofer.data.model.SavedRoute;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class im2 implements ru0 {
    public final /* synthetic */ List e;
    public final /* synthetic */ ul1 f;
    public final /* synthetic */ xb0 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ lr2 j;
    public final /* synthetic */ au0 k;
    public final /* synthetic */ Context l;

    public im2(List list, ul1 ul1Var, xb0 xb0Var, float f, float f2, lr2 lr2Var, au0 au0Var, Context context) {
        this.e = list;
        this.f = ul1Var;
        this.g = xb0Var;
        this.h = f;
        this.i = f2;
        this.j = lr2Var;
        this.k = au0Var;
        this.l = context;
    }

    @Override // defpackage.ru0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ul1 ul1Var;
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
            SavedRoute savedRoute = (SavedRoute) this.e.get(iIntValue);
            ov0Var.c0(-798396586);
            bj2 bj2VarA = cj2.a(16.0f);
            long jC = hz.c(0.4f, ((kz) ov0Var.j(mz.a)).r);
            dv1 dv1VarE = iw2.e(av1.a, 1.0f);
            ul1 ul1Var2 = this.f;
            boolean zH = ov0Var.h(ul1Var2) | ov0Var.h(savedRoute) | ov0Var.f(this.g) | ov0Var.c(this.h) | ov0Var.c(this.i) | ov0Var.h(this.j) | ov0Var.f(this.k) | ov0Var.h(this.l);
            Object objQ = ov0Var.Q();
            if (zH || objQ == d30.a) {
                ul1Var = ul1Var2;
                hm2 hm2Var = new hm2(this.f, savedRoute, this.g, this.h, this.i, this.j, this.k, this.l);
                ov0Var.m0(hm2Var);
                objQ = hm2Var;
            } else {
                ul1Var = ul1Var2;
            }
            e33.b((au0) objQ, dv1VarE, false, bj2VarA, jC, 0L, 0.0f, null, null, sb.a0(-751028629, new pu(3, ul1Var, savedRoute), ov0Var), ov0Var, 48, 996);
            ov0Var.p(false);
        } else {
            ov0Var.W();
        }
        return mf3.a;
    }
}
