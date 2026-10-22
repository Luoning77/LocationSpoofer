package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x21 {
    public final float a;
    public final long b;
    public final long c;
    public final float d;

    static {
        new x21(0.0f, 0.0f, 31, 0L);
    }

    public x21(float f, float f2, int i, long j) {
        f = (i & 1) != 0 ? 24.0f : f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        j = (i & 4) != 0 ? hz.c(0.15f, hz.b) : j;
        f2 = (i & 8) != 0 ? 1.0f : f2;
        this.a = f;
        this.b = jFloatToRawIntBits;
        this.c = j;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x21) {
            x21 x21Var = (x21) obj;
            if (!td0.b(this.a, x21Var.a) || this.b != x21Var.b) {
                return false;
            }
            long j = x21Var.c;
            int i = hz.h;
            if (ye3.a(this.c, j) && Float.compare(this.d, x21Var.d) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = p91.c(Float.hashCode(this.a) * 31, 31, this.b);
        int i = hz.h;
        return Integer.hashCode(3) + az2.c(this.d, p91.c(iC, 31, this.c), 31);
    }

    public final String toString() {
        String strC = td0.c(this.a);
        String strA = wd0.a(this.b);
        String strI = hz.i(this.c);
        String strG = o51.G(3);
        StringBuilder sbT = p91.t("InnerShadow(radius=", strC, ", offset=", strA, ", color=");
        sbT.append(strI);
        sbT.append(", alpha=");
        sbT.append(this.d);
        sbT.append(", blendMode=");
        return az2.p(sbT, strG, ")");
    }
}
