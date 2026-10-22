package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class pk2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public pk2(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2)) {
            return false;
        }
        pk2 pk2Var = (pk2) obj;
        return o51.f(this.a, pk2Var.a) && o51.f(this.b, pk2Var.b) && o51.f(this.c, pk2Var.c) && o51.f(this.d, pk2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p91.d(p91.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = p91.t("RuntimePermitBinding(userId=", this.a, ", deviceId=", this.b, ", publicKeyFingerprint=");
        sbT.append(this.c);
        sbT.append(", sessionId=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
