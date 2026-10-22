package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class sn {
    public final String a;
    public final String b;
    public final double c;
    public final double d;
    public final String e;

    public sn(String str, String str2, double d, double d2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = d2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn)) {
            return false;
        }
        sn snVar = (sn) obj;
        return o51.f(this.a, snVar.a) && o51.f(this.b, snVar.b) && Double.compare(this.c, snVar.c) == 0 && Double.compare(this.d, snVar.d) == 0 && o51.f(this.e, snVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p91.a(this.d, p91.a(this.c, p91.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = p91.t("AppPoiItem(title=", this.a, ", snippet=", this.b, ", lat=");
        sbT.append(this.c);
        az2.x(sbT, ", lng=", this.d, ", source=");
        return az2.p(sbT, this.e, ")");
    }
}
