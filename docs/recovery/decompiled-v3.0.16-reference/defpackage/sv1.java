package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class sv1 {
    public static volatile rv1 a;
    public static final double[] b = d(new yk1(11));
    public static final double[] c = d(new yk1(12));
    public static final double[] d = d(new yk1(13));
    public static final double[] e = d(new yk1(14));

    public static double a(double d2, double d3, double d4) {
        double dAbs = Math.abs(d2 - d3);
        if (dAbs > 0.5d) {
            dAbs = 1.0d - dAbs;
        }
        double d5 = dAbs / d4;
        return Math.exp((-0.5d) * d5 * d5);
    }

    public static double b(double[] dArr, double d2) {
        double dFloor = (d2 - Math.floor(d2)) * ((double) dArr.length);
        int length = ((int) dFloor) % dArr.length;
        double dFloor2 = dFloor - Math.floor(dFloor);
        return (dArr[(length + 1) % dArr.length] * dFloor2) + ((1.0d - dFloor2) * dArr[length]);
    }

    public static rv1 c(int i, int i2, long j) {
        qv1.j.getClass();
        qv1 qv1VarO = k91.o(i);
        int iV = mh0.v(i2, 0, 30);
        rv1 rv1Var = a;
        if (rv1Var != null && rv1Var.a == j && rv1Var.b == qv1VarO && rv1Var.c == iV) {
            return rv1Var;
        }
        rv1 rv1Var2 = new rv1(j, qv1VarO, iV);
        a = rv1Var2;
        return rv1Var2;
    }

    public static double[] d(lu0 lu0Var) {
        double[] dArr = new double[256];
        for (int i = 0; i < 256; i++) {
            dArr[i] = ((Number) lu0Var.invoke(Double.valueOf(((double) i) / 256.0d))).doubleValue();
        }
        double d2 = 0.0d;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            d2 += dArr[i3];
            i2++;
        }
        double d3 = i2 == 0 ? Double.NaN : d2 / ((double) i2);
        for (int i4 = 0; i4 < 256; i4++) {
            dArr[i4] = dArr[i4] - d3;
        }
        return dArr;
    }
}
