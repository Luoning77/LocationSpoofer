package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.da0;
import defpackage.hd0;
import defpackage.mf3;
import defpackage.pu0;
import defpackage.q60;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class LazyActorCoroutine<E> extends ActorCoroutine<E> {
    private q60 continuation;

    public LazyActorCoroutine(y70 y70Var, Channel<E> channel, pu0 pu0Var) {
        super(y70Var, channel, false);
        this.continuation = hd0.r(pu0Var, this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSendRegFunction(SelectInstance<?> selectInstance, Object obj) throws Throwable {
        onStart();
        super.getOnSend().getRegFunc().invoke(this, selectInstance, obj);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        boolean zClose = super.close(th);
        start();
        return zClose;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.INSTANCE;
        lazyActorCoroutine$onSend$1.getClass();
        da0.o(3, lazyActorCoroutine$onSend$1);
        return new SelectClause2Impl(this, lazyActorCoroutine$onSend$1, super.getOnSend().getProcessResFunc(), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    @cc0
    public boolean offer(E e) {
        start();
        return super.offer(e);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public Object send(E e, q60 q60Var) {
        start();
        Object objSend = super.send(e, q60Var);
        return objSend == z70.e ? objSend : mf3.a;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo32trySendJP2dKIU(E e) {
        start();
        return super.mo32trySendJP2dKIU(e);
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }
}
