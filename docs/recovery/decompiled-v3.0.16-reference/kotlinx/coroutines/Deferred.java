package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.pu0;
import defpackage.q60;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface Deferred<T> extends Job {
    Object await(q60 q60Var);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    @Override // kotlinx.coroutines.Job, defpackage.w70
    /* synthetic */ x70 getKey();

    SelectClause1<T> getOnAwait();

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <T, R> R fold(Deferred<? extends T> deferred, R r, pu0 pu0Var) {
            return (R) Job.DefaultImpls.fold(deferred, r, pu0Var);
        }

        public static <T, E extends w70> E get(Deferred<? extends T> deferred, x70 x70Var) {
            return (E) Job.DefaultImpls.get(deferred, x70Var);
        }

        public static <T> y70 minusKey(Deferred<? extends T> deferred, x70 x70Var) {
            return Job.DefaultImpls.minusKey(deferred, x70Var);
        }

        public static <T> y70 plus(Deferred<? extends T> deferred, y70 y70Var) {
            return Job.DefaultImpls.plus(deferred, y70Var);
        }

        @cc0
        public static <T> Job plus(Deferred<? extends T> deferred, Job job) {
            return Job.DefaultImpls.plus((Job) deferred, job);
        }
    }
}
