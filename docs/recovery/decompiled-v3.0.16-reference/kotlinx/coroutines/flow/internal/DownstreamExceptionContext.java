package kotlinx.coroutines.flow.internal;

import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DownstreamExceptionContext implements y70 {
    private final /* synthetic */ y70 $$delegate_0;
    public final Throwable e;

    public DownstreamExceptionContext(Throwable th, y70 y70Var) {
        this.$$delegate_0 = y70Var;
        this.e = th;
    }

    @Override // defpackage.y70
    public <R> R fold(R r, pu0 pu0Var) {
        return (R) this.$$delegate_0.fold(r, pu0Var);
    }

    @Override // defpackage.y70
    public <E extends w70> E get(x70 x70Var) {
        return (E) this.$$delegate_0.get(x70Var);
    }

    @Override // defpackage.y70
    public y70 minusKey(x70 x70Var) {
        return this.$$delegate_0.minusKey(x70Var);
    }

    @Override // defpackage.y70
    public y70 plus(y70 y70Var) {
        return this.$$delegate_0.plus(y70Var);
    }
}
