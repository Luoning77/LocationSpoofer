package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class eo2 extends lb0 implements u30, z02 {
    public o42 A;
    public po2 B;
    public kb0 C;
    public p42 D;
    public o42 E;
    public boolean F;
    public qo2 u;
    public x32 v;
    public boolean w;
    public ka0 x;
    public ix1 y;
    public boolean z;

    @Override // defpackage.kb0
    public final void W0() {
        boolean zQ1 = q1();
        if (this.F != zQ1) {
            this.F = zQ1;
            qo2 qo2Var = this.u;
            x32 x32Var = this.v;
            boolean z = this.z;
            r1(this.x, this.y, x32Var, z ? this.E : this.A, qo2Var, z, this.w);
        }
    }

    @Override // defpackage.cv1
    public final boolean b1() {
        return false;
    }

    @Override // defpackage.cv1
    public final void e1() {
        this.F = q1();
        p1();
        if (this.B == null) {
            qo2 qo2Var = this.u;
            po2 po2Var = new po2(this.x, this.y, this.v, this.z ? this.E : this.A, qo2Var, this.w, this.F);
            m1(po2Var);
            this.B = po2Var;
        }
    }

    @Override // defpackage.z02
    public final void f0() {
        p42 p42Var = (p42) xq1.C(this, r42.a);
        if (o51.f(p42Var, this.D)) {
            return;
        }
        this.D = p42Var;
        this.E = null;
        kb0 kb0Var = this.C;
        if (kb0Var != null) {
            n1(kb0Var);
        }
        this.C = null;
        p1();
        po2 po2Var = this.B;
        if (po2Var != null) {
            qo2 qo2Var = this.u;
            po2Var.H1(this.x, this.y, this.v, this.z ? this.E : this.A, qo2Var, this.w, this.F);
        }
    }

    @Override // defpackage.cv1
    public final void f1() {
        kb0 kb0Var = this.C;
        if (kb0Var != null) {
            n1(kb0Var);
        }
    }

    public final void p1() {
        kb0 kb0Var = this.C;
        if (kb0Var != null) {
            if (((cv1) kb0Var).e.r) {
                return;
            }
            m1(kb0Var);
            return;
        }
        if (this.z) {
            gh0.H(this, new ol2(this, 4));
        }
        o42 o42Var = this.z ? this.E : this.A;
        if (o42Var != null) {
            kb0 kb0VarA = o42Var.a();
            if (((cv1) kb0VarA).e.r) {
                return;
            }
            m1(kb0VarA);
            this.C = kb0VarA;
        }
    }

    public final boolean q1() {
        return (this.r ? xp1.O(this).E : qa1.e) != qa1.f || this.v == x32.e;
    }

    public final void r1(ka0 ka0Var, ix1 ix1Var, x32 x32Var, o42 o42Var, qo2 qo2Var, boolean z, boolean z2) {
        boolean z3;
        this.u = qo2Var;
        this.v = x32Var;
        boolean z4 = true;
        if (this.z != z) {
            this.z = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (o51.f(this.A, o42Var)) {
            z4 = false;
        } else {
            this.A = o42Var;
        }
        if (z3 || (z4 && !z)) {
            kb0 kb0Var = this.C;
            if (kb0Var != null) {
                n1(kb0Var);
            }
            this.C = null;
            p1();
        }
        this.w = z2;
        this.x = ka0Var;
        this.y = ix1Var;
        boolean zQ1 = q1();
        this.F = zQ1;
        po2 po2Var = this.B;
        if (po2Var != null) {
            po2Var.H1(ka0Var, ix1Var, x32Var, this.z ? this.E : this.A, qo2Var, z2, zQ1);
        }
    }
}
