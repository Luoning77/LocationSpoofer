package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class z33 extends k33 implements qu0 {
    public final /* synthetic */ ix1 e;
    public final /* synthetic */ ey1 f;
    public final /* synthetic */ ey1 g;
    public final /* synthetic */ ey1 h;
    public final /* synthetic */ s52 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z33(ix1 ix1Var, ey1 ey1Var, ey1 ey1Var2, ey1 ey1Var3, s52 s52Var, q60 q60Var) {
        super(3, q60Var);
        this.e = ix1Var;
        this.f = ey1Var;
        this.g = ey1Var2;
        this.h = ey1Var3;
        this.i = s52Var;
    }

    @Override // defpackage.qu0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((c12) obj2).a;
        ey1 ey1Var = this.h;
        s52 s52Var = this.i;
        z33 z33Var = new z33(this.e, this.f, this.g, ey1Var, s52Var, (q60) obj3);
        mf3 mf3Var = mf3.a;
        z33Var.invokeSuspend(mf3Var);
        return mf3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        ee0.J(obj);
        mf0 mf0Var = new mf0();
        this.e.b(mf0Var);
        this.f.setValue(mf0Var);
        this.g.setValue(Boolean.TRUE);
        this.h.setValue(Boolean.FALSE);
        this.i.h(0.0f);
        return mf3.a;
    }
}
