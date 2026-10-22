package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class uc3 extends hv1 {
    public final wc1 a;

    public uc3(wc1 wc1Var) {
        this.a = wc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc3) && o51.f(this.a, ((uc3) obj).a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        vc3 vc3Var = new vc3();
        vc3Var.s = this.a;
        return vc3Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ((vc3) cv1Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
