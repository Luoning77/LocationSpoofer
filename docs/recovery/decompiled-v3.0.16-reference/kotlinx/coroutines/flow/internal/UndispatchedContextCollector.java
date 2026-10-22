package kotlinx.coroutines.flow.internal;

import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class UndispatchedContextCollector<T> implements FlowCollector<T> {
    private final Object countOrElement;
    private final y70 emitContext;
    private final pu0 emitRef;

    public UndispatchedContextCollector(FlowCollector<? super T> flowCollector, y70 y70Var) {
        this.emitContext = y70Var;
        this.countOrElement = ThreadContextKt.threadContextElements(y70Var);
        this.emitRef = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, q60 q60Var) {
        Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(this.emitContext, t, this.countOrElement, this.emitRef, q60Var);
        return objWithContextUndispatched == z70.e ? objWithContextUndispatched : mf3.a;
    }
}
