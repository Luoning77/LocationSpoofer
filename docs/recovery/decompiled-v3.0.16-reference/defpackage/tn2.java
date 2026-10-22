package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tn2 extends k33 implements pu0 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ float g;
    public final /* synthetic */ si h;
    public final /* synthetic */ te2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn2(float f, si siVar, te2 te2Var, q60 q60Var) {
        super(2, q60Var);
        this.g = f;
        this.h = siVar;
        this.i = te2Var;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        tn2 tn2Var = new tn2(this.g, this.h, this.i, q60Var);
        tn2Var.f = obj;
        return tn2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((tn2) create((ao2) obj, (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ee0.J(obj);
            j2 j2Var = new j2(21, this.i, (ao2) this.f);
            this.e = 1;
            Object objM = gh0.m(this.g, this.h, j2Var, this, 4);
            z70 z70Var = z70.e;
            if (objM == z70Var) {
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
