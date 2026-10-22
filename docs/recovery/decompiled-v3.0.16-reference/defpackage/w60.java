package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class w60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public w60(String str, String str2, String str3, String str4) {
        str2.getClass();
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
        if (!(obj instanceof w60)) {
            return false;
        }
        w60 w60Var = (w60) obj;
        return this.a.equals(w60Var.a) && o51.f(this.b, w60Var.b) && o51.f(this.c, w60Var.c) && o51.f(this.d, w60Var.d);
    }

    public final int hashCode() {
        int iD = p91.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbT = p91.t("CoordinateOption(key=", this.a, ", name=", this.b, ", tag=");
        sbT.append(this.c);
        sbT.append(", desc=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
