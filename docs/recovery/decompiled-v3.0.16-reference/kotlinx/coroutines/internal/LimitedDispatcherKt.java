package kotlinx.coroutines.internal;

import defpackage.fo;
import defpackage.p91;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i) {
        if (i >= 1) {
            return;
        }
        fo.f(p91.l(i, "Expected positive parallelism level, but got "));
    }

    public static final CoroutineDispatcher namedOrThis(CoroutineDispatcher coroutineDispatcher, String str) {
        return str != null ? new NamedDispatcher(coroutineDispatcher, str) : coroutineDispatcher;
    }
}
