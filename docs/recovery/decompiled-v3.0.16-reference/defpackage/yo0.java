package defpackage;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yo0 extends r60 {
    public /* synthetic */ Object e;
    public int f;
    public FlowCollector g;
    public final /* synthetic */ zo0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo0(zo0 zo0Var, q60 q60Var) {
        super(q60Var);
        this.h = zo0Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.h.emit(null, this);
    }
}
