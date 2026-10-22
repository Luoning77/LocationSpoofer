package kotlinx.coroutines.channels;

import defpackage.q60;
import defpackage.r60;
import defpackage.s90;
import defpackage.z70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@s90(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
public final class BufferedChannel$receiveCatching$1<E> extends r60 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, q60 q60Var) {
        super(q60Var);
        this.this$0 = bufferedChannel;
    }

    @Override // defpackage.oq
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM36receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m36receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return objM36receiveCatchingJP2dKIU$suspendImpl == z70.e ? objM36receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m46boximpl(objM36receiveCatchingJP2dKIU$suspendImpl);
    }
}
