package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class lw2 {
    public final lu0 a;
    public final od3 b;

    public lw2(lu0 lu0Var, od3 od3Var) {
        this.a = lu0Var;
        this.b = od3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw2)) {
            return false;
        }
        lw2 lw2Var = (lw2) obj;
        return this.a.equals(lw2Var.a) && this.b.equals(lw2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
