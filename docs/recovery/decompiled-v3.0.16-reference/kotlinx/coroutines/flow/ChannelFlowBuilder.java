package kotlinx.coroutines.flow;

import defpackage.ca0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.sj0;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
class ChannelFlowBuilder<T> extends ChannelFlow<T> {
    private final pu0 block;

    public /* synthetic */ ChannelFlowBuilder(pu0 pu0Var, y70 y70Var, int i, BufferOverflow bufferOverflow, int i2, ca0 ca0Var) {
        this(pu0Var, (i2 & 2) != 0 ? sj0.e : y70Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static <T> Object collectTo$suspendImpl(ChannelFlowBuilder<T> channelFlowBuilder, ProducerScope<? super T> producerScope, q60 q60Var) {
        Object objInvoke = ((ChannelFlowBuilder) channelFlowBuilder).block.invoke(producerScope, q60Var);
        return objInvoke == z70.e ? objInvoke : mf3.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, q60 q60Var) {
        return collectTo$suspendImpl(this, producerScope, q60Var);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowBuilder(this.block, y70Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    public ChannelFlowBuilder(pu0 pu0Var, y70 y70Var, int i, BufferOverflow bufferOverflow) {
        super(y70Var, i, bufferOverflow);
        this.block = pu0Var;
    }
}
