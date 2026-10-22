package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class x01 {
    public static int k;
    public static final c30 l = new c30(28);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final mh3 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public x01(String str, float f, float f2, float f3, float f4, mh3 mh3Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = mh3Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x01)) {
            return false;
        }
        x01 x01Var = (x01) obj;
        if (!o51.f(this.a, x01Var.a) || !td0.b(this.b, x01Var.b) || !td0.b(this.c, x01Var.c) || this.d != x01Var.d || this.e != x01Var.e || !this.f.equals(x01Var.f)) {
            return false;
        }
        long j = x01Var.g;
        int i = hz.h;
        return ye3.a(this.g, j) && this.h == x01Var.h && this.i == x01Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + az2.c(this.e, az2.c(this.d, az2.c(this.c, az2.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = hz.h;
        return Boolean.hashCode(this.i) + p91.b(this.h, p91.c(iHashCode, 31, this.g), 31);
    }
}
