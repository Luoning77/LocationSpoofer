package kotlinx.coroutines.flow.internal;

import defpackage.ca0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.sj0;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ChannelFlowOperatorImpl<T> extends ChannelFlowOperator<T, T> {
    public /* synthetic */ ChannelFlowOperatorImpl(Flow flow, y70 y70Var, int i, BufferOverflow bufferOverflow, int i2, ca0 ca0Var) {
        this(flow, (i2 & 2) != 0 ? sj0.e : y70Var, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowOperatorImpl(this.flow, y70Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow<T> dropChannelOperators() {
        return (Flow<T>) this.flow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object flowCollect(FlowCollector<? super T> flowCollector, q60 q60Var) {
        Object objCollect = this.flow.collect((FlowCollector<? super S>) flowCollector, q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }

    public ChannelFlowOperatorImpl(Flow<? extends T> flow, y70 y70Var, int i, BufferOverflow bufferOverflow) {
        super(flow, y70Var, i, bufferOverflow);
    }
}
