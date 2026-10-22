package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class hc0 {
    public static final hc0 e = new hc0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public hc0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        return Float.compare(this.a, hc0Var.a) == 0 && Float.compare(this.b, hc0Var.b) == 0 && Float.compare(this.c, hc0Var.c) == 0 && Float.compare(this.d, hc0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + az2.c(this.c, az2.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "DeviceTilt(pitch=" + this.a + ", roll=" + this.b + ", gravityX=" + this.c + ", gravityY=" + this.d + ")";
    }
}
