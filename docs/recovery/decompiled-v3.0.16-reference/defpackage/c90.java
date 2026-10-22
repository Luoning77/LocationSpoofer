package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c90 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ j90 g;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c90(j90 j90Var, float f, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = j90Var;
        this.h = f;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        int i = this.e;
        float f = this.h;
        j90 j90Var = this.g;
        switch (i) {
            case 0:
                return new c90(j90Var, f, q60Var, 0);
            case 1:
                return new c90(j90Var, f, q60Var, 1);
            default:
                return new c90(j90Var, f, q60Var, 2);
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
        return ((c90) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        float f = this.h;
        z70 z70Var = z70.e;
        j90 j90Var = this.g;
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
                oh ohVar = j90Var.l;
                Float f2 = new Float(f);
                yz2 yz2Var = j90Var.g;
                this.f = 1;
                return oh.a(ohVar, f2, yz2Var, null, this, 12) == z70Var ? z70Var : mf3Var;
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
                oh ohVar2 = j90Var.l;
                Float f3 = new Float(f);
                yz2 yz2Var2 = j90Var.g;
                wc wcVar = new wc(j90Var, 5);
                this.f = 1;
                return oh.a(ohVar2, f3, yz2Var2, wcVar, this, 4) == z70Var ? z70Var : mf3Var;
            default:
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
                oh ohVar3 = j90Var.m;
                Float f4 = new Float(f);
                yz2 yz2Var3 = j90Var.h;
                this.f = 1;
                return oh.a(ohVar3, f4, yz2Var3, null, this, 12) == z70Var ? z70Var : mf3Var;
        }
    }
}
