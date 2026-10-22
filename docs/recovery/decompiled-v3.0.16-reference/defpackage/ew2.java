package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ew2 {
    public final oh a;
    public long b;

    public ew2(oh ohVar, long j) {
        this.a = ohVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ew2) {
            ew2 ew2Var = (ew2) obj;
            if (this.a == ew2Var.a && p41.b(this.b, ew2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) p41.c(this.b)) + ')';
    }
}
