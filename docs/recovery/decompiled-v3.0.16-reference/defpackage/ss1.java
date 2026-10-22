package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ss1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public ss1(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ss1)) {
            return false;
        }
        ss1 ss1Var = (ss1) obj;
        long j = ss1Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, ss1Var.b) && ye3.a(this.c, ss1Var.c) && ye3.a(this.d, ss1Var.d) && ye3.a(this.e, ss1Var.e) && ye3.a(this.f, ss1Var.f);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.f) + p91.c(p91.c(p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
