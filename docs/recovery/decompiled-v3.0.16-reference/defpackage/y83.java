package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y83 {
    public final x83 a;
    public pa1 b = null;
    public pa1 c;

    public y83(x83 x83Var, pa1 pa1Var) {
        this.a = x83Var;
        this.c = pa1Var;
    }

    public final long a(long j) {
        pe2 pe2VarD0;
        pa1 pa1Var = this.b;
        pe2 pe2Var = pe2.e;
        if (pa1Var != null) {
            if (pa1Var.U()) {
                pa1 pa1Var2 = this.c;
                pe2VarD0 = pa1Var2 != null ? pa1Var2.d0(pa1Var, true) : null;
            } else {
                pe2VarD0 = pe2Var;
            }
            if (pe2VarD0 != null) {
                pe2Var = pe2VarD0;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = pe2Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = pe2Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = pe2Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = pe2Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        x83 x83Var = this.a;
        int iE = x83Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= x83Var.e(iE) && Float.intBitsToFloat(i) <= x83Var.f(iE);
    }

    public final long d(long j) {
        pa1 pa1Var;
        pa1 pa1Var2 = this.b;
        if (pa1Var2 != null) {
            if (!pa1Var2.U()) {
                pa1Var2 = null;
            }
            if (pa1Var2 != null && (pa1Var = this.c) != null) {
                pa1 pa1Var3 = pa1Var.U() ? pa1Var : null;
                if (pa1Var3 != null) {
                    return pa1Var2.L(pa1Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        pa1 pa1Var;
        pa1 pa1Var2 = this.b;
        if (pa1Var2 != null) {
            if (!pa1Var2.U()) {
                pa1Var2 = null;
            }
            if (pa1Var2 != null && (pa1Var = this.c) != null) {
                pa1 pa1Var3 = pa1Var.U() ? pa1Var : null;
                if (pa1Var3 != null) {
                    return pa1Var3.L(pa1Var2, j);
                }
            }
        }
        return j;
    }
}
