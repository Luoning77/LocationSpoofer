package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cp extends Thread {
    public final /* synthetic */ int e = 1;

    public /* synthetic */ cp(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                break;
            default:
                Process.setThreadPriority(10);
                super.run();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = fp.h;
                reentrantLock.lock();
                try {
                    fp fpVarG = o51.g();
                    if (fpVarG == fp.l) {
                        fp.l = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (fpVarG != null) {
                            fpVarG.k();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }

    public /* synthetic */ cp(String str) {
        super(str);
    }
}
