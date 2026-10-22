package kotlinx.coroutines.flow.internal;

import defpackage.ca0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.sj0;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    private final int concurrency;
    private final Flow<Flow<T>> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ SendingCollector<T> $collector;
        final /* synthetic */ Job $job;
        final /* synthetic */ ProducerScope<T> $scope;
        final /* synthetic */ Semaphore $semaphore;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        @s90(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", l = {65}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends k33 implements pu0 {
            final /* synthetic */ SendingCollector<T> $collector;
            final /* synthetic */ Flow<T> $inner;
            final /* synthetic */ Semaphore $semaphore;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T> flow, SendingCollector<T> sendingCollector, Semaphore semaphore, q60 q60Var) {
                super(2, q60Var);
                this.$inner = flow;
                this.$collector = sendingCollector;
                this.$semaphore = semaphore;
            }

            @Override // defpackage.oq
            public final q60 create(Object obj, q60 q60Var) {
                return new AnonymousClass1(this.$inner, this.$collector, this.$semaphore, q60Var);
            }

            @Override // defpackage.pu0
            public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
                return ((AnonymousClass1) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, mf3] */
            @Override // defpackage.oq
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                try {
                    if (i == 0) {
                        ee0.J(obj);
                        Flow<T> flow = this.$inner;
                        SendingCollector<T> sendingCollector = this.$collector;
                        this.label = 1;
                        Object objCollect = flow.collect(sendingCollector, this);
                        z70 z70Var = z70.e;
                        if (objCollect == z70Var) {
                            return z70Var;
                        }
                    } else {
                        if (i != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    this.$semaphore.release();
                    this = mf3.a;
                    return this;
                } catch (Throwable th) {
                    this.$semaphore.release();
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Job job, Semaphore semaphore, ProducerScope<? super T> producerScope, SendingCollector<T> sendingCollector) {
            this.$job = job;
            this.$semaphore = semaphore;
            this.$scope = producerScope;
            this.$collector = sendingCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Flow<? extends T> flow, q60 q60Var) {
            ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
            if (q60Var instanceof ChannelFlowMerge$collectTo$2$emit$1) {
                channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) q60Var;
                int i = channelFlowMerge$collectTo$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelFlowMerge$collectTo$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, q60Var);
                }
            } else {
                channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, q60Var);
            }
            Object obj = channelFlowMerge$collectTo$2$emit$1.result;
            int i2 = channelFlowMerge$collectTo$2$emit$1.label;
            if (i2 == 0) {
                ee0.J(obj);
                Job job = this.$job;
                if (job != null) {
                    JobKt.ensureActive(job);
                }
                Semaphore semaphore = this.$semaphore;
                channelFlowMerge$collectTo$2$emit$1.L$0 = this;
                channelFlowMerge$collectTo$2$emit$1.L$1 = flow;
                channelFlowMerge$collectTo$2$emit$1.label = 1;
                Object objAcquire = semaphore.acquire(channelFlowMerge$collectTo$2$emit$1);
                z70 z70Var = z70.e;
                if (objAcquire == z70Var) {
                    return z70Var;
                }
            } else {
                if (i2 != 1) {
                    fo.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                flow = (Flow) channelFlowMerge$collectTo$2$emit$1.L$1;
                this = (AnonymousClass2) channelFlowMerge$collectTo$2$emit$1.L$0;
                ee0.J(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass1(flow, this.$collector, this.$semaphore, null), 3, null);
            return mf3.a;
        }
    }

    public /* synthetic */ ChannelFlowMerge(Flow flow, int i, y70 y70Var, int i2, BufferOverflow bufferOverflow, int i3, ca0 ca0Var) {
        this(flow, i, (i3 & 4) != 0 ? sj0.e : y70Var, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String additionalToStringProps() {
        return "concurrency=" + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, q60 q60Var) {
        Object objCollect = this.flow.collect(new AnonymousClass2((Job) q60Var.getContext().get(Job.Key), SemaphoreKt.Semaphore$default(this.concurrency, 0, 2, null), producerScope, new SendingCollector(producerScope)), q60Var);
        return objCollect == z70.e ? objCollect : mf3.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.flow, this.concurrency, y70Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce(coroutineScope, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(Flow<? extends Flow<? extends T>> flow, int i, y70 y70Var, int i2, BufferOverflow bufferOverflow) {
        super(y70Var, i2, bufferOverflow);
        this.flow = flow;
        this.concurrency = i;
    }
}
