package kotlinx.coroutines;

import defpackage.cc0;
import defpackage.pu0;
import defpackage.sj0;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class GuidanceKt {
    @cc0
    public static final <T> Deferred<T> async(y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ Deferred async$default(y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return async(y70Var, coroutineStart, pu0Var);
    }

    @cc0
    public static final Job launch(y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var) {
        throw new UnsupportedOperationException("Should never be called, was introduced to help with incomplete code");
    }

    public static /* synthetic */ Job launch$default(y70 y70Var, CoroutineStart coroutineStart, pu0 pu0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launch(y70Var, coroutineStart, pu0Var);
    }
}
