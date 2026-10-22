package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class di3 {
    public static final i43 h = new i43(new h63(10));
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final LinkedHashMap g;

    public di3(String str, String str2, String str3, String str4, int i, String str5, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = linkedHashMap;
    }

    public final boolean a(String str) {
        String str2 = (String) this.g.get(str);
        return str2 != null && (l13.k0(str2) ^ true);
    }

    public final String b(String str) {
        String str2 = (String) this.g.get(str);
        return str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di3)) {
            return false;
        }
        di3 di3Var = (di3) obj;
        return this.a.equals(di3Var.a) && this.b.equals(di3Var.b) && this.c.equals(di3Var.c) && this.d.equals(di3Var.d) && this.e == di3Var.e && this.f.equals(di3Var.f) && this.g.equals(di3Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + p91.d(p91.b(this.e, p91.d(p91.d(p91.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbT = p91.t("VendorProfile(manufacturer=", this.a, ", brand=", this.b, ", model=");
        sbT.append(this.c);
        sbT.append(", sdk=");
        sbT.append(this.e);
        sbT.append(", release=");
        sbT.append(this.f);
        sbT.append(", props=");
        sbT.append(this.g);
        sbT.append(")");
        return sbT.toString();
    }
}
