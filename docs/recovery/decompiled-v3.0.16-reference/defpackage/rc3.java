package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rc3 extends nx2 {
    public final nx2 e;
    public final boolean f;
    public final boolean g;
    public lu0 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc3(nx2 nx2Var, lu0 lu0Var, boolean z, boolean z2) {
        lu0 lu0VarE;
        super(0L, rx2.i);
        ym2 ym2Var = tx2.a;
        this.e = nx2Var;
        this.f = z;
        this.g = z2;
        this.h = tx2.i(lu0Var, (nx2Var == null || (lu0VarE = nx2Var.e()) == null) ? tx2.j.e : lu0VarE, z);
        this.i = a83.b();
    }

    @Override // defpackage.nx2
    public final void c() {
        nx2 nx2Var;
        this.c = true;
        if (!this.g || (nx2Var = this.e) == null) {
            return;
        }
        nx2Var.c();
    }

    @Override // defpackage.nx2
    public final rx2 d() {
        return v().d();
    }

    @Override // defpackage.nx2
    public final lu0 e() {
        return this.h;
    }

    @Override // defpackage.nx2
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.nx2
    public final long g() {
        return v().g();
    }

    @Override // defpackage.nx2
    public final lu0 i() {
        return null;
    }

    @Override // defpackage.nx2
    public final void k() {
        ym3.O();
        throw null;
    }

    @Override // defpackage.nx2
    public final void l() {
        ym3.O();
        throw null;
    }

    @Override // defpackage.nx2
    public final void m() {
        v().m();
    }

    @Override // defpackage.nx2
    public final void n(x03 x03Var) {
        v().n(x03Var);
    }

    @Override // defpackage.nx2
    public final nx2 u(lu0 lu0Var) {
        lu0 lu0VarI = tx2.i(lu0Var, this.h, true);
        return !this.f ? tx2.e(v().u(null), lu0VarI, true) : v().u(lu0VarI);
    }

    public final nx2 v() {
        nx2 nx2Var = this.e;
        return nx2Var == null ? tx2.j : nx2Var;
    }
}
