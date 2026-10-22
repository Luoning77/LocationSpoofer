package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.AccountBenefitsRepository;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k3 extends k33 implements pu0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ AccountBenefitsRepository i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ CoroutineScope k;
    public final /* synthetic */ ey1 l;
    public final /* synthetic */ ey1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(String str, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, AccountBenefitsRepository accountBenefitsRepository, ey1 ey1Var4, CoroutineScope coroutineScope, ey1 ey1Var5, ey1 ey1Var6, q60 q60Var) {
        super(2, q60Var);
        this.e = str;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
        this.i = accountBenefitsRepository;
        this.j = ey1Var4;
        this.k = coroutineScope;
        this.l = ey1Var5;
        this.m = ey1Var6;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new k3(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        k3 k3Var = (k3) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        k3Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        this.f.setValue(null);
        this.g.setValue(vj0.e);
        this.h.setValue(zj0.e);
        String str = this.e;
        if (str != null) {
            AccountBenefitsRepository accountBenefitsRepository = this.i;
            xq1.f(str, this.k, this.l, this.m, accountBenefitsRepository, new y3(accountBenefitsRepository, 1, this.j, this.f, this.h, null));
        }
        return mf3.a;
    }
}
