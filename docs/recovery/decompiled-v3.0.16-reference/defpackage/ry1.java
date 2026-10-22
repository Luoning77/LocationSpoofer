package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ry1 {
    public final AtomicReference a = new AtomicReference(null);
    public final Mutex b = MutexKt.Mutex$default(false, 1, null);

    public static Object a(ry1 ry1Var, lu0 lu0Var, k33 k33Var) {
        ry1Var.getClass();
        return CoroutineScopeKt.coroutineScope(new oy1(ry1Var, lu0Var, null), k33Var);
    }

    public final void b(my1 my1Var) {
        while (true) {
            AtomicReference atomicReference = this.a;
            my1 my1Var2 = (my1) atomicReference.get();
            if (my1Var2 != null && my1Var.a.compareTo(my1Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(my1Var2, my1Var)) {
                    if (my1Var2 != null) {
                        my1Var2.b.cancel((CancellationException) new un0("Mutation interrupted", 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == my1Var2);
        }
    }
}
