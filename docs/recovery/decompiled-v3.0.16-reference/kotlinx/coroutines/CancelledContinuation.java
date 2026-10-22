package kotlinx.coroutines;

import defpackage.q60;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CancelledContinuation extends CompletedExceptionally {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _resumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancelledContinuation.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public CancelledContinuation(q60 q60Var, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + q60Var + " was cancelled normally");
        }
        super(th, z);
    }

    private final /* synthetic */ int get_resumed$volatile() {
        return this._resumed$volatile;
    }

    private final /* synthetic */ void set_resumed$volatile(int i) {
        this._resumed$volatile = i;
    }

    public final boolean makeResumed() {
        return _resumed$volatile$FU.compareAndSet(this, 0, 1);
    }
}
