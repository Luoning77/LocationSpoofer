package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class qm3 implements n30, bf1 {
    public final db e;
    public final t30 f;
    public boolean g;
    public xe1 h;
    public p10 i = h20.a;

    public qm3(db dbVar, t30 t30Var) {
        this.e = dbVar;
        this.f = t30Var;
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        if (ve1Var == ve1.ON_DESTROY) {
            a();
        } else {
            if (ve1Var != ve1.ON_CREATE || this.g) {
                return;
            }
            b(this.i);
        }
    }

    public final void a() {
        if (!this.g) {
            this.g = true;
            this.e.getView().setTag(2131230953, null);
            xe1 xe1Var = this.h;
            if (xe1Var != null) {
                xe1Var.b(this);
            }
            this.h = null;
        }
        this.f.m();
    }

    public final void b(pu0 pu0Var) {
        this.e.setOnReadyForComposition(new ze(11, this, (p10) pu0Var));
    }
}
