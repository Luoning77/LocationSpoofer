package kotlinx.coroutines.channels;

import defpackage.cc0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface ProducerScope<E> extends CoroutineScope, SendChannel<E> {

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        @cc0
        public static <E> boolean offer(ProducerScope<? super E> producerScope, E e) {
            return SendChannel.DefaultImpls.offer(producerScope, e);
        }
    }

    SendChannel<E> getChannel();
}
