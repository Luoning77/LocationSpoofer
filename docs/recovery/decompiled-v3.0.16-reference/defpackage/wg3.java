package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wg3 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ xg3 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg3(xg3 xg3Var, long j, int i, q60 q60Var) {
        super(2, q60Var);
        this.f = xg3Var;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new wg3(this.f, this.g, this.h, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((wg3) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            xg3 xg3Var = this.f;
            z92 z92Var = xg3Var.i;
            il1 il1Var = new il1(this.h, 3, xg3Var);
            this.e = 1;
            Object objI = z92Var.i(this.g, il1Var, this);
            z70 z70Var = z70.e;
            if (objI == z70Var) {
                return z70Var;
            }
        } else {
            if (i != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(obj);
        }
        return mf3.a;
    }
}
