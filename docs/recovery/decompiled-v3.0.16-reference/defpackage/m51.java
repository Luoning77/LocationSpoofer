package defpackage;

/* JADX INFO: compiled from: r8-map-id-573e8adb0601e8a83800a19792bdd10a14b3a6a20605354c2a924486fcacfec9 */
/* JADX INFO: loaded from: /Users/luoning/Desktop/code/rea/extracted/classes.dex */
public final class m51 extends j51 {
    public i51 t;
    public boolean u;

    @Override // defpackage.j51
    public final long m1(zq1 zq1Var, long j) {
        int iJ0 = this.t == i51.e ? zq1Var.j0(l50.g(j)) : zq1Var.s0(l50.g(j));
        if (iJ0 < 0) {
            iJ0 = 0;
        }
        if (iJ0 < 0) {
            r21.a("width must be >= 0");
        }
        return m50.h(iJ0, iJ0, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.j51
    public final boolean n1() {
        return this.u;
    }

    @Override // defpackage.j51, defpackage.ya1
    public final int p0(ck1 ck1Var, zq1 zq1Var, int i) {
        return this.t == i51.e ? zq1Var.j0(i) : zq1Var.s0(i);
    }

    @Override // defpackage.j51, defpackage.ya1
    public final int x(ck1 ck1Var, zq1 zq1Var, int i) {
        return this.t == i51.e ? zq1Var.j0(i) : zq1Var.s0(i);
    }
}
