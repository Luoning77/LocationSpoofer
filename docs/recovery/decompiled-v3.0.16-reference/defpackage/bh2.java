package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class bh2 {
    public final long a;
    public final double b;
    public final double c;

    public bh2(double d, double d2, long j) {
        this.a = j;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh2)) {
            return false;
        }
        bh2 bh2Var = (bh2) obj;
        return this.a == bh2Var.a && Double.compare(this.b, bh2Var.b) == 0 && Double.compare(this.c, bh2Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + p91.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Request(generation=" + this.a + ", lat=" + this.b + ", lng=" + this.c + ")";
    }
}
