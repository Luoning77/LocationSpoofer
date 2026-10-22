package kotlinx.coroutines;

import defpackage.da0;
import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface CoroutineExceptionHandler extends w70 {
    public static final Key Key = Key.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <R> R fold(CoroutineExceptionHandler coroutineExceptionHandler, R r, pu0 pu0Var) {
            return (R) da0.u(coroutineExceptionHandler, r, pu0Var);
        }

        public static <E extends w70> E get(CoroutineExceptionHandler coroutineExceptionHandler, x70 x70Var) {
            return (E) da0.v(coroutineExceptionHandler, x70Var);
        }

        public static y70 minusKey(CoroutineExceptionHandler coroutineExceptionHandler, x70 x70Var) {
            return da0.C(coroutineExceptionHandler, x70Var);
        }

        public static y70 plus(CoroutineExceptionHandler coroutineExceptionHandler, y70 y70Var) {
            return da0.E(y70Var, coroutineExceptionHandler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Key implements x70 {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    @Override // defpackage.w70
    /* synthetic */ x70 getKey();

    void handleException(y70 y70Var, Throwable th);

    @Override // defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    @Override // defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);
}
