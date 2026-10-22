package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hl2 implements zb1, Serializable {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(hl2.class, Object.class, "f");
    public volatile au0 e;
    public volatile Object f;

    @Override // defpackage.zb1
    public final boolean a() {
        return this.f != u92.v;
    }

    @Override // defpackage.zb1
    public final Object getValue() {
        Object obj = this.f;
        u92 u92Var = u92.v;
        if (obj != u92Var) {
            return obj;
        }
        au0 au0Var = this.e;
        if (au0Var != null) {
            Object objInvoke = au0Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, u92Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != u92Var) {
                }
            }
            this.e = null;
            return objInvoke;
        }
        return this.f;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
