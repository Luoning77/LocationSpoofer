package kotlinx.coroutines;

import defpackage.ee0;
import defpackage.q60;
import defpackage.xg2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CompletionStateKt {
    public static final <T> Object recoverResult(Object obj, q60 q60Var) {
        return obj instanceof CompletedExceptionally ? ee0.t(((CompletedExceptionally) obj).cause) : obj;
    }

    public static final <T> Object toState(Object obj) {
        Throwable thA = xg2.a(obj);
        return thA == null ? obj : new CompletedExceptionally(thA, false, 2, null);
    }

    public static final <T> Object toState(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable thA = xg2.a(obj);
        return thA == null ? obj : new CompletedExceptionally(thA, false, 2, null);
    }
}
