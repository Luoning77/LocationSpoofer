package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ik2 {
    public float a = 0.0f;
    public boolean b = true;
    public d80 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik2)) {
            return false;
        }
        ik2 ik2Var = (ik2) obj;
        return Float.compare(this.a, ik2Var.a) == 0 && this.b == ik2Var.b && o51.f(this.c, ik2Var.c);
    }

    public final int hashCode() {
        int iE = p91.e(Float.hashCode(this.a) * 31, 31, this.b);
        d80 d80Var = this.c;
        return (iE + (d80Var == null ? 0 : d80Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
