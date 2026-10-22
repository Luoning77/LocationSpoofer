package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cg3 extends r60 {
    public xu0 e;
    public au0 f;
    public float g;
    public /* synthetic */ Object h;
    public final /* synthetic */ dg3 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg3(dg3 dg3Var, r60 r60Var) {
        super(r60Var);
        this.i = dg3Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, null, this);
    }
}
