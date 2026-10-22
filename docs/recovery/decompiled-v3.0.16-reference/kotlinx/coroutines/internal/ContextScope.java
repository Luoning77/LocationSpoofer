package kotlinx.coroutines.internal;

import defpackage.y70;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ContextScope implements CoroutineScope {
    private final y70 coroutineContext;

    public ContextScope(y70 y70Var) {
        this.coroutineContext = y70Var;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public y70 getCoroutineContext() {
        return this.coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
