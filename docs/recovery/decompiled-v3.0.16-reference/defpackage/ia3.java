package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class ia3 extends hv1 {
    public final ix1 a;
    public final boolean b;
    public final yz2 c;

    public ia3(ix1 ix1Var, boolean z, yz2 yz2Var) {
        this.a = ix1Var;
        this.b = z;
        this.c = yz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia3)) {
            return false;
        }
        ia3 ia3Var = (ia3) obj;
        return o51.f(this.a, ia3Var.a) && this.b == ia3Var.b && this.c.equals(ia3Var.c);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        ka3 ka3Var = new ka3();
        ka3Var.s = this.a;
        ka3Var.t = this.b;
        ka3Var.u = this.c;
        ka3Var.y = Float.NaN;
        ka3Var.z = Float.NaN;
        return ka3Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ka3 ka3Var = (ka3) cv1Var;
        ka3Var.s = this.a;
        boolean z = ka3Var.t;
        boolean z2 = this.b;
        if (z != z2) {
            ld0.z(ka3Var);
        }
        ka3Var.t = z2;
        ka3Var.u = this.c;
        if (ka3Var.x == null && !Float.isNaN(ka3Var.z)) {
            ka3Var.x = k22.a(ka3Var.z, 0.01f);
        }
        if (ka3Var.w != null || Float.isNaN(ka3Var.y)) {
            return;
        }
        ka3Var.w = k22.a(ka3Var.y, 0.01f);
    }

    public final int hashCode() {
        return this.c.hashCode() + p91.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
