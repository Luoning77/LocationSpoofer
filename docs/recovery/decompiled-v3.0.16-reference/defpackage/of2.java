package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class of2 implements CoroutineScope, mf2 {
    public static final uv h = new uv(0);
    public final y70 e;
    public final of2 f = this;
    public volatile y70 g;

    public of2(y70 y70Var) {
        this.e = y70Var;
    }

    @Override // defpackage.mf2
    public final void b() {
        d();
    }

    @Override // defpackage.mf2
    public final void c() {
        d();
    }

    public final void d() {
        synchronized (this.f) {
            try {
                y70 y70Var = this.g;
                if (y70Var == null) {
                    this.g = h;
                } else {
                    JobKt.cancel(y70Var, (CancellationException) new pr0(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final y70 getCoroutineContext() {
        y70 y70VarPlus;
        y70 y70Var = this.g;
        if (y70Var == null || y70Var == h) {
            r30 r30Var = (r30) this.e.get(r30.f);
            y70 nf2Var = r30Var != null ? new nf2(CoroutineExceptionHandler.Key, r30Var, this) : sj0.e;
            synchronized (this.f) {
                try {
                    y70VarPlus = this.g;
                    if (y70VarPlus == null) {
                        y70 y70Var2 = this.e;
                        y70VarPlus = y70Var2.plus(JobKt.Job((Job) y70Var2.get(Job.Key))).plus(sj0.e).plus(nf2Var);
                    } else if (y70VarPlus == h) {
                        y70 y70Var3 = this.e;
                        CompletableJob completableJobJob = JobKt.Job((Job) y70Var3.get(Job.Key));
                        completableJobJob.cancel((CancellationException) new pr0(0));
                        y70VarPlus = y70Var3.plus(completableJobJob).plus(sj0.e).plus(nf2Var);
                    }
                    this.g = y70VarPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            y70Var = y70VarPlus;
        }
        y70Var.getClass();
        return y70Var;
    }

    @Override // defpackage.mf2
    public final void a() {
    }
}
