package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class y0 {
    public final long a;
    public final float b;
    public final float c;
    public final float d;

    public y0(long j, float f, float f2, float f3) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.a == y0Var.a && Float.compare(this.b, y0Var.b) == 0 && Float.compare(this.c, y0Var.c) == 0 && Float.compare(this.d, y0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + az2.c(this.c, az2.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AccelSample(timestampNanos=" + this.a + ", x=" + this.b + ", y=" + this.c + ", z=" + this.d + ")";
    }
}
