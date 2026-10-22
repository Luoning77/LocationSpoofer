package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class j52 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public j52(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j52)) {
            return false;
        }
        j52 j52Var = (j52) obj;
        long j = j52Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, j52Var.b) && ye3.a(this.c, j52Var.c) && ye3.a(this.d, j52Var.d) && ye3.a(this.e, j52Var.e) && ye3.a(this.f, j52Var.f) && ye3.a(this.g, j52Var.g);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.g) + p91.c(p91.c(p91.c(p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strI = hz.i(this.a);
        String strI2 = hz.i(this.b);
        String strI3 = hz.i(this.c);
        String strI4 = hz.i(this.d);
        String strI5 = hz.i(this.e);
        String strI6 = hz.i(this.f);
        String strI7 = hz.i(this.g);
        StringBuilder sbT = p91.t("Palette(card=", strI, ", border=", strI2, ", variant=");
        p91.y(sbT, strI3, ", segment=", strI4, ", text=");
        p91.y(sbT, strI5, ", textSecondary=", strI6, ", red=");
        return az2.p(sbT, strI7, ")");
    }
}
