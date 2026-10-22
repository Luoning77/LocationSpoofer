package kotlinx.coroutines.future;

import defpackage.mf3;
import defpackage.y70;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class CompletableFutureCoroutine<T> extends AbstractCoroutine<T> implements BiFunction<T, Throwable, mf3> {
    private final CompletableFuture<T> future;

    public CompletableFutureCoroutine(y70 y70Var, CompletableFuture<T> completableFuture) {
        super(y70Var, true, true);
        this.future = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ mf3 apply(Object obj, Throwable th) {
        apply2(obj, th);
        return mf3.a;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th, boolean z) {
        this.future.completeExceptionally(th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(T t) {
        this.future.complete(t);
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public void apply2(T t, Throwable th) {
        Job.DefaultImpls.cancel$default((Job) this, (CancellationException) null, 1, (Object) null);
    }
}
