package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mo2 extends k33 implements pu0 {
    public /* synthetic */ Object e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo2(long j, q60 q60Var) {
        super(2, q60Var);
        this.f = j;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        mo2 mo2Var = new mo2(this.f, q60Var);
        mo2Var.e = obj;
        return mo2Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        mo2 mo2Var = (mo2) create((uo2) obj, (q60) obj2);
        mf3 mf3Var = mf3.a;
        mo2Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        wo2 wo2Var = ((uo2) this.e).a;
        wo2Var.c(wo2Var.k, this.f, 1);
        return mf3.a;
    }
}
