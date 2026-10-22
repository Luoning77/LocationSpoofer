package kotlinx.coroutines;

import defpackage.cc0;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class JobKt__FutureKt {
    @cc0
    public static final void cancelFutureOnCancellation(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        CancellableContinuationKt.invokeOnCancellation(cancellableContinuation, new PublicCancelFutureOnCancel(future));
    }
}
