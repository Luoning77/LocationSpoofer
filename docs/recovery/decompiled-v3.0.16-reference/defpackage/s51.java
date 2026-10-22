package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s51 extends r60 {
    public int e;
    public final /* synthetic */ pu0 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(q60 q60Var, y70 y70Var, pu0 pu0Var, Object obj) {
        super(q60Var, y70Var);
        this.f = pu0Var;
        this.g = obj;
        q60Var.getClass();
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                fo.n("This coroutine had already completed");
                return null;
            }
            this.e = 2;
            ee0.J(obj);
            return obj;
        }
        this.e = 1;
        ee0.J(obj);
        pu0 pu0Var = this.f;
        pu0Var.getClass();
        da0.o(2, pu0Var);
        return pu0Var.invoke(this.g, this);
    }
}
