package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c50 extends d50 {
    public final jh2 e;
    public final jh2 f;
    public final float[] g;

    public c50(jh2 jh2Var, jh2 jh2Var2) {
        float[] fArrB;
        super(jh2Var2, jh2Var, jh2Var2, null);
        this.e = jh2Var;
        this.f = jh2Var2;
        float[] fArr = k8.c.b;
        gk3 gk3Var = jh2Var.d;
        float[] fArr2 = jh2Var.i;
        gk3 gk3Var2 = jh2Var2.d;
        float[] fArr3 = jh2Var2.j;
        if (k22.n(gk3Var, gk3Var2)) {
            fArrB = k22.B(fArr3, fArr2);
        } else {
            float[] fArrA = gk3Var.a();
            float[] fArrA2 = gk3Var2.a();
            gk3 gk3Var3 = k22.s;
            fArrB = k22.B(k22.n(gk3Var2, gk3Var3) ? fArr3 : k22.z(k22.B(k22.m(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), jh2Var2.i)), k22.n(gk3Var, gk3Var3) ? fArr2 : k22.B(k22.m(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrB;
    }

    @Override // defpackage.d50
    public final long a(long j) {
        float fH = hz.h(j);
        float fG = hz.g(j);
        float fE = hz.e(j);
        float fD = hz.d(j);
        fh2 fh2Var = this.e.p;
        float fC = (float) fh2Var.c(fH);
        float fC2 = (float) fh2Var.c(fG);
        float fC3 = (float) fh2Var.c(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        float f2 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
        float f3 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
        jh2 jh2Var = this.f;
        fh2 fh2Var2 = jh2Var.m;
        return xp1.b((float) fh2Var2.c(f), (float) fh2Var2.c(f2), (float) fh2Var2.c(f3), fD, jh2Var);
    }
}
