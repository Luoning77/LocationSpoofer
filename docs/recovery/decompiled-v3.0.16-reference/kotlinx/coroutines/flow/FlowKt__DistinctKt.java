package kotlinx.coroutines.flow;

import defpackage.da0;
import defpackage.lu0;
import defpackage.pu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final /* synthetic */ class FlowKt__DistinctKt {
    private static final lu0 defaultKeySelector = new c(0);
    private static final pu0 defaultAreEquivalent = new d();

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return flow instanceof StateFlow ? flow : distinctUntilChangedBy$FlowKt__DistinctKt(flow, defaultKeySelector, defaultAreEquivalent);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, lu0 lu0Var) {
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, lu0Var, defaultAreEquivalent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Flow<T> distinctUntilChangedBy$FlowKt__DistinctKt(Flow<? extends T> flow, lu0 lu0Var, pu0 pu0Var) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.keySelector == lu0Var && distinctFlowImpl.areEquivalent == pu0Var) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, lu0Var, pu0Var);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, pu0 pu0Var) {
        lu0 lu0Var = defaultKeySelector;
        pu0Var.getClass();
        da0.o(2, pu0Var);
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, lu0Var, pu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object defaultKeySelector$lambda$0$FlowKt__DistinctKt(Object obj) {
        return obj;
    }
}
