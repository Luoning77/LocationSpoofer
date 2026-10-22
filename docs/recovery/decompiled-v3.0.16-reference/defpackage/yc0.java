package defpackage;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class yc0 {
    public ThreadPoolExecutor c;
    public int a = 64;
    public int b = 5;
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();

    public final void a(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    public final void b(ud2 ud2Var) {
        ud2Var.f.decrementAndGet();
        a(this.e, ud2Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #2 {, blocks: (B:22:0x0062, B:24:0x0066), top: B:51:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0066, please report this as an issue */
    public final void c() {
        int size;
        int i;
        ud2 ud2Var;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = bh3.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.d.iterator();
                it.getClass();
                while (it.hasNext()) {
                    ud2 ud2Var2 = (ud2) it.next();
                    if (this.e.size() >= this.a) {
                        break;
                    }
                    if (ud2Var2.f.get() < this.b) {
                        it.remove();
                        ud2Var2.f.incrementAndGet();
                        arrayList.add(ud2Var2);
                        this.e.add(ud2Var2);
                    }
                }
                synchronized (this) {
                    this.e.size();
                    this.f.size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    ud2Var = (ud2) arrayList.get(i);
                    synchronized (this) {
                        threadPoolExecutor = this.c;
                        if (threadPoolExecutor == null) {
                            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ah3(bh3.h + " Dispatcher", false));
                            this.c = threadPoolExecutor2;
                            threadPoolExecutor = threadPoolExecutor2;
                        }
                    }
                    ud2Var.getClass();
                    xd2 xd2Var = ud2Var.g;
                    byte[] bArr2 = bh3.a;
                    try {
                        try {
                            threadPoolExecutor.execute(ud2Var);
                        } catch (Throwable th) {
                            xd2Var.e.e.b(ud2Var);
                            throw th;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        xd2Var.f(interruptedIOException);
                        ud2Var.e.onFailure(xd2Var, interruptedIOException);
                        xd2Var.e.e.b(ud2Var);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i < size) {
            ud2Var = (ud2) arrayList.get(i);
            synchronized (this) {
                threadPoolExecutor = this.c;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ah3(bh3.h + " Dispatcher", false));
                    this.c = threadPoolExecutor3;
                    threadPoolExecutor = threadPoolExecutor3;
                }
                ud2Var.getClass();
                xd2 xd2Var2 = ud2Var.g;
                byte[] bArr3 = bh3.a;
                threadPoolExecutor.execute(ud2Var);
            }
        }
    }

    public final void d(int i) {
        if (i < 1) {
            fo.f(p91.l(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.b = i;
        }
        c();
    }
}
