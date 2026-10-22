package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class g52 extends hv1 {
    public final f52 a;
    public final l9 b;
    public final c30 c;
    public final float d;
    public final rr e;

    public g52(f52 f52Var, l9 l9Var, c30 c30Var, float f, rr rrVar) {
        this.a = f52Var;
        this.b = l9Var;
        this.c = c30Var;
        this.d = f;
        this.e = rrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g52)) {
            return false;
        }
        g52 g52Var = (g52) obj;
        return o51.f(this.a, g52Var.a) && o51.f(this.b, g52Var.b) && o51.f(this.c, g52Var.c) && Float.compare(this.d, g52Var.d) == 0 && o51.f(this.e, g52Var.e);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        h52 h52Var = new h52();
        h52Var.s = this.a;
        h52Var.t = true;
        h52Var.u = this.b;
        h52Var.v = this.c;
        h52Var.w = this.d;
        h52Var.x = this.e;
        return h52Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        h52 h52Var = (h52) cv1Var;
        boolean z = h52Var.t;
        f52 f52Var = this.a;
        boolean z2 = (z && cw2.a(h52Var.s.d(), f52Var.d())) ? false : true;
        h52Var.s = f52Var;
        h52Var.t = true;
        h52Var.u = this.b;
        h52Var.v = this.c;
        h52Var.w = this.d;
        h52Var.x = this.e;
        if (z2) {
            ld0.z(h52Var);
        }
        ig0.z(h52Var);
    }

    public final int hashCode() {
        int iC = az2.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + p91.e(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        rr rrVar = this.e;
        return iC + (rrVar == null ? 0 : rrVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
