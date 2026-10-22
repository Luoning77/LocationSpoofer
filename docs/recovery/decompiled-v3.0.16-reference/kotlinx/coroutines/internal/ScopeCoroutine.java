package kotlinx.coroutines.internal;

import defpackage.a80;
import defpackage.hd0;
import defpackage.q60;
import defpackage.y70;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements a80 {
    public final q60 uCont;

    public ScopeCoroutine(y70 y70Var, q60 q60Var) {
        super(y70Var, true, true);
        this.uCont = q60Var;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void afterCompletion(Object obj) {
        DispatchedContinuationKt.resumeCancellableWith(hd0.G(this.uCont), CompletionStateKt.recoverResult(obj, this.uCont));
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        q60 q60Var = this.uCont;
        q60Var.resumeWith(CompletionStateKt.recoverResult(obj, q60Var));
    }

    @Override // defpackage.a80
    public final a80 getCallerFrame() {
        q60 q60Var = this.uCont;
        if (q60Var instanceof a80) {
            return (a80) q60Var;
        }
        return null;
    }

    @Override // defpackage.a80
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean isScopedCoroutine() {
        return true;
    }

    public void afterCompletionUndispatched() {
    }
}
