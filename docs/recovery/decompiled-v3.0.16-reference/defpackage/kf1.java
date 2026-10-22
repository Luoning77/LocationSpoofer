package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class kf1 {
    public final float a;
    public final float b;
    public final float c;

    public kf1(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf1)) {
            return false;
        }
        kf1 kf1Var = (kf1) obj;
        return Float.compare(this.a, kf1Var.a) == 0 && Float.compare(this.b, kf1Var.b) == 0 && Float.compare(this.c, kf1Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + az2.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "LightPosition(x=" + this.a + ", y=" + this.b + ", z=" + this.c + ")";
    }
}
