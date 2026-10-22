package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ey implements AutoCloseable, CoroutineScope {
    public final y70 e;

    public ey(y70 y70Var) {
        y70Var.getClass();
        this.e = y70Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt__JobKt.cancel$default(this.e, (CancellationException) null, 1, (Object) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final y70 getCoroutineContext() {
        return this.e;
    }
}
