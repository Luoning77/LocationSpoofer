package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class tj2 {
    public final double a;
    public final double b;
    public final float c;
    public final boolean d;

    public tj2(double d, double d2, float f, boolean z) {
        this.a = d;
        this.b = d2;
        this.c = f;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj2)) {
            return false;
        }
        tj2 tj2Var = (tj2) obj;
        return Double.compare(this.a, tj2Var.a) == 0 && Double.compare(this.b, tj2Var.b) == 0 && Float.compare(this.c, tj2Var.c) == 0 && this.d == tj2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + az2.c(this.c, p91.a(this.b, Double.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Position(lat=" + this.a + ", lng=" + this.b + ", bearing=" + this.c + ", arrived=" + this.d + ")";
    }
}
