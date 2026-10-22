package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fa1 {
    public static void a(double d, double d2, double d3, double d4) {
        if (Double.isNaN(d) || Double.isNaN(d3)) {
            fo.i("latitude must not be NaN");
            return;
        }
        if (Double.isNaN(d2) || Double.isNaN(d4)) {
            fo.i("longitude must not be NaN");
            return;
        }
        if (Double.isInfinite(d2) || Double.isInfinite(d4)) {
            fo.i("longitude must not be infinite");
            return;
        }
        if (d > 90.0d || d < -90.0d || d3 > 90.0d || d3 < -90.0d) {
            fo.i("latitude must be between -90 and 90");
        } else if (d < d3) {
            fo.i("latNorth cannot be less than latSouth");
        } else {
            if (d2 >= d4) {
                return;
            }
            fo.i("lonEast cannot be less than lonWest");
        }
    }

    public static double b(int i, int i2) {
        double dPow = 3.141592653589793d - ((((double) i2) * 6.283185307179586d) / Math.pow(2.0d, i));
        return Math.toDegrees(Math.atan((Math.exp(dPow) - Math.exp(-dPow)) * 0.5d));
    }
}
