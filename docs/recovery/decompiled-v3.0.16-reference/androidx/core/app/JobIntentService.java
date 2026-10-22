package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import defpackage.fo;
import defpackage.j61;
import defpackage.k61;
import defpackage.l61;
import defpackage.m61;
import defpackage.n61;
import defpackage.o61;
import defpackage.p61;
import defpackage.q61;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    q61 mCompatWorkEnqueuer;
    j61 mCurProcessor;
    k61 mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, q61> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;
    final ArrayList<l61> mCompatQueue = null;

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent == null) {
            fo.i("work must not be null");
            return;
        }
        synchronized (sLock) {
            q61 workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
            workEnqueuer.a(i);
            p61 p61Var = (p61) workEnqueuer;
            p61Var.d.enqueue(p61Var.c, new JobWorkItem(intent));
        }
    }

    public static q61 getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, q61> map = sClassWorkEnqueuer;
        q61 q61Var = map.get(componentName);
        if (q61Var != null) {
            return q61Var;
        }
        if (!z) {
            fo.i("Can't be here without a job id");
            return null;
        }
        p61 p61Var = new p61(context, componentName, i);
        map.put(componentName, p61Var);
        return p61Var;
    }

    public m61 dequeueWork() {
        k61 k61Var = this.mJobImpl;
        if (k61Var == null) {
            synchronized (this.mCompatQueue) {
                try {
                    if (this.mCompatQueue.size() <= 0) {
                        return null;
                    }
                    return this.mCompatQueue.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        o61 o61Var = (o61) k61Var;
        synchronized (o61Var.b) {
            try {
                JobParameters jobParameters = o61Var.c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(o61Var.a.getClassLoader());
                return new n61(o61Var, jobWorkItemDequeueWork);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean doStopCurrentWork() {
        j61 j61Var = this.mCurProcessor;
        if (j61Var != null) {
            j61Var.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            j61 j61Var = new j61(this);
            this.mCurProcessor = j61Var;
            j61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        k61 k61Var = this.mJobImpl;
        if (k61Var != null) {
            return ((o61) k61Var).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new o61(this);
        this.mCompatWorkEnqueuer = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<l61> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getClass();
        synchronized (this.mCompatQueue) {
            ArrayList<l61> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new l61(this, intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<l61> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<l61> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }
}
