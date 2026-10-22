package kotlinx.coroutines;

import defpackage.lu0;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class InvokeOnCompletion extends JobNode {
    private final lu0 handler;

    public InvokeOnCompletion(lu0 lu0Var) {
        this.handler = lu0Var;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
