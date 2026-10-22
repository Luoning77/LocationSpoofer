package defpackage;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zr1 extends r60 {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ ql1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(ql1 ql1Var, q60 q60Var) {
        super(q60Var);
        this.g = ql1Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
