package defpackage;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sj {
    public static final sj a = new sj();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchY();
    }
}
