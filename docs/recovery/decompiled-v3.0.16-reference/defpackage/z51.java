package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z51 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ a61 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z51(a61 a61Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = a61Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        a61 a61Var = this.g;
        switch (i) {
            case 0:
                return new z51(a61Var, q60Var, 0);
            default:
                return new z51(a61Var, q60Var, 1);
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
        return ((z51) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        a61 a61Var = this.g;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    ld3 ld3Var = a61Var.c;
                    this.f = 1;
                    return ld3Var.f(this) == z70Var ? z70Var : mf3Var;
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
                    this.f = 1;
                    return a61Var.b(this) == z70Var ? z70Var : mf3Var;
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
