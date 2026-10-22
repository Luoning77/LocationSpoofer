package kotlinx.coroutines.channels;

import defpackage.lu0;
import defpackage.pu0;
import defpackage.sj0;
import defpackage.y70;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ActorKt {
    public static final <E> SendChannel<E> actor(CoroutineScope coroutineScope, y70 y70Var, int i, CoroutineStart coroutineStart, lu0 lu0Var, pu0 pu0Var) {
        y70 y70VarNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, y70Var);
        Channel channelChannel$default = ChannelKt.Channel$default(i, null, null, 6, null);
        ActorCoroutine lazyActorCoroutine = coroutineStart.isLazy() ? new LazyActorCoroutine(y70VarNewCoroutineContext, channelChannel$default, pu0Var) : new ActorCoroutine(y70VarNewCoroutineContext, channelChannel$default, true);
        if (lu0Var != null) {
            ((JobSupport) lazyActorCoroutine).invokeOnCompletion(lu0Var);
        }
        ((AbstractCoroutine) lazyActorCoroutine).start(coroutineStart, lazyActorCoroutine, pu0Var);
        return (SendChannel<E>) lazyActorCoroutine;
    }

    public static /* synthetic */ SendChannel actor$default(CoroutineScope coroutineScope, y70 y70Var, int i, CoroutineStart coroutineStart, lu0 lu0Var, pu0 pu0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            y70Var = sj0.e;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i2 & 8) != 0) {
            lu0Var = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return actor(coroutineScope, y70Var, i, coroutineStart2, lu0Var, pu0Var);
    }
}
