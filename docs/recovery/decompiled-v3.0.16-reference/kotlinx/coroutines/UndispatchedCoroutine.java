package kotlinx.coroutines;

import defpackage.i52;
import defpackage.j9;
import defpackage.q60;
import defpackage.y70;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    private volatile boolean threadLocalIsSet;
    private final ThreadLocal<i52> threadStateToRecover;

    /* JADX WARN: Illegal instructions before constructor call */
    public UndispatchedCoroutine(y70 y70Var, q60 q60Var) {
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.INSTANCE;
        super(y70Var.get(undispatchedMarker) == null ? y70Var.plus(undispatchedMarker) : y70Var, q60Var);
        this.threadStateToRecover = new ThreadLocal<>();
        if (q60Var.getContext().get(j9.B) instanceof CoroutineDispatcher) {
            return;
        }
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(y70Var, null);
        ThreadContextKt.restoreThreadContext(y70Var, objUpdateThreadContext);
        saveThreadContext(y70Var, objUpdateThreadContext);
    }

    private final void clearThreadLocal() {
        if (this.threadLocalIsSet) {
            i52 i52Var = this.threadStateToRecover.get();
            if (i52Var != null) {
                ThreadContextKt.restoreThreadContext((y70) i52Var.e, i52Var.f);
            }
            this.threadStateToRecover.remove();
        }
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine
    public void afterCompletionUndispatched() {
        clearThreadLocal();
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        clearThreadLocal();
        Object objRecoverResult = CompletionStateKt.recoverResult(obj, this.uCont);
        q60 q60Var = this.uCont;
        y70 context = q60Var.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(q60Var, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objRecoverResult);
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public final boolean clearThreadContext() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    public final void saveThreadContext(y70 y70Var, Object obj) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(new i52(y70Var, obj));
    }
}
