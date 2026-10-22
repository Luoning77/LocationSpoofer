package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ye1 implements bf1, CoroutineScope {
    public final xe1 e;
    public final y70 f;

    public ye1(xe1 xe1Var, y70 y70Var) {
        y70Var.getClass();
        this.e = xe1Var;
        this.f = y70Var;
        if (((ff1) xe1Var).d == we1.e) {
            JobKt__JobKt.cancel$default(y70Var, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        xe1 xe1Var = this.e;
        if (((ff1) xe1Var).d.compareTo(we1.e) <= 0) {
            xe1Var.b(this);
            JobKt__JobKt.cancel$default(this.f, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final y70 getCoroutineContext() {
        return this.f;
    }
}
