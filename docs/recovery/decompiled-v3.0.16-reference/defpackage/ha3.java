package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ha3 {
    public final gx1 a;
    public ga3 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public ha3() {
        gx1 gx1Var = g41.a;
        this.a = new gx1();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(ga3 ga3Var, long j, long j2, float[] fArr, long j3) {
        long j4 = ga3Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            ga3Var.g = j3;
            ga3Var.a(ga3Var.e, ga3Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (h41.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!h41.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
