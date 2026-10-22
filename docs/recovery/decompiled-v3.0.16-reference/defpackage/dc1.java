package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class dc1 extends hv1 {
    public final hd1 a;
    public final dt b;
    public final x32 c;

    public dc1(hd1 hd1Var, dt dtVar, x32 x32Var) {
        this.a = hd1Var;
        this.b = dtVar;
        this.c = x32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc1)) {
            return false;
        }
        dc1 dc1Var = (dc1) obj;
        return o51.f(this.a, dc1Var.a) && o51.f(this.b, dc1Var.b) && this.c == dc1Var.c;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        gc1 gc1Var = new gc1();
        gc1Var.s = this.a;
        gc1Var.t = this.b;
        gc1Var.u = this.c;
        return gc1Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        gc1 gc1Var = (gc1) cv1Var;
        gc1Var.s = this.a;
        gc1Var.t = this.b;
        gc1Var.u = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + p91.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
