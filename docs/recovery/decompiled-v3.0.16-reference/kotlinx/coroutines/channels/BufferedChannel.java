package kotlinx.coroutines.channels;

import defpackage.am1;
import defpackage.au;
import defpackage.au0;
import defpackage.az2;
import defpackage.b81;
import defpackage.bu;
import defpackage.bv0;
import defpackage.ca0;
import defpackage.cc0;
import defpackage.da0;
import defpackage.ee0;
import defpackage.fo;
import defpackage.hd0;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.o51;
import defpackage.o81;
import defpackage.p91;
import defpackage.pu0;
import defpackage.q60;
import defpackage.qu0;
import defpackage.ru0;
import defpackage.vd0;
import defpackage.wg2;
import defpackage.y70;
import defpackage.z70;
import defpackage.zt;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class BufferedChannel<E> implements Channel<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final lu0 onUndeliveredElement;
    private final qu0 onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> cancellableContinuation) {
            cancellableContinuation.getClass();
            this.$$delegate_0 = (CancellableContinuationImpl) cancellableContinuation;
            this.cont = cancellableContinuation;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            this.$$delegate_0.invokeOnCancellation(segment, i);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public /* synthetic */ class AnonymousClass1 extends bv0 implements qu0 {
        public AnonymousClass1(Object obj) {
            super(3, 0, BufferedChannel.class, obj, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
        }

        @Override // defpackage.qu0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
            m41invoke5_sEAP8((Throwable) obj, ((ChannelResult) obj2).m58unboximpl(), (y70) obj3);
            return mf3.a;
        }

        /* JADX INFO: renamed from: invoke-5_sEAP8, reason: not valid java name */
        public final void m41invoke5_sEAP8(Throwable th, Object obj, y70 y70Var) throws IllegalAccessException, InvocationTargetException {
            ((BufferedChannel) this.receiver).m35onCancellationChannelResultImplDoNotCall5_sEAP8(th, obj, y70Var);
        }
    }

    public BufferedChannel(int i, lu0 lu0Var) {
        this.capacity = i;
        this.onUndeliveredElement = lu0Var;
        if (i < 0) {
            fo.f(p91.m(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        this.bufferEnd$volatile = BufferedChannelKt.initialBufferEnd(i);
        this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
        ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment;
        this.receiveSegment$volatile = channelSegment;
        if (isRendezvousOrUnlimited()) {
            channelSegment = BufferedChannelKt.NULL_SEGMENT;
            channelSegment.getClass();
        }
        this.bufferEndSegment$volatile = channelSegment;
        this.onUndeliveredElementReceiveCancellationConstructor = lu0Var != null ? new au(this, 0) : null;
        this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qu0 bindCancellationFun(lu0 lu0Var, E e) {
        return new bu(0, lu0Var, e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 bindCancellationFun$lambda$89(lu0 lu0Var, Object obj, Throwable th, Object obj2, y70 y70Var) throws IllegalAccessException, InvocationTargetException {
        OnUndeliveredElementKt.callUndeliveredElement(lu0Var, obj, y70Var);
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o81 bindCancellationFunResult(lu0 lu0Var) {
        return new AnonymousClass1(this);
    }

    private final boolean bufferOrRendezvousSend(long j) {
        return j < getBufferEndCounter() || j < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> channelSegment, long j) {
        Object objM81constructorimpl$default = InlineList.m81constructorimpl$default(null, 1, null);
        loop0: while (channelSegment != null) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i) < j) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                        if (!(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            }
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM81constructorimpl$default = InlineList.m86plusFjFbRPM(objM81constructorimpl$default, state$kotlinx_coroutines_core);
                                channelSegment.onCancelledRequest(i, true);
                                break;
                            }
                        } else {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM81constructorimpl$default = InlineList.m86plusFjFbRPM(objM81constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                channelSegment.onCancelledRequest(i, true);
                                break;
                            }
                        }
                    } else {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            channelSegment.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        }
        if (objM81constructorimpl$default != null) {
            if (!(objM81constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((Waiter) objM81constructorimpl$default);
                return;
            }
            ArrayList arrayList = (ArrayList) objM81constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
            }
        }
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) obj);
    }

    private final void completeCancel(long j) throws IllegalAccessException, InvocationTargetException {
        removeUnprocessedElements(completeClose(j));
    }

    private final ChannelSegment<E> completeClose(long j) {
        ChannelSegment<E> channelSegmentCloseLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long jMarkAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(channelSegmentCloseLinkedList);
            if (jMarkAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(jMarkAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(channelSegmentCloseLinkedList, j);
        return channelSegmentCloseLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        BufferedChannel<E> bufferedChannel;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i);
            if (this.getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j && channelSegment.getNext() != 0) {
                    this.moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j) {
                bufferedChannel = this;
                ChannelSegment<E> channelSegmentFindSegmentBufferEnd = bufferedChannel.findSegmentBufferEnd(j, channelSegment, andIncrement);
                if (channelSegmentFindSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentBufferEnd;
                }
                this = bufferedChannel;
            } else {
                bufferedChannel = this;
            }
            if (bufferedChannel.updateCellExpandBuffer(channelSegment, (int) (andIncrement % ((long) i)), andIncrement)) {
                incCompletedExpandBufferAttempts$default(bufferedChannel, 0L, 1, null);
                return;
            } else {
                incCompletedExpandBufferAttempts$default(bufferedChannel, 0L, 1, null);
                this = bufferedChannel;
            }
        }
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long j, ChannelSegment<E> channelSegment, long j2) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        pu0 pu0Var = (pu0) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, pu0Var);
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
        if (SegmentOrClosed.m98isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
        if (channelSegment2.id <= j) {
            return channelSegment2;
        }
        long j3 = channelSegment2.id;
        int i = BufferedChannelKt.SEGMENT_SIZE;
        if (bufferEnd$volatile$FU.compareAndSet(this, j2 + 1, j3 * ((long) i))) {
            incCompletedExpandBufferAttempts((channelSegment2.id * ((long) i)) - j2);
        } else {
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentReceive(long j, ChannelSegment<E> channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        pu0 pu0Var = (pu0) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, pu0Var);
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
        if (SegmentOrClosed.m98isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE) < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
        if (!isRendezvousOrUnlimited() && j <= getBufferEndCounter() / ((long) BufferedChannelKt.SEGMENT_SIZE)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            loop3: while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.id >= channelSegment2.id || !channelSegment2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, segment2, channelSegment2)) {
                        if (!segment2.decPointers$kotlinx_coroutines_core()) {
                            break loop3;
                        }
                        segment2.remove();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == segment2);
                if (channelSegment2.decPointers$kotlinx_coroutines_core()) {
                    channelSegment2.remove();
                }
            }
        }
        long j2 = channelSegment2.id;
        if (j2 <= j) {
            return channelSegment2;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateReceiversCounterIfLower(j2 * ((long) i));
        if (channelSegment2.id * ((long) i) < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment2.cleanPrev();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentSend(long j, ChannelSegment<E> channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        pu0 pu0Var = (pu0) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, pu0Var);
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
        if (SegmentOrClosed.m98isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE) < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
        long j2 = channelSegment2.id;
        if (j2 <= j) {
            return channelSegment2;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateSendersCounterIfLower(j2 * ((long) i));
        if (channelSegment2.id * ((long) i) < getReceiversCounter$kotlinx_coroutines_core()) {
            channelSegment2.cleanPrev();
        }
        return null;
    }

    private final /* synthetic */ Object getAndUpdate$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object objInvoke = lu0Var.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                }
            }
            return obj2;
        }
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final /* synthetic */ Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private final /* synthetic */ Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    private final /* synthetic */ Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    private final /* synthetic */ Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final /* synthetic */ Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    private final void incCompletedExpandBufferAttempts(long j) {
        if ((completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
            return;
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j);
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        loop0: while (true) {
            obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        if (obj == null) {
            return;
        }
        da0.o(1, obj);
        ((lu0) obj).invoke(getCloseCause());
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> channelSegment, int i, long j) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_EB) {
                    return true;
                }
                return state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV && j == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long j, boolean z) throws IllegalAccessException, InvocationTargetException {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(j & 1152921504606846975L);
            return (z && hasElements$kotlinx_coroutines_core()) ? false : true;
        }
        if (i == 3) {
            completeCancel(j & 1152921504606846975L);
            return true;
        }
        b81.g(p91.l(i, "unexpected close status: "));
        return false;
    }

    private final boolean isClosedForReceive0(long j) {
        return isClosed(j, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j) {
        return isClosed(j, false);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            lu0Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            lu0Var.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long markAllEmptyCellsAsClosed(ChannelSegment<E> channelSegment) {
        do {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i);
                    if (j >= getReceiversCounter$kotlinx_coroutines_core()) {
                        while (true) {
                            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                                if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                                    break;
                                }
                                return j;
                            }
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                channelSegment.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        } while (channelSegment != null);
        return -1L;
    }

    private final void markCancellationStarted() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 1))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    private final void markCancelled() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    private final void markClosed() {
        long jConstructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 2);
            } else if (i != 1) {
                return;
            } else {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3);
            }
            BufferedChannel<E> bufferedChannel = this;
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, jConstructSendersAndCloseStatus)) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long j, ChannelSegment<E> channelSegment) {
        ChannelSegment<E> channelSegment2;
        ChannelSegment<E> channelSegment3;
        while (channelSegment.id < j && (channelSegment3 = (ChannelSegment) channelSegment.getNext()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (!channelSegment.isRemoved() || (channelSegment2 = (ChannelSegment) channelSegment.getNext()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= channelSegment.id) {
                        return;
                    }
                    if (!channelSegment.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, channelSegment)) {
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (channelSegment.decPointers$kotlinx_coroutines_core()) {
                        channelSegment.remove();
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public final void m35onCancellationChannelResultImplDoNotCall5_sEAP8(Throwable th, Object obj, y70 y70Var) throws IllegalAccessException, InvocationTargetException {
        lu0 lu0Var = this.onUndeliveredElement;
        lu0Var.getClass();
        Object objM51getOrNullimpl = ChannelResult.m51getOrNullimpl(obj);
        objM51getOrNullimpl.getClass();
        OnUndeliveredElementKt.callUndeliveredElement(lu0Var, objM51getOrNullimpl, y70Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancellationImplDoNotCall(Throwable th, E e, y70 y70Var) throws IllegalAccessException, InvocationTargetException {
        lu0 lu0Var = this.onUndeliveredElement;
        lu0Var.getClass();
        OnUndeliveredElementKt.callUndeliveredElement(lu0Var, e, y70Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> cancellableContinuation) {
        cancellableContinuation.resumeWith(ChannelResult.m46boximpl(ChannelResult.Companion.m59closedJP2dKIU(getCloseCause())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cancellableContinuation) {
        cancellableContinuation.resumeWith(ee0.t(getReceiveException()));
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> selectInstance) {
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(E e, SelectInstance<?> selectInstance) throws IllegalAccessException, InvocationTargetException {
        lu0 lu0Var = this.onUndeliveredElement;
        if (lu0Var != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lu0Var, e, selectInstance.getContext());
        }
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(E e, q60 q60Var) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        lu0 lu0Var = this.onUndeliveredElement;
        if (lu0Var == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lu0Var, e, null, 2, null)) == null) {
            cancellableContinuationImpl.resumeWith(ee0.t(getSendException()));
        } else {
            vd0.d(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, getSendException());
            cancellableContinuationImpl.resumeWith(new wg2(undeliveredElementExceptionCallUndeliveredElementCatchingException$default));
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == z70.e ? result : mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E e, CancellableContinuation<? super mf3> cancellableContinuation) throws IllegalAccessException, InvocationTargetException {
        lu0 lu0Var = this.onUndeliveredElement;
        if (lu0Var != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lu0Var, e, cancellableContinuation.getContext());
        }
        cancellableContinuation.resumeWith(ee0.t(getSendException()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qu0 onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(BufferedChannel bufferedChannel, SelectInstance selectInstance, Object obj, Object obj2) {
        return new zt(obj2, bufferedChannel, selectInstance, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance, Throwable th, Object obj2, y70 y70Var) throws IllegalAccessException, InvocationTargetException {
        if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
            OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getContext());
        }
        return mf3.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object obj, Object obj2) {
        return ChannelResult.m46boximpl(obj2 == BufferedChannelKt.getCHANNEL_CLOSED() ? ChannelResult.Companion.m59closedJP2dKIU(getCloseCause()) : ChannelResult.Companion.m61successJP2dKIU(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    public static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, q60 q60Var) throws Throwable {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (channelSegment2.id != j) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i2, andIncrement, null);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                fo.n("unexpected");
                return null;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return bufferedChannel2.receiveOnNoWaiterSuspend(channelSegment, i2, andIncrement, q60Var);
                }
                channelSegment.cleanPrev();
                return objUpdateCellReceive;
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            channelSegment2 = channelSegment;
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    public static <E> Object m36receiveCatchingJP2dKIU$suspendImpl(BufferedChannel<E> bufferedChannel, q60 q60Var) {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        ChannelSegment<E> channelSegment;
        if (q60Var instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) q60Var;
            int i = bufferedChannel$receiveCatching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, q60Var);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, q60Var);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.result;
        int i2 = bufferedChannel$receiveCatching$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ee0.J(obj);
                return ((ChannelResult) obj).m58unboximpl();
            }
            fo.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ee0.J(obj);
        ChannelSegment<E> channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i3 = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i3);
            int i4 = (int) (andIncrement % ((long) i3));
            if (channelSegment2.id != j) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i4, andIncrement, null);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                fo.n("unexpected");
                return null;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                    channelSegment.cleanPrev();
                    return ChannelResult.Companion.m61successJP2dKIU(objUpdateCellReceive);
                }
                bufferedChannel$receiveCatching$2.label = 1;
                Object objM37receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel2.m37receiveCatchingOnNoWaiterSuspendGKJJFZk(channelSegment, i4, andIncrement, bufferedChannel$receiveCatching$2);
                z70 z70Var = z70.e;
                return objM37receiveCatchingOnNoWaiterSuspendGKJJFZk == z70Var ? z70Var : objM37receiveCatchingOnNoWaiterSuspendGKJJFZk;
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            channelSegment2 = channelSegment;
        }
        return ChannelResult.Companion.m59closedJP2dKIU(bufferedChannel.getCloseCause());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    public final Object m37receiveCatchingOnNoWaiterSuspendGKJJFZk(ChannelSegment<E> channelSegment, int i, long j, q60 q60Var) {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ChannelResult channelResultM46boximpl;
        ChannelSegment channelSegment2;
        if (q60Var instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) q60Var;
            int i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i2 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, q60Var);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, q60Var);
        }
        Object result = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        o81 o81VarBindCancellationFunResult = null;
        if (i3 == 0) {
            ee0.J(result);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = channelSegment;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(hd0.G(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                orCreateCancellableContinuation.getClass();
                ReceiveCatching receiveCatching = new ReceiveCatching(orCreateCancellableContinuation);
                Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, receiveCatching);
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                    prepareReceiverForSuspension(receiveCatching, channelSegment, i);
                } else {
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (j < getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                        while (true) {
                            if (isClosedForReceive()) {
                                onClosedReceiveCatchingOnNoWaiterSuspend(orCreateCancellableContinuation);
                            } else {
                                long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                                int i4 = BufferedChannelKt.SEGMENT_SIZE;
                                long j2 = andIncrement / ((long) i4);
                                int i5 = (int) (andIncrement % ((long) i4));
                                if (channelSegment3.id != j2) {
                                    ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment3);
                                    if (channelSegmentFindSegmentReceive != null) {
                                        channelSegment2 = channelSegmentFindSegmentReceive;
                                    }
                                } else {
                                    channelSegment2 = channelSegment3;
                                }
                                Object objUpdateCellReceive2 = updateCellReceive(channelSegment2, i5, andIncrement, receiveCatching);
                                ChannelSegment channelSegment4 = channelSegment2;
                                if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND) {
                                    prepareReceiverForSuspension(receiveCatching, channelSegment4, i5);
                                } else if (objUpdateCellReceive2 == BufferedChannelKt.FAILED) {
                                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                        channelSegment4.cleanPrev();
                                    }
                                    channelSegment3 = channelSegment4;
                                } else {
                                    if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    channelSegment4.cleanPrev();
                                    channelResultM46boximpl = ChannelResult.m46boximpl(ChannelResult.Companion.m61successJP2dKIU(objUpdateCellReceive2));
                                    lu0 lu0Var = this.onUndeliveredElement;
                                    if (lu0Var != null) {
                                        o81VarBindCancellationFunResult = bindCancellationFunResult(lu0Var);
                                    }
                                }
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        channelResultM46boximpl = ChannelResult.m46boximpl(ChannelResult.Companion.m61successJP2dKIU(objUpdateCellReceive));
                        lu0 lu0Var2 = this.onUndeliveredElement;
                        if (lu0Var2 != null) {
                            o81VarBindCancellationFunResult = bindCancellationFunResult(lu0Var2);
                        }
                    }
                    orCreateCancellableContinuation.resume(channelResultM46boximpl, (qu0) o81VarBindCancellationFunResult);
                }
                result = orCreateCancellableContinuation.getResult();
                z70 z70Var = z70.e;
                if (result == z70Var) {
                    return z70Var;
                }
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        } else {
            if (i3 != 1) {
                fo.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ee0.J(result);
        }
        return ((ChannelResult) result).m58unboximpl();
    }

    private final <R> R receiveImpl(Object obj, lu0 lu0Var, qu0 qu0Var, au0 au0Var, qu0 qu0Var2) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!this.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (channelSegment2.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = this.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel = this;
            Object obj2 = obj;
            Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, obj2);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment2, i2);
                }
                return (R) qu0Var.invoke(channelSegment2, Integer.valueOf(i2), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return (R) qu0Var2.invoke(channelSegment2, Integer.valueOf(i2), Long.valueOf(andIncrement));
                }
                channelSegment2.cleanPrev();
                return (R) lu0Var.invoke(objUpdateCellReceive);
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            this = bufferedChannel;
            obj = obj2;
        }
        return (R) au0Var.invoke();
    }

    public static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, lu0 lu0Var, qu0 qu0Var, au0 au0Var, qu0 qu0Var2, int i, Object obj2) {
        ChannelSegment channelSegment;
        if (obj2 != null) {
            b81.s("Super calls with default arguments not supported in this target, function: receiveImpl");
            return null;
        }
        if ((i & 16) != 0) {
            qu0Var2 = new qu0() { // from class: kotlinx.coroutines.channels.BufferedChannel.receiveImpl.1
                @Override // defpackage.qu0
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    return invoke((ChannelSegment) obj3, ((Number) obj4).intValue(), ((Number) obj5).longValue());
                }

                public final Void invoke(ChannelSegment<E> channelSegment2, int i2, long j) {
                    throw new IllegalStateException("unexpected");
                }
            };
        }
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (channelSegment2.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object obj3 = obj;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i3, andIncrement, obj3);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj3 instanceof Waiter ? (Waiter) obj3 : null;
                if (waiter != null) {
                    bufferedChannel2.prepareReceiverForSuspension(waiter, channelSegment2, i3);
                }
                return qu0Var.invoke(channelSegment2, Integer.valueOf(i3), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return qu0Var2.invoke(channelSegment2, Integer.valueOf(i3), Long.valueOf(andIncrement));
                }
                channelSegment2.cleanPrev();
                return lu0Var.invoke(objUpdateCellReceive);
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            obj = obj3;
        }
        return au0Var.invoke();
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> channelSegment, int i, long j, Waiter waiter, lu0 lu0Var, au0 au0Var) {
        Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, waiter);
        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
            prepareReceiverForSuspension(waiter, channelSegment, i);
            return;
        }
        if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
            channelSegment.cleanPrev();
            lu0Var.invoke(objUpdateCellReceive);
            return;
        }
        if (j < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (channelSegment2.id != j2) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment2 = channelSegmentFindSegmentReceive;
                }
            }
            Object objUpdateCellReceive2 = updateCellReceive(channelSegment2, i3, andIncrement, waiter);
            if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND) {
                if (waiter == null) {
                    waiter = null;
                }
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment2, i3);
                    return;
                }
                return;
            }
            if (objUpdateCellReceive2 != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    fo.n("unexpected");
                    return;
                } else {
                    channelSegment2.cleanPrev();
                    lu0Var.invoke(objUpdateCellReceive2);
                    return;
                }
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
        }
        au0Var.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j, q60 q60Var) {
        ChannelSegment channelSegment2;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(hd0.G(q60Var));
        try {
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, orCreateCancellableContinuation);
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                o81 o81VarBindCancellationFun = null;
                o81VarBindCancellationFun = null;
                if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        int i2 = BufferedChannelKt.SEGMENT_SIZE;
                        long j2 = andIncrement / ((long) i2);
                        int i3 = (int) (andIncrement % ((long) i2));
                        if (channelSegment3.id != j2) {
                            ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment3);
                            if (channelSegmentFindSegmentReceive != null) {
                                channelSegment2 = channelSegmentFindSegmentReceive;
                            }
                        } else {
                            channelSegment2 = channelSegment3;
                        }
                        objUpdateCellReceive = updateCellReceive(channelSegment2, i3, andIncrement, orCreateCancellableContinuation);
                        ChannelSegment channelSegment4 = channelSegment2;
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl == null) {
                                break;
                            }
                            prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment4, i3);
                            break;
                        }
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment4.cleanPrev();
                            }
                            channelSegment3 = channelSegment4;
                        } else {
                            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment4.cleanPrev();
                            lu0 lu0Var = this.onUndeliveredElement;
                            if (lu0Var != null) {
                                o81VarBindCancellationFun = bindCancellationFun(lu0Var);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    lu0 lu0Var2 = this.onUndeliveredElement;
                    if (lu0Var2 != null) {
                        o81VarBindCancellationFun = bindCancellationFun(lu0Var2);
                    }
                }
                orCreateCancellableContinuation.resume(objUpdateCellReceive, (qu0) o81VarBindCancellationFun);
                break;
            }
            prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i);
            return orCreateCancellableContinuation.getResult();
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(SelectInstance<?> selectInstance, Object obj) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!this.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (channelSegment2.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = this.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel = this;
            SelectInstance<?> selectInstance2 = selectInstance;
            Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, selectInstance2);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment2, i2);
                    return;
                }
                return;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    fo.n("unexpected");
                    return;
                } else {
                    channelSegment2.cleanPrev();
                    selectInstance2.selectInRegistrationPhase(objUpdateCellReceive);
                    return;
                }
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            this = bufferedChannel;
            selectInstance = selectInstance2;
        }
        this.onClosedSelectOnReceive(selectInstance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void removeUnprocessedElements(ChannelSegment<E> channelSegment) throws IllegalAccessException, InvocationTargetException {
        lu0 lu0Var = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException = null;
        Object objM81constructorimpl$default = InlineList.m81constructorimpl$default(null, 1, null);
        loop0: do {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                long j = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i);
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV) {
                        break loop0;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER && state$kotlinx_coroutines_core != null) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter) && !(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                                if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                    break loop0;
                                }
                                Waiter waiter = state$kotlinx_coroutines_core instanceof WaiterEB ? ((WaiterEB) state$kotlinx_coroutines_core).waiter : (Waiter) state$kotlinx_coroutines_core;
                                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    if (lu0Var != null) {
                                        undeliveredElementExceptionCallUndeliveredElementCatchingException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(lu0Var, channelSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementExceptionCallUndeliveredElementCatchingException);
                                    }
                                    objM81constructorimpl$default = InlineList.m86plusFjFbRPM(objM81constructorimpl$default, waiter);
                                    channelSegment.cleanElement$kotlinx_coroutines_core(i);
                                    channelSegment.onSlotCleaned();
                                    break;
                                }
                            }
                        } else {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                channelSegment.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            if (lu0Var != null) {
                                undeliveredElementExceptionCallUndeliveredElementCatchingException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(lu0Var, channelSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementExceptionCallUndeliveredElementCatchingException);
                            }
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            channelSegment.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        } while (channelSegment != null);
        if (objM81constructorimpl$default != null) {
            if (objM81constructorimpl$default instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objM81constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeSenderOnCancelledChannel((Waiter) arrayList.get(size));
                }
            } else {
                resumeSenderOnCancelledChannel((Waiter) objM81constructorimpl$default);
            }
        }
        if (undeliveredElementExceptionCallUndeliveredElementCatchingException != null) {
            throw undeliveredElementExceptionCallUndeliveredElementCatchingException;
        }
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z) {
        if (waiter instanceof SendBroadcast) {
            ((SendBroadcast) waiter).getCont().resumeWith(Boolean.FALSE);
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            ((q60) waiter).resumeWith(ee0.t(z ? getReceiveException() : getSendException()));
            return;
        }
        if (waiter instanceof ReceiveCatching) {
            ((ReceiveCatching) waiter).cont.resumeWith(ChannelResult.m46boximpl(ChannelResult.Companion.m59closedJP2dKIU(getCloseCause())));
            return;
        }
        if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            fo.o(waiter, "Unexpected waiter: ");
        }
    }

    public static <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e, q60 q60Var) throws IllegalAccessException, InvocationTargetException {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            long j3 = channelSegment2.id;
            z70 z70Var = z70.e;
            if (j3 != j2) {
                ChannelSegment<E> channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    Object objOnClosedSend = bufferedChannel.onClosedSend(e, q60Var);
                    if (objOnClosedSend != z70Var) {
                        break;
                    }
                    return objOnClosedSend;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            E e2 = e;
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegment, i2, e2, j, null, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (iUpdateCellSend != 1) {
                if (iUpdateCellSend == 2) {
                    if (!zIsClosedForSend0) {
                        break;
                    }
                    channelSegment.onSlotCleaned();
                    Object objOnClosedSend2 = bufferedChannel2.onClosedSend(e2, q60Var);
                    if (objOnClosedSend2 != z70Var) {
                        break;
                    }
                    return objOnClosedSend2;
                }
                if (iUpdateCellSend == 3) {
                    Object objSendOnNoWaiterSuspend = bufferedChannel2.sendOnNoWaiterSuspend(channelSegment, i2, e2, j, q60Var);
                    if (objSendOnNoWaiterSuspend != z70Var) {
                        break;
                    }
                    return objSendOnNoWaiterSuspend;
                }
                if (iUpdateCellSend == 4) {
                    if (j < bufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    Object objOnClosedSend3 = bufferedChannel2.onClosedSend(e2, q60Var);
                    if (objOnClosedSend3 != z70Var) {
                        break;
                    }
                    return objOnClosedSend3;
                }
                if (iUpdateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
                bufferedChannel = bufferedChannel2;
                channelSegment2 = channelSegment;
                e = e2;
            } else {
                break;
            }
        }
        return mf3.a;
    }

    public static <E> Object sendBroadcast$suspendImpl(BufferedChannel<E> bufferedChannel, E e, q60 q60Var) {
        ChannelSegment channelSegmentFindSegmentSend;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        if (bufferedChannel.onUndeliveredElement != null) {
            fo.n("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
            return null;
        }
        SendBroadcast sendBroadcast = new SendBroadcast(cancellableContinuationImpl);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment.id != j2) {
                channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment);
                if (channelSegmentFindSegmentSend == null) {
                    if (zIsClosedForSend0) {
                        cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                        break;
                    }
                }
            } else {
                channelSegmentFindSegmentSend = channelSegment;
            }
            E e2 = e;
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegmentFindSegmentSend, i2, e2, j, sendBroadcast, zIsClosedForSend0);
            channelSegment = channelSegmentFindSegmentSend;
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
            } else if (iUpdateCellSend != 1) {
                if (iUpdateCellSend == 2) {
                    if (!zIsClosedForSend0) {
                        bufferedChannel2.prepareSenderForSuspension(sendBroadcast, channelSegment, i2);
                        break;
                    }
                    channelSegment.onSlotCleaned();
                } else {
                    if (iUpdateCellSend == 3) {
                        fo.n("unexpected");
                        return null;
                    }
                    if (iUpdateCellSend != 4) {
                        if (iUpdateCellSend == 5) {
                            channelSegment.cleanPrev();
                        }
                        bufferedChannel = bufferedChannel2;
                        e = e2;
                    } else if (j < bufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                }
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                break;
            }
            cancellableContinuationImpl.resumeWith(Boolean.TRUE);
            break;
        }
        return cancellableContinuationImpl.getResult();
    }

    private final <R> R sendImpl(E e, Object obj, au0 au0Var, pu0 pu0Var, au0 au0Var2, ru0 ru0Var) {
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j2, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return (R) au0Var2.invoke();
                }
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i2, e, j, obj, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return (R) au0Var.invoke();
            }
            if (iUpdateCellSend == 1) {
                return (R) au0Var.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return (R) au0Var2.invoke();
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                return (R) pu0Var.invoke(channelSegment, Integer.valueOf(i2));
            }
            if (iUpdateCellSend == 3) {
                return (R) ru0Var.invoke(channelSegment, Integer.valueOf(i2), e, Long.valueOf(j));
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return (R) au0Var2.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    public static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, au0 au0Var, pu0 pu0Var, au0 au0Var2, ru0 ru0Var, int i, Object obj3) {
        ChannelSegment channelSegment;
        if (obj3 != null) {
            b81.s("Super calls with default arguments not supported in this target, function: sendImpl");
            return null;
        }
        ru0 ru0Var2 = (i & 32) != 0 ? new ru0() { // from class: kotlinx.coroutines.channels.BufferedChannel.sendImpl.1
            @Override // defpackage.ru0
            public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((ChannelSegment<Object>) obj4, ((Number) obj5).intValue(), obj6, ((Number) obj7).longValue());
            }

            public final Void invoke(ChannelSegment<E> channelSegment2, int i2, E e, long j) {
                throw new IllegalStateException("unexpected");
            }
        } : ru0Var;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i2);
            int i3 = (int) (j % ((long) i2));
            if (channelSegment2.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return au0Var2.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegment, i3, obj, j, obj2, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                return au0Var.invoke();
            }
            if (iUpdateCellSend == 1) {
                return au0Var.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    return au0Var2.invoke();
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment2, i3);
                }
                return pu0Var.invoke(channelSegment2, Integer.valueOf(i3));
            }
            if (iUpdateCellSend == 3) {
                return ru0Var2.invoke(channelSegment2, Integer.valueOf(i3), obj, Long.valueOf(j));
            }
            if (iUpdateCellSend == 4) {
                if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return au0Var2.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment2.cleanPrev();
            }
        }
    }

    private final void sendImplOnNoWaiter(ChannelSegment<E> channelSegment, int i, E e, long j, Waiter waiter, au0 au0Var, au0 au0Var2) {
        Object objInvoke;
        int iUpdateCellSend = updateCellSend(channelSegment, i, e, j, waiter, false);
        if (iUpdateCellSend == 0) {
            channelSegment.cleanPrev();
            au0Var.invoke();
            return;
        }
        if (iUpdateCellSend == 1) {
            au0Var.invoke();
            return;
        }
        if (iUpdateCellSend == 2) {
            prepareSenderForSuspension(waiter, channelSegment, i);
            return;
        }
        if (iUpdateCellSend == 4) {
            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            au0Var2.invoke();
            return;
        }
        String str = "unexpected";
        if (iUpdateCellSend != 5) {
            fo.n("unexpected");
            return;
        }
        channelSegment.cleanPrev();
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = j2 / ((long) i2);
            int i3 = (int) (j2 % ((long) i2));
            str = str;
            if (channelSegment2.id != j3) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j3, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment2 = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    objInvoke = au0Var2.invoke();
                    break;
                }
            }
            int iUpdateCellSend2 = updateCellSend(channelSegment2, i3, e, j2, waiter, zIsClosedForSend0);
            if (iUpdateCellSend2 == 0) {
                channelSegment2.cleanPrev();
                objInvoke = au0Var.invoke();
                break;
            }
            if (iUpdateCellSend2 == 1) {
                objInvoke = au0Var.invoke();
                break;
            }
            if (iUpdateCellSend2 == 2) {
                if (!zIsClosedForSend0) {
                    Waiter waiter2 = waiter != 0 ? waiter : null;
                    if (waiter2 != null) {
                        prepareSenderForSuspension(waiter2, channelSegment2, i3);
                    }
                    objInvoke = mf3.a;
                    break;
                }
                channelSegment2.onSlotCleaned();
                objInvoke = au0Var2.invoke();
                break;
            }
            if (iUpdateCellSend2 == 3) {
                fo.n(str);
                return;
            } else if (iUpdateCellSend2 == 4) {
                if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                objInvoke = au0Var2.invoke();
                break;
            } else if (iUpdateCellSend2 == 5) {
                channelSegment2.cleanPrev();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00da A[RETURN] */
    public final Object sendOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, E e, long j, q60 q60Var) {
        Object result;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(hd0.G(q60Var));
        try {
            int iUpdateCellSend = updateCellSend(channelSegment, i, e, j, orCreateCancellableContinuation, false);
            mf3 mf3Var = mf3.a;
            if (iUpdateCellSend != 0) {
                if (iUpdateCellSend != 1) {
                    if (iUpdateCellSend != 2) {
                        if (iUpdateCellSend != 4) {
                            if (iUpdateCellSend != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment.cleanPrev();
                            ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
                            while (true) {
                                long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
                                long j2 = 1152921504606846975L & andIncrement;
                                boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
                                int i2 = BufferedChannelKt.SEGMENT_SIZE;
                                long j3 = j2 / ((long) i2);
                                int i3 = (int) (j2 % ((long) i2));
                                if (channelSegment2.id != j3) {
                                    ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j3, channelSegment2);
                                    if (channelSegmentFindSegmentSend != null) {
                                        channelSegment2 = channelSegmentFindSegmentSend;
                                    } else if (zIsClosedForSend0) {
                                    }
                                }
                                int iUpdateCellSend2 = updateCellSend(channelSegment2, i3, e, j2, orCreateCancellableContinuation, zIsClosedForSend0);
                                if (iUpdateCellSend2 == 0) {
                                    channelSegment2.cleanPrev();
                                } else if (iUpdateCellSend2 != 1) {
                                    if (iUpdateCellSend2 == 2) {
                                        if (!zIsClosedForSend0) {
                                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                                            if (cancellableContinuationImpl == null) {
                                                break;
                                            }
                                            prepareSenderForSuspension(cancellableContinuationImpl, channelSegment2, i3);
                                            break;
                                        }
                                        channelSegment2.onSlotCleaned();
                                    } else {
                                        if (iUpdateCellSend2 == 3) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        if (iUpdateCellSend2 != 4) {
                                            if (iUpdateCellSend2 == 5) {
                                                channelSegment2.cleanPrev();
                                            }
                                        } else if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                                            channelSegment2.cleanPrev();
                                        }
                                    }
                                }
                            }
                        } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        onClosedSendOnNoWaiterSuspend(e, orCreateCancellableContinuation);
                        break;
                    } else {
                        prepareSenderForSuspension(orCreateCancellableContinuation, channelSegment, i);
                    }
                }
                result = orCreateCancellableContinuation.getResult();
                if (result == z70.e) {
                    return result;
                }
                return mf3Var;
            }
            channelSegment.cleanPrev();
            orCreateCancellableContinuation.resumeWith(mf3Var);
            result = orCreateCancellableContinuation.getResult();
            if (result == z70.e) {
                return result;
            }
            return mf3Var;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private final /* synthetic */ void setBufferEnd$volatile(long j) {
        this.bufferEnd$volatile = j;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    private final /* synthetic */ void setCloseHandler$volatile(Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long j) {
        this.completedExpandBuffersAndPauseFlag$volatile = j;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final /* synthetic */ void setReceivers$volatile(long j) {
        this.receivers$volatile = j;
    }

    private final /* synthetic */ void setSendSegment$volatile(Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long j) {
        this.sendersAndCloseStatus$volatile = j;
    }

    private final /* synthetic */ void set_closeCause$volatile(Object obj) {
        this._closeCause$volatile = obj;
    }

    private final boolean shouldSendSuspend(long j) {
        if (isClosedForSend0(j)) {
            return false;
        }
        return !bufferOrRendezvousSend(j & 1152921504606846975L);
    }

    private final boolean tryResumeReceiver(Object obj, E e) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e);
        }
        if (obj instanceof ReceiveCatching) {
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) obj).cont;
            ChannelResult channelResultM46boximpl = ChannelResult.m46boximpl(ChannelResult.Companion.m61successJP2dKIU(e));
            lu0 lu0Var = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, channelResultM46boximpl, (qu0) (lu0Var != null ? bindCancellationFunResult(lu0Var) : null));
        }
        if (obj instanceof BufferedChannelIterator) {
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e);
        }
        if (!(obj instanceof CancellableContinuation)) {
            fo.o(obj, "Unexpected receiver type: ");
            return false;
        }
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        lu0 lu0Var2 = this.onUndeliveredElement;
        return BufferedChannelKt.tryResume0(cancellableContinuation, e, (qu0) (lu0Var2 != null ? bindCancellationFun(lu0Var2) : null));
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i) {
        boolean z = obj instanceof CancellableContinuation;
        mf3 mf3Var = mf3.a;
        if (z) {
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, mf3Var, null, 2, null);
        }
        if (obj instanceof SelectInstance) {
            TrySelectDetailedResult trySelectDetailedResultTrySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, mf3Var);
            if (trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            return trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        fo.o(obj, "Unexpected waiter: ");
        return false;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            long j = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j, ((Number) lu0Var.invoke(Long.valueOf(j))).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> channelSegment, int i, long j) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (!(state$kotlinx_coroutines_core instanceof Waiter) || j < receivers$volatile$FU.get(this) || !channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
            return updateCellExpandBufferSlow(channelSegment, i, j);
        }
        if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
            return true;
        }
        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
        channelSegment.onCancelledRequest(i, false);
        return false;
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> channelSegment, int i, long j) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core instanceof Waiter) {
                if (j < receivers$volatile$FU.get(this)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                        return true;
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                    channelSegment.onCancelledRequest(i, false);
                    return false;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                        fo.o(state$kotlinx_coroutines_core, "Unexpected cell state: ");
                        return false;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(ChannelSegment<E> channelSegment, int i, long j, Object obj) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.SUSPEND_NO_WAITER;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    return BufferedChannelKt.SUSPEND;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
            expandBuffer();
            return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
        }
        return updateCellReceiveSlow(channelSegment, i, j, obj);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> channelSegment, int i, long j, Object obj) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                if (j < (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_SEND && state$kotlinx_coroutines_core != BufferedChannelKt.POISONED) {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            return BufferedChannelKt.FAILED;
                        }
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV)) {
                            boolean z = state$kotlinx_coroutines_core instanceof WaiterEB;
                            if (z) {
                                state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                                expandBuffer();
                                return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                            }
                            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                            channelSegment.onCancelledRequest(i, false);
                            if (z) {
                                expandBuffer();
                            }
                            return BufferedChannelKt.FAILED;
                        }
                    }
                    return BufferedChannelKt.FAILED;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                    expandBuffer();
                    return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(ChannelSegment<E> channelSegment, int i, E e, long j, Object obj, boolean z) {
        channelSegment.storeElement$kotlinx_coroutines_core(i, e);
        if (z) {
            return updateCellSendSlow(channelSegment, i, e, j, obj, z);
        }
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(j)) {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, e)) {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                onReceiveDequeued();
                return 0;
            }
            if (channelSegment.getAndSetState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_RCV) == BufferedChannelKt.INTERRUPTED_RCV) {
                return 5;
            }
            channelSegment.onCancelledRequest(i, true);
            return 5;
        }
        return updateCellSendSlow(channelSegment, i, e, j, obj, z);
    }

    private final int updateCellSendSlow(ChannelSegment<E> channelSegment, int i, E e, long j, Object obj, boolean z) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(j) || z) {
                    if (z) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                            channelSegment.onCancelledRequest(i, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        completeCloseOrCancel();
                        return 4;
                    }
                    channelSegment.cleanElement$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, e)) {
                        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                        onReceiveDequeued();
                        return 0;
                    }
                    if (channelSegment.getAndSetState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                        channelSegment.onCancelledRequest(i, true);
                    }
                    return 5;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            }
        }
    }

    private final void updateReceiversCounterIfLower(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            long j3 = j;
            if (receivers$volatile$FU.compareAndSet(bufferedChannel, j2, j3)) {
                return;
            }
            this = bufferedChannel;
            j = j3;
        }
    }

    private final void updateSendersCounterIfLower(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            long j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            if (sendersAndCloseStatus$volatile$FU.compareAndSet(bufferedChannel, j2, BufferedChannelKt.constructSendersAndCloseStatus(j3, (int) (j2 >> 60)))) {
                return;
            } else {
                this = bufferedChannel;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        if (isRendezvousOrUnlimited()) {
            if (bufferEndSegment$volatile$FU.get(this) != BufferedChannelKt.NULL_SEGMENT) {
                b81.q(this, "bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: ");
                return;
            }
        } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id > ((ChannelSegment) bufferEndSegment$volatile$FU.get(this)).id) {
            b81.q(this, "bufferEndSegment should not have lower id than receiveSegment.\nChannel state: ");
            return;
        }
        List listG = am1.G(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            b81.p();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        if (channelSegment.getPrev() != 0) {
            b81.q(this, "All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: ");
            return;
        }
        while (channelSegment.getNext() != 0) {
            S next3 = channelSegment.getNext();
            next3.getClass();
            if (((ChannelSegment) next3).getPrev() != 0) {
                S next4 = channelSegment.getNext();
                next4.getClass();
                if (((ChannelSegment) next4).getPrev() != channelSegment) {
                    b81.q(this, "The `segment.next.prev === segment` invariant is violated.\nChannel state: ");
                    return;
                }
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i3);
                if (!o51.f(state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof Waiter)) {
                    if (o51.f(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_RCV) || o51.f(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_SEND) || o51.f(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        if (channelSegment.getElement$kotlinx_coroutines_core(i3) != null) {
                            fo.n("Check failed.");
                            return;
                        }
                        i2++;
                    } else {
                        if (!o51.f(state$kotlinx_coroutines_core, BufferedChannelKt.POISONED) && !o51.f(state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                        }
                        if (channelSegment.getElement$kotlinx_coroutines_core(i3) != null) {
                            fo.n("Check failed.");
                            return;
                        }
                    }
                }
            }
            if (i2 == BufferedChannelKt.SEGMENT_SIZE && channelSegment != receiveSegment$volatile$FU.get(this) && channelSegment != sendSegment$volatile$FU.get(this) && channelSegment != bufferEndSegment$volatile$FU.get(this)) {
                b81.q(this, "Logically removed segment is reachable.\nChannel state: ");
                return;
            } else {
                S next5 = channelSegment.getNext();
                next5.getClass();
                channelSegment = (ChannelSegment) next5;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return closeOrCancelImpl(th, false);
    }

    public boolean closeOrCancelImpl(Throwable th, boolean z) {
        boolean z2;
        if (z) {
            markCancellationStarted();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$volatile$FU;
        Symbol symbol = BufferedChannelKt.NO_CLOSE_CAUSE;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != symbol) {
                z2 = false;
                break;
            }
        }
        if (z) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (z2) {
            invokeCloseHandler();
        }
        return z2;
    }

    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j) {
        ChannelSegment<E> channelSegment;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j2 = receivers$volatile$FU.get(this);
            if (j < Math.max(((long) this.capacity) + j2, this.getBufferEndCounter())) {
                return;
            }
            BufferedChannel<E> bufferedChannel = this;
            this = bufferedChannel;
            if (receivers$volatile$FU.compareAndSet(bufferedChannel, j2, 1 + j2)) {
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = j2 / ((long) i);
                int i2 = (int) (j2 % ((long) i));
                if (channelSegment2.id != j3) {
                    ChannelSegment<E> channelSegmentFindSegmentReceive = this.findSegmentReceive(j3, channelSegment2);
                    if (channelSegmentFindSegmentReceive != null) {
                        channelSegment = channelSegmentFindSegmentReceive;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                Object objUpdateCellReceive = this.updateCellReceive(channelSegment, i2, j2, null);
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    channelSegment.cleanPrev();
                    lu0 lu0Var = this.onUndeliveredElement;
                    if (lu0Var != null && (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lu0Var, objUpdateCellReceive, null, 2, null)) != null) {
                        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
                    }
                } else if (j2 < this.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                channelSegment2 = channelSegment;
            }
        }
    }

    public final Throwable getCloseCause() {
        return (Throwable) _closeCause$volatile$FU.get(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        bufferedChannel$onReceive$1.getClass();
        da0.o(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        bufferedChannel$onReceive$2.getClass();
        da0.o(3, bufferedChannel$onReceive$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        bufferedChannel$onReceiveCatching$1.getClass();
        da0.o(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        bufferedChannel$onReceiveCatching$2.getClass();
        da0.o(3, bufferedChannel$onReceiveCatching$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        bufferedChannel$onReceiveOrNull$1.getClass();
        da0.o(3, bufferedChannel$onReceiveOrNull$1);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        bufferedChannel$onReceiveOrNull$2.getClass();
        da0.o(3, bufferedChannel$onReceiveOrNull$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceiveOrNull$1, bufferedChannel$onReceiveOrNull$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        bufferedChannel$onSend$1.getClass();
        da0.o(3, bufferedChannel$onSend$1);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        bufferedChannel$onSend$2.getClass();
        da0.o(3, bufferedChannel$onSend$2);
        return new SelectClause2Impl(this, bufferedChannel$onSend$1, bufferedChannel$onSend$2, null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    public final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            ChannelSegment<E> channelSegmentFindSegmentReceive = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = receiversCounter$kotlinx_coroutines_core / ((long) i);
            if (channelSegmentFindSegmentReceive.id == j || (channelSegmentFindSegmentReceive = findSegmentReceive(j, channelSegmentFindSegmentReceive)) != null) {
                channelSegmentFindSegmentReceive.cleanPrev();
                if (isCellNonEmpty(channelSegmentFindSegmentReceive, (int) (receiversCounter$kotlinx_coroutines_core % ((long) i)), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id < j) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(lu0 lu0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lu0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$volatile$FU;
                while (true) {
                    Object obj = atomicReferenceFieldUpdater2.get(this);
                    if (obj != BufferedChannelKt.CLOSE_HANDLER_CLOSED) {
                        if (obj == BufferedChannelKt.CLOSE_HANDLER_INVOKED) {
                            fo.n("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            fo.o(obj, "Another handler is already registered: ");
                            return;
                        }
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = closeHandler$volatile$FU;
                    Symbol symbol = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
                    Symbol symbol2 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                    do {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, symbol, symbol2)) {
                            lu0Var.invoke(getCloseCause());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater3.get(this) == symbol);
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    public boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @cc0
    public boolean offer(E e) {
        return Channel.DefaultImpls.offer(this, e);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @cc0
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(q60 q60Var) {
        return receive$suspendImpl(this, q60Var);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo38receiveCatchingJP2dKIU(q60 q60Var) {
        return m36receiveCatchingJP2dKIU$suspendImpl(this, q60Var);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @cc0
    public Object receiveOrNull(q60 q60Var) {
        return Channel.DefaultImpls.receiveOrNull(this, q60Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlinx.coroutines.channels.BufferedChannel<E>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlinx.coroutines.channels.BufferedChannel] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.coroutines.channels.BufferedChannel] */
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) throws IllegalAccessException, InvocationTargetException {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = this.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment2.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = this.findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    this.onClosedSelectOnSend(obj, selectInstance);
                    return;
                }
            } else {
                channelSegment = channelSegment2;
            }
            ?? r5 = this;
            SelectInstance<?> selectInstance2 = selectInstance;
            Object obj2 = obj;
            int iUpdateCellSend = r5.updateCellSend(channelSegment, i2, obj2, j, selectInstance2, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            mf3 mf3Var = mf3.a;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                selectInstance2.selectInRegistrationPhase(mf3Var);
                return;
            }
            if (iUpdateCellSend == 1) {
                selectInstance2.selectInRegistrationPhase(mf3Var);
                return;
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    r5.onClosedSelectOnSend(obj2, selectInstance2);
                    return;
                } else {
                    Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                    if (waiter != null) {
                        r5.prepareSenderForSuspension(waiter, channelSegment2, i2);
                        return;
                    }
                    return;
                }
            }
            if (iUpdateCellSend == 3) {
                fo.n("unexpected");
                return;
            }
            if (iUpdateCellSend == 4) {
                if (j < r5.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                r5.onClosedSelectOnSend(obj2, selectInstance2);
                return;
            } else {
                if (iUpdateCellSend == 5) {
                    channelSegment2.cleanPrev();
                }
                this = (BufferedChannel<E>) r5;
                obj = obj2;
                selectInstance = selectInstance2;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e, q60 q60Var) {
        return send$suspendImpl(this, e, q60Var);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E e, q60 q60Var) {
        return sendBroadcast$suspendImpl(this, e, q60Var);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String str;
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        int i2 = 0;
        List listG = am1.G(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            b81.p();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: while (true) {
            int i3 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i4 = i2; i4 < i3; i4++) {
                long j3 = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i4);
                if (j3 >= sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                    str = null;
                    break loop2;
                }
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i4);
                Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i4);
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    string = (j3 >= receiversCounter$kotlinx_coroutines_core || j3 < sendersCounter$kotlinx_coroutines_core) ? (j3 >= sendersCounter$kotlinx_coroutines_core || j3 < receiversCounter$kotlinx_coroutines_core) ? "cont" : "send" : "receive";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    string = (j3 >= receiversCounter$kotlinx_coroutines_core || j3 < sendersCounter$kotlinx_coroutines_core) ? (j3 >= sendersCounter$kotlinx_coroutines_core || j3 < receiversCounter$kotlinx_coroutines_core) ? "select" : "onSend" : "onReceive";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    string = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    string = "sendBroadcast";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    string = "EB(" + state$kotlinx_coroutines_core + ')';
                } else if (o51.f(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV) || o51.f(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    string = "resuming_sender";
                } else {
                    if (state$kotlinx_coroutines_core != null && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.IN_BUFFER) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.DONE_RCV) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.POISONED) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.INTERRUPTED_RCV) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.INTERRUPTED_SEND) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.getCHANNEL_CLOSED())) {
                        string = state$kotlinx_coroutines_core.toString();
                    }
                }
                if (element$kotlinx_coroutines_core != null) {
                    sb.append("(" + string + ',' + element$kotlinx_coroutines_core + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            str = null;
            channelSegment = (ChannelSegment) channelSegment.getNext();
            if (channelSegment == null) {
                break;
            }
            i2 = 0;
        }
        if (sb.length() == 0) {
            b81.y("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("S=");
        sb.append(getSendersCounter$kotlinx_coroutines_core());
        sb.append(",R=");
        sb.append(getReceiversCounter$kotlinx_coroutines_core());
        sb.append(",B=");
        sb.append(getBufferEndCounter());
        sb.append(",B'=");
        sb.append(completedExpandBuffersAndPauseFlag$volatile$FU.get(this));
        sb.append(",C=");
        StringBuilder sb2 = new StringBuilder(az2.o(sb, (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60), ','));
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 1) {
            sb2.append("CANCELLATION_STARTED,");
        } else if (i == 2) {
            sb2.append("CLOSED,");
        } else if (i == 3) {
            sb2.append("CANCELLED,");
        }
        sb2.append("SEND_SEGM=" + DebugStringsKt.getHexAddress(sendSegment$volatile$FU.get(this)) + ",RCV_SEGM=" + DebugStringsKt.getHexAddress(receiveSegment$volatile$FU.get(this)));
        if (!isRendezvousOrUnlimited()) {
            sb2.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(bufferEndSegment$volatile$FU.get(this)));
        }
        sb2.append("  ");
        List listG = am1.G(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            b81.p();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        do {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(DebugStringsKt.getHexAddress(channelSegment));
            sb3.append("=[");
            sb3.append(channelSegment.isRemoved() ? "*" : "");
            sb3.append(channelSegment.id);
            sb3.append(",prev=");
            ChannelSegment channelSegment2 = (ChannelSegment) channelSegment.getPrev();
            sb3.append(channelSegment2 != null ? DebugStringsKt.getHexAddress(channelSegment2) : null);
            sb3.append(',');
            sb2.append(sb3.toString());
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i3 = 0; i3 < i2; i3++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i3);
                Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i3);
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    strValueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    strValueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    strValueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    strValueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    strValueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    strValueOf = String.valueOf(state$kotlinx_coroutines_core);
                }
                sb2.append("[" + i3 + "]=(" + strValueOf + ',' + element$kotlinx_coroutines_core + "),");
            }
            StringBuilder sb4 = new StringBuilder("next=");
            ChannelSegment channelSegment3 = (ChannelSegment) channelSegment.getNext();
            sb4.append(channelSegment3 != null ? DebugStringsKt.getHexAddress(channelSegment3) : null);
            sb4.append("]  ");
            sb2.append(sb4.toString());
            channelSegment = (ChannelSegment) channelSegment.getNext();
        } while (channelSegment != null);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo39tryReceivePtdJZtk() {
        ChannelSegment channelSegmentFindSegmentReceive;
        long j = receivers$volatile$FU.get(this);
        long j2 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j2)) {
            return ChannelResult.Companion.m59closedJP2dKIU(getCloseCause());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return ChannelResult.Companion.m60failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_RCV;
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!this.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (channelSegment.id != j3) {
                channelSegmentFindSegmentReceive = this.findSegmentReceive(j3, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                }
            } else {
                channelSegmentFindSegmentReceive = channelSegment;
            }
            BufferedChannel<E> bufferedChannel = this;
            Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i2, andIncrement, obj);
            channelSegment = channelSegmentFindSegmentReceive;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment, i2);
                }
                bufferedChannel.waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegment.onSlotCleaned();
                return ChannelResult.Companion.m60failurePtdJZtk();
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                    channelSegment.cleanPrev();
                    return ChannelResult.Companion.m61successJP2dKIU(objUpdateCellReceive);
                }
                fo.n("unexpected");
                return null;
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            this = bufferedChannel;
        }
        return ChannelResult.Companion.m59closedJP2dKIU(this.getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo32trySendJP2dKIU(E e) {
        ChannelSegment channelSegment;
        if (shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this))) {
            return ChannelResult.Companion.m60failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_SEND;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = this.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment2.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = this.findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return ChannelResult.Companion.m59closedJP2dKIU(this.getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int iUpdateCellSend = this.updateCellSend(channelSegment, i2, e, j, obj, zIsClosedForSend0);
            BufferedChannel<E> bufferedChannel = this;
            channelSegment2 = channelSegment;
            mf3 mf3Var = mf3.a;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                return ChannelResult.Companion.m61successJP2dKIU(mf3Var);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m61successJP2dKIU(mf3Var);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    return ChannelResult.Companion.m59closedJP2dKIU(bufferedChannel.getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment2, i2);
                }
                channelSegment2.onSlotCleaned();
                return ChannelResult.Companion.m60failurePtdJZtk();
            }
            if (iUpdateCellSend == 3) {
                fo.n("unexpected");
                return null;
            }
            if (iUpdateCellSend == 4) {
                if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return ChannelResult.Companion.m59closedJP2dKIU(bufferedChannel.getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment2.cleanPrev();
            }
            this = bufferedChannel;
            e = e;
        }
    }

    /* JADX INFO: renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    public final Object m40trySendDropOldestJP2dKIU(E e) {
        ChannelSegment channelSegmentFindSegmentSend;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = this.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment.id != j2) {
                channelSegmentFindSegmentSend = this.findSegmentSend(j2, channelSegment);
                if (channelSegmentFindSegmentSend == null) {
                    if (zIsClosedForSend0) {
                        return ChannelResult.Companion.m59closedJP2dKIU(this.getSendException());
                    }
                }
            } else {
                channelSegmentFindSegmentSend = channelSegment;
            }
            E e2 = e;
            int iUpdateCellSend = this.updateCellSend(channelSegmentFindSegmentSend, i2, e2, j, obj, zIsClosedForSend0);
            BufferedChannel<E> bufferedChannel = this;
            channelSegment = channelSegmentFindSegmentSend;
            mf3 mf3Var = mf3.a;
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m61successJP2dKIU(mf3Var);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m61successJP2dKIU(mf3Var);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m59closedJP2dKIU(bufferedChannel.getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                bufferedChannel.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * ((long) i)) + ((long) i2));
                return ChannelResult.Companion.m61successJP2dKIU(mf3Var);
            }
            if (iUpdateCellSend == 3) {
                fo.n("unexpected");
                return null;
            }
            if (iUpdateCellSend == 4) {
                if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.Companion.m59closedJP2dKIU(bufferedChannel.getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            this = bufferedChannel;
            e = e2;
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j) {
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.isRendezvousOrUnlimited()) {
            return;
        }
        while (bufferedChannel.getBufferEndCounter() <= j) {
            bufferedChannel = this;
        }
        int i = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i2 = 0; i2 < i; i2++) {
            long bufferEndCounter = bufferedChannel.getBufferEndCounter();
            if (bufferEndCounter == (4611686018427387903L & completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel)) && bufferEndCounter == bufferedChannel.getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j2, BufferedChannelKt.constructEBCompletedAndPauseFlag(j2 & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long bufferEndCounter2 = bufferedChannel.getBufferEndCounter();
            long j3 = completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel);
            long j4 = j3 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j3) != 0;
            if (bufferEndCounter2 == j4 && bufferEndCounter2 == bufferedChannel.getBufferEndCounter()) {
                break;
            }
            if (z) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                completedExpandBuffersAndPauseFlag$volatile$FU.compareAndSet(bufferedChannel, j3, BufferedChannelKt.constructEBCompletedAndPauseFlag(j4, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j5 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j5, BufferedChannelKt.constructEBCompletedAndPauseFlag(j5 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o81 bindCancellationFun(lu0 lu0Var) {
        return new AnonymousClass2(this);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public /* synthetic */ class AnonymousClass2 extends bv0 implements qu0 {
        public AnonymousClass2(Object obj) {
            super(3, 0, BufferedChannel.class, obj, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
        }

        @Override // defpackage.qu0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
            invoke((Throwable) obj, obj2, (y70) obj3);
            return mf3.a;
        }

        public final void invoke(Throwable th, E e, y70 y70Var) throws IllegalAccessException, InvocationTargetException {
            ((BufferedChannel) this.receiver).onCancellationImplDoNotCall(th, e, y70Var);
        }
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public void onClosedIdempotent() {
    }

    public void onReceiveDequeued() {
    }

    public void onReceiveEnqueued() {
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;

        public BufferedChannelIterator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j, q60 q60Var) {
            Boolean bool;
            lu0 lu0Var;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(hd0.G(q60Var));
            try {
                this.continuation = orCreateCancellableContinuation;
                Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, j, this);
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                    bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i);
                } else {
                    qu0 qu0VarBindCancellationFun = null;
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (j < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                            } else {
                                long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                                int i2 = BufferedChannelKt.SEGMENT_SIZE;
                                long j2 = andIncrement / ((long) i2);
                                int i3 = (int) (andIncrement % ((long) i2));
                                if (channelSegment2.id != j2) {
                                    ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment2);
                                    if (channelSegmentFindSegmentReceive != null) {
                                        channelSegment2 = channelSegmentFindSegmentReceive;
                                    }
                                }
                                objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment2, i3, andIncrement, this);
                                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                                    bufferedChannel.prepareReceiverForSuspension(this, channelSegment2, i3);
                                } else {
                                    if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        channelSegment2.cleanPrev();
                                        this.receiveResult = objUpdateCellReceive;
                                        this.continuation = null;
                                        bool = Boolean.TRUE;
                                        lu0Var = bufferedChannel.onUndeliveredElement;
                                        if (lu0Var == null) {
                                            break;
                                        }
                                        qu0VarBindCancellationFun = bufferedChannel.bindCancellationFun(lu0Var, objUpdateCellReceive);
                                        break;
                                    }
                                    if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                        channelSegment2.cleanPrev();
                                    }
                                }
                            }
                        }
                        orCreateCancellableContinuation.resume(bool, qu0VarBindCancellationFun);
                    } else {
                        channelSegment.cleanPrev();
                        this.receiveResult = objUpdateCellReceive;
                        this.continuation = null;
                        bool = Boolean.TRUE;
                        lu0Var = bufferedChannel.onUndeliveredElement;
                        if (lu0Var != null) {
                            qu0VarBindCancellationFun = bufferedChannel.bindCancellationFun(lu0Var, objUpdateCellReceive);
                            break;
                        }
                        orCreateCancellableContinuation.resume(bool, qu0VarBindCancellationFun);
                    }
                }
                return orCreateCancellableContinuation.getResult();
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }

        private final boolean onClosedHasNext() throws Throwable {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            cancellableContinuationImpl.getClass();
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
            } else {
                cancellableContinuationImpl.resumeWith(new wg2(closeCause));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(q60 q60Var) throws Throwable {
            ChannelSegment<E> channelSegmentFindSegmentReceive;
            boolean zOnClosedHasNext = true;
            if (this.receiveResult == BufferedChannelKt.NO_RECEIVE_RESULT || this.receiveResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                ChannelSegment<E> channelSegment = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    int i = BufferedChannelKt.SEGMENT_SIZE;
                    long j = andIncrement / ((long) i);
                    int i2 = (int) (andIncrement % ((long) i));
                    if (channelSegment.id != j) {
                        channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                        if (channelSegmentFindSegmentReceive == null) {
                            continue;
                        }
                    } else {
                        channelSegmentFindSegmentReceive = channelSegment;
                    }
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i2, andIncrement, null);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        fo.n("unreachable");
                        return null;
                    }
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegmentFindSegmentReceive.cleanPrev();
                        }
                        channelSegment = channelSegmentFindSegmentReceive;
                    } else {
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                            return hasNextOnNoWaiterSuspend(channelSegmentFindSegmentReceive, i2, andIncrement, q60Var);
                        }
                        channelSegmentFindSegmentReceive.cleanPrev();
                        this.receiveResult = objUpdateCellReceive;
                    }
                }
                zOnClosedHasNext = onClosedHasNext();
            }
            return Boolean.valueOf(zOnClosedHasNext);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, i);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e = (E) this.receiveResult;
            if (e == BufferedChannelKt.NO_RECEIVE_RESULT) {
                fo.n("`hasNext()` has not been invoked");
                return null;
            }
            this.receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e != BufferedChannelKt.getCHANNEL_CLOSED()) {
                return e;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.getReceiveException());
        }

        public final boolean tryResumeHasNext(E e) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            cancellableContinuationImpl.getClass();
            this.continuation = null;
            this.receiveResult = e;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            lu0 lu0Var = bufferedChannel.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, bool, lu0Var != null ? bufferedChannel.bindCancellationFun(lu0Var, e) : null);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            cancellableContinuationImpl.getClass();
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
            } else {
                cancellableContinuationImpl.resumeWith(new wg2(closeCause));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @cc0
        public /* synthetic */ Object next(q60 q60Var) {
            return ChannelIterator.DefaultImpls.next(this, q60Var);
        }
    }

    public /* synthetic */ BufferedChannel(int i, lu0 lu0Var, int i2, ca0 ca0Var) {
        this(i, (i2 & 2) != 0 ? null : lu0Var);
    }
}
