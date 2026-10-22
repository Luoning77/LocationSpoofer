package kotlinx.coroutines.sync;

import defpackage.b81;
import defpackage.cc0;
import defpackage.q60;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface Mutex {
    SelectClause2<Object, Mutex> getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, q60 q60Var);

    boolean tryLock(Object obj);

    void unlock(Object obj);

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static /* synthetic */ Object lock$default(Mutex mutex, Object obj, q60 q60Var, int i, Object obj2) {
            if (obj2 != null) {
                b81.s("Super calls with default arguments not supported in this target, function: lock");
                return null;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.lock(obj, q60Var);
        }

        public static /* synthetic */ boolean tryLock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                b81.s("Super calls with default arguments not supported in this target, function: tryLock");
                return false;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return mutex.tryLock(obj);
        }

        public static /* synthetic */ void unlock$default(Mutex mutex, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                b81.s("Super calls with default arguments not supported in this target, function: unlock");
                return;
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            mutex.unlock(obj);
        }

        @cc0
        public static /* synthetic */ void getOnLock$annotations() {
        }
    }
}
