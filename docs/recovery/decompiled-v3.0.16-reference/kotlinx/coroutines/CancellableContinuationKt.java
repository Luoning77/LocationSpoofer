package kotlinx.coroutines;

import defpackage.b81;
import defpackage.hd0;
import defpackage.lu0;
import defpackage.q60;
import defpackage.z70;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CancellableContinuationKt {
    public static final void disposeOnCancellation(CancellableContinuation<?> cancellableContinuation, DisposableHandle disposableHandle) {
        invokeOnCancellation(cancellableContinuation, new DisposeOnCancel(disposableHandle));
    }

    public static final <T> CancellableContinuationImpl<T> getOrCreateCancellableContinuation(q60 q60Var) {
        if (!(q60Var instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl<>(q60Var, 1);
        }
        CancellableContinuationImpl<T> cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) q60Var).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return cancellableContinuationImplClaimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new CancellableContinuationImpl<>(q60Var, 2);
    }

    public static final <T> void invokeOnCancellation(CancellableContinuation<? super T> cancellableContinuation, CancelHandler cancelHandler) {
        if (cancellableContinuation instanceof CancellableContinuationImpl) {
            ((CancellableContinuationImpl) cancellableContinuation).invokeOnCancellationInternal$kotlinx_coroutines_core(cancelHandler);
        } else {
            b81.s("third-party implementation of CancellableContinuation is not supported");
        }
    }

    public static final <T> Object suspendCancellableCoroutine(lu0 lu0Var, q60 q60Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        lu0Var.invoke(cancellableContinuationImpl);
        return cancellableContinuationImpl.getResult();
    }

    private static final <T> Object suspendCancellableCoroutine$$forInline(lu0 lu0Var, q60 q60Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        lu0Var.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == z70.e) {
            q60Var.getClass();
        }
        return result;
    }

    public static final <T> Object suspendCancellableCoroutineReusable(lu0 lu0Var, q60 q60Var) {
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(hd0.G(q60Var));
        try {
            lu0Var.invoke(orCreateCancellableContinuation);
            return orCreateCancellableContinuation.getResult();
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private static final <T> Object suspendCancellableCoroutineReusable$$forInline(lu0 lu0Var, q60 q60Var) {
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(hd0.G(q60Var));
        try {
            lu0Var.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == z70.e) {
                q60Var.getClass();
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
