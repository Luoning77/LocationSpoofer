package defpackage;

import com.vincenthzr.locationspoofer.data.cloud.CloudAccount;
import com.vincenthzr.locationspoofer.data.cloud.CloudAccountState;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u5 extends k33 implements pu0 {
    public final /* synthetic */ ey1 e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ ey1 i;
    public final /* synthetic */ ey1 j;
    public final /* synthetic */ ey1 k;
    public final /* synthetic */ ey1 l;
    public final /* synthetic */ ey1 m;
    public final /* synthetic */ ey1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, ey1 ey1Var4, ey1 ey1Var5, ey1 ey1Var6, ey1 ey1Var7, ey1 ey1Var8, ey1 ey1Var9, ey1 ey1Var10, q60 q60Var) {
        super(2, q60Var);
        this.e = ey1Var;
        this.f = ey1Var2;
        this.g = ey1Var3;
        this.h = ey1Var4;
        this.i = ey1Var5;
        this.j = ey1Var6;
        this.k = ey1Var7;
        this.l = ey1Var8;
        this.m = ey1Var9;
        this.n = ey1Var10;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new u5(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        u5 u5Var = (u5) create((CoroutineScope) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        u5Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        CloudAccount account;
        ee0.J(obj);
        this.e.setValue("");
        this.f.setValue("");
        this.g.setValue("");
        this.h.setValue("");
        this.i.setValue("");
        ey1 ey1Var = this.j;
        if (!((CloudAccountState) ey1Var.getValue()).getValidated() || (account = ((CloudAccountState) ey1Var.getValue()).getAccount()) == null || account.isGuest()) {
            Boolean bool = Boolean.FALSE;
            this.k.setValue(bool);
            this.l.setValue(bool);
            this.m.setValue(null);
            this.n.setValue(bool);
        }
        return mf3.a;
    }
}
