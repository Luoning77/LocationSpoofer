package kotlinx.coroutines.channels;

import defpackage.cc0;
import defpackage.q60;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface ActorScope<E> extends CoroutineScope, ReceiveChannel<E> {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static <E> SelectClause1<E> getOnReceiveOrNull(ActorScope<E> actorScope) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(actorScope);
        }

        @cc0
        public static <E> E poll(ActorScope<E> actorScope) {
            return (E) ReceiveChannel.DefaultImpls.poll(actorScope);
        }

        @cc0
        public static <E> Object receiveOrNull(ActorScope<E> actorScope, q60 q60Var) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(actorScope, q60Var);
        }
    }

    Channel<E> getChannel();
}
