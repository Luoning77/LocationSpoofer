package kotlinx.coroutines;

import defpackage.ca0;
import defpackage.o51;
import defpackage.qu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class CompletedContinuation<R> {
    public final Throwable cancelCause;
    public final CancelHandler cancelHandler;
    public final Object idempotentResume;
    public final qu0 onCancellation;
    public final R result;

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, qu0 qu0Var, Object obj2, Throwable th, int i, ca0 ca0Var) {
        this(obj, (i & 2) != 0 ? null : cancelHandler, (i & 4) != 0 ? null : qu0Var, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation copy$default(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, qu0 qu0Var, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i & 2) != 0) {
            cancelHandler = completedContinuation.cancelHandler;
        }
        if ((i & 4) != 0) {
            qu0Var = completedContinuation.onCancellation;
        }
        if ((i & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i & 16) != 0) {
            th = completedContinuation.cancelCause;
        }
        Throwable th2 = th;
        qu0 qu0Var2 = qu0Var;
        return completedContinuation.copy(obj, cancelHandler, qu0Var2, obj2, th2);
    }

    public final R component1() {
        return this.result;
    }

    public final CancelHandler component2() {
        return this.cancelHandler;
    }

    public final qu0 component3() {
        return this.onCancellation;
    }

    public final Object component4() {
        return this.idempotentResume;
    }

    public final Throwable component5() {
        return this.cancelCause;
    }

    public final CompletedContinuation<R> copy(R r, CancelHandler cancelHandler, qu0 qu0Var, Object obj, Throwable th) {
        return new CompletedContinuation<>(r, cancelHandler, qu0Var, obj, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return o51.f(this.result, completedContinuation.result) && o51.f(this.cancelHandler, completedContinuation.cancelHandler) && o51.f(this.onCancellation, completedContinuation.onCancellation) && o51.f(this.idempotentResume, completedContinuation.idempotentResume) && o51.f(this.cancelCause, completedContinuation.cancelCause);
    }

    public final boolean getCancelled() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        R r = this.result;
        int iHashCode = (r == null ? 0 : r.hashCode()) * 31;
        CancelHandler cancelHandler = this.cancelHandler;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        qu0 qu0Var = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (qu0Var == null ? 0 : qu0Var.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void invokeHandlers(CancellableContinuationImpl<?> cancellableContinuationImpl, Throwable th) {
        CancelHandler cancelHandler = this.cancelHandler;
        if (cancelHandler != null) {
            cancellableContinuationImpl.callCancelHandler(cancelHandler, th);
        }
        qu0 qu0Var = this.onCancellation;
        if (qu0Var != null) {
            cancellableContinuationImpl.callOnCancellation(qu0Var, th, this.result);
        }
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public CompletedContinuation(R r, CancelHandler cancelHandler, qu0 qu0Var, Object obj, Throwable th) {
        this.result = r;
        this.cancelHandler = cancelHandler;
        this.onCancellation = qu0Var;
        this.idempotentResume = obj;
        this.cancelCause = th;
    }
}
