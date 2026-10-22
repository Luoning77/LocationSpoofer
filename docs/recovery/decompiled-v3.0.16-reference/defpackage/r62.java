package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r62 extends e72 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public r62(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r62)) {
            return false;
        }
        r62 r62Var = (r62) obj;
        return Float.compare(this.c, r62Var.c) == 0 && Float.compare(this.d, r62Var.d) == 0 && Float.compare(this.e, r62Var.e) == 0 && Float.compare(this.f, r62Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + az2.c(this.e, az2.c(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        return az2.n(sb, this.f, ')');
    }
}
