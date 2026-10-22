package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wp2 {
    public final hg2 a;
    public final int b;
    public final long c;

    public wp2(hg2 hg2Var, int i, long j) {
        this.a = hg2Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp2)) {
            return false;
        }
        wp2 wp2Var = (wp2) obj;
        return this.a == wp2Var.a && this.b == wp2Var.b && this.c == wp2Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + p91.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
