package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class av2 extends hv1 {
    public final wu2 a;

    public av2(wu2 wu2Var) {
        this.a = wu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof av2) && o51.f(this.a, ((av2) obj).a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        bv2 bv2Var = new bv2();
        bv2Var.s = this.a;
        return bv2Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        bv2 bv2Var = (bv2) cv1Var;
        wu2 wu2Var = bv2Var.s;
        wu2 wu2Var2 = this.a;
        if (!o51.f(wu2Var2, wu2Var)) {
            gh0.H(bv2Var, wu2Var2.h);
        }
        bv2Var.s = wu2Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.a + ')';
    }
}
