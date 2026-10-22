package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uk2 {
    public final qk2 a;
    public final long b;

    public uk2(qk2 qk2Var, long j) {
        this.a = qk2Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk2)) {
            return false;
        }
        uk2 uk2Var = (uk2) obj;
        return this.a.equals(uk2Var.a) && this.b == uk2Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Accepted(claims=" + this.a + ", deadline=" + this.b + ")";
    }
}
