package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bj2 implements au2 {
    public final u70 a;
    public final u70 b;
    public final u70 c;
    public final u70 d;

    public bj2(u70 u70Var, u70 u70Var2, u70 u70Var3, u70 u70Var4) {
        this.a = u70Var;
        this.b = u70Var2;
        this.c = u70Var3;
        this.d = u70Var4;
    }

    public static bj2 b(bj2 bj2Var, u70 u70Var, u70 u70Var2, u70 u70Var3, u70 u70Var4, int i) {
        if ((i & 1) != 0) {
            u70Var = bj2Var.a;
        }
        if ((i & 2) != 0) {
            u70Var2 = bj2Var.b;
        }
        if ((i & 4) != 0) {
            u70Var3 = bj2Var.c;
        }
        if ((i & 8) != 0) {
            u70Var4 = bj2Var.d;
        }
        bj2Var.getClass();
        return new bj2(u70Var, u70Var2, u70Var3, u70Var4);
    }

    @Override // defpackage.au2
    public final vd0 a(long j, qa1 qa1Var, xb0 xb0Var) {
        float fA = this.a.a(j, xb0Var);
        float fA2 = this.b.a(j, xb0Var);
        float fA3 = this.c.a(j, xb0Var);
        float fA4 = this.d.a(j, xb0Var);
        float fB = cw2.b(j);
        float f = fA + fA4;
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            s21.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new a42(ce0.d(0L, j));
        }
        pe2 pe2VarD = ce0.d(0L, j);
        qa1 qa1Var2 = qa1.e;
        float f5 = qa1Var == qa1Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (qa1Var == qa1Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = qa1Var == qa1Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (qa1Var != qa1Var2) {
            fA4 = fA3;
        }
        return new b42(new aj2(pe2VarD.a, pe2VarD.b, pe2VarD.c, pe2VarD.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj2)) {
            return false;
        }
        bj2 bj2Var = (bj2) obj;
        return o51.f(this.a, bj2Var.a) && o51.f(this.b, bj2Var.b) && o51.f(this.c, bj2Var.c) && o51.f(this.d, bj2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
