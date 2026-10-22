package kotlinx.coroutines.sync;

import defpackage.y70;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class SemaphoreSegment extends Segment<SemaphoreSegment> {
    private final /* synthetic */ AtomicReferenceArray acquirers;

    public SemaphoreSegment(long j, SemaphoreSegment semaphoreSegment, int i) {
        super(j, semaphoreSegment, i);
        this.acquirers = new AtomicReferenceArray(SemaphoreKt.SEGMENT_SIZE);
    }

    public final boolean cas(int i, Object obj, Object obj2) {
        AtomicReferenceArray acquirers = getAcquirers();
        while (!acquirers.compareAndSet(i, obj, obj2)) {
            if (acquirers.get(i) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        return getAcquirers().get(i);
    }

    public final /* synthetic */ AtomicReferenceArray getAcquirers() {
        return this.acquirers;
    }

    public final Object getAndSet(int i, Object obj) {
        return getAcquirers().getAndSet(i, obj);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return SemaphoreKt.SEGMENT_SIZE;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int i, Throwable th, y70 y70Var) {
        getAcquirers().set(i, SemaphoreKt.CANCELLED);
        onSlotCleaned();
    }

    public final void set(int i, Object obj) {
        getAcquirers().set(i, obj);
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
