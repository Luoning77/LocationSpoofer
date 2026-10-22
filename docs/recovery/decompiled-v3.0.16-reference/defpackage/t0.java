package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class t0 extends am1 {
    public final AtomicReferenceFieldUpdater P;
    public final AtomicReferenceFieldUpdater Q;
    public final AtomicReferenceFieldUpdater R;
    public final AtomicReferenceFieldUpdater S;
    public final AtomicReferenceFieldUpdater T;

    public t0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.P = atomicReferenceFieldUpdater;
        this.Q = atomicReferenceFieldUpdater2;
        this.R = atomicReferenceFieldUpdater3;
        this.S = atomicReferenceFieldUpdater4;
        this.T = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.am1
    public final void O(v0 v0Var, v0 v0Var2) {
        this.Q.lazySet(v0Var, v0Var2);
    }

    @Override // defpackage.am1
    public final void P(v0 v0Var, Thread thread) {
        this.P.lazySet(v0Var, thread);
    }

    @Override // defpackage.am1
    public final boolean g(w0 w0Var, s0 s0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.S;
            if (atomicReferenceFieldUpdater.compareAndSet(w0Var, s0Var, s0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w0Var) == s0Var);
        return false;
    }

    @Override // defpackage.am1
    public final boolean h(w0 w0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.T;
            if (atomicReferenceFieldUpdater.compareAndSet(w0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w0Var) == obj);
        return false;
    }

    @Override // defpackage.am1
    public final boolean i(w0 w0Var, v0 v0Var, v0 v0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.R;
            if (atomicReferenceFieldUpdater.compareAndSet(w0Var, v0Var, v0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w0Var) == v0Var);
        return false;
    }
}
