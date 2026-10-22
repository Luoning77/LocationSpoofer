package kotlinx.coroutines.flow.internal;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
public final class ChannelFlow$collectToFun$1 extends k33 implements pu0 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(ChannelFlow<T> channelFlow, q60 q60Var) {
        super(2, q60Var);
        this.this$0 = channelFlow;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.this$0, q60Var);
        channelFlow$collectToFun$1.L$0 = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // defpackage.pu0
    public final Object invoke(ProducerScope<? super T> producerScope, q60 q60Var) {
        return ((ChannelFlow$collectToFun$1) create(producerScope, q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            ChannelFlow<T> channelFlow = this.this$0;
            this.label = 1;
            Object objCollectTo = channelFlow.collectTo((ProducerScope<? super T>) producerScope, this);
            z70 z70Var = z70.e;
            if (objCollectTo == z70Var) {
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
