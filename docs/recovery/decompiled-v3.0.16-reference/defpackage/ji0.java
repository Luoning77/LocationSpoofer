package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ji0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public ji0(String str, String str2, String str3, int i, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji0)) {
            return false;
        }
        ji0 ji0Var = (ji0) obj;
        return o51.f(this.a, ji0Var.a) && o51.f(this.b, ji0Var.b) && o51.f(this.c, ji0Var.c) && this.d == ji0Var.d && this.e == ji0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p91.b(this.d, p91.d(p91.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbT = p91.t("EditableBluetoothItem(address=", this.a, ", name=", this.b, ", scanRecordHex=");
        sbT.append(this.c);
        sbT.append(", rssi=");
        sbT.append(this.d);
        sbT.append(", isDesignated=");
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
