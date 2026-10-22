package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class fz2 extends pz2 {
    public final double a;
    public final double b;

    public fz2(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz2)) {
            return false;
        }
        fz2 fz2Var = (fz2) obj;
        return Double.compare(this.a, fz2Var.a) == 0 && Double.compare(this.b, fz2Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ConfirmMapPoint(lat=" + this.a + ", lng=" + this.b + ")";
    }
}
