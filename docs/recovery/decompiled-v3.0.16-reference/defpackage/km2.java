package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class km2 implements bf1, AutoCloseable {
    public final String e;
    public final jm2 f;
    public boolean g;

    public km2(String str, jm2 jm2Var) {
        this.e = str;
        this.f = jm2Var;
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        if (ve1Var == ve1.ON_DESTROY) {
            this.g = false;
            df1Var.getLifecycle().b(this);
        }
    }

    public final void c0(qm2 qm2Var, xe1 xe1Var) {
        qm2Var.getClass();
        xe1Var.getClass();
        if (this.g) {
            fo.n("Already attached to lifecycleOwner");
            return;
        }
        this.g = true;
        xe1Var.a(this);
        qm2Var.c(this.e, (v00) this.f.a.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
