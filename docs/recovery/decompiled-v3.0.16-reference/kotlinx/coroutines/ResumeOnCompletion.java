package kotlinx.coroutines;

import defpackage.mf3;
import defpackage.q60;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ResumeOnCompletion extends JobNode {
    private final q60 continuation;

    public ResumeOnCompletion(q60 q60Var) {
        this.continuation = q60Var;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        this.continuation.resumeWith(mf3.a);
    }
}
