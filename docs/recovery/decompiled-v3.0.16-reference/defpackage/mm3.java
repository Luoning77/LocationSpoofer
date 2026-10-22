package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class mm3 extends hv1 {
    public final vc0 a;
    public final pu0 b;
    public final Object c;

    public mm3(vc0 vc0Var, pu0 pu0Var, Object obj) {
        this.a = vc0Var;
        this.b = pu0Var;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mm3.class != obj.getClass()) {
            return false;
        }
        mm3 mm3Var = (mm3) obj;
        return this.a == mm3Var.a && this.c.equals(mm3Var.c);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        om3 om3Var = new om3();
        om3Var.s = this.a;
        om3Var.t = this.b;
        return om3Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        om3 om3Var = (om3) cv1Var;
        om3Var.s = this.a;
        om3Var.t = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + p91.e(this.a.hashCode() * 31, 31, false);
    }
}
