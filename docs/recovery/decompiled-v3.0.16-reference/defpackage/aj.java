package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class aj {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ aj(zi ziVar, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, ziVar, (i3 & 8) != 0 ? "" : "URL");
    }

    public final cj a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            q21.b("Item.end should be set first");
        }
        return new cj(this.b, i, this.a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return o51.f(this.a, ajVar.a) && this.b == ajVar.b && this.c == ajVar.c && o51.f(this.d, ajVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + p91.b(this.c, p91.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return p91.q(sb, this.d, ')');
    }

    public aj(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
