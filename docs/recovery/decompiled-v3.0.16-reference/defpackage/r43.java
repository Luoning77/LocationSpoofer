package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r43 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public r43(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = l13.c0(upperCase, "INT", false) ? 3 : (l13.c0(upperCase, "CHAR", false) || l13.c0(upperCase, "CLOB", false) || l13.c0(upperCase, "TEXT", false)) ? 2 : l13.c0(upperCase, "BLOB", false) ? 5 : (l13.c0(upperCase, "REAL", false) || l13.c0(upperCase, "FLOA", false) || l13.c0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r43) {
                boolean z = this.d > 0;
                r43 r43Var = (r43) obj;
                int i = r43Var.f;
                if (z == (r43Var.d > 0) && o51.f(this.a, r43Var.a) && this.c == r43Var.c) {
                    String str = r43Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || ce0.n(str2, str)) && ((i2 != 2 || i != 1 || str == null || ce0.n(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : ce0.n(str2, str))) && this.g == r43Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return m13.N(m13.P(sb.toString()));
    }
}
