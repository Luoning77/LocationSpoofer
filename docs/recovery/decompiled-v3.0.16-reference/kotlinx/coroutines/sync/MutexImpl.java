package kotlinx.coroutines.sync;

import defpackage.au;
import defpackage.bu;
import defpackage.cc0;
import defpackage.da0;
import defpackage.fo;
import defpackage.hd0;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.o51;
import defpackage.q60;
import defpackage.qu0;
import defpackage.y70;
import defpackage.z70;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {
    private static final /* synthetic */ AtomicReferenceFieldUpdater owner$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private final qu0 onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {
        public final Object owner;
        public final SelectInstanceInternal<Q> select;

        public SelectInstanceWithOwner(SelectInstanceInternal<Q> selectInstanceInternal, Object obj) {
            this.select = selectInstanceInternal;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(DisposableHandle disposableHandle) {
            this.select.disposeOnCompletion(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public y70 getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            this.select.invokeOnCancellation(segment, i);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(Object obj) {
            MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            this.select.selectInRegistrationPhase(obj);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(Object obj, Object obj2) {
            boolean zTrySelect = this.select.trySelect(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (zTrySelect) {
                MutexImpl.getOwner$volatile$FU().set(mutexImpl, this.owner);
            }
            return zTrySelect;
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : MutexKt.NO_OWNER;
        this.onSelectCancellationUnlockConstructor = new au(this, 7);
    }

    private final /* synthetic */ Object getOwner$volatile() {
        return this.owner$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getOwner$volatile$FU() {
        return owner$volatile$FU;
    }

    private final int holdsLockImpl(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$volatile$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public static Object lock$suspendImpl(MutexImpl mutexImpl, Object obj, q60 q60Var) {
        Object objLockSuspend;
        boolean zTryLock = mutexImpl.tryLock(obj);
        mf3 mf3Var = mf3.a;
        return (!zTryLock && (objLockSuspend = mutexImpl.lockSuspend(obj, q60Var)) == z70.e) ? objLockSuspend : mf3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lockSuspend(Object obj, q60 q60Var) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(hd0.G(q60Var));
        try {
            acquire((CancellableContinuation<? super mf3>) new CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
            Object result = orCreateCancellableContinuation.getResult();
            return result == z70.e ? result : mf3.a;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qu0 onSelectCancellationUnlockConstructor$lambda$1(MutexImpl mutexImpl, SelectInstance selectInstance, Object obj, Object obj2) {
        return new bu(6, mutexImpl, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf3 onSelectCancellationUnlockConstructor$lambda$1$lambda$0(MutexImpl mutexImpl, Object obj, Throwable th, Object obj2, y70 y70Var) {
        mutexImpl.unlock(obj);
        return mf3.a;
    }

    private final /* synthetic */ void setOwner$volatile(Object obj) {
        this.owner$volatile = obj;
    }

    private final int tryLockImpl(Object obj) {
        while (!tryAcquire()) {
            if (obj == null) {
                return 1;
            }
            int iHoldsLockImpl = holdsLockImpl(obj);
            if (iHoldsLockImpl == 1) {
                return 2;
            }
            if (iHoldsLockImpl == 2) {
                return 1;
            }
        }
        owner$volatile$FU.set(this, obj);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.INSTANCE;
        mutexImpl$onLock$1.getClass();
        da0.o(3, mutexImpl$onLock$1);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.INSTANCE;
        mutexImpl$onLock$2.getClass();
        da0.o(3, mutexImpl$onLock$2);
        return new SelectClause2Impl(this, mutexImpl$onLock$1, mutexImpl$onLock$2, this.onSelectCancellationUnlockConstructor);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object obj) {
        return holdsLockImpl(obj) == 1;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, q60 q60Var) {
        return lock$suspendImpl(this, obj, q60Var);
    }

    public Object onLockProcessResult(Object obj, Object obj2) {
        if (!o51.f(obj2, MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER)) {
            return this;
        }
        fo.o(obj, "This mutex is already locked by the specified owner: ");
        return null;
    }

    public void onLockRegFunction(SelectInstance<?> selectInstance, Object obj) {
        if (obj != null && holdsLock(obj)) {
            selectInstance.selectInRegistrationPhase(MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER);
        } else {
            selectInstance.getClass();
            onAcquireRegFunction(new SelectInstanceWithOwner((SelectInstanceInternal) selectInstance, obj), obj);
        }
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$volatile$FU.get(this) + ']';
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object obj) {
        int iTryLockImpl = tryLockImpl(obj);
        if (iTryLockImpl == 0) {
            return true;
        }
        if (iTryLockImpl == 1) {
            return false;
        }
        if (iTryLockImpl != 2) {
            fo.n("unexpected");
            return false;
        }
        fo.o(obj, "This mutex is already locked by the specified owner: ");
        return false;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$volatile$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = owner$volatile$FU;
                Symbol symbol = MutexKt.NO_OWNER;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        release();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        fo.n("This mutex is not locked");
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public final class CancellableContinuationWithOwner implements CancellableContinuation<mf3>, Waiter {
        public final CancellableContinuationImpl<mf3> cont;
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(CancellableContinuationImpl<? super mf3> cancellableContinuationImpl, Object obj) {
            this.cont = cancellableContinuationImpl;
            this.owner = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf3 resume$lambda$6(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th) {
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return mf3.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mf3 tryResume$lambda$3(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th, mf3 mf3Var, y70 y70Var) {
            MutexImpl.getOwner$volatile$FU().set(mutexImpl, cancellableContinuationWithOwner.owner);
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return mf3.a;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(Throwable th) {
            return this.cont.cancel(th);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(Object obj) {
            this.cont.completeResume(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation, defpackage.q60
        public y70 getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void initCancellability() {
            this.cont.initCancellability();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(lu0 lu0Var) {
            this.cont.invokeOnCancellation(lu0Var);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public <R extends mf3> void resume(R r, qu0 qu0Var) {
            MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            CancellableContinuationImpl<mf3> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            cancellableContinuationImpl.resume(r, new lu0() { // from class: kotlinx.coroutines.sync.b
                @Override // defpackage.lu0
                public final Object invoke(Object obj) {
                    return MutexImpl.CancellableContinuationWithOwner.resume$lambda$6(mutexImpl, this, (Throwable) obj);
                }
            });
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, mf3 mf3Var) {
            this.cont.resumeUndispatched(coroutineDispatcher, mf3Var);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th) {
            this.cont.resumeUndispatchedWithException(coroutineDispatcher, th);
        }

        @Override // kotlinx.coroutines.CancellableContinuation, defpackage.q60
        public void resumeWith(Object obj) {
            this.cont.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public <R extends mf3> Object tryResume(R r, Object obj, qu0 qu0Var) {
            CancellableContinuationImpl<mf3> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            Object objTryResume = cancellableContinuationImpl.tryResume(r, obj, new qu0() { // from class: kotlinx.coroutines.sync.a
                @Override // defpackage.qu0
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return MutexImpl.CancellableContinuationWithOwner.tryResume$lambda$3(mutexImpl, this, (Throwable) obj2, (mf3) obj3, (y70) obj4);
                }
            });
            if (objTryResume != null) {
                MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            }
            return objTryResume;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResumeWithException(Throwable th) {
            return this.cont.tryResumeWithException(th);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            this.cont.invokeOnCancellation(segment, i);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @cc0
        public void resume(mf3 mf3Var, lu0 lu0Var) {
            this.cont.resume(mf3Var, lu0Var);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object tryResume(mf3 mf3Var, Object obj) {
            return this.cont.tryResume(mf3Var, obj);
        }
    }

    public static /* synthetic */ void getOnLock$annotations() {
    }
}
