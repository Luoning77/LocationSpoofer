package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class mw2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public mw2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.b : this.d;
        }
        return z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mw2)) {
            return false;
        }
        mw2 mw2Var = (mw2) obj;
        long j = mw2Var.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, mw2Var.b) && ye3.a(this.c, mw2Var.c) && ye3.a(this.d, mw2Var.d) && ye3.a(this.e, mw2Var.e) && ye3.a(this.f, mw2Var.f) && ye3.a(this.g, mw2Var.g) && ye3.a(this.h, mw2Var.h) && ye3.a(this.i, mw2Var.i) && ye3.a(this.j, mw2Var.j);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.j) + p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
