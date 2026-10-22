package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class l52 {
    public final le a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public l52(le leVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = leVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final pe2 a(pe2 pe2Var) {
        return pe2Var.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = f93.b;
            if (f93.b(j, j2)) {
                return j2;
            }
        }
        int i = f93.c;
        int i2 = this.b;
        return g93.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final pe2 c(pe2 pe2Var) {
        float f = -this.f;
        return pe2Var.j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return mh0.v(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l52) {
            l52 l52Var = (l52) obj;
            if (this.a == l52Var.a && this.b == l52Var.b && this.c == l52Var.c && this.d == l52Var.d && this.e == l52Var.e && Float.compare(this.f, l52Var.f) == 0 && Float.compare(this.g, l52Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + az2.c(this.f, p91.b(this.e, p91.b(this.d, p91.b(this.c, p91.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return az2.n(sb, this.g, ')');
    }
}
