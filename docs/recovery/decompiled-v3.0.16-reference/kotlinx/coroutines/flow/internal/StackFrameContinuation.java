package kotlinx.coroutines.flow.internal;

import defpackage.a80;
import defpackage.q60;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class StackFrameContinuation<T> implements q60, a80 {
    private final y70 context;
    private final q60 uCont;

    public StackFrameContinuation(q60 q60Var, y70 y70Var) {
        this.uCont = q60Var;
        this.context = y70Var;
    }

    @Override // defpackage.a80
    public a80 getCallerFrame() {
        q60 q60Var = this.uCont;
        if (q60Var instanceof a80) {
            return (a80) q60Var;
        }
        return null;
    }

    @Override // defpackage.q60
    public y70 getContext() {
        return this.context;
    }

    @Override // defpackage.a80
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.q60
    public void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
