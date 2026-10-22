package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sq2 {
    public final bx0 a;
    public final long b;
    public final rq2 c;
    public final boolean d;

    public sq2(bx0 bx0Var, long j, rq2 rq2Var, boolean z) {
        this.a = bx0Var;
        this.b = j;
        this.c = rq2Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq2)) {
            return false;
        }
        sq2 sq2Var = (sq2) obj;
        return this.a == sq2Var.a && c12.b(this.b, sq2Var.b) && this.c == sq2Var.c && this.d == sq2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + p91.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) c12.g(this.b)) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }
}
