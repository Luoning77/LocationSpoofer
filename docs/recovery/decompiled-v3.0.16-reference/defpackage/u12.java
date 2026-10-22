package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class u12 implements bf1, rv {
    public final xe1 e;
    public final o12 f;
    public v12 g;
    public final /* synthetic */ x12 h;

    public u12(x12 x12Var, xe1 xe1Var, o12 o12Var) {
        o12Var.getClass();
        this.h = x12Var;
        this.e = xe1Var;
        this.f = o12Var;
        xe1Var.a(this);
    }

    @Override // defpackage.bf1
    public final void U(df1 df1Var, ve1 ve1Var) {
        if (ve1Var != ve1.ON_START) {
            if (ve1Var != ve1.ON_STOP) {
                if (ve1Var == ve1.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                v12 v12Var = this.g;
                if (v12Var != null) {
                    v12Var.cancel();
                    return;
                }
                return;
            }
        }
        o12 o12Var = this.f;
        o12Var.getClass();
        x12 x12Var = this.h;
        x12Var.b.addLast(o12Var);
        v12 v12Var2 = new v12(x12Var, o12Var);
        o12Var.b.add(v12Var2);
        x12Var.e();
        o12Var.c = new w12(0, x12Var, x12.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.g = v12Var2;
    }

    @Override // defpackage.rv
    public final void cancel() {
        this.e.b(this);
        o12 o12Var = this.f;
        o12Var.getClass();
        o12Var.b.remove(this);
        v12 v12Var = this.g;
        if (v12Var != null) {
            v12Var.cancel();
        }
        this.g = null;
    }
}
