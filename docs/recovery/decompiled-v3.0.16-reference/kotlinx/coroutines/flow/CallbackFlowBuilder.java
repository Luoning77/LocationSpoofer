package kotlinx.coroutines.flow;

import defpackage.ca0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.sj0;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class CallbackFlowBuilder<T> extends ChannelFlowBuilder<T> {
    private final pu0 block;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    @s90(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class AnonymousClass1 extends r60 {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CallbackFlowBuilder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CallbackFlowBuilder<T> callbackFlowBuilder, q60 q60Var) {
            super(q60Var);
            this.this$0 = callbackFlowBuilder;
        }

        @Override // defpackage.oq
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collectTo(null, this);
        }
    }

    public /* synthetic */ CallbackFlowBuilder(pu0 pu0Var, y70 y70Var, int i, BufferOverflow bufferOverflow, int i2, ca0 ca0Var) {
        this(pu0Var, (i2 & 2) != 0 ? sj0.e : y70Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, q60 q60Var) {
        AnonymousClass1 anonymousClass1;
        if (q60Var instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) q60Var;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, q60Var);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, q60Var);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ee0.J(obj);
            anonymousClass1.L$0 = producerScope;
            anonymousClass1.label = 1;
            Object objCollectTo = super.collectTo(producerScope, anonymousClass1);
            z70 z70Var = z70.e;
            if (objCollectTo == z70Var) {
                return z70Var;
            }
        } else {
            if (i2 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            producerScope = (ProducerScope) anonymousClass1.L$0;
            ee0.J(obj);
        }
        if (producerScope.isClosedForSend()) {
            return mf3.a;
        }
        fo.n("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(y70 y70Var, int i, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.block, y70Var, i, bufferOverflow);
    }

    public CallbackFlowBuilder(pu0 pu0Var, y70 y70Var, int i, BufferOverflow bufferOverflow) {
        super(pu0Var, y70Var, i, bufferOverflow);
        this.block = pu0Var;
    }
}
