package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class rd2 extends nx2 {
    public final lu0 e;
    public int f;

    public rd2(long j, rx2 rx2Var, lu0 lu0Var) {
        super(j, rx2Var);
        this.e = lu0Var;
        this.f = 1;
    }

    @Override // defpackage.nx2
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // defpackage.nx2
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.nx2
    public final void n(x03 x03Var) {
        ym2 ym2Var = tx2.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.nx2
    public final nx2 u(lu0 lu0Var) {
        tx2.v(this);
        return new zy1(this.b, this.a, tx2.i(lu0Var, this.e, true), this);
    }

    @Override // defpackage.nx2
    public final void m() {
    }
}
