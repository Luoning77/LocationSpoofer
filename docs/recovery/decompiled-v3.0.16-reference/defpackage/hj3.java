package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class hj3 {
    public final jj3 a = new jj3();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        jj3 jj3Var = this.a;
        if (jj3Var.d) {
            jj3.a(autoCloseable);
            return;
        }
        synchronized (jj3Var.a) {
            autoCloseable2 = (AutoCloseable) jj3Var.b.put(str, autoCloseable);
        }
        jj3.a(autoCloseable2);
    }

    public final void b() {
        jj3 jj3Var = this.a;
        if (!jj3Var.d) {
            jj3Var.d = true;
            synchronized (jj3Var.a) {
                try {
                    Iterator it = jj3Var.b.values().iterator();
                    while (it.hasNext()) {
                        jj3.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = jj3Var.c.iterator();
                    while (it2.hasNext()) {
                        jj3.a((AutoCloseable) it2.next());
                    }
                    jj3Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        jj3 jj3Var = this.a;
        synchronized (jj3Var.a) {
            autoCloseable = (AutoCloseable) jj3Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
