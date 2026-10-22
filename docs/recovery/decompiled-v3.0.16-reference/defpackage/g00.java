package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class g00 implements dv1 {
    public final dv1 a;
    public final dv1 b;

    public g00(dv1 dv1Var, dv1 dv1Var2) {
        this.a = dv1Var;
        this.b = dv1Var2;
    }

    @Override // defpackage.dv1
    public final Object a(Object obj, pu0 pu0Var) {
        return this.b.a(this.a.a(obj, pu0Var), pu0Var);
    }

    @Override // defpackage.dv1
    public final boolean b(lu0 lu0Var) {
        return this.a.b(lu0Var) && this.b.b(lu0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g00)) {
            return false;
        }
        g00 g00Var = (g00) obj;
        return this.a.equals(g00Var.a) && o51.f(this.b, g00Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return p91.q(new StringBuilder("["), (String) a("", gh.p), ']');
    }
}
