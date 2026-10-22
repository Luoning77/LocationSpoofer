package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rn0 {
    public final float a;
    public final float b;
    public final long c;

    public rn0(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn0)) {
            return false;
        }
        rn0 rn0Var = (rn0) obj;
        return Float.compare(this.a, rn0Var.a) == 0 && Float.compare(this.b, rn0Var.b) == 0 && this.c == rn0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + az2.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
