package kotlinx.coroutines;

import defpackage.az2;
import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class AbstractCoroutine<T> extends JobSupport implements Job, q60, CoroutineScope {
    private final y70 context;

    public AbstractCoroutine(y70 y70Var, boolean z, boolean z2) {
        super(z2);
        if (z) {
            initParentJob((Job) y70Var.get(Job.Key));
        }
        this.context = y70Var.plus(this);
    }

    public void afterResume(Object obj) {
        afterCompletion(obj);
    }

    @Override // kotlinx.coroutines.JobSupport
    public String cancellationExceptionMessage() {
        return DebugStringsKt.getClassSimpleName(this) + " was cancelled";
    }

    @Override // defpackage.q60
    public final y70 getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public y70 getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        CoroutineExceptionHandlerKt.handleCoroutineException(this.context, th);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.JobSupport
    public String nameString$kotlinx_coroutines_core() {
        String coroutineName = CoroutineContextKt.getCoroutineName(this.context);
        if (coroutineName == null) {
            return super.nameString$kotlinx_coroutines_core();
        }
        StringBuilder sbQ = az2.q("\"", coroutineName, "\":");
        sbQ.append(super.nameString$kotlinx_coroutines_core());
        return sbQ.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void onCompletionInternal(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            onCompleted(obj);
        } else {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            onCancelled(completedExceptionally.cause, completedExceptionally.getHandled());
        }
    }

    @Override // defpackage.q60
    public final void resumeWith(Object obj) {
        Object objMakeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(CompletionStateKt.toState(obj));
        if (objMakeCompletingOnce$kotlinx_coroutines_core == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return;
        }
        afterResume(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public final <R> void start(CoroutineStart coroutineStart, R r, pu0 pu0Var) {
        coroutineStart.invoke(pu0Var, r, this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    public void onCompleted(T t) {
    }

    public void onCancelled(Throwable th, boolean z) {
    }
}
