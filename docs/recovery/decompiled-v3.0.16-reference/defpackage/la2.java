package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class la2 extends r60 {
    public long e;
    public au0 f;
    public we2 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ma2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(ma2 ma2Var, r60 r60Var) {
        super(r60Var);
        this.i = ma2Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(0L, null, this);
    }
}
