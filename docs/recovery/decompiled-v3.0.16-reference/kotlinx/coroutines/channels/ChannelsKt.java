package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.i52;
import defpackage.lu0;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.y70;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ChannelsKt {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th) {
        ChannelsKt__Channels_commonKt.cancelConsumed(receiveChannel, th);
    }

    @cc0
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, lu0 lu0Var) {
        return (R) ChannelsKt__DeprecatedKt.consume(broadcastChannel, lu0Var);
    }

    @cc0
    public static final <E> Object consumeEach(BroadcastChannel<E> broadcastChannel, lu0 lu0Var, q60 q60Var) {
        return ChannelsKt__DeprecatedKt.consumeEach(broadcastChannel, lu0Var, q60Var);
    }

    public static final lu0 consumes(ReceiveChannel<?> receiveChannel) {
        return ChannelsKt__DeprecatedKt.consumes(receiveChannel);
    }

    public static final lu0 consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.consumesAll(receiveChannelArr);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ChannelsKt__DeprecatedKt.distinctBy(receiveChannel, y70Var, pu0Var);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ChannelsKt__DeprecatedKt.filter(receiveChannel, y70Var, pu0Var);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__DeprecatedKt.filterNotNull(receiveChannel);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, y70 y70Var, pu0 pu0Var) {
        return ChannelsKt__DeprecatedKt.map(receiveChannel, y70Var, pu0Var);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, y70 y70Var, qu0 qu0Var) {
        return ChannelsKt__DeprecatedKt.mapIndexed(receiveChannel, y70Var, qu0Var);
    }

    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> receiveChannel, C c, q60 q60Var) {
        return ChannelsKt__DeprecatedKt.toChannel(receiveChannel, c, q60Var);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> receiveChannel, C c, q60 q60Var) {
        return ChannelsKt__DeprecatedKt.toCollection(receiveChannel, c, q60Var);
    }

    public static final <E> Object toList(ReceiveChannel<? extends E> receiveChannel, q60 q60Var) {
        return ChannelsKt__Channels_commonKt.toList(receiveChannel, q60Var);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, q60 q60Var) {
        return ChannelsKt__DeprecatedKt.toMutableSet(receiveChannel, q60Var);
    }

    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e) {
        return ChannelsKt__ChannelsKt.trySendBlocking(sendChannel, e);
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, lu0 lu0Var) {
        return (R) ChannelsKt__Channels_commonKt.consume(receiveChannel, lu0Var);
    }

    public static final <E> Object consumeEach(ReceiveChannel<? extends E> receiveChannel, lu0 lu0Var, q60 q60Var) {
        return ChannelsKt__Channels_commonKt.consumeEach(receiveChannel, lu0Var, q60Var);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends i52> receiveChannel, M m, q60 q60Var) {
        return ChannelsKt__DeprecatedKt.toMap(receiveChannel, m, q60Var);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, y70 y70Var, pu0 pu0Var) {
        return ChannelsKt__DeprecatedKt.zip(receiveChannel, receiveChannel2, y70Var, pu0Var);
    }
}
