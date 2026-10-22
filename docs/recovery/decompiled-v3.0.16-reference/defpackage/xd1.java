package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xd1 extends k33 implements pu0 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ yd1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd1(yd1 yd1Var, int i, q60 q60Var) {
        super(2, q60Var);
        this.e = 0;
        this.g = yd1Var;
        this.f = i;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        switch (this.e) {
            case 0:
                return new xd1(this.g, this.f, q60Var);
            case 1:
                return new xd1(this.g, q60Var, 1);
            default:
                return new xd1(this.g, q60Var, 2);
        }
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        switch (i) {
            case 0:
                ((xd1) create((ao2) obj, (q60) obj2)).invokeSuspend(mf3Var);
                return mf3Var;
            case 1:
                return ((xd1) create((i52) obj, (q60) obj2)).invokeSuspend(mf3Var);
            default:
                return ((xd1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3Var);
        }
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        yd1 yd1Var = this.g;
        switch (i) {
            case 0:
                ee0.J(obj);
                yd1Var.k(this.f);
                return mf3Var;
            case 1:
                int i2 = this.f;
                if (i2 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    if (yd1.j(yd1Var, 2, this) == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ee0.J(obj);
                    this.f = 1;
                    z92 z92Var = yd1.y;
                    if (yd1Var.f(2, this) == z70Var) {
                        return z70Var;
                    }
                } else {
                    if (i3 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ee0.J(obj);
                }
                return mf3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd1(yd1 yd1Var, q60 q60Var, int i) {
        super(2, q60Var);
        this.e = i;
        this.g = yd1Var;
    }
}
