package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o33 extends r60 {
    public /* synthetic */ Object e;
    public final /* synthetic */ p33 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o33(p33 p33Var, r60 r60Var) {
        super(r60Var);
        this.f = p33Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.x(0L, null, this);
    }
}
