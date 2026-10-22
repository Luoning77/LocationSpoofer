package kotlinx.coroutines.internal;

import defpackage.ca0;
import defpackage.cc0;
import defpackage.iv;
import defpackage.mf3;
import defpackage.p91;
import defpackage.q60;
import defpackage.y70;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {
    private final Throwable cause;
    private final String errorHint;

    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th, String str, int i, ca0 ca0Var) {
        this(th, (i & 2) != 0 ? null : str);
    }

    private final Void missing() {
        if (this.cause != null) {
            String str = this.errorHint;
            throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(str != null ? ". ".concat(str) : ""), this.cause);
        }
        MainDispatchersKt.throwMissingMainDispatcherException();
        throw new iv();
    }

    @Override // kotlinx.coroutines.Delay
    @cc0
    public Object delay(long j, q60 q60Var) {
        return Delay.DefaultImpls.delay(this, j, q60Var);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch, reason: merged with bridge method [inline-methods] */
    public Void mo90dispatch(y70 y70Var, Runnable runnable) {
        missing();
        throw new iv();
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, y70 y70Var) {
        missing();
        throw new iv();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(y70 y70Var) {
        missing();
        throw new iv();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i, String str) {
        missing();
        throw new iv();
    }

    public Void scheduleResumeAfterDelay(long j, CancellableContinuation<? super mf3> cancellableContinuation) {
        missing();
        throw new iv();
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        if (this.cause != null) {
            str = ", cause=" + this.cause;
        } else {
            str = "";
        }
        return p91.q(sb, str, ']');
    }

    public MissingMainCoroutineDispatcher(Throwable th, String str) {
        this.cause = th;
        this.errorHint = str;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo91scheduleResumeAfterDelay(long j, CancellableContinuation cancellableContinuation) {
        scheduleResumeAfterDelay(j, (CancellableContinuation<? super mf3>) cancellableContinuation);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public MainCoroutineDispatcher getImmediate() {
        return this;
    }
}
