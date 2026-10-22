package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ba1 {
    public final String a;
    public final String b;
    public final String c;

    public ba1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba1)) {
            return false;
        }
        ba1 ba1Var = (ba1) obj;
        return this.a.equals(ba1Var.a) && this.b.equals(ba1Var.b) && this.c.equals(ba1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p91.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return az2.p(p91.t("LanguageOption(name=", this.a, ", code=", this.b, ", nativeName="), this.c, ")");
    }
}
