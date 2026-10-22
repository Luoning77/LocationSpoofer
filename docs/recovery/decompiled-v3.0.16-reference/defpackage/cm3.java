package defpackage;

import android.os.Build;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cm3 implements bm3 {
    public final yb0 b;

    public cm3() {
        this.b = Build.VERSION.SDK_INT >= 34 ? zb0.e : j9.E;
        am1.d(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(WorkQueueKt.BUFFER_CAPACITY));
    }
}
