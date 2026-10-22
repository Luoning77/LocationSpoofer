package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ s g;
    public final /* synthetic */ vb2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, vb2 vb2Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = sVar;
        this.h = vb2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        vb2 vb2Var = this.h;
        s sVar = this.g;
        switch (i) {
            case 0:
                return new q(sVar, vb2Var, q60Var, 0);
            case 1:
                return new q(sVar, vb2Var, q60Var, 1);
            case 2:
                return new q(sVar, vb2Var, q60Var, 2);
            default:
                return new q(sVar, vb2Var, q60Var, 3);
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
            case 2:
                break;
        }
        return ((q) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        vb2 vb2Var = this.h;
        s sVar = this.g;
        z70 z70Var = z70.e;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                ix1 ix1Var = sVar.u;
                if (ix1Var == null) {
                    return mf3Var;
                }
                ub2 ub2Var = new ub2(vb2Var);
                this.f = 1;
                return ix1Var.a(ub2Var, this) == z70Var ? z70Var : mf3Var;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                ix1 ix1Var2 = sVar.u;
                if (ix1Var2 == null) {
                    return mf3Var;
                }
                ub2 ub2Var2 = new ub2(vb2Var);
                this.f = 1;
                return ix1Var2.a(ub2Var2, this) == z70Var ? z70Var : mf3Var;
            case 2:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                ix1 ix1Var3 = sVar.u;
                if (ix1Var3 == null) {
                    return mf3Var;
                }
                this.f = 1;
                return ix1Var3.a(vb2Var, this) == z70Var ? z70Var : mf3Var;
            default:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                ix1 ix1Var4 = sVar.u;
                if (ix1Var4 == null) {
                    return mf3Var;
                }
                wb2 wb2Var = new wb2(vb2Var);
                this.f = 1;
                return ix1Var4.a(wb2Var, this) == z70Var ? z70Var : mf3Var;
        }
    }
}
