package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class sk1 {
    public static final rs2 a = new rs2("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static dv1 b(lu0 lu0Var, lu0 lu0Var2, q82 q82Var) {
        return a() ? new pk1(lu0Var, lu0Var2, q82Var) : av1.a;
    }
}
