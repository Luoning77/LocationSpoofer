package defpackage;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rg implements Choreographer.FrameCallback {
    public final /* synthetic */ CancellableContinuationImpl e;
    public final /* synthetic */ lu0 f;

    public rg(CancellableContinuationImpl cancellableContinuationImpl, sg sgVar, lu0 lu0Var) {
        this.e = cancellableContinuationImpl;
        this.f = lu0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object wg2Var;
        try {
            wg2Var = this.f.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        this.e.resumeWith(wg2Var);
    }
}
