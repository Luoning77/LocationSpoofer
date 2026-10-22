package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hf0 extends r60 {
    public ne0 e;
    public mf0 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ kf0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(kf0 kf0Var, r60 r60Var) {
        super(r60Var);
        this.h = kf0Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.y1(null, this);
    }
}
