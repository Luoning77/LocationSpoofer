package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class d53 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ qu0 g;
    public final /* synthetic */ tb2 h;
    public final /* synthetic */ x92 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d53(qu0 qu0Var, tb2 tb2Var, x92 x92Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = qu0Var;
        this.h = tb2Var;
        this.i = x92Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new d53(this.g, this.h, this.i, q60Var, 0);
            default:
                return new d53(this.g, this.h, this.i, q60Var, 1);
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
        return ((d53) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        x92 x92Var = this.i;
        tb2 tb2Var = this.h;
        qu0 qu0Var = this.g;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    c12 c12Var = new c12(x92Var.c);
                    this.f = 1;
                    return qu0Var.invoke(tb2Var, c12Var, this) == z70Var ? z70Var : mf3Var;
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
                    c12 c12Var2 = new c12(x92Var.c);
                    this.f = 1;
                    return qu0Var.invoke(tb2Var, c12Var2, this) == z70Var ? z70Var : mf3Var;
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
