package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wb1 extends hv1 {
    public final float a;
    public final boolean b;

    public wb1(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        wb1 wb1Var = obj instanceof wb1 ? (wb1) obj : null;
        return wb1Var != null && this.a == wb1Var.a && this.b == wb1Var.b;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        xb1 xb1Var = new xb1();
        xb1Var.s = this.a;
        xb1Var.t = this.b;
        return xb1Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        xb1 xb1Var = (xb1) cv1Var;
        xb1Var.s = this.a;
        xb1Var.t = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
