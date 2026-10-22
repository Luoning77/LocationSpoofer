package kotlinx.coroutines.internal;

import defpackage.au0;
import defpackage.fo;
import defpackage.lu0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ConcurrentLinkedListNode(N n) {
        this._prev$volatile = n;
    }

    private final N getAliveSegmentLeft() {
        N n = (N) getPrev();
        while (n != null && n.isRemoved()) {
            n = (N) _prev$volatile$FU.get(n);
        }
        return n;
    }

    private final N getAliveSegmentRight() {
        ConcurrentLinkedListNode next;
        N n = (N) getNext();
        n.getClass();
        while (n.isRemoved() && (next = n.getNext()) != null) {
            n = (N) next;
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getNextOrClosed() {
        return _next$volatile$FU.get(this);
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_prev$volatile(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object objInvoke = lu0Var.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                }
            }
            return;
        }
    }

    public final void cleanPrev() {
        _prev$volatile$FU.set(this, null);
    }

    public final N getNext() {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed == ConcurrentLinkedListKt.CLOSED) {
            return null;
        }
        return (N) nextOrClosed;
    }

    public final N getPrev() {
        return (N) _prev$volatile$FU.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        Symbol symbol = ConcurrentLinkedListKt.CLOSED;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        return true;
    }

    public final N nextOrIfClosed(au0 au0Var) {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed != ConcurrentLinkedListKt.CLOSED) {
            return (N) nextOrClosed;
        }
        au0Var.invoke();
        fo.d();
        return null;
    }

    public final void remove() {
        if (isTail()) {
            return;
        }
        while (true) {
            ConcurrentLinkedListNode aliveSegmentLeft = getAliveSegmentLeft();
            ConcurrentLinkedListNode aliveSegmentRight = getAliveSegmentRight();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$volatile$FU;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(aliveSegmentRight);
                ConcurrentLinkedListNode concurrentLinkedListNode = ((ConcurrentLinkedListNode) obj) == null ? null : aliveSegmentLeft;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(aliveSegmentRight, obj, concurrentLinkedListNode)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(aliveSegmentRight) != obj) {
                    }
                }
            }
            if (aliveSegmentLeft != null) {
                _next$volatile$FU.set(aliveSegmentLeft, aliveSegmentRight);
            }
            if (!aliveSegmentRight.isRemoved() || aliveSegmentRight.isTail()) {
                if (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(N n) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, n)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        return true;
    }
}
