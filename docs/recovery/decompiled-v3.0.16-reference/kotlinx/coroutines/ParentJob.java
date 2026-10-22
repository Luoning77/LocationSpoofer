package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public interface ParentJob extends Job {
    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    CancellationException getChildJobCancellationCause();

    @Override // kotlinx.coroutines.Job, defpackage.w70
    /* synthetic */ x70 getKey();

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <R> R fold(ParentJob parentJob, R r, pu0 pu0Var) {
            return (R) Job.DefaultImpls.fold(parentJob, r, pu0Var);
        }

        public static <E extends w70> E get(ParentJob parentJob, x70 x70Var) {
            return (E) Job.DefaultImpls.get(parentJob, x70Var);
        }

        public static y70 minusKey(ParentJob parentJob, x70 x70Var) {
            return Job.DefaultImpls.minusKey(parentJob, x70Var);
        }

        public static y70 plus(ParentJob parentJob, y70 y70Var) {
            return Job.DefaultImpls.plus(parentJob, y70Var);
        }

        @cc0
        public static Job plus(ParentJob parentJob, Job job) {
            return Job.DefaultImpls.plus((Job) parentJob, job);
        }
    }
}
