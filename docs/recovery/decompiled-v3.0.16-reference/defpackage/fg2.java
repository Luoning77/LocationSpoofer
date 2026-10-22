package defpackage;

import android.os.Handler;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fg2 implements Runnable {
    public final /* synthetic */ int e = 0;
    public Object f;
    public Object g;
    public Object h;

    public fg2(CancellableContinuationImpl cancellableContinuationImpl, ii2 ii2Var, w80 w80Var) {
        this.f = cancellableContinuationImpl;
        this.g = ii2Var;
        this.h = w80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.e) {
            case 0:
                try {
                    objCall = ((wq0) this.f).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.h).post(new e7(5, (xq0) this.g, objCall));
                break;
            default:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.f;
                try {
                    BuildersKt.runBlocking(cancellableContinuationImpl.getContext().minusKey(j9.B), new t3((ii2) this.g, cancellableContinuationImpl, (w80) this.h, (q60) null, 11));
                } catch (Throwable th) {
                    cancellableContinuationImpl.cancel(th);
                }
                break;
        }
    }

    public /* synthetic */ fg2() {
    }
}
