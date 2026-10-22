package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class cd0 implements mf2 {
    public final lu0 e;
    public dd0 f;

    public cd0(lu0 lu0Var) {
        this.e = lu0Var;
    }

    @Override // defpackage.mf2
    public final void a() {
        this.f = (dd0) this.e.invoke(oi0.a);
    }

    @Override // defpackage.mf2
    public final void c() {
        dd0 dd0Var = this.f;
        if (dd0Var != null) {
            dd0Var.dispose();
        }
        this.f = null;
    }

    @Override // defpackage.mf2
    public final void b() {
    }
}
