package kotlinx.coroutines.intrinsics;

import defpackage.da0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.hd0;
import defpackage.oq;
import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class UndispatchedKt {
    private static final Void dispatchExceptionAndMakeCompleting(ScopeCoroutine<?> scopeCoroutine, DispatchException dispatchException) throws Throwable {
        scopeCoroutine.makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    private static final boolean notOwnTimeout(ScopeCoroutine<?> scopeCoroutine, Throwable th) {
        return ((th instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th).coroutine == scopeCoroutine) ? false : true;
    }

    public static final <R, T> void startCoroutineUndispatched(pu0 pu0Var, R r, q60 q60Var) {
        Object objInvoke;
        q60Var.getClass();
        try {
            y70 context = q60Var.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
            try {
                if (pu0Var instanceof oq) {
                    da0.o(2, pu0Var);
                    objInvoke = pu0Var.invoke(r, q60Var);
                } else {
                    objInvoke = hd0.R(pu0Var, r, q60Var);
                }
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                if (objInvoke != z70.e) {
                    q60Var.resumeWith(objInvoke);
                }
            } catch (Throwable th) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            q60Var.resumeWith(ee0.t(th));
        }
    }

    public static final <T, R> Object startUndispatchedOrReturn(ScopeCoroutine<? super T> scopeCoroutine, R r, pu0 pu0Var) {
        return startUndspatched(scopeCoroutine, true, r, pu0Var);
    }

    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(ScopeCoroutine<? super T> scopeCoroutine, R r, pu0 pu0Var) {
        return startUndspatched(scopeCoroutine, false, r, pu0Var);
    }

    private static final <T, R> Object startUndspatched(ScopeCoroutine<? super T> scopeCoroutine, boolean z, R r, pu0 pu0Var) throws Throwable {
        Object completedExceptionally;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            if (pu0Var instanceof oq) {
                da0.o(2, pu0Var);
                completedExceptionally = pu0Var.invoke(r, scopeCoroutine);
            } else {
                completedExceptionally = hd0.R(pu0Var, r, scopeCoroutine);
            }
        } catch (DispatchException e) {
            dispatchExceptionAndMakeCompleting(scopeCoroutine, e);
            fo.d();
            return null;
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        z70 z70Var = z70.e;
        if (completedExceptionally == z70Var || (objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return z70Var;
        }
        scopeCoroutine.afterCompletionUndispatched();
        if (!(objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
            return JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        if (z || notOwnTimeout(scopeCoroutine, ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause)) {
            throw ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
        }
        if (completedExceptionally instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) completedExceptionally).cause;
        }
        return completedExceptionally;
    }
}
