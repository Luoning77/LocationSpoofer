package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public class d50 {
    public final oz a;
    public final oz b;
    public final oz c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public d50(oz ozVar, oz ozVar2, int i) {
        oz ozVarJ = xq1.D(ozVar.b, 12884901888L) ? k22.j(ozVar) : ozVar;
        oz ozVarJ2 = xq1.D(ozVar2.b, 12884901888L) ? k22.j(ozVar2) : ozVar2;
        float[] fArrA = k22.v;
        float[] fArr = null;
        if (i == 3) {
            boolean zD = xq1.D(ozVar.b, 12884901888L);
            boolean zD2 = xq1.D(ozVar2.b, 12884901888L);
            if ((!zD || !zD2) && (zD || zD2)) {
                gk3 gk3Var = ((jh2) (zD ? ozVar : ozVar2)).d;
                float[] fArrA2 = zD ? gk3Var.a() : fArrA;
                fArrA = zD2 ? gk3Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(ozVar2, ozVarJ, ozVarJ2, fArr);
    }

    public long a(long j) {
        float fH = hz.h(j);
        float fG = hz.g(j);
        float fE = hz.e(j);
        float fD = hz.d(j);
        oz ozVar = this.b;
        long jD = ozVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = ozVar.e(fH, fG, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.c.f(f, f2, fE2, fD, this.a);
    }

    public d50(oz ozVar, oz ozVar2, oz ozVar3, float[] fArr) {
        this.a = ozVar;
        this.b = ozVar2;
        this.c = ozVar3;
        this.d = fArr;
    }
}
