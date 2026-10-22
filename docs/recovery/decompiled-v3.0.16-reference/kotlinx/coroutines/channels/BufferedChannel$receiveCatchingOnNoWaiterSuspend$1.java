package kotlinx.coroutines.channels;

import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends r60 {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, q60 q60Var) {
        super(q60Var);
        this.this$0 = bufferedChannel;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM37receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m37receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM37receiveCatchingOnNoWaiterSuspendGKJJFZk == z70.e ? objM37receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m46boximpl(objM37receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
