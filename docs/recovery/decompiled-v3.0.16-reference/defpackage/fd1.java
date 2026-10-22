package defpackage;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fd1 extends k33 implements pu0 {
    public int e;
    public final /* synthetic */ gd1 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd1(gd1 gd1Var, int i, q60 q60Var) {
        super(2, q60Var);
        this.f = gd1Var;
        this.g = i;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        return new fd1(this.f, this.g, q60Var);
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((fd1) create((CoroutineScope) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        mf3 mf3Var = mf3.a;
        if (i != 0) {
            if (i == 1) {
                ee0.J(obj);
                return mf3Var;
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        bd1 bd1Var = this.f.t;
        this.e = 1;
        Object objJ = yd1.j(bd1Var.b, this.g, this);
        z70 z70Var = z70.e;
        if (objJ != z70Var) {
            objJ = mf3Var;
        }
        return objJ == z70Var ? z70Var : mf3Var;
    }
}
