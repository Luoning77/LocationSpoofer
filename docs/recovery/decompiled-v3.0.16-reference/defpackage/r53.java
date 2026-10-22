package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class r53 {
    public final dj a;
    public dj b;
    public boolean c = false;
    public uw1 d = null;

    public r53(dj djVar, dj djVar2) {
        this.a = djVar;
        this.b = djVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r53)) {
            return false;
        }
        r53 r53Var = (r53) obj;
        return o51.f(this.a, r53Var.a) && o51.f(this.b, r53Var.b) && this.c == r53Var.c && o51.f(this.d, r53Var.d);
    }

    public final int hashCode() {
        int iE = p91.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        uw1 uw1Var = this.d;
        return iE + (uw1Var == null ? 0 : uw1Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
