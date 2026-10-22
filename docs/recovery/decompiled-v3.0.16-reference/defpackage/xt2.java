package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xt2 {
    public static final xt2 d = new xt2(xp1.d(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public xt2(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2)) {
            return false;
        }
        xt2 xt2Var = (xt2) obj;
        long j = xt2Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && c12.b(this.b, xt2Var.b) && this.c == xt2Var.c;
    }

    public final int hashCode() {
        int i = hz.h;
        return Float.hashCode(this.c) + p91.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        p91.u(this.a, sb, ", offset=");
        sb.append((Object) c12.g(this.b));
        sb.append(", blurRadius=");
        return az2.n(sb, this.c, ')');
    }
}
