package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ud1 extends k33 implements pu0 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yd1 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(yd1 yd1Var, int i, q60 q60Var) {
        super(2, q60Var);
        this.g = yd1Var;
        this.h = i;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        ud1 ud1Var = new ud1(this.g, this.h, q60Var);
        ud1Var.f = obj;
        return ud1Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((ud1) create((ao2) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            ao2 ao2Var = (ao2) this.f;
            yd1 yd1Var = this.g;
            sd1 sd1Var = new sd1(0, ao2Var, yd1Var);
            xb0 xb0Var = ((qd1) yd1Var.f.getValue()).i;
            this.e = 1;
            Object objR = wc0.r(sd1Var, this.h, 100, xb0Var, this);
            z70 z70Var = z70.e;
            if (objR == z70Var) {
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
