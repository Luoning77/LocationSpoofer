package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cw0 extends dy1 {
    @Override // defpackage.dy1
    public final dy1 C(lu0 lu0Var, lu0 lu0Var2) {
        return (dy1) ((nx2) tx2.b(new am0(6, new l3(12, lu0Var, lu0Var2))));
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final void c() {
        synchronized (tx2.c) {
            o();
        }
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
        tx2.c();
    }

    @Override // defpackage.dy1, defpackage.nx2
    public final nx2 u(lu0 lu0Var) {
        return (rd2) ((nx2) tx2.b(new am0(6, new bw0(0, lu0Var))));
    }

    @Override // defpackage.dy1
    public final hd0 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
