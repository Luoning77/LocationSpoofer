package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n22 extends s32 {
    public static final n22 c = new n22(0, 2, 1);

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) {
        iv0 iv0Var = (iv0) jv0Var.c(0);
        Object objC = jv0Var.c(1);
        if (objC instanceof sv0) {
            sv0 sv0Var = (sv0) objC;
            ((gy1) ljVar.f).b(sv0Var);
            ((ay1) ljVar.e).a(sv0Var);
        }
        if (kx2Var.n != 0) {
            j30.a("Can only append a slot if not current inserting");
        }
        int i = kx2Var.i;
        int i2 = kx2Var.j;
        int iC = kx2Var.c(iv0Var);
        int iF = kx2Var.f(kx2Var.b, kx2Var.q(iC + 1));
        kx2Var.i = iF;
        kx2Var.j = iF;
        kx2Var.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        kx2Var.c[iF] = objC;
        kx2Var.i = i;
        kx2Var.j = i2;
    }
}
