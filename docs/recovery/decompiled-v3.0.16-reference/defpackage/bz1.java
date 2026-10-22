package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bz1 extends r60 {
    public /* synthetic */ Object e;
    public final /* synthetic */ dz1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz1(dz1 dz1Var, r60 r60Var) {
        super(r60Var);
        this.f = dz1Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, 0L, this);
    }
}
