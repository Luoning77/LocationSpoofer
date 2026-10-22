package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class f51 extends j51 {
    public i51 t;
    public boolean u;

    @Override // defpackage.j51, defpackage.ya1
    public final int F(ck1 ck1Var, zq1 zq1Var, int i) {
        return this.t == i51.e ? zq1Var.u0(i) : zq1Var.w(i);
    }

    @Override // defpackage.j51, defpackage.ya1
    public final int W(ck1 ck1Var, zq1 zq1Var, int i) {
        return this.t == i51.e ? zq1Var.u0(i) : zq1Var.w(i);
    }

    @Override // defpackage.j51
    public final long m1(zq1 zq1Var, long j) {
        int iU0 = this.t == i51.e ? zq1Var.u0(l50.h(j)) : zq1Var.w(l50.h(j));
        if (iU0 < 0) {
            iU0 = 0;
        }
        if (iU0 < 0) {
            r21.a("height must be >= 0");
        }
        return m50.h(0, Integer.MAX_VALUE, iU0, iU0);
    }

    @Override // defpackage.j51
    public final boolean n1() {
        return this.u;
    }
}
