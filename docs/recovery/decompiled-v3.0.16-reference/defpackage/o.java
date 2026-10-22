package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ix1 g;
    public final /* synthetic */ vb2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vb2 vb2Var, ix1 ix1Var, q60 q60Var) {
        super(2, q60Var);
        this.e = 0;
        this.h = vb2Var;
        this.g = ix1Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        vb2 vb2Var = this.h;
        ix1 ix1Var = this.g;
        switch (i) {
            case 0:
                return new o(vb2Var, ix1Var, q60Var);
            case 1:
                return new o(ix1Var, vb2Var, q60Var, 1);
            default:
                return new o(ix1Var, vb2Var, q60Var, 2);
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
            case 1:
                break;
        }
        return ((o) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        vb2 vb2Var = this.h;
        ix1 ix1Var = this.g;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    wb2 wb2Var = new wb2(vb2Var);
                    this.f = 1;
                    return ix1Var.a(wb2Var, this) == z70Var ? z70Var : mf3Var;
                }
                if (i2 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    return ix1Var.a(vb2Var, this) == z70Var ? z70Var : mf3Var;
                }
                if (i3 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    return ix1Var.a(vb2Var, this) == z70Var ? z70Var : mf3Var;
                }
                if (i4 == 1) {
                    ee0.J(obj);
                    return mf3Var;
                }
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(ix1 ix1Var, vb2 vb2Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ix1Var;
        this.h = vb2Var;
    }
}
