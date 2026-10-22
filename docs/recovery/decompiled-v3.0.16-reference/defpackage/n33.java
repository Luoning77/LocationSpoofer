package defpackage;

import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n33 extends r60 {
    public Job e;
    public /* synthetic */ Object f;
    public final /* synthetic */ p33 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n33(p33 p33Var, r60 r60Var) {
        super(r60Var);
        this.g = p33Var;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.w(0L, null, this);
    }
}
