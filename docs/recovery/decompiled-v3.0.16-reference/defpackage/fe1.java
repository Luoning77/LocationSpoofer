package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
final class fe1 extends hv1 {
    public final ie1 a;
    public final me1 b;
    public final x73 c;

    public fe1(ie1 ie1Var, me1 me1Var, x73 x73Var) {
        this.a = ie1Var;
        this.b = me1Var;
        this.c = x73Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fe1) {
            fe1 fe1Var = (fe1) obj;
            return o51.f(this.a, fe1Var.a) && this.b == fe1Var.b && this.c == fe1Var.c;
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        return new ge1(this.a, this.b, this.c);
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        ge1 ge1Var = (ge1) cv1Var;
        if (ge1Var.r) {
            ((zd) ge1Var.s).f();
            ge1Var.s.i(ge1Var);
        }
        ie1 ie1Var = this.a;
        ge1Var.s = ie1Var;
        if (ge1Var.r) {
            if (ie1Var.a != null) {
                s21.c("Expected textInputModifierNode to be null");
            }
            ie1Var.a = ge1Var;
        }
        ge1Var.t = this.b;
        ge1Var.u = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
