package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class if0 extends r60 {
    public oe0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kf0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if0(kf0 kf0Var, r60 r60Var) {
        super(r60Var);
        this.g = kf0Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.z1(null, this);
    }
}
