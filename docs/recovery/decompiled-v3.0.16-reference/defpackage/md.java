package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class md extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ oh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md(oh ohVar, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ohVar;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new md(this.g, q60Var, 0);
            case 1:
                return new md(this.g, q60Var, 1);
            case 2:
                return new md(this.g, q60Var, 2);
            case 3:
                return new md(this.g, q60Var, 3);
            default:
                return new md(this.g, q60Var, 4);
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
            case 3:
                break;
        }
        return ((md) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
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
                Float f = new Float(0.0f);
                yz2 yz2Var = new yz2(1.0f, 300.0f, new Float(0.5f));
                this.f = 1;
                return oh.a(this.g, f, yz2Var, null, this, 12) == z70Var ? z70Var : mf3Var;
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
                Float f2 = new Float(0.0f);
                yz2 yz2VarD = o51.D(0.5f, 500.0f, null, 4);
                this.f = 1;
                return oh.a(this.g, f2, yz2VarD, null, this, 12) == z70Var ? z70Var : mf3Var;
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
                Float f3 = new Float(0.0f);
                yz2 yz2VarD2 = o51.D(0.5f, 500.0f, null, 4);
                this.f = 1;
                return oh.a(this.g, f3, yz2VarD2, null, this, 12) == z70Var ? z70Var : mf3Var;
            case 3:
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
                Float f4 = new Float(0.0f);
                yz2 yz2VarD3 = o51.D(0.5f, 500.0f, null, 4);
                this.f = 1;
                return oh.a(this.g, f4, yz2VarD3, null, this, 12) == z70Var ? z70Var : mf3Var;
            default:
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ee0.J(obj);
                        return mf3Var;
                    }
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ee0.J(obj);
                Float f5 = new Float(0.0f);
                yz2 yz2VarD4 = o51.D(0.8f, 450.0f, null, 4);
                this.f = 1;
                return oh.a(this.g, f5, yz2VarD4, null, this, 12) == z70Var ? z70Var : mf3Var;
        }
    }
}
