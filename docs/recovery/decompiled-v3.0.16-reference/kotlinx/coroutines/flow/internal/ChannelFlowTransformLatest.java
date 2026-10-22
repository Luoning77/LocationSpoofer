package kotlinx.coroutines.flow.internal;

import defpackage.ca0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.s90;
import defpackage.sj0;
import defpackage.we2;
import defpackage.y70;
import defpackage.z70;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    private final qu0 transform;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends k33 implements pu0 {
        final /* synthetic */ FlowCollector<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ FlowCollector<R> $collector;
            final /* synthetic */ we2 $previousFlow;
            final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
            @s90(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends k33 implements pu0 {
                final /* synthetic */ FlowCollector<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, T t, q60 q60Var) {
                    super(2, q60Var);
                    this.this$0 = channelFlowTransformLatest;
                    this.$collector = flowCollector;
                    this.$value = t;
                }

                @Override // defpackage.oq
                public final q60 create(Object obj, q60 q60Var) {
                    return new AnonymousClass2(this.this$0, this.$collector, this.$value, q60Var);
                }

                @Override // defpackage.pu0
                public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
                    return ((AnonymousClass2) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
                }

                @Override // defpackage.oq
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        ee0.J(obj);
                        qu0 qu0Var = ((ChannelFlowTransformLatest) this.this$0).transform;
                        FlowCollector<R> flowCollector = this.$collector;
                        T t = this.$value;
                        this.label = 1;
                        Object objInvoke = qu0Var.invoke(flowCollector, t, this);
                        z70 z70Var = z70.e;
                        if (objInvoke == z70Var) {
                            return z70Var;
                        }
                    } else {
                        if (i != 1) {
                            fo.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ee0.J(obj);
                    }
                    return mf3.a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(we2 we2Var, CoroutineScope coroutineScope, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector) {
                this.$previousFlow = we2Var;
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = channelFlowTransformLatest;
                this.$collector = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, q60 q60Var) {
                ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
                if (q60Var instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) q60Var;
                    int i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, q60Var);
                    }
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, q60Var);
                }
                Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
                int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                if (i2 == 0) {
                    ee0.J(obj);
                    Job job = (Job) this.$previousFlow.e;
                    if (job != null) {
                        job.cancel((CancellationException) new ChildCancelledException());
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = t;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = job;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                        Object objJoin = job.join(channelFlowTransformLatest$flowCollect$3$1$emit$1);
                        z70 z70Var = z70.e;
                        if (objJoin == z70Var) {
                            return z70Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        fo.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                    this = (AnonymousClass1) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                    ee0.J(obj);
                }
                this.$previousFlow.e = BuildersKt__Builders_commonKt.launch$default(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this.this$0, this.$collector, t, null), 1, null);
                return mf3.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, q60 q60Var) {
            super(2, q60Var);
            this.this$0 = channelFlowTransformLatest;
            this.$collector = flowCollector;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$collector, q60Var);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.pu0
        public final Object invoke(CoroutineScope coroutineScope, q60 q60Var) {
            return ((AnonymousClass3) create(coroutineScope, q60Var)).invokeSuspend(mf3.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                we2 we2Var = new we2();
                ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.this$0;
                Flow<S> flow = channelFlowTransformLatest.flow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(we2Var, coroutineScope, channelFlowTransformLatest, this.$collector);
                this.label = 1;
                Object objCollect = flow.collect(anonymousClass1, this);
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
            return mf3.a;
        }
    }

    public /* synthetic */ ChannelFlowTransformLatest(qu0 qu0Var, Flow flow, y70 y70Var, int i, BufferOverflow bufferOverflow, int i2, ca0 ca0Var) {
        this(qu0Var, flow, (i2 & 4) != 0 ? sj0.e : y70Var, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<R> create(y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.transform, this.flow, y70Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object flowCollect(FlowCollector<? super R> flowCollector, q60 q60Var) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass3(this, flowCollector, null), q60Var);
        return objCoroutineScope == z70.e ? objCoroutineScope : mf3.a;
    }

    public ChannelFlowTransformLatest(qu0 qu0Var, Flow<? extends T> flow, y70 y70Var, int i, BufferOverflow bufferOverflow) {
        super(flow, y70Var, i, bufferOverflow);
        this.transform = qu0Var;
    }
}
