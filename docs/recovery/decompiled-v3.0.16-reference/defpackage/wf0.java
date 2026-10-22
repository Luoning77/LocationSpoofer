package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class wf0 extends hv1 {
    public final fq a;
    public final au0 b;
    public final lu0 c;
    public final lu0 d;
    public final lu0 e;
    public final pu0 f;
    public final lu0 g;
    public final boolean h;

    public wf0(fq fqVar, au0 au0Var, lu0 lu0Var, lu0 lu0Var2, lu0 lu0Var3, pu0 pu0Var, lu0 lu0Var4, boolean z) {
        fqVar.getClass();
        au0Var.getClass();
        lu0Var.getClass();
        this.a = fqVar;
        this.b = au0Var;
        this.c = lu0Var;
        this.d = lu0Var2;
        this.e = lu0Var3;
        this.f = pu0Var;
        this.g = lu0Var4;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf0)) {
            return false;
        }
        wf0 wf0Var = (wf0) obj;
        return o51.f(this.a, wf0Var.a) && o51.f(this.b, wf0Var.b) && o51.f(this.c, wf0Var.c) && o51.f(this.d, wf0Var.d) && o51.f(this.e, wf0Var.e) && this.f.equals(wf0Var.f) && o51.f(this.g, wf0Var.g) && this.h == wf0Var.h;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new cg0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        cg0 cg0Var = (cg0) cv1Var;
        cg0Var.getClass();
        boolean z = cg0Var.z;
        boolean z2 = this.h;
        boolean z3 = z != z2;
        fq fqVar = this.a;
        fqVar.getClass();
        cg0Var.s = fqVar;
        au0 au0Var = this.b;
        au0Var.getClass();
        eu2 eu2Var = cg0Var.A;
        eu2Var.getClass();
        eu2Var.c = au0Var;
        lu0 lu0Var = this.c;
        lu0Var.getClass();
        cg0Var.t = lu0Var;
        cg0Var.u = this.d;
        cg0Var.v = this.e;
        cg0Var.w = this.f;
        cg0Var.x = this.g;
        cg0Var.y = 3;
        cg0Var.z = z2;
        if (z3) {
            if (!z2) {
                cg0Var.p1();
            }
            ld0.z(cg0Var);
        }
        gh0.H(cg0Var, new hd(cg0Var, 13));
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        lu0 lu0Var = this.d;
        int iHashCode2 = (iHashCode + (lu0Var != null ? lu0Var.hashCode() : 0)) * 31;
        lu0 lu0Var2 = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (lu0Var2 != null ? lu0Var2.hashCode() : 0)) * 961)) * 31;
        lu0 lu0Var3 = this.g;
        return Boolean.hashCode(this.h) + p91.b(3, (iHashCode3 + (lu0Var3 != null ? lu0Var3.hashCode() : 0)) * 961, 31);
    }
}
