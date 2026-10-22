package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ni2 {
    public final long a;
    public final yi2 b;

    public ni2(long j, yi2 yi2Var) {
        this.a = j;
        this.b = yi2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni2)) {
            return false;
        }
        ni2 ni2Var = (ni2) obj;
        return this.a == ni2Var.a && this.b.equals(ni2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Session(generation=" + this.a + ", process=" + this.b + ")";
    }
}
