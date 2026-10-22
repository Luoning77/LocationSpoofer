package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.we2;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$1 extends k33 implements pu0 {
    final /* synthetic */ we2 $lastValue;
    final /* synthetic */ ReceiveChannel<mf3> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(we2 we2Var, ReceiveChannel<mf3> receiveChannel, q60 q60Var) {
        super(2, q60Var);
        this.$lastValue = we2Var;
        this.$ticker = receiveChannel;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, q60Var);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // defpackage.pu0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m73invokeWpGqRn0(((ChannelResult) obj).m58unboximpl(), (q60) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m73invokeWpGqRn0(Object obj, q60 q60Var) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(ChannelResult.m46boximpl(obj), q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        Object objM58unboximpl = ((ChannelResult) this.L$0).m58unboximpl();
        we2 we2Var = this.$lastValue;
        boolean z = objM58unboximpl instanceof ChannelResult.Failed;
        if (!z) {
            we2Var.e = objM58unboximpl;
        }
        ReceiveChannel<mf3> receiveChannel = this.$ticker;
        if (z) {
            Throwable thM50exceptionOrNullimpl = ChannelResult.m50exceptionOrNullimpl(objM58unboximpl);
            if (thM50exceptionOrNullimpl != null) {
                throw thM50exceptionOrNullimpl;
            }
            receiveChannel.cancel((CancellationException) new ChildCancelledException());
            we2Var.e = NullSurrogateKt.DONE;
        }
        return mf3.a;
    }
}
