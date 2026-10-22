package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lk2 {
    public static final lk2 a = new lk2();

    public static dv1 a(lk2 lk2Var, dv1 dv1Var, float f) {
        if (f <= 0.0d) {
            n21.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return dv1Var.d(new wb1(f, true));
    }
}
