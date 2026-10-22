package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import androidx.core.app.JobIntentService;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o61 extends JobServiceEngine implements k61 {
    public final JobIntentService a;
    public final Object b;
    public JobParameters c;

    public o61(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.b = new Object();
        this.a = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.ensureProcessorRunningLocked(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zDoStopCurrentWork = this.a.doStopCurrentWork();
        synchronized (this.b) {
            this.c = null;
        }
        return zDoStopCurrentWork;
    }
}
