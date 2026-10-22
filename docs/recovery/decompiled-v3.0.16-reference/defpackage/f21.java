package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f21 extends k33 implements pu0 {
    public /* synthetic */ float e;

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        f21 f21Var = new f21(2, q60Var);
        f21Var.e = ((Number) obj).floatValue();
        return f21Var;
    }

    @Override // defpackage.pu0
    public final Object invoke(Object obj, Object obj2) {
        return ((f21) create(Float.valueOf(((Number) obj).floatValue()), (q60) obj2)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        return Boolean.valueOf(this.e > 0.0f);
    }
}
