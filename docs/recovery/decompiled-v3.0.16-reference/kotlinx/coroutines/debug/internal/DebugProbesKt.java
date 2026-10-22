package kotlinx.coroutines.debug.internal;

import defpackage.q60;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class DebugProbesKt {
    public static final <T> q60 probeCoroutineCreated(q60 q60Var) {
        return DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(q60Var);
    }

    public static final void probeCoroutineResumed(q60 q60Var) {
        DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(q60Var);
    }

    public static final void probeCoroutineSuspended(q60 q60Var) {
        DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(q60Var);
    }
}
