package defpackage;

import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class sf0 {
    public static final rf0 a = new rf0(3, null, 0);
    public static final rf0 b = new rf0(3, null, 1);

    public static dv1 a(vf0 vf0Var, x32 x32Var, boolean z, ix1 ix1Var, boolean z2, qu0 qu0Var, qu0 qu0Var2, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            ix1Var = null;
        }
        return new qf0(vf0Var, x32Var, z4, ix1Var, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? a : qu0Var, qu0Var2, (i & WorkQueueKt.BUFFER_CAPACITY) != 0 ? false : z3);
    }

    public static final long b(long j) {
        return g93.c(Float.isNaN(yh3.b(j)) ? 0.0f : yh3.b(j), Float.isNaN(yh3.c(j)) ? 0.0f : yh3.c(j));
    }
}
