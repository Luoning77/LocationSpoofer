package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k50 implements us2 {
    public final AtomicReference a;

    public k50(us2 us2Var) {
        this.a = new AtomicReference(us2Var);
    }

    @Override // defpackage.us2
    public final Iterator iterator() {
        us2 us2Var = (us2) this.a.getAndSet(null);
        if (us2Var != null) {
            return us2Var.iterator();
        }
        fo.n("This sequence can be consumed only once.");
        return null;
    }
}
