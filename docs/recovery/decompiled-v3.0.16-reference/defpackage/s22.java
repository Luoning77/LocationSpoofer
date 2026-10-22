package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class s22 extends s32 {
    public static final s22 c = new s22(0, 2, 1);

    @Override // defpackage.s32
    public final void a(jv0 jv0Var, un unVar, kx2 kx2Var, lj ljVar, t32 t32Var) {
        int i;
        m41 m41Var = (m41) jv0Var.c(0);
        int iC = kx2Var.c((iv0) jv0Var.c(1));
        if (kx2Var.t >= iC) {
            j30.a("Check failed");
        }
        mc0.D(kx2Var, unVar, iC);
        int i2 = kx2Var.t;
        int iD = kx2Var.v;
        while (iD >= 0 && !kx2Var.x(iD)) {
            iD = kx2Var.D(kx2Var.b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i2) {
            if (kx2Var.u(i2, iT)) {
                if (kx2Var.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += kx2Var.x(iT) ? 1 : kx2Var.b[(kx2Var.q(iT) * 5) + 1] & 67108863;
                iT += kx2Var.t(iT);
            }
        }
        while (true) {
            i = kx2Var.t;
            if (i >= iC) {
                break;
            }
            if (kx2Var.u(iC, i)) {
                int i3 = kx2Var.t;
                if (i3 < kx2Var.u && (kx2Var.b[(kx2Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    unVar.d(kx2Var.C(kx2Var.t));
                    iK = 0;
                }
                kx2Var.O();
            } else {
                iK += kx2Var.K();
            }
        }
        if (i != iC) {
            j30.a("Check failed");
        }
        m41Var.a = iK;
    }
}
