package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class m63 extends hv1 {
    public final z92 a;
    public final lu0 b;
    public final lu0 c;
    public final lu0 d;

    public m63(z92 z92Var, lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3) {
        this.a = z92Var;
        this.b = lu0Var;
        this.c = lu0Var2;
        this.d = lu0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m63)) {
            return false;
        }
        m63 m63Var = (m63) obj;
        return this.a == m63Var.a && this.b == m63Var.b && this.c == m63Var.c && this.d == m63Var.d;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new o63(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        o63 o63Var = (o63) cv1Var;
        o63Var.u.f = null;
        z92 z92Var = this.a;
        o63Var.u = z92Var;
        z92Var.f = o63Var;
        z92Var.g = o63Var.r ? hb3.g : hb3.f;
        o63Var.v = this.b;
        o63Var.w = this.c;
        o63Var.x = this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        lu0 lu0Var = this.c;
        return this.d.hashCode() + ((iHashCode + (lu0Var != null ? lu0Var.hashCode() : 0)) * 31);
    }
}
