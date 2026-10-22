package kotlinx.coroutines.future;

import defpackage.mf3;
import defpackage.q60;
import defpackage.wg2;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ContinuationHandler<T> implements BiFunction<T, Throwable, mf3> {
    public volatile q60 cont;

    public ContinuationHandler(q60 q60Var) {
        this.cont = q60Var;
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T t, Throwable th) {
        Throwable cause;
        q60 q60Var = this.cont;
        if (q60Var == null) {
            return;
        }
        if (th == null) {
            q60Var.resumeWith(t);
            return;
        }
        CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
        if (completionException != null && (cause = completionException.getCause()) != null) {
            th = cause;
        }
        q60Var.resumeWith(new wg2(th));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ mf3 apply(Object obj, Throwable th) {
        apply2(obj, th);
        return mf3.a;
    }
}
