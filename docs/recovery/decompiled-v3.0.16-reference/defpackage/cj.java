package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cj {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public cj(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        q21.a("Reversed range is not supported");
    }

    public static cj a(cj cjVar, zi ziVar, int i, int i2) {
        Object obj = ziVar;
        if ((i2 & 1) != 0) {
            obj = cjVar.a;
        }
        int i3 = cjVar.b;
        if ((i2 & 4) != 0) {
            i = cjVar.c;
        }
        return new cj(i3, i, obj, cjVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        return o51.f(this.a, cjVar.a) && this.b == cjVar.b && this.c == cjVar.c && o51.f(this.d, cjVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + p91.b(this.c, p91.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return p91.q(sb, this.d, ')');
    }

    public cj(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
