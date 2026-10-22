package defpackage;

import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j61 extends AsyncTask {
    public final /* synthetic */ JobIntentService a;

    public j61(JobIntentService jobIntentService) {
        this.a = jobIntentService;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        while (true) {
            JobIntentService jobIntentService = this.a;
            m61 m61VarDequeueWork = jobIntentService.dequeueWork();
            if (m61VarDequeueWork == null) {
                return null;
            }
            jobIntentService.onHandleWork(m61VarDequeueWork.getIntent());
            m61VarDequeueWork.complete();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.a.processorFinished();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.processorFinished();
    }
}
