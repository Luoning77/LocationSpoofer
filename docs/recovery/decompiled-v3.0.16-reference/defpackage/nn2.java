package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class nn2 implements iw0 {
    public sx1 a;
    public iw0 b;

    @Override // defpackage.iw0
    public final void a(kw0 kw0Var) {
        iw0 iw0Var = this.b;
        if (iw0Var != null) {
            iw0Var.a(kw0Var);
        }
    }

    @Override // defpackage.iw0
    public final kw0 b() {
        iw0 iw0Var = this.b;
        if (iw0Var == null) {
            p21.c("GraphicsContext not provided");
        }
        kw0 kw0VarB = iw0Var.b();
        sx1 sx1Var = this.a;
        if (sx1Var != null) {
            sx1Var.a(kw0VarB);
            return kw0VarB;
        }
        Object[] objArr = s02.a;
        sx1 sx1Var2 = new sx1(1);
        sx1Var2.a(kw0VarB);
        this.a = sx1Var2;
        return kw0VarB;
    }

    public final void c() {
        sx1 sx1Var = this.a;
        if (sx1Var != null) {
            Object[] objArr = sx1Var.a;
            int i = sx1Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                a((kw0) objArr[i2]);
            }
            sx1Var.d();
        }
    }
}
