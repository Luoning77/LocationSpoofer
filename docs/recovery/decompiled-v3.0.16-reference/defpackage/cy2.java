package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cy2 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ pu0 h;
    public final /* synthetic */ ey1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy2(pu0 pu0Var, ey1 ey1Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.h = pu0Var;
        this.i = ey1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                cy2 cy2Var = new cy2(this.h, this.i, q60Var, 0);
                cy2Var.g = obj;
                return cy2Var;
            default:
                cy2 cy2Var2 = new cy2(this.h, this.i, q60Var, 1);
                cy2Var2.g = obj;
                return cy2Var2;
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        q60 q60Var = (q60) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((cy2) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        ey1 ey1Var = this.i;
        pu0 pu0Var = this.h;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    kc2 kc2Var = new kc2(ey1Var, ((CoroutineScope) this.g).getCoroutineContext());
                    this.f = 1;
                    return pu0Var.invoke(kc2Var, this) == z70Var ? z70Var : mf3Var;
                }
                if (i2 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    kc2 kc2Var2 = new kc2(ey1Var, ((CoroutineScope) this.g).getCoroutineContext());
                    this.f = 1;
                    return pu0Var.invoke(kc2Var2, this) == z70Var ? z70Var : mf3Var;
                }
                if (i3 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
