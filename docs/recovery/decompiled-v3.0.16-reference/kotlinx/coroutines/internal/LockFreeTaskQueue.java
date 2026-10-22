package kotlinx.coroutines.internal;

import defpackage.lu0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class LockFreeTaskQueue<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _cur$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public LockFreeTaskQueue(boolean z) {
        this._cur$volatile = new LockFreeTaskQueueCore(8, z);
    }

    private final /* synthetic */ Object get_cur$volatile() {
        return this._cur$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, lu0 lu0Var) {
        while (true) {
            lu0Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_cur$volatile(Object obj) {
        this._cur$volatile = obj;
    }

    public final boolean addLast(E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            int iAddLast = lockFreeTaskQueueCore.addLast(e);
            if (iAddLast == 0) {
                return true;
            }
            if (iAddLast == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _cur$volatile$FU;
                LockFreeTaskQueueCore<E> next = lockFreeTaskQueueCore.next();
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, lockFreeTaskQueueCore, next) && atomicReferenceFieldUpdater2.get(this) == lockFreeTaskQueueCore) {
                }
            } else if (iAddLast == 2) {
                return false;
            }
        }
    }

    public final void close() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore.close()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _cur$volatile$FU;
            LockFreeTaskQueueCore<E> next = lockFreeTaskQueueCore.next();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, lockFreeTaskQueueCore, next) && atomicReferenceFieldUpdater2.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }

    public final int getSize() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).isEmpty();
    }

    public final <R> List<R> map(lu0 lu0Var) {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).map(lu0Var);
    }

    public final E removeFirstOrNull() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _cur$volatile$FU;
        while (true) {
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            E e = (E) lockFreeTaskQueueCore.removeFirstOrNull();
            if (e != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _cur$volatile$FU;
            LockFreeTaskQueueCore<E> next = lockFreeTaskQueueCore.next();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, lockFreeTaskQueueCore, next) && atomicReferenceFieldUpdater2.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }
}
