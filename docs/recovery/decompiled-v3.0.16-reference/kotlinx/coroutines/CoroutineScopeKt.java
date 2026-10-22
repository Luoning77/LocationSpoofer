package kotlinx.coroutines;

import defpackage.fo;
import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CoroutineScopeKt {
    public static final CoroutineScope CoroutineScope(y70 y70Var) {
        if (y70Var.get(Job.Key) == null) {
            y70Var = y70Var.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        }
        return new ContextScope(y70Var);
    }

    public static final CoroutineScope MainScope() {
        return new ContextScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    }

    public static final void cancel(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            fo.o(coroutineScope, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(coroutineScope, cancellationException);
    }

    public static final <R> Object coroutineScope(pu0 pu0Var, q60 q60Var) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(q60Var.getContext(), q60Var);
        return UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, pu0Var);
    }

    public static final Object currentCoroutineContext(q60 q60Var) {
        return q60Var.getContext();
    }

    private static final Object currentCoroutineContext$$forInline(q60 q60Var) {
        throw null;
    }

    public static final void ensureActive(CoroutineScope coroutineScope) {
        JobKt.ensureActive(coroutineScope.getCoroutineContext());
    }

    public static final boolean isActive(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final CoroutineScope plus(CoroutineScope coroutineScope, y70 y70Var) {
        return new ContextScope(coroutineScope.getCoroutineContext().plus(y70Var));
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        cancel(coroutineScope, str, th);
    }

    public static final void cancel(CoroutineScope coroutineScope, String str, Throwable th) {
        cancel(coroutineScope, ExceptionsKt.CancellationException(str, th));
    }

    public static /* synthetic */ void isActive$annotations(CoroutineScope coroutineScope) {
    }
}
