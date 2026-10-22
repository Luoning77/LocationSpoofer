package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public interface ya1 extends kb0 {
    default int F(ck1 ck1Var, zq1 zq1Var, int i) {
        return s(new v51(ck1Var, ck1Var.getLayoutDirection()), new oa0(zq1Var, zz1.f, a02.f, 2), m50.b(0, i, 0, 0, 13)).b();
    }

    default int W(ck1 ck1Var, zq1 zq1Var, int i) {
        return s(new v51(ck1Var, ck1Var.getLayoutDirection()), new oa0(zq1Var, zz1.e, a02.f, 2), m50.b(0, i, 0, 0, 13)).b();
    }

    default int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        return s(new v51(ck1Var, ck1Var.getLayoutDirection()), new oa0(zq1Var, zz1.e, a02.e, 2), m50.b(0, 0, 0, i, 7)).e();
    }

    fr1 s(gr1 gr1Var, zq1 zq1Var, long j);

    default int x(ck1 ck1Var, zq1 zq1Var, int i) {
        return s(new v51(ck1Var, ck1Var.getLayoutDirection()), new oa0(zq1Var, zz1.f, a02.e, 2), m50.b(0, 0, 0, i, 7)).e();
    }
}
