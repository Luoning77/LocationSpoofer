package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.q60;
import defpackage.y70;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class JobKt {
    public static final CompletableJob Job(Job job) {
        return JobKt__JobKt.Job(job);
    }

    public static final Object cancelAndJoin(Job job, q60 q60Var) {
        return JobKt__JobKt.cancelAndJoin(job, q60Var);
    }

    @cc0
    public static final void cancelFutureOnCancellation(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        JobKt__FutureKt.cancelFutureOnCancellation(cancellableContinuation, future);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return JobKt__JobKt.disposeOnCompletion(job, disposableHandle);
    }

    public static final void ensureActive(y70 y70Var) {
        JobKt__JobKt.ensureActive(y70Var);
    }

    public static final Job getJob(y70 y70Var) {
        return JobKt__JobKt.getJob(y70Var);
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z, JobNode jobNode) {
        return JobKt__JobKt.invokeOnCompletion(job, z, jobNode);
    }

    public static final boolean isActive(y70 y70Var) {
        return JobKt__JobKt.isActive(y70Var);
    }

    public static final void ensureActive(Job job) {
        JobKt__JobKt.ensureActive(job);
    }

    public static final void cancel(y70 y70Var, CancellationException cancellationException) {
        JobKt__JobKt.cancel(y70Var, cancellationException);
    }

    public static final void cancelChildren(y70 y70Var, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(y70Var, cancellationException);
    }

    public static final void cancel(Job job, String str, Throwable th) {
        JobKt__JobKt.cancel(job, str, th);
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(job, cancellationException);
    }
}
