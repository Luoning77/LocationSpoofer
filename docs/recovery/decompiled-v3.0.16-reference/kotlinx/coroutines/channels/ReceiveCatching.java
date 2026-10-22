package kotlinx.coroutines.channels;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ReceiveCatching<E> implements Waiter {
    public final CancellableContinuationImpl<ChannelResult<? extends E>> cont;

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveCatching(CancellableContinuationImpl<? super ChannelResult<? extends E>> cancellableContinuationImpl) {
        this.cont = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i) {
        this.cont.invokeOnCancellation(segment, i);
    }
}
