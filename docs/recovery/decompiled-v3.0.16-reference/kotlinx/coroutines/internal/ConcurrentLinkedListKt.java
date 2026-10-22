package kotlinx.coroutines.internal;

import defpackage.lu0;
import defpackage.pu0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ConcurrentLinkedListKt {
    private static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_ARRAY$Int(AtomicIntegerArray atomicIntegerArray, int i, int i2, lu0 lu0Var) {
        int i3;
        do {
            i3 = atomicIntegerArray.get(i);
            if (!((Boolean) lu0Var.invoke(Integer.valueOf(i3))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i3, i3 + i2));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, int i, lu0 lu0Var) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
            if (!((Boolean) lu0Var.invoke(Integer.valueOf(i2))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, i2 + i));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$BOXED_ATOMIC$Int(AtomicInteger atomicInteger, int i, lu0 lu0Var) {
        int i2;
        do {
            i2 = atomicInteger.get();
            if (!((Boolean) lu0Var.invoke(Integer.valueOf(i2))).booleanValue()) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + i));
        return true;
    }

    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n) {
        while (true) {
            Object nextOrClosed = n.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) nextOrClosed;
            if (concurrentLinkedListNode != null) {
                n = (N) concurrentLinkedListNode;
            } else if (n.markAsClosed()) {
                return n;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$ATOMIC_ARRAY$Any(AtomicReferenceArray atomicReferenceArray, int i, long j, S s, pu0 pu0Var) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s, j, pu0Var);
            if (SegmentOrClosed.m98isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM96getSegmentimpl = SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceArray.get(i);
                if (segment.id >= segmentM96getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM96getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if (atomicReferenceArray.compareAndSet(i, segment, segmentM96getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                        return objFindSegmentInternal;
                    }
                } while (atomicReferenceArray.get(i) == segment);
                if (segmentM96getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM96getSegmentimpl.remove();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, long j, S s, pu0 pu0Var) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s, j, pu0Var);
            if (SegmentOrClosed.m98isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM96getSegmentimpl = SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                if (segment.id >= segmentM96getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM96getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(obj, segment, segmentM96getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                        return objFindSegmentInternal;
                    }
                } while (atomicReferenceFieldUpdater.get(obj) == segment);
                if (segmentM96getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM96getSegmentimpl.remove();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, long j, S s, pu0 pu0Var) {
        while (true) {
            Object objFindSegmentInternal = findSegmentInternal(s, j, pu0Var);
            if (SegmentOrClosed.m98isClosedimpl(objFindSegmentInternal)) {
                return objFindSegmentInternal;
            }
            Segment segmentM96getSegmentimpl = SegmentOrClosed.m96getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReference.get();
                if (segment.id >= segmentM96getSegmentimpl.id) {
                    return objFindSegmentInternal;
                }
                if (!segmentM96getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(segment, segmentM96getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                        return objFindSegmentInternal;
                    }
                } while (atomicReference.get() == segment);
                if (segmentM96getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM96getSegmentimpl.remove();
                }
            }
        }
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s, long j, pu0 pu0Var) {
        while (true) {
            if (s.id >= j && !s.isRemoved()) {
                return SegmentOrClosed.m93constructorimpl(s);
            }
            Object nextOrClosed = s.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m93constructorimpl(CLOSED);
            }
            Segment segment = (Segment) ((ConcurrentLinkedListNode) nextOrClosed);
            if (segment == null) {
                segment = (Segment) pu0Var.invoke(Long.valueOf(s.id + 1), s);
                if (s.trySetNext(segment)) {
                    if (s.isRemoved()) {
                        s.remove();
                    }
                }
            }
            s = (S) segment;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$ATOMIC_ARRAY$Any(AtomicReferenceArray atomicReferenceArray, int i, S s) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i);
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            do {
                if (atomicReferenceArray.compareAndSet(i, segment, s)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return true;
                }
            } while (atomicReferenceArray.get(i) == segment);
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, S s) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(obj, segment, s)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(obj) == segment);
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$BOXED_ATOMIC$Any(AtomicReference atomicReference, S s) {
        while (true) {
            Segment segment = (Segment) atomicReference.get();
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            do {
                if (atomicReference.compareAndSet(segment, s)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                    return true;
                }
            } while (atomicReference.get() == segment);
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }
}
