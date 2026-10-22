package kotlinx.coroutines.flow.internal;

import defpackage.ca0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.sj0;
import defpackage.y70;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    private final Iterable<Flow<T>> flows;

    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, y70 y70Var, int i, BufferOverflow bufferOverflow, int i2, ca0 ca0Var) {
        this(iterable, (i2 & 2) != 0 ? sj0.e : y70Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, q60 q60Var) {
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        Iterator<Flow<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new ChannelLimitedFlowMerge$collectTo$2$1(it.next(), sendingCollector, null), 3, null);
        }
        return mf3.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.flows, y70Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce(coroutineScope, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelLimitedFlowMerge(Iterable<? extends Flow<? extends T>> iterable, y70 y70Var, int i, BufferOverflow bufferOverflow) {
        super(y70Var, i, bufferOverflow);
        this.flows = iterable;
    }
}
