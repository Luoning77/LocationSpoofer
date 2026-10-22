package kotlinx.coroutines.flow.internal;

import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.z70;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class FlowCoroutineKt {
    public static final <R> Object flowScope(pu0 pu0Var, q60 q60Var) {
        FlowCoroutine flowCoroutine = new FlowCoroutine(q60Var.getContext(), q60Var);
        return UndispatchedKt.startUndispatchedOrReturn(flowCoroutine, flowCoroutine, pu0Var);
    }

    public static final <R> Flow<R> scopedFlow(final qu0 qu0Var) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, q60 q60Var) {
                Object objFlowScope = FlowCoroutineKt.flowScope(new FlowCoroutineKt$scopedFlow$1$1(qu0Var, flowCollector, null), q60Var);
                return objFlowScope == z70.e ? objFlowScope : mf3.a;
            }
        };
    }
}
