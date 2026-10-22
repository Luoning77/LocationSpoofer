package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qa2 extends r60 {
    public wb3 e;
    public z40 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ua2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa2(ua2 ua2Var, r60 r60Var) {
        super(r60Var);
        this.h = ua2Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, this);
    }
}
