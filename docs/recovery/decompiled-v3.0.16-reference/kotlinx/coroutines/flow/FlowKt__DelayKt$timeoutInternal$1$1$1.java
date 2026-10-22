package kotlinx.coroutines.flow;

import defpackage.ee0;
import defpackage.fo;
import defpackage.k33;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.s90;
import defpackage.z70;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends k33 implements pu0 {
    final /* synthetic */ FlowCollector<T> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector<? super T> flowCollector, q60 q60Var) {
        super(2, q60Var);
        this.$downStream = flowCollector;
    }

    @Override // defpackage.oq
    public final q60 create(Object obj, q60 q60Var) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, q60Var);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // defpackage.pu0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m74invokeWpGqRn0(((ChannelResult) obj).m58unboximpl(), (q60) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m74invokeWpGqRn0(Object obj, q60 q60Var) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(ChannelResult.m46boximpl(obj), q60Var)).invokeSuspend(mf3.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM58unboximpl;
        Object obj2;
        Throwable thM50exceptionOrNullimpl;
        int i = this.label;
        if (i == 0) {
            ee0.J(obj);
            objM58unboximpl = ((ChannelResult) this.L$0).m58unboximpl();
            FlowCollector<T> flowCollector = this.$downStream;
            if (!(objM58unboximpl instanceof ChannelResult.Failed)) {
                this.L$0 = objM58unboximpl;
                this.label = 1;
                Object objEmit = flowCollector.emit((T) objM58unboximpl, this);
                z70 z70Var = z70.e;
                if (objEmit == z70Var) {
                    return z70Var;
                }
                obj2 = objM58unboximpl;
            }
            if (objM58unboximpl instanceof ChannelResult.Closed) {
                return Boolean.TRUE;
            }
            thM50exceptionOrNullimpl = ChannelResult.m50exceptionOrNullimpl(objM58unboximpl);
            if (thM50exceptionOrNullimpl == null) {
                return Boolean.FALSE;
            }
            throw thM50exceptionOrNullimpl;
        }
        if (i != 1) {
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj2 = this.L$0;
        ee0.J(obj);
        objM58unboximpl = obj2;
        if (objM58unboximpl instanceof ChannelResult.Closed) {
            return Boolean.TRUE;
        }
        thM50exceptionOrNullimpl = ChannelResult.m50exceptionOrNullimpl(objM58unboximpl);
        if (thM50exceptionOrNullimpl == null) {
            return Boolean.FALSE;
        }
        throw thM50exceptionOrNullimpl;
    }
}
