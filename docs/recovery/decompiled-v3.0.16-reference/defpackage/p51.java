package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class p51 extends ug2 {
    public int e;
    public final /* synthetic */ lu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(lu0 lu0Var, q60 q60Var) {
        super(q60Var);
        this.f = lu0Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            this.e = 1;
            ee0.J(obj);
            lu0 lu0Var = this.f;
            da0.o(1, lu0Var);
            return lu0Var.invoke(this);
        }
        if (i != 1) {
            fo.n("This coroutine had already completed");
            return null;
        }
        this.e = 2;
        ee0.J(obj);
        return obj;
    }
}
