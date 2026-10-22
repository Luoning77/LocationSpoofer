package kotlinx.coroutines.sync;

import defpackage.au;
import defpackage.fo;
import defpackage.hd0;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.p91;
import defpackage.q60;
import defpackage.qu0;
import defpackage.y70;
import defpackage.z70;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class SemaphoreAndMutexImpl {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private final qu0 onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");

    public SemaphoreAndMutexImpl(int i, int i2) {
        this.permits = i;
        if (i <= 0) {
            fo.f(p91.l(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            fo.f(p91.l(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i - i2;
        this.onCancellationRelease = new au(this, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(q60 q60Var) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(hd0.G(q60Var));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super mf3>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            return result == z70.e ? result : mf3.a;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(Waiter waiter) {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) tail$volatile$FU.get(this);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        long j = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m98isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM96getSegmentimpl = SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM96getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM96getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM96getSegmentimpl)) {
                            if (!segment.decPointers$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            segment.remove();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (segmentM96getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM96getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
        int i = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (!acquirers.compareAndSet(i, null, waiter)) {
            if (acquirers.get(i) != null) {
                Symbol symbol = SemaphoreKt.PERMIT;
                Symbol symbol2 = SemaphoreKt.TAKEN;
                AtomicReferenceArray acquirers2 = semaphoreSegment2.getAcquirers();
                while (!acquirers2.compareAndSet(i, symbol, symbol2)) {
                    if (acquirers2.get(i) != symbol) {
                        return false;
                    }
                }
                boolean z = waiter instanceof CancellableContinuation;
                mf3 mf3Var = mf3.a;
                if (z) {
                    waiter.getClass();
                    ((CancellableContinuation) waiter).resume(mf3Var, this.onCancellationRelease);
                } else {
                    if (!(waiter instanceof SelectInstance)) {
                        fo.o(waiter, "unexpected: ");
                        return false;
                    }
                    ((SelectInstance) waiter).selectInRegistrationPhase(mf3Var);
                }
                return true;
            }
        }
        waiter.invokeOnCancellation(semaphoreSegment2, i);
        return true;
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i;
        do {
            i = _availablePermits$volatile$FU.get(this);
            if (i <= this.permits) {
                return;
            }
        } while (!_availablePermits$volatile$FU.compareAndSet(this, i, this.permits));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final /* synthetic */ long getDeqIdx$volatile() {
        return this.deqIdx$volatile;
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
        return this.enqIdx$volatile;
    }

    private final /* synthetic */ Object getHead$volatile() {
        return this.head$volatile;
    }

    private final /* synthetic */ Object getTail$volatile() {
        return this.tail$volatile;
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
        return this._availablePermits$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onCancellationRelease$lambda$2(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th, mf3 mf3Var, y70 y70Var) {
        semaphoreAndMutexImpl.release();
        return mf3.a;
    }

    private final /* synthetic */ void setDeqIdx$volatile(long j) {
        this.deqIdx$volatile = j;
    }

    private final /* synthetic */ void setEnqIdx$volatile(long j) {
        this.enqIdx$volatile = j;
    }

    private final /* synthetic */ void setHead$volatile(Object obj) {
        this.head$volatile = obj;
    }

    private final /* synthetic */ void setTail$volatile(Object obj) {
        this.tail$volatile = obj;
    }

    private final /* synthetic */ void set_availablePermits$volatile(int i) {
        this._availablePermits$volatile = i;
    }

    private final boolean tryResumeAcquire(Object obj) {
        boolean z = obj instanceof CancellableContinuation;
        mf3 mf3Var = mf3.a;
        if (!z) {
            if (obj instanceof SelectInstance) {
                return ((SelectInstance) obj).trySelect(this, mf3Var);
            }
            fo.o(obj, "unexpected: ");
            return false;
        }
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        Object objTryResume = cancellableContinuation.tryResume(mf3Var, null, this.onCancellationRelease);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) head$volatile$FU.get(this);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        long j = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m98isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            Segment segmentM96getSegmentimpl = SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= segmentM96getSegmentimpl.id) {
                    break loop0;
                }
                if (!segmentM96getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM96getSegmentimpl)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == segment);
                if (segmentM96getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM96getSegmentimpl.remove();
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
        semaphoreSegment2.cleanPrev();
        boolean z = false;
        if (semaphoreSegment2.id > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
        Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i, SemaphoreKt.PERMIT);
        if (andSet != null) {
            if (andSet == SemaphoreKt.CANCELLED) {
                return false;
            }
            return tryResumeAcquire(andSet);
        }
        int i2 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (int i3 = 0; i3 < i2; i3++) {
            if (semaphoreSegment2.getAcquirers().get(i) == SemaphoreKt.TAKEN) {
                return true;
            }
        }
        Symbol symbol = SemaphoreKt.PERMIT;
        Symbol symbol2 = SemaphoreKt.BROKEN;
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (!acquirers.compareAndSet(i, symbol, symbol2)) {
            if (acquirers.get(i) != symbol) {
                return !z;
            }
        }
        z = true;
        return !z;
    }

    public final void acquire(CancellableContinuation<? super mf3> cancellableContinuation) {
        while (decPermits() <= 0) {
            cancellableContinuation.getClass();
            if (addAcquireToQueue((Waiter) cancellableContinuation)) {
                return;
            }
        }
        cancellableContinuation.resume(mf3.a, this.onCancellationRelease);
    }

    public final int getAvailablePermits() {
        return Math.max(_availablePermits$volatile$FU.get(this), 0);
    }

    public final void onAcquireRegFunction(SelectInstance<?> selectInstance, Object obj) {
        while (decPermits() <= 0) {
            selectInstance.getClass();
            if (addAcquireToQueue((Waiter) selectInstance)) {
                return;
            }
        }
        selectInstance.selectInRegistrationPhase(mf3.a);
    }

    public final void release() {
        do {
            int andIncrement = _availablePermits$volatile$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    public final boolean tryAcquire() {
        while (true) {
            int i = _availablePermits$volatile$FU.get(this);
            if (i > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (_availablePermits$volatile$FU.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    private final <W> void acquire(W w, lu0 lu0Var, lu0 lu0Var2) {
        while (decPermits() <= 0) {
            if (((Boolean) lu0Var.invoke(w)).booleanValue()) {
                return;
            }
        }
        lu0Var2.invoke(w);
    }

    public final Object acquire(q60 q60Var) {
        Object objAcquireSlowPath;
        int iDecPermits = decPermits();
        mf3 mf3Var = mf3.a;
        return (iDecPermits <= 0 && (objAcquireSlowPath = acquireSlowPath(q60Var)) == z70.e) ? objAcquireSlowPath : mf3Var;
    }
}
