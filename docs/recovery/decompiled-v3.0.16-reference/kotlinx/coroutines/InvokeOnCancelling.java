package kotlinx.coroutines;

import defpackage.lu0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class InvokeOnCancelling extends JobNode {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _invoked$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    private final lu0 handler;

    public InvokeOnCancelling(lu0 lu0Var) {
        this.handler = lu0Var;
    }

    private final /* synthetic */ int get_invoked$volatile() {
        return this._invoked$volatile;
    }

    private final /* synthetic */ void set_invoked$volatile(int i) {
        this._invoked$volatile = i;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        if (_invoked$volatile$FU.compareAndSet(this, 0, 1)) {
            this.handler.invoke(th);
        }
    }
}
