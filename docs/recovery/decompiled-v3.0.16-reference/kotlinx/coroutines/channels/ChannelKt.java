package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.fo;
import defpackage.lu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ChannelKt {
    public static final <E> Channel<E> Channel(int i, BufferOverflow bufferOverflow, lu0 lu0Var) {
        if (i == -2) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), lu0Var) : new ConflatedBufferedChannel(1, bufferOverflow, lu0Var);
        }
        if (i == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, lu0Var);
            }
            fo.i("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, lu0Var) : new ConflatedBufferedChannel(1, bufferOverflow, lu0Var);
        }
        if (i != Integer.MAX_VALUE) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i, lu0Var) : new ConflatedBufferedChannel(i, bufferOverflow, lu0Var);
        }
        return new BufferedChannel(Integer.MAX_VALUE, lu0Var);
    }

    public static /* synthetic */ Channel Channel$default(int i, BufferOverflow bufferOverflow, lu0 lu0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lu0Var = null;
        }
        return Channel(i, bufferOverflow, lu0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m42getOrElseWpGqRn0(Object obj, lu0 lu0Var) {
        return obj instanceof ChannelResult.Failed ? (T) lu0Var.invoke(ChannelResult.m50exceptionOrNullimpl(obj)) : obj;
    }

    /* JADX INFO: renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> Object m43onClosedWpGqRn0(Object obj, lu0 lu0Var) {
        if (obj instanceof ChannelResult.Closed) {
            lu0Var.invoke(ChannelResult.m50exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* JADX INFO: renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> Object m44onFailureWpGqRn0(Object obj, lu0 lu0Var) {
        if (obj instanceof ChannelResult.Failed) {
            lu0Var.invoke(ChannelResult.m50exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* JADX INFO: renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> Object m45onSuccessWpGqRn0(Object obj, lu0 lu0Var) {
        if (!(obj instanceof ChannelResult.Failed)) {
            lu0Var.invoke(obj);
        }
        return obj;
    }

    public static /* synthetic */ Channel Channel$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return Channel(i);
    }

    @cc0
    public static final /* synthetic */ Channel Channel(int i) {
        return Channel$default(i, null, null, 6, null);
    }
}
