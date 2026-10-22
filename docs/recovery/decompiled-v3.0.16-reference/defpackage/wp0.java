package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class wp0 extends hv1 {
    public final vp0 a;

    public wp0(vp0 vp0Var) {
        this.a = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp0) && o51.f(this.a, ((wp0) obj).a);
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        yp0 yp0Var = new yp0();
        yp0Var.s = this.a;
        return yp0Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        yp0 yp0Var = (yp0) cv1Var;
        yp0Var.s.a.j(yp0Var);
        vp0 vp0Var = this.a;
        yp0Var.s = vp0Var;
        vp0Var.a.b(yp0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
