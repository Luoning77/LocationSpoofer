package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s43 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public s43(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s43)) {
            return false;
        }
        s43 s43Var = (s43) obj;
        if (o51.f(this.a, s43Var.a) && o51.f(this.b, s43Var.b) && o51.f(this.c, s43Var.c) && this.d.equals(s43Var.d)) {
            return this.e.equals(s43Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + p91.g(this.d, p91.d(p91.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return m13.N(m13.P("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + ce0.I(zy.B0(this.d)) + "\n            |   referenceColumnNames = {" + ce0.H(zy.B0(this.e)) + "\n            |}\n        "));
    }
}
