package kotlinx.coroutines;

import defpackage.pu0;
import defpackage.q60;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SupervisorKt {
    public static final CompletableJob SupervisorJob(Job job) {
        return new SupervisorJobImpl(job);
    }

    public static /* synthetic */ CompletableJob SupervisorJob$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }

    public static final <R> Object supervisorScope(pu0 pu0Var, q60 q60Var) {
        SupervisorCoroutine supervisorCoroutine = new SupervisorCoroutine(q60Var.getContext(), q60Var);
        return UndispatchedKt.startUndispatchedOrReturn(supervisorCoroutine, supervisorCoroutine, pu0Var);
    }

    /* JADX INFO: renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ Job m29SupervisorJob$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SupervisorJob(job);
    }
}
