package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class op2 {
    public final float a;
    public final float b;

    public op2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof op2)) {
            return false;
        }
        return td0.b(0.0f, 0.0f) && td0.b(0.0f, 0.0f) && td0.b(0.0f, 0.0f) && td0.b(this.a, ((op2) obj).a) && td0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + az2.c(this.a, az2.c(0.0f, az2.c(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31);
    }
}
