package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface CompletableDeferred<T> extends Deferred<T> {
    boolean complete(T t);

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, defpackage.w70
    /* synthetic */ x70 getKey();

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <T, R> R fold(CompletableDeferred<T> completableDeferred, R r, pu0 pu0Var) {
            return (R) Deferred.DefaultImpls.fold(completableDeferred, r, pu0Var);
        }

        public static <T, E extends w70> E get(CompletableDeferred<T> completableDeferred, x70 x70Var) {
            return (E) Deferred.DefaultImpls.get(completableDeferred, x70Var);
        }

        public static <T> y70 minusKey(CompletableDeferred<T> completableDeferred, x70 x70Var) {
            return Deferred.DefaultImpls.minusKey(completableDeferred, x70Var);
        }

        public static <T> y70 plus(CompletableDeferred<T> completableDeferred, y70 y70Var) {
            return Deferred.DefaultImpls.plus(completableDeferred, y70Var);
        }

        @cc0
        public static <T> Job plus(CompletableDeferred<T> completableDeferred, Job job) {
            return Deferred.DefaultImpls.plus((Deferred) completableDeferred, job);
        }
    }
}
