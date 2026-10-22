package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sn0 {
    public final float a;
    public final float b;

    public sn0(float f, xb0 xb0Var) {
        this.a = f;
        float fG = xb0Var.g();
        float f2 = tn0.a;
        this.b = fG * 386.0878f * 160.0f * 0.84f;
    }

    public final rn0 a(float f) {
        double dB = b(f);
        double d = tn0.a;
        double d2 = d - 1.0d;
        return new rn0(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.a * this.b))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = vc.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.a * this.b)));
    }
}
