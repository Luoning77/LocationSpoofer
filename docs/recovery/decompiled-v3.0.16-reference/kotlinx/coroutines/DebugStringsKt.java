package kotlinx.coroutines;

import defpackage.q60;
import defpackage.wg2;
import defpackage.xg2;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DebugStringsKt {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(q60 q60Var) {
        Object wg2Var;
        if (q60Var instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) q60Var).toString();
        }
        try {
            wg2Var = q60Var + '@' + getHexAddress(q60Var);
        } catch (Throwable th) {
            wg2Var = new wg2(th);
        }
        if (xg2.a(wg2Var) != null) {
            wg2Var = q60Var.getClass().getName() + '@' + getHexAddress(q60Var);
        }
        return (String) wg2Var;
    }
}
