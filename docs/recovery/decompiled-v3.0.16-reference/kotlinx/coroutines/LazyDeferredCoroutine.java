package kotlinx.coroutines;

import defpackage.hd0;
import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class LazyDeferredCoroutine<T> extends DeferredCoroutine<T> {
    private final q60 continuation;

    public LazyDeferredCoroutine(y70 y70Var, pu0 pu0Var) {
        super(y70Var, false);
        this.continuation = hd0.r(pu0Var, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }
}
