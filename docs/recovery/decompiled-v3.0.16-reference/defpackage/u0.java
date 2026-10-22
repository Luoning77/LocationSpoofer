package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u0 extends am1 {
    @Override // defpackage.am1
    public final void O(v0 v0Var, v0 v0Var2) {
        v0Var.b = v0Var2;
    }

    @Override // defpackage.am1
    public final void P(v0 v0Var, Thread thread) {
        v0Var.a = thread;
    }

    @Override // defpackage.am1
    public final boolean g(w0 w0Var, s0 s0Var) {
        s0 s0Var2 = s0.b;
        synchronized (w0Var) {
            try {
                if (w0Var.f != s0Var) {
                    return false;
                }
                w0Var.f = s0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.am1
    public final boolean h(w0 w0Var, Object obj, Object obj2) {
        synchronized (w0Var) {
            try {
                if (w0Var.e != obj) {
                    return false;
                }
                w0Var.e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.am1
    public final boolean i(w0 w0Var, v0 v0Var, v0 v0Var2) {
        synchronized (w0Var) {
            try {
                if (w0Var.g != v0Var) {
                    return false;
                }
                w0Var.g = v0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
