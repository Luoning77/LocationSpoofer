package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u43 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public u43(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u43)) {
            return false;
        }
        u43 u43Var = (u43) obj;
        if (!this.a.equals(u43Var.a) || !this.b.equals(u43Var.b) || !this.c.equals(u43Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = u43Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(ce0.u(zy.C0(this.b.values(), new gq0(18))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(ce0.u(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(ce0.u(set != null ? zy.C0(set, new gq0(19)) : uj0.e));
        sb.append("\n            |}\n        ");
        return m13.P(sb.toString());
    }
}
