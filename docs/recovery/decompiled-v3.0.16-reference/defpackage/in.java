package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class in implements Executor {
    public final /* synthetic */ int e;
    public final ArrayDeque f;
    public Runnable g;
    public final Object h;
    public final Executor i;

    public in(Executor executor) {
        this.e = 1;
        executor.getClass();
        this.i = executor;
        this.f = new ArrayDeque();
        this.h = new Object();
    }

    public final void a() {
        switch (this.e) {
            case 0:
                synchronized (this.h) {
                    try {
                        Runnable runnable = (Runnable) this.f.poll();
                        this.g = runnable;
                        if (runnable != null) {
                            ((jn) this.i).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.h) {
                    Object objPoll = this.f.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.g = runnable2;
                    if (objPoll != null) {
                        this.i.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                synchronized (this.h) {
                    try {
                        this.f.add(new ub(1, this, runnable));
                        if (this.g == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.h) {
                    this.f.offer(new ub(10, runnable, this));
                    if (this.g == null) {
                        a();
                    }
                    break;
                }
                return;
        }
    }

    public in(jn jnVar) {
        this.e = 0;
        this.h = new Object();
        this.f = new ArrayDeque();
        this.i = jnVar;
    }
}
