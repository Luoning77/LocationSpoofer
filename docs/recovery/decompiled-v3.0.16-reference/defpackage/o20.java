package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o20 extends r60 {
    public Object e;
    public l41 f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ q20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o20(q20 q20Var, r60 r60Var) {
        super(r60Var);
        this.j = q20Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}
