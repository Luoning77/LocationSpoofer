package kotlinx.coroutines.flow.internal;

import defpackage.ee0;
import defpackage.fo;
import defpackage.j9;
import defpackage.k33;
import defpackage.mf3;
import defpackage.o51;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    protected final Flow<S> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends k33 implements pu0 {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlowOperator<S, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChannelFlowOperator<S, T> channelFlowOperator, q60 q60Var) {
            super(2, q60Var);
            this.this$0 = channelFlowOperator;
        }

        @Override // defpackage.oq
        public final q60 create(Object obj, q60 q60Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, q60Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.pu0
        public final Object invoke(FlowCollector<? super T> flowCollector, q60 q60Var) {
            return ((AnonymousClass2) create(flowCollector, q60Var)).invokeSuspend(mf3.a);
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                ee0.J(obj);
                FlowCollector<? super T> flowCollector = (FlowCollector) this.L$0;
                ChannelFlowOperator<S, T> channelFlowOperator = this.this$0;
                this.label = 1;
                Object objFlowCollect = channelFlowOperator.flowCollect(flowCollector, this);
                z70 z70Var = z70.e;
                if (objFlowCollect == z70Var) {
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
    public ChannelFlowOperator(Flow<? extends S> flow, y70 y70Var, int i, BufferOverflow bufferOverflow) {
        super(y70Var, i, bufferOverflow);
        this.flow = flow;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b A[RETURN] */
    public static <S, T> Object collect$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, FlowCollector<? super T> flowCollector, q60 q60Var) {
        Object objCollect;
        int i = channelFlowOperator.capacity;
        z70 z70Var = z70.e;
        if (i == -3) {
            y70 context = q60Var.getContext();
            y70 y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(context, channelFlowOperator.context);
            if (o51.f(y70VarNewCoroutineContext, context)) {
                Object objFlowCollect = channelFlowOperator.flowCollect(flowCollector, q60Var);
                if (objFlowCollect == z70Var) {
                    return objFlowCollect;
                }
            } else {
                j9 j9Var = j9.B;
                if (o51.f(y70VarNewCoroutineContext.get(j9Var), context.get(j9Var))) {
                    Object objCollectWithContextUndispatched = channelFlowOperator.collectWithContextUndispatched(flowCollector, y70VarNewCoroutineContext, q60Var);
                    if (objCollectWithContextUndispatched == z70Var) {
                        return objCollectWithContextUndispatched;
                    }
                } else {
                    objCollect = super.collect(flowCollector, q60Var);
                    if (objCollect == z70Var) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(flowCollector, q60Var);
            if (objCollect == z70Var) {
                return objCollect;
            }
        }
        return mf3.a;
    }

    public static <S, T> Object collectTo$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, ProducerScope<? super T> producerScope, q60 q60Var) {
        Object objFlowCollect = channelFlowOperator.flowCollect(new SendingCollector(producerScope), q60Var);
        return objFlowCollect == z70.e ? objFlowCollect : mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectWithContextUndispatched(FlowCollector<? super T> flowCollector, y70 y70Var, q60 q60Var) {
        return ChannelFlowKt.withContextUndispatched$default(y70Var, ChannelFlowKt.withUndispatchedContextCollector(flowCollector, q60Var.getContext()), null, new AnonymousClass2(this, null), q60Var, 4, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, q60 q60Var) {
        return collect$suspendImpl((ChannelFlowOperator) this, (FlowCollector) flowCollector, q60Var);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, q60 q60Var) {
        return collectTo$suspendImpl(this, producerScope, q60Var);
    }

    public abstract Object flowCollect(FlowCollector<? super T> flowCollector, q60 q60Var);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
