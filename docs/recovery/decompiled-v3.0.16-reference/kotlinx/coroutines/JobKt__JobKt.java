package kotlinx.coroutines;

import defpackage.bv0;
import defpackage.cc0;
import defpackage.fo;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.us2;
import defpackage.w70;
import defpackage.y70;
import defpackage.z70;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final /* synthetic */ class JobKt__JobKt {
    public static final CompletableJob Job(Job job) {
        return new JobImpl(job);
    }

    public static /* synthetic */ CompletableJob Job$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return JobKt.Job(job);
    }

    @cc0
    public static final /* synthetic */ boolean cancel(y70 y70Var, Throwable th) {
        w70 w70Var = y70Var.get(Job.Key);
        JobSupport jobSupport = w70Var instanceof JobSupport ? (JobSupport) w70Var : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, jobSupport));
        return true;
    }

    public static /* synthetic */ boolean cancel$default(y70 y70Var, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return cancel(y70Var, th);
    }

    public static final Object cancelAndJoin(Job job, q60 q60Var) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        Object objJoin = job.join(q60Var);
        return objJoin == z70.e ? objJoin : mf3.a;
    }

    @cc0
    public static final /* synthetic */ void cancelChildren(y70 y70Var, Throwable th) {
        Job job = (Job) y70Var.get(Job.Key);
        if (job == null) {
            return;
        }
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, job));
            }
        }
    }

    public static /* synthetic */ void cancelChildren$default(Job job, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(job, cancellationException);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return invokeOnCompletion$default(job, false, new DisposeOnCompletion(disposableHandle), 1, null);
    }

    public static final void ensureActive(y70 y70Var) {
        Job job = (Job) y70Var.get(Job.Key);
        if (job != null) {
            JobKt.ensureActive(job);
        }
    }

    public static final Job getJob(y70 y70Var) {
        Job job = (Job) y70Var.get(Job.Key);
        if (job != null) {
            return job;
        }
        fo.o(y70Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).invokeOnCompletionInternal$kotlinx_coroutines_core(z, jobNode) : job.invokeOnCompletion(jobNode.getOnCancelling(), z, new AnonymousClass1(jobNode));
    }

    public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z, JobNode jobNode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return JobKt.invokeOnCompletion(job, z, jobNode);
    }

    public static final boolean isActive(y70 y70Var) {
        Job job = (Job) y70Var.get(Job.Key);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    private static final Throwable orCancellation$JobKt__JobKt(Throwable th, Job job) {
        return th == null ? new JobCancellationException("Job was cancelled", null, job) : th;
    }

    @cc0
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ Job m26Job(Job job) {
        return JobKt.Job(job);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public /* synthetic */ class AnonymousClass1 extends bv0 implements lu0 {
        public AnonymousClass1(Object obj) {
            super(1, 0, JobNode.class, obj, "invoke", "invoke(Ljava/lang/Throwable;)V");
        }

        @Override // defpackage.lu0
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return mf3.a;
        }

        public final void invoke(Throwable th) {
            ((JobNode) this.receiver).invoke(th);
        }
    }

    public static /* synthetic */ void cancelChildren$default(Job job, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(job, th);
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ Job m27Job$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m26Job(job);
    }

    public static /* synthetic */ void cancel$default(Job job, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        JobKt.cancel(job, str, th);
    }

    public static /* synthetic */ void cancelChildren$default(y70 y70Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancelChildren(y70Var, cancellationException);
    }

    public static /* synthetic */ void cancel$default(y70 y70Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        JobKt.cancel(y70Var, cancellationException);
    }

    public static /* synthetic */ void cancelChildren$default(y70 y70Var, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(y70Var, th);
    }

    public static final void ensureActive(Job job) {
        if (!job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final void cancel(Job job, String str, Throwable th) {
        job.cancel(ExceptionsKt.CancellationException(str, th));
    }

    public static final void cancel(y70 y70Var, CancellationException cancellationException) {
        Job job = (Job) y70Var.get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    @cc0
    public static final /* synthetic */ void cancelChildren(Job job, Throwable th) {
        for (Job job2 : job.getChildren()) {
            JobSupport jobSupport = job2 instanceof JobSupport ? (JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, job));
            }
        }
    }

    public static final void cancelChildren(y70 y70Var, CancellationException cancellationException) {
        us2 children;
        Job job = (Job) y70Var.get(Job.Key);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(cancellationException);
        }
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        Iterator it = job.getChildren().iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(cancellationException);
        }
    }
}
