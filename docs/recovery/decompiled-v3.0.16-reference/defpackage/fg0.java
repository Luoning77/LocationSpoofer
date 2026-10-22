package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fg0 {
    public int a;
    public long b;
    public Object c;
    public Object d;
    public final Object e;

    public fg0(k53 k53Var, int i, long j, TimeUnit timeUnit) {
        k53Var.getClass();
        timeUnit.getClass();
        this.a = i;
        this.b = timeUnit.toNanos(j);
        this.c = k53Var.d();
        this.d = new jz0(this, az2.p(new StringBuilder(), bh3.h, " ConnectionPool"));
        this.e = new ConcurrentLinkedQueue();
        if (j > 0) {
            return;
        }
        fo.f(p91.o("keepAliveDuration <= 0: ", j));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    public boolean a(q8 q8Var, xd2 xd2Var, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            ae2 ae2Var = (ae2) it.next();
            ae2Var.getClass();
            synchronized (ae2Var) {
                if (z) {
                    try {
                        if (!(ae2Var.g != null)) {
                            continue;
                        } else if (ae2Var.h(q8Var, arrayList)) {
                            xd2Var.a(ae2Var);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (ae2Var.h(q8Var, arrayList)) {
                    xd2Var.a(ae2Var);
                    return true;
                }
            }
        }
    }

    public int b(ae2 ae2Var, long j) {
        byte[] bArr = bh3.a;
        ArrayList arrayList = ae2Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + ae2Var.b.a.i + " was leaked. Did you forget to close a response body?";
                l82 l82Var = l82.a;
                l82.a.j(((vd2) reference).a, str);
                arrayList.remove(i);
                ae2Var.j = true;
                if (arrayList.isEmpty()) {
                    ae2Var.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public fg0() {
        this.b = 0L;
        this.a = 0;
        this.e = new xv();
    }
}
