package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class wu extends cv1 implements z02, fu, hg0 {
    public final xu s;
    public boolean t;
    public nn2 u;
    public lu0 v;

    public wu(xu xuVar, lu0 lu0Var) {
        this.s = xuVar;
        this.v = lu0Var;
        xuVar.e = this;
        xuVar.g = new ye(this, 5);
    }

    @Override // defpackage.hg0
    public final void S0() {
        m1();
    }

    @Override // defpackage.kb0
    public final void W0() {
        m1();
    }

    @Override // defpackage.fu
    public final long a() {
        return mc0.J(xp1.L(this, 4).g);
    }

    @Override // defpackage.kb0
    public final void c() {
        m1();
    }

    @Override // defpackage.z02
    public final void f0() {
        m1();
    }

    @Override // defpackage.cv1
    public final void f1() {
        nn2 nn2Var = this.u;
        if (nn2Var != null) {
            nn2Var.c();
        }
    }

    @Override // defpackage.fu
    public final xb0 g() {
        return xp1.O(this).D;
    }

    @Override // defpackage.cv1
    public final void g1() {
        m1();
    }

    @Override // defpackage.fu
    public final qa1 getLayoutDirection() {
        return xp1.O(this).E;
    }

    @Override // defpackage.hg0
    public final void j0(jb1 jb1Var) {
        boolean z = this.t;
        xu xuVar = this.s;
        if (!z) {
            xuVar.f = null;
            gh0.H(this, new ta(3, this, xuVar));
            if (xuVar.f == null) {
                throw az2.e("DrawResult not defined, did you forget to call onDraw?");
            }
            this.t = true;
        }
        t1 t1Var = xuVar.f;
        t1Var.getClass();
        ((lu0) t1Var.f).invoke(jb1Var);
    }

    public final void m1() {
        nn2 nn2Var = this.u;
        if (nn2Var != null) {
            nn2Var.c();
        }
        this.t = false;
        this.s.f = null;
        ig0.z(this);
    }
}
