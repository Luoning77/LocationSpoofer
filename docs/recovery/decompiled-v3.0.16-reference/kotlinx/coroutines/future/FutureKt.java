package kotlinx.coroutines.future;

import defpackage.cv0;
import defpackage.hd0;
import defpackage.j;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s5;
import defpackage.sj0;
import defpackage.t;
import defpackage.y70;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FutureKt {
    public static final <T> CompletableFuture<T> asCompletableFuture(Deferred<? extends T> deferred) {
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        setupCancellation(deferred, completableFuture);
        deferred.invokeOnCompletion(new j(22, completableFuture, deferred));
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 asCompletableFuture$lambda$1(CompletableFuture completableFuture, Deferred deferred, Throwable th) {
        try {
            completableFuture.complete(deferred.getCompleted());
        } catch (Throwable th2) {
            completableFuture.completeExceptionally(th2);
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 asCompletableFuture$lambda$2(CompletableFuture completableFuture, Throwable th) {
        mf3 mf3Var = mf3.a;
        if (th == null) {
            completableFuture.complete(mf3Var);
        } else {
            completableFuture.completeExceptionally(th);
        }
        return mf3Var;
    }

    public static final <T> Deferred<T> asDeferred(CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completionStage.handle(new cv0(0, new s5(completableDeferredCompletableDeferred$default, 7)));
            JobKt__JobKt.invokeOnCompletion$default(completableDeferredCompletableDeferred$default, false, new CancelFutureOnCompletion(completableFuture), 1, null);
            return completableDeferredCompletableDeferred$default;
        }
        try {
            return CompletableDeferredKt.CompletableDeferred(completableFuture.get());
        } catch (Throwable th) {
            th = th;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completableDeferredCompletableDeferred$default2.completeExceptionally(th);
            return completableDeferredCompletableDeferred$default2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asDeferred$lambda$5(CompletableDeferred completableDeferred, Object obj, Throwable th) {
        boolean zCompleteExceptionally;
        Throwable cause;
        try {
            if (th == null) {
                zCompleteExceptionally = completableDeferred.complete(obj);
            } else {
                CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th = cause;
                }
                zCompleteExceptionally = completableDeferred.completeExceptionally(th);
            }
            return Boolean.valueOf(zCompleteExceptionally);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(sj0.e, th2);
            return mf3.a;
        }
    }

    public static final <T> Object await(CompletionStage<T> completionStage, q60 q60Var) throws Throwable {
        final CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        final ContinuationHandler continuationHandler = new ContinuationHandler(cancellableContinuationImpl);
        completionStage.handle(continuationHandler);
        cancellableContinuationImpl.invokeOnCancellation(new lu0() { // from class: kotlinx.coroutines.future.FutureKt$await$2$1
            public final void invoke(Throwable th) {
                completableFuture.cancel(false);
                continuationHandler.cont = null;
            }

            @Override // defpackage.lu0
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return mf3.a;
            }
        });
        return cancellableContinuationImpl.getResult();
    }

    public static final <T> CompletableFuture<T> future(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var) {
        if (coroutineStart.isLazy()) {
            throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        y70 y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, y70Var);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        CompletableFutureCoroutine completableFutureCoroutine = new CompletableFutureCoroutine(y70VarNewCoroutineContext, completableFuture);
        completableFuture.handle((BiFunction) completableFutureCoroutine);
        completableFutureCoroutine.start(coroutineStart, completableFutureCoroutine, pu0Var);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture future$default(CoroutineScope coroutineScope, y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, y70Var, coroutineStart, pu0Var);
    }

    private static final void setupCancellation(final Job job, CompletableFuture<?> completableFuture) {
        completableFuture.handle((BiFunction<? super Object, Throwable, ? extends U>) new cv0(1, new pu0() { // from class: kotlinx.coroutines.future.FutureKt.setupCancellation.1
            public final void invoke(Object obj, Throwable th) {
                Job job2 = job;
                CancellationException CancellationException = null;
                if (th != null) {
                    CancellationException = th instanceof CancellationException ? (CancellationException) th : null;
                    if (CancellationException == null) {
                        CancellationException = ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th);
                    }
                }
                job2.cancel(CancellationException);
            }

            @Override // defpackage.pu0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(obj, (Throwable) obj2);
                return mf3.a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 setupCancellation$lambda$3(pu0 pu0Var, Object obj, Throwable th) {
        return (mf3) pu0Var.invoke(obj, th);
    }

    public static final CompletableFuture<mf3> asCompletableFuture(Job job) {
        CompletableFuture<mf3> completableFuture = new CompletableFuture<>();
        setupCancellation(job, completableFuture);
        job.invokeOnCompletion(new t(completableFuture, 20));
        return completableFuture;
    }
}
