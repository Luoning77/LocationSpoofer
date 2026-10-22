package defpackage;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ju extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ix1 g;
    public final /* synthetic */ fy2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju(ix1 ix1Var, fy2 fy2Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = ix1Var;
        this.h = fy2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new ju(this.g, this.h, q60Var, 0);
            case 1:
                return new ju(this.g, this.h, q60Var, 1);
            case 2:
                return new ju(this.g, this.h, q60Var, 2);
            default:
                return new ju(this.g, this.h, q60Var, 3);
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
        return ((ju) create(coroutineScope, q60Var)).invokeSuspend(mf3Var);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        fy2 fy2Var = this.h;
        ix1 ix1Var = this.g;
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
                MutableSharedFlow mutableSharedFlow = ix1Var.a;
                iu iuVar = new iu(fy2Var, 0);
                this.f = 1;
                return mutableSharedFlow.collect(iuVar, this) == z70Var ? z70Var : mf3Var;
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
                MutableSharedFlow mutableSharedFlow2 = ix1Var.a;
                iu iuVar2 = new iu(fy2Var, 1);
                this.f = 1;
                return mutableSharedFlow2.collect(iuVar2, this) == z70Var ? z70Var : mf3Var;
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
                MutableSharedFlow mutableSharedFlow3 = ix1Var.a;
                iu iuVar3 = new iu(fy2Var, 2);
                this.f = 1;
                return mutableSharedFlow3.collect(iuVar3, this) == z70Var ? z70Var : mf3Var;
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
                MutableSharedFlow mutableSharedFlow4 = ix1Var.a;
                iu iuVar4 = new iu(fy2Var, 3);
                this.f = 1;
                return mutableSharedFlow4.collect(iuVar4, this) == z70Var ? z70Var : mf3Var;
        }
    }
}
