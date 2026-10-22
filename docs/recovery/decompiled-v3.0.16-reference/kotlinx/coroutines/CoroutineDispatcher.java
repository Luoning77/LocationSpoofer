package kotlinx.coroutines;

import defpackage.a0;
import defpackage.b81;
import defpackage.ca0;
import defpackage.cc0;
import defpackage.j9;
import defpackage.my;
import defpackage.q60;
import defpackage.s60;
import defpackage.sj0;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;
import defpackage.z;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class CoroutineDispatcher extends z implements s60 {
    public static final Key Key = new Key(null);

    public CoroutineDispatcher() {
        super(j9.B);
    }

    public static /* synthetic */ CoroutineDispatcher limitedParallelism$default(CoroutineDispatcher coroutineDispatcher, int i, String str, int i2, Object obj) {
        if (obj != null) {
            b81.s("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return coroutineDispatcher.limitedParallelism(i, str);
    }

    /* JADX INFO: renamed from: dispatch */
    public abstract void mo90dispatch(y70 y70Var, Runnable runnable);

    public void dispatchYield(y70 y70Var, Runnable runnable) {
        DispatchedContinuationKt.safeDispatch(this, y70Var, runnable);
    }

    @Override // defpackage.z, defpackage.y70
    public <E extends w70> E get(x70 x70Var) {
        E e;
        x70Var.getClass();
        if (!(x70Var instanceof a0)) {
            if (j9.B == x70Var) {
                return this;
            }
            return null;
        }
        a0 a0Var = (a0) x70Var;
        if (!a0Var.isSubKey$kotlin_stdlib(getKey()) || (e = (E) a0Var.tryCast$kotlin_stdlib(this)) == null) {
            return null;
        }
        return e;
    }

    @Override // defpackage.s60
    public final <T> q60 interceptContinuation(q60 q60Var) {
        return new DispatchedContinuation(this, q60Var);
    }

    public boolean isDispatchNeeded(y70 y70Var) {
        return true;
    }

    public CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return new LimitedDispatcher(this, i, str);
    }

    @Override // defpackage.z, defpackage.y70
    public y70 minusKey(x70 x70Var) {
        x70Var.getClass();
        if (x70Var instanceof a0) {
            a0 a0Var = (a0) x70Var;
            if (!a0Var.isSubKey$kotlin_stdlib(getKey()) || a0Var.tryCast$kotlin_stdlib(this) == null) {
                return this;
            }
        } else if (j9.B != x70Var) {
            return this;
        }
        return sj0.e;
    }

    @Override // defpackage.s60
    public final void releaseInterceptedContinuation(q60 q60Var) {
        q60Var.getClass();
        ((DispatchedContinuation) q60Var).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }

    @cc0
    public /* synthetic */ CoroutineDispatcher limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    /* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
    public static final class Key extends a0 {
        private Key() {
            super(j9.B, new my(7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CoroutineDispatcher _init_$lambda$0(w70 w70Var) {
            if (w70Var instanceof CoroutineDispatcher) {
                return (CoroutineDispatcher) w70Var;
            }
            return null;
        }

        public /* synthetic */ Key(ca0 ca0Var) {
            this();
        }
    }

    @cc0
    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }
}
