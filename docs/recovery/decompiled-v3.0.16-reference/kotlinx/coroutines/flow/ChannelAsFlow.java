package kotlinx.coroutines.flow;

import defpackage.ca0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.q60;
import defpackage.sj0;
import defpackage.y70;
import defpackage.z70;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ChannelAsFlow<T> extends ChannelFlow<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed$volatile");
    private final ReceiveChannel<T> channel;
    private final boolean consume;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ ChannelAsFlow(ReceiveChannel receiveChannel, boolean z, y70 y70Var, int i, BufferOverflow bufferOverflow, int i2, ca0 ca0Var) {
        this(receiveChannel, z, (i2 & 4) != 0 ? sj0.e : y70Var, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private final void markConsumed() {
        if (this.consume && consumed$volatile$FU.getAndSet(this, 1) == 1) {
            fo.n("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    private final /* synthetic */ void setConsumed$volatile(int i) {
        this.consumed$volatile = i;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String additionalToStringProps() {
        return "channel=" + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
        int i = this.capacity;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        if (i != -3) {
            Object objCollect = super.collect(flowCollector, q60Var);
            return objCollect == z70Var ? objCollect : mf3Var;
        }
        markConsumed();
        Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(flowCollector, this.channel, this.consume, q60Var);
        return objEmitAllImpl$FlowKt__ChannelsKt == z70Var ? objEmitAllImpl$FlowKt__ChannelsKt : mf3Var;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, q60 q60Var) {
        Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(new SendingCollector(producerScope), this.channel, this.consume, q60Var);
        return objEmitAllImpl$FlowKt__ChannelsKt == z70.e ? objEmitAllImpl$FlowKt__ChannelsKt : mf3.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.channel, this.consume, y70Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow<T> dropChannelOperators() {
        return new ChannelAsFlow(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        markConsumed();
        return this.capacity == -3 ? this.channel : super.produceImpl(coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsFlow(ReceiveChannel<? extends T> receiveChannel, boolean z, y70 y70Var, int i, BufferOverflow bufferOverflow) {
        super(y70Var, i, bufferOverflow);
        this.channel = receiveChannel;
        this.consume = z;
    }
}
