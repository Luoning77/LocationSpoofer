package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cx2 extends k33 implements qu0 {
    public /* synthetic */ long e;
    public final /* synthetic */ ex2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx2(ex2 ex2Var, q60 q60Var) {
        super(3, q60Var);
        this.f = ex2Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((c12) obj2).a;
        cx2 cx2Var = new cx2(this.f, (q60) obj3);
        cx2Var.e = j;
        mf3 mf3Var = mf3.a;
        cx2Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        float fG;
        ee0.J(obj);
        long j = this.e;
        ex2 ex2Var = this.f;
        if (ex2Var.m == x32.e) {
            fG = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            fG = ex2Var.j ? ex2Var.h.g() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
        }
        ex2Var.q.h(fG - ex2Var.p.g());
        return mf3.a;
    }
}
