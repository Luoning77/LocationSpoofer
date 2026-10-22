package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class ku2 extends hv1 {
    public final pu2 a;

    public ku2(pu2 pu2Var) {
        this.a = pu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku2) && this.a == ((ku2) obj).a;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new ju2(this.a);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ju2 ju2Var = (ju2) cv1Var;
        pu2 pu2Var = ju2Var.u;
        pu2 pu2Var2 = this.a;
        if (pu2Var2 != pu2Var) {
            pu2Var.e.setValue(Boolean.FALSE);
            ju2Var.u = pu2Var2;
            pu2Var2.e.setValue(Boolean.valueOf(ju2Var.r));
            if (ju2Var.r) {
                ju2Var.p1();
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.a + ')';
    }
}
