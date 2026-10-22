package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nh extends k33 implements lu0 {
    public final /* synthetic */ oh e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(oh ohVar, Object obj, q60 q60Var) {
        super(1, q60Var);
        this.e = ohVar;
        this.f = obj;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        return new nh(this.e, this.f, q60Var);
    }

    @Override // defpackage.lu0
    public final Object invoke(Object obj) {
        nh nhVar = (nh) create((q60) obj);
        mf3 mf3Var = mf3.a;
        nhVar.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        oh ohVar = this.e;
        ohVar.c();
        Object objB = ohVar.b(this.f);
        ohVar.c.f.setValue(objB);
        ohVar.e.setValue(objB);
        return mf3.a;
    }
}
