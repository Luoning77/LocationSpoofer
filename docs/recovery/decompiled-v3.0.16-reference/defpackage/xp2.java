package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class xp2 {
    public final wp2 a;
    public final wp2 b;
    public final boolean c;

    public xp2(wp2 wp2Var, wp2 wp2Var2, boolean z) {
        this.a = wp2Var;
        this.b = wp2Var2;
        this.c = z;
    }

    public static xp2 a(xp2 xp2Var, wp2 wp2Var, wp2 wp2Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            wp2Var = xp2Var.a;
        }
        if ((i & 2) != 0) {
            wp2Var2 = xp2Var.b;
        }
        if ((i & 4) != 0) {
            z = xp2Var.c;
        }
        xp2Var.getClass();
        return new xp2(wp2Var, wp2Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp2)) {
            return false;
        }
        xp2 xp2Var = (xp2) obj;
        return o51.f(this.a, xp2Var.a) && o51.f(this.b, xp2Var.b) && this.c == xp2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
