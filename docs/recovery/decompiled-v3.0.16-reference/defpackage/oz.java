package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public abstract class oz {
    public final String a;
    public final long b;
    public final int c;

    public oz(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            fo.i("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            fo.i("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oz ozVar = (oz) obj;
        if (this.c == ozVar.c && this.a.equals(ozVar.a)) {
            return xq1.D(this.b, ozVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, oz ozVar);

    public int hashCode() {
        return p91.c(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        long j = this.b;
        if (xq1.D(j, 12884901888L)) {
            str = "Rgb";
        } else if (xq1.D(j, 12884901889L)) {
            str = "Xyz";
        } else if (xq1.D(j, 12884901890L)) {
            str = "Lab";
        } else {
            str = xq1.D(j, 17179869187L) ? "Cmyk" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
