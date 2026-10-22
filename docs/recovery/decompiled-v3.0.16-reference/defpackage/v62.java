package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class v62 extends e72 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public v62(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v62)) {
            return false;
        }
        v62 v62Var = (v62) obj;
        return Float.compare(this.c, v62Var.c) == 0 && Float.compare(this.d, v62Var.d) == 0 && Float.compare(this.e, v62Var.e) == 0 && Float.compare(this.f, v62Var.f) == 0 && Float.compare(this.g, v62Var.g) == 0 && Float.compare(this.h, v62Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + az2.c(this.g, az2.c(this.f, az2.c(this.e, az2.c(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return az2.n(sb, this.h, ')');
    }
}
