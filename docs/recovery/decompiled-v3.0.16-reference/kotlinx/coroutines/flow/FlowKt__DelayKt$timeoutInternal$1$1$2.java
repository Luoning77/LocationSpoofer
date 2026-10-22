package kotlinx.coroutines.flow;

import defpackage.ah0;
import defpackage.ee0;
import defpackage.k33;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.s90;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends k33 implements lu0 {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, q60 q60Var) {
        super(1, q60Var);
        this.$timeout = j;
    }

    @Override // defpackage.oq
    public final q60 create(q60 q60Var) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, q60Var);
    }

    @Override // defpackage.lu0
    public final Object invoke(q60 q60Var) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(q60Var)).invokeSuspend(mf3.a);
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ee0.J(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) ah0.i(this.$timeout)));
    }
}
