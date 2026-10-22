package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.lu0;
import defpackage.q60;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.selects.SelectClause2;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {
    private final BroadcastChannelImpl<E> broadcast;

    public ConflatedBroadcastChannel() {
        this(new BroadcastChannelImpl(-1));
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @cc0
    public /* synthetic */ boolean cancel(Throwable th) {
        return this.broadcast.cancel(th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return this.broadcast.close(th);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this.broadcast.getOnSend();
    }

    public final E getValue() {
        return this.broadcast.getValue();
    }

    public final E getValueOrNull() {
        return this.broadcast.getValueOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(lu0 lu0Var) {
        this.broadcast.invokeOnClose(lu0Var);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.broadcast.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @cc0
    public boolean offer(E e) {
        return this.broadcast.offer(e);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        return this.broadcast.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e, q60 q60Var) {
        return this.broadcast.send(e, q60Var);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo32trySendJP2dKIU(E e) {
        return this.broadcast.mo32trySendJP2dKIU(e);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(CancellationException cancellationException) {
        this.broadcast.cancel(cancellationException);
    }

    private ConflatedBroadcastChannel(BroadcastChannelImpl<E> broadcastChannelImpl) {
        this.broadcast = broadcastChannelImpl;
    }

    public ConflatedBroadcastChannel(E e) {
        this();
        mo32trySendJP2dKIU(e);
    }
}
