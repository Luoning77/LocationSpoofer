package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class q70 extends hv1 {
    public final bc3 a;
    public final f83 b;
    public final me1 c;
    public final boolean d;
    public final boolean e;
    public final e12 f;
    public final x73 g;
    public final c11 h;
    public final vp0 i;

    public q70(bc3 bc3Var, f83 f83Var, me1 me1Var, boolean z, boolean z2, e12 e12Var, x73 x73Var, c11 c11Var, vp0 vp0Var) {
        this.a = bc3Var;
        this.b = f83Var;
        this.c = me1Var;
        this.d = z;
        this.e = z2;
        this.f = e12Var;
        this.g = x73Var;
        this.h = c11Var;
        this.i = vp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q70) {
            q70 q70Var = (q70) obj;
            if (this.a.equals(q70Var.a) && this.b.equals(q70Var.b) && this.c == q70Var.c && this.d == q70Var.d && this.e == q70Var.e && this.f.equals(q70Var.f) && this.g == q70Var.g && o51.f(this.h, q70Var.h) && o51.f(this.i, q70Var.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hv1
    public final cv1 f() {
        t70 t70Var = new t70();
        t70Var.u = this.a;
        t70Var.v = this.b;
        t70Var.w = this.c;
        t70Var.x = this.d;
        t70Var.y = this.e;
        t70Var.z = this.f;
        x73 x73Var = this.g;
        t70Var.A = x73Var;
        t70Var.B = this.h;
        t70Var.C = this.i;
        x73Var.g = new r70(t70Var, 4);
        return t70Var;
    }

    @Override // defpackage.hv1
    public final void g(cv1 cv1Var) {
        t70 t70Var = (t70) cv1Var;
        boolean z = t70Var.x;
        boolean z2 = t70Var.y;
        c11 c11Var = t70Var.B;
        x73 x73Var = t70Var.A;
        t70Var.u = this.a;
        f83 f83Var = this.b;
        t70Var.v = f83Var;
        t70Var.w = this.c;
        boolean z3 = this.d;
        t70Var.x = z3;
        t70Var.z = this.f;
        x73 x73Var2 = this.g;
        t70Var.A = x73Var2;
        c11 c11Var2 = this.h;
        t70Var.B = c11Var2;
        t70Var.C = this.i;
        if (z3 != z || z3 != z || !o51.f(c11Var2, c11Var) || this.e != z2 || !f93.c(f83Var.b)) {
            ee0.C(t70Var);
        }
        if (x73Var2 != x73Var) {
            x73Var2.g = new r70(t70Var, 0);
        }
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + p91.e(p91.e(p91.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.d), 31, this.e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.d + ", isPassword=" + this.e + ", offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ')';
    }
}
