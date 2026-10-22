package kotlinx.coroutines;

import defpackage.ee0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ResumeAwaitOnCompletion<T> extends JobNode {
    private final CancellableContinuationImpl<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeAwaitOnCompletion(CancellableContinuationImpl<? super T> cancellableContinuationImpl) {
        this.continuation = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        boolean z = state$kotlinx_coroutines_core instanceof CompletedExceptionally;
        CancellableContinuationImpl<T> cancellableContinuationImpl = this.continuation;
        if (z) {
            cancellableContinuationImpl.resumeWith(ee0.t(((CompletedExceptionally) state$kotlinx_coroutines_core).cause));
        } else {
            cancellableContinuationImpl.resumeWith(JobSupportKt.unboxState(state$kotlinx_coroutines_core));
        }
    }
}
