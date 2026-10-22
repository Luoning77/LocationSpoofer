package kotlinx.coroutines.intrinsics;

import defpackage.au0;
import defpackage.ee0;
import defpackage.hd0;
import defpackage.lu0;
import defpackage.mf3;
import defpackage.oq;
import defpackage.p51;
import defpackage.pu0;
import defpackage.q51;
import defpackage.q60;
import defpackage.sj0;
import defpackage.y70;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CancellableKt {
    private static final void dispatcherFailure(q60 q60Var, Throwable th) throws Throwable {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        q60Var.resumeWith(ee0.t(th));
        throw th;
    }

    private static final void runSafely(q60 q60Var, au0 au0Var) throws Throwable {
        try {
            au0Var.invoke();
        } catch (Throwable th) {
            dispatcherFailure(q60Var, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void startCoroutineCancellable(lu0 lu0Var, q60 q60Var) throws Throwable {
        q60 p51Var;
        try {
            lu0Var.getClass();
            q60Var.getClass();
            if (lu0Var instanceof oq) {
                p51Var = ((oq) lu0Var).create(q60Var);
            } else {
                y70 context = q60Var.getContext();
                p51Var = context == sj0.e ? new p51(lu0Var, q60Var) : new q51(q60Var, context, lu0Var);
            }
            DispatchedContinuationKt.resumeCancellableWith(hd0.G(p51Var), mf3.a);
        } catch (Throwable th) {
            dispatcherFailure(q60Var, th);
        }
    }

    public static final <R, T> void startCoroutineCancellable(pu0 pu0Var, R r, q60 q60Var) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(hd0.G(hd0.r(pu0Var, r, q60Var)), mf3.a);
        } catch (Throwable th) {
            dispatcherFailure(q60Var, th);
        }
    }

    public static final void startCoroutineCancellable(q60 q60Var, q60 q60Var2) throws Throwable {
        try {
            DispatchedContinuationKt.resumeCancellableWith(hd0.G(q60Var), mf3.a);
        } catch (Throwable th) {
            dispatcherFailure(q60Var2, th);
        }
    }
}
