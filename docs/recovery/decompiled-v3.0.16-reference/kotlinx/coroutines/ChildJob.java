package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public interface ChildJob extends Job {
    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    @Override // kotlinx.coroutines.Job, defpackage.w70
    /* synthetic */ x70 getKey();

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    void parentCancelled(ParentJob parentJob);

    @Override // kotlinx.coroutines.Job, defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <R> R fold(ChildJob childJob, R r, pu0 pu0Var) {
            return (R) Job.DefaultImpls.fold(childJob, r, pu0Var);
        }

        public static <E extends w70> E get(ChildJob childJob, x70 x70Var) {
            return (E) Job.DefaultImpls.get(childJob, x70Var);
        }

        public static y70 minusKey(ChildJob childJob, x70 x70Var) {
            return Job.DefaultImpls.minusKey(childJob, x70Var);
        }

        public static y70 plus(ChildJob childJob, y70 y70Var) {
            return Job.DefaultImpls.plus(childJob, y70Var);
        }

        @cc0
        public static Job plus(ChildJob childJob, Job job) {
            return Job.DefaultImpls.plus((Job) childJob, job);
        }
    }
}
