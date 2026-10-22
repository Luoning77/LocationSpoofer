package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class uw {
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
    public final long k;
    public final long l;

    public uw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
        this.k = j11;
        this.l = j12;
    }

    public static yz2 a(xa3 xa3Var, f30 f30Var) {
        if (xa3Var == xa3.f) {
            ov0 ov0Var = (ov0) f30Var;
            ov0Var.c0(1539262271);
            yz2 yz2VarK = mc0.K(vv1.h, ov0Var);
            ov0Var.p(false);
            return yz2VarK;
        }
        ov0 ov0Var2 = (ov0) f30Var;
        ov0Var2.c0(1539355581);
        yz2 yz2VarK2 = mc0.K(vv1.g, ov0Var2);
        ov0Var2.p(false);
        return yz2VarK2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        long j = uwVar.a;
        int i = hz.h;
        return ye3.a(this.a, j) && ye3.a(this.b, uwVar.b) && ye3.a(this.c, uwVar.c) && ye3.a(this.d, uwVar.d) && ye3.a(this.e, uwVar.e) && ye3.a(this.f, uwVar.f) && ye3.a(this.g, uwVar.g) && ye3.a(this.h, uwVar.h) && ye3.a(this.i, uwVar.i) && ye3.a(this.j, uwVar.j) && ye3.a(this.k, uwVar.k) && ye3.a(this.l, uwVar.l);
    }

    public final int hashCode() {
        int i = hz.h;
        return Long.hashCode(this.l) + p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(p91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
