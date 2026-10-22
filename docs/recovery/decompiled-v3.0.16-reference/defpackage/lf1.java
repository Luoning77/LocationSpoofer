package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lf1 {
    public final kf1 a;
    public final long b;
    public final float c;

    public lf1(kf1 kf1Var, long j, float f) {
        this.a = kf1Var;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf1)) {
            return false;
        }
        lf1 lf1Var = (lf1) obj;
        if (!o51.f(this.a, lf1Var.a)) {
            return false;
        }
        long j = lf1Var.b;
        int i = hz.h;
        return ye3.a(this.b, j) && Float.compare(this.c, lf1Var.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = hz.h;
        return Float.hashCode(this.c) + p91.c(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "LightSource(position=" + this.a + ", color=" + hz.i(this.b) + ", intensity=" + this.c + ")";
    }

    public lf1(kf1 kf1Var, float f) {
        this(kf1Var, hz.c, f);
    }
}
