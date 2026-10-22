package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s50 {
    public final int a;
    public final long b;
    public final t50 c;
    public final us1 d;

    public s50(int i, long j, t50 t50Var, us1 us1Var) {
        this.a = i;
        this.b = j;
        this.c = t50Var;
        this.d = us1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s50)) {
            return false;
        }
        s50 s50Var = (s50) obj;
        return this.a == s50Var.a && this.b == s50Var.b && this.c == s50Var.c && o51.f(this.d, s50Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + p91.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        us1 us1Var = this.d;
        return iHashCode + (us1Var == null ? 0 : us1Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
