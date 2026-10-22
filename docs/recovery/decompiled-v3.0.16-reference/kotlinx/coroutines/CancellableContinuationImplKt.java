package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class CancellableContinuationImplKt {
    private static final int DECISION_SHIFT = 29;
    private static final int INDEX_MASK = 536870911;
    private static final int NO_INDEX = 536870911;
    private static final int RESUMED = 2;
    public static final Symbol RESUME_TOKEN = new Symbol("RESUME_TOKEN");
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    private static final int decisionAndIndex(int i, int i2) {
        return (i << DECISION_SHIFT) + i2;
    }

    private static final int getDecision(int i) {
        return i >> DECISION_SHIFT;
    }

    private static final int getIndex(int i) {
        return i & 536870911;
    }
}
