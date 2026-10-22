package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class jw {
    public static final jw c = new jw(zy.N0(new ArrayList()), null);
    public final Set a;
    public final o51 b;

    public jw(Set set, o51 o51Var) {
        this.a = set;
        this.b = o51Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jw)) {
            return false;
        }
        jw jwVar = (jw) obj;
        return jwVar.a.equals(this.a) && o51.f(jwVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        o51 o51Var = this.b;
        return iHashCode + (o51Var != null ? o51Var.hashCode() : 0);
    }
}
