package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rs1 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public rs1(Runnable runnable) {
        this.a = runnable;
    }

    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            gs0 gs0Var = ((bs0) ((qt1) it.next())).a;
            if (gs0Var.t >= 1) {
                Iterator it2 = gs0Var.c.k().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        b81.u();
                        return;
                    }
                }
            }
        }
    }

    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            gs0 gs0Var = ((bs0) ((qt1) it.next())).a;
            if (gs0Var.t >= 1) {
                Iterator it2 = gs0Var.c.k().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        b81.u();
                        return;
                    }
                }
            }
        }
    }

    public final void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            gs0 gs0Var = ((bs0) ((qt1) it.next())).a;
            if (gs0Var.t >= 1) {
                Iterator it2 = gs0Var.c.k().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        b81.u();
                        return;
                    }
                }
            }
        }
    }

    public final void d(qt1 qt1Var) {
        this.b.remove(qt1Var);
        qs1 qs1Var = (qs1) this.c.remove(qt1Var);
        if (qs1Var != null) {
            qs1Var.a.b(qs1Var.b);
            qs1Var.b = null;
        }
        this.a.run();
    }
}
