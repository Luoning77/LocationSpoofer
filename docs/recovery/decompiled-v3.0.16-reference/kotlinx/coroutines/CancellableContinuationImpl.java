package kotlinx.coroutines;

import defpackage.a80;
import defpackage.au0;
import defpackage.b81;
import defpackage.fo;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.qu0;
import defpackage.sv;
import defpackage.y70;
import defpackage.z70;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, a80, Waiter {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private final y70 context;
    private final q60 delegate;
    private static final /* synthetic */ AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");

    public CancellableContinuationImpl(q60 q60Var, int i) {
        super(i);
        this.delegate = q60Var;
        this.context = q60Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.INSTANCE;
    }

    private final Void alreadyResumedError(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void callCancelHandlerSafely(au0 au0Var) {
        try {
            au0Var.invoke();
        } catch (Throwable th) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final void callSegmentOnCancellation(Segment<?> segment, Throwable th) {
        int i = _decisionAndIndex$volatile$FU.get(this) & 536870911;
        if (i == 536870911) {
            fo.n("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            segment.onCancellation(i, th, getContext());
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean cancelLater(Throwable th) {
        if (!isReusable()) {
            return false;
        }
        q60 q60Var = this.delegate;
        q60Var.getClass();
        return ((DispatchedContinuation) q60Var).postponeCancellation$kotlinx_coroutines_core(th);
    }

    private final void detachChildIfNonReusable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    private final void dispatchResume(int i) {
        if (tryResume()) {
            return;
        }
        DispatchedTaskKt.dispatch(this, i);
    }

    private final DisposableHandle getParentHandle() {
        return (DisposableHandle) _parentHandle$volatile$FU.get(this);
    }

    private final String getStateDebugRepresentation() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof NotCompleted) {
            return "Active";
        }
        return state$kotlinx_coroutines_core instanceof CancelledContinuation ? "Cancelled" : "Completed";
    }

    private final /* synthetic */ int get_decisionAndIndex$volatile() {
        return this._decisionAndIndex$volatile;
    }

    private final /* synthetic */ Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final DisposableHandle installParentHandle() {
        Job job = (Job) getContext().get(Job.Key);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleInvokeOnCompletion$default = JobKt__JobKt.invokeOnCompletion$default(job, false, new ChildContinuation(this), 1, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _parentHandle$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, disposableHandleInvokeOnCompletion$default)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return disposableHandleInvokeOnCompletion$default;
            }
        }
        return disposableHandleInvokeOnCompletion$default;
    }

    private final void invokeOnCancellationImpl(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Active) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    }
                }
                return;
            }
            if (!(obj2 instanceof CancelHandler) && !(obj2 instanceof Segment)) {
                if (obj2 instanceof CompletedExceptionally) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                    if (!completedExceptionally.makeHandled()) {
                        multipleHandlersError(obj, obj2);
                    }
                    if (obj2 instanceof CancelledContinuation) {
                        Throwable th = completedExceptionally.cause;
                        if (obj instanceof CancelHandler) {
                            callCancelHandler((CancelHandler) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            callSegmentOnCancellation((Segment) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (!(obj2 instanceof CompletedContinuation)) {
                    if (obj instanceof Segment) {
                        return;
                    }
                    obj.getClass();
                    CompletedContinuation completedContinuation = new CompletedContinuation(obj2, (CancelHandler) obj, null, null, null, 28, null);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, completedContinuation)) {
                        if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                        }
                    }
                    return;
                }
                CompletedContinuation completedContinuation2 = (CompletedContinuation) obj2;
                if (completedContinuation2.cancelHandler != null) {
                    multipleHandlersError(obj, obj2);
                }
                if (obj instanceof Segment) {
                    return;
                }
                obj.getClass();
                CancelHandler cancelHandler = (CancelHandler) obj;
                if (completedContinuation2.getCancelled()) {
                    callCancelHandler(cancelHandler, completedContinuation2.cancelCause);
                    return;
                }
                CompletedContinuation completedContinuationCopy$default = CompletedContinuation.copy$default(completedContinuation2, null, cancelHandler, null, null, null, 29, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = _state$volatile$FU;
                while (!atomicReferenceFieldUpdater4.compareAndSet(this, obj2, completedContinuationCopy$default)) {
                    if (atomicReferenceFieldUpdater4.get(this) != obj2) {
                    }
                }
                return;
            }
            multipleHandlersError(obj, obj2);
        }
    }

    private final boolean isReusable() {
        if (!DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            return false;
        }
        q60 q60Var = this.delegate;
        q60Var.getClass();
        return ((DispatchedContinuation) q60Var).isReusable$kotlinx_coroutines_core();
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            lu0Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            lu0Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void multipleHandlersError(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 resume$lambda$13$lambda$12(lu0 lu0Var, Throwable th, Object obj, y70 y70Var) {
        lu0Var.invoke(th);
        return mf3.a;
    }

    public static /* synthetic */ void resumeImpl$kotlinx_coroutines_core$default(CancellableContinuationImpl cancellableContinuationImpl, Object obj, int i, qu0 qu0Var, int i2, Object obj2) {
        if (obj2 != null) {
            b81.s("Super calls with default arguments not supported in this target, function: resumeImpl");
            return;
        }
        if ((i2 & 4) != 0) {
            qu0Var = null;
        }
        cancellableContinuationImpl.resumeImpl$kotlinx_coroutines_core(obj, i, qu0Var);
    }

    private final <R> Object resumedState(NotCompleted notCompleted, R r, int i, qu0 qu0Var, Object obj) {
        if (r instanceof CompletedExceptionally) {
            return r;
        }
        if ((DispatchedTaskKt.isCancellableMode(i) || obj != null) && !(qu0Var == null && !(notCompleted instanceof CancelHandler) && obj == null)) {
            return new CompletedContinuation(r, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, qu0Var, obj, null, 16, null);
        }
        return r;
    }

    private final /* synthetic */ void set_decisionAndIndex$volatile(int i) {
        this._decisionAndIndex$volatile = i;
    }

    private final /* synthetic */ void set_parentHandle$volatile(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean tryResume() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                fo.n("Already resumed");
                return false;
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    private final <R> Symbol tryResumeImpl(R r, Object obj, qu0 qu0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof NotCompleted)) {
                Object obj3 = obj;
                if ((obj2 instanceof CompletedContinuation) && obj3 != null && ((CompletedContinuation) obj2).idempotentResume == obj3) {
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
                return null;
            }
            CancellableContinuationImpl<T> cancellableContinuationImpl = this;
            R r2 = r;
            Object obj4 = obj;
            qu0 qu0Var2 = qu0Var;
            Object objResumedState = cancellableContinuationImpl.resumedState((NotCompleted) obj2, r2, this.resumeMode, qu0Var2, obj4);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(cancellableContinuationImpl, obj2, objResumedState)) {
                    cancellableContinuationImpl.detachChildIfNonReusable();
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
            } while (atomicReferenceFieldUpdater2.get(cancellableContinuationImpl) == obj2);
            this = cancellableContinuationImpl;
            r = r2;
            qu0Var = qu0Var2;
            obj = obj4;
        }
    }

    private final boolean trySuspend() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                fo.n("Already suspended");
                return false;
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, lu0 lu0Var) {
        int i;
        do {
            i = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, ((Number) lu0Var.invoke(Integer.valueOf(i))).intValue()));
    }

    public final void callCancelHandler(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.invoke(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final <R> void callOnCancellation(qu0 qu0Var, Throwable th, R r) {
        try {
            qu0Var.invoke(th, r, getContext());
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            CancelledContinuation cancelledContinuation = new CancelledContinuation(this, th, (obj instanceof CancelHandler) || (obj instanceof Segment));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, cancelledContinuation)) {
                    NotCompleted notCompleted = (NotCompleted) obj;
                    if (notCompleted instanceof CancelHandler) {
                        callCancelHandler((CancelHandler) obj, th);
                    } else if (notCompleted instanceof Segment) {
                        callSegmentOnCancellation((Segment) obj, th);
                    }
                    detachChildIfNonReusable();
                    dispatchResume(this.resumeMode);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof NotCompleted) {
                fo.n("Not completed");
                return;
            }
            if (obj2 instanceof CompletedExceptionally) {
                return;
            }
            if (!(obj2 instanceof CompletedContinuation)) {
                th2 = th;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                CompletedContinuation completedContinuation = new CompletedContinuation(obj2, null, null, null, th2, 14, null);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, completedContinuation)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj2;
            if (completedContinuation2.getCancelled()) {
                fo.n("Must be called at most once");
                return;
            }
            Throwable th3 = th;
            CompletedContinuation completedContinuationCopy$default = CompletedContinuation.copy$default(completedContinuation2, null, null, null, null, th3, 15, null);
            th2 = th3;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$volatile$FU;
            do {
                if (atomicReferenceFieldUpdater3.compareAndSet(this, obj2, completedContinuationCopy$default)) {
                    completedContinuation2.invokeHandlers(this, th2);
                    return;
                }
            } while (atomicReferenceFieldUpdater3.get(this) == obj2);
            th = th2;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(Object obj) {
        dispatchResume(this.resumeMode);
    }

    public final void detachChild$kotlinx_coroutines_core() {
        DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
    }

    @Override // defpackage.a80
    public a80 getCallerFrame() {
        q60 q60Var = this.delegate;
        if (q60Var instanceof a80) {
            return (a80) q60Var;
        }
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation, defpackage.q60
    public y70 getContext() {
        return this.context;
    }

    public Throwable getContinuationCancellationCause(Job job) {
        return job.getCancellationException();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final q60 getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final Object getResult() {
        Job job;
        boolean zIsReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (zIsReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return z70.e;
        }
        if (zIsReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        }
        if (!DispatchedTaskKt.isCancellableMode(this.resumeMode) || (job = (Job) getContext().get(Job.Key)) == null || job.isActive()) {
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
        throw cancellationException;
    }

    @Override // defpackage.a80
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof CompletedContinuation ? (T) ((CompletedContinuation) obj).result : obj;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle disposableHandleInstallParentHandle = installParentHandle();
        if (disposableHandleInstallParentHandle != null && isCompleted()) {
            disposableHandleInstallParentHandle.dispose();
            _parentHandle$volatile$FU.set(this, NonDisposableHandle.INSTANCE);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                fo.n("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        invokeOnCancellationImpl(segment);
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(CancelHandler cancelHandler) {
        invokeOnCancellationImpl(cancelHandler);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof CancelledContinuation;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    public String nameString() {
        return "CancellableContinuation";
    }

    public final void parentCancelled$kotlinx_coroutines_core(Throwable th) {
        if (cancelLater(th)) {
            return;
        }
        cancel(th);
        detachChildIfNonReusable();
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        q60 q60Var = this.delegate;
        DispatchedContinuation dispatchedContinuation = q60Var instanceof DispatchedContinuation ? (DispatchedContinuation) q60Var : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    public final boolean resetStateReusable() {
        Object obj = _state$volatile$FU.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$volatile$FU.set(this, 536870911);
        _state$volatile$FU.set(this, Active.INSTANCE);
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T t, lu0 lu0Var) {
        resumeImpl$kotlinx_coroutines_core(t, this.resumeMode, lu0Var != null ? new sv(0, lu0Var) : null);
    }

    public final <R> void resumeImpl$kotlinx_coroutines_core(R r, int i, qu0 qu0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                CancellableContinuationImpl<T> cancellableContinuationImpl = this;
                R r2 = r;
                qu0 qu0Var2 = qu0Var;
                if (obj instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj;
                    if (cancelledContinuation.makeResumed()) {
                        if (qu0Var2 != null) {
                            cancellableContinuationImpl.callOnCancellation(qu0Var2, cancelledContinuation.cause, r2);
                            return;
                        }
                        return;
                    }
                }
                cancellableContinuationImpl.alreadyResumedError(r2);
                fo.d();
                return;
            }
            CancellableContinuationImpl<T> cancellableContinuationImpl2 = this;
            R r3 = r;
            int i2 = i;
            qu0 qu0Var3 = qu0Var;
            Object objResumedState = cancellableContinuationImpl2.resumedState((NotCompleted) obj, r3, i2, qu0Var3, null);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(cancellableContinuationImpl2, obj, objResumedState)) {
                    cancellableContinuationImpl2.detachChildIfNonReusable();
                    cancellableContinuationImpl2.dispatchResume(i2);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(cancellableContinuationImpl2) == obj);
            this = cancellableContinuationImpl2;
            r = r3;
            i = i2;
            qu0Var = qu0Var3;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t) {
        q60 q60Var = this.delegate;
        DispatchedContinuation dispatchedContinuation = q60Var instanceof DispatchedContinuation ? (DispatchedContinuation) q60Var : null;
        resumeImpl$kotlinx_coroutines_core$default(this, t, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th) {
        q60 q60Var = this.delegate;
        DispatchedContinuation dispatchedContinuation = q60Var instanceof DispatchedContinuation ? (DispatchedContinuation) q60Var : null;
        resumeImpl$kotlinx_coroutines_core$default(this, new CompletedExceptionally(th, false, 2, null), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation, defpackage.q60
    public void resumeWith(Object obj) {
        resumeImpl$kotlinx_coroutines_core$default(this, CompletionStateKt.toState(obj, this), this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    public String toString() {
        return nameString() + '(' + DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + DebugStringsKt.getHexAddress(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResumeWithException(Throwable th) {
        return tryResumeImpl(new CompletedExceptionally(th, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> void resume(R r, qu0 qu0Var) {
        resumeImpl$kotlinx_coroutines_core(r, this.resumeMode, qu0Var);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(lu0 lu0Var) {
        CancellableContinuationKt.invokeOnCancellation(this, new CancelHandler.UserSupplied(lu0Var));
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object tryResume(T t, Object obj) {
        return tryResumeImpl(t, obj, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> Object tryResume(R r, Object obj, qu0 qu0Var) {
        return tryResumeImpl(r, obj, qu0Var);
    }
}
