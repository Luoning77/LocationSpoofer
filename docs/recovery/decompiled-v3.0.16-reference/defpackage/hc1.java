package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class hc1 extends hv1 {
    public final kc1 a;

    public hc1(kc1 kc1Var) {
        this.a = kc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc1) && this.a == ((hc1) obj).a;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        ic1 ic1Var = new ic1();
        ic1Var.s = this.a;
        return ic1Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ic1 ic1Var = (ic1) cv1Var;
        kc1 kc1Var = ic1Var.s;
        kc1 kc1Var2 = this.a;
        if (o51.f(kc1Var, kc1Var2) || !ic1Var.e.r) {
            return;
        }
        kc1 kc1Var3 = ic1Var.s;
        kc1Var3.c();
        kc1Var3.b = null;
        ic1Var.s = kc1Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
    }
}
