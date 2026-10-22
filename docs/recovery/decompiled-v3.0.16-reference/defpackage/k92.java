package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k92 {
    public final f92 a;
    public final w82 b;

    public k92(f92 f92Var, w82 w82Var) {
        this.a = f92Var;
        this.b = w82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k92)) {
            return false;
        }
        k92 k92Var = (k92) obj;
        return o51.f(this.b, k92Var.b) && o51.f(this.a, k92Var.a);
    }

    public final int hashCode() {
        f92 f92Var = this.a;
        int iHashCode = (f92Var != null ? f92Var.hashCode() : 0) * 31;
        w82 w82Var = this.b;
        return iHashCode + (w82Var != null ? w82Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
