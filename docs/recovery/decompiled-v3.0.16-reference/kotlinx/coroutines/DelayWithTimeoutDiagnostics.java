package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.y70;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface DelayWithTimeoutDiagnostics extends Delay {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        @cc0
        public static Object delay(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, q60 q60Var) {
            Object objDelay = Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j, q60Var);
            return objDelay == z70.e ? objDelay : mf3.a;
        }

        public static DisposableHandle invokeOnTimeout(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, Runnable runnable, y70 y70Var) {
            return Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j, runnable, y70Var);
        }
    }

    /* JADX INFO: renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    String m23timeoutMessageLRDsOJo(long j);
}
