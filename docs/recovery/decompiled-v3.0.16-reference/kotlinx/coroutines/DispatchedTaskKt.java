package kotlinx.coroutines;

import defpackage.au0;
import defpackage.ee0;
import defpackage.q60;
import defpackage.wg2;
import defpackage.y70;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static final <T> void dispatch(DispatchedTask<? super T> dispatchedTask, int i) {
        q60 delegate$kotlinx_coroutines_core = dispatchedTask.getDelegate$kotlinx_coroutines_core();
        boolean z = i == 4;
        if (z || !(delegate$kotlinx_coroutines_core instanceof DispatchedContinuation) || isCancellableMode(i) != isCancellableMode(dispatchedTask.resumeMode)) {
            resume(dispatchedTask, delegate$kotlinx_coroutines_core, z);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) delegate$kotlinx_coroutines_core;
        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.dispatcher;
        y70 context = dispatchedContinuation.getContext();
        if (DispatchedContinuationKt.safeIsDispatchNeeded(coroutineDispatcher, context)) {
            DispatchedContinuationKt.safeDispatch(coroutineDispatcher, context, dispatchedTask);
        } else {
            resumeUnconfined(dispatchedTask);
        }
    }

    public static final boolean isCancellableMode(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean isReusableMode(int i) {
        return i == 2;
    }

    public static final <T> void resume(DispatchedTask<? super T> dispatchedTask, q60 q60Var, boolean z) {
        Object objTakeState$kotlinx_coroutines_core = dispatchedTask.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = dispatchedTask.getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        Object wg2Var = exceptionalResult$kotlinx_coroutines_core != null ? new wg2(exceptionalResult$kotlinx_coroutines_core) : dispatchedTask.getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        if (!z) {
            q60Var.resumeWith(wg2Var);
            return;
        }
        q60Var.getClass();
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) q60Var;
        q60 q60Var2 = dispatchedContinuation.continuation;
        Object obj = dispatchedContinuation.countOrElement;
        y70 context = q60Var2.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(q60Var2, context, objUpdateThreadContext) : null;
        try {
            dispatchedContinuation.continuation.resumeWith(wg2Var);
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    private static final void resumeUnconfined(DispatchedTask<?> dispatchedTask) {
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedTask);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(dispatchedTask, dispatchedTask.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } catch (Throwable th) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    public static final void resumeWithStackTrace(q60 q60Var, Throwable th) {
        q60Var.resumeWith(ee0.t(th));
    }

    public static final void runUnconfinedEventLoop(DispatchedTask<?> dispatchedTask, EventLoop eventLoop, au0 au0Var) {
        eventLoop.incrementUseCount(true);
        try {
            au0Var.invoke();
            do {
            } while (eventLoop.processUnconfinedEvent());
            eventLoop.decrementUseCount(true);
        } catch (Throwable th) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th);
            } finally {
                eventLoop.decrementUseCount(true);
            }
        }
    }

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }
}
