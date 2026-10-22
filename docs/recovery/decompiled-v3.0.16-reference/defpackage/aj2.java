package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class aj2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        mh0.e(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public aj2(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj2)) {
            return false;
        }
        aj2 aj2Var = (aj2) obj;
        return Float.compare(this.a, aj2Var.a) == 0 && Float.compare(this.b, aj2Var.b) == 0 && Float.compare(this.c, aj2Var.c) == 0 && Float.compare(this.d, aj2Var.d) == 0 && ji2.D(this.e, aj2Var.e) && ji2.D(this.f, aj2Var.f) && ji2.D(this.g, aj2Var.g) && ji2.D(this.h, aj2Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + p91.c(p91.c(p91.c(az2.c(this.d, az2.c(this.c, az2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = ce0.W(this.a) + ", " + ce0.W(this.b) + ", " + ce0.W(this.c) + ", " + ce0.W(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zD = ji2.D(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zD || !ji2.D(j2, j3) || !ji2.D(j3, j4)) {
            StringBuilder sbQ = az2.q("RoundRect(rect=", str, ", topLeft=");
            sbQ.append((Object) ji2.V(j));
            sbQ.append(", topRight=");
            sbQ.append((Object) ji2.V(j2));
            sbQ.append(", bottomRight=");
            sbQ.append((Object) ji2.V(j3));
            sbQ.append(", bottomLeft=");
            sbQ.append((Object) ji2.V(j4));
            sbQ.append(')');
            return sbQ.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbQ2 = az2.q("RoundRect(rect=", str, ", radius=");
            sbQ2.append(ce0.W(Float.intBitsToFloat(i)));
            sbQ2.append(')');
            return sbQ2.toString();
        }
        StringBuilder sbQ3 = az2.q("RoundRect(rect=", str, ", x=");
        sbQ3.append(ce0.W(Float.intBitsToFloat(i)));
        sbQ3.append(", y=");
        sbQ3.append(ce0.W(Float.intBitsToFloat(i2)));
        sbQ3.append(')');
        return sbQ3.toString();
    }
}
