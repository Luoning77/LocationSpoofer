package kotlinx.coroutines;

import defpackage.b81;
import defpackage.cc0;
import defpackage.da0;
import defpackage.lu0;
import defpackage.pu0;
import defpackage.q60;
import defpackage.us2;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.selects.SelectClause0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface Job extends w70 {
    public static final Key Key = Key.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Key implements x70 {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    ChildHandle attachChild(ChildJob childJob);

    @cc0
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @cc0
    /* synthetic */ boolean cancel(Throwable th);

    @Override // defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    CancellationException getCancellationException();

    us2 getChildren();

    @Override // defpackage.w70
    /* synthetic */ x70 getKey();

    SelectClause0 getOnJoin();

    Job getParent();

    DisposableHandle invokeOnCompletion(lu0 lu0Var);

    DisposableHandle invokeOnCompletion(boolean z, boolean z2, lu0 lu0Var);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(q60 q60Var);

    @Override // defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    @cc0
    Job plus(Job job);

    @Override // defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);

    boolean start();

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(Job job, Throwable th, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return job.cancel(th);
        }

        public static <R> R fold(Job job, R r, pu0 pu0Var) {
            return (R) da0.u(job, r, pu0Var);
        }

        public static <E extends w70> E get(Job job, x70 x70Var) {
            return (E) da0.v(job, x70Var);
        }

        public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job job, boolean z, boolean z2, lu0 lu0Var, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
                return null;
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return job.invokeOnCompletion(z, z2, lu0Var);
        }

        public static y70 minusKey(Job job, x70 x70Var) {
            return da0.C(job, x70Var);
        }

        public static y70 plus(Job job, y70 y70Var) {
            return da0.E(y70Var, job);
        }

        @cc0
        public static Job plus(Job job, Job job2) {
            return job2;
        }

        public static /* synthetic */ void cancel$default(Job job, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            job.cancel(cancellationException);
        }

        public static /* synthetic */ void getParent$annotations() {
        }
    }
}
