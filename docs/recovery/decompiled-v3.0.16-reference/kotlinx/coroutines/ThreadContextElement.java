package kotlinx.coroutines;

import defpackage.da0;
import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface ThreadContextElement<S> extends w70 {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> threadContextElement, R r, pu0 pu0Var) {
            return (R) da0.u(threadContextElement, r, pu0Var);
        }

        public static <S, E extends w70> E get(ThreadContextElement<S> threadContextElement, x70 x70Var) {
            return (E) da0.v(threadContextElement, x70Var);
        }

        public static <S> y70 minusKey(ThreadContextElement<S> threadContextElement, x70 x70Var) {
            return da0.C(threadContextElement, x70Var);
        }

        public static <S> y70 plus(ThreadContextElement<S> threadContextElement, y70 y70Var) {
            return da0.E(y70Var, threadContextElement);
        }
    }

    @Override // defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    @Override // defpackage.w70
    /* synthetic */ x70 getKey();

    @Override // defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    @Override // defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);

    void restoreThreadContext(y70 y70Var, S s);

    S updateThreadContext(y70 y70Var);
}
