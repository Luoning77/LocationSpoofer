package kotlinx.coroutines.flow;

import defpackage.q60;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(T t, q60 q60Var);

    StateFlow<Integer> getSubscriptionCount();

    void resetReplayCache();

    boolean tryEmit(T t);
}
