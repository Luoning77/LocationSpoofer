package defpackage;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f90 extends r60 {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ g90 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f90(g90 g90Var, q60 q60Var) {
        super(q60Var);
        this.g = g90Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
