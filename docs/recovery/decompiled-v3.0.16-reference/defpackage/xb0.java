package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface xb0 {
    default long A0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fR = R(xd0.b(j));
        float fR2 = R(xd0.a(j));
        return (((long) Float.floatToRawIntBits(fR)) << 32) | (((long) Float.floatToRawIntBits(fR2)) & 4294967295L);
    }

    float D();

    default float G0(long j) {
        if (!x93.a(w93.b(j), 4294967296L)) {
            r21.b("Only Sp can convert to Px");
        }
        return R(e0(j));
    }

    default long O(float f) {
        float[] fArr = fr0.a;
        if (D() < 1.03f) {
            return v63.e(f / D(), 4294967296L);
        }
        er0 er0VarA = fr0.a(D());
        return v63.e(er0VarA != null ? er0VarA.a(f) : f / D(), 4294967296L);
    }

    default long P(long j) {
        if (j != 9205357640488583168L) {
            return vd0.a(X0(Float.intBitsToFloat((int) (j >> 32))), X0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default long Q0(float f) {
        return O(X0(f));
    }

    default float R(float f) {
        return g() * f;
    }

    default float U0(int i) {
        return i / g();
    }

    default float X0(float f) {
        return f / g();
    }

    default float e0(long j) {
        if (!x93.a(w93.b(j), 4294967296L)) {
            r21.b("Only Sp can convert to Px");
        }
        float[] fArr = fr0.a;
        if (D() < 1.03f) {
            return D() * w93.c(j);
        }
        er0 er0VarA = fr0.a(D());
        if (er0VarA != null) {
            return er0VarA.b(w93.c(j));
        }
        return D() * w93.c(j);
    }

    float g();

    default int n0(float f) {
        float fR = R(f);
        if (Float.isInfinite(fR)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fR);
    }
}
