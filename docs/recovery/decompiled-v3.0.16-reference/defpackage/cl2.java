package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cl2 implements q60, a80 {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(cl2.class, Object.class, "result");
    public final q60 e;
    private volatile Object result;

    public cl2(q60 q60Var) {
        z70 z70Var = z70.e;
        this.e = q60Var;
        this.result = z70Var;
    }

    @Override // defpackage.a80
    public final a80 getCallerFrame() {
        q60 q60Var = this.e;
        if (q60Var instanceof a80) {
            return (a80) q60Var;
        }
        return null;
    }

    @Override // defpackage.q60
    public final y70 getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.a80
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.q60
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        while (true) {
            Object obj2 = this.result;
            z70 z70Var = z70.f;
            if (obj2 == z70Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, z70Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != z70Var) {
                    }
                }
                return;
            }
            z70 z70Var2 = z70.e;
            if (obj2 != z70Var2) {
                fo.n("Already resumed");
                return;
            }
            z70 z70Var3 = z70.g;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, z70Var2, z70Var3)) {
                    this.e.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == z70Var2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.e;
    }
}
