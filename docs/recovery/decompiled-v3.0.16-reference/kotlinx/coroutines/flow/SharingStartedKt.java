package kotlinx.coroutines.flow;

import defpackage.ah0;
import defpackage.c30;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class SharingStartedKt {
    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m77WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j, long j2) {
        return new StartedWhileSubscribed(ah0.d(j), ah0.d(j2));
    }

    /* JADX INFO: renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static SharingStarted m78WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            c30 c30Var = ah0.f;
            j = 0;
        }
        if ((i & 2) != 0) {
            c30 c30Var2 = ah0.f;
            j2 = ah0.g;
        }
        return m77WhileSubscribed5qebJ5I(companion, j, j2);
    }
}
