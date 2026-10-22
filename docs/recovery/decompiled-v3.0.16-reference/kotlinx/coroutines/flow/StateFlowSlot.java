package kotlinx.coroutines.flow;

import defpackage.hd0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.z70;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Concurrent_commonKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {
    private final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(StateFlowImpl<?> stateFlowImpl) {
        if (Concurrent_commonKt.getValue(this._state) != null) {
            return false;
        }
        Concurrent_commonKt.setValue(this._state, StateFlowKt.NONE);
        return true;
    }

    public final Object awaitPending(q60 q60Var) {
        mf3 mf3Var;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(hd0.G(q60Var), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReference atomicReference = this._state;
        Symbol symbol = StateFlowKt.NONE;
        while (true) {
            boolean zCompareAndSet = atomicReference.compareAndSet(symbol, cancellableContinuationImpl);
            mf3Var = mf3.a;
            if (zCompareAndSet) {
                break;
            }
            if (atomicReference.get() != symbol) {
                cancellableContinuationImpl.resumeWith(mf3Var);
                break;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == z70.e ? result : mf3Var;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public q60[] freeLocked(StateFlowImpl<?> stateFlowImpl) {
        Concurrent_commonKt.setValue(this._state, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    public final void makePending() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object value = Concurrent_commonKt.getValue(atomicReference);
            if (value == null || value == StateFlowKt.PENDING) {
                return;
            }
            Symbol symbol = StateFlowKt.NONE;
            AtomicReference<Object> atomicReference2 = this._state;
            if (value == symbol) {
                Symbol symbol2 = StateFlowKt.PENDING;
                while (!atomicReference2.compareAndSet(value, symbol2)) {
                    if (atomicReference2.get() != value) {
                    }
                }
                return;
            } else {
                Symbol symbol3 = StateFlowKt.NONE;
                do {
                    if (atomicReference2.compareAndSet(value, symbol3)) {
                        ((CancellableContinuationImpl) value).resumeWith(mf3.a);
                        return;
                    }
                } while (atomicReference2.get() == value);
            }
        }
    }

    public final boolean takePending() {
        Object andSet = this._state.getAndSet(StateFlowKt.NONE);
        andSet.getClass();
        return andSet == StateFlowKt.PENDING;
    }
}
