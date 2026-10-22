package kotlinx.coroutines.selects;

import defpackage.ee0;
import defpackage.lu0;
import defpackage.q60;
import defpackage.z70;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SelectOldKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void resumeUndispatched(CancellableContinuation<? super T> cancellableContinuation, T t) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatched(coroutineDispatcher, t);
        } else {
            cancellableContinuation.resumeWith(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeUndispatchedWithException(CancellableContinuation<?> cancellableContinuation, Throwable th) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatchedWithException(coroutineDispatcher, th);
        } else {
            cancellableContinuation.resumeWith(ee0.t(th));
        }
    }

    public static final <R> Object selectOld(lu0 lu0Var, q60 q60Var) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(q60Var);
        try {
            lu0Var.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == z70.e) {
            q60Var.getClass();
        }
        return result;
    }

    private static final <R> Object selectOld$$forInline(lu0 lu0Var, q60 q60Var) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(q60Var);
        try {
            lu0Var.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == z70.e) {
            q60Var.getClass();
        }
        return result;
    }

    public static final <R> Object selectUnbiasedOld(lu0 lu0Var, q60 q60Var) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(q60Var);
        try {
            lu0Var.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        Object objInitSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (objInitSelectResult == z70.e) {
            q60Var.getClass();
        }
        return objInitSelectResult;
    }

    private static final <R> Object selectUnbiasedOld$$forInline(lu0 lu0Var, q60 q60Var) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(q60Var);
        try {
            lu0Var.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        Object objInitSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (objInitSelectResult == z70.e) {
            q60Var.getClass();
        }
        return objInitSelectResult;
    }
}
