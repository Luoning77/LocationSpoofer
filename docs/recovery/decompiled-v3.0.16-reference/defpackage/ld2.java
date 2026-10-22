package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ld2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ld2(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ld2)) {
            return false;
        }
        ld2 ld2Var = (ld2) obj;
        long j = ld2Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, ld2Var.b) && ye3.a(this.c, ld2Var.c) && ye3.a(this.d, ld2Var.d);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.d) + p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
