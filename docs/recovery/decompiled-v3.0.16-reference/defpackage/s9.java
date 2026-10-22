package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s9 {
    public final double[] a;
    public final double[] b;
    public final double[] c;
    public final double[] d;

    public s9(double d) {
        Random random = new Random(2116198823L);
        this.a = new double[5];
        this.b = new double[5];
        for (int i = 0; i < 5; i++) {
            double dPow = Math.pow(4.0d, random.nextDouble()) * d;
            double dNextDouble = random.nextDouble() * 2.0d * 3.141592653589793d;
            double d2 = 6.283185307179586d / dPow;
            this.a[i] = Math.cos(dNextDouble) * d2;
            this.b[i] = Math.sin(dNextDouble) * d2;
        }
        double[] dArr = new double[5];
        for (int i2 = 0; i2 < 5; i2++) {
            dArr[i2] = random.nextDouble() * 2.0d * 3.141592653589793d;
        }
        this.c = dArr;
        double[] dArr2 = new double[5];
        for (int i3 = 0; i3 < 5; i3++) {
            dArr2[i3] = random.nextDouble() + 0.5d;
        }
        double d3 = 0.0d;
        for (int i4 = 0; i4 < 5; i4++) {
            d3 += dArr2[i4];
        }
        double[] dArr3 = new double[5];
        for (int i5 = 0; i5 < 5; i5++) {
            dArr3[i5] = dArr2[i5] / d3;
        }
        this.d = dArr3;
    }
}
