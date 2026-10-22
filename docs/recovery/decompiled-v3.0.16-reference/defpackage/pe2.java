package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pe2 {
    public static final pe2 e = new pe2(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pe2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static pe2 b(pe2 pe2Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = pe2Var.a;
        }
        float f4 = pe2Var.b;
        if ((i & 4) != 0) {
            f2 = pe2Var.c;
        }
        if ((i & 8) != 0) {
            f3 = pe2Var.d;
        }
        return new pe2(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long d() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long e() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe2)) {
            return false;
        }
        pe2 pe2Var = (pe2) obj;
        return Float.compare(this.a, pe2Var.a) == 0 && Float.compare(this.b, pe2Var.b) == 0 && Float.compare(this.c, pe2Var.c) == 0 && Float.compare(this.d, pe2Var.d) == 0;
    }

    public final pe2 f(pe2 pe2Var) {
        return new pe2(Math.max(this.a, pe2Var.a), Math.max(this.b, pe2Var.b), Math.min(this.c, pe2Var.c), Math.min(this.d, pe2Var.d));
    }

    public final boolean g() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean h(pe2 pe2Var) {
        return (this.a < pe2Var.c) & (pe2Var.a < this.c) & (this.b < pe2Var.d) & (pe2Var.b < this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + az2.c(this.c, az2.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final pe2 i(float f, float f2) {
        return new pe2(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final pe2 j(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new pe2(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + ce0.W(this.a) + ", " + ce0.W(this.b) + ", " + ce0.W(this.c) + ", " + ce0.W(this.d) + ')';
    }
}
