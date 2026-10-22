package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class li0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public li0(String str, String str2, int i, int i2, String str3, String str4, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li0)) {
            return false;
        }
        li0 li0Var = (li0) obj;
        return o51.f(this.a, li0Var.a) && o51.f(this.b, li0Var.b) && this.c == li0Var.c && this.d == li0Var.d && o51.f(this.e, li0Var.e) && o51.f(this.f, li0Var.f) && this.g == li0Var.g && this.h == li0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + p91.e(p91.d(p91.d(p91.b(this.d, p91.b(this.c, p91.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbT = p91.t("EditableWifiItem(bssid=", this.a, ", ssid=", this.b, ", frequency=");
        az2.w(sbT, this.c, ", level=", this.d, ", capabilities=");
        p91.y(sbT, this.e, ", vendor=", this.f, ", isConnected=");
        sbT.append(this.g);
        sbT.append(", isDesignated=");
        sbT.append(this.h);
        sbT.append(")");
        return sbT.toString();
    }
}
