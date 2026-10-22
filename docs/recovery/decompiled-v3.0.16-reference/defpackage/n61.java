package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n61 implements m61 {
    public final JobWorkItem a;
    public final /* synthetic */ o61 b;

    public n61(o61 o61Var, JobWorkItem jobWorkItem) {
        this.b = o61Var;
        this.a = jobWorkItem;
    }

    @Override // defpackage.m61
    public final void complete() {
        synchronized (this.b.b) {
            try {
                JobParameters jobParameters = this.b.c;
                if (jobParameters != null) {
                    jobParameters.completeWork(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m61
    public final Intent getIntent() {
        return this.a.getIntent();
    }
}
