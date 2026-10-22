package kotlinx.coroutines.flow;

import defpackage.lu0;
import defpackage.y70;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class StateFlowKt {
    private static final Symbol NONE = new Symbol("NONE");
    private static final Symbol PENDING = new Symbol("PENDING");

    public static final <T> MutableStateFlow<T> MutableStateFlow(T t) {
        if (t == null) {
            t = (T) NullSurrogateKt.NULL;
        }
        return new StateFlowImpl(t);
    }

    public static final <T> Flow<T> fuseStateFlow(StateFlow<? extends T> stateFlow, y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? SharedFlowKt.fuseSharedFlow(stateFlow, y70Var, i, bufferOverflow) : stateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T getAndUpdate(MutableStateFlow<T> mutableStateFlow, lu0 lu0Var) {
        T t;
        do {
            t = (T) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(t, lu0Var.invoke(t)));
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(MutableStateFlow<T> mutableStateFlow, lu0 lu0Var) {
        Object value;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, lu0Var.invoke(value)));
    }

    public static final <T> T updateAndGet(MutableStateFlow<T> mutableStateFlow, lu0 lu0Var) {
        T value;
        T t;
        do {
            value = mutableStateFlow.getValue();
            t = (T) lu0Var.invoke(value);
        } while (!mutableStateFlow.compareAndSet(value, t));
        return t;
    }
}
