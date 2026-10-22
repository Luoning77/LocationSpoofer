package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class fp extends pa3 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static fp l;
    public boolean e;
    public fp f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        i = conditionNewCondition;
        j = 60000L;
        k = 60000000000L;
    }

    public final void i() {
        long jC;
        fp fpVar;
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (l == null) {
                    l = new fp();
                    cp cpVar = new cp("Okio Watchdog");
                    cpVar.setDaemon(true);
                    cpVar.start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    jC = Math.min(j2, c() - jNanoTime) + jNanoTime;
                    this.g = jC;
                } else if (j2 != 0) {
                    jC = j2 + jNanoTime;
                    this.g = jC;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    jC = c();
                    this.g = jC;
                }
                long j3 = jC - jNanoTime;
                fp fpVar2 = l;
                fpVar2.getClass();
                while (true) {
                    fpVar = fpVar2.f;
                    if (fpVar == null || j3 < fpVar.g - jNanoTime) {
                        break;
                        break;
                    }
                    fpVar2 = fpVar;
                }
                this.f = fpVar;
                fpVar2.f = this;
                if (fpVar2 == l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            fp fpVar = l;
            while (fpVar != null) {
                fp fpVar2 = fpVar.f;
                if (fpVar2 == this) {
                    fpVar.f = this.f;
                    this.f = null;
                    return false;
                }
                fpVar = fpVar2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}
