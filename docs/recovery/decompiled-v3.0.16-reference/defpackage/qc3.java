package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qc3 extends dy1 {
    public final dy1 o;
    public final boolean p;
    public final boolean q;
    public lu0 r;
    public lu0 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public qc3(dy1 dy1Var, lu0 lu0Var, lu0 lu0Var2, boolean z, boolean z2) {
        lu0 lu0VarI;
        lu0 lu0VarE;
        ym2 ym2Var = tx2.a;
        super(0L, rx2.i, tx2.i(lu0Var, (dy1Var == null || (lu0VarE = dy1Var.e()) == null) ? tx2.j.e : lu0VarE, z), tx2.j(lu0Var2, (dy1Var == null || (lu0VarI = dy1Var.i()) == null) ? tx2.j.f : lu0VarI));
        this.o = dy1Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = a83.b();
    }

    @Override // defpackage.dy1
    public final void B(ay1 ay1Var) {
        ym3.O();
        throw null;
    }

    @Override // defpackage.dy1
    public final dy1 C(lu0 lu0Var, lu0 lu0Var2) {
        lu0 lu0VarI = tx2.i(lu0Var, this.r, true);
        lu0 lu0VarJ = tx2.j(lu0Var2, this.s);
        return !this.p ? new qc3(D().C(null, lu0VarJ), lu0VarI, lu0VarJ, false, true) : D().C(lu0VarI, lu0VarJ);
    }

    public final dy1 D() {
        dy1 dy1Var = this.o;
        return dy1Var == null ? tx2.j : dy1Var;
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final void c() {
        dy1 dy1Var;
        this.c = true;
        if (!this.q || (dy1Var = this.o) == null) {
            return;
        }
        dy1Var.c();
    }

    @Override // defpackage.nx2
    public final rx2 d() {
        return D().d();
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final lu0 e() {
        return this.r;
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.nx2
    public final long g() {
        return D().g();
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final int h() {
        return D().h();
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final lu0 i() {
        return this.s;
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final void k() {
        ym3.O();
        throw null;
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final void l() {
        ym3.O();
        throw null;
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final void m() {
        D().m();
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final void n(x03 x03Var) {
        D().n(x03Var);
    }

    @Override // defpackage.nx2
    public final void r(rx2 rx2Var) {
        ym3.O();
        throw null;
    }

    @Override // defpackage.nx2
    public final void s(long j) {
        ym3.O();
        throw null;
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final nx2 u(lu0 lu0Var) {
        lu0 lu0VarI = tx2.i(lu0Var, this.r, true);
        return !this.p ? tx2.e(D().u(null), lu0VarI, true) : D().u(lu0VarI);
    }

    @Override // defpackage.dy1
    public final hd0 w() {
        return D().w();
    }

    @Override // defpackage.dy1
    public final ay1 x() {
        return D().x();
    }

    @Override // defpackage.dy1
    /* JADX INFO: renamed from: y */
    public final lu0 e() {
        return this.r;
    }
}
