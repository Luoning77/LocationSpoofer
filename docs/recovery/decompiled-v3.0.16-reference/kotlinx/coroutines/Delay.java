package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.hd0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.y70;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface Delay {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        @cc0
        public static Object delay(Delay delay, long j, q60 q60Var) {
            mf3 mf3Var = mf3.a;
            if (j <= 0) {
                return mf3Var;
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
            cancellableContinuationImpl.initCancellability();
            delay.mo91scheduleResumeAfterDelay(j, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            return result == z70.e ? result : mf3Var;
        }

        public static DisposableHandle invokeOnTimeout(Delay delay, long j, Runnable runnable, y70 y70Var) {
            return DefaultExecutorKt.getDefaultDelay().invokeOnTimeout(j, runnable, y70Var);
        }
    }

    @cc0
    Object delay(long j, q60 q60Var);

    DisposableHandle invokeOnTimeout(long j, Runnable runnable, y70 y70Var);

    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    void mo91scheduleResumeAfterDelay(long j, CancellableContinuation<? super mf3> cancellableContinuation);
}
