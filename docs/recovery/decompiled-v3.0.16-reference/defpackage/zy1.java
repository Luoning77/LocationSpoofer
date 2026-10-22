package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class zy1 extends nx2 {
    public final lu0 e;
    public final nx2 f;

    public zy1(long j, rx2 rx2Var, lu0 lu0Var, nx2 nx2Var) {
        super(j, rx2Var);
        this.e = lu0Var;
        this.f = nx2Var;
        nx2Var.k();
    }

    @Override // defpackage.nx2
    public final void c() {
        nx2 nx2Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != nx2Var.g()) {
            a();
        }
        nx2Var.l();
        this.c = true;
        synchronized (tx2.c) {
            o();
        }
    }

    @Override // defpackage.nx2
    public final lu0 e() {
        return this.e;
    }

    @Override // defpackage.nx2
    public final boolean f() {
        return true;
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
    public final void n(x03 x03Var) {
        ym2 ym2Var = tx2.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.nx2
    public final nx2 u(lu0 lu0Var) {
        return new zy1(this.b, this.a, tx2.i(lu0Var, this.e, true), this.f);
    }

    @Override // defpackage.nx2
    public final void m() {
    }
}
