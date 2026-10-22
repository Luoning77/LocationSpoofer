package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class dk0 extends hv1 {
    public final mc3 a;
    public final hc3 b;
    public final hc3 c;
    public final hc3 d;
    public final pk0 e;
    public final lm0 f;
    public final au0 g;
    public final ek0 h;

    public dk0(mc3 mc3Var, hc3 hc3Var, hc3 hc3Var2, hc3 hc3Var3, pk0 pk0Var, lm0 lm0Var, au0 au0Var, ek0 ek0Var) {
        this.a = mc3Var;
        this.b = hc3Var;
        this.c = hc3Var2;
        this.d = hc3Var3;
        this.e = pk0Var;
        this.f = lm0Var;
        this.g = au0Var;
        this.h = ek0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dk0)) {
            return false;
        }
        dk0 dk0Var = (dk0) obj;
        return dk0Var.a == this.a && o51.f(dk0Var.b, this.b) && o51.f(dk0Var.c, this.c) && o51.f(dk0Var.d, this.d) && dk0Var.e.equals(this.e) && o51.f(dk0Var.f, this.f) && dk0Var.g == this.g && o51.f(dk0Var.h, this.h);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new ok0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ok0 ok0Var = (ok0) cv1Var;
        ok0Var.t = this.a;
        ok0Var.u = this.b;
        ok0Var.v = this.c;
        ok0Var.w = this.d;
        ok0Var.x = this.e;
        ok0Var.y = this.f;
        ok0Var.z = this.g;
        ok0Var.A = this.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hc3 hc3Var = this.b;
        int iHashCode2 = (iHashCode + (hc3Var != null ? hc3Var.hashCode() : 0)) * 31;
        hc3 hc3Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (hc3Var2 != null ? hc3Var2.hashCode() : 0)) * 31;
        hc3 hc3Var3 = this.d;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.a.hashCode() + ((this.e.a.hashCode() + ((iHashCode3 + (hc3Var3 != null ? hc3Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
