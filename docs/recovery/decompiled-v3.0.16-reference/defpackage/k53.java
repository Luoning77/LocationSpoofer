package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k53 {
    public static final k53 h = new k53(new us1(new ah3(az2.p(new StringBuilder(), bh3.h, " TaskRunner"), true)));
    public static final Logger i;
    public final us1 a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ab g = new ab(this, 6);

    static {
        Logger logger = Logger.getLogger(k53.class.getName());
        logger.getClass();
        i = logger;
    }

    public k53(us1 us1Var) {
        this.a = us1Var;
    }

    public final void a(i53 i53Var, long j) {
        byte[] bArr = bh3.a;
        j53 j53Var = i53Var.c;
        j53Var.getClass();
        if (j53Var.d != i53Var) {
            fo.n("Check failed.");
            return;
        }
        boolean z = j53Var.f;
        j53Var.f = false;
        j53Var.d = null;
        this.e.remove(j53Var);
        if (j != -1 && !z && !j53Var.c) {
            j53Var.d(i53Var, j, true);
        }
        if (j53Var.e.isEmpty()) {
            return;
        }
        this.f.add(j53Var);
    }

    public final i53 b() {
        long j;
        i53 i53Var;
        boolean z;
        byte[] bArr = bh3.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i2 = 0;
            i53 i53Var2 = null;
            while (true) {
                if (i2 >= size) {
                    j = jNanoTime;
                    i53Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                i53 i53Var3 = (i53) ((j53) obj).e.get(0);
                j = jNanoTime;
                i53Var = null;
                long jMax = Math.max(0L, i53Var3.d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (i53Var2 != null) {
                        z = true;
                        break;
                    }
                    i53Var2 = i53Var3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (i53Var2 != null) {
                byte[] bArr2 = bh3.a;
                i53Var2.d = -1L;
                j53 j53Var = i53Var2.c;
                j53Var.getClass();
                j53Var.e.remove(i53Var2);
                arrayList.remove(j53Var);
                j53Var.d = i53Var2;
                arrayList2.add(j53Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    ((ThreadPoolExecutor) this.a.f).execute(this.g);
                }
                return i53Var2;
            }
            if (this.c) {
                if (jMin >= this.d - j) {
                    return i53Var;
                }
                notify();
                return i53Var;
            }
            this.c = true;
            this.d = j + jMin;
            try {
                try {
                    long j2 = jMin / 1000000;
                    long j3 = jMin - (1000000 * j2);
                    if (j2 > 0 || jMin > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((j53) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        j53 j53Var2 = (j53) arrayList.get(size3);
                        j53Var2.b();
                        if (j53Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }

    public final void c(j53 j53Var) {
        j53Var.getClass();
        byte[] bArr = bh3.a;
        if (j53Var.d == null) {
            boolean zIsEmpty = j53Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(j53Var);
            } else if (!arrayList.contains(j53Var)) {
                arrayList.add(j53Var);
            }
        }
        if (this.c) {
            notify();
        } else {
            ((ThreadPoolExecutor) this.a.f).execute(this.g);
        }
    }

    public final j53 d() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new j53(this, p91.l(i2, "Q"));
    }

    public final void e(i53 i53Var) {
        byte[] bArr = bh3.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(i53Var.a);
        try {
            long jA = i53Var.a();
            synchronized (this) {
                a(i53Var, jA);
            }
        } finally {
            synchronized (this) {
                a(i53Var, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }
}
