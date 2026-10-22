package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hz2 extends pz2 {
    public final double a;
    public final double b;

    public hz2(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz2)) {
            return false;
        }
        hz2 hz2Var = (hz2) obj;
        return Double.compare(this.a, hz2Var.a) == 0 && Double.compare(this.b, hz2Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MapPointMoved(lat=" + this.a + ", lng=" + this.b + ")";
    }
}
