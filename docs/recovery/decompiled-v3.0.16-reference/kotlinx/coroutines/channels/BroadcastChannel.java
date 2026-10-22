package kotlinx.coroutines.channels;

import defpackage.b81;
import defpackage.cc0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
@cc0
public interface BroadcastChannel<E> extends SendChannel<E> {
    void cancel(CancellationException cancellationException);

    @cc0
    /* synthetic */ boolean cancel(Throwable th);

    ReceiveChannel<E> openSubscription();

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(BroadcastChannel broadcastChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return broadcastChannel.cancel(th);
        }

        @cc0
        public static <E> boolean offer(BroadcastChannel<E> broadcastChannel, E e) {
            return SendChannel.DefaultImpls.offer(broadcastChannel, e);
        }

        public static /* synthetic */ void cancel$default(BroadcastChannel broadcastChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                b81.s("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            broadcastChannel.cancel(cancellationException);
        }
    }
}
