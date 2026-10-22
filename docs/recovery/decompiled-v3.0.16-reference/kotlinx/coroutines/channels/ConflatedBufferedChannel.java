package kotlinx.coroutines.channels;

import defpackage.b81;
import defpackage.ca0;
import defpackage.fo;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.p91;
import defpackage.q60;
import defpackage.vd0;
import defpackage.xe2;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, lu0 lu0Var) {
        super(i, lu0Var);
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            b81.r(xe2.a(BufferedChannel.class).c(), "This implementation does not support suspension for senders, use ", " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        fo.f(p91.m(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    public static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e, q60 q60Var) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objM63trySendImplMj0NB7M = conflatedBufferedChannel.m63trySendImplMj0NB7M(e, true);
        if (!(objM63trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return mf3.a;
        }
        ChannelResult.m50exceptionOrNullimpl(objM63trySendImplMj0NB7M);
        lu0 lu0Var = conflatedBufferedChannel.onUndeliveredElement;
        if (lu0Var == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lu0Var, e, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        vd0.d(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    public static <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e, q60 q60Var) {
        Object objM63trySendImplMj0NB7M = conflatedBufferedChannel.m63trySendImplMj0NB7M(e, true);
        if (objM63trySendImplMj0NB7M instanceof ChannelResult.Failed) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m62trySendDropLatestMj0NB7M(E e, boolean z) {
        lu0 lu0Var;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objMo32trySendJP2dKIU = super.mo32trySendJP2dKIU(e);
        if (ChannelResult.m56isSuccessimpl(objMo32trySendJP2dKIU) || ChannelResult.m54isClosedimpl(objMo32trySendJP2dKIU)) {
            return objMo32trySendJP2dKIU;
        }
        if (!z || (lu0Var = this.onUndeliveredElement) == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lu0Var, e, null, 2, null)) == null) {
            return ChannelResult.Companion.m61successJP2dKIU(mf3.a);
        }
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    /* JADX INFO: renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m63trySendImplMj0NB7M(E e, boolean z) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m62trySendDropLatestMj0NB7M(e, z) : m40trySendDropOldestJP2dKIU(e);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        Object objMo32trySendJP2dKIU = mo32trySendJP2dKIU(obj);
        if (!(objMo32trySendJP2dKIU instanceof ChannelResult.Failed)) {
            selectInstance.selectInRegistrationPhase(mf3.a);
        } else if (!(objMo32trySendJP2dKIU instanceof ChannelResult.Closed)) {
            fo.n("unreachable");
        } else {
            ChannelResult.m50exceptionOrNullimpl(objMo32trySendJP2dKIU);
            selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e, q60 q60Var) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e, q60Var);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E e, q60 q60Var) {
        return sendBroadcast$suspendImpl((ConflatedBufferedChannel) this, (Object) e, q60Var);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo32trySendJP2dKIU(E e) {
        return m63trySendImplMj0NB7M(e, false);
    }

    public /* synthetic */ ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, lu0 lu0Var, int i2, ca0 ca0Var) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : lu0Var);
    }
}
