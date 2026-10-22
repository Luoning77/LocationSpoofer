package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class c32 extends s32 {
    public static final c32 c = new c32(0, 3, 1);

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) {
        d31 d31Var;
        hx2 hx2Var = (hx2) jv0Var.c(1);
        iv0 iv0Var = (iv0) jv0Var.c(0);
        pn0 pn0Var = (pn0) jv0Var.c(2);
        kx2 kx2VarD = hx2Var.d();
        if (t32Var != null) {
            try {
                d31Var = new d31(29, t32Var, kx2Var);
            } catch (Throwable th) {
                kx2VarD.e(false);
                throw th;
            }
        } else {
            d31Var = null;
        }
        if (!pn0Var.g.U()) {
            j30.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        pn0Var.f.T(unVar, kx2VarD, ljVar, d31Var);
        kx2VarD.e(true);
        kx2Var.d();
        iv0Var.getClass();
        kx2Var.z(hx2Var, hx2Var.a(iv0Var));
        kx2Var.j();
    }
}
