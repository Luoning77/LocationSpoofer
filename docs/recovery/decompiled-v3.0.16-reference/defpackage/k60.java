package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class k60 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public k60(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k60)) {
            return false;
        }
        k60 k60Var = (k60) obj;
        long j = k60Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, k60Var.b) && ye3.a(this.c, k60Var.c) && ye3.a(this.d, k60Var.d) && ye3.a(this.e, k60Var.e);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.e) + p91.c(p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        p91.u(this.a, sb, ", textColor=");
        p91.u(this.b, sb, ", iconColor=");
        p91.u(this.c, sb, ", disabledTextColor=");
        p91.u(this.d, sb, ", disabledIconColor=");
        sb.append((Object) hz.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
