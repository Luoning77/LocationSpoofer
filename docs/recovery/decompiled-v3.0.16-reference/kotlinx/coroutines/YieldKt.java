package kotlinx.coroutines;

import defpackage.hd0;
import defpackage.mf3;
import defpackage.q60;
import defpackage.y70;
import defpackage.z70;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class YieldKt {
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Object yield(q60 q60Var) {
        Object obj;
        y70 context = q60Var.getContext();
        JobKt.ensureActive(context);
        q60 q60VarG = hd0.G(q60Var);
        DispatchedContinuation dispatchedContinuation = q60VarG instanceof DispatchedContinuation ? (DispatchedContinuation) q60VarG : null;
        z70 z70Var = z70.e;
        mf3 mf3Var = mf3.a;
        if (dispatchedContinuation != null) {
            if (DispatchedContinuationKt.safeIsDispatchNeeded(dispatchedContinuation.dispatcher, context)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context, mf3Var);
            } else {
                YieldContext yieldContext = new YieldContext();
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context.plus(yieldContext), mf3Var);
                if (yieldContext.dispatcherWasUnconfined && !DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation)) {
                    obj = mf3Var;
                }
            }
            obj = z70Var;
        } else {
            obj = mf3Var;
        }
        return obj == z70Var ? obj : mf3Var;
    }
}
