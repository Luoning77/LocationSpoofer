package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.we2;
import defpackage.z70;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends k33 implements pu0 {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ we2 $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$2(we2 we2Var, FlowCollector<? super T> flowCollector, q60 q60Var) {
        super(2, q60Var);
        this.$lastValue = we2Var;
        this.$downstream = flowCollector;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, q60Var);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // defpackage.pu0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m72invokeWpGqRn0(((ChannelResult) obj).m58unboximpl(), (q60) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m72invokeWpGqRn0(Object obj, q60 q60Var) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(ChannelResult.m46boximpl(obj), q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        we2 we2Var;
        we2 we2Var2;
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            Object objM58unboximpl = ((ChannelResult) this.L$0).m58unboximpl();
            we2Var = this.$lastValue;
            boolean z = objM58unboximpl instanceof ChannelResult.Failed;
            if (!z) {
                we2Var.e = objM58unboximpl;
            }
            FlowCollector<T> flowCollector = this.$downstream;
            if (z) {
                Throwable thM50exceptionOrNullimpl = ChannelResult.m50exceptionOrNullimpl(objM58unboximpl);
                if (thM50exceptionOrNullimpl != null) {
                    throw thM50exceptionOrNullimpl;
                }
                Object obj2 = we2Var.e;
                if (obj2 != null) {
                    Object obj3 = obj2 != NullSurrogateKt.NULL ? obj2 : null;
                    this.L$0 = objM58unboximpl;
                    this.L$1 = we2Var;
                    this.label = 1;
                    Object objEmit = flowCollector.emit((T) obj3, this);
                    z70 z70Var = z70.e;
                    if (objEmit == z70Var) {
                        return z70Var;
                    }
                    we2Var2 = we2Var;
                }
                we2Var.e = NullSurrogateKt.DONE;
            }
            return mf3.a;
        }
        if (i != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        we2Var2 = (we2) this.L$1;
        ee0.J(obj);
        we2Var = we2Var2;
        we2Var.e = NullSurrogateKt.DONE;
        return mf3.a;
    }
}
