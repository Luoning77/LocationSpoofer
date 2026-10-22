package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface CompletableJob extends Job {
    boolean complete();

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    @Override // kotlinx.coroutines.Job, defpackage.w70
    /* synthetic */ x70 getKey();

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <R> R fold(CompletableJob completableJob, R r, pu0 pu0Var) {
            return (R) Job.DefaultImpls.fold(completableJob, r, pu0Var);
        }

        public static <E extends w70> E get(CompletableJob completableJob, x70 x70Var) {
            return (E) Job.DefaultImpls.get(completableJob, x70Var);
        }

        public static y70 minusKey(CompletableJob completableJob, x70 x70Var) {
            return Job.DefaultImpls.minusKey(completableJob, x70Var);
        }

        public static y70 plus(CompletableJob completableJob, y70 y70Var) {
            return Job.DefaultImpls.plus(completableJob, y70Var);
        }

        @cc0
        public static Job plus(CompletableJob completableJob, Job job) {
            return Job.DefaultImpls.plus((Job) completableJob, job);
        }
    }
}
