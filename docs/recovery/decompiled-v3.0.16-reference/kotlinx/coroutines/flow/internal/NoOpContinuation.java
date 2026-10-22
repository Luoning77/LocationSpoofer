package kotlinx.coroutines.flow.internal;

import defpackage.q60;
import defpackage.sj0;
import defpackage.y70;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class NoOpContinuation implements q60 {
    public static final NoOpContinuation INSTANCE = new NoOpContinuation();
    private static final y70 context = sj0.e;

    private NoOpContinuation() {
    }

    @Override // defpackage.q60
    public y70 getContext() {
        return context;
    }

    @Override // defpackage.q60
    public void resumeWith(Object obj) {
    }
}
