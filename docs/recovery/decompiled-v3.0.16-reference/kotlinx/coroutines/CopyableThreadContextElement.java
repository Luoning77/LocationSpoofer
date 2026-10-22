package kotlinx.coroutines;

import defpackage.pu0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <S, R> R fold(CopyableThreadContextElement<S> copyableThreadContextElement, R r, pu0 pu0Var) {
            return (R) ThreadContextElement.DefaultImpls.fold(copyableThreadContextElement, r, pu0Var);
        }

        public static <S, E extends w70> E get(CopyableThreadContextElement<S> copyableThreadContextElement, x70 x70Var) {
            return (E) ThreadContextElement.DefaultImpls.get(copyableThreadContextElement, x70Var);
        }

        public static <S> y70 minusKey(CopyableThreadContextElement<S> copyableThreadContextElement, x70 x70Var) {
            return ThreadContextElement.DefaultImpls.minusKey(copyableThreadContextElement, x70Var);
        }

        public static <S> y70 plus(CopyableThreadContextElement<S> copyableThreadContextElement, y70 y70Var) {
            return ThreadContextElement.DefaultImpls.plus(copyableThreadContextElement, y70Var);
        }
    }

    CopyableThreadContextElement<S> copyForChild();

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.y70
    /* synthetic */ Object fold(Object obj, pu0 pu0Var);

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.y70
    /* synthetic */ w70 get(x70 x70Var);

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.w70
    /* synthetic */ x70 getKey();

    y70 mergeForChild(w70 w70Var);

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.y70
    /* synthetic */ y70 minusKey(x70 x70Var);

    @Override // kotlinx.coroutines.ThreadContextElement, defpackage.y70
    /* synthetic */ y70 plus(y70 y70Var);
}
