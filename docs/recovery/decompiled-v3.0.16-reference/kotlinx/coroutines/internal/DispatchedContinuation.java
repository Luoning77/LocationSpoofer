package kotlinx.coroutines.internal;

import defpackage.a80;
import defpackage.ee0;
import defpackage.fo;
import defpackage.lu0;
import defpackage.o51;
import defpackage.q60;
import defpackage.y70;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements a80, q60 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object _state;
    public final q60 continuation;
    public final Object countOrElement;
    public final CoroutineDispatcher dispatcher;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, q60 q60Var) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = q60Var;
        this._state = DispatchedContinuationKt.UNDEFINED;
        this.countOrElement = ThreadContextKt.threadContextElements(getContext());
    }

    private final CancellableContinuationImpl<?> getReusableCancellableContinuation() {
        Object obj = _reusableCancellableContinuation$volatile$FU.get(this);
        if (obj instanceof CancellableContinuationImpl) {
            return (CancellableContinuationImpl) obj;
        }
        return null;
    }

    private final /* synthetic */ Object get_reusableCancellableContinuation$volatile() {
        return this._reusableCancellableContinuation$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            lu0Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (_reusableCancellableContinuation$volatile$FU.get(this) == DispatchedContinuationKt.REUSABLE_CLAIMED) {
        }
    }

    public final CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                _reusableCancellableContinuation$volatile$FU.set(this, DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof CancellableContinuationImpl) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return (CancellableContinuationImpl) obj;
            }
            if (obj != DispatchedContinuationKt.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                fo.o(obj, "Inconsistent state ");
                return null;
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(y70 y70Var, T t) {
        this._state = t;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(y70Var, this);
    }

    @Override // defpackage.a80
    public a80 getCallerFrame() {
        q60 q60Var = this.continuation;
        if (q60Var instanceof a80) {
            return (a80) q60Var;
        }
        return null;
    }

    @Override // defpackage.q60
    public y70 getContext() {
        return this.continuation.getContext();
    }

    @Override // defpackage.a80
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return _reusableCancellableContinuation$volatile$FU.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (o51.f(obj, symbol)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, th)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                }
            }
            return false;
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        CancellableContinuationImpl<?> reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.detachChild$kotlinx_coroutines_core();
        }
    }

    public final void resumeCancellableWith$kotlinx_coroutines_core(Object obj) {
        Object state = CompletionStateKt.toState(obj);
        if (DispatchedContinuationKt.safeIsDispatchNeeded(this.dispatcher, getContext())) {
            this._state = state;
            this.resumeMode = 1;
            DispatchedContinuationKt.safeDispatch(this.dispatcher, getContext(), this);
            return;
        }
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            Job job = (Job) getContext().get(Job.Key);
            if (job == null || job.isActive()) {
                q60 q60Var = this.continuation;
                Object obj2 = this.countOrElement;
                y70 context = q60Var.getContext();
                Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
                UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(q60Var, context, objUpdateThreadContext) : null;
                try {
                    this.continuation.resumeWith(obj);
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    }
                } catch (Throwable th) {
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
                resumeWith(ee0.t(cancellationException));
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
        } catch (Throwable th2) {
            try {
                handleFatalException$kotlinx_coroutines_core(th2);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(Object obj) {
        Job job = (Job) getContext().get(Job.Key);
        if (job == null || job.isActive()) {
            return false;
        }
        CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
        resumeWith(ee0.t(cancellationException));
        return true;
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(Object obj) {
        q60 q60Var = this.continuation;
        Object obj2 = this.countOrElement;
        y70 context = q60Var.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(q60Var, context, objUpdateThreadContext) : null;
        try {
            this.continuation.resumeWith(obj);
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    @Override // defpackage.q60
    public void resumeWith(Object obj) {
        Object state = CompletionStateKt.toState(obj);
        if (DispatchedContinuationKt.safeIsDispatchNeeded(this.dispatcher, getContext())) {
            this._state = state;
            this.resumeMode = 0;
            DispatchedContinuationKt.safeDispatch(this.dispatcher, getContext(), this);
            return;
        }
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            y70 context = getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, this.countOrElement);
            try {
                this.continuation.resumeWith(obj);
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
            } catch (Throwable th) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                handleFatalException$kotlinx_coroutines_core(th2);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        this._state = DispatchedContinuationKt.UNDEFINED;
        return obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + DebugStringsKt.toDebugString(this.continuation) + ']';
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(CancellableContinuation<?> cancellableContinuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (obj == symbol) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, cancellableContinuation)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                fo.o(obj, "Inconsistent state ");
                return null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    fo.i("Failed requirement.");
                    return null;
                }
            }
            return (Throwable) obj;
        }
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public q60 getDelegate$kotlinx_coroutines_core() {
        return this;
    }
}
