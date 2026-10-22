package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j53 {
    public final k53 a;
    public final String b;
    public boolean c;
    public i53 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public j53(k53 k53Var, String str) {
        this.a = k53Var;
        this.b = str;
    }

    public final void a() {
        byte[] bArr = bh3.a;
        synchronized (this.a) {
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final boolean b() {
        i53 i53Var = this.d;
        if (i53Var != null && i53Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((i53) arrayList.get(size)).b) {
                i53 i53Var2 = (i53) arrayList.get(size);
                if (k53.i.isLoggable(Level.FINE)) {
                    ke0.G(i53Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(i53 i53Var, long j) {
        i53Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(i53Var, j, false)) {
                    this.a.c(this);
                }
            } else if (i53Var.b) {
                if (k53.i.isLoggable(Level.FINE)) {
                    ke0.G(i53Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (k53.i.isLoggable(Level.FINE)) {
                    ke0.G(i53Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[LOOP:0: B:23:0x0063->B:27:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[EDGE_INSN: B:39:0x0079->B:29:0x0079 BREAK  A[LOOP:0: B:23:0x0063->B:27:0x0075], SYNTHETIC] */
    public final boolean d(i53 i53Var, long j, boolean z) {
        int size;
        int size2;
        int i;
        Object obj;
        String strConcat;
        i53Var.getClass();
        j53 j53Var = i53Var.c;
        if (j53Var != this) {
            if (j53Var != null) {
                fo.n("task is in multiple queues");
                return false;
            }
            i53Var.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(i53Var);
        if (iIndexOf == -1) {
            i53Var.d = j2;
            if (k53.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(ke0.t(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(ke0.t(j2 - jNanoTime));
                }
                ke0.G(i53Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((i53) obj).d - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, i53Var);
            if (size2 == 0) {
                return true;
            }
        } else if (i53Var.d > j2) {
            arrayList.remove(iIndexOf);
            i53Var.d = j2;
            if (k53.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(ke0.t(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(ke0.t(j2 - jNanoTime));
                }
                ke0.G(i53Var, this, strConcat);
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (((i53) obj).d - jNanoTime > j) {
                    break;
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, i53Var);
            if (size2 == 0) {
                return true;
            }
        } else if (k53.i.isLoggable(Level.FINE)) {
            ke0.G(i53Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = bh3.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
