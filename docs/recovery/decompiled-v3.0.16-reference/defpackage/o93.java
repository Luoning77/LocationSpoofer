package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class o93 {
    public final String a;
    public String b;
    public boolean c = false;
    public o52 d = null;

    public o93(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o93)) {
            return false;
        }
        o93 o93Var = (o93) obj;
        return o51.f(this.a, o93Var.a) && o51.f(this.b, o93Var.b) && this.c == o93Var.c && o51.f(this.d, o93Var.d);
    }

    public final int hashCode() {
        int iE = p91.e(p91.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        o52 o52Var = this.d;
        return iE + (o52Var == null ? 0 : o52Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
