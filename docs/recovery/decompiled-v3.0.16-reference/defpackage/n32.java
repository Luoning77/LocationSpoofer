package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class n32 extends s32 {
    public static final n32 c = new n32(1, 0, 2);

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) {
        int iB = jv0Var.b(0);
        int i = kx2Var.v;
        int iM = kx2Var.M(kx2Var.b, kx2Var.q(i));
        int iF = kx2Var.f(kx2Var.b, kx2Var.q(i + 1));
        for (int iMax = Math.max(iM, iF - iB); iMax < iF; iMax++) {
            Object obj = kx2Var.c[kx2Var.g(iMax)];
            if (obj instanceof sv0) {
                ljVar.f((sv0) obj);
            } else if (obj instanceof ee2) {
                ((ee2) obj).c();
            }
        }
        if (iB <= 0) {
            j30.a("Check failed");
        }
        int i2 = kx2Var.v;
        int iM2 = kx2Var.M(kx2Var.b, kx2Var.q(i2));
        int iF2 = kx2Var.f(kx2Var.b, kx2Var.q(i2 + 1)) - iB;
        if (iF2 < iM2) {
            j30.a("Check failed");
        }
        kx2Var.I(iF2, iB, i2);
        int i3 = kx2Var.i;
        if (i3 >= iM2) {
            kx2Var.i = i3 - iB;
        }
    }
}
