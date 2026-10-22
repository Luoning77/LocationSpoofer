package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m91 {
    public static final m91 d = new m91(null, null, null, 63);
    public final lu0 a;
    public final lu0 b;
    public final lu0 c;

    public m91(lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3, int i) {
        lu0Var = (i & 1) != 0 ? null : lu0Var;
        lu0Var2 = (i & 4) != 0 ? null : lu0Var2;
        lu0Var3 = (i & 16) != 0 ? null : lu0Var3;
        this.a = lu0Var;
        this.b = lu0Var2;
        this.c = lu0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m91)) {
            return false;
        }
        m91 m91Var = (m91) obj;
        return this.a == m91Var.a && this.b == m91Var.b && this.c == m91Var.c;
    }

    public final int hashCode() {
        lu0 lu0Var = this.a;
        int iHashCode = (lu0Var != null ? lu0Var.hashCode() : 0) * 961;
        lu0 lu0Var2 = this.b;
        int iHashCode2 = (iHashCode + (lu0Var2 != null ? lu0Var2.hashCode() : 0)) * 961;
        lu0 lu0Var3 = this.c;
        return (iHashCode2 + (lu0Var3 != null ? lu0Var3.hashCode() : 0)) * 31;
    }
}
